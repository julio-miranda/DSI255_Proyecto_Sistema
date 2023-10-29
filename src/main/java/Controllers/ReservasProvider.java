/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.*;
import Conexion.conexion;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Miranda
 */
public class ReservasProvider {

    CollectionReference reference;

    static Firestore db;

    public static ArrayList<String> list = new ArrayList<>();
    public static HashSet<String> Fechas_ocupadas = new HashSet<>();
    public static HashSet<String> listaReservasM = new HashSet<>();
    public static HashSet<String> listaReservasU = new HashSet<>();

    public static boolean guardarReservas(String coleccion, String documento, Map<String, Object> data) {
        db = FirestoreClient.getFirestore();
        CollectionReference bungalows = conexion.db.collection("reservas");
        ApiFuture<QuerySnapshot> querySnap = bungalows.get();

        try {
            for (DocumentSnapshot document : querySnap.get().getDocuments()) {
                list.add(document.getId());
                Collections.sort(list, (String s1, String s2) -> {
                    // Extraer los números de las cadenas y convertirlos a enteros para comparar
                    int num1 = obtenerNumero(s1);
                    int num2 = obtenerNumero(s2);

                    // Comparar los números
                    return Integer.compare(num1, num2);
                });
            }
            DocumentReference docRef = db.collection(coleccion).document(documento);
            ApiFuture<WriteResult> result = docRef.set(data);
            System.out.println("Guardado Correctamente");
            return true;
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }

    public static boolean actualizarReservas(String coleccion, String documento, Map<String, Object> data) {
        db = FirestoreClient.getFirestore();

        try {
            DocumentReference docRef = db.collection(coleccion).document(documento);
            ApiFuture<WriteResult> result = docRef.update(data);
            System.out.println("Actualizado Correctamente");
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }

    public static boolean eliminarReservas(String coleccion, String documento) {
        db = FirestoreClient.getFirestore();

        try {
            String elementoABuscar = documento;

            int indice = -1;

            // Buscar elemento en la lista 'list'
            for (String elemento : list) {
                if (elemento.equals(elementoABuscar)) {
                    indice = list.indexOf(elemento);
                    break;
                }
            }
            // Buscar elemento en la lista 'list'
            for (String elemento : UI.UI_menu_admin.fechasSeleccionadas) {
                if (Fechas_ocupadas.contains(elemento)) {
                    Fechas_ocupadas.remove(elemento);
                }
            }

            if (indice != -1) {
                list.remove(indice);
            }
            DocumentReference docRef = db.collection(coleccion).document(documento);
            ApiFuture<WriteResult> result = docRef.delete(Precondition.NONE);
            System.out.println("Eliminado Correctamente");
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }

    public static void cargarTabla(JTable table) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Codigo");
        model.addColumn("Cliente");
        model.addColumn("Disponibilidad");
        model.addColumn("Menu");
        model.addColumn("Utileria");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Final");
        model.addColumn("Bungalow");
        model.addColumn("Total");

        try {
            CollectionReference reservas = conexion.db.collection("reservas");
            ApiFuture<QuerySnapshot> querySnap = reservas.get();

            for (DocumentSnapshot document : querySnap.get().getDocuments()) {
                list.add(document.getId());
                Collections.sort(list, (String s1, String s2) -> {
                    // Extraer los números de las cadenas y convertirlos a enteros para comparar
                    int num1 = obtenerNumero(s1);
                    int num2 = obtenerNumero(s2);

                    // Comparar los números
                    return Integer.compare(num1, num2);
                });
                model.addRow(obtenerFilaDeFechas(document));
            }
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Error: " + e.getMessage());
        }

        table.setModel(model);
        TableRowSorter<DefaultTableModel> soter = new TableRowSorter<>(model);
        table.setRowSorter(soter);
    }

    public static void cargarListaM(JList lista) {
        DefaultListModel model = new DefaultListModel();

        try {
            CollectionReference reservas = conexion.db.collection("reservas");
            ApiFuture<QuerySnapshot> querySnap = reservas.get();

            for (DocumentSnapshot document : querySnap.get().getDocuments()) {
                String newItem = document.getString("menu");
                String[] par = newItem.split(",");
                for (String elemento : par) {
                    listaReservasM.add(elemento.trim());
                }
            }
            listaReservasM.forEach(element -> {
                model.addElement(element);
            });
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Error: " + e.getMessage());
        }
        lista.setModel(model);
    }

    public static void cargarListaU(JList lista) {
        DefaultListModel model = new DefaultListModel();

        try {
            CollectionReference reservas = conexion.db.collection("reservas");
            ApiFuture<QuerySnapshot> querySnap = reservas.get();

            for (DocumentSnapshot document : querySnap.get().getDocuments()) {
                String newItem = document.getString("utileria");
                String[] par = newItem.split(",");
                for (String elemento : par) {
                    listaReservasU.add(elemento.trim());
                }
            }
            listaReservasU.forEach(element -> {
                model.addElement(element);
            });
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Error: " + e.getMessage());
        }
        lista.setModel(model);
    }

// Método para obtener una fila sin conversión de fechas
    private static Object[] obtenerFilaDeFechas(DocumentSnapshot document) {
        SimpleDateFormat sdfOriginal = new SimpleDateFormat("dd/MM/yyyy");
        String codigo = obtenerCodigoBungalow(document.getString("Bungalow"));
        try {
            agregarFechasOcupadas(sdfOriginal.parse(document.getString("fechainicio")), sdfOriginal.parse(document.getString("fechafinal")), codigo);
        } catch (ParseException ex) {
            Logger.getLogger(ReservasProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new Object[]{
            document.getId(),
            document.getString("nombre_Cliente"),
            document.getString("Disponibilidad"),
            document.getString("menu"),
            document.getString("utileria"),
            document.getString("fechainicio"),
            document.getString("fechafinal"),
            document.getString("Bungalow"),
            document.get("Total")
        };
    }

// Método para obtener el código de bungalow
    private static String obtenerCodigoBungalow(String bungalow) {
        String[] parts = bungalow.split(",");
        String string1 = parts[0];
        String[] parts1 = string1.split(":");
        return parts1[1].trim();
    }

// Método para agregar fechas ocupadas
    private static void agregarFechasOcupadas(Date startDate, Date endDate, String codigo) {
        SimpleDateFormat sdfOriginal = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);

        while (!calendar.getTime().after(endDate)) {
            Date currentDate = calendar.getTime();
            Fechas_ocupadas.add(sdfOriginal.format(currentDate) + " , " + codigo);
            calendar.add(Calendar.DATE, 1);
        }
    }
    // Método para obtener el número de una cadena

    public static int obtenerNumero(String cadena) {
        int numero = 0;
        String[] partes = cadena.split("-");
        if (partes.length > 1) {
            try {
                numero = Integer.parseInt(partes[1]);
            } catch (NumberFormatException e) {
                // Manejar el caso en el que no se pueda analizar un número
                e.printStackTrace();
            }
        }
        return numero;
    }
}

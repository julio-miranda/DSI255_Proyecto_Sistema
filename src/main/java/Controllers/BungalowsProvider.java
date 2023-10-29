/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.*;
import Conexion.conexion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Miranda
 */
public class BungalowsProvider {

    CollectionReference reference;

    static Firestore db;

    public static ArrayList<String> list = new ArrayList<>();

    public static boolean guardarBungalows(String coleccion, String documento, Map<String, Object> data) {
        db = FirestoreClient.getFirestore();
        CollectionReference bungalows = conexion.db.collection("bungalows");
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

    public static boolean actualizarBungalows(String coleccion, String documento, Map<String, Object> data) {
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

    public static boolean eliminarBungalows(String coleccion, String documento) {
        db = FirestoreClient.getFirestore();

        try {
            String elementoABuscar = documento;
            int indice = -1;

            for (String elemento : list) {
                if (elemento.equals(elementoABuscar)) {
                    indice = list.indexOf(elemento); // Guarda la posición
                    break;
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
        model.addColumn("Disponibilidad");
        model.addColumn("Precio");
        model.addColumn("Habitaciones");
        model.addColumn("Cantidad");

        try {
            CollectionReference personas = conexion.db.collection("bungalows");
            ApiFuture<QuerySnapshot> querySnap = personas.get();

            for (DocumentSnapshot document : querySnap.get().getDocuments()) {
                list.add(document.getId());
                Collections.sort(list, (String s1, String s2) -> {
                    // Extraer los números de las cadenas y convertirlos a enteros para comparar
                    int num1 = obtenerNumero(s1);
                    int num2 = obtenerNumero(s2);

                    // Comparar los números
                    return Integer.compare(num1, num2);
                });
                model.addRow(new Object[]{
                    document.getId(),
                    document.getString("Disponibilidad"),
                    document.getDouble("Precio"),
                    document.getDouble("Habitaciones"),
                    document.getDouble("Cantidad")
                });
            }
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Error: " + e.getMessage());
        }

        table.setModel(model);
        TableRowSorter<DefaultTableModel> soter = new TableRowSorter<>(model);
        table.setRowSorter(soter);
    }

    public static void cargarComboBox(JComboBox comboBox, HashSet<String> FechasIngresadas) {
        try {
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            HashSet<String> codigos = new HashSet<>();
            HashSet<String> codigoN = new HashSet<>();
            CollectionReference producto = conexion.db.collection("bungalows");
            ApiFuture<QuerySnapshot> querySnap = producto.get();
            if (!querySnap.get().getDocuments().isEmpty()) {
                if (!ReservasProvider.Fechas_ocupadas.isEmpty()) {
                    for (DocumentSnapshot document : querySnap.get().getDocuments()) {
                        codigos.add(document.getId());
                    }
                    // Obtener los números de cabaña ocupados y no ocupados según las fechas seleccionadas
                    List<String> cabañasOcupadas = obtenerCabañasOcupadas(FechasIngresadas, ReservasProvider.Fechas_ocupadas, codigos);

                    // Mostrar los números de cabaña ocupados y no ocupados (puedes implementar esta parte en tu aplicación)
                    for (String cabaña : cabañasOcupadas) {
                        codigoN.add(cabaña);
                    }

                    for (DocumentSnapshot document : querySnap.get().getDocuments()) {
                        if (!codigoN.contains(document.getId())) {
                            String Itembox = "Codigo: " + document.getId() + ", Precio: $" + document.getDouble("Precio");
                            model.addElement(Itembox);
                        }
                    }
                    comboBox.setModel(model);
                } else {
                    for (DocumentSnapshot document : querySnap.get().getDocuments()) {
                        String Itembox = "Codigo: " + document.getId() + ", Precio: $" + document.getDouble("Precio");
                        model.addElement(Itembox);
                    }
                    comboBox.setModel(model);
                }
            }
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

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

    // Función para obtener los números de cabaña ocupados según las fechas seleccionadas
    public static List<String> obtenerCabañasOcupadas(HashSet<String> fechasSeleccionadas, HashSet<String> fechasOcupadas, HashSet<String> todosLosNumerosCabaña) {
        List<String> cabañasOcupadas = new ArrayList<>();
        for (String fechaSeleccionada : fechasSeleccionadas) {
            for (String fechaOcupada : fechasOcupadas) {
                if (fechaOcupada.startsWith(fechaSeleccionada)) {
                    String numeroCabaña = fechaOcupada.split(", ")[1];
                    cabañasOcupadas.add(numeroCabaña);
                }
            }
        }
        return cabañasOcupadas;
    }
}

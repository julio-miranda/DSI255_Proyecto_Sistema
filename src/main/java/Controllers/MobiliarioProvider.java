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
import java.util.Map;
import java.util.concurrent.ExecutionException;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Miranda
 */
public class MobiliarioProvider {

    CollectionReference reference;

    static Firestore db;

    public static ArrayList<String> list = new ArrayList<>();
    public static HashSet<String> listaMobiliarios = new HashSet<>();

    public static boolean guardarMobiliario(String coleccion, String documento, Map<String, Object> data) {
        db = FirestoreClient.getFirestore();
        CollectionReference mobiliario = conexion.db.collection("mobiliario");
        ApiFuture<QuerySnapshot> querySnap = mobiliario.get();

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

    public static boolean actualizarMobiliario(String coleccion, String documento, Map<String, Object> data) {
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

    public static boolean eliminarMobiliario(String coleccion, String documento) {
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
        model.addColumn("Codigo Proveedores");
        model.addColumn("Nombre");
        model.addColumn("Descripcion");
        model.addColumn("Precio Hora");
        model.addColumn("Cantidad");
        model.addColumn("Cantidad Disponible");

        try {
            CollectionReference mobiliario = conexion.db.collection("mobiliario");
            ApiFuture<QuerySnapshot> querySnap = mobiliario.get();

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
                    document.getString("Codigo_proveedores"),
                    document.getString("Nombre"),
                    document.getString("Descripcion"),
                    document.getDouble("Precio_hora"),
                    document.getDouble("Cantidad"),
                    document.getDouble("Cantidad_Disponible")
                });
            }
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Error: " + e.getMessage());
        }

        table.setModel(model);
        TableRowSorter<DefaultTableModel> soter = new TableRowSorter<>(model);
        table.setRowSorter(soter);
    }

    public static void cargarLista(JList lista) {
        DefaultListModel model = new DefaultListModel();

        try {
            CollectionReference personas = conexion.db.collection("mobiliario");
            ApiFuture<QuerySnapshot> querySnap = personas.get();

            for (DocumentSnapshot document : querySnap.get().getDocuments()) {
                String newItem = document.getString("Nombre") + " - Precio: $" + document.get("Precio_hora");
                listaMobiliarios.add(newItem);
            }
            listaMobiliarios.forEach(element -> {
                model.addElement(element);
            });
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Error: " + e.getMessage());
        }
        lista.setModel(model);
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
}

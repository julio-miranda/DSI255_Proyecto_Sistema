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
import java.util.Map;
import java.util.concurrent.ExecutionException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Miranda
 */
public class MenuProvider {

    CollectionReference reference;

    static Firestore db;

    public static ArrayList<String> list = new ArrayList<>();

    public static boolean guardarMenu(String coleccion, String documento, Map<String, Object> data) {
        db = FirestoreClient.getFirestore();
        CollectionReference mobiliario = conexion.db.collection("menu");
        ApiFuture<QuerySnapshot> querySnap = mobiliario.get();

        try {
            for (DocumentSnapshot document : querySnap.get().getDocuments()) {
                list.add(document.getId());
                Collections.sort(list, (String s1, String s2) -> {
                    // Extraer los números de las cadenas y convertirlos a enteros para comparar
                    int num1 = Integer.parseInt(s1.split("-")[1]);
                    int num2 = Integer.parseInt(s2.split("-")[1]);
                    
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

    public static boolean actualizarMenu(String coleccion, String documento, Map<String, Object> data) {
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

    public static boolean eliminarMenu(String coleccion, String documento) {
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
        model.addColumn("Precio");
        model.addColumn("Categoria");

        try {
            CollectionReference mobiliario = conexion.db.collection("menu");
            ApiFuture<QuerySnapshot> querySnap = mobiliario.get();

            for (DocumentSnapshot document : querySnap.get().getDocuments()) {
                list.add(document.getId());
                Collections.sort(list, (String s1, String s2) -> {
                    // Extraer los números de las cadenas y convertirlos a enteros para comparar
                    int num1 = Integer.parseInt(s1.split("-")[1]);
                    int num2 = Integer.parseInt(s2.split("-")[1]);

                    // Comparar los números
                    return Integer.compare(num1, num2);
                });
                model.addRow(new Object[]{
                    document.getId(),
                    document.getString("Codigo_proveedores"),
                    document.getString("Nombre"),
                    document.getString("Descripcion"),
                    document.getDouble("Precio"),
                    document.getString("Categoria")
                });
            }
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Error: " + e.getMessage());
        }

        table.setModel(model);
        TableRowSorter<DefaultTableModel> soter = new TableRowSorter<>(model);
        table.setRowSorter(soter);
    }
}

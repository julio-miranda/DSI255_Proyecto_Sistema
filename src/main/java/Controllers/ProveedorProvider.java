package Controllers;

import Conexion.conexion;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.Precondition;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Miranda
 */
public class ProveedorProvider {

    CollectionReference reference;

    static Firestore db;

    public static ArrayList<String> list = new ArrayList<>();

    public static double stock;

    public static double unidad;

    public static boolean guardarProveedor(String coleccion, String documento, Map<String, Object> data) {
        db = FirestoreClient.getFirestore();
        CollectionReference Proveedor = conexion.db.collection("Proveedor");
        ApiFuture<QuerySnapshot> querySnap = Proveedor.get();

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

    public static boolean actualizarProveedor(String coleccion, String documento, Map<String, Object> data) {
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

    public static boolean eliminarProveedor(String coleccion, String documento) {
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
        model.addColumn("Codigo Proveedor");
        model.addColumn("Nombre Proveedor");
        model.addColumn("Nombre Producto");
        model.addColumn("Nombre Contacto");
        model.addColumn("Descripcion");
        model.addColumn("Direccion");
        model.addColumn("Telefono");
        model.addColumn("Telefono Contacto");
        model.addColumn("Tipo de Proveedor");

        try {
            CollectionReference producto = conexion.db.collection("Proveedor");
            ApiFuture<QuerySnapshot> querySnap = producto.get();

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
                    document.getString("nombre_proveedor"),
                    document.getString("nombre_producto"),
                    document.getString("nombre_contacto"),
                    document.getString("descripcion"),
                    document.getString("direccion"),
                    document.getString("telefono"),
                    document.getString("telefono_contacto"),
                    document.getString("tipo_proveedor")
                });
            }
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Error: " + e.getMessage());
        }

        table.setModel(model);
        TableRowSorter<DefaultTableModel> soter = new TableRowSorter<>(model);
        table.setRowSorter(soter);
    }

    public static void cargarComboBoxM(JComboBox comboBox) {

        try {
            CollectionReference producto = conexion.db.collection("Proveedor");
            ApiFuture<QuerySnapshot> querySnap = producto.get();
            // Limpia el JComboBox antes de agregar nuevos elementos
            comboBox.removeAllItems();

            for (DocumentSnapshot document : querySnap.get().getDocuments()) {
                if (document.getString("tipo_proveedor").equals("Mobiliario")) {
                    comboBox.addItem(document.getString("nombre_proveedor") + " - " + document.getString("nombre_producto"));
                }
            }
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void cargarComboBoxA(JComboBox comboBox) {

        try {
            CollectionReference producto = conexion.db.collection("Proveedor");
            ApiFuture<QuerySnapshot> querySnap = producto.get();
            // Limpia el JComboBox antes de agregar nuevos elementos
            comboBox.removeAllItems();

            for (DocumentSnapshot document : querySnap.get().getDocuments()) {
                if (document.getString("tipo_proveedor").equals("Alimentos")) {
                    comboBox.addItem(document.getString("nombre_proveedor") + " - " + document.getString("nombre_producto"));
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
}

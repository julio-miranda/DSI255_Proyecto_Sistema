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
import java.util.Comparator;
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
public class PersonaProvider {

    CollectionReference reference;

    static Firestore db;

    public static ArrayList<String> list = new ArrayList<>();
    public static HashSet<String> listaUsuarios = new HashSet<>();

    public static boolean guardarPersona(String coleccion, String documento, Map<String, Object> data) {
        db = FirestoreClient.getFirestore();
        CollectionReference personas = conexion.db.collection("usuarios");
        ApiFuture<QuerySnapshot> querySnap = personas.get();

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

    public static boolean actualizarPersona(String coleccion, String documento, Map<String, Object> data) {
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

    public static boolean eliminarPersona(String coleccion, String documento) {
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

    public static void cargarTablaEmpleados(JTable table) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Codigo");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Correo");
        model.addColumn("Password");
        model.addColumn("Telefono");
        model.addColumn("DUI");
        model.addColumn("Direccion");
        model.addColumn("Puesto");
        model.addColumn("Salario");
        model.addColumn("FechaCuempleaños");

        try {
            CollectionReference personas = conexion.db.collection("usuarios");
            ApiFuture<QuerySnapshot> querySnap = personas.get();

            for (DocumentSnapshot document : querySnap.get().getDocuments()) {
                list.add(document.getId());
                if (document.get("Tipo_de_usuario").equals("Admin") || document.get("Tipo_de_usuario").equals("Empleado")) {
                    Collections.sort(list, (String s1, String s2) -> {
                        // Extraer los números de las cadenas y convertirlos a enteros para comparar
                        int num1 = obtenerNumero(s1);
                        int num2 = obtenerNumero(s2);

                        // Comparar los números
                        return Integer.compare(num1, num2);
                    });
                    model.addRow(new Object[]{
                        document.getId(),
                        document.getString("nombre"),
                        document.getString("Apellido"),
                        document.getString("Correo"),
                        document.getString("Password"),
                        document.getString("telefono"),
                        document.getString("dui"),
                        document.getString("Direccion"),
                        document.getString("Puesto"),
                        document.getDouble("Salario"),
                        document.get("FechaCuempleaños")
                    });
                }
            }
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Error: " + e.getMessage());
        }

        table.setModel(model);
        TableRowSorter<DefaultTableModel> soter = new TableRowSorter<>(model);
        table.setRowSorter(soter);
    }

    public static void cargarTablaCliente(JTable table) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Codigo");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Correo");
        model.addColumn("Password");
        model.addColumn("Telefono");
        model.addColumn("DUI");
        model.addColumn("Direccion");
        model.addColumn("FechaCuempleaños");

        try {
            CollectionReference personas = conexion.db.collection("usuarios");
            ApiFuture<QuerySnapshot> querySnap = personas.get();

            for (DocumentSnapshot document : querySnap.get().getDocuments()) {
                list.add(document.getId());
                if (document.get("Tipo_de_usuario").equals("Cliente")) {
                    Collections.sort(list, (String s1, String s2) -> {
                        // Extraer los números de las cadenas y convertirlos a enteros para comparar
                        int num1 = obtenerNumero(s1);
                        int num2 = obtenerNumero(s2);

                        // Comparar los números
                        return Integer.compare(num1, num2);
                    });
                    model.addRow(new Object[]{
                        document.getId(),
                        document.getString("nombre"),
                        document.getString("Apellido"),
                        document.getString("Correo"),
                        document.getString("Password"),
                        document.getString("telefono"),
                        document.getString("dui"),
                        document.getString("Direccion"),
                        document.get("FechaCuempleaños")
                    }
                    );
                }
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
            CollectionReference personas = conexion.db.collection("usuarios");
            ApiFuture<QuerySnapshot> querySnap = personas.get();

            for (DocumentSnapshot document : querySnap.get().getDocuments()) {
                String newItem = document.getString("nombre") + " " + document.getString("Apellido");
                listaUsuarios.add(newItem);
            }
            listaUsuarios.forEach(element -> {
                model.addElement(element);
            });
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Error: " + e.getMessage());
        }
        lista.setModel(model);
    }

    public static boolean verificarClienteExistente(String correo, String dui) {
        try {
            CollectionReference personas = conexion.db.collection("usuarios");
            ApiFuture<QuerySnapshot> querySnap = personas.get();
            for (DocumentSnapshot document : querySnap.get().getDocuments()) {
                if (document.get("Tipo_de_usuario").equals("Cliente")) {

                    if (document.getString("Correo").equals(correo) || document.getString("dui").equals(dui)) {
                        System.out.println("El usuario ya existe");
                        return true;
                    }
                }

            }
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return false;
    }

    public static boolean verificarEmpleadoExistente(String correo, String dui) {
        try {
            CollectionReference personas = conexion.db.collection("usuarios");
            ApiFuture<QuerySnapshot> querySnap = personas.get();
            for (DocumentSnapshot document : querySnap.get().getDocuments()) {
                if (document.get("Tipo_de_usuario").equals("Empleado")) {

                    if (document.getString("Correo").equals(correo) || document.getString("dui").equals(dui)) {
                        System.out.println("El usuario ya existe");
                        return true;
                    }
                }

            }
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return false;
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

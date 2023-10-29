/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;
import java.io.FileInputStream;
import java.io.IOException;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseAuth;
import javax.swing.JOptionPane;


/**
 *
 * @author Miranda
 */
public class conexion {
    public static Firestore db;
    public static FirebaseAuth auth;
    
    public static void conectarFirebase(){
        try{
            FileInputStream as = new FileInputStream("hbbc.json");
            
            FirebaseOptions options = FirebaseOptions.builder()
                    .setCredentials(GoogleCredentials.fromStream(as))
                    .build();
            
            FirebaseApp.initializeApp(options);
            db = FirestoreClient.getFirestore();
            auth = FirebaseAuth.getInstance();
            System.out.println("Exito al conectar");
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Error... "+e.getMessage());
            System.err.println("Error... "+e.getMessage());
        }
    }
}

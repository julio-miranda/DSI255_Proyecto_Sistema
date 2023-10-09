/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Conexion.conexion;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.firebase.FirebaseApp;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author willi
 */
public class UI_Login extends javax.swing.JFrame {

    public static final ArrayList<JFrame> framesAbiertos = new ArrayList<>();

    CollectionReference reference;

    private static Firestore db;
    private int id = 0;

    /**
     * Creates new form UI_Login
     */
    public UI_Login() {
        conexion.conectarFirebase();
        initComponents();
    }

    public static void registrarFrame(JFrame frame) {
        framesAbiertos.add(frame);
    }

    public void cerrarConexion() {
        // Cierra la conexión de Firebase si existe
        if (FirebaseApp.getApps().isEmpty()) {
            this.dispose(); // Llama al método dispose() del JFrame
        } else {
            FirebaseApp.getInstance().delete(); // Reemplaza "DEFAULT" con el nombre de tu instancia Firebase si es diferente
            this.dispose(); // Llama al método dispose() del JFrame
        }
    }

    public static void cerrarTodosLosFrames() {
        framesAbiertos.forEach(frame -> {
            frame.dispose();
        });
        framesAbiertos.clear();
    }

    public static String hashDeContraseña(String plainTextPassword) {
        try {
            // Crea una instancia de MessageDigest con el algoritmo SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Obtiene los bytes de la contraseña en texto sin formato
            byte[] passwordBytes = plainTextPassword.getBytes(StandardCharsets.UTF_8);

            // Aplica el hash a los bytes de la contraseña
            byte[] hashedBytes = digest.digest(passwordBytes);

            // Convierte el resultado de bytes a una representación hexadecimal
            StringBuilder hexString = new StringBuilder(2 * hashedBytes.length);
            for (byte b : hashedBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            return null; // Manejo de excepciones
        }
    }

    public void tipoUsuario(String usuario, String puesto) {
        if (usuario.equals("Empleado")) {
            if (puesto.equals("Admin")) {
                registrarFrame(this);
                cerrarConexion();
                UI_menu_admin admin = new UI_menu_admin();
                admin.setVisible(true);
                cerrarTodosLosFrames();
            }
        } else if (usuario.equals("Cliente")) {
            registrarFrame(this);
            cerrarConexion();
            UI_menu_cliente cliente = new UI_menu_cliente();
            cliente.setVisible(true);
            cerrarTodosLosFrames();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelfondo = new javax.swing.JPanel();
        fondo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        registro = new javax.swing.JButton();
        login = new javax.swing.JButton();
        name_login = new javax.swing.JTextField();
        Password_login = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesion");
        setResizable(false);

        panelfondo.setBackground(new java.awt.Color(255, 255, 255));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/fondo.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/icon.png"))); // NOI18N

        registro.setText("Registrarse");
        registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroActionPerformed(evt);
            }
        });

        login.setText("Iniciar Sesion");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelfondoLayout = new javax.swing.GroupLayout(panelfondo);
        panelfondo.setLayout(panelfondoLayout);
        panelfondoLayout.setHorizontalGroup(
            panelfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelfondoLayout.createSequentialGroup()
                .addComponent(fondo)
                .addGroup(panelfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelfondoLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelfondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Password_login, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name_login, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registro, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))))
        );
        panelfondoLayout.setVerticalGroup(
            panelfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelfondoLayout.createSequentialGroup()
                .addGroup(panelfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelfondoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(name_login, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Password_login, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(login)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registro))
                    .addComponent(fondo))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroActionPerformed
        // TODO add your handling code here:
        // Make the UI_Registro form visible
        registrarFrame(this);
        cerrarConexion();
        UI_registro registroForm = new UI_registro();
        registroForm.setVisible(true);
        // Optionally, you can hide the current login form
        cerrarTodosLosFrames();

    }//GEN-LAST:event_registroActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        // Correo electrónico y contraseña del usuario
        String email = name_login.getText();
        String password = Password_login.getText();
        try {
            CollectionReference personas = conexion.db.collection("usuarios");
            ApiFuture<QuerySnapshot> querySnap = personas.get();

            boolean usuarioEncontrado = false;

            // Recorre la lista de usuarios
            for (DocumentSnapshot document : querySnap.get().getDocuments()) {
                String storedEmail = document.getString("Correo");
                String storedPassword = document.getString("Password");

                if (email.equals(storedEmail) && (password.equals(storedPassword) || hashDeContraseña(password).equals(storedPassword)))  {
                    // Autenticación exitosa
                    JOptionPane.showMessageDialog(this, "Bienvenido " + document.getString("nombre"));
                    tipoUsuario(document.getString("Tipo_de_usuario"), document.getString("Puesto"));
                    usuarioEncontrado = true;
                    break; // Sal del bucle ya que se encontró un usuario válido
                }
            }

            if (!usuarioEncontrado) {
                JOptionPane.showMessageDialog(this, "Las credenciales no son válidas");
            }

        } catch (InterruptedException | ExecutionException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            System.err.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_loginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UI_Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password_login;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton login;
    private javax.swing.JTextField name_login;
    private javax.swing.JPanel panelfondo;
    private javax.swing.JButton registro;
    // End of variables declaration//GEN-END:variables
}

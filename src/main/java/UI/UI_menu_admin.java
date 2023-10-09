/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Controllers.BungalowsProvider;
import Controllers.MenuProvider;
import Controllers.MobiliarioProvider;
import Controllers.PersonaProvider;
import Controllers.ProveedorProvider;
import Controllers.ReservasProvider;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author willi
 */
public class UI_menu_admin extends javax.swing.JFrame {

    UI_Login Login = new UI_Login();
    private String codigoB;
    private String codigoM;
    private String id_usuario;
    private String id_proveedor;
    private String id_Menu;
    private String id_reserva;
    Date fechaseleccionada;
    Date startDate;
    Date endDate;
    DefaultListModel modelMenu = new DefaultListModel();
    DefaultListModel modelMobiliario = new DefaultListModel();
    public static HashSet<String> fechasingresadas = new HashSet<>();
    public static HashSet<String> fechasSeleccionadas = new HashSet<>();
    public static ArrayList<String> listaMenu = new ArrayList<>();
    public static HashSet<String> listaMenuNR = new HashSet<>();
    public static ArrayList<String> listaMobiliario = new ArrayList<>();
    public static HashSet<String> listaMobiliarioNR = new HashSet<>();
    public static double TotalM = 0;
    public static double TotalU = 0;
    public static String codigoBungalows;
    public static Date start;
    public static Date end;

    private void ClearForm() {
        txtCantidad.setText("");
        txtHabitaciones.setText("");
        txtPrecio.setText("");
        txtProveedor.setText("");
        txtNombreProducto.setText("");
        txtNombreContacto.setText("");
        txtDescripcion.setText("");
        txtDescripcionProveedores.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtTelefonoContacto.setText("");
        txtNombreMenu.setText("");
        txtDescripcionMenu.setText("");
        txtPrecioMenu.setText("");
        txt_nombreE.setText("");
        txt_apellidosE.setText("");
        txt_correoE.setText("");
        txt_passwordE.setText("");
        txt_direccionE.setText("");
        txt_fechaCumpleadosE.setDate(null);
        txt_telefonoE.setText("");
        txt_duiE.setText("");
        txt_puestoE.setText("");
        txt_salarioE.setText("");
        txt_nombre.setText("");
        txt_apellidos.setText("");
        txt_correo.setText("");
        txt_password.setText("");
        txt_direccion.setText("");
        txt_fechaCumpleados.setDate(null);
        txt_telefono.setText("");
        txt_dui.setText("");
        txtNombre.setText("");
        txtDescripcion.setText("");
        txtPrecioH.setText("");
        txtCantidadM.setText("");
        txtCantidadD.setText("");
        FechaInicio.setDate(null);
        FechaFinal.setDate(null);
        total.setText("Total: $0");
        DefaultListModel<String> model = new DefaultListModel<>();
        Listapedido.setModel(model);
        ListaUtileria.setModel(model);
        txtFiltroR.setText("");
        txtFiltroUR.setText("");
        txtFiltroMR.setText("");
        txtClienteR.setText("");
    }

    /**
     * Creates new form UI_menu_admin
     */
    public UI_menu_admin() {
        initComponents();
        jPanelClientes.setVisible(false);
        jPanelBungalows.setVisible(false);
        jPanelUtilitarios.setVisible(false);
        jPanelEmpleados.setVisible(false);
        jPanel_Menus.setVisible(false);
        jPanelProveedores.setVisible(false);
        jPanelDocumentacion.setVisible(false);
        jPanelReservas.setVisible(false);
        jPanelInicio.setVisible(true);
        PersonaProvider.cargarTablaCliente(jTableClientes);
        PersonaProvider.cargarTablaEmpleados(jTableEmpleados);
        BungalowsProvider.cargarTabla(jTableBugalows);
        MobiliarioProvider.cargarTabla(jTableMobiliarios);
        ProveedorProvider.cargarTabla(jTableProveedores);
        ProveedorProvider.cargarComboBoxM(cbxProveedores);
        ProveedorProvider.cargarComboBoxA(cbxCodigoP);
        MenuProvider.cargarTabla(jTableMenus);
        ReservasProvider.cargarTabla(jTableReservas);
        PersonaProvider.cargarLista(ListaUsuarios);
        MobiliarioProvider.cargarLista(ListaMobiliario);
        MenuProvider.cargarLista(ListaMenu);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelContenido = new javax.swing.JPanel();
        jPanelEmpleados = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmpleados = new javax.swing.JTable();
        txt_nombreE = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txt_apellidosE = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txt_correoE = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txt_telefonoE = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txt_duiE = new javax.swing.JTextField();
        txt_direccionE = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        btn_EliminarUsuarioE = new javax.swing.JButton();
        btn_ActualizarUsuarioE = new javax.swing.JButton();
        btn_AgregarUsuarioE = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        txt_buscarE = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txt_puestoE = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txt_salarioE = new javax.swing.JTextField();
        txt_passwordE = new javax.swing.JPasswordField();
        txt_fechaCumpleadosE = new com.toedter.calendar.JDateChooser();
        jPanelUtilitarios = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMobiliarios = new javax.swing.JTable();
        btnActualizarM = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        btnGuardarM = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnEliminarM = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtCantidadM = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtPrecioH = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtCantidadD = new javax.swing.JTextField();
        cbxProveedores = new javax.swing.JComboBox<>();
        jPanelBungalows = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableBugalows = new javax.swing.JTable();
        cbxDisponibilidadB = new javax.swing.JComboBox<>();
        btnActualizarB = new javax.swing.JButton();
        txtPrecio = new javax.swing.JTextField();
        btnGuardarB = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnEliminarB = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtHabitaciones = new javax.swing.JTextField();
        jPanelClientes = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        btn_AgregarUsuario = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        btn_ActualizarUsuario = new javax.swing.JButton();
        btn_EliminarUsuario = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txt_dui = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_buscar = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        txt_fechaCumpleados = new com.toedter.calendar.JDateChooser();
        jPanel_Menus = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableMenus = new javax.swing.JTable();
        jLabel49 = new javax.swing.JLabel();
        txtNombreMenu = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        txtPrecioMenu = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        cbxCodigoP = new javax.swing.JComboBox<>();
        btnActualizarMenu = new javax.swing.JButton();
        btnGuardarMenu = new javax.swing.JButton();
        btnEliminarMenu = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtDescripcionMenu = new javax.swing.JTextArea();
        cbxCategoria = new javax.swing.JComboBox<>();
        jPanelProveedores = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableProveedores = new javax.swing.JTable();
        jLabel42 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        txtDescripcionProveedores = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txtNombreContacto = new javax.swing.JTextField();
        txtTelefonoContacto = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        cbxTproveedor = new javax.swing.JComboBox<>();
        jLabel54 = new javax.swing.JLabel();
        jPanelDocumentacion = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanelReservas = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTableReservas = new javax.swing.JTable();
        FechaInicio = new com.toedter.calendar.JDateChooser();
        FechaFinal = new com.toedter.calendar.JDateChooser();
        cbxBungalows = new javax.swing.JComboBox<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        ListaUsuarios = new javax.swing.JList<>();
        txtFiltroR = new javax.swing.JTextField();
        txtClienteR = new javax.swing.JTextField();
        total = new javax.swing.JLabel();
        btnGuardarR = new javax.swing.JButton();
        btnActualizarR = new javax.swing.JButton();
        btnEliminarR = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        ListaMenu = new javax.swing.JList<>();
        txtFiltroMR = new javax.swing.JTextField();
        jScrollPane11 = new javax.swing.JScrollPane();
        ListaMobiliario = new javax.swing.JList<>();
        txtFiltroUR = new javax.swing.JTextField();
        jScrollPane12 = new javax.swing.JScrollPane();
        Listapedido = new javax.swing.JList<>();
        jScrollPane13 = new javax.swing.JScrollPane();
        ListaUtileria = new javax.swing.JList<>();
        jPanelInicio = new javax.swing.JPanel();
        btn_facebook = new javax.swing.JPanel();
        facebook_btn = new javax.swing.JLabel();
        btn_whatsapp = new javax.swing.JPanel();
        whatsapp_btn = new javax.swing.JLabel();
        btn_maps = new javax.swing.JPanel();
        maps_btn = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanelMenu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_Inicio = new javax.swing.JPanel();
        inicio_btn = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_Cliente = new javax.swing.JPanel();
        cliente_btn = new javax.swing.JLabel();
        btn_Bungalows = new javax.swing.JPanel();
        bungalows_btn = new javax.swing.JLabel();
        btn_empleados = new javax.swing.JPanel();
        empleados_btn = new javax.swing.JLabel();
        btn_mobiliarios = new javax.swing.JPanel();
        mobiliarios_btn = new javax.swing.JLabel();
        btn_Menu = new javax.swing.JPanel();
        Menu_btn = new javax.swing.JLabel();
        btn_Proveedores = new javax.swing.JPanel();
        Proveedores_btn = new javax.swing.JLabel();
        btn_Reservas = new javax.swing.JPanel();
        Reservas_btn = new javax.swing.JLabel();
        btn_Documentacion = new javax.swing.JPanel();
        Documentacion_btn = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanelCerrarSesion = new javax.swing.JPanel();
        btn_CerrarSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(1, 25, 69));

        jLabel1.setBackground(new java.awt.Color(1, 25, 69));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("  Hotel Bungalows Beach Club");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanelContenido.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Empleados");

        jTableEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEmpleados);

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel31.setText("Nombre:");

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel32.setText("Apellidos:");

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel33.setText("Password:");

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel34.setText("Correo:");

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel35.setText("Telefono:");

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel36.setText("DUI:");

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel37.setText("Direccion:");

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel38.setText("Fecha de cumpleaños:");

        btn_EliminarUsuarioE.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_EliminarUsuarioE.setText("Eliminar usuario");
        btn_EliminarUsuarioE.setToolTipText("");
        btn_EliminarUsuarioE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarUsuarioEActionPerformed(evt);
            }
        });

        btn_ActualizarUsuarioE.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_ActualizarUsuarioE.setText("Actualizar usuario");
        btn_ActualizarUsuarioE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarUsuarioEActionPerformed(evt);
            }
        });

        btn_AgregarUsuarioE.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_AgregarUsuarioE.setText("Nuevo usuario ");
        btn_AgregarUsuarioE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarUsuarioEActionPerformed(evt);
            }
        });

        jLabel39.setText("Filtrar:");

        txt_buscarE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_buscarEKeyTyped(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel40.setText("Puesto:");

        jLabel41.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel41.setText("Salario:");

        javax.swing.GroupLayout jPanelEmpleadosLayout = new javax.swing.GroupLayout(jPanelEmpleados);
        jPanelEmpleados.setLayout(jPanelEmpleadosLayout);
        jPanelEmpleadosLayout.setHorizontalGroup(
            jPanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmpleadosLayout.createSequentialGroup()
                .addGroup(jPanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelEmpleadosLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_passwordE, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanelEmpleadosLayout.createSequentialGroup()
                                    .addComponent(jLabel34)
                                    .addGap(147, 147, 147)
                                    .addComponent(jLabel33))
                                .addGroup(jPanelEmpleadosLayout.createSequentialGroup()
                                    .addComponent(txt_telefonoE, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(34, 34, 34)
                                    .addComponent(txt_duiE, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelEmpleadosLayout.createSequentialGroup()
                                    .addGroup(jPanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_puestoE, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel40))
                                    .addGap(34, 34, 34)
                                    .addGroup(jPanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel41)
                                        .addComponent(txt_salarioE, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanelEmpleadosLayout.createSequentialGroup()
                                    .addGroup(jPanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel37)
                                        .addComponent(txt_direccionE, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(34, 34, 34)
                                    .addGroup(jPanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel38)
                                        .addComponent(txt_fechaCumpleadosE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelEmpleadosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEmpleadosLayout.createSequentialGroup()
                        .addGroup(jPanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(txt_nombreE, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelEmpleadosLayout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_buscarE, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelEmpleadosLayout.createSequentialGroup()
                                .addComponent(txt_apellidosE, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addGroup(jPanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_AgregarUsuarioE, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_ActualizarUsuarioE, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_EliminarUsuarioE, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanelEmpleadosLayout.createSequentialGroup()
                        .addGroup(jPanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_correoE, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel36)))
                .addGap(47, 222, Short.MAX_VALUE))
        );
        jPanelEmpleadosLayout.setVerticalGroup(
            jPanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmpleadosLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEmpleadosLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(6, 6, 6)
                        .addComponent(txt_nombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelEmpleadosLayout.createSequentialGroup()
                                .addGroup(jPanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel33))
                                .addGap(6, 6, 6)
                                .addGroup(jPanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelEmpleadosLayout.createSequentialGroup()
                                        .addComponent(txt_correoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel35))
                                    .addGroup(jPanelEmpleadosLayout.createSequentialGroup()
                                        .addComponent(txt_passwordE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel36)))
                                .addGap(6, 6, 6)
                                .addGroup(jPanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_telefonoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_duiE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel38))
                                .addGap(6, 6, 6)
                                .addComponent(txt_direccionE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_fechaCumpleadosE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(jLabel41))
                        .addGap(6, 6, 6)
                        .addGroup(jPanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_puestoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_salarioE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelEmpleadosLayout.createSequentialGroup()
                        .addGroup(jPanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addGroup(jPanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_buscarE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel39)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_apellidosE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_AgregarUsuarioE))
                        .addGap(10, 10, 10)
                        .addComponent(btn_ActualizarUsuarioE)
                        .addGap(9, 9, 9)
                        .addComponent(btn_EliminarUsuarioE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        jPanelUtilitarios.setToolTipText("");

        jLabel3.setBackground(java.awt.Color.lightGray);
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Mobiliarios");

        jTableMobiliarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableMobiliarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMobiliariosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableMobiliarios);

        btnActualizarM.setText("Actualizar");
        btnActualizarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarMActionPerformed(evt);
            }
        });

        btnGuardarM.setText("Guardar");
        btnGuardarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarMActionPerformed(evt);
            }
        });

        jLabel16.setText("Descripcion:");

        jLabel17.setText("Cantidad:");

        btnEliminarM.setText("Eliminar");
        btnEliminarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMActionPerformed(evt);
            }
        });

        jLabel18.setText("Codigo Proveedores:");

        jLabel19.setText("Nombre:");

        jLabel20.setText("Precio por hora:");

        jLabel21.setText("Cantidad Disponible:");

        javax.swing.GroupLayout jPanelUtilitariosLayout = new javax.swing.GroupLayout(jPanelUtilitarios);
        jPanelUtilitarios.setLayout(jPanelUtilitariosLayout);
        jPanelUtilitariosLayout.setHorizontalGroup(
            jPanelUtilitariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
            .addGroup(jPanelUtilitariosLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addGroup(jPanelUtilitariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUtilitariosLayout.createSequentialGroup()
                        .addGroup(jPanelUtilitariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelUtilitariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCantidadD, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidadM, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioH, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelUtilitariosLayout.createSequentialGroup()
                        .addComponent(btnGuardarM)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizarM)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarM)))
                .addContainerGap(318, Short.MAX_VALUE))
        );
        jPanelUtilitariosLayout.setVerticalGroup(
            jPanelUtilitariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUtilitariosLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelUtilitariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelUtilitariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelUtilitariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelUtilitariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(9, 9, 9)
                .addGroup(jPanelUtilitariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelUtilitariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(30, 30, 30)
                .addGroup(jPanelUtilitariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarM)
                    .addComponent(btnEliminarM)
                    .addComponent(btnActualizarM))
                .addGap(0, 182, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Bungalows");

        jTableBugalows.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableBugalows.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBugalowsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableBugalows);

        cbxDisponibilidadB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libre", "Ocupado", "Mantenimiento" }));

        btnActualizarB.setText("Actualizar");
        btnActualizarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarBActionPerformed(evt);
            }
        });

        btnGuardarB.setText("Guardar");
        btnGuardarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarBActionPerformed(evt);
            }
        });

        jLabel14.setText("N° habitaciones:");

        jLabel15.setText("Cantidad de personas");

        btnEliminarB.setText("Eliminar");
        btnEliminarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarBActionPerformed(evt);
            }
        });

        jLabel11.setText("Disponibilidad:");

        jLabel13.setText("Precio:");

        javax.swing.GroupLayout jPanelBungalowsLayout = new javax.swing.GroupLayout(jPanelBungalows);
        jPanelBungalows.setLayout(jPanelBungalowsLayout);
        jPanelBungalowsLayout.setHorizontalGroup(
            jPanelBungalowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
            .addComponent(jScrollPane3)
            .addGroup(jPanelBungalowsLayout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addGroup(jPanelBungalowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBungalowsLayout.createSequentialGroup()
                        .addComponent(btnGuardarB)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizarB)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarB))
                    .addGroup(jPanelBungalowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelBungalowsLayout.createSequentialGroup()
                            .addGroup(jPanelBungalowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addComponent(jLabel15))
                            .addGap(22, 22, 22)
                            .addGroup(jPanelBungalowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBungalowsLayout.createSequentialGroup()
                            .addGroup(jPanelBungalowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelBungalowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbxDisponibilidadB, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBungalowsLayout.setVerticalGroup(
            jPanelBungalowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBungalowsLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelBungalowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbxDisponibilidadB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanelBungalowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(29, 29, 29)
                .addGroup(jPanelBungalowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(29, 29, 29)
                .addGroup(jPanelBungalowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanelBungalowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarB)
                    .addComponent(btnEliminarB)
                    .addComponent(btnActualizarB))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Clientes");

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableClientes);

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setText("Correo:");

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setText("DUI:");

        btn_AgregarUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_AgregarUsuario.setText("Nuevo usuario ");
        btn_AgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarUsuarioActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setText("Password:");

        btn_ActualizarUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_ActualizarUsuario.setText("Actualizar usuario");
        btn_ActualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarUsuarioActionPerformed(evt);
            }
        });

        btn_EliminarUsuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_EliminarUsuario.setText("Eliminar usuario");
        btn_EliminarUsuario.setToolTipText("");
        btn_EliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarUsuarioActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setText("Telefono:");

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setText("Nombre:");

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setText("Direccion:");

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setText("Apellidos:");

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel29.setText("Fecha de cumpleaños:");

        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_buscarKeyTyped(evt);
            }
        });

        jLabel30.setText("Filtrar:");

        javax.swing.GroupLayout jPanelClientesLayout = new javax.swing.GroupLayout(jPanelClientes);
        jPanelClientes.setLayout(jPanelClientesLayout);
        jPanelClientesLayout.setHorizontalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClientesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelClientesLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelClientesLayout.createSequentialGroup()
                        .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                        .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_AgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_ActualizarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_EliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(46, 46, 46))
            .addGroup(jPanelClientesLayout.createSequentialGroup()
                .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelClientesLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelClientesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel22)
                        .addGap(147, 147, 147)
                        .addComponent(jLabel24))
                    .addGroup(jPanelClientesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_fechaCumpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelClientesLayout.createSequentialGroup()
                        .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelClientesLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25)))
                            .addGroup(jPanelClientesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_dui, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanelClientesLayout.setVerticalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClientesLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelClientesLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(6, 6, 6)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel24))
                        .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelClientesLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(jLabel25))
                            .addGroup(jPanelClientesLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel23)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_dui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel29))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_fechaCumpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelClientesLayout.createSequentialGroup()
                        .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelClientesLayout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(6, 6, 6)
                                .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_AgregarUsuario)))
                            .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel30)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_ActualizarUsuario)
                        .addGap(9, 9, 9)
                        .addComponent(btn_EliminarUsuario))))
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Menu");

        jTableMenus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableMenus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMenusMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTableMenus);

        jLabel49.setText("Codigo de Proveedores:");

        jLabel50.setText("Nombre:");

        jLabel51.setText("Descripcion:");

        jLabel52.setText("Precio:");

        jLabel53.setText("Categoria:");

        btnActualizarMenu.setText("Actualizar");
        btnActualizarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarMenuActionPerformed(evt);
            }
        });

        btnGuardarMenu.setText("Guardar");
        btnGuardarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarMenuActionPerformed(evt);
            }
        });

        btnEliminarMenu.setText("Eliminar");
        btnEliminarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMenuActionPerformed(evt);
            }
        });

        txtDescripcionMenu.setColumns(20);
        txtDescripcionMenu.setRows(5);
        jScrollPane7.setViewportView(txtDescripcionMenu);

        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrada", "Plato Fuerte", "Extra", "Bebida" }));

        javax.swing.GroupLayout jPanel_MenusLayout = new javax.swing.GroupLayout(jPanel_Menus);
        jPanel_Menus.setLayout(jPanel_MenusLayout);
        jPanel_MenusLayout.setHorizontalGroup(
            jPanel_MenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
            .addGroup(jPanel_MenusLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_MenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_MenusLayout.createSequentialGroup()
                        .addComponent(btnGuardarMenu)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizarMenu)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarMenu))
                    .addGroup(jPanel_MenusLayout.createSequentialGroup()
                        .addGroup(jPanel_MenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_MenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxCodigoP, 0, 186, Short.MAX_VALUE)
                            .addComponent(txtNombreMenu)
                            .addComponent(txtPrecioMenu)))
                    .addGroup(jPanel_MenusLayout.createSequentialGroup()
                        .addGroup(jPanel_MenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_MenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7)
                            .addComponent(cbxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_MenusLayout.setVerticalGroup(
            jPanel_MenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MenusLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel_MenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(cbxCodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_MenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_MenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52))
                .addGroup(jPanel_MenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_MenusLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel51))
                    .addGroup(jPanel_MenusLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(jPanel_MenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_MenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarMenu)
                    .addComponent(btnEliminarMenu)
                    .addComponent(btnActualizarMenu))
                .addContainerGap(179, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Proveedores");

        jTableProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProveedoresMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTableProveedores);

        jLabel42.setText("Nombre de Producto:");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel43.setText("Descripcion:");

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel44.setText("Direccion:");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel45.setText("Telefono:");

        jLabel46.setText("Nombre de Proveedor:");

        jLabel47.setText("Telefono Contacto:");

        jLabel48.setText("Nombre de Contacto:");

        cbxTproveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alimentos", "Mobiliario", "Otros" }));

        jLabel54.setText("Tipo de proveedor:");

        javax.swing.GroupLayout jPanelProveedoresLayout = new javax.swing.GroupLayout(jPanelProveedores);
        jPanelProveedores.setLayout(jPanelProveedoresLayout);
        jPanelProveedoresLayout.setHorizontalGroup(
            jPanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
            .addGroup(jPanelProveedoresLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(jPanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProveedoresLayout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar))
                    .addGroup(jPanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelProveedoresLayout.createSequentialGroup()
                            .addComponent(jLabel46)
                            .addGap(18, 18, 18)
                            .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProveedoresLayout.createSequentialGroup()
                            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(txtNombreContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProveedoresLayout.createSequentialGroup()
                            .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProveedoresLayout.createSequentialGroup()
                            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(txtDescripcionProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProveedoresLayout.createSequentialGroup()
                            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProveedoresLayout.createSequentialGroup()
                            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProveedoresLayout.createSequentialGroup()
                            .addGroup(jPanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbxTproveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTelefonoContacto, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelProveedoresLayout.setVerticalGroup(
            jPanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProveedoresLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescripcionProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonoContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxTproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Documentacion y Facturacion");

        javax.swing.GroupLayout jPanelDocumentacionLayout = new javax.swing.GroupLayout(jPanelDocumentacion);
        jPanelDocumentacion.setLayout(jPanelDocumentacionLayout);
        jPanelDocumentacionLayout.setHorizontalGroup(
            jPanelDocumentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );
        jPanelDocumentacionLayout.setVerticalGroup(
            jPanelDocumentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDocumentacionLayout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 649, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Reservas");

        jTableReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableReservasMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(jTableReservas);

        cbxBungalows.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxBungalowsItemStateChanged(evt);
            }
        });
        cbxBungalows.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxBungalowsMouseClicked(evt);
            }
        });

        ListaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(ListaUsuarios);

        txtFiltroR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroRKeyTyped(evt);
            }
        });

        total.setText("Total: $0");

        btnGuardarR.setText("Guardar");
        btnGuardarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRActionPerformed(evt);
            }
        });

        btnActualizarR.setText("Actualizar");
        btnActualizarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarRActionPerformed(evt);
            }
        });

        btnEliminarR.setText("Eliminar");
        btnEliminarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRActionPerformed(evt);
            }
        });

        ListaMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaMenuMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(ListaMenu);

        txtFiltroMR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroMRKeyTyped(evt);
            }
        });

        ListaMobiliario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaMobiliarioMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(ListaMobiliario);

        txtFiltroUR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroURKeyTyped(evt);
            }
        });

        Listapedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListapedidoMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(Listapedido);

        ListaUtileria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaUtileriaMouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(ListaUtileria);

        javax.swing.GroupLayout jPanelReservasLayout = new javax.swing.GroupLayout(jPanelReservas);
        jPanelReservas.setLayout(jPanelReservasLayout);
        jPanelReservasLayout.setHorizontalGroup(
            jPanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReservasLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtFiltroR, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxBungalows, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelReservasLayout.createSequentialGroup()
                        .addComponent(FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(FechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtClienteR)
                    .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelReservasLayout.createSequentialGroup()
                        .addGroup(jPanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFiltroMR)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFiltroUR)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addGroup(jPanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminarR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizarR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardarR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelReservasLayout.createSequentialGroup()
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
            .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelReservasLayout.setVerticalGroup(
            jPanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReservasLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelReservasLayout.createSequentialGroup()
                        .addGroup(jPanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxBungalows, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(txtFiltroR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtClienteR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(total)
                        .addContainerGap(141, Short.MAX_VALUE))
                    .addGroup(jPanelReservasLayout.createSequentialGroup()
                        .addGroup(jPanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanelReservasLayout.createSequentialGroup()
                                    .addComponent(txtFiltroUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane11))
                                .addGroup(jPanelReservasLayout.createSequentialGroup()
                                    .addComponent(txtFiltroMR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelReservasLayout.createSequentialGroup()
                                .addComponent(btnGuardarR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizarR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminarR)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(jScrollPane13)))))
        );

        jPanelInicio.setPreferredSize(new java.awt.Dimension(575, 681));

        btn_facebook.setBackground(new java.awt.Color(58, 91, 160));

        facebook_btn.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        facebook_btn.setForeground(new java.awt.Color(255, 255, 255));
        facebook_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        facebook_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/facebook.png"))); // NOI18N
        facebook_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facebook_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_facebookLayout = new javax.swing.GroupLayout(btn_facebook);
        btn_facebook.setLayout(btn_facebookLayout);
        btn_facebookLayout.setHorizontalGroup(
            btn_facebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(facebook_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        btn_facebookLayout.setVerticalGroup(
            btn_facebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(facebook_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btn_whatsapp.setBackground(new java.awt.Color(41, 167, 26));

        whatsapp_btn.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        whatsapp_btn.setForeground(new java.awt.Color(255, 255, 255));
        whatsapp_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        whatsapp_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/whatsapp.png"))); // NOI18N
        whatsapp_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                whatsapp_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_whatsappLayout = new javax.swing.GroupLayout(btn_whatsapp);
        btn_whatsapp.setLayout(btn_whatsappLayout);
        btn_whatsappLayout.setHorizontalGroup(
            btn_whatsappLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(whatsapp_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        btn_whatsappLayout.setVerticalGroup(
            btn_whatsappLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(whatsapp_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btn_maps.setBackground(new java.awt.Color(255, 102, 102));

        maps_btn.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        maps_btn.setForeground(new java.awt.Color(255, 255, 255));
        maps_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maps_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/google-maps.png"))); // NOI18N
        maps_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maps_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_mapsLayout = new javax.swing.GroupLayout(btn_maps);
        btn_maps.setLayout(btn_mapsLayout);
        btn_mapsLayout.setHorizontalGroup(
            btn_mapsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
            .addGroup(btn_mapsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_mapsLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(maps_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        btn_mapsLayout.setVerticalGroup(
            btn_mapsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
            .addGroup(btn_mapsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_mapsLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(maps_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/ini.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanelInicioLayout = new javax.swing.GroupLayout(jPanelInicio);
        jPanelInicio.setLayout(jPanelInicioLayout);
        jPanelInicioLayout.setHorizontalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_facebook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_whatsapp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_maps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelInicioLayout.setVerticalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInicioLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btn_facebook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_whatsapp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_maps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelContenidoLayout = new javax.swing.GroupLayout(jPanelContenido);
        jPanelContenido.setLayout(jPanelContenidoLayout);
        jPanelContenidoLayout.setHorizontalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBungalows, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelUtilitarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel_Menus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelDocumentacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelReservas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE))
        );
        jPanelContenidoLayout.setVerticalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBungalows, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelUtilitarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel_Menus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelDocumentacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelReservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE))
        );

        jPanelMenu.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/icon.png"))); // NOI18N

        btn_Inicio.setBackground(new java.awt.Color(1, 25, 69));

        inicio_btn.setBackground(new java.awt.Color(1, 25, 69));
        inicio_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inicio_btn.setForeground(new java.awt.Color(255, 255, 255));
        inicio_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inicio_btn.setText("Inicio");
        inicio_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inicio_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_InicioLayout = new javax.swing.GroupLayout(btn_Inicio);
        btn_Inicio.setLayout(btn_InicioLayout);
        btn_InicioLayout.setHorizontalGroup(
            btn_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 137, Short.MAX_VALUE)
            .addGroup(btn_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(inicio_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
        );
        btn_InicioLayout.setVerticalGroup(
            btn_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(btn_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(inicio_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
        );

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        btn_Cliente.setBackground(new java.awt.Color(255, 255, 255));

        cliente_btn.setBackground(new java.awt.Color(1, 25, 69));
        cliente_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cliente_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cliente_btn.setText("Clientes");
        cliente_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cliente_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_ClienteLayout = new javax.swing.GroupLayout(btn_Cliente);
        btn_Cliente.setLayout(btn_ClienteLayout);
        btn_ClienteLayout.setHorizontalGroup(
            btn_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_ClienteLayout.createSequentialGroup()
                .addComponent(cliente_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btn_ClienteLayout.setVerticalGroup(
            btn_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_ClienteLayout.createSequentialGroup()
                .addComponent(cliente_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btn_Bungalows.setBackground(new java.awt.Color(255, 255, 255));

        bungalows_btn.setBackground(new java.awt.Color(0, 0, 0));
        bungalows_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bungalows_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bungalows_btn.setText("Bungalows");
        bungalows_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bungalows_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_BungalowsLayout = new javax.swing.GroupLayout(btn_Bungalows);
        btn_Bungalows.setLayout(btn_BungalowsLayout);
        btn_BungalowsLayout.setHorizontalGroup(
            btn_BungalowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_BungalowsLayout.createSequentialGroup()
                .addComponent(bungalows_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btn_BungalowsLayout.setVerticalGroup(
            btn_BungalowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_BungalowsLayout.createSequentialGroup()
                .addComponent(bungalows_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btn_empleados.setBackground(new java.awt.Color(255, 255, 255));

        empleados_btn.setBackground(new java.awt.Color(0, 0, 0));
        empleados_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        empleados_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empleados_btn.setText("Empleados");
        empleados_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empleados_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_empleadosLayout = new javax.swing.GroupLayout(btn_empleados);
        btn_empleados.setLayout(btn_empleadosLayout);
        btn_empleadosLayout.setHorizontalGroup(
            btn_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_empleadosLayout.createSequentialGroup()
                .addComponent(empleados_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btn_empleadosLayout.setVerticalGroup(
            btn_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_empleadosLayout.createSequentialGroup()
                .addComponent(empleados_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btn_mobiliarios.setBackground(new java.awt.Color(255, 255, 255));

        mobiliarios_btn.setBackground(new java.awt.Color(0, 0, 0));
        mobiliarios_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mobiliarios_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mobiliarios_btn.setText("Mobiliarios");
        mobiliarios_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mobiliarios_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_mobiliariosLayout = new javax.swing.GroupLayout(btn_mobiliarios);
        btn_mobiliarios.setLayout(btn_mobiliariosLayout);
        btn_mobiliariosLayout.setHorizontalGroup(
            btn_mobiliariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_mobiliariosLayout.createSequentialGroup()
                .addComponent(mobiliarios_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btn_mobiliariosLayout.setVerticalGroup(
            btn_mobiliariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mobiliarios_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        btn_Menu.setBackground(new java.awt.Color(255, 255, 255));

        Menu_btn.setBackground(new java.awt.Color(0, 0, 0));
        Menu_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Menu_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Menu_btn.setText("Menu");
        Menu_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_MenuLayout = new javax.swing.GroupLayout(btn_Menu);
        btn_Menu.setLayout(btn_MenuLayout);
        btn_MenuLayout.setHorizontalGroup(
            btn_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_MenuLayout.createSequentialGroup()
                .addComponent(Menu_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btn_MenuLayout.setVerticalGroup(
            btn_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        btn_Proveedores.setBackground(new java.awt.Color(255, 255, 255));

        Proveedores_btn.setBackground(new java.awt.Color(0, 0, 0));
        Proveedores_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Proveedores_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Proveedores_btn.setText("Proveedores");
        Proveedores_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Proveedores_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_ProveedoresLayout = new javax.swing.GroupLayout(btn_Proveedores);
        btn_Proveedores.setLayout(btn_ProveedoresLayout);
        btn_ProveedoresLayout.setHorizontalGroup(
            btn_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_ProveedoresLayout.createSequentialGroup()
                .addComponent(Proveedores_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btn_ProveedoresLayout.setVerticalGroup(
            btn_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Proveedores_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        btn_Reservas.setBackground(new java.awt.Color(255, 255, 255));

        Reservas_btn.setBackground(new java.awt.Color(0, 0, 0));
        Reservas_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Reservas_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Reservas_btn.setText("Reservas");
        Reservas_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Reservas_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_ReservasLayout = new javax.swing.GroupLayout(btn_Reservas);
        btn_Reservas.setLayout(btn_ReservasLayout);
        btn_ReservasLayout.setHorizontalGroup(
            btn_ReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_ReservasLayout.createSequentialGroup()
                .addComponent(Reservas_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btn_ReservasLayout.setVerticalGroup(
            btn_ReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Reservas_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        btn_Documentacion.setBackground(new java.awt.Color(255, 255, 255));

        Documentacion_btn.setBackground(new java.awt.Color(0, 0, 0));
        Documentacion_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Documentacion_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Documentacion_btn.setText("Documentacion");
        Documentacion_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Documentacion_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_DocumentacionLayout = new javax.swing.GroupLayout(btn_Documentacion);
        btn_Documentacion.setLayout(btn_DocumentacionLayout);
        btn_DocumentacionLayout.setHorizontalGroup(
            btn_DocumentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_DocumentacionLayout.createSequentialGroup()
                .addComponent(Documentacion_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btn_DocumentacionLayout.setVerticalGroup(
            btn_DocumentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Documentacion_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jPanelCerrarSesion.setBackground(new java.awt.Color(255, 255, 255));

        btn_CerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_CerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_CerrarSesion.setText("Cerrar Sesion");
        btn_CerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CerrarSesionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelCerrarSesionLayout = new javax.swing.GroupLayout(jPanelCerrarSesion);
        jPanelCerrarSesion.setLayout(jPanelCerrarSesionLayout);
        jPanelCerrarSesionLayout.setHorizontalGroup(
            jPanelCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanelCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btn_CerrarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
        );
        jPanelCerrarSesionLayout.setVerticalGroup(
            jPanelCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(jPanelCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btn_CerrarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_Bungalows, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(btn_empleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addComponent(jPanelCerrarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_mobiliarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_Proveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_Reservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_Documentacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btn_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_Bungalows, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_empleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_mobiliarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_Proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_Reservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_Documentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mobiliarios_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobiliarios_btnMouseClicked
        // TODO add your handling code here:
        ClearForm();
        this.setBackground(Color.BLUE);
        Menu_btn.setBackground(Color.WHITE);
        Proveedores_btn.setBackground(Color.WHITE);
        bungalows_btn.setBackground(Color.WHITE);
        Reservas_btn.setBackground(Color.WHITE);
        cliente_btn.setBackground(Color.WHITE);
        empleados_btn.setBackground(Color.WHITE);
        Documentacion_btn.setBackground(Color.WHITE);
        jPanelCerrarSesion.setBackground(Color.WHITE);
        jPanelClientes.setVisible(false);
        jPanelBungalows.setVisible(false);
        jPanelUtilitarios.setVisible(true);
        jPanelEmpleados.setVisible(false);
        jPanel_Menus.setVisible(false);
        jPanelProveedores.setVisible(false);
        jPanelDocumentacion.setVisible(false);
        jPanelReservas.setVisible(false);
        jPanelInicio.setVisible(false);
    }//GEN-LAST:event_mobiliarios_btnMouseClicked

    private void empleados_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empleados_btnMouseClicked
        // TODO add your handling code here:
        ClearForm();
        this.setBackground(Color.BLUE);
        Menu_btn.setBackground(Color.WHITE);
        Proveedores_btn.setBackground(Color.WHITE);
        bungalows_btn.setBackground(Color.WHITE);
        Reservas_btn.setBackground(Color.WHITE);
        cliente_btn.setBackground(Color.WHITE);
        mobiliarios_btn.setBackground(Color.WHITE);
        Documentacion_btn.setBackground(Color.WHITE);
        jPanelCerrarSesion.setBackground(Color.WHITE);
        jPanelClientes.setVisible(false);
        jPanelBungalows.setVisible(false);
        jPanelUtilitarios.setVisible(false);
        jPanelEmpleados.setVisible(true);
        jPanel_Menus.setVisible(false);
        jPanelProveedores.setVisible(false);
        jPanelDocumentacion.setVisible(false);
        jPanelReservas.setVisible(false);
        jPanelInicio.setVisible(false);
    }//GEN-LAST:event_empleados_btnMouseClicked

    private void bungalows_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bungalows_btnMouseClicked
        // TODO add your handling code here:
        ClearForm();
        this.setBackground(Color.BLUE);
        Menu_btn.setBackground(Color.WHITE);
        Proveedores_btn.setBackground(Color.WHITE);
        Reservas_btn.setBackground(Color.WHITE);
        cliente_btn.setBackground(Color.WHITE);
        mobiliarios_btn.setBackground(Color.WHITE);
        empleados_btn.setBackground(Color.WHITE);
        Documentacion_btn.setBackground(Color.WHITE);
        jPanelCerrarSesion.setBackground(Color.WHITE);
        jPanelClientes.setVisible(false);
        jPanelBungalows.setVisible(true);
        jPanelUtilitarios.setVisible(false);
        jPanelEmpleados.setVisible(false);
        jPanel_Menus.setVisible(false);
        jPanelProveedores.setVisible(false);
        jPanelDocumentacion.setVisible(false);
        jPanelReservas.setVisible(false);
        jPanelInicio.setVisible(false);
    }//GEN-LAST:event_bungalows_btnMouseClicked

    private void cliente_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cliente_btnMouseClicked
        // TODO add your handling code here:
        ClearForm();
        this.setBackground(Color.BLUE);
        Menu_btn.setBackground(Color.WHITE);
        Proveedores_btn.setBackground(Color.WHITE);
        bungalows_btn.setBackground(Color.WHITE);
        Reservas_btn.setBackground(Color.WHITE);
        mobiliarios_btn.setBackground(Color.WHITE);
        empleados_btn.setBackground(Color.WHITE);
        Documentacion_btn.setBackground(Color.WHITE);
        jPanelCerrarSesion.setBackground(Color.WHITE);
        jPanelClientes.setVisible(true);
        jPanelBungalows.setVisible(false);
        jPanelUtilitarios.setVisible(false);
        jPanelEmpleados.setVisible(false);
        jPanel_Menus.setVisible(false);
        jPanelProveedores.setVisible(false);
        jPanelDocumentacion.setVisible(false);
        jPanelReservas.setVisible(false);
        jPanelInicio.setVisible(false);
    }//GEN-LAST:event_cliente_btnMouseClicked

    private void inicio_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicio_btnMouseClicked
        // TODO add your handling code here:
        ClearForm();
        this.setBackground(Color.BLUE);
        Menu_btn.setBackground(Color.WHITE);
        Proveedores_btn.setBackground(Color.WHITE);
        bungalows_btn.setBackground(Color.WHITE);
        Reservas_btn.setBackground(Color.WHITE);
        cliente_btn.setBackground(Color.WHITE);
        mobiliarios_btn.setBackground(Color.WHITE);
        empleados_btn.setBackground(Color.WHITE);
        Documentacion_btn.setBackground(Color.WHITE);
        jPanelCerrarSesion.setBackground(Color.WHITE);
        jPanelClientes.setVisible(false);
        jPanelBungalows.setVisible(false);
        jPanelUtilitarios.setVisible(false);
        jPanelEmpleados.setVisible(false);
        jPanel_Menus.setVisible(false);
        jPanelProveedores.setVisible(false);
        jPanelDocumentacion.setVisible(false);
        jPanelReservas.setVisible(false);
        jPanelInicio.setVisible(true);
    }//GEN-LAST:event_inicio_btnMouseClicked

    private void btn_CerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CerrarSesionMouseClicked
        // TODO add your handling code here:
        this.dispose();
        this.setBackground(Color.BLUE);
        Menu_btn.setBackground(Color.WHITE);
        Proveedores_btn.setBackground(Color.WHITE);
        bungalows_btn.setBackground(Color.WHITE);
        Reservas_btn.setBackground(Color.WHITE);
        cliente_btn.setBackground(Color.WHITE);
        mobiliarios_btn.setBackground(Color.WHITE);
        empleados_btn.setBackground(Color.WHITE);
        Documentacion_btn.setBackground(Color.WHITE);
        jPanelCerrarSesion.setBackground(Color.WHITE);
        // Show the UI_Login form
        Login.setVisible(true);
    }//GEN-LAST:event_btn_CerrarSesionMouseClicked

    private void Menu_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_btnMouseClicked
        // TODO add your handling code here:
        ClearForm();
        Menu_btn.setBackground(Color.BLUE);
        Proveedores_btn.setBackground(Color.WHITE);
        bungalows_btn.setBackground(Color.WHITE);
        Reservas_btn.setBackground(Color.WHITE);
        cliente_btn.setBackground(Color.WHITE);
        mobiliarios_btn.setBackground(Color.WHITE);
        empleados_btn.setBackground(Color.WHITE);
        Documentacion_btn.setBackground(Color.WHITE);
        jPanelCerrarSesion.setBackground(Color.WHITE);
        jPanelClientes.setVisible(false);
        jPanelBungalows.setVisible(false);
        jPanelUtilitarios.setVisible(false);
        jPanelEmpleados.setVisible(false);
        jPanel_Menus.setVisible(true);
        jPanelProveedores.setVisible(false);
        jPanelDocumentacion.setVisible(false);
        jPanelReservas.setVisible(false);
        jPanelInicio.setVisible(false);
    }//GEN-LAST:event_Menu_btnMouseClicked

    private void Proveedores_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Proveedores_btnMouseClicked
        // TODO add your handling code here:
        ClearForm();
        this.setBackground(Color.BLUE);
        Menu_btn.setBackground(Color.WHITE);
        Documentacion_btn.setBackground(Color.WHITE);
        bungalows_btn.setBackground(Color.WHITE);
        Reservas_btn.setBackground(Color.WHITE);
        cliente_btn.setBackground(Color.WHITE);
        mobiliarios_btn.setBackground(Color.WHITE);
        empleados_btn.setBackground(Color.WHITE);
        jPanelCerrarSesion.setBackground(Color.WHITE);
        jPanelClientes.setVisible(false);
        jPanelBungalows.setVisible(false);
        jPanelUtilitarios.setVisible(false);
        jPanelEmpleados.setVisible(false);
        jPanel_Menus.setVisible(false);
        jPanelProveedores.setVisible(true);
        jPanelDocumentacion.setVisible(false);
        jPanelReservas.setVisible(false);
        jPanelInicio.setVisible(false);
    }//GEN-LAST:event_Proveedores_btnMouseClicked

    private void Reservas_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reservas_btnMouseClicked
        // TODO add your handling code here:
        ClearForm();
        this.setBackground(Color.BLUE);
        Menu_btn.setBackground(Color.WHITE);
        Proveedores_btn.setBackground(Color.WHITE);
        bungalows_btn.setBackground(Color.WHITE);
        Documentacion_btn.setBackground(Color.WHITE);
        cliente_btn.setBackground(Color.WHITE);
        mobiliarios_btn.setBackground(Color.WHITE);
        empleados_btn.setBackground(Color.WHITE);
        jPanelCerrarSesion.setBackground(Color.WHITE);
        jPanelClientes.setVisible(false);
        jPanelBungalows.setVisible(false);
        jPanelUtilitarios.setVisible(false);
        jPanelEmpleados.setVisible(false);
        jPanel_Menus.setVisible(false);
        jPanelProveedores.setVisible(false);
        jPanelDocumentacion.setVisible(false);
        jPanelReservas.setVisible(true);
        jPanelInicio.setVisible(false);
    }//GEN-LAST:event_Reservas_btnMouseClicked

    private void Documentacion_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Documentacion_btnMouseClicked
        // TODO add your handling code here:
        ClearForm();
        this.setBackground(Color.BLUE);
        Menu_btn.setBackground(Color.WHITE);
        Proveedores_btn.setBackground(Color.WHITE);
        bungalows_btn.setBackground(Color.WHITE);
        Reservas_btn.setBackground(Color.WHITE);
        cliente_btn.setBackground(Color.WHITE);
        mobiliarios_btn.setBackground(Color.WHITE);
        empleados_btn.setBackground(Color.WHITE);
        jPanelCerrarSesion.setBackground(Color.WHITE);
        jPanelClientes.setVisible(false);
        jPanelBungalows.setVisible(false);
        jPanelUtilitarios.setVisible(false);
        jPanelEmpleados.setVisible(false);
        jPanel_Menus.setVisible(false);
        jPanelProveedores.setVisible(false);
        jPanelDocumentacion.setVisible(true);
        jPanelReservas.setVisible(false);
        jPanelInicio.setVisible(false);
    }//GEN-LAST:event_Documentacion_btnMouseClicked

    private void facebook_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebook_btnMouseClicked
        // TODO add your handling code here:
        try {
            // Abre el enlace a Facebook en el navegador web predeterminado
            Desktop.getDesktop().browse(new URI("https://www.facebook.com/BungalowsBeachClub/"));
        } catch (IOException | URISyntaxException ex) {
            // Manejar cualquier excepción que pueda ocurrir al abrir la URL
            ex.printStackTrace();
        }
    }//GEN-LAST:event_facebook_btnMouseClicked

    private void whatsapp_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whatsapp_btnMouseClicked
        // TODO add your handling code here:
        try {
            // Abre el enlace a Facebook en el navegador web predeterminado
            Desktop.getDesktop().browse(new URI("https://api.whatsapp.com/send?phone=%2B50378907680&data=ARBWQ5iDI4PcYu8QUrbp3V4zatyWMXSgiSnyi-tKathaYgpEQyPZSaB0SLOPmvpIf4H-usbSBtnHXSNtOBXxzm-vZ9G4ZZmXtp0E1qRSnps2n_SOZ3n9VmbR84ZtWDQQj2DTWBxb9CbiHgDF2jCeWfzCLA&source=FB_Page&app=facebook&entry_point=page_cta&fbclid=IwAR2Pqm3aZibbZoV3WpA5ifhp-Z6TsCaySXAMvJgfeIwu-OhR25yrUfvzTAc"));
        } catch (IOException | URISyntaxException ex) {
            // Manejar cualquier excepción que pueda ocurrir al abrir la URL
            ex.printStackTrace();
        }
    }//GEN-LAST:event_whatsapp_btnMouseClicked

    private void maps_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maps_btnMouseClicked
        // TODO add your handling code here:
        try {
            // Abre el enlace a Facebook en el navegador web predeterminado
            Desktop.getDesktop().browse(new URI("https://maps.app.goo.gl/3LYK8Qrs2yFEZpzEA"));
        } catch (IOException | URISyntaxException ex) {
            // Manejar cualquier excepción que pueda ocurrir al abrir la URL
            ex.printStackTrace();
        }
    }//GEN-LAST:event_maps_btnMouseClicked

    private void btnGuardarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarBActionPerformed
        // TODO add your handling code here:
        try {
            if (!txtCantidad.getText().isEmpty() && esNumero(txtCantidad.getText()) && !txtHabitaciones.getText().isEmpty() && esNumero(txtHabitaciones.getText()) && !txtPrecio.getText().isEmpty() && esNumero(txtPrecio.getText())) {
                String nuevoID = generarNuevoID("B-", BungalowsProvider.list);
                BungalowsProvider.list.add(nuevoID);
                Map<String, Object> datos = new HashMap<>();
                datos.put("Disponibilidad", cbxDisponibilidadB.getSelectedItem().toString());
                datos.put("Precio", Double.parseDouble(txtPrecio.getText()));
                datos.put("Habitaciones", Integer.parseInt(txtHabitaciones.getText()));
                datos.put("Cantidad", Integer.parseInt(txtCantidad.getText()));
                BungalowsProvider.guardarBungalows("bungalows", nuevoID, datos);
                JOptionPane.showMessageDialog(null, "Guardado con Exito");
                ClearForm();
            } else {
                JOptionPane.showMessageDialog(null, "Credenciales no son válidas.");
            }

        } catch (HeadlessException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al guardar");
        } finally {
            BungalowsProvider.cargarTabla(jTableBugalows);
        }
    }//GEN-LAST:event_btnGuardarBActionPerformed

    private void btnGuardarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarMActionPerformed
        // TODO add your handling code here:
        try {
            if (!txtNombre.getText().isEmpty() && !txtDescripcion.getText().isEmpty() && !txtPrecioH.getText().isEmpty() && !txtCantidadM.getText().isEmpty() && esNumero(txtCantidadM.getText()) && !txtCantidadD.getText().isEmpty() && esNumero(txtCantidadD.getText())) {
                String nuevoID = generarNuevoID("M-", MobiliarioProvider.list);
                MobiliarioProvider.list.add(nuevoID);
                Map<String, Object> datos = new HashMap<>();
                datos.put("Codigo_proveedores", cbxProveedores.getSelectedItem().toString());
                datos.put("Nombre", txtNombre.getText());
                datos.put("Descripcion", txtDescripcion.getText());
                datos.put("Precio_hora", Double.parseDouble(txtPrecioH.getText()));
                datos.put("Cantidad", Double.parseDouble(txtCantidadM.getText()));
                datos.put("Cantidad_Disponible", Double.parseDouble(txtCantidadD.getText()));
                MobiliarioProvider.guardarMobiliario("mobiliario", nuevoID, datos);
                JOptionPane.showMessageDialog(null, "Guardado con Exito");
                ClearForm();
            } else {
                JOptionPane.showMessageDialog(null, "Credenciales no son válidas.");
            }

        } catch (HeadlessException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al guardar");
        } finally {
            MobiliarioProvider.cargarTabla(jTableMobiliarios);
        }
    }//GEN-LAST:event_btnGuardarMActionPerformed

    private void btnActualizarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarBActionPerformed
        // TODO add your handling code here:
        try {
            if (!codigoB.isEmpty()) {
                if (!txtCantidad.getText().isEmpty() && !txtHabitaciones.getText().isEmpty() && !txtPrecio.getText().isEmpty()) {
                    Map<String, Object> datos = new HashMap<>();
                    datos.put("Disponibilidad", cbxDisponibilidadB.getSelectedItem().toString());
                    datos.put("Precio", txtPrecio.getText());
                    datos.put("Habitaciones", txtHabitaciones.getText());
                    datos.put("Cantidad", txtCantidad.getText());
                    BungalowsProvider.actualizarBungalows("bungalows", codigoB, datos);
                    JOptionPane.showMessageDialog(null, "Actualizado con Exito");
                    ClearForm();
                } else {
                    JOptionPane.showMessageDialog(null, "Credenciales no son válidas.");
                }
            }
        } catch (HeadlessException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al guardar");
        } finally {
            BungalowsProvider.cargarTabla(jTableBugalows);
        }
    }//GEN-LAST:event_btnActualizarBActionPerformed

    private void jTableBugalowsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBugalowsMouseClicked
        // TODO add your handling code here:
        int seleccion = jTableBugalows.getSelectedRow();
        codigoB = jTableBugalows.getValueAt(seleccion, 0).toString();
        cbxDisponibilidadB.setSelectedItem(jTableBugalows.getValueAt(seleccion, 1).toString());
        txtPrecio.setText(jTableBugalows.getValueAt(seleccion, 2).toString());
        txtHabitaciones.setText(jTableBugalows.getValueAt(seleccion, 3).toString());
        txtCantidad.setText(jTableBugalows.getValueAt(seleccion, 4).toString());
    }//GEN-LAST:event_jTableBugalowsMouseClicked

    private void btnEliminarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarBActionPerformed
        // TODO add your handling code here:
        try {
            if (!codigoB.isEmpty()) {
                BungalowsProvider.eliminarBungalows("bungalows", codigoB);
                JOptionPane.showMessageDialog(null, "Eliminado con Exito");
            }
        } catch (HeadlessException e) {
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al eliminar");
        } finally {
            ClearForm();
            BungalowsProvider.cargarTabla(jTableBugalows);
        }
    }//GEN-LAST:event_btnEliminarBActionPerformed

    private void btnActualizarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarMActionPerformed
        // TODO add your handling code here:
        try {
            if (!codigoM.isEmpty()) {
                if (!txtNombre.getText().isEmpty() && !txtDescripcion.getText().isEmpty() && !txtPrecioH.getText().isEmpty() && !txtCantidadM.getText().isEmpty() && esNumero(txtCantidadM.getText()) && !txtCantidadD.getText().isEmpty() && esNumero(txtCantidadD.getText())) {
                    Map<String, Object> datos = new HashMap<>();
                    datos.put("Codigo_proveedores", cbxProveedores.getSelectedItem().toString());
                    datos.put("Nombre", txtNombre.getText());
                    datos.put("Descripcion", txtDescripcion.getText());
                    datos.put("Precio_hora", Double.parseDouble(txtPrecioH.getText()));
                    datos.put("Cantidad", Double.parseDouble(txtCantidadM.getText()));
                    datos.put("Cantidad_Disponible", Double.parseDouble(txtCantidadD.getText()));
                    MobiliarioProvider.actualizarMobiliario("mobiliario", codigoM, datos);
                    JOptionPane.showMessageDialog(null, "Actualizado con Exito");
                    ClearForm();
                } else {
                    JOptionPane.showMessageDialog(null, "Credenciales no son válidas.");
                }
            }
        } catch (HeadlessException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al guardar");
        } finally {
            MobiliarioProvider.cargarTabla(jTableMobiliarios);
        }
    }//GEN-LAST:event_btnActualizarMActionPerformed

    private void jTableMobiliariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMobiliariosMouseClicked
        // TODO add your handling code here:
        int seleccion = jTableMobiliarios.getSelectedRow();
        codigoM = jTableMobiliarios.getValueAt(seleccion, 0).toString();
        cbxProveedores.setSelectedItem(jTableMobiliarios.getValueAt(seleccion, 1).toString());
        txtNombre.setText(jTableMobiliarios.getValueAt(seleccion, 2).toString());
        txtDescripcion.setText(jTableMobiliarios.getValueAt(seleccion, 3).toString());
        txtPrecioH.setText(jTableMobiliarios.getValueAt(seleccion, 4).toString());
        txtCantidadM.setText(jTableMobiliarios.getValueAt(seleccion, 5).toString());
        txtCantidadD.setText(jTableMobiliarios.getValueAt(seleccion, 6).toString());
    }//GEN-LAST:event_jTableMobiliariosMouseClicked

    private void btnEliminarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMActionPerformed
        // TODO add your handling code here:
        try {
            if (!codigoM.isEmpty()) {
                MobiliarioProvider.eliminarMobiliario("mobiliario", codigoM);
                JOptionPane.showMessageDialog(null, "Eliminado con Exito");
            }
        } catch (HeadlessException e) {
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al eliminar");
        } finally {
            ClearForm();
            MobiliarioProvider.cargarTabla(jTableMobiliarios);
        }
    }//GEN-LAST:event_btnEliminarMActionPerformed

    private void btn_AgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarUsuarioActionPerformed
        try {
            fechaseleccionada = txt_fechaCumpleados.getDate();
            if (!txt_nombre.getText().isEmpty() && !txt_apellidos.getText().isEmpty() && !txt_correo.getText().isEmpty() && isValidEmail(txt_correo.getText()) && !txt_password.getText().isEmpty() && validarContraseña(txt_password.getText()) && !txt_dui.getText().isEmpty() && isValidDUI(txt_dui.getText()) && !txt_direccion.getText().isEmpty() && !txt_telefono.getText().isEmpty() && validarNumeroTelefono(txt_telefono.getText()) && validarFecha(txt_fechaCumpleados) && !PersonaProvider.verificarClienteExistente(txt_correo.getText(), txt_dui.getText())) {
                String nuevoID = generarNuevoID("U-", PersonaProvider.list);
                PersonaProvider.list.add(nuevoID);
                Map<String, Object> datos = new HashMap<>();
                datos.put("nombre", txt_nombre.getText());
                datos.put("Apellido", txt_apellidos.getText());
                datos.put("Tipo_de_usuario", "Cliente");
                datos.put("Correo", txt_correo.getText());
                datos.put("Password", UI_Login.hashDeContraseña(txt_password.getText()));
                datos.put("telefono", txt_telefono.getText());
                datos.put("dui", txt_dui.getText());
                datos.put("Direccion", txt_direccion.getText());
                datos.put("FechaCuempleaños", fechaseleccionada.toString());
                PersonaProvider.guardarPersona("usuarios", nuevoID, datos);
                JOptionPane.showMessageDialog(null, "Guardado con exito");
                ClearForm();
            }
        } catch (HeadlessException e) {
            System.out.println("Error.." + e.getMessage());
        } finally {
            PersonaProvider.cargarLista(ListaUsuarios);
            PersonaProvider.cargarTablaCliente(jTableClientes);//recargar tabla
        }
    }//GEN-LAST:event_btn_AgregarUsuarioActionPerformed

    private void btn_ActualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarUsuarioActionPerformed
        try {
            fechaseleccionada = txt_fechaCumpleados.getDate();
            if (!id_usuario.isEmpty()) {
                if (!txt_nombre.getText().isEmpty() && !txt_apellidos.getText().isEmpty() && !txt_correo.getText().isEmpty() && isValidEmail(txt_correo.getText()) && !txt_password.getText().isEmpty() && validarContraseña(txt_password.getText()) && !txt_dui.getText().isEmpty() && isValidDUI(txt_dui.getText()) && !txt_direccion.getText().isEmpty() && !txt_telefono.getText().isEmpty() && validarNumeroTelefono(txt_telefono.getText()) && validarFecha(txt_fechaCumpleados)) {
                    Map<String, Object> datos = new HashMap<>();
                    datos.put("nombre", txt_nombre.getText());
                    datos.put("Apellido", txt_apellidos.getText());
                    datos.put("Tipo_de_usuario", "Cliente");
                    datos.put("Correo", txt_correo.getText());
                    datos.put("Password", UI_Login.hashDeContraseña(txt_password.getText()));
                    datos.put("telefono", txt_telefono.getText());
                    datos.put("dui", txt_dui.getText());
                    datos.put("Direccion", txt_direccion.getText());
                    datos.put("FechaCuempleaños", fechaseleccionada.toString());
                    PersonaProvider.actualizarPersona("usuarios", id_usuario, datos);
                    JOptionPane.showMessageDialog(null, "Actualizado con exito");
                    ClearForm();
                }
            }
        } catch (HeadlessException e) {
            System.out.println("Error.." + e.getMessage());
            JOptionPane.showConfirmDialog(null, "Error al guardar");
        } finally {
            PersonaProvider.cargarLista(ListaUsuarios);
            PersonaProvider.cargarTablaCliente(jTableClientes);//recargar tabla
        }
    }//GEN-LAST:event_btn_ActualizarUsuarioActionPerformed

    private void btn_EliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarUsuarioActionPerformed
        try {
            if (!id_usuario.isEmpty()) {
                PersonaProvider.eliminarPersona("usuarios", id_usuario);
                JOptionPane.showMessageDialog(null, "Eliminado con exito");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar");
        } finally {
            PersonaProvider.cargarLista(ListaUsuarios);
            PersonaProvider.cargarTablaCliente(jTableClientes);
            ClearForm();
        }
    }//GEN-LAST:event_btn_EliminarUsuarioActionPerformed

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked
        // TODO add your handling code here:
        int selection = jTableClientes.getSelectedRow();
        id_usuario = jTableClientes.getValueAt(selection, 0).toString();
        txt_nombre.setText(jTableClientes.getValueAt(selection, 1) + "");
        txt_apellidos.setText(jTableClientes.getValueAt(selection, 2) + "");
        txt_correo.setText(jTableClientes.getValueAt(selection, 3) + "");
        txt_password.setText(jTableClientes.getValueAt(selection, 4) + "");
        txt_telefono.setText(jTableClientes.getValueAt(selection, 5) + "");
        txt_dui.setText(jTableClientes.getValueAt(selection, 6) + "");
        txt_direccion.setText(jTableClientes.getValueAt(selection, 7) + "");
        Date fecha = new Date(jTableClientes.getValueAt(selection, 8).toString());
        txt_fechaCumpleados.setDate(fecha);
    }//GEN-LAST:event_jTableClientesMouseClicked

    private void txt_buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyTyped
        // TODO add your handling code here:
        // Agregar el DocumentListener al campo de búsqueda
        DefaultTableModel tableModel = (DefaultTableModel) jTableClientes.getModel();
        String filtro = txt_buscar.getText().toLowerCase();
        List<RowFilter<Object, Object>> filters = new ArrayList<>();

        filters.add(RowFilter.regexFilter("(?i)" + filtro, 1)); // Filtrar por la columna 1 (Nombre)
        filters.add(RowFilter.regexFilter("(?i)" + filtro, 2)); // Filtrar por la columna 2 (Apellido)
        filters.add(RowFilter.regexFilter("(?i)" + filtro, 3)); // Filtrar por la columna 3 (Correo)
        filters.add(RowFilter.regexFilter("(?i)" + filtro, 6)); // Filtrar por la columna 6 (Dui)

        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tableModel);
        sorter.setRowFilter(RowFilter.andFilter(filters));

        jTableClientes.setRowSorter(sorter);
    }//GEN-LAST:event_txt_buscarKeyTyped

    private void btn_EliminarUsuarioEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarUsuarioEActionPerformed
        // TODO add your handling code here:
        try {
            if (!id_usuario.isEmpty()) {
                PersonaProvider.eliminarPersona("usuarios", id_usuario);
                JOptionPane.showMessageDialog(null, "Eliminado con exito");
                ClearForm();
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar");
        } finally {
            ClearForm();
            PersonaProvider.cargarLista(ListaUsuarios);
            PersonaProvider.cargarTablaEmpleados(jTableEmpleados);//recargar tabla
        }
    }//GEN-LAST:event_btn_EliminarUsuarioEActionPerformed

    private void btn_ActualizarUsuarioEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarUsuarioEActionPerformed
        // TODO add your handling code here:
        try {
            fechaseleccionada = txt_fechaCumpleadosE.getDate();
            if (!id_usuario.isEmpty()) {
                if (!txt_nombreE.getText().isEmpty() && !txt_apellidosE.getText().isEmpty() && !txt_correoE.getText().isEmpty() && isValidEmail(txt_correoE.getText()) && !txt_passwordE.getText().isEmpty() && validarContraseña(txt_passwordE.getText()) && !txt_duiE.getText().isEmpty() && isValidDUI(txt_duiE.getText()) && !txt_direccionE.getText().isEmpty() && !txt_telefonoE.getText().isEmpty() && validarNumeroTelefono(txt_telefonoE.getText()) && !txt_salarioE.getText().isEmpty() && esNumero(txt_salarioE.getText()) && validarFecha(txt_fechaCumpleadosE)) {
                    Map<String, Object> datos = new HashMap<>();
                    datos.put("nombre", txt_nombreE.getText());
                    datos.put("Apellido", txt_apellidosE.getText());
                    datos.put("Tipo_de_usuario", "Empleado");
                    datos.put("Correo", txt_correoE.getText());
                    datos.put("Password", UI_Login.hashDeContraseña(txt_passwordE.getText()));
                    datos.put("telefono", txt_telefonoE.getText());
                    datos.put("Puesto", txt_puestoE.getText());
                    datos.put("Salario", Double.parseDouble(txt_salarioE.getText()));
                    datos.put("dui", txt_duiE.getText());
                    datos.put("Direccion", txt_direccionE.getText());
                    datos.put("FechaCuempleaños", fechaseleccionada.toString());
                    PersonaProvider.actualizarPersona("usuarios", id_usuario, datos);
                    JOptionPane.showMessageDialog(null, "Actualizado con exito");
                    ClearForm();
                }
            }
        } catch (HeadlessException e) {
            System.out.println("Error.." + e.getMessage());
            JOptionPane.showConfirmDialog(null, "Error al guardar");
        } finally {
            PersonaProvider.cargarLista(ListaUsuarios);
            PersonaProvider.cargarTablaEmpleados(jTableEmpleados);//recargar tabla
        }
    }//GEN-LAST:event_btn_ActualizarUsuarioEActionPerformed

    private void btn_AgregarUsuarioEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarUsuarioEActionPerformed
        // TODO add your handling code here:
        try {
            if (!txt_nombreE.getText().isEmpty() && !txt_apellidosE.getText().isEmpty() && !txt_correoE.getText().isEmpty() && isValidEmail(txt_correoE.getText()) && !txt_passwordE.getText().isEmpty() && validarContraseña(txt_passwordE.getText()) && !txt_duiE.getText().isEmpty() && isValidDUI(txt_duiE.getText()) && !txt_direccionE.getText().isEmpty() && !txt_telefonoE.getText().isEmpty() && validarNumeroTelefono(txt_telefonoE.getText()) && !txt_salarioE.getText().isEmpty() && esNumero(txt_salarioE.getText()) && validarFecha(txt_fechaCumpleadosE) && !PersonaProvider.verificarEmpleadoExistente(txt_correoE.getText(), txt_duiE.getText())) {
                String nuevoID = generarNuevoID("U-", PersonaProvider.list);
                PersonaProvider.list.add(nuevoID);
                Map<String, Object> datos = new HashMap<>();
                datos.put("Nombre", txt_nombreE.getText());
                datos.put("Apellido", txt_apellidosE.getText());
                datos.put("Tipo_de_usuario", "Empleado");
                datos.put("Correo", txt_correoE.getText());
                datos.put("Password", UI_Login.hashDeContraseña(txt_passwordE.getText()));
                datos.put("telefono", txt_telefonoE.getText());
                datos.put("Puesto", txt_puestoE.getText());
                datos.put("Salario", Double.parseDouble(txt_salarioE.getText()));
                datos.put("dui", txt_duiE.getText());
                datos.put("Direccion", txt_direccionE.getText());
                datos.put("FechaCuempleaños", txt_fechaCumpleadosE.getDate());
                PersonaProvider.guardarPersona("usuarios", nuevoID, datos);
                JOptionPane.showMessageDialog(null, "Guardado con exito");
                ClearForm();
            }
        } catch (HeadlessException e) {
            System.out.println("Error.." + e.getMessage());
        } finally {
            PersonaProvider.cargarLista(ListaUsuarios);
            PersonaProvider.cargarTablaEmpleados(jTableEmpleados);//recargar tabla

        }
    }//GEN-LAST:event_btn_AgregarUsuarioEActionPerformed

    private void txt_buscarEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarEKeyTyped
        // TODO add your handling code here:
        // Agregar el DocumentListener al campo de búsqueda
        DefaultTableModel tableModel = (DefaultTableModel) jTableEmpleados.getModel();
        String filtro = txt_buscarE.getText().toLowerCase();
        List<RowFilter<Object, Object>> filters = new ArrayList<>();
        /*filters.add(RowFilter.regexFilter("(?i)" + filtro, 1)); // Filtrar por la columna 1 (Nombre)
        filters.add(RowFilter.regexFilter("(?i)" + filtro, 3)); // Filtrar por la columna 3 (Correo)*/

        filters.add(RowFilter.regexFilter("(?i)" + filtro, 1)); // Filtrar por la columna 1 (Nombre)
        filters.add(RowFilter.regexFilter("(?i)" + filtro, 2)); // Filtrar por la columna 2 (Apellido)
        filters.add(RowFilter.regexFilter("(?i)" + filtro, 3)); // Filtrar por la columna 3 (Correo)
        filters.add(RowFilter.regexFilter("(?i)" + filtro, 6)); // Filtrar por la columna 6 (Dui)

        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tableModel);
        sorter.setRowFilter(RowFilter.andFilter(filters));

        jTableEmpleados.setRowSorter(sorter);
    }//GEN-LAST:event_txt_buscarEKeyTyped

    private void jTableEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmpleadosMouseClicked
        // TODO add your handling code here:
        int selection = jTableEmpleados.getSelectedRow();
        id_usuario = jTableEmpleados.getValueAt(selection, 0).toString();
        txt_nombreE.setText(jTableEmpleados.getValueAt(selection, 1) + "");
        txt_apellidosE.setText(jTableEmpleados.getValueAt(selection, 2) + "");
        txt_correoE.setText(jTableEmpleados.getValueAt(selection, 3) + "");
        txt_telefonoE.setText(jTableEmpleados.getValueAt(selection, 5) + "");
        txt_duiE.setText(jTableEmpleados.getValueAt(selection, 6) + "");
        txt_direccionE.setText(jTableEmpleados.getValueAt(selection, 7) + "");
        txt_puestoE.setText(jTableEmpleados.getValueAt(selection, 8) + "");
        txt_salarioE.setText(jTableEmpleados.getValueAt(selection, 9) + "");
        Date fecha = new Date(jTableEmpleados.getValueAt(selection, 10).toString());
        txt_fechaCumpleadosE.setDate(fecha);
    }//GEN-LAST:event_jTableEmpleadosMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:

        try {
            if (!txtProveedor.getText().isEmpty() && !txtNombreProducto.getText().isEmpty() && !txtNombreContacto.getText().isEmpty() && !txtDescripcionProveedores.getText().isEmpty() && !txtDireccion.getText().isEmpty() && !txtTelefono.getText().isEmpty() && validarNumeroTelefono(txtTelefono.getText()) && !txtTelefonoContacto.getText().isEmpty() && validarNumeroTelefono(txtTelefonoContacto.getText()) && !txtTelefonoContacto.getText().equals(txtTelefono.getText())) {
                String nuevoID = generarNuevoID("P-", ProveedorProvider.list);
                ProveedorProvider.list.add(nuevoID);
                Map<String, Object> datos = new HashMap<>();
                datos.put("nombre_proveedor", txtProveedor.getText());
                datos.put("nombre_producto", txtNombreProducto.getText());
                datos.put("nombre_contacto", txtNombreContacto.getText());
                datos.put("descripcion", txtDescripcionProveedores.getText());
                datos.put("direccion", txtDireccion.getText());
                datos.put("telefono", txtTelefono.getText());
                datos.put("telefono_contacto", txtTelefonoContacto.getText());
                datos.put("tipo_proveedor", cbxTproveedor.getSelectedItem().toString());
                ProveedorProvider.guardarProveedor("Proveedor", nuevoID, datos);
                JOptionPane.showMessageDialog(null, "Guardado con Exito");
                ClearForm();
            }
        } catch (HeadlessException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al guardar");
        } finally {
            ProveedorProvider.cargarComboBoxM(cbxProveedores);
            ProveedorProvider.cargarComboBoxA(cbxCodigoP);
            ProveedorProvider.cargarTabla(jTableProveedores);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            if (!id_proveedor.isEmpty()) {
                if (!txtProveedor.getText().isEmpty() && !txtNombreProducto.getText().isEmpty() && !txtNombreContacto.getText().isEmpty() && !txtDescripcionProveedores.getText().isEmpty() && !txtDireccion.getText().isEmpty() && !txtTelefono.getText().isEmpty() && validarNumeroTelefono(txtTelefono.getText()) && !txtTelefonoContacto.getText().isEmpty() && validarNumeroTelefono(txtTelefonoContacto.getText()) && !txtTelefonoContacto.getText().equals(txtTelefono.getText())) {
                    Map<String, Object> datos = new HashMap<>();
                    datos.put("nombre_proveedor", txtProveedor.getText());
                    datos.put("nombre_producto", txtNombreProducto.getText());
                    datos.put("nombre_contacto", txtNombreContacto.getText());
                    datos.put("descripcion", txtDescripcionProveedores.getText());
                    datos.put("direccion", txtDireccion.getText());
                    datos.put("telefono", txtTelefono.getText());
                    datos.put("telefono_contacto", txtTelefonoContacto.getText());
                    datos.put("tipo_proveedor", cbxTproveedor.getSelectedItem().toString());
                    ProveedorProvider.actualizarProveedor("Proveedor", id_proveedor, datos);
                    JOptionPane.showMessageDialog(null, "Actualizado con Exito");
                    ClearForm();
                }
            }
        } catch (HeadlessException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al guardar");
        } finally {
            ProveedorProvider.cargarComboBoxM(cbxProveedores);
            ProveedorProvider.cargarComboBoxA(cbxCodigoP);
            ProveedorProvider.cargarTabla(jTableProveedores);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        try {
            if (!id_proveedor.isEmpty()) {
                ProveedorProvider.eliminarProveedor("Proveedor", id_proveedor);
                JOptionPane.showMessageDialog(null, "Eliminado con Exito");
            }
        } catch (HeadlessException e) {
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al eliminar");
        } finally {
            ClearForm();
            ProveedorProvider.cargarComboBoxM(cbxProveedores);
            ProveedorProvider.cargarComboBoxA(cbxCodigoP);
            ProveedorProvider.cargarTabla(jTableProveedores);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        ClearForm();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnActualizarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarMenuActionPerformed
        // TODO add your handling code here:
        try {
            if (!id_Menu.isEmpty()) {
                if (!txtNombreMenu.getText().isEmpty() && !txtDescripcionMenu.getText().isEmpty() && !txtPrecioMenu.getText().isEmpty() && esNumero(txtPrecioMenu.getText())) {
                    Map<String, Object> datos = new HashMap<>();
                    datos.put("Codigo_proveedores", cbxCodigoP.getSelectedItem().toString());
                    datos.put("Nombre", txtNombreMenu.getText());
                    datos.put("Descripcion", txtDescripcionMenu.getText());
                    datos.put("Precio", Double.parseDouble(txtPrecioMenu.getText()));
                    datos.put("Categoria", cbxCategoria.getSelectedItem().toString());
                    MenuProvider.guardarMenu("menu", id_Menu, datos);
                    JOptionPane.showMessageDialog(null, "Actualizado con Exito");
                    ClearForm();
                } else {
                    JOptionPane.showMessageDialog(null, "Credenciales no son válidas.");
                }
            }
        } catch (HeadlessException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al guardar");
        } finally {
            MenuProvider.cargarTabla(jTableMenus);
        }
    }//GEN-LAST:event_btnActualizarMenuActionPerformed

    private void btnGuardarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarMenuActionPerformed
        // TODO add your handling code here:
        try {
            if (!txtNombreMenu.getText().isEmpty() && !txtDescripcionMenu.getText().isEmpty() && !txtPrecioMenu.getText().isEmpty() && esNumero(txtPrecioMenu.getText())) {
                String nuevoID = generarNuevoID("M-", MenuProvider.list);
                MenuProvider.list.add(nuevoID);
                Map<String, Object> datos = new HashMap<>();
                datos.put("Codigo_proveedores", cbxCodigoP.getSelectedItem().toString());
                datos.put("Nombre", txtNombreMenu.getText());
                datos.put("Descripcion", txtDescripcionMenu.getText());
                datos.put("Precio", Double.parseDouble(txtPrecioMenu.getText()));
                datos.put("Categoria", cbxCategoria.getSelectedItem().toString());
                MenuProvider.guardarMenu("menu", nuevoID, datos);
                JOptionPane.showMessageDialog(null, "Guardado con Exito");
                ClearForm();
            } else {
                JOptionPane.showMessageDialog(null, "Credenciales no son válidas.");
            }

        } catch (HeadlessException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al guardar");
        } finally {
            MenuProvider.cargarTabla(jTableMenus);
        }
    }//GEN-LAST:event_btnGuardarMenuActionPerformed

    private void btnEliminarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMenuActionPerformed
        // TODO add your handling code here:
        try {
            if (!id_Menu.isEmpty()) {
                MobiliarioProvider.eliminarMobiliario("menu", id_Menu);
                JOptionPane.showMessageDialog(null, "Eliminado con Exito");
            }
        } catch (HeadlessException e) {
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al eliminar");
        } finally {
            ClearForm();
            MenuProvider.cargarTabla(jTableMenus);
        }
    }//GEN-LAST:event_btnEliminarMenuActionPerformed

    private void jTableMenusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMenusMouseClicked
        // TODO add your handling code here:
        int seleccion = jTableMenus.getSelectedRow();
        id_Menu = jTableMenus.getValueAt(seleccion, 0).toString();
        cbxCodigoP.setSelectedItem(jTableMenus.getValueAt(seleccion, 1).toString());
        txtNombreMenu.setText(jTableMenus.getValueAt(seleccion, 2).toString());
        txtDescripcionMenu.setText(jTableMenus.getValueAt(seleccion, 3).toString());
        txtPrecioMenu.setText(jTableMenus.getValueAt(seleccion, 4).toString());
        cbxCategoria.setSelectedItem(jTableMenus.getValueAt(seleccion, 5).toString());
    }//GEN-LAST:event_jTableMenusMouseClicked

    private void jTableProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProveedoresMouseClicked
        // TODO add your handling code here:
        int seleccion = jTableProveedores.getSelectedRow();
        id_proveedor = jTableProveedores.getValueAt(seleccion, 0).toString();
        txtProveedor.setText(jTableProveedores.getValueAt(seleccion, 1).toString());
        txtNombreProducto.setText(jTableProveedores.getValueAt(seleccion, 2).toString());
        txtNombreContacto.setText(jTableProveedores.getValueAt(seleccion, 3).toString());
        txtDescripcionProveedores.setText(jTableProveedores.getValueAt(seleccion, 4).toString());
        txtDireccion.setText(jTableProveedores.getValueAt(seleccion, 5).toString());
        txtTelefono.setText(jTableProveedores.getValueAt(seleccion, 6).toString());
        txtTelefonoContacto.setText(jTableProveedores.getValueAt(seleccion, 7).toString());
        cbxTproveedor.setSelectedItem(jTableProveedores.getValueAt(seleccion, 8).toString());
    }//GEN-LAST:event_jTableProveedoresMouseClicked

    private void btnGuardarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRActionPerformed
        // TODO add your handling code here:
        startDate = FechaInicio.getDate();
        endDate = FechaFinal.getDate();
        try {
            if (esCampoVacio(txtClienteR.getText(),"Huesped") && validarFecha(FechaInicio) && validarFecha(FechaFinal) && cbxBungalows.getSelectedIndex() != -1 && validacionFechas(ReservasProvider.Fechas_ocupadas, fechasingresadas)) {
                String nuevoID = generarNuevoID("R-", ReservasProvider.list);
                ReservasProvider.list.add(nuevoID);
                Map<String, Object> datos = new HashMap<>();
                String string = cbxBungalows.getSelectedItem().toString();
                String[] parts = string.split(",");
                String string1 = parts[0];
                String[] parts1 = string1.split(":");
                String codigo = parts1[1];
                String ttt = total.getText();
                String[] parttt = ttt.split("\\$");
                String totalt = parttt[1];
                datos.put("nombre_Cliente", txtClienteR.getText());
                datos.put("menu", lista(Listapedido));
                datos.put("utileria", lista(ListaUtileria));
                datos.put("Disponibilidad", "Ocupado");
                datos.put("fechainicio", startDate.toString());
                datos.put("fechafinal", endDate.toString());
                datos.put("Bungalow", string);
                datos.put("Total", totalt);
                ReservasProvider.guardarReservas("reservas", nuevoID, datos);
                Map<String, Object> datosB = new HashMap<>();
                datosB.put("Disponibilidad", "Ocupado");
                BungalowsProvider.actualizarBungalows("bungalows", codigo.trim(), datosB);
                JOptionPane.showMessageDialog(null, "Guardado con Exito");
                ClearForm();
            }
        } catch (HeadlessException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al guardar");
        } finally {
            ReservasProvider.cargarTabla(jTableReservas);
            BungalowsProvider.cargarComboBox(cbxBungalows, fechasingresadas);
            Total(cbxBungalows.getSelectedItem().toString(), Listapedido, ListaUtileria);
        }
    }//GEN-LAST:event_btnGuardarRActionPerformed

    private void ListaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaUsuariosMouseClicked
        // TODO add your handling code here:
        String selectedValue = ListaUsuarios.getSelectedValue();
        if (selectedValue != null) {
            // Haz algo con el valor seleccionado
            txtClienteR.setText(selectedValue);
        }
    }//GEN-LAST:event_ListaUsuariosMouseClicked

    private void txtFiltroRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroRKeyTyped
        // TODO add your handling code here:
        String filter = txtFiltroR.getText().toLowerCase();
        DefaultListModel<String> model = (DefaultListModel<String>) ListaUsuarios.getModel();
        DefaultListModel<String> filteredModel = new DefaultListModel<>();
        for (int i = 0; i < model.size(); i++) {
            String item = model.get(i);
            if (item.toLowerCase().contains(filter)) {
                filteredModel.addElement(item);
            }
        }
        ListaUsuarios.setModel(filteredModel);
    }//GEN-LAST:event_txtFiltroRKeyTyped

    private void ListaMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaMenuMouseClicked
        // TODO add your handling code here:
        TotalM = 0;
        TotalU = 0;
        String selectedValue = ListaMenu.getSelectedValue();
        modelMenu.clear();
        if (selectedValue != null) {
            // Haz algo con el valor seleccionado
            listaMenu.add(selectedValue);
            listaMenuNR.add(selectedValue);
        }
        listaMenuNR.forEach(element -> {
            // Elemento que deseas contar
            String elementoABuscar = element;

            // Inicializar un contador
            int contador = 0;

            // Recorrer el ArrayList y contar las repeticiones del elemento
            contador = listaMenu.stream().filter(elemento -> (elemento.equals(elementoABuscar))).map(_item -> 1).reduce(contador, Integer::sum);
            modelMenu.addElement(element + " - Cantidad: " + contador);
        });
        Listapedido.setModel(modelMenu);
        total.setText(Total(cbxBungalows.getSelectedItem().toString(), Listapedido, ListaUtileria));
    }//GEN-LAST:event_ListaMenuMouseClicked

    private void txtFiltroMRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroMRKeyTyped
        // TODO add your handling code here:
        String filter = txtFiltroMR.getText().toLowerCase();
        DefaultListModel<String> model = (DefaultListModel<String>) ListaMenu.getModel();
        DefaultListModel<String> filteredModel = new DefaultListModel<>();
        for (int i = 0; i < model.size(); i++) {
            String item = model.get(i);
            if (item.toLowerCase().contains(filter)) {
                filteredModel.addElement(item);
            }
        }
        ListaMenu.setModel(filteredModel);
        total.setText(Total(cbxBungalows.getSelectedItem().toString(), Listapedido, ListaUtileria));
    }//GEN-LAST:event_txtFiltroMRKeyTyped

    private void ListaMobiliarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaMobiliarioMouseClicked
        // TODO add your handling code here:
        TotalM = 0;
        TotalU = 0;
        String selectedValue = ListaMobiliario.getSelectedValue();
        modelMobiliario.clear();
        if (selectedValue != null) {
            // Haz algo con el valor seleccionado
            listaMobiliario.add(selectedValue);
            listaMobiliarioNR.add(selectedValue);
        }
        listaMobiliarioNR.forEach(element -> {
            // Elemento que deseas contar
            String elementoABuscar = element;

            // Inicializar un contador
            int contador = 0;

            // Recorrer el ArrayList y contar las repeticiones del elemento
            contador = listaMobiliario.stream().filter(elemento -> (elemento.equals(elementoABuscar))).map(_item -> 1).reduce(contador, Integer::sum);
            modelMobiliario.addElement(element + " - Cantidad: " + contador);
        });
        ListaUtileria.setModel(modelMobiliario);
        total.setText(Total(cbxBungalows.getSelectedItem().toString(), Listapedido, ListaUtileria));
    }//GEN-LAST:event_ListaMobiliarioMouseClicked

    private void txtFiltroURKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroURKeyTyped
        // TODO add your handling code here:
        String filter = txtFiltroUR.getText().toLowerCase();
        DefaultListModel<String> model = (DefaultListModel<String>) ListaMobiliario.getModel();
        DefaultListModel<String> filteredModel = new DefaultListModel<>();
        for (int i = 0; i < model.size(); i++) {
            String item = model.get(i);
            if (item.toLowerCase().contains(filter)) {
                filteredModel.addElement(item);
            }
        }
        ListaMobiliario.setModel(filteredModel);
        total.setText(Total(cbxBungalows.getSelectedItem().toString(), Listapedido, ListaUtileria));
    }//GEN-LAST:event_txtFiltroURKeyTyped

    private void ListapedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListapedidoMouseClicked
        // TODO add your handling code here:
        TotalM = 0;
        TotalU = 0;

        String selectedValue = (String) Listapedido.getSelectedValue();
        DefaultListModel model = (DefaultListModel) Listapedido.getModel(); // Obtenemos el modelo del JList

        int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar este Pedido?", "Confirmación", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION && selectedValue != null) {
            // Haz algo con el valor seleccionado
            model.removeElement(selectedValue);

            // No es necesario volver a establecer el modelo en el JList
            // Listapedido.setModel(model);
            // Actualiza aquí cualquier otro cálculo necesario
            total.setText(Total(cbxBungalows.getSelectedItem().toString(), Listapedido, ListaUtileria));
        }

    }//GEN-LAST:event_ListapedidoMouseClicked

    private void ListaUtileriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaUtileriaMouseClicked
        // TODO add your handling code here:
        TotalM = 0;
        TotalU = 0;

// Asumiendo que ListaUtileria es un objeto JList
        String selectedValue = (String) ListaUtileria.getSelectedValue();
        DefaultListModel model = (DefaultListModel) ListaUtileria.getModel(); // Obtenemos el modelo del JList

        int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar este Pedido?", "Confirmación", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION && selectedValue != null) {
            // Haz algo con el valor seleccionado
            model.removeElement(selectedValue);

            // No es necesario volver a establecer el modelo en el JList
            // ListaUtileria.setModel(model);
            // Actualiza aquí cualquier otro cálculo necesario
            total.setText(Total(cbxBungalows.getSelectedItem().toString(), Listapedido, ListaUtileria));
        }

    }//GEN-LAST:event_ListaUtileriaMouseClicked

    private void btnActualizarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarRActionPerformed
        // TODO add your handling code here:
        try {
            if (esCampoVacio(txtClienteR.getText(),"Huesped") && validarFecha(FechaInicio) && validarFecha(FechaFinal) && cbxBungalows.getSelectedIndex() != -1 && validacionFechas(ReservasProvider.Fechas_ocupadas, fechasingresadas)) {
                Map<String, Object> datos = new HashMap<>();
                String string = cbxBungalows.getSelectedItem().toString();
                String ttt = total.getText();
                String[] parts = string.split(",");
                String string1 = parts[0];
                String[] parts1 = string1.split(":");
                String codigo = parts1[1];
                String[] parttt = ttt.split("$");
                String totalt = parttt[1];
                datos.put("nombre_Cliente", txtClienteR.getText());
                datos.put("menu", lista(Listapedido));
                datos.put("utileria", lista(ListaUtileria));
                datos.put("Disponibilidad", "Ocupado");
                datos.put("fechainicio", startDate.toString());
                datos.put("fechafinal", endDate.toString());
                datos.put("Bungalow", string);
                datos.put("Total", totalt);
                Map<String, Object> datosB = new HashMap<>();
                datosB.put("Disponibilidad", "Ocupado");
                BungalowsProvider.actualizarBungalows("bungalows", codigo.trim(), datosB);
                ReservasProvider.actualizarReservas("reservas", id_reserva, datos);
                JOptionPane.showMessageDialog(null, "Guardado con Exito");
                ClearForm();
            }
        } catch (HeadlessException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al guardar");
        } finally {
            ReservasProvider.cargarTabla(jTableReservas);
            BungalowsProvider.cargarComboBox(cbxBungalows, fechasingresadas);
            total.setText(Total(cbxBungalows.getSelectedItem().toString(), Listapedido, ListaUtileria));
        }
    }//GEN-LAST:event_btnActualizarRActionPerformed

    private void jTableReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableReservasMouseClicked
        // TODO add your handling code here:
        try {
            TotalM = 0;
            TotalU = 0;
            int selection = jTableReservas.getSelectedRow();
            id_reserva = jTableReservas.getValueAt(selection, 0).toString();
            txtClienteR.setText(jTableReservas.getValueAt(selection, 1).toString());
            ReservasProvider.cargarListaM(Listapedido);
            ReservasProvider.cargarListaU(ListaUtileria);
            String codigo = jTableReservas.getValueAt(selection, 7).toString();
            String[] parts = codigo.split(",");
            String string1 = parts[0];
            String[] parts1 = string1.split(":");
            codigoBungalows = parts1[1].trim();
            SimpleDateFormat sdfOriginal = new SimpleDateFormat("dd/MM/yyyy");
            FechaInicio.setDate(sdfOriginal.parse(jTableReservas.getValueAt(selection, 5).toString()));
            FechaFinal.setDate(sdfOriginal.parse(jTableReservas.getValueAt(selection, 6).toString()));
            start = sdfOriginal.parse(jTableReservas.getValueAt(selection, 5).toString());
            end = sdfOriginal.parse(jTableReservas.getValueAt(selection, 6).toString());
            try {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(start);

                while (!calendar.getTime().after(end)) {
                    Date currentDate = calendar.getTime();
                    String fechaDeseada = sdfOriginal.format(currentDate);
                    fechasSeleccionadas.add(fechaDeseada + " , " + codigoBungalows); // Agregar la fecha en el formato deseado
                    calendar.add(Calendar.DATE, 1);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            cbxBungalows.setSelectedItem(jTableReservas.getValueAt(selection, 7).toString());
            total.setText("Total: $" + jTableReservas.getValueAt(selection, 8).toString());
        } catch (ParseException ex) {
            Logger.getLogger(ReservasProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTableReservasMouseClicked

    private void btnEliminarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRActionPerformed
        // TODO add your handling code here:
        try {
            if (!id_reserva.isEmpty()) {
                Map<String, Object> datosB = new HashMap<>();
                datosB.put("Disponibilidad", "Libre");
                BungalowsProvider.actualizarBungalows("bungalows", codigoBungalows, datosB);
                ReservasProvider.eliminarReservas("reservas", id_reserva);
                JOptionPane.showMessageDialog(null, "Eliminado con Exito");
            }
        } catch (HeadlessException e) {
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al eliminar");
        } finally {
            ClearForm();
            ReservasProvider.cargarTabla(jTableReservas);
            BungalowsProvider.cargarComboBox(cbxBungalows, fechasingresadas);
            total.setText(Total(cbxBungalows.getSelectedItem().toString(), Listapedido, ListaUtileria));
        }
    }//GEN-LAST:event_btnEliminarRActionPerformed

    private void cbxBungalowsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxBungalowsMouseClicked
        // TODO add your handling code here:
        fechasingresadas.clear();
        if (validarFechaM(FechaInicio, FechaFinal)) {
            startDate = FechaInicio.getDate();
            endDate = FechaFinal.getDate();
            fechas(startDate, endDate);
            if (!fechasingresadas.isEmpty()) {
                BungalowsProvider.cargarComboBox(cbxBungalows, fechasingresadas);
                total.setText(Total(cbxBungalows.getSelectedItem().toString(), Listapedido, ListaUtileria));
            }
        }
    }//GEN-LAST:event_cbxBungalowsMouseClicked

    private void cbxBungalowsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxBungalowsItemStateChanged
        // TODO add your handling code here:
        total.setText(Total(cbxBungalows.getSelectedItem().toString(), Listapedido, ListaUtileria));
    }//GEN-LAST:event_cbxBungalowsItemStateChanged

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_menu_admin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UI_menu_admin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Documentacion_btn;
    private com.toedter.calendar.JDateChooser FechaFinal;
    private com.toedter.calendar.JDateChooser FechaInicio;
    private javax.swing.JList<String> ListaMenu;
    private javax.swing.JList<String> ListaMobiliario;
    private javax.swing.JList<String> ListaUsuarios;
    private javax.swing.JList<String> ListaUtileria;
    private javax.swing.JList<String> Listapedido;
    private javax.swing.JLabel Menu_btn;
    private javax.swing.JLabel Proveedores_btn;
    private javax.swing.JLabel Reservas_btn;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnActualizarB;
    private javax.swing.JButton btnActualizarM;
    private javax.swing.JButton btnActualizarMenu;
    private javax.swing.JButton btnActualizarR;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarB;
    private javax.swing.JButton btnEliminarM;
    private javax.swing.JButton btnEliminarMenu;
    private javax.swing.JButton btnEliminarR;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarB;
    private javax.swing.JButton btnGuardarM;
    private javax.swing.JButton btnGuardarMenu;
    private javax.swing.JButton btnGuardarR;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btn_ActualizarUsuario;
    private javax.swing.JButton btn_ActualizarUsuarioE;
    private javax.swing.JButton btn_AgregarUsuario;
    private javax.swing.JButton btn_AgregarUsuarioE;
    private javax.swing.JPanel btn_Bungalows;
    private javax.swing.JLabel btn_CerrarSesion;
    private javax.swing.JPanel btn_Cliente;
    private javax.swing.JPanel btn_Documentacion;
    private javax.swing.JButton btn_EliminarUsuario;
    private javax.swing.JButton btn_EliminarUsuarioE;
    private javax.swing.JPanel btn_Inicio;
    private javax.swing.JPanel btn_Menu;
    private javax.swing.JPanel btn_Proveedores;
    private javax.swing.JPanel btn_Reservas;
    private javax.swing.JPanel btn_empleados;
    private javax.swing.JPanel btn_facebook;
    private javax.swing.JPanel btn_maps;
    private javax.swing.JPanel btn_mobiliarios;
    private javax.swing.JPanel btn_whatsapp;
    private javax.swing.JLabel bungalows_btn;
    private javax.swing.JComboBox<String> cbxBungalows;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JComboBox<String> cbxCodigoP;
    private javax.swing.JComboBox<String> cbxDisponibilidadB;
    private javax.swing.JComboBox<String> cbxProveedores;
    private javax.swing.JComboBox<String> cbxTproveedor;
    private javax.swing.JLabel cliente_btn;
    private javax.swing.JLabel empleados_btn;
    private javax.swing.JLabel facebook_btn;
    private javax.swing.JLabel inicio_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBungalows;
    private javax.swing.JPanel jPanelCerrarSesion;
    private javax.swing.JPanel jPanelClientes;
    private javax.swing.JPanel jPanelContenido;
    private javax.swing.JPanel jPanelDocumentacion;
    private javax.swing.JPanel jPanelEmpleados;
    private javax.swing.JPanel jPanelInicio;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelProveedores;
    private javax.swing.JPanel jPanelReservas;
    private javax.swing.JPanel jPanelUtilitarios;
    private javax.swing.JPanel jPanel_Menus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableBugalows;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTable jTableEmpleados;
    private javax.swing.JTable jTableMenus;
    private javax.swing.JTable jTableMobiliarios;
    private javax.swing.JTable jTableProveedores;
    private javax.swing.JTable jTableReservas;
    private javax.swing.JLabel maps_btn;
    private javax.swing.JLabel mobiliarios_btn;
    private javax.swing.JLabel total;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCantidadD;
    private javax.swing.JTextField txtCantidadM;
    private javax.swing.JTextField txtClienteR;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextArea txtDescripcionMenu;
    private javax.swing.JTextField txtDescripcionProveedores;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFiltroMR;
    private javax.swing.JTextField txtFiltroR;
    private javax.swing.JTextField txtFiltroUR;
    private javax.swing.JTextField txtHabitaciones;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreContacto;
    private javax.swing.JTextField txtNombreMenu;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecioH;
    private javax.swing.JTextField txtPrecioMenu;
    private javax.swing.JTextField txtProveedor;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoContacto;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_apellidosE;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_buscarE;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_correoE;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_direccionE;
    private javax.swing.JTextField txt_dui;
    private javax.swing.JTextField txt_duiE;
    private com.toedter.calendar.JDateChooser txt_fechaCumpleados;
    private com.toedter.calendar.JDateChooser txt_fechaCumpleadosE;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_nombreE;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JPasswordField txt_passwordE;
    private javax.swing.JTextField txt_puestoE;
    private javax.swing.JTextField txt_salarioE;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_telefonoE;
    private javax.swing.JLabel whatsapp_btn;
    // End of variables declaration//GEN-END:variables

    public static boolean esNumero(String dato) {
        if (dato.matches("-?\\d+(\\.\\d+)?") == false) {
            JOptionPane.showMessageDialog(null, "El dato:" + dato + " no es un numero");
        }
        return dato.matches("-?\\d+(\\.\\d+)?"); // Verifica si el dato tiene el formato de un número
    }

    public static boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$"; // Expresión regular para validar una dirección de correo electrónico
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches() == false) {
            JOptionPane.showMessageDialog(null, "El correo:" + email + " no es valido. el formato es nombre@ejemplo.com");
        }
        return matcher.matches();
    }

    public static boolean validarNumeroTelefono(String numeroTelefono) {
        // Define una expresión regular para validar números de teléfono.
        // Aquí se muestra un ejemplo para números de teléfono en formato XXX-XXX-XXXX.
        String regex = "\\d{4}-\\d{4}";

        // Crea un objeto Pattern con la expresión regular.
        Pattern pattern = Pattern.compile(regex);

        // Crea un objeto Matcher para hacer coincidir la cadena con el patrón.
        Matcher matcher = pattern.matcher(numeroTelefono);
        if (matcher.matches() == false) {
            JOptionPane.showMessageDialog(null, "El numero de telefono:" + numeroTelefono + " no es valido. el formato es ####-####");
        }
        // Comprueba si hay coincidencia completa.
        return matcher.matches();
    }

    public static boolean isValidDUI(String dui) {
        String regex = "^\\d{8}-\\d$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dui);
        if (matcher.matches() == false) {
            JOptionPane.showMessageDialog(null, "El DUI debe tener 10 caracteres por ejemplo: ########-#");
        }
        return matcher.matches();
    }

    public static boolean validarFecha(JDateChooser fecha) {
        Date selectedDate = fecha.getDate();
        if (selectedDate != null) {
            // La fecha es válida y se ha seleccionado.
            return true;
            // Realiza las acciones necesarias aquí.
        } else {
            JOptionPane.showMessageDialog(null, "Debe selecionar una fecha");
        }
        return false;
    }

    public static boolean validarFechaM(JDateChooser fecha, JDateChooser fecha2) {
        Date fechaReferencia = fecha.getDate();
        Date selectedDate = fecha2.getDate();
        if (selectedDate != null && fechaReferencia != null) {
            if (selectedDate.after(fechaReferencia)) {
                // La fecha seleccionada es válida (posterior a la fecha de referencia)
                // La fecha es válida y se ha seleccionado.
                return true;
            } else {
                // La fecha seleccionada no es válida
                System.out.println("Fecha no válida");
            }
            // Realiza las acciones necesarias aquí.
        } else {
            JOptionPane.showMessageDialog(null, "Debe selecionar una fecha");
        }
        return false;
    }

    public static boolean validarContraseña(String contraseña) {
        // Verificar la longitud mínima de la contraseña
        if (contraseña.length() < 8) {
            JOptionPane.showMessageDialog(null, "La contraseña debe contener minimo 8 espacios");
            return false;
        }

        // Verificar si contiene al menos una letra mayúscula
        if (!contieneMayuscula(contraseña)) {
            JOptionPane.showMessageDialog(null, "La contraseña debe contener mayusculas");
            return false;
        }

        // Verificar si contiene al menos una letra minúscula
        if (!contieneMinuscula(contraseña)) {
            JOptionPane.showMessageDialog(null, "La contraseña debe contener minusculas");
            return false;
        }

        // Verificar si contiene al menos un número
        if (!contieneNumero(contraseña)) {
            JOptionPane.showMessageDialog(null, "La contraseña debe contener numeros");
            return false;
        }

        // Puedes agregar más criterios de validación según tus necesidades,
        // como verificar caracteres especiales, etc.
        return true;
    }

    private static boolean contieneMayuscula(String contraseña) {
        for (char c : contraseña.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean contieneMinuscula(String contraseña) {
        for (char c : contraseña.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean contieneNumero(String contraseña) {
        for (char c : contraseña.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    private static void fechas(Date start, Date end) {
        SimpleDateFormat sdfDeseado = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(start);

            while (!calendar.getTime().after(end)) {
                Date currentDate = calendar.getTime();
                String fechaDeseada = sdfDeseado.format(currentDate);
                fechasingresadas.add(fechaDeseada); // Agregar la fecha en el formato deseado
                calendar.add(Calendar.DATE, 1);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static String lista(JList lista) {
        // Obtener todos los elementos del JList
        List<String> elementos = new ArrayList<>();
        ListModel<String> model = lista.getModel();
        for (int i = 0; i < model.getSize(); i++) {
            elementos.add(model.getElementAt(i));
        }

        // Inicializar un String para almacenar los elementos
        StringBuilder elementosConcatenados = new StringBuilder();

        // Recorrer el ArrayList y concatenar los elementos en el String
        elementos.stream().map(elemento -> {
            elementosConcatenados.append(elemento);
            return elemento;
        }).forEachOrdered(_item -> {
            elementosConcatenados.append(", "); // Agregar una coma y un espacio como separador
        });

        // Eliminar la coma y el espacio extra al final
        if (elementosConcatenados.length() > 0) {
            elementosConcatenados.setLength(elementosConcatenados.length() - 2);
        }

        // Mostrar los elementos en un solo String
        String resultado = elementosConcatenados.toString();
        return resultado;
    }

    private static String Total(String combobox, JList menu, JList utileria) {
        Double precio = 0.0;
        if (!combobox.isEmpty()) {
            String[] parts = combobox.split(",");
            String strn1 = parts[1];
            String[] part1 = strn1.split("\\$");
            precio = Double.parseDouble(part1[1]) * fechasingresadas.size();
        }

        List<String> LMenu = new ArrayList<>();
        ListModel<String> MMenu = menu.getModel();
        for (int i = 0; i < MMenu.getSize(); i++) {
            LMenu.add(MMenu.getElementAt(i));
        }
        // Validar si el JList está vacío
        if (!LMenu.isEmpty()) {
            LMenu.forEach(element -> {
                String[] par = element.split("\\$");
                String str = par[1];
                String[] par1 = str.split("-");
                double precioM = Double.parseDouble(par1[0]);
                String str1 = par1[1];
                String[] par2 = str1.split(":");
                double cantidadM = Double.parseDouble(par2[1]);
                TotalM += precioM * cantidadM;
            });
        }

        List<String> LUtileria = new ArrayList<>();
        System.out.println(LUtileria);
        ListModel<String> MUtileria = utileria.getModel();
        for (int i = 0; i < MUtileria.getSize(); i++) {
            LUtileria.add(MUtileria.getElementAt(i));
        }
        // Validar si el JList está vacío
        if (!LUtileria.isEmpty()) {
            LUtileria.forEach(element -> {
                String[] par = element.split("\\$");
                String str = par[1];
                String[] par1 = str.split("-");
                double precioU = Double.parseDouble(par1[0]);
                String str1 = par1[1];
                String[] par2 = str1.split(":");
                double cantidadU = Double.parseDouble(par2[1]);
                TotalU += precioU * cantidadU;
            });
        }

        double total = precio + TotalM + TotalU;
        String totalFormateado = String.format("%.2f", total);
        String respuesta = "Total: $" + totalFormateado;
        return respuesta;
    }

    private static boolean validacionFechas(HashSet<String> lista1, HashSet<String> lista2) {
        // Verificar si hay elementos iguales
        for (String elemento : lista1) {
            String[] parts = elemento.split("-");
            String c = parts[0];
            if (lista2.contains(c)) {
                JOptionPane.showMessageDialog(null, "Las fecha: " + elemento + " esta ocupada.");
                return false;// Puedes salir del bucle si encuentras al menos un elemento igual.
            }
        }
        return true;
    }

    public static String generarNuevoID(String Letra, ArrayList<String> list) {
        int id = 1; // Valor inicial
        if (!list.isEmpty()) {
            String ultimoID = list.get(list.size() - 1);
            String[] partes = ultimoID.split("-");
            if (partes.length == 2) {
                try {
                    id = Integer.parseInt(partes[1]);
                    id++; // Incrementar el ID
                } catch (NumberFormatException e) {
                    // Manejar una posible excepción en caso de que el último ID no sea un número
                    e.printStackTrace();
                }
            }
        }
        return Letra + id; // Generar el nuevo ID en el formato "R-X"
    }

    public boolean esCampoVacio(String campo, String tipo) {
        
        if (campo == null || campo.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo " + tipo + " no debe estar vacio");
            return false;
        }
        return true;
    }
}

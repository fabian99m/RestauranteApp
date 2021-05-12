/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import Archivo.ArchivoBinario;
import Restaurante.ClientePreferencial;
import Restaurante.Mesa;
import Restaurante.Plato;
import Restaurante.Producto;
import Restaurante.Reserva;
import java.awt.Color;
import javax.swing.JOptionPane;
import static Ventana.Main.r;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Inicio extends javax.swing.JFrame {

    /**
     * @author Fabian Montes
     */
    public Inicio() {
        setIconImage(new ImageIcon(getClass().getResource("/Imagen/icon.png")).getImage());
        initComponents();
        // Colores de ventanas
        this.getContentPane().setBackground(Color.darkGray);
        Menu.getContentPane().setBackground(Color.darkGray);
        ClientePrefe.getContentPane().setBackground(Color.darkGray);
        Mesas.getContentPane().setBackground(Color.darkGray);
        Factura_mesas.getContentPane().setBackground(Color.darkGray);
        fecha_new.getContentPane().setBackground(Color.gray);
        hora_new.getContentPane().setBackground(Color.gray);
        Estadisti.getContentPane().setBackground(Color.darkGray);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JFrame();
        Menu_Pane = new javax.swing.JTabbedPane();
        Agregar_platos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nombrePlato = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        precioPlato = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dispo = new javax.swing.JComboBox();
        Añadir_platos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton31 = new javax.swing.JButton();
        Agregar_prod = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dispo_pro = new javax.swing.JComboBox();
        añadir_prod = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        nombrePro = new javax.swing.JTextField();
        precioPro = new javax.swing.JTextField();
        jButton32 = new javax.swing.JButton();
        Modificar_menu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        Eliminar_menu = new javax.swing.JButton();
        Modificar_nombre = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        ClientePrefe = new javax.swing.JFrame();
        ClientePrefe_Panel = new javax.swing.JTabbedPane();
        AgregarPrefe = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        nPrefe = new javax.swing.JTextPane();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tPrefe = new javax.swing.JTextPane();
        anadirPrefe = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        ModificarPrefe = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Modificar_nombre1 = new javax.swing.JButton();
        Modificar_nombre3 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        Reservas = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        hora = new javax.swing.JComboBox();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        id_reser = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        reserva_me = new javax.swing.JComboBox();
        jLabel38 = new javax.swing.JLabel();
        agregar_reser = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        fecha = new datechooser.beans.DateChooserCombo();
        jButton33 = new javax.swing.JButton();
        lista_res = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel39 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        Mesas = new javax.swing.JFrame();
        Mesa_Panel = new javax.swing.JTabbedPane();
        agregarMes = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        tamaMesa = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        Pedidos = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        listPlatos = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton14 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        mesa_sele = new javax.swing.JTextField();
        Facturas = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        factMesa = new javax.swing.JComboBox();
        jButton17 = new javax.swing.JButton();
        opPrefe = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        label_pre = new javax.swing.JLabel();
        text_ID = new javax.swing.JTextField();
        Factura_mesas = new javax.swing.JFrame();
        jLabel26 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        f_cliente = new javax.swing.JLabel();
        nom = new javax.swing.JLabel();
        tel = new javax.swing.JLabel();
        f_nombre = new javax.swing.JTextField();
        f_tel = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        subtotal = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        descuento = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        total_fac = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        f_mesa = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        f_id = new javax.swing.JTextField();
        jButton29 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        fecha_fac = new javax.swing.JTextField();
        buttonGroup2 = new javax.swing.ButtonGroup();
        fecha_new = new javax.swing.JFrame();
        fecha2 = new datechooser.beans.DateChooserCombo();
        jLabel34 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        hora_new = new javax.swing.JFrame();
        jLabel40 = new javax.swing.JLabel();
        hora2 = new javax.swing.JComboBox();
        jButton26 = new javax.swing.JButton();
        Estadisti = new javax.swing.JFrame();
        Estadisi_Panel = new javax.swing.JTabbedPane();
        estPlato = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        masVend = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        menosVend = new javax.swing.JTextField();
        jButton36 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        plato_est = new javax.swing.JComboBox();
        dinero_plato = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Boton_menu = new javax.swing.JButton();
        boton_cliente = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        boton_mesas = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        boton_estadis = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();

        Menu.setTitle("Menú");
        Menu.setMinimumSize(new java.awt.Dimension(575, 506));
        Menu.setUndecorated(true);
        Menu.setResizable(false);

        Menu_Pane.setBackground(java.awt.Color.pink);
        Menu_Pane.setMinimumSize(new java.awt.Dimension(575, 504));
        Menu_Pane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu_PaneMousePressed(evt);
            }
        });

        Agregar_platos.setBackground(java.awt.Color.darkGray);
        Agregar_platos.setForeground(new java.awt.Color(255, 255, 255));
        Agregar_platos.setMinimumSize(new java.awt.Dimension(570, 514));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");

        nombrePlato.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        nombrePlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrePlatoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio");

        precioPlato.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        precioPlato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioPlatoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Disponibilidad");

        dispo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        dispo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Disponible", "No disponible" }));
        dispo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispoActionPerformed(evt);
            }
        });

        Añadir_platos.setBackground(new java.awt.Color(51, 255, 51));
        Añadir_platos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Añadir_platos.setForeground(new java.awt.Color(0, 0, 0));
        Añadir_platos.setText("Añadir");
        Añadir_platos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Añadir_platosActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Retroceder");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 51));
        jLabel5.setText("Agregar platos al menú");

        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/img2.png"))); // NOI18N
        jButton31.setBorderPainted(false);
        jButton31.setContentAreaFilled(false);
        jButton31.setFocusPainted(false);
        jButton31.setFocusable(false);

        javax.swing.GroupLayout Agregar_platosLayout = new javax.swing.GroupLayout(Agregar_platos);
        Agregar_platos.setLayout(Agregar_platosLayout);
        Agregar_platosLayout.setHorizontalGroup(
            Agregar_platosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Agregar_platosLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(Agregar_platosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton31)
                    .addGroup(Agregar_platosLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(Agregar_platosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(Agregar_platosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Agregar_platosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(precioPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dispo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombrePlato, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Agregar_platosLayout.createSequentialGroup()
                        .addComponent(Añadir_platos, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)))
                .addGap(75, 75, 75))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Agregar_platosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Agregar_platosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Agregar_platosLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Agregar_platosLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(194, 194, 194))))
        );
        Agregar_platosLayout.setVerticalGroup(
            Agregar_platosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Agregar_platosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addGap(38, 38, 38)
                .addGroup(Agregar_platosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombrePlato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(Agregar_platosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(precioPlato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(Agregar_platosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Agregar_platosLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jButton31))
                    .addGroup(Agregar_platosLayout.createSequentialGroup()
                        .addGroup(Agregar_platosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dispo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(51, 51, 51)
                        .addComponent(Añadir_platos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        Menu_Pane.addTab("Agregar Platos", Agregar_platos);

        Agregar_prod.setBackground(java.awt.Color.darkGray);
        Agregar_prod.setMinimumSize(new java.awt.Dimension(570, 514));

        jLabel7.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 255, 51));
        jLabel7.setText("Agregar productos al menú");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre ");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Precio");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Disponibilidad");

        dispo_pro.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        dispo_pro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Disponible", "No disponible" }));

        añadir_prod.setBackground(new java.awt.Color(51, 255, 51));
        añadir_prod.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        añadir_prod.setForeground(new java.awt.Color(0, 0, 0));
        añadir_prod.setText("Añadir");
        añadir_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadir_prodActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 0, 51));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Retroceder");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        nombrePro.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        nombrePro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreProActionPerformed(evt);
            }
        });

        precioPro.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        precioPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioProKeyTyped(evt);
            }
        });

        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/img3.png"))); // NOI18N
        jButton32.setBorderPainted(false);
        jButton32.setContentAreaFilled(false);
        jButton32.setFocusPainted(false);
        jButton32.setFocusable(false);
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Agregar_prodLayout = new javax.swing.GroupLayout(Agregar_prod);
        Agregar_prod.setLayout(Agregar_prodLayout);
        Agregar_prodLayout.setHorizontalGroup(
            Agregar_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Agregar_prodLayout.createSequentialGroup()
                .addGroup(Agregar_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Agregar_prodLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(Agregar_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)))
                    .addGroup(Agregar_prodLayout.createSequentialGroup()
                        .addGroup(Agregar_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Agregar_prodLayout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jLabel9))
                            .addGroup(Agregar_prodLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jButton32)))
                        .addGap(42, 42, 42)
                        .addGroup(Agregar_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombrePro, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Agregar_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(añadir_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(precioPro, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dispo_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Agregar_prodLayout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addGroup(Agregar_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Agregar_prodLayout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(206, 206, 206))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Agregar_prodLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(129, 129, 129))))
        );
        Agregar_prodLayout.setVerticalGroup(
            Agregar_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Agregar_prodLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addGap(46, 46, 46)
                .addGroup(Agregar_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombrePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(37, 37, 37)
                .addGroup(Agregar_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(37, 37, 37)
                .addGroup(Agregar_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(dispo_pro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(Agregar_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(añadir_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32))
                .addGap(6, 6, 6)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        Menu_Pane.addTab("Agregar Productos", Agregar_prod);

        Modificar_menu.setBackground(java.awt.Color.darkGray);
        Modificar_menu.setMinimumSize(new java.awt.Dimension(570, 514));

        jTable1.setBackground(new java.awt.Color(0, 255, 204));
        jTable1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Precio", "Disponibilidad", "Tipo", "ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionBackground(new java.awt.Color(255, 102, 255));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Retroceder");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Eliminar_menu.setBackground(java.awt.Color.darkGray);
        Eliminar_menu.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Eliminar_menu.setForeground(new java.awt.Color(0, 255, 153));
        Eliminar_menu.setText("Eliminar");
        Eliminar_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar_menuActionPerformed(evt);
            }
        });

        Modificar_nombre.setBackground(java.awt.Color.darkGray);
        Modificar_nombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Modificar_nombre.setForeground(new java.awt.Color(0, 255, 153));
        Modificar_nombre.setText("Modificar nombre");
        Modificar_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modificar_nombreActionPerformed(evt);
            }
        });

        jButton3.setBackground(java.awt.Color.darkGray);
        jButton3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 255, 153));
        jButton3.setText("Modificar precio");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setBackground(java.awt.Color.darkGray);
        jButton6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 255, 153));
        jButton6.setText("Modificar disponibilidad");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 255, 51));
        jLabel10.setText("Menú");

        javax.swing.GroupLayout Modificar_menuLayout = new javax.swing.GroupLayout(Modificar_menu);
        Modificar_menu.setLayout(Modificar_menuLayout);
        Modificar_menuLayout.setHorizontalGroup(
            Modificar_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Modificar_menuLayout.createSequentialGroup()
                .addGroup(Modificar_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Modificar_menuLayout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel10))
                    .addGroup(Modificar_menuLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(Modificar_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Modificar_menuLayout.createSequentialGroup()
                                .addGroup(Modificar_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Modificar_nombre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(Modificar_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Eliminar_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(8, 8, 8))))
                    .addGroup(Modificar_menuLayout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        Modificar_menuLayout.setVerticalGroup(
            Modificar_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Modificar_menuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(Modificar_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Modificar_nombre)
                    .addComponent(Eliminar_menu))
                .addGap(46, 46, 46)
                .addGroup(Modificar_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        Menu_Pane.addTab("Modificar Menú", Modificar_menu);

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu.getContentPane());
        Menu.getContentPane().setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu_Pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu_Pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ClientePrefe.setTitle("Cliente preferencial");
        ClientePrefe.setMinimumSize(new java.awt.Dimension(650, 600));
        ClientePrefe.setUndecorated(true);

        ClientePrefe_Panel.setBackground(java.awt.Color.pink);
        ClientePrefe_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ClientePrefe_PanelMousePressed(evt);
            }
        });

        AgregarPrefe.setBackground(java.awt.Color.darkGray);
        AgregarPrefe.setForeground(new java.awt.Color(0, 255, 0));

        jButton5.setBackground(new java.awt.Color(255, 0, 51));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Retroceder");
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 255, 0));
        jLabel11.setText("Agregar cliente preferencial");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nombre ");

        nPrefe.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jScrollPane2.setViewportView(nPrefe);

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Teléfono");

        tPrefe.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        tPrefe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tPrefeKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(tPrefe);

        anadirPrefe.setBackground(new java.awt.Color(0, 255, 0));
        anadirPrefe.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        anadirPrefe.setForeground(new java.awt.Color(0, 0, 0));
        anadirPrefe.setText("Añadir");
        anadirPrefe.setFocusable(false);
        anadirPrefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadirPrefeActionPerformed(evt);
            }
        });

        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/img5.png"))); // NOI18N
        jButton34.setBorderPainted(false);
        jButton34.setContentAreaFilled(false);
        jButton34.setFocusPainted(false);
        jButton34.setFocusable(false);

        javax.swing.GroupLayout AgregarPrefeLayout = new javax.swing.GroupLayout(AgregarPrefe);
        AgregarPrefe.setLayout(AgregarPrefeLayout);
        AgregarPrefeLayout.setHorizontalGroup(
            AgregarPrefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarPrefeLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(AgregarPrefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AgregarPrefeLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AgregarPrefeLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(55, 55, 55)
                        .addGroup(AgregarPrefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(anadirPrefe, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(AgregarPrefeLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton34)
                .addGap(68, 68, 68)
                .addComponent(jLabel11)
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgregarPrefeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230))
        );
        AgregarPrefeLayout.setVerticalGroup(
            AgregarPrefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgregarPrefeLayout.createSequentialGroup()
                .addGroup(AgregarPrefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AgregarPrefeLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton34)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgregarPrefeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)
                        .addGap(44, 44, 44)))
                .addGroup(AgregarPrefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(37, 37, 37)
                .addGroup(AgregarPrefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(61, 61, 61)
                .addComponent(anadirPrefe, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        ClientePrefe_Panel.addTab("Agregar", AgregarPrefe);

        ModificarPrefe.setBackground(java.awt.Color.darkGray);

        jButton8.setBackground(new java.awt.Color(255, 0, 51));
        jButton8.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 0));
        jButton8.setText("Retroceder");
        jButton8.setFocusable(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 255, 0));
        jLabel12.setText("Modificar cliente preferencial");

        jTable2.setBackground(new java.awt.Color(0, 255, 204));
        jTable2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jTable2.setForeground(new java.awt.Color(0, 0, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Número", "Nombre", "Teléfono", "ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setSelectionBackground(new java.awt.Color(255, 51, 255));
        jScrollPane4.setViewportView(jTable2);

        Modificar_nombre1.setBackground(java.awt.Color.darkGray);
        Modificar_nombre1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        Modificar_nombre1.setForeground(new java.awt.Color(0, 255, 153));
        Modificar_nombre1.setText("Modificar teléfono");
        Modificar_nombre1.setFocusable(false);
        Modificar_nombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modificar_nombre1ActionPerformed(evt);
            }
        });

        Modificar_nombre3.setBackground(java.awt.Color.darkGray);
        Modificar_nombre3.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        Modificar_nombre3.setForeground(new java.awt.Color(0, 255, 153));
        Modificar_nombre3.setText("Modificar nombre");
        Modificar_nombre3.setFocusable(false);
        Modificar_nombre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modificar_nombre3ActionPerformed(evt);
            }
        });

        jButton15.setBackground(java.awt.Color.darkGray);
        jButton15.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton15.setForeground(new java.awt.Color(0, 255, 153));
        jButton15.setText("Eliminar Cliente preferencial");
        jButton15.setFocusable(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ModificarPrefeLayout = new javax.swing.GroupLayout(ModificarPrefe);
        ModificarPrefe.setLayout(ModificarPrefeLayout);
        ModificarPrefeLayout.setHorizontalGroup(
            ModificarPrefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarPrefeLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(ModificarPrefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(ModificarPrefeLayout.createSequentialGroup()
                        .addComponent(Modificar_nombre3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                        .addComponent(Modificar_nombre1)))
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarPrefeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ModificarPrefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarPrefeLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarPrefeLayout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(241, 241, 241))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarPrefeLayout.createSequentialGroup()
                        .addComponent(jButton15)
                        .addGap(197, 197, 197))))
        );
        ModificarPrefeLayout.setVerticalGroup(
            ModificarPrefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarPrefeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(ModificarPrefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Modificar_nombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modificar_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        ClientePrefe_Panel.addTab("Modificar ", ModificarPrefe);

        Reservas.setBackground(java.awt.Color.darkGray);

        jLabel23.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 15)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 255, 51));
        jLabel23.setText("Reservas de mesas");

        hora.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        hora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8 AM", "9 AM", "10 AM", "11 AM", "12 PM", "1 PM", "2 PM", "3 PM", "4 PM ", "5 PM", "6 PM" }));

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Hora ");

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Ingrese ID");

        id_reser.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        id_reser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_reserKeyTyped(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Mesa # ");

        reserva_me.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Fecha");

        agregar_reser.setBackground(new java.awt.Color(0, 255, 51));
        agregar_reser.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        agregar_reser.setForeground(new java.awt.Color(0, 0, 0));
        agregar_reser.setText("Agregar reserva");
        agregar_reser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_reserActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(255, 0, 51));
        jButton21.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton21.setForeground(new java.awt.Color(0, 0, 0));
        jButton21.setText("Retroceder");
        jButton21.setFocusable(false);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        fecha.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(222, 222, 222),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(222, 222, 222),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(222, 222, 222),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(222, 222, 222),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    fecha.setNothingAllowed(false);
    fecha.setMinDate(fecha.getSelectedPeriodSet().getFirstDate());
    fecha.setFieldFont(new java.awt.Font("Dialog", java.awt.Font.BOLD, 13));

    jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/img4.png"))); // NOI18N
    jButton33.setBorderPainted(false);
    jButton33.setContentAreaFilled(false);
    jButton33.setFocusPainted(false);
    jButton33.setFocusable(false);

    javax.swing.GroupLayout ReservasLayout = new javax.swing.GroupLayout(Reservas);
    Reservas.setLayout(ReservasLayout);
    ReservasLayout.setHorizontalGroup(
        ReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(ReservasLayout.createSequentialGroup()
            .addGroup(ReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ReservasLayout.createSequentialGroup()
                    .addGap(174, 174, 174)
                    .addGroup(ReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel36)
                        .addComponent(jLabel38)
                        .addComponent(jLabel35))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(ReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(ReservasLayout.createSequentialGroup()
                            .addGroup(ReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(reserva_me, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(id_reser, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(68, 68, 68)
                            .addComponent(jButton33))))
                .addGroup(ReservasLayout.createSequentialGroup()
                    .addGap(210, 210, 210)
                    .addComponent(jLabel23)))
            .addContainerGap(76, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReservasLayout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(ReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReservasLayout.createSequentialGroup()
                    .addComponent(agregar_reser, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(215, 215, 215))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReservasLayout.createSequentialGroup()
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(241, 241, 241))))
    );
    ReservasLayout.setVerticalGroup(
        ReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(ReservasLayout.createSequentialGroup()
            .addGroup(ReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ReservasLayout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addComponent(jButton33))
                .addGroup(ReservasLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(jLabel23)
                    .addGap(31, 31, 31)
                    .addGroup(ReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(id_reser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel36))
                    .addGap(31, 31, 31)
                    .addGroup(ReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel37)
                        .addComponent(reserva_me, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(45, 45, 45)
            .addGroup(ReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel38)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
            .addGroup(ReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel35)
                .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(56, 56, 56)
            .addComponent(agregar_reser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(61, 61, 61)
            .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(75, 75, 75))
    );

    ClientePrefe_Panel.addTab("Reservas", Reservas);

    lista_res.setBackground(java.awt.Color.darkGray);

    jTable6.setBackground(new java.awt.Color(0, 255, 204));
    jTable6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jTable6.setForeground(new java.awt.Color(0, 0, 0));
    jTable6.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null}
        },
        new String [] {
            "Cliente preferencial", "ID", "Mesa", "Fecha", "Hora"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false, false, false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jTable6.setSelectionBackground(new java.awt.Color(255, 51, 255));
    jScrollPane8.setViewportView(jTable6);
    if (jTable6.getColumnModel().getColumnCount() > 0) {
        jTable6.getColumnModel().getColumn(1).setPreferredWidth(3);
        jTable6.getColumnModel().getColumn(2).setPreferredWidth(4);
        jTable6.getColumnModel().getColumn(4).setPreferredWidth(10);
    }

    jLabel39.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 14)); // NOI18N
    jLabel39.setForeground(new java.awt.Color(0, 255, 51));
    jLabel39.setText("Listas de reservas");

    jButton22.setBackground(new java.awt.Color(255, 0, 51));
    jButton22.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
    jButton22.setForeground(new java.awt.Color(0, 0, 0));
    jButton22.setText("Retroceder");
    jButton22.setFocusable(false);
    jButton22.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton22ActionPerformed(evt);
        }
    });

    jButton20.setBackground(java.awt.Color.darkGray);
    jButton20.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
    jButton20.setForeground(new java.awt.Color(0, 255, 153));
    jButton20.setText("Cancelar reserva");
    jButton20.setFocusable(false);
    jButton20.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton20ActionPerformed(evt);
        }
    });

    jButton23.setBackground(java.awt.Color.darkGray);
    jButton23.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
    jButton23.setForeground(new java.awt.Color(0, 255, 153));
    jButton23.setText("Modificar fecha");
    jButton23.setFocusable(false);
    jButton23.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton23ActionPerformed(evt);
        }
    });

    jButton25.setBackground(java.awt.Color.darkGray);
    jButton25.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
    jButton25.setForeground(new java.awt.Color(0, 255, 153));
    jButton25.setText("Modificar hora");
    jButton25.setFocusable(false);
    jButton25.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton25ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout lista_resLayout = new javax.swing.GroupLayout(lista_res);
    lista_res.setLayout(lista_resLayout);
    lista_resLayout.setHorizontalGroup(
        lista_resLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(lista_resLayout.createSequentialGroup()
            .addGroup(lista_resLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lista_resLayout.createSequentialGroup()
                    .addGap(221, 221, 221)
                    .addComponent(jLabel39))
                .addGroup(lista_resLayout.createSequentialGroup()
                    .addGap(264, 264, 264)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lista_resLayout.createSequentialGroup()
            .addContainerGap(56, Short.MAX_VALUE)
            .addGroup(lista_resLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lista_resLayout.createSequentialGroup()
                    .addGroup(lista_resLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(lista_resLayout.createSequentialGroup()
                            .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(23, 23, 23))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lista_resLayout.createSequentialGroup()
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(205, 205, 205))))
    );
    lista_resLayout.setVerticalGroup(
        lista_resLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(lista_resLayout.createSequentialGroup()
            .addGap(27, 27, 27)
            .addComponent(jLabel39)
            .addGap(32, 32, 32)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(38, 38, 38)
            .addGroup(lista_resLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(31, 31, 31)
            .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(74, 74, 74)
            .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(92, Short.MAX_VALUE))
    );

    ClientePrefe_Panel.addTab("Lista de reservas", lista_res);

    javax.swing.GroupLayout ClientePrefeLayout = new javax.swing.GroupLayout(ClientePrefe.getContentPane());
    ClientePrefe.getContentPane().setLayout(ClientePrefeLayout);
    ClientePrefeLayout.setHorizontalGroup(
        ClientePrefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClientePrefeLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(ClientePrefe_Panel)
            .addContainerGap())
    );
    ClientePrefeLayout.setVerticalGroup(
        ClientePrefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClientePrefeLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(ClientePrefe_Panel))
    );

    Mesas.setTitle("Mesas");
    Mesas.setMinimumSize(new java.awt.Dimension(607, 595));
    Mesas.setUndecorated(true);

    Mesa_Panel.setBackground(java.awt.Color.pink);
    Mesa_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mousePressed(java.awt.event.MouseEvent evt) {
            Mesa_PanelMousePressed(evt);
        }
    });

    agregarMes.setBackground(java.awt.Color.darkGray);

    jLabel17.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 15)); // NOI18N
    jLabel17.setForeground(new java.awt.Color(0, 255, 0));
    jLabel17.setText("Agregar mesas");

    jButton10.setBackground(new java.awt.Color(255, 0, 51));
    jButton10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jButton10.setForeground(new java.awt.Color(0, 0, 0));
    jButton10.setText("Retroceder");
    jButton10.setFocusable(false);
    jButton10.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton10ActionPerformed(evt);
        }
    });

    jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jLabel18.setForeground(new java.awt.Color(255, 255, 255));
    jLabel18.setText("Número de mesas actualmente ");

    tamaMesa.setEditable(false);
    tamaMesa.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
    tamaMesa.setText(Integer.toString(r.mesa.size())
    );
    tamaMesa.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tamaMesaActionPerformed(evt);
        }
    });

    jButton11.setBackground(new java.awt.Color(51, 255, 51));
    jButton11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jButton11.setForeground(new java.awt.Color(0, 0, 0));
    jButton11.setText("Añadir mesa");
    jButton11.setFocusable(false);
    jButton11.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton11ActionPerformed(evt);
        }
    });

    jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/img6.png"))); // NOI18N
    jButton35.setBorderPainted(false);
    jButton35.setContentAreaFilled(false);
    jButton35.setFocusPainted(false);
    jButton35.setFocusable(false);

    javax.swing.GroupLayout agregarMesLayout = new javax.swing.GroupLayout(agregarMes);
    agregarMes.setLayout(agregarMesLayout);
    agregarMesLayout.setHorizontalGroup(
        agregarMesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(agregarMesLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(agregarMesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel18)
                .addComponent(jLabel17))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tamaMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarMesLayout.createSequentialGroup()
            .addContainerGap(238, Short.MAX_VALUE)
            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(230, 230, 230))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarMesLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton35)
            .addGap(238, 238, 238))
    );
    agregarMesLayout.setVerticalGroup(
        agregarMesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(agregarMesLayout.createSequentialGroup()
            .addGap(39, 39, 39)
            .addComponent(jLabel17)
            .addGap(40, 40, 40)
            .addGroup(agregarMesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel18)
                .addComponent(tamaMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(68, 68, 68)
            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(106, 106, 106)
            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(52, 52, 52)
            .addComponent(jButton35)
            .addContainerGap(68, Short.MAX_VALUE))
    );

    Mesa_Panel.addTab("Agregar ", agregarMes);

    Pedidos.setBackground(java.awt.Color.darkGray);

    jLabel19.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 15)); // NOI18N
    jLabel19.setForeground(new java.awt.Color(0, 255, 0));
    jLabel19.setText("Menú de orden");

    jTable3.setBackground(new java.awt.Color(0, 255, 204));
    jTable3.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
    jTable3.setForeground(new java.awt.Color(0, 0, 0));
    jTable3.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "Nombre", "Precio", "Tipo", "ID"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false, false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jTable3.setSelectionBackground(new java.awt.Color(255, 102, 255));
    jTable3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    jScrollPane5.setViewportView(jTable3);

    jButton12.setBackground(new java.awt.Color(255, 0, 51));
    jButton12.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
    jButton12.setForeground(new java.awt.Color(0, 0, 0));
    jButton12.setText("Retroceder");
    jButton12.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton12ActionPerformed(evt);
        }
    });

    jButton13.setBackground(new java.awt.Color(51, 255, 51));
    jButton13.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
    jButton13.setForeground(new java.awt.Color(0, 0, 0));
    jButton13.setText("Añadir orden");
    jButton13.setFocusable(false);
    jButton13.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton13ActionPerformed(evt);
        }
    });

    listPlatos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    listPlatos.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            listPlatosActionPerformed(evt);
        }
    });

    jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jLabel20.setForeground(new java.awt.Color(255, 255, 255));
    jLabel20.setText("Mesa #");

    jTable4.setBackground(new java.awt.Color(102, 255, 102));
    jTable4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
    jTable4.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "Nombre", "Precio", "Cantidad", "Mesa"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false, false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jTable4.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    jScrollPane6.setViewportView(jTable4);

    jButton14.setBackground(new java.awt.Color(51, 255, 51));
    jButton14.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
    jButton14.setForeground(new java.awt.Color(0, 0, 0));
    jButton14.setText("Ver pedidos");
    jButton14.setFocusable(false);
    jButton14.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton14ActionPerformed(evt);
        }
    });

    jLabel21.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 15)); // NOI18N
    jLabel21.setForeground(new java.awt.Color(0, 255, 0));
    jLabel21.setText("Pedido de mesa #");

    mesa_sele.setEditable(false);
    mesa_sele.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

    javax.swing.GroupLayout PedidosLayout = new javax.swing.GroupLayout(Pedidos);
    Pedidos.setLayout(PedidosLayout);
    PedidosLayout.setHorizontalGroup(
        PedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(PedidosLayout.createSequentialGroup()
            .addGap(62, 62, 62)
            .addGroup(PedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PedidosLayout.createSequentialGroup()
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(listPlatos, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(32, 32, 32)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(PedidosLayout.createSequentialGroup()
                    .addGroup(PedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 66, Short.MAX_VALUE))))
        .addGroup(PedidosLayout.createSequentialGroup()
            .addGap(199, 199, 199)
            .addComponent(jLabel21)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(mesa_sele, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PedidosLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel19)
            .addGap(212, 212, 212))
        .addGroup(PedidosLayout.createSequentialGroup()
            .addGap(239, 239, 239)
            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    PedidosLayout.setVerticalGroup(
        PedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(PedidosLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel19)
            .addGap(18, 18, 18)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(PedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PedidosLayout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PedidosLayout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(PedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listPlatos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGap(18, 18, 18)
            .addGroup(PedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel21)
                .addComponent(mesa_sele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(46, 46, 46)
            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(73, Short.MAX_VALUE))
    );

    Mesa_Panel.addTab("Pedidos", Pedidos);

    Facturas.setBackground(java.awt.Color.darkGray);

    jLabel24.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 15)); // NOI18N
    jLabel24.setForeground(new java.awt.Color(51, 255, 51));
    jLabel24.setText("Facturas por mesa");

    jButton16.setBackground(new java.awt.Color(255, 0, 51));
    jButton16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jButton16.setForeground(new java.awt.Color(0, 0, 0));
    jButton16.setText("Retroceder");
    jButton16.setFocusable(false);
    jButton16.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton16ActionPerformed(evt);
        }
    });

    jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jLabel22.setForeground(new java.awt.Color(255, 255, 255));
    jLabel22.setText("      Factura de mesa #");

    factMesa.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

    jButton17.setBackground(new java.awt.Color(51, 255, 51));
    jButton17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jButton17.setForeground(new java.awt.Color(0, 0, 0));
    jButton17.setText("Generar factura");
    jButton17.setFocusable(false);
    jButton17.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton17ActionPerformed(evt);
        }
    });

    opPrefe.setBackground(java.awt.Color.darkGray);
    buttonGroup2.add(opPrefe);
    opPrefe.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    opPrefe.setForeground(new java.awt.Color(255, 255, 255));
    opPrefe.setSelected(true);
    opPrefe.setText("  Sí");
    opPrefe.setFocusable(false);
    opPrefe.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            opPrefeMouseClicked(evt);
        }
    });

    jRadioButton2.setBackground(java.awt.Color.darkGray);
    buttonGroup2.add(jRadioButton2);
    jRadioButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
    jRadioButton2.setText("No");
    jRadioButton2.setFocusable(false);
    jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jRadioButton2MouseClicked(evt);
        }
    });

    jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jLabel25.setForeground(new java.awt.Color(255, 255, 255));
    jLabel25.setText("Cliente Preferencial");

    label_pre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    label_pre.setForeground(new java.awt.Color(255, 255, 255));
    label_pre.setText("Ingrese su ID");

    text_ID.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
    text_ID.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            text_IDKeyTyped(evt);
        }
    });

    javax.swing.GroupLayout FacturasLayout = new javax.swing.GroupLayout(Facturas);
    Facturas.setLayout(FacturasLayout);
    FacturasLayout.setHorizontalGroup(
        FacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(FacturasLayout.createSequentialGroup()
            .addGroup(FacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FacturasLayout.createSequentialGroup()
                    .addGroup(FacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FacturasLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel22)
                            .addGap(11, 11, 11))
                        .addGroup(FacturasLayout.createSequentialGroup()
                            .addGap(130, 130, 130)
                            .addGroup(FacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_pre, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel25))
                            .addGap(1, 1, 1)))
                    .addGap(33, 33, 33)
                    .addGroup(FacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(text_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(FacturasLayout.createSequentialGroup()
                            .addComponent(opPrefe)
                            .addGap(26, 26, 26)
                            .addComponent(jRadioButton2))
                        .addComponent(factMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(FacturasLayout.createSequentialGroup()
                    .addGap(195, 195, 195)
                    .addComponent(jLabel24))
                .addGroup(FacturasLayout.createSequentialGroup()
                    .addGap(209, 209, 209)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(FacturasLayout.createSequentialGroup()
                    .addGap(236, 236, 236)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(161, Short.MAX_VALUE))
    );
    FacturasLayout.setVerticalGroup(
        FacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(FacturasLayout.createSequentialGroup()
            .addGap(41, 41, 41)
            .addComponent(jLabel24)
            .addGap(36, 36, 36)
            .addGroup(FacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel22)
                .addComponent(factMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(32, 32, 32)
            .addGroup(FacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(opPrefe)
                .addComponent(jRadioButton2)
                .addComponent(jLabel25))
            .addGap(30, 30, 30)
            .addGroup(FacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(text_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(label_pre))
            .addGap(45, 45, 45)
            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(74, 74, 74)
            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(142, Short.MAX_VALUE))
    );

    Mesa_Panel.addTab("Facturas", Facturas);

    javax.swing.GroupLayout MesasLayout = new javax.swing.GroupLayout(Mesas.getContentPane());
    Mesas.getContentPane().setLayout(MesasLayout);
    MesasLayout.setHorizontalGroup(
        MesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(MesasLayout.createSequentialGroup()
            .addGap(0, 0, 0)
            .addComponent(Mesa_Panel)
            .addContainerGap())
    );
    MesasLayout.setVerticalGroup(
        MesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(Mesa_Panel)
    );

    Factura_mesas.setAlwaysOnTop(true);
    Factura_mesas.setMinimumSize(new java.awt.Dimension(671, 683));
    Factura_mesas.setUndecorated(true);
    Factura_mesas.setResizable(false);

    jLabel26.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 14)); // NOI18N
    jLabel26.setForeground(new java.awt.Color(0, 255, 0));
    jLabel26.setText("Restaurante la mosca elegante");

    jButton19.setBackground(new java.awt.Color(255, 0, 0));
    jButton19.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
    jButton19.setForeground(new java.awt.Color(0, 0, 0));
    jButton19.setText("Salir");
    jButton19.setFocusable(false);
    jButton19.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton19ActionPerformed(evt);
        }
    });

    jTable5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jTable5.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "Nombre", "Precio", "Cantidad", "Subtotal"
        }
    ));
    jTable5.setShowHorizontalLines(false);
    jTable5.setShowVerticalLines(false);
    jScrollPane7.setViewportView(jTable5);

    f_cliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    f_cliente.setForeground(new java.awt.Color(255, 255, 255));
    f_cliente.setText("Cliente preferencial");

    nom.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    nom.setForeground(new java.awt.Color(255, 255, 255));
    nom.setText("Nombre");

    tel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    tel.setForeground(new java.awt.Color(255, 255, 255));
    tel.setText("Teléfono");

    f_nombre.setEditable(false);
    f_nombre.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N

    f_tel.setEditable(false);
    f_tel.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N

    jLabel27.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
    jLabel27.setForeground(new java.awt.Color(255, 255, 255));
    jLabel27.setText("Horario de atención ");

    jLabel28.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
    jLabel28.setForeground(new java.awt.Color(255, 255, 255));
    jLabel28.setText("Lunes a domingos de 8:00 AM a 6:00 PM");

    jLabel29.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 14)); // NOI18N
    jLabel29.setForeground(new java.awt.Color(0, 255, 51));
    jLabel29.setText("Compra ");

    jLabel30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jLabel30.setForeground(new java.awt.Color(0, 255, 51));
    jLabel30.setText("Subtotal");

    subtotal.setEditable(false);
    subtotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

    jLabel31.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jLabel31.setForeground(new java.awt.Color(255, 51, 51));
    jLabel31.setText("- Descuento");

    descuento.setEditable(false);
    descuento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    descuento.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            descuentoActionPerformed(evt);
        }
    });

    jLabel32.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jLabel32.setForeground(new java.awt.Color(0, 255, 51));
    jLabel32.setText("Total compra ");

    total_fac.setEditable(false);
    total_fac.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

    jLabel33.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jLabel33.setForeground(new java.awt.Color(255, 255, 255));
    jLabel33.setText("Mesa # ");

    f_mesa.setEditable(false);
    f_mesa.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

    id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    id.setForeground(new java.awt.Color(255, 255, 255));
    id.setText("ID");

    f_id.setEditable(false);
    f_id.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

    jButton29.setBackground(java.awt.Color.darkGray);
    jButton29.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jButton29.setForeground(new java.awt.Color(0, 255, 0));
    jButton29.setText("Pagar Factura");
    jButton29.setFocusable(false);
    jButton29.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton29ActionPerformed(evt);
        }
    });

    jLabel43.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jLabel43.setForeground(new java.awt.Color(0, 255, 51));
    jLabel43.setText("Fecha");

    fecha_fac.setEditable(false);
    fecha_fac.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

    javax.swing.GroupLayout Factura_mesasLayout = new javax.swing.GroupLayout(Factura_mesas.getContentPane());
    Factura_mesas.getContentPane().setLayout(Factura_mesasLayout);
    Factura_mesasLayout.setHorizontalGroup(
        Factura_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(Factura_mesasLayout.createSequentialGroup()
            .addGap(122, 122, 122)
            .addComponent(f_cliente)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel27)
            .addGap(127, 127, 127))
        .addGroup(Factura_mesasLayout.createSequentialGroup()
            .addGroup(Factura_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(Factura_mesasLayout.createSequentialGroup()
                    .addGroup(Factura_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tel)
                        .addComponent(id)
                        .addComponent(nom))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(Factura_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Factura_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(f_tel, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(f_id))
                        .addComponent(f_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(91, 91, 91)
                    .addGroup(Factura_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Factura_mesasLayout.createSequentialGroup()
                            .addComponent(jLabel33)
                            .addGap(4, 4, 4)
                            .addComponent(f_mesa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel28)))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Factura_mesasLayout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addGroup(Factura_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Factura_mesasLayout.createSequentialGroup()
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 15, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Factura_mesasLayout.createSequentialGroup()
                            .addGroup(Factura_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(Factura_mesasLayout.createSequentialGroup()
                                    .addGroup(Factura_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(Factura_mesasLayout.createSequentialGroup()
                                            .addComponent(jLabel32)
                                            .addGap(20, 20, 20)
                                            .addComponent(total_fac, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(Factura_mesasLayout.createSequentialGroup()
                                            .addComponent(jLabel30)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(Factura_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Factura_mesasLayout.createSequentialGroup()
                                            .addComponent(jLabel43)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Factura_mesasLayout.createSequentialGroup()
                                            .addComponent(jLabel31)
                                            .addGap(9, 9, 9))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Factura_mesasLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(82, 82, 82)))
                            .addGroup(Factura_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(Factura_mesasLayout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addGroup(Factura_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(descuento, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fecha_fac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(15, 15, 15)))))
            .addContainerGap(48, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Factura_mesasLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Factura_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Factura_mesasLayout.createSequentialGroup()
                    .addComponent(jLabel26)
                    .addGap(169, 169, 169))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Factura_mesasLayout.createSequentialGroup()
                    .addComponent(jLabel29)
                    .addGap(286, 286, 286))))
    );
    Factura_mesasLayout.setVerticalGroup(
        Factura_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(Factura_mesasLayout.createSequentialGroup()
            .addGap(48, 48, 48)
            .addComponent(jLabel26)
            .addGroup(Factura_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Factura_mesasLayout.createSequentialGroup()
                    .addGroup(Factura_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Factura_mesasLayout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(jLabel27))
                        .addGroup(Factura_mesasLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(f_cliente)))
                    .addGroup(Factura_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Factura_mesasLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(Factura_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nom)
                                .addComponent(f_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(Factura_mesasLayout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(34, 34, 34))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Factura_mesasLayout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(Factura_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tel)
                        .addComponent(f_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
            .addGroup(Factura_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(f_mesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(id)
                .addComponent(f_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(29, 29, 29)
            .addComponent(jLabel29)
            .addGap(18, 18, 18)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(38, 38, 38)
            .addGroup(Factura_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel30)
                .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel31)
                .addComponent(descuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(44, 44, 44)
            .addGroup(Factura_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel32)
                .addComponent(total_fac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel43)
                .addComponent(fecha_fac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(Factura_mesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Factura_mesasLayout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(48, 48, 48))
                .addGroup(Factura_mesasLayout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(59, Short.MAX_VALUE))))
    );

    fecha_new.setMinimumSize(new java.awt.Dimension(288, 179));
    fecha_new.setUndecorated(true);
    fecha_new.setResizable(false);

    fecha2.setMinDate(fecha.getSelectedPeriodSet().getFirstDate());
    fecha2.setNothingAllowed(false);

    jLabel34.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
    jLabel34.setForeground(new java.awt.Color(51, 255, 0));
    jLabel34.setText("Escoja la nueva fecha");

    jButton24.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
    jButton24.setText("Guardar");
    jButton24.setFocusable(false);
    jButton24.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton24ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout fecha_newLayout = new javax.swing.GroupLayout(fecha_new.getContentPane());
    fecha_new.getContentPane().setLayout(fecha_newLayout);
    fecha_newLayout.setHorizontalGroup(
        fecha_newLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fecha_newLayout.createSequentialGroup()
            .addContainerGap(71, Short.MAX_VALUE)
            .addGroup(fecha_newLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fecha_newLayout.createSequentialGroup()
                    .addComponent(fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(62, 62, 62))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fecha_newLayout.createSequentialGroup()
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(94, 94, 94))))
        .addGroup(fecha_newLayout.createSequentialGroup()
            .addGap(83, 83, 83)
            .addComponent(jLabel34)
            .addGap(0, 0, Short.MAX_VALUE))
    );
    fecha_newLayout.setVerticalGroup(
        fecha_newLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(fecha_newLayout.createSequentialGroup()
            .addGap(22, 22, 22)
            .addComponent(jLabel34)
            .addGap(29, 29, 29)
            .addComponent(fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(42, 42, 42)
            .addComponent(jButton24)
            .addContainerGap(25, Short.MAX_VALUE))
    );

    hora_new.setMinimumSize(new java.awt.Dimension(236, 208));
    hora_new.setUndecorated(true);
    hora_new.setResizable(false);

    jLabel40.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
    jLabel40.setForeground(new java.awt.Color(0, 255, 0));
    jLabel40.setText("Escoja la nueva hora");

    hora2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
    hora2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8 AM", "9 AM", "10 AM", "11 AM", "12 PM", "1 PM", "2 PM", "3 PM", "4 PM ", "5 PM", "6 PM" }));

    jButton26.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
    jButton26.setText("Guardar");
    jButton26.setFocusable(false);
    jButton26.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton26ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout hora_newLayout = new javax.swing.GroupLayout(hora_new.getContentPane());
    hora_new.getContentPane().setLayout(hora_newLayout);
    hora_newLayout.setHorizontalGroup(
        hora_newLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(hora_newLayout.createSequentialGroup()
            .addGroup(hora_newLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(hora_newLayout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addComponent(hora2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(hora_newLayout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addComponent(jLabel40))
                .addGroup(hora_newLayout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(60, Short.MAX_VALUE))
    );
    hora_newLayout.setVerticalGroup(
        hora_newLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(hora_newLayout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(jLabel40)
            .addGap(27, 27, 27)
            .addComponent(hora2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(35, 35, 35)
            .addComponent(jButton26)
            .addContainerGap(57, Short.MAX_VALUE))
    );

    Estadisti.setMinimumSize(new java.awt.Dimension(603, 556));
    Estadisti.setUndecorated(true);
    Estadisti.setResizable(false);

    Estadisi_Panel.setBackground(java.awt.Color.pink);

    estPlato.setBackground(java.awt.Color.darkGray);

    jLabel45.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 16)); // NOI18N
    jLabel45.setForeground(new java.awt.Color(0, 255, 0));
    jLabel45.setText("Estadísticas de platos");

    jLabel46.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jLabel46.setForeground(new java.awt.Color(255, 255, 255));
    jLabel46.setText("Plato mas vendido ");

    masVend.setEditable(false);
    masVend.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    masVend.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            masVendActionPerformed(evt);
        }
    });

    jLabel47.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jLabel47.setForeground(new java.awt.Color(255, 255, 255));
    jLabel47.setText("Plato menos vendido");

    menosVend.setEditable(false);
    menosVend.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    menosVend.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            menosVendActionPerformed(evt);
        }
    });

    jButton36.setBackground(new java.awt.Color(255, 0, 51));
    jButton36.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jButton36.setForeground(new java.awt.Color(0, 0, 0));
    jButton36.setText("Retroceder");
    jButton36.setFocusable(false);
    jButton36.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton36ActionPerformed(evt);
        }
    });

    jLabel41.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jLabel41.setForeground(new java.awt.Color(255, 255, 255));
    jLabel41.setText("Dinero de ventas por plato");

    plato_est.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
    plato_est.setMaximumRowCount(100);

    dinero_plato.setEditable(false);
    dinero_plato.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

    javax.swing.GroupLayout estPlatoLayout = new javax.swing.GroupLayout(estPlato);
    estPlato.setLayout(estPlatoLayout);
    estPlatoLayout.setHorizontalGroup(
        estPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(estPlatoLayout.createSequentialGroup()
            .addGap(177, 177, 177)
            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(estPlatoLayout.createSequentialGroup()
            .addGap(90, 90, 90)
            .addGroup(estPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel47)
                .addComponent(jLabel46)
                .addComponent(jLabel41))
            .addGap(28, 28, 28)
            .addGroup(estPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(menosVend)
                .addComponent(plato_est, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(estPlatoLayout.createSequentialGroup()
                    .addComponent(masVend, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addComponent(dinero_plato))
            .addGap(360, 360, 360))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, estPlatoLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(324, 324, 324))
    );
    estPlatoLayout.setVerticalGroup(
        estPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(estPlatoLayout.createSequentialGroup()
            .addGap(29, 29, 29)
            .addComponent(jLabel45)
            .addGap(48, 48, 48)
            .addGroup(estPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel46)
                .addComponent(masVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(37, 37, 37)
            .addGroup(estPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel47)
                .addComponent(menosVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(39, 39, 39)
            .addGroup(estPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel41)
                .addComponent(plato_est, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(40, 40, 40)
            .addComponent(dinero_plato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
            .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(52, 52, 52))
    );

    Estadisi_Panel.addTab("Platos", estPlato);

    jPanel2.setBackground(java.awt.Color.darkGray);

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 598, Short.MAX_VALUE)
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 549, Short.MAX_VALUE)
    );

    Estadisi_Panel.addTab("Productos", jPanel2);

    jPanel3.setBackground(java.awt.Color.darkGray);

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 598, Short.MAX_VALUE)
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 549, Short.MAX_VALUE)
    );

    Estadisi_Panel.addTab("Mesas", jPanel3);

    javax.swing.GroupLayout EstadistiLayout = new javax.swing.GroupLayout(Estadisti.getContentPane());
    Estadisti.getContentPane().setLayout(EstadistiLayout);
    EstadistiLayout.setHorizontalGroup(
        EstadistiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(EstadistiLayout.createSequentialGroup()
            .addComponent(Estadisi_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );
    EstadistiLayout.setVerticalGroup(
        EstadistiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(Estadisi_Panel)
    );

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Restaurante");
    setUndecorated(true);
    setResizable(false);

    jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 16)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(0, 255, 0));
    jLabel1.setText("RESTAURANTE LA MOSCA ELEGANTE");

    Boton_menu.setBackground(java.awt.Color.darkGray);
    Boton_menu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    Boton_menu.setForeground(new java.awt.Color(0, 255, 153));
    Boton_menu.setText("Menú");
    Boton_menu.setFocusable(false);
    Boton_menu.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Boton_menuActionPerformed(evt);
        }
    });

    boton_cliente.setBackground(java.awt.Color.darkGray);
    boton_cliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    boton_cliente.setForeground(new java.awt.Color(0, 255, 102));
    boton_cliente.setText("Cliente Preferencial");
    boton_cliente.setFocusable(false);
    boton_cliente.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            boton_clienteActionPerformed(evt);
        }
    });

    jLabel15.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
    jLabel15.setForeground(new java.awt.Color(0, 255, 0));
    jLabel15.setText("Autor : Fabián Montes");

    jLabel16.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
    jLabel16.setForeground(new java.awt.Color(0, 255, 0));
    jLabel16.setText("0221710008");

    boton_mesas.setBackground(java.awt.Color.darkGray);
    boton_mesas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    boton_mesas.setForeground(new java.awt.Color(0, 255, 153));
    boton_mesas.setText("Mesas");
    boton_mesas.setFocusable(false);
    boton_mesas.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            boton_mesasActionPerformed(evt);
        }
    });

    jButton18.setBackground(java.awt.Color.red);
    jButton18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jButton18.setForeground(new java.awt.Color(0, 255, 153));
    jButton18.setText("Salir");
    jButton18.setFocusable(false);
    jButton18.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton18ActionPerformed(evt);
        }
    });

    boton_estadis.setBackground(java.awt.Color.darkGray);
    boton_estadis.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    boton_estadis.setForeground(new java.awt.Color(0, 255, 102));
    boton_estadis.setText("Estadísticas");
    boton_estadis.setFocusable(false);
    boton_estadis.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            boton_estadisActionPerformed(evt);
        }
    });

    jButton30.setBackground(java.awt.Color.darkGray);
    jButton30.setForeground(java.awt.Color.darkGray);
    jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/img1.png"))); // NOI18N
    jButton30.setBorderPainted(false);
    jButton30.setContentAreaFilled(false);
    jButton30.setFocusable(false);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(jLabel16))
                .addGroup(layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton30)
                            .addGap(33, 33, 33)
                            .addComponent(jLabel1))
                        .addComponent(jLabel15))))
            .addContainerGap(165, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(313, 313, 313))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(124, 124, 124)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(boton_mesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Boton_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(boton_cliente)
                .addComponent(boton_estadis, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(106, 106, 106))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jButton30))
                .addGroup(layout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addComponent(jLabel1)))
            .addGap(41, 41, 41)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Boton_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(boton_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(70, 70, 70)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(boton_mesas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(boton_estadis, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(60, 60, 60)
            .addComponent(jLabel15)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel16)
            .addGap(24, 24, 24))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_menuActionPerformed

        Menu.setVisible(true);
        Menu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_Boton_menuActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Menu.setVisible(false);
        Menu.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu.setVisible(false);
        Menu.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Añadir_platosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Añadir_platosActionPerformed

        Boolean e = null;
        if ("Disponible".equals(dispo.getSelectedItem().toString())) {
            e = true;
        }
        if ("No disponible".equals(dispo.getSelectedItem().toString())) {
            e = false;
        }
        if (validarNumero(precioPlato.getText()) == false) {
            JOptionPane.showMessageDialog(null, "DATO(S) INCORRECTO, INGRESE DE NUEVO");
            nombrePlato.setText(null);
            precioPlato.setText(null);
        } else {
            if (!nombrePlato.getText().isEmpty()) {

                float pre = Float.parseFloat(precioPlato.getText());
                String name = nombrePlato.getText();
                r.AñadirPlatos(name, pre, r.menu.getPlatos().size(), e); // Agregar platos al menú
                nombrePlato.setText(null);
                precioPlato.setText(null);

            } else {
                JOptionPane.showMessageDialog(null, "No se han ingresado datos.");
                nombrePlato.setText(null);
                precioPlato.setText(null);
            }
        }
    }//GEN-LAST:event_Añadir_platosActionPerformed

    private void nombrePlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrePlatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrePlatoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Menu.setVisible(false);
        Menu.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void nombreProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreProActionPerformed

    private void añadir_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadir_prodActionPerformed

        String c = dispo_pro.getSelectedItem().toString();
        Boolean e = null;
        if ("Disponible".equals(c)) {
            e = true;
        }
        if ("No disponible".equals(c)) {
            e = false;
        }
        if (validarNumero(precioPro.getText()) == false) {
            JOptionPane.showMessageDialog(null, "DATO INCORRECTO, INGRESE DE NUEVO");
            nombrePro.setText(null);
            precioPro.setText(null);
        } else {
            if (!nombrePro.getText().isEmpty() && !precioPro.getText().isEmpty()) {

                float pre = Float.parseFloat(precioPro.getText());
                String name = nombrePro.getText();
                r.AñadirProductos(name, pre, r.menu.getProducto().size(), e); // agregar productos al menú
                nombrePro.setText(null);
                precioPro.setText(null);
            } else {
                JOptionPane.showMessageDialog(null, "No se han ingresado datos.");
            }
        }
    }//GEN-LAST:event_añadir_prodActionPerformed

    private void Eliminar_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_menuActionPerformed

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int filasele = jTable1.getSelectedRow();

        if (filasele >= 0) {

            model.removeRow(filasele);
            if (filasele < r.menu.getPlatos().size()) {
                r.EliminarPlatos(filasele);
            } else if (filasele >= r.menu.getPlatos().size()) {
                r.EliminarProducto(filasele - r.menu.getPlatos().size());
            }
            limpiarTabla(jTable1);
            mostrarTabla(jTable1);
        } else {
            JOptionPane.showMessageDialog(this, "** Elemento no seleccionado!! ** ");
        }
    }//GEN-LAST:event_Eliminar_menuActionPerformed

    private void Menu_PaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_PaneMousePressed
        limpiarTabla(jTable1);
        mostrarTabla(jTable1);
    }//GEN-LAST:event_Menu_PaneMousePressed

    private void Modificar_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificar_nombreActionPerformed

        int filasele = jTable1.getSelectedRow();
        if (filasele >= 0) {

            if (filasele < r.menu.getPlatos().size()) {
                String n;
                do {
                    n = JOptionPane.showInputDialog("Ingrese el nuevo nombre del plato: ");
                    if (n == null || n.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(Menu, "Texto vacío, Ingrese un nombre!");
                    }
                } while (n == null || n.trim().isEmpty());

                r.menu.getPlatos().get(filasele).setTipo(n);
                JOptionPane.showMessageDialog(Menu, "Nombre del plato modificado con exito");

            } else if (filasele >= r.menu.getPlatos().size()) {
                String n;
                do {
                    n = JOptionPane.showInputDialog("Ingrese el nuevo nombre del producto: ");
                    if (n == null || n.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(Menu, "Texto vacío, Ingrese un nombre!");
                    }
                } while (n == null || n.trim().isEmpty());
                r.menu.getProducto().get(filasele - r.menu.getPlatos().size()).setTipo(n);
                JOptionPane.showMessageDialog(Menu, "Nombre del producto modificado con exito");
            }
            limpiarTabla(jTable1);
            mostrarTabla(jTable1);
        } else {
            JOptionPane.showMessageDialog(this, "** Elemento no seleccionado!! ** ");
        }
    }//GEN-LAST:event_Modificar_nombreActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int filasele = jTable1.getSelectedRow();
        String m;
        if (filasele >= 0) {
            do {
                m = JOptionPane.showInputDialog("Ingrese el nuevo precio: ");
            } while (validarNumero(m) == false);

            float n = Float.parseFloat(m);
            if (filasele < r.menu.getPlatos().size()) {
                r.menu.getPlatos().get(filasele).setPrecio(n);
                JOptionPane.showMessageDialog(this, "Precio del plato modificado con exito.");
            } else if (filasele >= r.menu.getPlatos().size()) {
                r.menu.getProducto().get(filasele - r.menu.getPlatos().size()).setPrecio(n);
                JOptionPane.showMessageDialog(this, "Precio del producto modificado con exito.");
            }
            limpiarTabla(jTable1);
            mostrarTabla(jTable1);
        } else {
            JOptionPane.showMessageDialog(this, "** Elemento no seleccionado!! **");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        int filasele = jTable1.getSelectedRow();
        String n;

        if (filasele >= 0) {
            do {
                n = JOptionPane.showInputDialog("Ingrese la nueva disponibilidad :\n 1.Disponible \n 2.No disponible");
            } while (!"1".equals(n) && !"2".equals(n));

            if (filasele < r.menu.getPlatos().size()) {
                if ("1".equals(n)) {
                    r.menu.getPlatos().get(filasele).setDisponibilidad(true);
                    JOptionPane.showMessageDialog(this, "Disponibilidad del plato modificada con exito.");
                }
                if ("2".equals(n)) {
                    r.menu.getPlatos().get(filasele).setDisponibilidad(false);
                    JOptionPane.showMessageDialog(this, "Disponibilidad del plato modificada con exito.");
                }
            }
            if (filasele >= r.menu.getPlatos().size()) {
                if ("1".equals(n)) {
                    r.menu.getProducto().get(filasele - r.menu.getPlatos().size()).setDisponibilidad(true);
                    JOptionPane.showMessageDialog(this, "Disponibilidad del producto modificada con exito.");
                }
                if ("2".equals(n)) {
                    r.menu.getProducto().get(filasele - r.menu.getPlatos().size()).setDisponibilidad(false);
                    JOptionPane.showMessageDialog(this, "Disponibilidad del producto modificada con exito.");
                }
            }
            limpiarTabla(jTable1);
            mostrarTabla(jTable1);
        } else {
            JOptionPane.showMessageDialog(this, "** Elemento no seleccionado!! **  ");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void boton_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_clienteActionPerformed
        ClientePrefe.setVisible(true);
        ClientePrefe.setLocationRelativeTo(null);
        this.dispose();
        limpiarTabla(jTable6);
        reserva(jTable6);
        reserva_me.removeAllItems();
        for (int i = 1; i <= r.mesa.size(); i++) {
            reserva_me.addItem(i);
        }
    }//GEN-LAST:event_boton_clienteActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ClientePrefe.setVisible(false);
        ClientePrefe.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tPrefeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tPrefeKeyTyped
        int k = (int) evt.getKeyChar();
        if (k < 48 || k > 57) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
        }
    }//GEN-LAST:event_tPrefeKeyTyped

    private void precioPlatoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioPlatoKeyTyped
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
        }
    }//GEN-LAST:event_precioPlatoKeyTyped

    private void precioProKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioProKeyTyped
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
        }
    }//GEN-LAST:event_precioProKeyTyped

    private void anadirPrefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadirPrefeActionPerformed

        if (!nPrefe.getText().isEmpty() && !tPrefe.getText().isEmpty() && !validarNumero(tPrefe.getText()) == false) {

            r.AñadirClientePrefe(nPrefe.getText(), tPrefe.getText(), r.cPrefe.size());

            nPrefe.setText(null);
            tPrefe.setText(null);
        } else {
            JOptionPane.showMessageDialog(null, "Dato no valido.");
            nPrefe.setText(null);
            tPrefe.setText(null);
        }

    }//GEN-LAST:event_anadirPrefeActionPerformed

    private void ClientePrefe_PanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientePrefe_PanelMousePressed
        limpiarTabla(jTable2);
        mostrarTablaClientesPrefe(jTable2);
    }//GEN-LAST:event_ClientePrefe_PanelMousePressed

    private void boton_mesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_mesasActionPerformed

        Mesas.setVisible(true);
        Mesas.setLocationRelativeTo(null);
        this.dispose();
        limpiarTabla(jTable3);
        menuPedidos(jTable3);

        tamaMesa.setText(Integer.toString(r.mesa.size()));
        listPlatos.removeAllItems();
        for (int i = 1; i <= r.mesa.size(); i++) {
            listPlatos.addItem(i);
        }
        factMesa.removeAllItems();
        for (int i = 1; i <= r.mesa.size(); i++) {
            factMesa.addItem(i);
        }
        reserva_me.removeAllItems();
        for (int i = 1; i <= r.mesa.size(); i++) {
            reserva_me.addItem(i);
        }

    }//GEN-LAST:event_boton_mesasActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        Mesas.setVisible(false);
        Mesas.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void dispoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispoActionPerformed

    }//GEN-LAST:event_dispoActionPerformed

    private void tamaMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamaMesaActionPerformed

    }//GEN-LAST:event_tamaMesaActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        r.mesa.add(new Mesa());
        JOptionPane.showMessageDialog(Menu, "Mesa añadida con exito!!");
        tamaMesa.setText(Integer.toString(r.mesa.size()));

        listPlatos.removeAllItems();
        for (int i = 1; i <= r.mesa.size(); i++) {
            listPlatos.addItem(i);
        }
        factMesa.removeAllItems();
        for (int i = 1; i <= r.mesa.size(); i++) {
            factMesa.addItem(i);
        }
        reserva_me.removeAllItems();
        for (int i = 1; i <= r.mesa.size(); i++) {
            reserva_me.addItem(i);
        }


    }//GEN-LAST:event_jButton11ActionPerformed

    private void Mesa_PanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mesa_PanelMousePressed
        limpiarTabla(jTable3);
        menuPedidos(jTable3);
    }//GEN-LAST:event_Mesa_PanelMousePressed

    private void listPlatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listPlatosActionPerformed

    }//GEN-LAST:event_listPlatosActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        if (!r.mesa.isEmpty()) {
            int filasele = jTable3.getSelectedRow();
            int m = Integer.parseInt(listPlatos.getSelectedItem().toString());
            int vendidos = 0, ventas = 0;
            if (filasele >= 0) {
                String cant;
                do {
                    do {
                        cant = JOptionPane.showInputDialog("Ingrese la cantidad de la orden ");

                    } while (validarNumero(cant) == false);
                } while (Integer.parseInt(cant) <= 0);

                Object n = jTable3.getValueAt(filasele, 3);
                int num = Integer.parseInt(n.toString()) - 1;

                if (jTable3.getValueAt(filasele, 2).toString().equals("Plato")) {

                    String a = r.menu.getPlatos().get(num).getTipo();
                    float b = r.menu.getPlatos().get(num).getPrecio();
                    int c = r.menu.getPlatos().get(num).getId();

                    vendidos += r.menu.getPlatos().get(num).getVendidos();
                    vendidos += Integer.parseInt(cant);
                    r.menu.getPlatos().get(num).setVendidos(vendidos);
                    ventas += r.menu.getPlatos().get(num).getVentas();
                    ventas += (Integer.parseInt(cant) * r.menu.getPlatos().get(num).getPrecio());
                    r.menu.getPlatos().get(num).setVentas(ventas);

                    r.mesa.get(m - 1).getPedido().getPlatito().add(new Plato(a, b, c, Integer.parseInt(cant)));

                } else {
                    String a = r.menu.getProducto().get(num).getTipo();
                    float b = r.menu.getProducto().get(num).getPrecio();
                    int c = r.menu.getProducto().get(num).getId();
                    r.mesa.get(m - 1).getPedido().getProduc().add(new Producto(a, b, c, Integer.parseInt(cant)));
                }

                JOptionPane.showMessageDialog(Menu, "Pedido seleccionado con exito a la mesa " + (m));

                limpiarTabla(jTable3);
                menuPedidos(jTable3);
                limpiarTabla(jTable4);
                pedidos(jTable4, Integer.parseInt(listPlatos.getSelectedItem().toString()) - 1);
            } else {
                JOptionPane.showMessageDialog(Menu, "Seleccione un elemento!!.");
            }
        } else {
            JOptionPane.showMessageDialog(Menu, "Agregue una mesa para realizar pedido!!.");
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        Mesas.setVisible(false);
        Mesas.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed

        if (!r.mesa.isEmpty()) {
            if (r.mesa.get(Integer.parseInt(listPlatos.getSelectedItem().toString()) - 1).getPedido().getPlatito().isEmpty()
                    && r.mesa.get(Integer.parseInt(listPlatos.getSelectedItem().toString()) - 1).getPedido().getProduc().isEmpty()) {
                JOptionPane.showMessageDialog(Menu, "La mesa seleccionada no tiene pedido!.");
            } else {
                mesa_sele.setText(listPlatos.getSelectedItem().toString());
                limpiarTabla(jTable4);
                pedidos(jTable4, Integer.parseInt(listPlatos.getSelectedItem().toString()) - 1);
            }
        }

    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        ClientePrefe.setVisible(false);
        ClientePrefe.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void Modificar_nombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificar_nombre1ActionPerformed
        int filasele = jTable2.getSelectedRow();
        String t;
        if (filasele >= 0) {
            do {
                do {
                    t = JOptionPane.showInputDialog("Ingrese el nuevo teléfono del cliente preferencial ");
                } while (t == null || t.trim().isEmpty());

                if (validarNumero(t) == false) {
                    JOptionPane.showMessageDialog(Menu, "Ingrese solo números!");
                }
            } while (validarNumero(t) == false);

            r.cPrefe.get(filasele).setTelefono(t);
            JOptionPane.showMessageDialog(Menu, "Teléfono del cliente preferencial modificado con exito.");
            limpiarTabla(jTable2);
            mostrarTablaClientesPrefe(jTable2);
        } else {
            JOptionPane.showMessageDialog(this, "** Elemento no seleccionado!! ** ");
        }
    }//GEN-LAST:event_Modificar_nombre1ActionPerformed

    private void Modificar_nombre3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificar_nombre3ActionPerformed
        int filasele = jTable2.getSelectedRow();
        if (filasele >= 0) {
            String n;
            do {
                n = JOptionPane.showInputDialog("Ingrese el nuevo nombre del cliente preferencial: ");
                if (n == null || n.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(Menu, "Texto vacío, Ingrese un nombre!");
                }
            } while (n == null || n.trim().isEmpty());

            r.cPrefe.get(filasele).setNombre(n);
            JOptionPane.showMessageDialog(Menu, "Nombre del cliente preferencial modificado con exito.");

            limpiarTabla(jTable2);
            mostrarTablaClientesPrefe(jTable2);
        } else {
            JOptionPane.showMessageDialog(this, "** Elemento no seleccionado!! ** ");
        }
    }//GEN-LAST:event_Modificar_nombre3ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        int filasele = jTable2.getSelectedRow();
        if (filasele >= 0) {
            r.cPrefe.get(filasele).getReserva().clear();
            limpiarTabla(jTable6);
            reserva(jTable6);
            r.cPrefe.remove(filasele);
            JOptionPane.showMessageDialog(Menu, "Cliente preferencial eliminado con exito.");

            limpiarTabla(jTable2);
            mostrarTablaClientesPrefe(jTable2);
        } else {
            JOptionPane.showMessageDialog(this, "** Elemento no seleccionado!! ** ");
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        Mesas.setVisible(false);
        Mesas.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        if (!r.mesa.isEmpty()) {

            int m = Integer.parseInt(factMesa.getSelectedItem().toString()) - 1;

            if (r.mesa.get(m).getPedido().getPlatito().isEmpty() && r.mesa.get(m).getPedido().getProduc().isEmpty()) {
                JOptionPane.showMessageDialog(Menu, "La mesa seleccionada no tiene pedido!!.");
            } else if (opPrefe.isSelected()) {
                int cont = 0, aux = 0;
                for (int i = 0; i < r.cPrefe.size(); i++) {
                    if (r.cPrefe.get(i).getTarjeta().getCodigo() == Integer.parseInt(text_ID.getText())) {
                        cont++;
                        aux = i;
                    }
                }
                if (cont == 0) {
                    JOptionPane.showMessageDialog(Menu, "El ID ingresado no existe!!.");
                    text_ID.setText(null);
                } else {

                    subtotal.setText(Float.toString(r.crearSubtotal(m)));
                    descuento.setText(Float.toString(r.descontar(m)));
                    total_fac.setText(Float.toString(r.crearSubtotal(m) - r.descontar(m)));
                    f_mesa.setText(Integer.toString(m) + 1);
                    id.setEnabled(true);
                    f_id.enable(true);
                    nom.setEnabled(true);
                    tel.setEnabled(true);
                    f_cliente.setEnabled(true);
                    f_nombre.setEnabled(true);
                    f_tel.setEnabled(true);
                    fecha_fac.setText(getFechaActual());
                    f_nombre.setText(r.cPrefe.get(aux).getNombre());
                    f_tel.setText(r.cPrefe.get(aux).getTelefono());
                    f_id.setText(Integer.toString(r.cPrefe.get(aux).getTarjeta().getCodigo()));
                    limpiarTabla(jTable5);
                    factura(jTable5, m);
                    Factura_mesas.setLocationRelativeTo(null);
                    Factura_mesas.setVisible(true);

                }
            } else {
                subtotal.setText(Float.toString(r.crearSubtotal(m)));
                descuento.setText("0");
                total_fac.setText(Float.toString(r.crearSubtotal(m)));
                f_mesa.setText(Integer.toString(m) + 1);
                id.setEnabled(false);
                f_id.enable(false);
                nom.setEnabled(false);
                tel.setEnabled(false);
                f_cliente.setEnabled(false);
                f_nombre.setEnabled(false);
                f_tel.setEnabled(false);
                fecha_fac.setText(getFechaActual());
                limpiarTabla(jTable5);
                factura(jTable5, m);
                Factura_mesas.setLocationRelativeTo(null);
                Factura_mesas.setVisible(true);
                f_nombre.setText(null);
                f_tel.setText(null);
                f_id.setText(null);
            }

        } else {
            JOptionPane.showMessageDialog(Menu, "Agregue mesa para generar factura!!.");
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void opPrefeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opPrefeMouseClicked
        label_pre.setVisible(true);
        text_ID.setVisible(true);
        label_pre.setEnabled(true);
        text_ID.setEnabled(true);
    }//GEN-LAST:event_opPrefeMouseClicked

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        text_ID.setText(null);
        label_pre.setEnabled(false);
        label_pre.setVisible(false);
        text_ID.setVisible(false);
        text_ID.setEnabled(false);
    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void text_IDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_IDKeyTyped
        int k = (int) evt.getKeyChar();
        if (k < 48 || k > 57) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
        }

    }//GEN-LAST:event_text_IDKeyTyped

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        ArchivoBinario.escribir(Main.r);
        System.exit(0);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        Factura_mesas.setVisible(false);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void descuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descuentoActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        ClientePrefe.setVisible(false);
        ClientePrefe.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void id_reserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_reserKeyTyped
        int k = (int) evt.getKeyChar();
        if (k < 48 || k > 57) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
        }
    }//GEN-LAST:event_id_reserKeyTyped

    private void agregar_reserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_reserActionPerformed

        if (r.cPrefe.isEmpty()) {
            JOptionPane.showMessageDialog(Menu, "Lista de clientes preferenciales vacía, agregue para crear reservas!");
        } else {

            if (validarNumero(id_reser.getText()) == false || id_reser.getText() == null || id_reser.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(Menu, "ID incorrecta!, reintente.");
            } else {
                int cont = 0, aux = 0;
                for (int i = 0; i < r.cPrefe.size(); i++) {
                    if (r.cPrefe.get(i).getTarjeta().getCodigo() == Integer.parseInt(id_reser.getText())) {
                        cont++;
                        aux = i;
                    }
                }
                if (cont == 0) {
                    JOptionPane.showMessageDialog(null, "El ID ingresado no existe!.");
                    id_reser.setText(null);
                } else {
                    if (reserva_me.getSelectedItem() == null) {
                        JOptionPane.showMessageDialog(Menu, "Agregue una mesa para crear reservas!.");

                    } else {
                        cont = 0;

                        for (int j = 0; j < r.cPrefe.size(); j++) {
                            for (int i = 0; i < r.cPrefe.get(j).getReserva().size(); i++) {
                                if (r.cPrefe.get(j).getReserva().get(i).getMesa() == Integer.parseInt(reserva_me.getSelectedItem().toString())) {
                                    if (r.cPrefe.get(j).getReserva().get(i).getFecha().equals(fecha.getText())
                                            && r.cPrefe.get(j).getReserva().get(i).getHora().equals(hora.getSelectedItem().toString())) {
                                        cont++;

                                    }
                                }
                            }
                        }
                        if (cont > 0) {
                            JOptionPane.showMessageDialog(Menu, "Reserva no disponible,se encuentra ocupada!!");
                            id_reser.setText(null);
                        } else {
                            r.cPrefe.get(aux).getReserva().add(new Reserva());
                            r.cPrefe.get(aux).getReserva().get(r.cPrefe.get(aux).getReserva().size() - 1).setFecha(fecha.getText());
                            r.cPrefe.get(aux).getReserva().get(r.cPrefe.get(aux).getReserva().size() - 1).setHora(hora.getSelectedItem().toString());
                            r.cPrefe.get(aux).getReserva().get(r.cPrefe.get(aux).getReserva().size() - 1).setMesa(Integer.parseInt(reserva_me.getSelectedItem().toString()));
                            JOptionPane.showMessageDialog(Menu, "Reserva agregada con exito para el cliente preferencial " + r.cPrefe.get(aux).getNombre());
                            id_reser.setText(null);
                            limpiarTabla(jTable6);
                            reserva(jTable6);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_agregar_reserActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        ClientePrefe.setVisible(false);
        ClientePrefe.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        int filasele = jTable6.getSelectedRow();
        if (filasele >= 0) {
            int num = Integer.parseInt(jTable6.getValueAt(filasele, 1).toString()), aux = 0;
            for (int i = 0; i < r.cPrefe.size(); i++) {
                if (r.cPrefe.get(i).getTarjeta().getCodigo() == num) {
                    aux = i;
                }
            }
            int m = Integer.parseInt(jTable6.getValueAt(filasele, 2).toString());
            String f = jTable6.getValueAt(filasele, 3).toString();
            String h = jTable6.getValueAt(filasele, 4).toString();
            int aux2 = 0;

            for (int i = 0; i < r.cPrefe.get(aux).getReserva().size(); i++) {

                if (r.cPrefe.get(aux).getReserva().get(i).getFecha().equals(f) && r.cPrefe.get(aux).getReserva().get(i).getHora().equals(h)
                        && r.cPrefe.get(aux).getReserva().get(i).getMesa() == m) {
                    aux2 = i;
                }
            }
            r.cPrefe.get(aux).getReserva().remove(aux2);
            JOptionPane.showMessageDialog(Menu, "Reserva cancelada con exito!.");
            limpiarTabla(jTable6);
            reserva(jTable6);
        } else {
            JOptionPane.showMessageDialog(Menu, "=**= Elemento no seleccionado!!. =**=");
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed

        int filasele = jTable6.getSelectedRow();
        if (filasele >= 0) {
            fecha_new.setVisible(true);
            fecha_new.setLocationRelativeTo(null);
        } else {
            JOptionPane.showMessageDialog(Menu, "=**= Elemento no seleccionado!!. =**=");
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        int filasele = jTable6.getSelectedRow();
        if (filasele >= 0) {
            int num = Integer.parseInt(jTable6.getValueAt(filasele, 1).toString()), aux = 0;
            for (int i = 0; i < r.cPrefe.size(); i++) {
                if (r.cPrefe.get(i).getTarjeta().getCodigo() == num) {
                    aux = i;
                }
            }
            int m = Integer.parseInt(jTable6.getValueAt(filasele, 2).toString());
            String f = jTable6.getValueAt(filasele, 3).toString();
            String h = jTable6.getValueAt(filasele, 4).toString();
            int aux2 = 0;
            for (int i = 0; i < r.cPrefe.get(aux).getReserva().size(); i++) {
                if (r.cPrefe.get(aux).getReserva().get(i).getFecha().equals(f) && r.cPrefe.get(aux).getReserva().get(i).getHora().equals(h)
                        && r.cPrefe.get(aux).getReserva().get(i).getMesa() == m) {
                    aux2 = i;
                }
            }
            int cont = 0;
            for (int i = 0; i < r.cPrefe.size(); i++) {

                for (int j = 0; j < r.cPrefe.get(i).getReserva().size(); j++) {

                    if (r.cPrefe.get(i).getReserva().get(j).getFecha().equals(fecha2.getText())) {
                        if (r.cPrefe.get(aux).getReserva().get(aux2).getHora().equals(r.cPrefe.get(i).getReserva().get(j).getHora())
                                && r.cPrefe.get(aux).getReserva().get(aux2).getMesa() == r.cPrefe.get(i).getReserva().get(j).getMesa()) {
                            if (j != aux2 || i != aux) {
                                cont++;
                            }
                        }
                    }
                }
            }

            if (cont > 0) {
                JOptionPane.showMessageDialog(Menu, "Reserva no disponible!");

            } else {

                r.cPrefe.get(aux).getReserva().get(aux2).setFecha(fecha2.getText());
                JOptionPane.showMessageDialog(Menu, "Fecha modificadaa con exito!.");
                fecha_new.setVisible(false);
                fecha_new.dispose();
                limpiarTabla(jTable6);
                reserva(jTable6);
            }
        } else {
            JOptionPane.showMessageDialog(Menu, "=**= Elemento no seleccionado!!. =**=");
        }

    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        int filasele = jTable6.getSelectedRow();
        if (filasele >= 0) {
            hora_new.setVisible(true);
            hora_new.setLocationRelativeTo(null);
        } else {
            JOptionPane.showMessageDialog(Menu, "=**= Elemento no seleccionado!!. =**=");
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed

        int filasele = jTable6.getSelectedRow();
        if (filasele >= 0) {
            int num = Integer.parseInt(jTable6.getValueAt(filasele, 1).toString()), aux = 0;
            for (int i = 0; i < r.cPrefe.size(); i++) {
                if (r.cPrefe.get(i).getTarjeta().getCodigo() == num) {
                    aux = i;
                }
            }
            int m = Integer.parseInt(jTable6.getValueAt(filasele, 2).toString());
            String f = jTable6.getValueAt(filasele, 3).toString();
            String h = jTable6.getValueAt(filasele, 4).toString();
            int aux2 = 0;
            for (int i = 0; i < r.cPrefe.get(aux).getReserva().size(); i++) {
                if (r.cPrefe.get(aux).getReserva().get(i).getFecha().equals(f) && r.cPrefe.get(aux).getReserva().get(i).getHora().equals(h)
                        && r.cPrefe.get(aux).getReserva().get(i).getMesa() == m) {
                    aux2 = i;
                }
            }
            int cont = 0;
            for (int i = 0; i < r.cPrefe.size(); i++) {

                for (int j = 0; j < r.cPrefe.get(i).getReserva().size(); j++) {

                    if (r.cPrefe.get(i).getReserva().get(j).getHora().equals(hora2.getSelectedItem().toString())) {
                        if (r.cPrefe.get(aux).getReserva().get(aux2).getFecha().equals(r.cPrefe.get(i).getReserva().get(j).getFecha())
                                && r.cPrefe.get(aux).getReserva().get(aux2).getMesa() == r.cPrefe.get(i).getReserva().get(j).getMesa()) {
                            if (j != aux2 || i != aux) {
                                cont++;
                            }
                        }
                    }
                }
            }
            if (cont > 0) {
                JOptionPane.showMessageDialog(Menu, "Reserva no disponible!");

            } else {

                r.cPrefe.get(aux).getReserva().get(aux2).setHora(hora2.getSelectedItem().toString());
                JOptionPane.showMessageDialog(Menu, "Hora modificadaa con exito!.");
                hora_new.setVisible(false);
                hora_new.dispose();
                limpiarTabla(jTable6);
                reserva(jTable6);
            }
        } else {
            JOptionPane.showMessageDialog(Menu, "=**= Elemento no seleccionado!!. =**=");
        }


    }//GEN-LAST:event_jButton26ActionPerformed

    private void boton_estadisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_estadisActionPerformed
        this.dispose();
        Estadisti.setVisible(true);
        Estadisti.setLocationRelativeTo(null);
        plato_est.removeAllItems();
        for (int i = 0; i < r.menu.getPlatos().size(); i++) {

                plato_est.addItem(r.menu.getPlatos().get(i).getTipo());
        }
        
        if (!r.menu.getPlatos().isEmpty()) {
             
            dinero_plato.setText(Float.toString(r.menu.getPlatos().get(plato_est.getSelectedIndex()).getVentas()));
            if (r.menu.getPlatos().size() > 1) {
                masVend.setText(r.masvendidoPlato());
                menosVend.setText(r.menosvendidoPlato());
            } else if (r.menu.getPlatos().size() == 1) {
                masVend.setText(r.masvendidoPlato());
                menosVend.setText("Solo hay un plato.");
            }
        } else {
            masVend.setText("No hay platos en el menú");
            menosVend.setText("No hay platos en el menú..");
            dinero_plato.setText("No hay platos en el menú..");
          }

    }//GEN-LAST:event_boton_estadisActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        int m = Integer.parseInt(factMesa.getSelectedItem().toString()) - 1;
        // eliminar pedidos cuando la factura se pague
        r.mesa.get(m).getPedido().getPlatito().clear();
        r.mesa.get(m).getPedido().getProduc().clear();
        limpiarTabla(jTable4);
        pedidos(jTable4, m);
        JOptionPane.showMessageDialog(Factura_mesas, "Factura pagada con exito , vuelva pronto!.");
        Factura_mesas.setVisible(false);
        Factura_mesas.dispose();
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton32ActionPerformed

    private void masVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masVendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_masVendActionPerformed

    private void menosVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosVendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menosVendActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        Estadisti.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jButton36ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // limpiar tablas para mostrar
    void limpiarTabla(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    }

    // obtener fecha actual para facturas
    public static String getFechaActual() {

        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        return formateador.format(ahora);
    }

    public boolean validarNumero(String v) {
        try {
            for (int i = 0; i < v.length(); i++) {
                Float.parseFloat(v.substring(i, i + 1));
            }
            return true;
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
    }

    // mostrar tabla de clientes preferenciales
    void mostrarTablaClientesPrefe(JTable table) {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();

        for (int i = 0; i < r.cPrefe.size(); i++) {

            String m = r.cPrefe.get(i).getNombre();
            String t = r.cPrefe.get(i).getTelefono();
            int id = r.cPrefe.get(i).getTarjeta().getCodigo();
            model.addRow(new Object[]{(i + 1), m, t, id});
        }
    }

    // mostrar tabla de platos y productos
    void mostrarTabla(JTable table) {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < r.menu.getPlatos().size(); i++) {

            String m = r.menu.getPlatos().get(i).getTipo();
            float rec = r.menu.getPlatos().get(i).getPrecio();
            boolean b = r.menu.getPlatos().get(i).getDisponibilidad();
            int id = r.menu.getPlatos().get(i).getId();
            String n;
            if (b == true) {
                n = "Disponible";
            } else {
                n = "No Disponible";
            }
            model.addRow(new Object[]{m, rec, n, "Plato", id});
        }
        for (int i = 0; i < r.menu.getProducto().size(); i++) {

            String m = r.menu.getProducto().get(i).getTipo();
            float rec = r.menu.getProducto().get(i).getPrecio();
            boolean b = r.menu.getProducto().get(i).getDisponibilidad();
            int id = r.menu.getProducto().get(i).getId();

            String n;
            if (b == true) {
                n = "Disponible";
            } else {
                n = "No Disponible";
            }
            model.addRow(new Object[]{m, rec, n, "Producto", id});
        }
    }

    void menuPedidos(JTable table) {

        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        for (int i = 0; i < r.menu.getPlatos().size(); i++) {

            if (r.menu.getPlatos().get(i).getDisponibilidad() == true) {
                String m = r.menu.getPlatos().get(i).getTipo();
                float rec = r.menu.getPlatos().get(i).getPrecio();
                int n = r.menu.getPlatos().get(i).getId();
                model.addRow(new Object[]{m, rec, "Plato", n});
            }
        }
        for (int i = 0; i < r.menu.getProducto().size(); i++) {

            if (r.menu.getProducto().get(i).getDisponibilidad() == true) {
                String m = r.menu.getProducto().get(i).getTipo();
                float rec = r.menu.getProducto().get(i).getPrecio();
                int n = r.menu.getProducto().get(i).getId();
                model.addRow(new Object[]{m, rec, "Producto", n});
            }
        }
    }

    void pedidos(JTable table, int pos) {

        DefaultTableModel model = (DefaultTableModel) jTable4.getModel();

        for (int i = 0; i < r.mesa.get(pos).getPedido().getPlatito().size(); i++) {

            String nombre = r.mesa.get(pos).getPedido().getPlatito().get(i).getTipo();
            float precio = r.mesa.get(pos).getPedido().getPlatito().get(i).getPrecio();
            int cant = r.mesa.get(pos).getPedido().getPlatito().get(i).getCantidad();
            model.addRow(new Object[]{nombre, precio, cant, pos + 1});
        }
        for (int i = 0; i < r.mesa.get(pos).getPedido().getProduc().size(); i++) {

            String nombre = r.mesa.get(pos).getPedido().getProduc().get(i).getTipo();
            float precio = r.mesa.get(pos).getPedido().getProduc().get(i).getPrecio();
            int cant = r.mesa.get(pos).getPedido().getProduc().get(i).getCantidad();
            model.addRow(new Object[]{nombre, precio, cant, pos + 1});
        }

    }

    void factura(JTable table, int pos) {

        DefaultTableModel model = (DefaultTableModel) jTable5.getModel();

        for (int i = 0; i < r.mesa.get(pos).getPedido().getPlatito().size(); i++) {

            String nombre = r.mesa.get(pos).getPedido().getPlatito().get(i).getTipo();
            float precio = r.mesa.get(pos).getPedido().getPlatito().get(i).getPrecio();
            int cant = r.mesa.get(pos).getPedido().getPlatito().get(i).getCantidad();
            model.addRow(new Object[]{nombre, precio, cant, cant * precio});
        }
        for (int i = 0; i < r.mesa.get(pos).getPedido().getProduc().size(); i++) {

            String nombre = r.mesa.get(pos).getPedido().getProduc().get(i).getTipo();
            float precio = r.mesa.get(pos).getPedido().getProduc().get(i).getPrecio();
            int cant = r.mesa.get(pos).getPedido().getProduc().get(i).getCantidad();
            model.addRow(new Object[]{nombre, precio, cant, cant * precio});
        }
    }

    void reserva(JTable table) {

        DefaultTableModel model = (DefaultTableModel) jTable6.getModel();

        for (ClientePreferencial cPrefe : r.cPrefe) {
            for (int i = 0; i < cPrefe.getReserva().size(); i++) {
                String nombre = cPrefe.getNombre();
                int mesa = cPrefe.getReserva().get(i).getMesa();
                int id2 = cPrefe.getTarjeta().getCodigo();
                String f = cPrefe.getReserva().get(i).getFecha();
                String h = cPrefe.getReserva().get(i).getHora();
                model.addRow(new Object[]{nombre, id2, mesa, f, h});
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AgregarPrefe;
    private javax.swing.JPanel Agregar_platos;
    private javax.swing.JPanel Agregar_prod;
    private javax.swing.JButton Añadir_platos;
    private javax.swing.JButton Boton_menu;
    private javax.swing.JFrame ClientePrefe;
    private javax.swing.JTabbedPane ClientePrefe_Panel;
    private javax.swing.JButton Eliminar_menu;
    private javax.swing.JTabbedPane Estadisi_Panel;
    private javax.swing.JFrame Estadisti;
    private javax.swing.JFrame Factura_mesas;
    private javax.swing.JPanel Facturas;
    private javax.swing.JFrame Menu;
    private javax.swing.JTabbedPane Menu_Pane;
    private javax.swing.JTabbedPane Mesa_Panel;
    private javax.swing.JFrame Mesas;
    private javax.swing.JPanel ModificarPrefe;
    private javax.swing.JPanel Modificar_menu;
    private javax.swing.JButton Modificar_nombre;
    private javax.swing.JButton Modificar_nombre1;
    private javax.swing.JButton Modificar_nombre3;
    private javax.swing.JPanel Pedidos;
    private javax.swing.JPanel Reservas;
    private javax.swing.JPanel agregarMes;
    private javax.swing.JButton agregar_reser;
    private javax.swing.JButton anadirPrefe;
    private javax.swing.JButton añadir_prod;
    private javax.swing.JButton boton_cliente;
    private javax.swing.JButton boton_estadis;
    private javax.swing.JButton boton_mesas;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField descuento;
    private javax.swing.JTextField dinero_plato;
    private javax.swing.JComboBox dispo;
    private javax.swing.JComboBox dispo_pro;
    private javax.swing.JPanel estPlato;
    private javax.swing.JLabel f_cliente;
    private javax.swing.JTextField f_id;
    private javax.swing.JTextField f_mesa;
    private javax.swing.JTextField f_nombre;
    private javax.swing.JTextField f_tel;
    private javax.swing.JComboBox factMesa;
    private datechooser.beans.DateChooserCombo fecha;
    private datechooser.beans.DateChooserCombo fecha2;
    private javax.swing.JTextField fecha_fac;
    private javax.swing.JFrame fecha_new;
    private javax.swing.JComboBox hora;
    private javax.swing.JComboBox hora2;
    private javax.swing.JFrame hora_new;
    private javax.swing.JLabel id;
    private javax.swing.JTextField id_reser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
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
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JLabel label_pre;
    private javax.swing.JComboBox listPlatos;
    private javax.swing.JPanel lista_res;
    private javax.swing.JTextField masVend;
    private javax.swing.JTextField menosVend;
    private javax.swing.JTextField mesa_sele;
    private javax.swing.JTextPane nPrefe;
    private javax.swing.JLabel nom;
    private javax.swing.JTextField nombrePlato;
    private javax.swing.JTextField nombrePro;
    private javax.swing.JRadioButton opPrefe;
    private javax.swing.JComboBox plato_est;
    private javax.swing.JTextField precioPlato;
    private javax.swing.JTextField precioPro;
    private javax.swing.JComboBox reserva_me;
    private javax.swing.JTextField subtotal;
    private javax.swing.JTextPane tPrefe;
    private javax.swing.JTextField tamaMesa;
    private javax.swing.JLabel tel;
    private javax.swing.JTextField text_ID;
    private javax.swing.JTextField total_fac;
    // End of variables declaration//GEN-END:variables
}

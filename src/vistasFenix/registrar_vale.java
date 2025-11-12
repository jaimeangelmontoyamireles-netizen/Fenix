/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistasFenix;

import controlador.Ccortequincenal;
import controlador.Cmontos;
import controlador.Cquincenas;
import controlador.Cregistro_clientes;
import controlador.Cregistro_vales;
import controlador.Cvale;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
import dao.ValeDAO;
import models.Vale;
import java.util.List;
import javax.swing.JOptionPane;

public class registrar_vale extends javax.swing.JInternalFrame {

    private ValeDAO valeDAO = new ValeDAO();

    public registrar_vale() {
        initComponents();
        cargarClientes();
        cargarMontos();
        cargarQuincenas();
    /**
     * Creates new form registrar_vale
     */
    private boolean bloqueandoEventos = false;
    public registrar_vale() {
        initComponents();
        Cregistro_clientes clientes = new Cregistro_clientes();
        java.util.List<String> listaconvacio = new java.util.ArrayList<>();
        listaconvacio.add(" ");
        listaconvacio.addAll(java.util.Arrays.asList(clientes.nombres));
        String[] nombresConVacio = listaconvacio.toArray(new String[0]);
        this.cbbcliente.setModel(
        new javax.swing.DefaultComboBoxModel<>(nombresConVacio)
    );
        Cquincenas montos = new Cquincenas();
         java.util.List<String> listaquincenasconvacio = new java.util.ArrayList<>();
         listaquincenasconvacio.add(" "); 
         for (int quincena : montos.quincenas) {
         listaquincenasconvacio.add(String.valueOf(quincena));
    }
         String[] quincenasConVacio = listaquincenasconvacio.toArray(new String[0]);
         this.cbbquincenas.setModel(
         new javax.swing.DefaultComboBoxModel<>(quincenasConVacio)
    );
         Cmontos montosvale = new Cmontos();
         java.util.List<String> listamontosconvacio = new java.util.ArrayList<>();
         listamontosconvacio.add(" "); 
         for (int monto : montosvale.Cmontos) {
         listamontosconvacio.add(String.valueOf(monto));
    }
    String[] montosconvacio = listamontosconvacio.toArray(new String[0]);
    this.ccbmontovale.setModel(
        new javax.swing.DefaultComboBoxModel<>(montosconvacio)
    );
         
    }

    // Cargar clientes desde la base de datos
    private void cargarClientes() {
        List<String> clientes = valeDAO.obtenerUsuarios();
        jComboBox1.removeAllItems();
        for (String cliente : clientes) {
            jComboBox1.addItem(cliente);
        }
    }

    // Cargar opciones de montos
    private void cargarMontos() {
        jComboBox2.removeAllItems();
        jComboBox2.addItem("1000");
        jComboBox2.addItem("2000");
        jComboBox2.addItem("5000");
        jComboBox2.addItem("10000");
    }

    // Cargar opciones de quincenas
    private void cargarQuincenas() {
        jComboBox3.removeAllItems();
        jComboBox3.addItem("2");
        jComboBox3.addItem("4");
        jComboBox3.addItem("6");
        jComboBox3.addItem("8");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbbcliente = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbbquincenas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        ccbmontovale = new javax.swing.JComboBox<>();
        btnconf_regvales = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setVisible(true);

        jLabel1.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        jLabel1.setText("Rellena los campos para registrar un nuevo vale");

        jLabel2.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel2.setText("Selecciona un cliente ");

        cbbcliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbclienteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel3.setText("Ingresa la cantidad de quincenas");

        cbbquincenas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbquincenas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbquincenasActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel4.setText("Ingresa el monto del vale");

        ccbmontovale.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFenix/confirmar.png"))); // NOI18N
        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
        btnconf_regvales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFenix/confirmar.png"))); // NOI18N
        btnconf_regvales.setText("Confirmar");
        btnconf_regvales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconf_regvalesActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFenix/contrato.png"))); // NOI18N
        jButton2.setText("Firmar");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFenix/fenix 128px.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(347, 347, 347))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(cbbcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(261, 261, 261))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(43, 43, 43)
                                                .addComponent(cbbquincenas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(197, 197, 197)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnconf_regvales, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(ccbmontovale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(jLabel5))
                            .addComponent(jLabel3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnconf_regvales, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbbquincenas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ccbmontovale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbquincenasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbquincenasActionPerformed
        // TODO add your handling code here:
        if (bloqueandoEventos) return;
        String montoseleccionadostr = (String) this.cbbquincenas.getSelectedItem();
    if (montoseleccionadostr != null && montoseleccionadostr.trim().isEmpty()) { 
        javax.swing.JOptionPane.showMessageDialog(this, "por favor, seleccione un monto de la lista.");
        return; 
    }
    try {
        int quincenasseleccionadas = Integer.parseInt(montoseleccionadostr);
    } catch (NumberFormatException e) {
    }
    }//GEN-LAST:event_cbbquincenasActionPerformed

    private void cbbclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbclienteActionPerformed
        // TODO add your handling code here:
        if (bloqueandoEventos) return;
        String nombreseleccionado = (String) this.cbbcliente.getSelectedItem();
    if (nombreseleccionado != null && nombreseleccionado.trim().isEmpty()) { 
        JOptionPane.showMessageDialog(this, "por favor seleccione un usuario de la lista");
    }
    }//GEN-LAST:event_cbbclienteActionPerformed

    private void btnconf_regvalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconf_regvalesActionPerformed
        // TODO add your handling code here:
         String cliente = (String) cbbcliente.getSelectedItem();
    String quincenaStr = (String) cbbquincenas.getSelectedItem();
    String montoStr = (String) ccbmontovale.getSelectedItem();

    if (cliente == null || cliente.trim().isEmpty() ||
        quincenaStr == null || quincenaStr.trim().isEmpty() ||
        montoStr == null || montoStr.trim().isEmpty()) {

        javax.swing.JOptionPane.showMessageDialog(this, "rellena todos los campos");
        return;
    }

    int quincenas = Integer.parseInt(quincenaStr);
    int monto = Integer.parseInt(montoStr);

    Cvale vale = new Cvale(cliente, quincenas, monto);
    Ccortequincenal.listaVales.add(vale);
    bloqueandoEventos = true;
    javax.swing.JOptionPane.showMessageDialog(this, "vale registrado correctamente");
     cbbcliente.setSelectedIndex(0);
    cbbquincenas.setSelectedIndex(0);
    ccbmontovale.setSelectedIndex(0);
    bloqueandoEventos = false;
    }//GEN-LAST:event_btnconf_regvalesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  String clienteSeleccionado = (String) jComboBox1.getSelectedItem();
    String montoTexto = (String) jComboBox2.getSelectedItem();

    if (clienteSeleccionado == null || montoTexto == null) {
        JOptionPane.showMessageDialog(this, "Selecciona un cliente y un monto.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int idUsuario = valeDAO.obtenerIdUsuarioPorNombre(clienteSeleccionado);
    if (idUsuario == -1) {
        JOptionPane.showMessageDialog(this, "Error al obtener ID del cliente.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    double monto = Double.parseDouble(montoTexto);
    
    // Agregar fecha de vencimiento (30 días despues)
    java.time.LocalDate fechaVencimiento = java.time.LocalDate.now().plusDays(30);

    // Crear el vale 
    Vale vale = new Vale(idUsuario, monto, monto, fechaVencimiento, "activo");

    if (valeDAO.registrarVale(vale)) {
        JOptionPane.showMessageDialog(this, "Vale registrado correctamente.");
    } else {
        JOptionPane.showMessageDialog(this, "Error al registrar el vale.", "Error", JOptionPane.ERROR_MESSAGE);
    }    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnconf_regvales;
    private javax.swing.JComboBox<String> cbbcliente;
    private javax.swing.JComboBox<String> cbbquincenas;
    private javax.swing.JComboBox<String> ccbmontovale;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}

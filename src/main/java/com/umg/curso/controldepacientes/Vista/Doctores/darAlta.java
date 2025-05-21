
package com.umg.curso.controldepacientes.Vista.Doctores;

import com.umg.curso.controldepacientes.Controller.PacienteController;
import com.umg.curso.controldepacientes.Modelo.Antecedente;
import com.umg.curso.controldepacientes.sql.PConexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import javax.swing.JComboBox;


public class darAlta extends javax.swing.JFrame implements ActionListener{

   PacienteController controlador = new PacienteController();
    public darAlta(Object[] datos) {
        
        initComponents();
        //se llena los campos con la informacion traida de la tabla
        controlador.LlenarboxP(txtNombre);
        seleccionarItemParecido(txtNombre,datos[1].toString());
        txtId.setText(datos[0].toString());
        txtEnfermedad.setText(datos[5].toString());
        txtFechaIngreso.setText(datos[6].toString());
        txtDoctor.setText(datos[8].toString());
        
        //se Inicializan los botones
        btnDarAlta.addActionListener(this);
        btnSalir.addActionListener(this);
        
        //se desactiva campos para que no sean modificados solo sean visibles
        txtId.setEnabled(false);
        txtEnfermedad.setEnabled(false);
        txtFechaIngreso.setEnabled(false);
        txtDoctor.setEnabled(false);
        txtNombre.setEnabled(false);
        
        //se configura boton de salida para que se vea opaco (estetica)
        btnSalir.setOpaque(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setBorderPainted(false);
        btnSalir.setFocusPainted(false);
        btnSalir.addActionListener(this);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        tituloPacientes = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtEnfermedad = new javax.swing.JTextField();
        txtDoctor = new javax.swing.JTextField();
        txtFechaIngreso = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtNombre = new javax.swing.JComboBox<>();
        btnDarAlta = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(746, 470));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloPacientes.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tituloPacientes.setText("Dar de Alta al Paciente");
        background.add(tituloPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 366, -1));

        jLabel1.setText("Nombre del Paciente");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabel2.setText("Id ");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        jLabel3.setText("Enfermedad");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel4.setText("Doctor que Atendio");
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jLabel5.setText("Fecha de Ingreso");
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jLabel6.setText("Descripcion");
        background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));
        background.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 180, -1));
        background.add(txtEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 180, -1));
        background.add(txtDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 180, -1));
        background.add(txtFechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 180, -1));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 390, 150));

        txtNombre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        background.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 180, -1));

        btnDarAlta.setText("Dar Alta");
        background.add(btnDarAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, -1, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\boton-de-flecha-izquierda-del-teclado.png")); // NOI18N
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        background.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
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
            java.util.logging.Logger.getLogger(darAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(darAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(darAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(darAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }
    
     public void seleccionarItemParecido(JComboBox comboBox, String textoBuscado) {
    for (int i = 0; i < comboBox.getItemCount(); i++) {
        Object item = comboBox.getItemAt(i);
        if (item.toString().toLowerCase().contains(textoBuscado.toLowerCase())) {
            comboBox.setSelectedIndex(i);
            break;
        }
    }}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnDarAlta;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tituloPacientes;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtDoctor;
    private javax.swing.JTextField txtEnfermedad;
    private javax.swing.JTextField txtFechaIngreso;
    private javax.swing.JTextField txtId;
    private javax.swing.JComboBox<String> txtNombre;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnDarAlta){
            //se inicializa el controlador para poder añadir un antecedente
            PacienteController controlador = new PacienteController();
            Antecedente antecedente = new Antecedente();
            antecedente.setDescripcion(txtDescripcion.getText());
            antecedente.setDoctor(txtDoctor.getText());
            antecedente.setFecha_Ingreso(txtFechaIngreso.getText());
            antecedente.setEnfermedad(txtEnfermedad.getText());
            Timestamp fechaHora = new Timestamp(System.currentTimeMillis());
            controlador.DarAlta(antecedente, fechaHora, txtNombre);
            this.dispose();
        }
        if(e.getSource()==btnSalir){
            //boton de salida cierra la ventana darAlta
            this.dispose();
        }
    }
    
   
}

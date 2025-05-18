
package com.umg.curso.controldepacientes.Vista.Recepcion;

import com.umg.curso.controldepacientes.Vista.Recepcion.FmrPrincipal;
import com.umg.curso.controldepacientes.Modelo.Paciente;
import com.umg.curso.controldepacientes.Controller.PacienteController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class FmrPacientes extends javax.swing.JFrame implements ActionListener {

    
    public FmrPacientes() {
        initComponents();
        btnAgregar.addActionListener(this);
        
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEnfermedad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtIngreso = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(390, 50, 100, 16);
        jPanel1.add(txtID);
        txtID.setBounds(310, 100, 90, 22);

        jLabel2.setText("ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(260, 100, 20, 20);

        jLabel3.setText("Edad");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(260, 180, 30, 20);
        jPanel1.add(txtEdad);
        txtEdad.setBounds(310, 180, 90, 22);

        jLabel4.setText("Numero");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(410, 140, 60, 20);
        jPanel1.add(txtNumero);
        txtNumero.setBounds(470, 140, 100, 22);

        btnAgregar.setText("Agregar");
        jPanel1.add(btnAgregar);
        btnAgregar.setBounds(390, 290, 75, 23);

        jLabel5.setText("Apellidos");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(410, 100, 60, 20);
        jPanel1.add(txtApellidos);
        txtApellidos.setBounds(470, 100, 100, 22);

        jLabel6.setText("Direccion");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(250, 220, 60, 20);
        jPanel1.add(txtDireccion);
        txtDireccion.setBounds(310, 220, 90, 22);

        jLabel7.setText("Enfermedad");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(410, 180, 70, 20);
        jPanel1.add(txtEnfermedad);
        txtEnfermedad.setBounds(480, 180, 90, 22);

        jLabel9.setText("Ingreso");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(420, 220, 50, 20);
        jPanel1.add(txtIngreso);
        txtIngreso.setBounds(470, 220, 100, 22);

        jLabel11.setText("Nombre");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(260, 140, 44, 20);
        jPanel1.add(txtNombre);
        txtNombre.setBounds(310, 140, 90, 22);

        btnSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\boton-de-flecha-izquierda-del-teclado.png")); // NOI18N
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnSalir);
        btnSalir.setBounds(10, 10, 40, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 600);

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
            java.util.logging.Logger.getLogger(FmrPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmrPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmrPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmrPacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEnfermedad;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIngreso;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==btnAgregar){
           Paciente paciente= new Paciente();
           PacienteController controlador = new PacienteController();
           paciente.setID(Integer.parseInt(txtID.getText()));
           paciente.setNombres(txtNombre.getText());
           paciente.setApellidos(txtApellidos.getText());
           paciente.setEdad(Integer.parseInt(txtEdad.getText()));
           paciente.setNumero(Integer.parseInt(txtNumero.getText()));
           paciente.setDireccion(txtDireccion.getText());
           paciente.setEnfermedad(txtEnfermedad.getText());
           paciente.setIngreso(txtIngreso.getText());
           controlador.Guardar(paciente);
           
           
           
       }else if(e.getSource()== btnSalir){
           FmrPrincipal VistaRecepcion = new FmrPrincipal();
           VistaRecepcion.setBounds(0, 0, 900, 600);
           VistaRecepcion.setVisible(true);
           this.dispose();
       } 
    }
}

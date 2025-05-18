
package com.umg.curso.controldepacientes.Vista.Admin;

import com.umg.curso.controldepacientes.Controller.PacienteController;
import com.umg.curso.controldepacientes.Modelo.Doctor;
import com.umg.curso.controldepacientes.Vista.Doctores.FmrDoctores;
import com.umg.curso.controldepacientes.Vista.Recepcion.FmrPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FmrRegistrarDoctor extends javax.swing.JFrame implements ActionListener{

   
    public FmrRegistrarDoctor() {
        initComponents();
        btnRegistrar.addActionListener(this);
        btnSalir.addActionListener(this);
        btnSalir.setOpaque(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setBorderPainted(false);
        btnSalir.setFocusPainted(false);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("REGISTRAR DOCTOR");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(250, 20, 434, 48);

        btnRegistrar.setText("Registrar");
        jPanel1.add(btnRegistrar);
        btnRegistrar.setBounds(400, 270, 130, 23);

        jLabel1.setText("Apellidos:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(360, 180, 60, 20);

        jLabel2.setText("ID:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(360, 120, 60, 20);

        jLabel3.setText("Nombres:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(360, 150, 60, 20);
        jPanel1.add(txtID);
        txtID.setBounds(430, 120, 60, 22);
        jPanel1.add(txtNombre);
        txtNombre.setBounds(430, 150, 150, 22);
        jPanel1.add(txtApellido);
        txtApellido.setBounds(430, 180, 150, 22);

        btnSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\boton-de-flecha-izquierda-del-teclado.png")); // NOI18N
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnSalir);
        btnSalir.setBounds(20, 20, 40, 40);

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
            java.util.logging.Logger.getLogger(FmrRegistrarDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmrRegistrarDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmrRegistrarDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrRegistrarDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmrRegistrarDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnRegistrar){
            PacienteController controlador = new PacienteController();
            Doctor doctor= new Doctor();
            doctor.setId(Integer.parseInt(txtID.getText()));
            doctor.setNombre(txtNombre.getText());
            doctor.setApellido(txtApellido.getText());
            controlador.GuardarDoctor(doctor);
            if(true){
                Limpiar();
            }
            
        }
        if(e.getSource()== btnSalir){
            FmrAdmin VistaAdmin = new FmrAdmin();
            VistaAdmin.setBounds(0, 0, 900, 600);
            VistaAdmin.setVisible(true);
            this.dispose();
       } 
    }
    
    public void Limpiar(){
        txtApellido.setText("");
        txtID.setText("");
        txtNombre.setText("");
    }
}


package com.umg.curso.controldepacientes.Vista;

import com.umg.curso.controldepacientes.Vista.Doctores.FmrDoctores;
import com.umg.curso.controldepacientes.Vista.Recepcion.FmrPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class FmrCredenciales extends javax.swing.JFrame implements ActionListener {

   
    public FmrCredenciales() {
        initComponents();
        btnIngresar.addActionListener(this);
        btnLimpiar.addActionListener(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("VITAL CARE");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(160, 20, 110, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("User:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(100, 100, 70, 20);
        jPanel2.add(txtUsuario);
        txtUsuario.setBounds(180, 100, 120, 22);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 140);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 150, 90, 19);
        jPanel1.add(txtPassword);
        txtPassword.setBounds(180, 150, 120, 22);

        btnIngresar.setText("Ingresar");
        jPanel1.add(btnIngresar);
        btnIngresar.setBounds(90, 220, 100, 23);

        btnLimpiar.setText("Limpiar");
        jPanel1.add(btnLimpiar);
        btnLimpiar.setBounds(210, 220, 110, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(FmrCredenciales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmrCredenciales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmrCredenciales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrCredenciales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmrCredenciales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnIngresar){
            if (txtUsuario.getText().equals("Recepcion" ) && txtPassword.getText().equals("Recepcion" )) {
                FmrPrincipal VistaRecepcion = new FmrPrincipal();
                VistaRecepcion.setBounds(0, 0, 900, 600);
                VistaRecepcion.setVisible(true);
                this.dispose();
            } else if (txtUsuario.getText().equals("Doctores") && txtPassword.getText().equals("Doctores")) {
                FmrDoctores VistaDoctores = new FmrDoctores();
                VistaDoctores.setBounds(0, 0, 900, 600);
                VistaDoctores.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuario y/o Contraseña incorrecta");
            }
                
        }
        else if(e.getSource()==btnLimpiar){
            txtUsuario.setText("");
            txtPassword.setText("");
        }
               
    }
}

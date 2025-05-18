
package com.umg.curso.controldepacientes.Vista.Admin;

import com.umg.curso.controldepacientes.Vista.FmrLogin;
import com.umg.curso.controldepacientes.Vista.Recepcion.FmrPacientes;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class FmrAdmin extends javax.swing.JFrame implements MouseListener {

    
    public FmrAdmin() {
        initComponents();
        btnSalir.addMouseListener(this);
        btnRegistrar.addMouseListener(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnReportes = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("CONTROL DE PACIENTES ");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(350, 270, 240, 48);

        btnSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\cerrar-sesion-de-usuario(1).png")); // NOI18N
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnSalir);
        btnSalir.setBounds(6, 6, 40, 50);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ADMINISTRADOR");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(250, 20, 434, 48);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 900, 101);

        btnReportes.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\informe-de-negocios.png")); // NOI18N
        getContentPane().add(btnReportes);
        btnReportes.setBounds(530, 210, 130, 170);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REPORTES ");
        jLabel2.setToolTipText("");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(540, 380, 110, 14);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Registrar Nuevo Doctor");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(240, 380, 130, 14);

        btnRegistrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\registro.png")); // NOI18N
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(240, 230, 128, 140);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 100, 900, 500);

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
            java.util.logging.Logger.getLogger(FmrAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmrAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmrAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmrAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnRegistrar;
    private javax.swing.JLabel btnReportes;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == btnSalir){
            FmrLogin Credenciales = new FmrLogin();
            Credenciales.setBounds(0, 0, 900, 500);
            Credenciales.setVisible(true);
            this.dispose();
        }
        if(e.getSource()==btnRegistrar){
           FmrRegistrarDoctor Registrar = new FmrRegistrarDoctor();
           Registrar.setBounds(0, 0, 900, 600);
           Registrar.setVisible(true);
           this.dispose();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}

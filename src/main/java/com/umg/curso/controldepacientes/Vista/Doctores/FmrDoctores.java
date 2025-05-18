
package com.umg.curso.controldepacientes.Vista.Doctores;

import com.umg.curso.controldepacientes.Vista.FmrLogin;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static java.lang.System.exit;


public class FmrDoctores extends javax.swing.JFrame implements MouseListener {


    public FmrDoctores() {
        setUndecorated(true);
        initComponents();
        btnInformacion.addMouseListener(this);
        btnSalir1.addMouseListener(this);
        btnCitas.addMouseListener(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        btnInformacion = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCitas = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnSalir1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("CONTROL DE PACIENTES ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(251, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(25, 25, 25))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 900, 0);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\historial-medico.png")); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(530, 210, 130, 170);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Agendar Cita Medica");
        jLabel2.setToolTipText("");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel2);
        jLabel2.setBounds(540, 380, 110, 14);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Registrar Nuevo Paciente");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(240, 380, 130, 14);

        btnRegistrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\paciente.png")); // NOI18N
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnRegistrar);
        btnRegistrar.setBounds(240, 230, 128, 140);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("ATENCION DE PACIENTES");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(260, 20, 460, 48);

        btnSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\cerrar-sesion-de-usuario(1).png")); // NOI18N
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(btnSalir);
        btnSalir.setBounds(6, 6, 40, 50);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 0, 900, 0);

        btnInformacion.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\perfil.png")); // NOI18N
        btnInformacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnInformacion);
        btnInformacion.setBounds(530, 210, 130, 170);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Ver informacion de Pacientes");
        jLabel7.setToolTipText("");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(520, 380, 150, 14);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Ver Citas");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(290, 380, 60, 14);

        btnCitas.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\cita.png")); // NOI18N
        btnCitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnCitas);
        btnCitas.setBounds(240, 230, 128, 140);

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));
        jPanel5.setLayout(null);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setText("CONTROL DE PACIENTES ");
        jPanel5.add(jLabel6);
        jLabel6.setBounds(350, 270, 240, 48);

        btnSalir1.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\cerrar-sesion-de-usuario(1).png")); // NOI18N
        btnSalir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(btnSalir1);
        btnSalir1.setBounds(6, 6, 40, 50);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ATENCION PACIENTES");
        jPanel5.add(jLabel9);
        jLabel9.setBounds(250, 20, 434, 48);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(0, 0, 900, 101);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 600);

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
            java.util.logging.Logger.getLogger(FmrDoctores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmrDoctores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmrDoctores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrDoctores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmrDoctores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCitas;
    private javax.swing.JLabel btnInformacion;
    private javax.swing.JLabel btnRegistrar;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel btnSalir1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()== btnInformacion){
            FmrTabla Informacion = new FmrTabla();
            Informacion.setBounds(0, 0, 900, 600);
            Informacion.setVisible(true);
            this.dispose();
        }
        if(e.getSource() == btnSalir1){
            FmrLogin Credenciales = new FmrLogin();
            Credenciales.setBounds(0, 0, 900, 500);
            Credenciales.setVisible(true);
            this.dispose();
        }
        if(e.getSource()==btnCitas){
            FmrTablaCitas Citas = new FmrTablaCitas();
            Citas.setBounds(0, 0, 900, 600);
            Citas.setVisible(true);
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

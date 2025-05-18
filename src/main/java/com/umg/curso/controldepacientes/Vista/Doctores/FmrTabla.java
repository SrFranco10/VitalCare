
package com.umg.curso.controldepacientes.Vista.Doctores;

import com.umg.curso.controldepacientes.Vista.Doctores.FmrDoctores;
import com.umg.curso.controldepacientes.Controller.PacienteController;
import com.umg.curso.controldepacientes.Modelo.Paciente;
import com.umg.curso.controldepacientes.sql.PConexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;


public class FmrTabla extends javax.swing.JFrame implements ActionListener {

    
    public FmrTabla() {
        initComponents();
        //se hace el llamado a base de datos para mostrar la informacion de pacientes a la tabla
        PacienteController controlador = new PacienteController();
        DefaultTableModel modelo = (DefaultTableModel) TableP.getModel();
        controlador.Consultar(modelo);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        TableP = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        TableP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TableP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TableP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableP);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 110, 880, 440);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("ATENCION DE PACIENTES");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(350, 270, 240, 48);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setText("INFORMACION PACIENTES");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(220, 20, 490, 48);

        btnSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\boton-de-flecha-izquierda-del-teclado.png")); // NOI18N
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(btnSalir);
        btnSalir.setBounds(10, 10, 40, 40);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 0, 900, 100);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablePMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePMouseClicked
        PConexion controlador = new PConexion();
        controlador.SeleccionarPaciente(TableP);
        this.dispose();
    }//GEN-LAST:event_TablePMouseClicked

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
            java.util.logging.Logger.getLogger(FmrTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmrTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmrTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmrTabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableP;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnSalir){
            FmrDoctores VistaDoctores = new FmrDoctores();
            VistaDoctores.setBounds(0, 0, 900, 600);
            VistaDoctores.setVisible(true);
            this.dispose();
        }
    }
}

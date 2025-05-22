/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.umg.curso.controldepacientes.Vista.Doctores;

import com.umg.curso.controldepacientes.Controller.PacienteController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;


public class FmrAntecedentes extends javax.swing.JFrame implements ActionListener {

  
    public FmrAntecedentes(Object[] datos) {
        initComponents();
        //se asigna el id del paciente selecionado para hacer la consulta
        int id_paciente = Integer.parseInt(datos[0].toString());
        //se hace la inicializacion del controlador para llamar la funcion que hace la consulta y la muestra en la tabla de antecedentes 
        PacienteController controlador = new PacienteController();
        //se establece un modelo a la tabla de antecedentes 
        DefaultTableModel modelo = (DefaultTableModel) TableA.getModel();
        controlador.ConsultarAntecedentes(modelo, id_paciente );
        
        //se inicializa el boton 
        btnSalir.addActionListener(this);
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        TableA = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(746, 470));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloPacientes.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tituloPacientes.setText("Antecedentes");
        background.add(tituloPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 366, 20));

        TableA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TableA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TableA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableAMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableA);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 850, 480));

        btnSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\boton-de-flecha-izquierda-del-teclado.png")); // NOI18N
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        background.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        getContentPane().add(background);
        background.setBounds(0, 0, 900, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TableAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableAMouseClicked
        
    }//GEN-LAST:event_TableAMouseClicked

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
            java.util.logging.Logger.getLogger(FmrAntecedentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmrAntecedentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmrAntecedentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrAntecedentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableA;
    private javax.swing.JPanel background;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tituloPacientes;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==btnSalir){
            //boton de salida cierra la ventana Antecedentes
            this.dispose();
        }
    }
}

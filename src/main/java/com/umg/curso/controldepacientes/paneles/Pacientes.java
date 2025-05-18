
package com.umg.curso.controldepacientes.paneles;

import com.umg.curso.controldepacientes.Controller.PacienteController;
import com.umg.curso.controldepacientes.sql.PConexion;
import javax.swing.table.DefaultTableModel;




public class Pacientes extends javax.swing.JPanel {

   
    public Pacientes() {
        initComponents();
        PacienteController controlador = new PacienteController();
        DefaultTableModel modelo = (DefaultTableModel) TableP.getModel();
        controlador.Consultar(modelo);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        tituloPacientes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableP = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(746, 470));
        setLayout(null);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(746, 470));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloPacientes.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tituloPacientes.setText("DEMO Pacientes ingresados");
        background.add(tituloPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 366, -1));

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

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 700, 490));

        add(background);
        background.setBounds(0, 0, 720, 530);
    }// </editor-fold>//GEN-END:initComponents

    private void TablePMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePMouseClicked
        PConexion controlador = new PConexion();
        controlador.SeleccionarPaciente(TableP);
        
    }//GEN-LAST:event_TablePMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableP;
    private javax.swing.JPanel background;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tituloPacientes;
    // End of variables declaration//GEN-END:variables
}

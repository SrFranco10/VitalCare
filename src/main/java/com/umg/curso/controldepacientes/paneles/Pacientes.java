
package com.umg.curso.controldepacientes.paneles;

import com.umg.curso.controldepacientes.Controller.PacienteController;
import com.umg.curso.controldepacientes.Vista.Doctores.FmrPaciente;
import com.umg.curso.controldepacientes.Vista.Doctores.darAlta;
import com.umg.curso.controldepacientes.sql.PConexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;




public class Pacientes extends javax.swing.JPanel implements ActionListener {

   PConexion controlador = new PConexion();
    public Pacientes() {
        initComponents();
        PacienteController controlador = new PacienteController();
        DefaultTableModel modelo = (DefaultTableModel) TableP.getModel();
        controlador.Consultar(modelo);
        btnDarAlta.addActionListener(this);
        btnModificar.addActionListener(this);
    }
    
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        tituloPacientes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableP = new javax.swing.JTable();
        btnDarAlta = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

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

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 700, 440));

        btnDarAlta.setText("Dar Alta");
        background.add(btnDarAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, -1, -1));

        btnModificar.setText("Modificar");
        background.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, -1, -1));

        add(background);
        background.setBounds(0, 0, 720, 530);
    }// </editor-fold>//GEN-END:initComponents

    private void TablePMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePMouseClicked
        
        
        
    }//GEN-LAST:event_TablePMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableP;
    private javax.swing.JPanel background;
    private javax.swing.JButton btnDarAlta;
    private javax.swing.JButton btnModificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tituloPacientes;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnDarAlta){
                Object[] datos = (Object[]) controlador.SeleccionarPaciente(TableP);
                darAlta detalle = new darAlta(datos);
                detalle.setVisible(true);
        }
        if(e.getSource()==btnModificar){
                Object[] datos = (Object[]) controlador.SeleccionarPaciente(TableP);
                FmrPaciente detalle = new FmrPaciente(datos);
                detalle.setVisible(true);
        }
        
    }
}

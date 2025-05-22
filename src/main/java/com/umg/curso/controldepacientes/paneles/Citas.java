
package com.umg.curso.controldepacientes.paneles;

import com.umg.curso.controldepacientes.Controller.PacienteController;
import com.umg.curso.controldepacientes.sql.PConexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Citas extends javax.swing.JPanel implements ActionListener {
    PacienteController controlador = new PacienteController();
    PConexion controlador1 = new PConexion();
    public Citas() {
        initComponents();
        //se hace el llamado a base de datos para mostrar la informacion de citas a la tabla
        
        DefaultTableModel modelo = (DefaultTableModel) TableC.getModel();
        controlador.ConsultarCitas(modelo);
        
        //se inicializa el boton 
        btnCita.addActionListener(this);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        tituloCitas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableC = new javax.swing.JTable();
        btnCita = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(746, 470));
        setLayout(null);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(746, 470));
        background.setLayout(null);

        tituloCitas.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tituloCitas.setText("DEMO Citas pendientes");
        background.add(tituloCitas);
        tituloCitas.setBounds(20, 10, 366, 19);

        TableC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TableC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableCMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableC);

        background.add(jScrollPane1);
        jScrollPane1.setBounds(10, 40, 690, 440);

        btnCita.setText("Cita atendida");
        background.add(btnCita);
        btnCita.setBounds(280, 490, 120, 23);

        add(background);
        background.setBounds(0, 0, 720, 530);
    }// </editor-fold>//GEN-END:initComponents

    private void TableCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableCMouseClicked

    }//GEN-LAST:event_TableCMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableC;
    private javax.swing.JPanel background;
    private javax.swing.JButton btnCita;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tituloCitas;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnCita){
            //se llama una funcion que extrae los datos de la tabla citas
            Object[] datos = (Object[]) controlador1.SeleccionarCita(TableC);
            //se determina una variable con el ID para hacer la consulta 
            int id_cita = Integer.parseInt(datos[0].toString());
            String NombrePaciente = datos[1].toString();
            
            //se llama al metodo de eliminar y se extrae el resultado 
            boolean resultado=controlador.EliminarCita(id_cita);
            //si el resultado es correcto mostrarle un mensaje al usuario
            if(resultado= true){
                JOptionPane.showMessageDialog(null, "Cita Atendida Correctamente del Paciente " + NombrePaciente);
                
            }
            
        }
    }
}

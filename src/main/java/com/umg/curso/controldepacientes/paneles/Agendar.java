
package com.umg.curso.controldepacientes.paneles;

import com.umg.curso.controldepacientes.Controller.PacienteController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Agendar extends javax.swing.JPanel implements ActionListener {

    PacienteController controlador = new PacienteController();

    public Agendar() {
        initComponents();
        //Llenamos los ComboBox

        controlador.Llenarbox(boxDoctores, boxPacientes);
        btnRegistrar.addActionListener(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        apellidos = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        tituloCita = new javax.swing.JLabel();
        boxPacientes = new javax.swing.JComboBox<>();
        boxDoctores = new javax.swing.JComboBox<>();
        jSeparator10 = new javax.swing.JSeparator();
        Fecha = new javax.swing.JSpinner();
        btnRegistrar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(746, 470));
        setLayout(null);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(746, 470));
        background.setLayout(null);

        nombre.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        nombre.setText("Nombre de Paciente");
        background.add(nombre);
        nombre.setBounds(80, 150, 160, 19);

        fecha.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        fecha.setText("Fecha de cita (ingresar manualmente)");
        background.add(fecha);
        fecha.setBounds(80, 230, 260, 19);

        apellidos.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        apellidos.setText("Doctor Asignado");
        background.add(apellidos);
        apellidos.setBounds(80, 190, 130, 19);
        background.add(jSeparator3);
        jSeparator3.setBounds(80, 210, 520, 13);
        background.add(jSeparator5);
        jSeparator5.setBounds(80, 250, 526, 13);

        tituloCita.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tituloCita.setText("DEMO Agendar citas");
        background.add(tituloCita);
        tituloCita.setBounds(80, 40, 366, 19);

        background.add(boxPacientes);
        boxPacientes.setBounds(360, 150, 240, 22);

        background.add(boxDoctores);
        boxDoctores.setBounds(360, 190, 240, 22);
        background.add(jSeparator10);
        jSeparator10.setBounds(80, 170, 520, 13);

        Fecha.setModel(new javax.swing.SpinnerDateModel());
        background.add(Fecha);
        Fecha.setBounds(480, 230, 128, 22);

        btnRegistrar.setText("Registrar");
        background.add(btnRegistrar);
        btnRegistrar.setBounds(290, 280, 120, 23);

        add(background);
        background.setBounds(0, 0, 720, 530);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner Fecha;
    private javax.swing.JLabel apellidos;
    private javax.swing.JPanel background;
    private javax.swing.JComboBox<String> boxDoctores;
    private javax.swing.JComboBox<String> boxPacientes;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel fecha;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel tituloCita;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRegistrar) {
            //Se realiza la comprobacion que se selecciono un paciente y doctor
            if ("<Seleccione un Paciente>".equals(boxPacientes.getSelectedItem()) || boxDoctores.getSelectedIndex()==0) {
                JOptionPane.showMessageDialog(null, "Seleccione un Doctor y Paciente");
            } else {
                //se llama el metodo agregar cita
                controlador.agregarCita(boxDoctores, boxPacientes, Fecha);
                //se reinicia todos los valores
                boxDoctores.setSelectedIndex(0);
                boxPacientes.setSelectedIndex(0);
                Fecha.setValue(new java.util.Date());
            }

        }
    }
}

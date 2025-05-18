
package com.umg.curso.controldepacientes.paneles;

import com.umg.curso.controldepacientes.Controller.PacienteController;
import com.umg.curso.controldepacientes.Modelo.Doctor;
import com.umg.curso.controldepacientes.Modelo.Paciente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import java.util.Date;
import javax.swing.JOptionPane;


public class Agendar extends javax.swing.JPanel implements ActionListener {

    PacienteController controlador = new PacienteController();
    public Agendar() {
        initComponents();
        controlador.Llenarbox(boxDoctores, boxPacientes);
        btnRegistrar.addActionListener(this);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        apellidos = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        tituloCita = new javax.swing.JLabel();
        txtCita = new javax.swing.JTextField();
        boxPacientes = new javax.swing.JComboBox<>();
        jSeparator7 = new javax.swing.JSeparator();
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

        id.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        id.setText("id");
        background.add(id);
        id.setBounds(80, 120, 11, 19);

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
        background.add(txtCita);
        txtCita.setBounds(530, 120, 64, 22);

        background.add(boxPacientes);
        boxPacientes.setBounds(360, 150, 240, 22);
        background.add(jSeparator7);
        jSeparator7.setBounds(80, 140, 520, 13);

        background.add(boxDoctores);
        boxDoctores.setBounds(360, 190, 240, 22);
        background.add(jSeparator10);
        jSeparator10.setBounds(80, 170, 520, 13);

        Fecha.setModel(new javax.swing.SpinnerDateModel());
        background.add(Fecha);
        Fecha.setBounds(470, 230, 128, 22);

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
    private javax.swing.JLabel id;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel tituloCita;
    private javax.swing.JTextField txtCita;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRegistrar) {
            Doctor doctorSeleccionado = (Doctor) boxDoctores.getSelectedItem();
            Paciente pacienteSeleccionado = (Paciente) boxPacientes.getSelectedItem();
            int idDoctor = doctorSeleccionado.getId();
            int idPaciente = pacienteSeleccionado.getID();
            Date fechaSeleccionada = (Date) Fecha.getValue();
            Timestamp timestamp = new Timestamp(fechaSeleccionada.getTime());
            controlador.agregarCita(txtCita, idPaciente, idDoctor, timestamp);
            if(true){
                JOptionPane.showMessageDialog(null, "Se Agendo correctamente la Cita");
            }
            boxDoctores.setSelectedIndex(0);
            boxPacientes.setSelectedIndex(0);
            Fecha.setValue(new java.util.Date());
            txtCita.setText("");
        }
    }
}

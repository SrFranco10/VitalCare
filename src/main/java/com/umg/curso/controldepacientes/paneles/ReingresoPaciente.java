/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.umg.curso.controldepacientes.paneles;

import com.umg.curso.controldepacientes.Controller.PacienteController;
import com.umg.curso.controldepacientes.Modelo.Doctor;
import com.umg.curso.controldepacientes.Modelo.Paciente;
import com.umg.curso.controldepacientes.sql.PConexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ReingresoPaciente extends javax.swing.JPanel implements ActionListener {

    
    public ReingresoPaciente() {
        initComponents();
        btnBuscar.addActionListener(this);
        btnReingresar.addActionListener(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        fecha = new javax.swing.JLabel();
        txtIngreso = new javax.swing.JTextField();
        motivoIngreso = new javax.swing.JLabel();
        txtEnfermedad = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        apellidos = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        edad = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        Ntelefono = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        direccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btnReingresar = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        btnBuscar = new javax.swing.JButton();

        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        nombre.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        nombre.setText("Nombre");
        jPanel1.add(nombre);
        nombre.setBounds(90, 100, 72, 19);
        jPanel1.add(txtNombre);
        txtNombre.setBounds(350, 100, 212, 22);

        fecha.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        fecha.setText("Fecha de ingreso (ingresar manualmente)");
        jPanel1.add(fecha);
        fecha.setBounds(90, 340, 266, 19);
        jPanel1.add(txtIngreso);
        txtIngreso.setBounds(380, 340, 180, 22);

        motivoIngreso.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        motivoIngreso.setText("Enfermedad");
        jPanel1.add(motivoIngreso);
        motivoIngreso.setBounds(90, 300, 112, 19);
        jPanel1.add(txtEnfermedad);
        txtEnfermedad.setBounds(350, 300, 210, 22);

        id.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        id.setText("id");
        jPanel1.add(id);
        id.setBounds(90, 60, 11, 19);
        jPanel1.add(txtID);
        txtID.setBounds(350, 60, 210, 22);

        apellidos.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        apellidos.setText("Apellidos");
        jPanel1.add(apellidos);
        apellidos.setBounds(90, 140, 60, 19);
        jPanel1.add(txtApellidos);
        txtApellidos.setBounds(350, 140, 212, 22);

        edad.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        edad.setText("Edad");
        jPanel1.add(edad);
        edad.setBounds(90, 180, 47, 19);
        jPanel1.add(txtEdad);
        txtEdad.setBounds(350, 180, 212, 22);

        Ntelefono.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Ntelefono.setText("Numero Telefonico");
        jPanel1.add(Ntelefono);
        Ntelefono.setBounds(90, 220, 150, 19);
        jPanel1.add(txtNumero);
        txtNumero.setBounds(350, 220, 212, 22);

        direccion.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        direccion.setText("Direccion ");
        jPanel1.add(direccion);
        direccion.setBounds(90, 260, 80, 19);
        jPanel1.add(txtDireccion);
        txtDireccion.setBounds(350, 260, 210, 22);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(90, 360, 474, 13);

        btnReingresar.setText("Reingresar Paciente");
        jPanel1.add(btnReingresar);
        btnReingresar.setBounds(210, 410, 140, 23);
        jPanel1.add(jSeparator7);
        jSeparator7.setBounds(90, 80, 474, 13);
        jPanel1.add(jSeparator10);
        jSeparator10.setBounds(90, 120, 474, 13);
        jPanel1.add(jSeparator11);
        jSeparator11.setBounds(90, 160, 474, 13);
        jPanel1.add(jSeparator12);
        jSeparator12.setBounds(90, 200, 474, 13);
        jPanel1.add(jSeparator13);
        jSeparator13.setBounds(90, 240, 474, 13);
        jPanel1.add(jSeparator14);
        jSeparator14.setBounds(90, 280, 474, 13);
        jPanel1.add(jSeparator15);
        jSeparator15.setBounds(90, 320, 474, 13);

        btnBuscar.setText("Buscar");
        jPanel1.add(btnBuscar);
        btnBuscar.setBounds(380, 410, 75, 23);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 720, 530);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ntelefono;
    private javax.swing.JLabel apellidos;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnReingresar;
    private javax.swing.JLabel direccion;
    private javax.swing.JLabel edad;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel id;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel motivoIngreso;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEnfermedad;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIngreso;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnBuscar) {
            try {
                int id_paciente = Integer.parseInt(txtID.getText());
                PConexion controlador = new PConexion();
                controlador.establecerConexion();
                Paciente paciente = (Paciente) controlador.ConsultarPaciente(id_paciente);

                if (paciente != null) {
                    txtNombre.setText(paciente.getNombres());
                    txtApellidos.setText(paciente.getApellidos());
                    txtEdad.setText(String.valueOf(paciente.getEdad()));
                    txtNumero.setText(String.valueOf(paciente.getNumero()));
                    txtDireccion.setText(paciente.getDireccion());

                } else {
                    JOptionPane.showMessageDialog(null, "Paciente no encontrado");
                    txtID.setText("");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "ID inválido");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al consultar paciente: " + ex.getMessage());
            }

        }
        if(e.getSource()==btnReingresar){
            int ID= Integer.parseInt(txtID.getText());
           
           Paciente paciente= new Paciente();
           PacienteController controlador = new PacienteController();
           paciente.setNombres(txtNombre.getText());
           paciente.setApellidos(txtApellidos.getText());
           paciente.setEdad(Integer.parseInt(txtEdad.getText()));
           paciente.setNumero(Integer.parseInt(txtNumero.getText()));
           paciente.setDireccion(txtDireccion.getText());
           paciente.setEnfermedad(txtEnfermedad.getText());
           paciente.setIngreso(txtIngreso.getText());
           controlador.Reingreso(paciente,ID);
        }
    }
}

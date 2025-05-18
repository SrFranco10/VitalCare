/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.umg.curso.controldepacientes.Vista.Recepcion;
import com.umg.curso.controldepacientes.Vista.Recepcion.FmrPrincipal;
import com.umg.curso.controldepacientes.Controller.PacienteController;
import com.umg.curso.controldepacientes.Modelo.Doctor;
import com.umg.curso.controldepacientes.Modelo.Paciente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.sql.Timestamp;
import java.util.Date;
import java.util.TimeZone;
import javax.swing.JOptionPane;


public class FmrCita extends javax.swing.JFrame implements ActionListener, MouseListener {

    PacienteController controlador = new PacienteController();
    public FmrCita() {
        setUndecorated(true);
        initComponents();
        controlador.Llenarbox(boxDoctores, boxPacientes);
        btnRegistrar.addActionListener(this);
        btnSalir.addMouseListener(this);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boxDoctores = new javax.swing.JComboBox<>();
        boxPacientes = new javax.swing.JComboBox<>();
        Fecha = new javax.swing.JSpinner();
        btnRegistrar = new javax.swing.JButton();
        txtCita = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel1.add(boxDoctores);
        boxDoctores.setBounds(440, 170, 240, 22);

        jPanel1.add(boxPacientes);
        boxPacientes.setBounds(190, 170, 210, 22);

        Fecha.setModel(new javax.swing.SpinnerDateModel());
        jPanel1.add(Fecha);
        Fecha.setBounds(700, 170, 128, 22);

        btnRegistrar.setText("Registrar");
        jPanel1.add(btnRegistrar);
        btnRegistrar.setBounds(370, 240, 120, 23);
        jPanel1.add(txtCita);
        txtCita.setBounds(60, 170, 64, 22);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("CONTROL DE PACIENTES ");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(350, 270, 240, 48);

        btnSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\boton-de-flecha-izquierda-del-teclado.png")); // NOI18N
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnSalir);
        btnSalir.setBounds(6, 6, 40, 50);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("AGENDAR CITA");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(250, 20, 434, 48);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 900, 101);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Fecha");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(700, 150, 130, 16);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ID");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 150, 20, 17);

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre de Paciente");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(190, 150, 130, 16);

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Doctor Asignado");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(440, 150, 130, 16);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmrCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner Fecha;
    private javax.swing.JComboBox<String> boxDoctores;
    private javax.swing.JComboBox<String> boxPacientes;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
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
            System.out.println("Fecha seleccionada: " + fechaSeleccionada);

            Timestamp timestamp = new Timestamp(fechaSeleccionada.getTime());
            System.out.println("Timestamp que se enviará: " + timestamp);
            controlador.agregarCita(txtCita, idPaciente, idDoctor, timestamp);
            if(true){
                JOptionPane.showMessageDialog(null, "Se Agendo correctamente la Cita");
            }
        }
                
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == btnSalir){
            FmrPrincipal Principal = new FmrPrincipal();
            Principal.setBounds(0, 0, 900, 600);
            Principal.setVisible(true);
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

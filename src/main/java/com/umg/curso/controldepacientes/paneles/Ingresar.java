
package com.umg.curso.controldepacientes.paneles;

import com.umg.curso.controldepacientes.Controller.PacienteController;
import com.umg.curso.controldepacientes.Modelo.Paciente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ingresar extends javax.swing.JPanel implements ActionListener {

    
    public Ingresar() {
        initComponents();
        btnAgregar.addActionListener(this);
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
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
        tituloIngreso = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(746, 470));
        setLayout(null);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(746, 470));
        background.setLayout(null);

        nombre.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        nombre.setText("Nombre");
        background.add(nombre);
        nombre.setBounds(90, 100, 72, 19);
        background.add(txtNombre);
        txtNombre.setBounds(350, 100, 212, 22);

        fecha.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        fecha.setText("Fecha de ingreso (ingresar manualmente)");
        background.add(fecha);
        fecha.setBounds(90, 340, 266, 19);
        background.add(txtIngreso);
        txtIngreso.setBounds(380, 340, 180, 22);

        motivoIngreso.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        motivoIngreso.setText("Enfermedad");
        background.add(motivoIngreso);
        motivoIngreso.setBounds(90, 300, 112, 19);
        background.add(txtEnfermedad);
        txtEnfermedad.setBounds(350, 300, 210, 22);

        id.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        id.setText("id");
        background.add(id);
        id.setBounds(90, 60, 11, 19);
        background.add(txtID);
        txtID.setBounds(350, 60, 210, 22);

        apellidos.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        apellidos.setText("Apellidos");
        background.add(apellidos);
        apellidos.setBounds(90, 140, 60, 19);
        background.add(txtApellidos);
        txtApellidos.setBounds(350, 140, 212, 22);

        edad.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        edad.setText("Edad");
        background.add(edad);
        edad.setBounds(90, 180, 47, 19);
        background.add(txtEdad);
        txtEdad.setBounds(350, 180, 212, 22);

        Ntelefono.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Ntelefono.setText("Numero Telefonico");
        background.add(Ntelefono);
        Ntelefono.setBounds(90, 220, 150, 19);
        background.add(txtNumero);
        txtNumero.setBounds(350, 220, 212, 22);

        direccion.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        direccion.setText("Direccion ");
        background.add(direccion);
        direccion.setBounds(90, 260, 80, 19);
        background.add(txtDireccion);
        txtDireccion.setBounds(350, 260, 210, 22);
        background.add(jSeparator3);
        jSeparator3.setBounds(90, 360, 474, 13);

        tituloIngreso.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tituloIngreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloIngreso.setText("DEMO Ingreso de pacientes");
        background.add(tituloIngreso);
        tituloIngreso.setBounds(100, 20, 560, 19);

        btnAgregar.setText("Ingresar Paciente");
        background.add(btnAgregar);
        btnAgregar.setBounds(310, 390, 140, 23);
        background.add(jSeparator7);
        jSeparator7.setBounds(90, 80, 474, 13);
        background.add(jSeparator10);
        jSeparator10.setBounds(90, 120, 474, 13);
        background.add(jSeparator11);
        jSeparator11.setBounds(90, 160, 474, 13);
        background.add(jSeparator12);
        jSeparator12.setBounds(90, 200, 474, 13);
        background.add(jSeparator13);
        jSeparator13.setBounds(90, 240, 474, 13);
        background.add(jSeparator14);
        jSeparator14.setBounds(90, 280, 474, 13);
        background.add(jSeparator15);
        jSeparator15.setBounds(90, 320, 474, 13);

        add(background);
        background.setBounds(0, 0, 720, 530);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ntelefono;
    private javax.swing.JLabel apellidos;
    private javax.swing.JPanel background;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel direccion;
    private javax.swing.JLabel edad;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel id;
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
    private javax.swing.JLabel tituloIngreso;
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
       if(e.getSource()==btnAgregar){
           Paciente paciente= new Paciente();
           PacienteController controlador = new PacienteController();
           paciente.setID(Integer.parseInt(txtID.getText()));
           paciente.setNombres(txtNombre.getText());
           paciente.setApellidos(txtApellidos.getText());
           paciente.setEdad(Integer.parseInt(txtEdad.getText()));
           paciente.setNumero(Integer.parseInt(txtNumero.getText()));
           paciente.setDireccion(txtDireccion.getText());
           paciente.setEnfermedad(txtEnfermedad.getText());
           paciente.setIngreso(txtIngreso.getText());
           controlador.Guardar(paciente);
           if(true){
               Limpiar();
           }
           
           
           
       }
    }
    
    public void Limpiar(){
        txtID.setText("");
        txtNombre.setText("");
        txtApellidos.setText("");
        txtEdad.setText("");
        txtNumero.setText("");
        txtDireccion.setText("");
        txtEnfermedad.setText("");
        txtIngreso.setText("");
        
    }
}

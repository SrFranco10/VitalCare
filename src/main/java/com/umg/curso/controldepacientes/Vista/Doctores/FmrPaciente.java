
package com.umg.curso.controldepacientes.Vista.Doctores;

import com.umg.curso.controldepacientes.Controller.PacienteController;
import com.umg.curso.controldepacientes.Modelo.Doctor;
import com.umg.curso.controldepacientes.Modelo.Paciente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;


public class FmrPaciente extends javax.swing.JFrame implements ActionListener {

    PacienteController controlador = new PacienteController();
    int Id_paciente;
    String Estado;
    public FmrPaciente(Object[] datos) {
        setUndecorated(true);
        initComponents();
        btnModificar.addActionListener(this);
        //Llenamos el comboBox de doctores
       String doctorValor = (datos[8] != null) ? datos[8].toString() : "";
        controlador.LlenarboxD(boxDoc);
        seleccionarItemParecido(boxDoc, doctorValor);
        //llenamos y separamos el nombre y apellido
        Id_paciente=Integer.parseInt(datos[0].toString());
        String[] partes = datos[1].toString().trim().split(" ");
        String nombre = partes.length > 0 ? partes[0] : "";
        String apellido = partes.length > 1 ? partes[1] : "";
        //verificamos si estado no esta nulo 
        
        txtNombreCompleto.setText(nombre);
        txtApellidos.setText(apellido);
        txtEdad.setText(datos[2].toString());
        txtNumero.setText(datos[3].toString());
        txtDireccion.setText(datos[4].toString());
        txtEnfermedad.setText(datos[5].toString());
        txtIngreso.setText(datos[6].toString());
        Estado=datos[7].toString();

        //se configura boton de salida para que se vea opaco (estetica)
        btnSalir.setOpaque(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setBorderPainted(false);
        btnSalir.setFocusPainted(false);
        btnSalir.addActionListener(this);
        if(boxDoc.getSelectedItem().toString().equals("<Falta  Asignar>")){
            boxDoc.setEnabled(false);
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        txtNombreCompleto = new javax.swing.JTextField();
        fecha = new javax.swing.JLabel();
        txtIngreso = new javax.swing.JTextField();
        motivoIngreso = new javax.swing.JLabel();
        txtEnfermedad = new javax.swing.JTextField();
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
        btnModificar = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        btnSalir = new javax.swing.JButton();
        motivoIngreso1 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        boxDoc = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        background.setPreferredSize(new java.awt.Dimension(746, 470));
        background.setLayout(null);

        nombre.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.setText("Nombre");
        background.add(nombre);
        nombre.setBounds(220, 100, 72, 19);
        background.add(txtNombreCompleto);
        txtNombreCompleto.setBounds(480, 100, 212, 22);

        fecha.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        fecha.setForeground(new java.awt.Color(0, 0, 0));
        fecha.setText("Fecha de ingreso ");
        background.add(fecha);
        fecha.setBounds(220, 380, 240, 19);
        background.add(txtIngreso);
        txtIngreso.setBounds(480, 380, 210, 22);

        motivoIngreso.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        motivoIngreso.setForeground(new java.awt.Color(0, 0, 0));
        motivoIngreso.setText("Doctor Asignado");
        background.add(motivoIngreso);
        motivoIngreso.setBounds(220, 340, 112, 19);
        background.add(txtEnfermedad);
        txtEnfermedad.setBounds(480, 300, 210, 22);

        apellidos.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        apellidos.setForeground(new java.awt.Color(0, 0, 0));
        apellidos.setText("Apellidos");
        background.add(apellidos);
        apellidos.setBounds(220, 140, 60, 19);
        background.add(txtApellidos);
        txtApellidos.setBounds(480, 140, 212, 22);

        edad.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        edad.setForeground(new java.awt.Color(0, 0, 0));
        edad.setText("Edad");
        background.add(edad);
        edad.setBounds(220, 180, 47, 19);
        background.add(txtEdad);
        txtEdad.setBounds(480, 180, 212, 22);

        Ntelefono.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Ntelefono.setForeground(new java.awt.Color(0, 0, 0));
        Ntelefono.setText("Número Telefónico");
        background.add(Ntelefono);
        Ntelefono.setBounds(220, 220, 120, 19);
        background.add(txtNumero);
        txtNumero.setBounds(480, 220, 212, 22);

        direccion.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        direccion.setForeground(new java.awt.Color(0, 0, 0));
        direccion.setText("Dirección ");
        background.add(direccion);
        direccion.setBounds(220, 260, 80, 19);
        background.add(txtDireccion);
        txtDireccion.setBounds(480, 260, 210, 22);
        background.add(jSeparator3);
        jSeparator3.setBounds(220, 400, 474, 13);

        tituloIngreso.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        tituloIngreso.setForeground(new java.awt.Color(68, 179, 216));
        tituloIngreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloIngreso.setText("MODIFICAR PACIENTE");
        background.add(tituloIngreso);
        tituloIngreso.setBounds(220, 30, 560, 32);

        btnModificar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnModificar.setText("Modificar");
        background.add(btnModificar);
        btnModificar.setBounds(430, 470, 140, 24);
        background.add(jSeparator10);
        jSeparator10.setBounds(220, 120, 474, 13);
        background.add(jSeparator11);
        jSeparator11.setBounds(220, 160, 474, 13);
        background.add(jSeparator12);
        jSeparator12.setBounds(220, 200, 474, 13);
        background.add(jSeparator13);
        jSeparator13.setBounds(220, 240, 474, 13);
        background.add(jSeparator14);
        jSeparator14.setBounds(220, 280, 474, 13);
        background.add(jSeparator15);
        jSeparator15.setBounds(220, 360, 474, 13);

        btnSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\boton-de-flecha-izquierda-del-teclado.png")); // NOI18N
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        background.add(btnSalir);
        btnSalir.setBounds(10, 10, 40, 40);

        motivoIngreso1.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        motivoIngreso1.setForeground(new java.awt.Color(0, 0, 0));
        motivoIngreso1.setText("Enfermedad");
        background.add(motivoIngreso1);
        motivoIngreso1.setBounds(220, 300, 112, 19);
        background.add(jSeparator16);
        jSeparator16.setBounds(220, 320, 474, 13);

        background.add(boxDoc);
        boxDoc.setBounds(480, 340, 210, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
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
            java.util.logging.Logger.getLogger(FmrPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmrPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmrPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ntelefono;
    private javax.swing.JLabel apellidos;
    private javax.swing.JPanel background;
    private javax.swing.JComboBox<String> boxDoc;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel direccion;
    private javax.swing.JLabel edad;
    private javax.swing.JLabel fecha;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel motivoIngreso;
    private javax.swing.JLabel motivoIngreso1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel tituloIngreso;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEnfermedad;
    private javax.swing.JTextField txtIngreso;
    private javax.swing.JTextField txtNombreCompleto;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
    
    public void seleccionarItemParecido(JComboBox comboBox, String textoBuscado) {
    for (int i = 0; i < comboBox.getItemCount(); i++) {
        Object item = comboBox.getItemAt(i);
        if (item.toString().toLowerCase().contains(textoBuscado.toLowerCase())) {
            comboBox.setSelectedIndex(i);
            break;
        }
    }
}
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnModificar){
           
           Doctor doctorSeleccionado = (Doctor) boxDoc.getSelectedItem();
           int idDoctor = doctorSeleccionado.getId();
           Paciente paciente= new Paciente();
           PacienteController controlador = new PacienteController();
           paciente.setNombres(txtNombreCompleto.getText());
           paciente.setApellidos(txtApellidos.getText());
           paciente.setEdad(Integer.parseInt(txtEdad.getText()));
           paciente.setNumero(Integer.parseInt(txtNumero.getText()));
           paciente.setDireccion(txtDireccion.getText());
           paciente.setEnfermedad(txtEnfermedad.getText());
           paciente.setDoctor(idDoctor);
           paciente.setIngreso(txtIngreso.getText());
           paciente.setSalida(Estado);
           controlador.Actualizar(paciente,Id_paciente);
           this.dispose();
           
           
        }else if(e.getSource()== btnSalir){
            this.dispose();
            
        }
                
    }
}

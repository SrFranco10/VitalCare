
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
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNombreCompleto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEnfermedad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtIngreso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        boxDoc = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);
        jPanel1.add(txtNombreCompleto);
        txtNombreCompleto.setBounds(360, 100, 90, 22);

        jLabel3.setText("Edad");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(300, 140, 30, 20);
        jPanel1.add(txtEdad);
        txtEdad.setBounds(360, 140, 90, 22);

        jLabel4.setText("Numero");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(470, 140, 60, 20);
        jPanel1.add(txtNumero);
        txtNumero.setBounds(530, 140, 100, 22);

        jLabel5.setText("Apellidos");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(470, 100, 60, 20);
        jPanel1.add(txtApellidos);
        txtApellidos.setBounds(530, 100, 100, 22);

        jLabel6.setText("Direccion");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(280, 180, 60, 20);
        jPanel1.add(txtDireccion);
        txtDireccion.setBounds(360, 180, 90, 22);

        jLabel7.setText("Enfermedad");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(470, 180, 70, 20);
        jPanel1.add(txtEnfermedad);
        txtEnfermedad.setBounds(540, 180, 90, 22);

        jLabel8.setText("Doctor");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(280, 220, 80, 20);

        jLabel9.setText("Ingreso");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(540, 220, 50, 20);
        jPanel1.add(txtIngreso);
        txtIngreso.setBounds(600, 220, 100, 22);

        jLabel1.setText("Modificar");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(480, 60, 60, 16);

        btnModificar.setText("Modificar");
        jPanel1.add(btnModificar);
        btnModificar.setBounds(470, 400, 100, 23);

        jLabel11.setText("Nombre");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(290, 100, 44, 20);

        btnSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\boton-de-flecha-izquierda-del-teclado.png")); // NOI18N
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnSalir);
        btnSalir.setBounds(10, 10, 40, 40);

        jPanel1.add(boxDoc);
        boxDoc.setBounds(330, 220, 190, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                .addContainerGap())
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
    private javax.swing.JComboBox<String> boxDoc;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
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

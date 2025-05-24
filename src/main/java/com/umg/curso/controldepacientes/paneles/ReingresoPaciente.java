//patalla donde podemos dar de alta al paciente ya atendido
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
        //se inicializan los botones
        btnBuscar.addActionListener(this);
        btnReingresar.addActionListener(this);
        btnReingresar.setEnabled(false);
        txtNombre.setEnabled(false);
        txtApellidos.setEnabled(false);
        txtEdad.setEnabled(false);
        txtNumero.setEnabled(false);
        txtEnfermedad.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtIngreso.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        tituloIngreso = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tituloIngreso.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        tituloIngreso.setForeground(new java.awt.Color(0, 26, 94));
        tituloIngreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloIngreso.setText("REINGRESO DE PACIENTE");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        nombre.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 230, 0, 0);
        jPanel2.add(nombre, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 148;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 0, 0);
        jPanel2.add(txtNombre, gridBagConstraints);

        fecha.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        fecha.setForeground(new java.awt.Color(0, 0, 0));
        fecha.setText("Fecha de ingreso ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 230, 0, 0);
        jPanel2.add(fecha, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 116;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 30, 0, 0);
        jPanel2.add(txtIngreso, gridBagConstraints);

        motivoIngreso.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        motivoIngreso.setForeground(new java.awt.Color(0, 0, 0));
        motivoIngreso.setText("Enfermedad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 230, 0, 0);
        jPanel2.add(motivoIngreso, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 146;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 0, 0);
        jPanel2.add(txtEnfermedad, gridBagConstraints);

        id.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        id.setForeground(new java.awt.Color(0, 0, 0));
        id.setText("ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 230, 0, 0);
        jPanel2.add(id, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 146;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 0, 0, 0);
        jPanel2.add(txtID, gridBagConstraints);

        apellidos.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        apellidos.setForeground(new java.awt.Color(0, 0, 0));
        apellidos.setText("Apellidos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 230, 0, 0);
        jPanel2.add(apellidos, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 148;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 0, 0);
        jPanel2.add(txtApellidos, gridBagConstraints);

        edad.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        edad.setForeground(new java.awt.Color(0, 0, 0));
        edad.setText("Edad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 230, 0, 0);
        jPanel2.add(edad, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 148;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 0, 0);
        jPanel2.add(txtEdad, gridBagConstraints);

        Ntelefono.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Ntelefono.setForeground(new java.awt.Color(0, 0, 0));
        Ntelefono.setText("Número Telefónico");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 31;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 230, 0, 0);
        jPanel2.add(Ntelefono, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 148;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 0, 0);
        jPanel2.add(txtNumero, gridBagConstraints);

        direccion.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        direccion.setForeground(new java.awt.Color(0, 0, 0));
        direccion.setText("Dirección ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 230, 0, 0);
        jPanel2.add(direccion, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 146;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 0, 0);
        jPanel2.add(txtDireccion, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 29;
        gridBagConstraints.gridwidth = 20;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 473;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 230, 0, 237);
        jPanel2.add(jSeparator3, gridBagConstraints);

        btnReingresar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnReingresar.setText("Reingresar");
        btnReingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReingresarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 32;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 55;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(37, 5, 292, 0);
        jPanel2.add(btnReingresar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 20;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 473;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 230, 0, 237);
        jPanel2.add(jSeparator7, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 20;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 473;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 230, 0, 237);
        jPanel2.add(jSeparator10, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 20;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 473;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 230, 0, 237);
        jPanel2.add(jSeparator11, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 20;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 473;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 230, 0, 237);
        jPanel2.add(jSeparator12, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 20;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 473;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 230, 0, 237);
        jPanel2.add(jSeparator13, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 21;
        gridBagConstraints.gridwidth = 20;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 473;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 230, 0, 237);
        jPanel2.add(jSeparator14, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.gridwidth = 20;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 473;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 230, 0, 237);
        jPanel2.add(jSeparator15, gridBagConstraints);

        btnBuscar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 32;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(37, 30, 292, 0);
        jPanel2.add(btnBuscar, gridBagConstraints);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(tituloIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(100, 100, 100))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 941, Short.MAX_VALUE)))
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tituloIngreso)
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReingresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReingresarActionPerformed


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
    private javax.swing.JPanel jPanel2;
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
        if (e.getSource() == btnBuscar) {
            try {
                //se toma el ID del paciente y se almacena en una variable
                int id_paciente = Integer.parseInt(txtID.getText());
                //se inicializa pconexion para iniciar conexion con la base de datos 
                PConexion controlador = new PConexion();
                controlador.establecerConexion();
                //se inicia el metodo de buscar el paciente para obtener los datos y se crea un objeto donde se almacenan 
                Paciente paciente = (Paciente) controlador.ConsultarPaciente(id_paciente);

                if (paciente != null) {
                    //se colocan la informacion extraida de la base de datos para su vizualizacion 
                    txtNombre.setText(paciente.getNombres());
                    txtApellidos.setText(paciente.getApellidos());
                    txtEdad.setText(String.valueOf(paciente.getEdad()));
                    txtNumero.setText(String.valueOf(paciente.getNumero()));
                    txtDireccion.setText(paciente.getDireccion());
                    txtNombre.setEnabled(true);
                    txtApellidos.setEnabled(true);
                    txtEdad.setEnabled(true);
                    txtNumero.setEnabled(true);
                    txtDireccion.setEnabled(true);
                    btnReingresar.setEnabled(true);
                    txtEnfermedad.setEnabled(true);
                    txtIngreso.setEnabled(true);
                     JOptionPane.showMessageDialog(null, "Paciente encontrado");

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
           //se prepara para dar alta y alguna modificacion del paciente reingresado
           Paciente paciente= new Paciente();
           PacienteController controlador = new PacienteController();
           //validacion que los campos de enfermedad y de ingreso no esten vacios
           if(txtEnfermedad.getText().trim().isEmpty() || txtIngreso.getText().trim().isEmpty()){
               JOptionPane.showMessageDialog(null, "Datos incompletos recuerde llenar todos los campos ");
           }else{
           paciente.setNombres(txtNombre.getText());
           paciente.setApellidos(txtApellidos.getText());
           paciente.setEdad(Integer.parseInt(txtEdad.getText()));
           paciente.setNumero(Integer.parseInt(txtNumero.getText()));
           paciente.setDireccion(txtDireccion.getText());
           paciente.setEnfermedad(txtEnfermedad.getText());
           paciente.setIngreso(txtIngreso.getText());
           controlador.Reingreso(paciente,ID);
           txtNombre.setText("");
           txtApellidos.setText("");
           txtEdad.setText("");
           txtNumero.setText("");
           txtEnfermedad.setText("");
           txtIngreso.setText("");
           txtDireccion.setText("");
           txtID.setText("");
           
           }}
    }
}

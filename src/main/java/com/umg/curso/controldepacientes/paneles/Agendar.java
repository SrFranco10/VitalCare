
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
        java.awt.GridBagConstraints gridBagConstraints;

        background = new javax.swing.JPanel();
        tituloIngreso = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        apellidos = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        boxPacientes = new javax.swing.JComboBox<>();
        boxDoctores = new javax.swing.JComboBox<>();
        jSeparator10 = new javax.swing.JSeparator();
        Fecha = new javax.swing.JSpinner();
        btnRegistrar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(746, 470));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(746, 470));

        tituloIngreso.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        tituloIngreso.setForeground(new java.awt.Color(0, 26, 94));
        tituloIngreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloIngreso.setText("REGISTRO DE PACIENTE");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        nombre.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.setText("Nombre de Paciente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 32;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 180, 0, 0);
        jPanel1.add(nombre, gridBagConstraints);

        fecha.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        fecha.setForeground(new java.awt.Color(0, 0, 0));
        fecha.setText("Fecha de cita (ingresar manualmente)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 180, 0, 0);
        jPanel1.add(fecha, gridBagConstraints);

        apellidos.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        apellidos.setForeground(new java.awt.Color(0, 0, 0));
        apellidos.setText("Doctor Asignado");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 180, 0, 0);
        jPanel1.add(apellidos, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 16;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 519;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 180, 0, 0);
        jPanel1.add(jSeparator3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 17;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 525;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 180, 0, 164);
        jPanel1.add(jSeparator5, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 168;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 10, 0, 0);
        jPanel1.add(boxPacientes, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 168;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 10, 0, 0);
        jPanel1.add(boxDoctores, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 16;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 519;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 180, 0, 0);
        jPanel1.add(jSeparator10, gridBagConstraints);

        Fecha.setModel(new javax.swing.SpinnerDateModel());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 70, 0, 0);
        jPanel1.add(Fecha, gridBagConstraints);

        btnRegistrar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnRegistrar.setText("Añadir");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 45;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 40, 56, 0);
        jPanel1.add(btnRegistrar, gridBagConstraints);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(tituloIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(262, 262, 262))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(tituloIngreso)
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner Fecha;
    private javax.swing.JLabel apellidos;
    private javax.swing.JPanel background;
    private javax.swing.JComboBox<String> boxDoctores;
    private javax.swing.JComboBox<String> boxPacientes;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel fecha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel tituloIngreso;
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

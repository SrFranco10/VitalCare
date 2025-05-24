package com.umg.curso.controldepacientes.Vista.Doctores;

import com.umg.curso.controldepacientes.Controller.PacienteController;
import com.umg.curso.controldepacientes.Modelo.Antecedente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class darAlta extends javax.swing.JFrame implements ActionListener {

    PacienteController controlador = new PacienteController();

    public darAlta(Object[] datos) {
        setUndecorated(true);

        initComponents();
        //se llena los campos con la informacion traida de la tabla
        controlador.LlenarboxP(txtNombre);
        seleccionarItemParecido(txtNombre, datos[1].toString());
        txtId.setText(datos[0].toString());
        txtEnfermedad.setText(datos[5].toString());
        txtFechaIngreso.setText(datos[6].toString());
        txtDoctor.setText(datos[8].toString());

        //se Inicializan los botones
        btnDarAlta.addActionListener(this);
        btnSalir.addActionListener(this);

        //se desactiva campos para que no sean modificados solo sean visibles
        txtId.setEnabled(false);
        txtEnfermedad.setEnabled(false);
        txtFechaIngreso.setEnabled(false);
        txtDoctor.setEnabled(false);
        txtNombre.setEnabled(false);

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

        background = new javax.swing.JPanel();
        tituloPacientes = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtEnfermedad = new javax.swing.JTextField();
        txtDoctor = new javax.swing.JTextField();
        txtFechaIngreso = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtNombre = new javax.swing.JComboBox<>();
        btnDarAlta = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        background.setPreferredSize(new java.awt.Dimension(746, 470));
        background.setLayout(null);

        tituloPacientes.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        tituloPacientes.setForeground(new java.awt.Color(68, 179, 216));
        tituloPacientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPacientes.setText("DAR DE ALTA AL PACIENTE");
        background.add(tituloPacientes);
        tituloPacientes.setBounds(290, 20, 366, 32);

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre del Paciente");
        background.add(jLabel1);
        jLabel1.setBounds(220, 110, 130, 16);

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID");
        background.add(jLabel2);
        jLabel2.setBounds(220, 70, 11, 16);

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Enfermedad");
        background.add(jLabel3);
        jLabel3.setBounds(220, 140, 80, 16);

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Doctor que Atendió");
        background.add(jLabel4);
        jLabel4.setBounds(220, 170, 120, 16);

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Fecha de Ingreso");
        background.add(jLabel5);
        jLabel5.setBounds(220, 200, 110, 16);

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Descripcion");
        background.add(jLabel6);
        jLabel6.setBounds(220, 240, 70, 16);
        background.add(txtId);
        txtId.setBounds(380, 70, 180, 22);
        background.add(txtEnfermedad);
        txtEnfermedad.setBounds(380, 140, 180, 22);
        background.add(txtDoctor);
        txtDoctor.setBounds(380, 170, 180, 22);
        background.add(txtFechaIngreso);
        txtFechaIngreso.setBounds(380, 200, 180, 22);

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        background.add(jScrollPane1);
        jScrollPane1.setBounds(320, 240, 390, 150);

        txtNombre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        background.add(txtNombre);
        txtNombre.setBounds(380, 110, 180, 22);

        btnDarAlta.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnDarAlta.setText("Dar de Alta");
        background.add(btnDarAlta);
        btnDarAlta.setBounds(420, 470, 120, 24);

        btnSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\boton-de-flecha-izquierda-del-teclado.png")); // NOI18N
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        background.add(btnSalir);
        btnSalir.setBounds(10, 10, 38, 39);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(darAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(darAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(darAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(darAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    public void seleccionarItemParecido(JComboBox comboBox, String textoBuscado) {
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            Object item = comboBox.getItemAt(i);
            if (item.toString().toLowerCase().contains(textoBuscado.toLowerCase())) {
                comboBox.setSelectedIndex(i);
                break;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnDarAlta;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tituloPacientes;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtDoctor;
    private javax.swing.JTextField txtEnfermedad;
    private javax.swing.JTextField txtFechaIngreso;
    private javax.swing.JTextField txtId;
    private javax.swing.JComboBox<String> txtNombre;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnDarAlta) {
            //se inicializa el controlador para poder añadir un antecedente
            if (txtDescripcion.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Descripcion no puede estar vacio ");
            } else if (txtDoctor.getText().equals("<Falta  Asignar>")){
                JOptionPane.showMessageDialog(null, "El paciente no tiene ningun doctor asigando por lo cual no ha sido atendio ERROR a dar de alta ");
            } else {
                PacienteController controlador = new PacienteController();
                Antecedente antecedente = new Antecedente();
                antecedente.setDescripcion(txtDescripcion.getText());
                antecedente.setDoctor(txtDoctor.getText());
                antecedente.setFecha_Ingreso(txtFechaIngreso.getText());
                antecedente.setEnfermedad(txtEnfermedad.getText());
                Timestamp fechaHora = new Timestamp(System.currentTimeMillis());
                controlador.DarAlta(antecedente, fechaHora, txtNombre);
                this.dispose();
            }
        }
        if (e.getSource() == btnSalir) {
            //boton de salida cierra la ventana darAlta
            this.dispose();
        }
    }

}

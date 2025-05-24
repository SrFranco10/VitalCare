//pantalla que muestra todos los pacientes que estan en atencion
package com.umg.curso.controldepacientes.paneles;

import com.umg.curso.controldepacientes.Controller.PacienteController;
import com.umg.curso.controldepacientes.Vista.Doctores.FmrAntecedentes;
import com.umg.curso.controldepacientes.Vista.Doctores.FmrPaciente;
import com.umg.curso.controldepacientes.Vista.Doctores.darAlta;
import com.umg.curso.controldepacientes.sql.PConexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

public class Pacientes extends javax.swing.JPanel implements ActionListener {

    //se llama se inicializa la clase controladora
    PacienteController controlador1 = new PacienteController();
    PConexion controlador = new PConexion();

    public Pacientes() {
        initComponents();
        
        //se inicializa la tabla con un modelo
        DefaultTableModel modelo = (DefaultTableModel) TableP.getModel();
        //se llama la funcion consultar que llenara la tabla de pacientes en atencion 
        controlador1.Consultar(modelo);

        //se inicializara los botones
        btnDarAlta.addActionListener(this);
        btnModificar.addActionListener(this);
        btnAntecedentes.addActionListener(this);
        btnReporte.addActionListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        tituloPacientes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableP = new javax.swing.JTable();
        btnDarAlta = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnAntecedentes = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(746, 470));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(746, 470));

        tituloPacientes.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        tituloPacientes.setForeground(new java.awt.Color(0, 26, 94));
        tituloPacientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPacientes.setText("PACIENTES INGRESADOS");

        TableP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TableP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TableP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableP);

        btnDarAlta.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnDarAlta.setText("Dar de Alta");

        btnModificar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnModificar.setText("Modificar");

        btnAntecedentes.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnAntecedentes.setText("Antecedentes");

        btnReporte.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnReporte.setText("Generar Reporte");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(btnDarAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19)
                .addComponent(btnAntecedentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(134, 134, 134))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tituloPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(14, 14, 14))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tituloPacientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDarAlta)
                    .addComponent(btnModificar)
                    .addComponent(btnAntecedentes)
                    .addComponent(btnReporte))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TablePMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePMouseClicked


    }//GEN-LAST:event_TablePMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableP;
    private javax.swing.JPanel background;
    private javax.swing.JButton btnAntecedentes;
    private javax.swing.JButton btnDarAlta;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnReporte;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tituloPacientes;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnDarAlta) {
            //boton que nos llevara a la pantalla para poder dar de alta al paciente 
            Object[] datos = (Object[]) controlador.SeleccionarPaciente(TableP);
            darAlta detalle = new darAlta(datos);
            detalle.setBounds(400, 300, 900, 600);
            detalle.setVisible(true);
        }
        if (e.getSource() == btnModificar) {
            //boton que nos llevara a la pantalla para poder modificar al paciente 
            Object[] datos = (Object[]) controlador.SeleccionarPaciente(TableP);
            FmrPaciente Modificar = new FmrPaciente(datos);
            Modificar.setBounds(400, 300, 900, 600);
            Modificar.setVisible(true);
        }
        if (e.getSource() == btnAntecedentes) {
            //boton que nos llevara a la pantalla para poder observar los antecedentes del paciente 
            Object[] datos = (Object[]) controlador.SeleccionarPaciente(TableP);

            FmrAntecedentes antecedentes = new FmrAntecedentes(datos);
            antecedentes.setBounds(400, 300, 900, 600);
            antecedentes.setVisible(true);

        }
        if (e.getSource() == btnReporte) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Guardar reporte como...");
            int userSelection = fileChooser.showSaveDialog(null);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                String ruta = fileChooser.getSelectedFile().getAbsolutePath() + ".pdf";
                controlador1.exportarTablaAPDF(TableP, ruta, "Reporte Pacientes");
            }
        }

    }

       
}


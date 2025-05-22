//Esta pantalla es donde se visualizan todos los pacientes que estan de alta en el Hospital en otras palabras que ya esten atendidos

package com.umg.curso.controldepacientes.paneles;

import com.umg.curso.controldepacientes.Controller.PacienteController;
import com.umg.curso.controldepacientes.Vista.Doctores.FmrAntecedentes;
import com.umg.curso.controldepacientes.sql.PConexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class Altas extends javax.swing.JPanel implements ActionListener {

    PConexion controlador = new PConexion();

    public Altas() {
        initComponents();
        //se inicializa la clase controler para poder llamar funciones
        PacienteController controlador = new PacienteController();
        //se determina el modelo de la tabla Antecedentes
        DefaultTableModel modelo = (DefaultTableModel) TableA.getModel();
        //se llama el metodo para mostrar los antecedentes del paciente en la tabla
        controlador.ConsultarAltas(modelo);

        //se inicializa el boton antecedente
        btnAntecedentes.addActionListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        tituloAltas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableA = new javax.swing.JTable();
        btnAntecedentes = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(746, 470));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(746, 470));

        tituloAltas.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tituloAltas.setText("DEMO Pacientes dados de alta ");

        TableA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TableA);
        if (TableA.getColumnModel().getColumnCount() > 0) {
            TableA.getColumnModel().getColumn(0).setResizable(false);
        }

        btnAntecedentes.setText("Antecedentes");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(tituloAltas, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)))
                .addGap(56, 56, 56))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(btnAntecedentes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tituloAltas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAntecedentes)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableA;
    private javax.swing.JPanel background;
    private javax.swing.JButton btnAntecedentes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tituloAltas;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAntecedentes) {
            //llama la funcion seleccionarpaciente para poder obtener los datos del paciente
            Object[] datos = (Object[]) controlador.SeleccionarPaciente(TableA);
            //se abre la ventana donde se envia los datos del paciente para ser trabajados
            FmrAntecedentes antecedentes = new FmrAntecedentes(datos);
            antecedentes.setBounds(0, 0, 900, 600);
            antecedentes.setVisible(true);
        }
    }
}

//Esta pantalla es donde se visualizan todos los pacientes que estan de alta en el Hospital en otras palabras que ya esten atendidos

package com.umg.curso.controldepacientes.paneles;

import com.umg.curso.controldepacientes.Controller.PacienteController;
import com.umg.curso.controldepacientes.Vista.Doctores.FmrAntecedentes;
import com.umg.curso.controldepacientes.sql.PConexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
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

        //se inicializa el boton antecedente y generar reporte
        btnAntecedentes.addActionListener(this);
        btnGenerarReporte.addActionListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        tituloAltas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableA = new javax.swing.JTable();
        btnAntecedentes = new javax.swing.JButton();
        btnGenerarReporte = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(746, 470));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(746, 470));

        tituloAltas.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        tituloAltas.setForeground(new java.awt.Color(0, 26, 94));
        tituloAltas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloAltas.setText("PACIENTES DADOS DE ALTA");

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

        btnAntecedentes.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnAntecedentes.setText("Antecedentes");

        btnGenerarReporte.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnGenerarReporte.setText("Generar Reporte");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(btnAntecedentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(btnGenerarReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(236, 236, 236))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloAltas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(20, 20, 20))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tituloAltas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAntecedentes)
                    .addComponent(btnGenerarReporte))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableA;
    private javax.swing.JPanel background;
    private javax.swing.JButton btnAntecedentes;
    private javax.swing.JButton btnGenerarReporte;
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
            antecedentes.setBounds(400, 300, 900, 600);
            antecedentes.setVisible(true);
        }
        if(e.getSource()== btnGenerarReporte){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Guardar reporte como...");
            int userSelection = fileChooser.showSaveDialog(null);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                PacienteController controlador = new PacienteController();
                String ruta = fileChooser.getSelectedFile().getAbsolutePath() + ".pdf";
                controlador.exportarTablaAPDF(TableA, ruta, "Reporte Altas");
            }
        }
    }
}

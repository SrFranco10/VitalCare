
package com.umg.curso.controldepacientes.paneles;

import com.umg.curso.controldepacientes.Controller.PacienteController;
import com.umg.curso.controldepacientes.sql.PConexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Citas extends javax.swing.JPanel implements ActionListener {
    PacienteController controlador = new PacienteController();
    PConexion controlador1 = new PConexion();
    public Citas() {
        initComponents();
        //se hace el llamado a base de datos para mostrar la informacion de citas a la tabla
        
        DefaultTableModel modelo = (DefaultTableModel) TableC.getModel();
        controlador.ConsultarCitas(modelo);
        
        //se inicializa el boton 
        btnCita.addActionListener(this);
        btnGenerarReporte.addActionListener(this);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        tituloCitas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableC = new javax.swing.JTable();
        btnCita = new javax.swing.JButton();
        btnGenerarReporte = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(746, 470));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(746, 470));

        tituloCitas.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        tituloCitas.setForeground(new java.awt.Color(0, 26, 94));
        tituloCitas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCitas.setText("CITAS PENDIENTES");

        TableC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TableC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableCMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableC);

        btnCita.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnCita.setText("Cita atendida");

        btnGenerarReporte.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnGenerarReporte.setText("Generar Reporte");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(btnCita, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(btnGenerarReporte, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addGap(206, 206, 206))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(20, 20, 20))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tituloCitas)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCita)
                    .addComponent(btnGenerarReporte))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TableCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableCMouseClicked

    }//GEN-LAST:event_TableCMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableC;
    private javax.swing.JPanel background;
    private javax.swing.JButton btnCita;
    private javax.swing.JButton btnGenerarReporte;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tituloCitas;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnCita){
            //se llama una funcion que extrae los datos de la tabla citas
            Object[] datos = (Object[]) controlador1.SeleccionarCita(TableC);
            //se determina una variable con el ID para hacer la consulta 
            int id_cita = Integer.parseInt(datos[0].toString());
            String NombrePaciente = datos[1].toString();
            
            //se llama al metodo de eliminar y se extrae el resultado 
            boolean resultado=controlador.EliminarCita(id_cita);
            //si el resultado es correcto mostrarle un mensaje al usuario
            if(resultado= true){
                JOptionPane.showMessageDialog(null, "Cita Atendida Correctamente del Paciente " + NombrePaciente);
                
            }
            
        }
        if(e.getSource()==btnGenerarReporte){
             
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Guardar reporte como...");
            int userSelection = fileChooser.showSaveDialog(null);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                String ruta = fileChooser.getSelectedFile().getAbsolutePath() + ".pdf";
                controlador.exportarTablaAPDF(TableC, ruta, "Reporte Citas");
            }
        }
        
    }
}

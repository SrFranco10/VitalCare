//pantalla que muestra todos los pacientes que estan en atencion


package com.umg.curso.controldepacientes.paneles;

import com.umg.curso.controldepacientes.Controller.PacienteController;
import com.umg.curso.controldepacientes.Vista.Doctores.FmrAntecedentes;
import com.umg.curso.controldepacientes.Vista.Doctores.FmrPaciente;
import com.umg.curso.controldepacientes.Vista.Doctores.darAlta;
import com.umg.curso.controldepacientes.sql.PConexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.io.FileOutputStream;
import javax.swing.table.TableColumnModel;




public class Pacientes extends javax.swing.JPanel implements ActionListener {

  
   PConexion controlador = new PConexion();
    
    public Pacientes() {
        initComponents();
        
        //se llama se inicializa la clase controladora
        PacienteController controlador = new PacienteController();
        //se inicializa la tabla con un modelo
        DefaultTableModel modelo = (DefaultTableModel) TableP.getModel();
        //se llama la funcion consultar que llenara la tabla de pacientes en atencion 
        controlador.Consultar(modelo);
        
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
        setLayout(null);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(746, 470));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloPacientes.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tituloPacientes.setText("DEMO Pacientes ingresados");
        background.add(tituloPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 366, -1));

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

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 700, 440));

        btnDarAlta.setText("Dar Alta");
        background.add(btnDarAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, -1, -1));

        btnModificar.setText("Modificar");
        background.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, -1, -1));

        btnAntecedentes.setText("Antecedentes");
        background.add(btnAntecedentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, -1, -1));

        btnReporte.setText("Generar Reporte");
        background.add(btnReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, -1, -1));

        add(background);
        background.setBounds(0, 0, 720, 530);
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
        if(e.getSource()==btnDarAlta){
            //boton que nos llevara a la pantalla para poder dar de alta al paciente 
                Object[] datos = (Object[]) controlador.SeleccionarPaciente(TableP);
                darAlta detalle = new darAlta(datos);
                detalle.setVisible(true);
        }
        if(e.getSource()==btnModificar){
            //boton que nos llevara a la pantalla para poder modificar al paciente 
                Object[] datos = (Object[]) controlador.SeleccionarPaciente(TableP);
                FmrPaciente detalle = new FmrPaciente(datos);
                detalle.setVisible(true);
        }
        if(e.getSource()==btnAntecedentes){
            //boton que nos llevara a la pantalla para poder observar los antecedentes del paciente 
                Object[] datos = (Object[]) controlador.SeleccionarPaciente(TableP);
                
                FmrAntecedentes antecedentes = new FmrAntecedentes(datos);
                antecedentes.setBounds(0, 0, 900, 600);
                antecedentes.setVisible(true);
     
        }
        if(e.getSource()==btnReporte){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Guardar reporte como...");
            int userSelection = fileChooser.showSaveDialog(null);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                String ruta = fileChooser.getSelectedFile().getAbsolutePath() + ".pdf";
                exportarTablaAPDF(TableP, ruta);
    }
        }
        
    }
    
         public void exportarTablaAPDF(JTable tabla, String nombreArchivo) {
        Document document = new Document(PageSize.LEGAL.rotate(), 20, 20, 20, 20); // A4 horizontal
        try {
            PdfWriter.getInstance(document, new FileOutputStream(nombreArchivo));
            document.open();

            // Fuente con soporte para acentos y buen tamaño
            BaseFont bf = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);
            Font fontTitulo = new Font(bf, 16, Font.BOLD);
            Font fontEncabezado = new Font(bf, 12, Font.BOLD);
            Font fontCelda = new Font(bf, 10);

            // Título
            Paragraph titulo = new Paragraph("Reporte de pacientes", fontTitulo);
            titulo.setAlignment(Element.ALIGN_CENTER);
            titulo.setSpacingAfter(20);
            document.add(titulo);

            // Obtener modelo de columnas visibles
            TableColumnModel colModel = tabla.getColumnModel();
            int colCount = colModel.getColumnCount();
            PdfPTable pdfTable = new PdfPTable(colCount);
            pdfTable.setWidthPercentage(100);
            pdfTable.setSpacingBefore(10);
            pdfTable.setSpacingAfter(10);

            // Ajustar anchos de columnas automáticamente
            float[] colWidths = new float[colCount];
            for (int i = 0; i < colCount; i++) {
                colWidths[i] = 1f; // mismo ancho por defecto
            }
            pdfTable.setWidths(colWidths);

            // Encabezados con fondo gris
            for (int i = 0; i < colCount; i++) {
                String encabezado = colModel.getColumn(i).getHeaderValue().toString();
                PdfPCell celda = new PdfPCell(new Phrase(encabezado, fontEncabezado));
                celda.setHorizontalAlignment(Element.ALIGN_CENTER);
                celda.setVerticalAlignment(Element.ALIGN_MIDDLE);
                celda.setPadding(5);
                pdfTable.addCell(celda);
            }

            // Filas de datos
            for (int fila = 0; fila < tabla.getRowCount(); fila++) {
                for (int col = 0; col < colCount; col++) {
                    int modelCol = colModel.getColumn(col).getModelIndex();
                    Object valor = tabla.getValueAt(fila, modelCol);
                    PdfPCell celda = new PdfPCell(new Phrase(valor != null ? valor.toString() : "", fontCelda));
                    celda.setHorizontalAlignment(Element.ALIGN_CENTER);
                    celda.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    celda.setPadding(4);
                    pdfTable.addCell(celda);
                }
            }

            document.add(pdfTable);
            document.close();

            JOptionPane.showMessageDialog(null, "PDF generado correctamente:\n" + nombreArchivo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al generar PDF:\n" + e.getMessage());
        }
    }
}


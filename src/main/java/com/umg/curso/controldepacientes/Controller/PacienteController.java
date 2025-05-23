
package com.umg.curso.controldepacientes.Controller;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.umg.curso.controldepacientes.Modelo.Antecedente;
import com.umg.curso.controldepacientes.Modelo.Doctor;
import com.umg.curso.controldepacientes.sql.PConexion;
import com.umg.curso.controldepacientes.Modelo.Paciente;
import java.io.FileOutputStream;
import java.net.URL;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;



public class PacienteController implements CPacientes  {
    
    
    private PConexion conexion;
    
    public PacienteController() 
    {
        
    }
    @Override
    public boolean Guardar(Paciente paciente) {
      
        boolean respuesta = false;
        try {
            conexion = new PConexion();
            conexion.establecerConexion();
            conexion.guardarPacientes(paciente);
            respuesta = true;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar " + ex.getMessage());
            respuesta = false;

        }

        return respuesta;

    }
     @Override
     public boolean GuardarDoctor(Doctor doctor) {
      
        boolean respuesta = false;
        try {
            conexion = new PConexion();
            conexion.establecerConexion();
            conexion.guardarDoctores(doctor);
            respuesta = true;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar " + ex.getMessage());
            respuesta = false;

        }

        return respuesta;

    }
    
    
    
  
    @Override
    public boolean Actualizar(Paciente paciente, int id_paciente) {
   
        boolean respuesta = false;
        try {
            conexion = new PConexion();
            conexion.establecerConexion();
            if (conexion.actualizarPaciente(paciente, id_paciente)) {
                JOptionPane.showMessageDialog(null, "Registro actualizado con exito");
                respuesta = true;
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar el paciente");
                respuesta = false;
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar " + ex.getMessage());
            respuesta = false;
        }
        
        return respuesta;
    }
    
    
    @Override
    public boolean EliminarCita(int id_cita) {
       try{
           conexion = new PConexion();
           conexion.establecerConexion();
           
           if(conexion.EliminarCita(id_cita))
           {
             return true;
           }
           else
           {
               return false;
           }
          
           
       }catch(Exception ex)
       {
           JOptionPane.showMessageDialog(null, "Error al eliminar " + ex.getMessage());
            return false;
           
       }
    }
    @Override
    public void Consultar(DefaultTableModel modelo) {
        
        try {
            conexion = new PConexion();
            conexion.establecerConexion();
            conexion.Consultar(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(PacienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    @Override
    public void Llenarbox(JComboBox paramDocBox, JComboBox paramPacBox){
        try{
            conexion = new PConexion();
            conexion.establecerConexion();
            conexion.LlenarComboBoxDoctores(paramDocBox);
            conexion.LlenarComboBoxPacientes(paramPacBox);
            
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar " + ex.getMessage());
        }
               
    }
    @Override
    public boolean agregarCita(JComboBox boxDoctores, JComboBox boxPacientes, JSpinner Fecha) {
        //Se consigue la informacion de los ComboBox y JSpinner
        Doctor doctorSeleccionado = (Doctor) boxDoctores.getSelectedItem();
        Paciente pacienteSeleccionado = (Paciente) boxPacientes.getSelectedItem();
        Date fechaSeleccionada = (Date) Fecha.getValue();

        //Se declara variables para utilizacion mas sencilla y entendible
        int idPaciente = pacienteSeleccionado.getID();
        int idDoctor = doctorSeleccionado.getId();
        Timestamp fechaHora = new Timestamp(fechaSeleccionada.getTime());

        //se empieza a realizar el llamado para la consulta
        try {
            conexion = new PConexion();
            conexion.establecerConexion();
            Integer idCita = conexion.agregarCita(idPaciente, idDoctor, fechaHora);
            //Validacion de que si el agregar cita fue exitoso
            if (idCita != null) {
                JOptionPane.showMessageDialog(null, "La cita se agregó correctamente. ID: " + idCita);
            }
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar la cita: " + e.getMessage());
            return false;
        }

    }
    
    @Override
    public void ConsultarCitas(DefaultTableModel modelo) {
        
        try {
            conexion = new PConexion();
            conexion.establecerConexion();
            conexion.ConsultarCitas(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(PacienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    
     @Override
    public void LlenarboxD(JComboBox paramDocBox){
        try{
            conexion = new PConexion();
            conexion.establecerConexion();
            conexion.LlenarComboBoxDoctores(paramDocBox);
            
            
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar " + ex.getMessage());
        }
               
    }
    @Override
    public void LlenarboxP(JComboBox paramPacienteBox){
        try{
            conexion = new PConexion();
            conexion.establecerConexion();
            conexion.LlenarComboBoxPacientes(paramPacienteBox);
            
            
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar " + ex.getMessage());
        }
               
    }
    
    @Override
    public boolean DarAlta(Antecedente antecedente , Timestamp fechaHora, JComboBox paramPaciente) {
        Paciente pacienteSeleccionado= (Paciente) paramPaciente.getSelectedItem();
        int id_paciente= pacienteSeleccionado.getID();
        boolean respuesta = false;
        try {
            conexion = new PConexion();
            conexion.establecerConexion();
            conexion.DarAlta(antecedente,fechaHora,id_paciente);
            respuesta = true;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar " + ex.getMessage());
            respuesta = false;

        }

        return respuesta;

    }
    
    @Override
    public boolean Reingreso(Paciente paciente, int id_paciente) {
   
        boolean respuesta = false;
        try {
            conexion = new PConexion();
            conexion.establecerConexion();
            if (conexion.Reingreso(paciente, id_paciente)) {
                JOptionPane.showMessageDialog(null, "Paciente Reingresado con exito");
                respuesta = true;
            } else {
                JOptionPane.showMessageDialog(null, "Error al reingresar el paciente");
                respuesta = false;
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al reingresar " + ex.getMessage());
            respuesta = false;
        }
        
        return respuesta;
    }
    
    
        @Override
    public void ConsultarAntecedentes(DefaultTableModel modelo, int id_paciente) {
        
        try {
            conexion = new PConexion();
            conexion.establecerConexion();
            conexion.ConsultarAntecedentes(modelo, id_paciente);
            
        } catch (SQLException ex) {
            Logger.getLogger(PacienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    
    @Override
    public void ConsultarAltas(DefaultTableModel modelo) {
        
        try {
            conexion = new PConexion();
            conexion.establecerConexion();
            conexion.ConsultarAltas(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(PacienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    
      public void exportarTablaAPDF(JTable tabla, String nombreArchivo, String Titulo) {
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
            Paragraph titulo = new Paragraph(Titulo, fontTitulo);
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
            URL url = getClass().getResource("/img/logo.png");
            if (url == null) {
                JOptionPane.showMessageDialog(null, "¡No se encontró la imagen!");
            } else {
                Image logo = Image.getInstance(url);
                logo.scaleToFit(50, 50);
                logo.setAlignment(Image.ALIGN_CENTER);
                document.add(logo);
}

            // Encabezados con fondo gris
            for (int i = 0; i < colCount; i++) {
                String encabezado = colModel.getColumn(i).getHeaderValue().toString();
                PdfPCell celda = new PdfPCell(new Phrase(encabezado, fontEncabezado));
                celda.setBackgroundColor(BaseColor.LIGHT_GRAY);
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

    

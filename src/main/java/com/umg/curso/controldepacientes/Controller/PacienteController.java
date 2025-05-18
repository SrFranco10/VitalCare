
package com.umg.curso.controldepacientes.Controller;
import com.umg.curso.controldepacientes.Modelo.Doctor;
import com.umg.curso.controldepacientes.sql.PConexion;
import com.umg.curso.controldepacientes.Modelo.Paciente;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;



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
    public boolean Eliminar(int id_paciente) {
       try{
           conexion = new PConexion();
           
           if(conexion.Eliminar(id_paciente))
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
    public boolean agregarCita(JTextField paramCita,int idPaciente, int idDoctor, Timestamp fechaHora) {
    

    try {
        conexion= new PConexion();
        conexion.establecerConexion();
        conexion.agregarCita(paramCita,idPaciente, idDoctor, fechaHora);

        
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
    

}

    

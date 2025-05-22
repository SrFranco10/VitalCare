
package com.umg.curso.controldepacientes.Controller;

import com.umg.curso.controldepacientes.Modelo.Antecedente;
import com.umg.curso.controldepacientes.Modelo.Doctor;
import com.umg.curso.controldepacientes.Modelo.Paciente;
import java.sql.Timestamp;
import javax.swing.JComboBox;
import javax.swing.JSpinner;

import javax.swing.table.DefaultTableModel;


public interface CPacientes {
    public boolean Guardar(Paciente paciente);
    
    public boolean Actualizar(Paciente paciente, int id_paciente);

    public boolean EliminarCita(int id_paciente);

    public void Consultar(DefaultTableModel modelo);

    public void Llenarbox(JComboBox paramDocBox, JComboBox paramPacBox);

    public boolean agregarCita(JComboBox boxDoctores, JComboBox boxPacientes, JSpinner Fecha);
    
    public void ConsultarCitas(DefaultTableModel modelo);
    
    public void LlenarboxD(JComboBox paramDocBox);
    
    public boolean GuardarDoctor(Doctor doctor);
    
     public boolean DarAlta(Antecedente antecedente , Timestamp fechaHora, JComboBox paramPaciente);
     
     public void LlenarboxP(JComboBox paramPacienteBox);
     
     public boolean Reingreso(Paciente paciente, int id_paciente);
     
     public void ConsultarAntecedentes(DefaultTableModel modelo, int id_paciente);
     
     public void ConsultarAltas(DefaultTableModel modelo);

}


package com.umg.curso.controldepacientes.Controller;

import com.umg.curso.controldepacientes.Modelo.Doctor;
import com.umg.curso.controldepacientes.Modelo.Paciente;
import java.sql.Timestamp;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public interface CPacientes {
    public boolean Guardar(Paciente paciente);
    
    public boolean Actualizar(Paciente paciente, int id_paciente);

    public boolean Eliminar(int id_paciente);

    public void Consultar(DefaultTableModel modelo);

    public void Llenarbox(JComboBox paramDocBox, JComboBox paramPacBox);

    public boolean agregarCita(JTextField paramCita, int idPaciente, int idDoctor, Timestamp fechaHora);
    
    public void ConsultarCitas(DefaultTableModel modelo);
    
    public void LlenarboxD(JComboBox paramDocBox);
    
    public boolean GuardarDoctor(Doctor doctor);

}

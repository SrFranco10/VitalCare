
package com.umg.curso.controldepacientes.sql;

import com.umg.curso.controldepacientes.Modelo.Doctor;
import com.umg.curso.controldepacientes.Modelo.Paciente;
import com.umg.curso.controldepacientes.Vista.Doctores.FmrPaciente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.lang3.StringUtils;

//clase que establece conexion con la base de datos de PostgresSql
public class PConexion {
    Connection conectar = null;
    
    String Usuario = "postgres";
    String Contrasenia = "muni123$";
    String bd = "CPacientesBD";
    String ip = "localhost";
    String puerto ="5432";
    
    String cadena = "jdbc:postgresql://"+ip+":"+puerto+"/"+bd;
     public Connection establecerConexion(){
        try{
            Class.forName("org.postgresql.Driver");
            conectar = DriverManager.getConnection(cadena,Usuario,Contrasenia);
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");
           
        }
    catch(Exception e) {
        JOptionPane.showMessageDialog(null, "ERROR:"+e.toString());
    }
        return conectar;
}
     
     public void guardarPacientes(Paciente paciente) {
       
        try {

            if (conectar != null) {  //preparar la sentencia sql para insertar
                
                PreparedStatement st = conectar.prepareStatement("""
                                                                 INSERT INTO public.pacientes(
                                                                 \t "ID","Nombre", "Apellido", "Edad", "Numero", "Direccion", "Enfermedad", "Ingreso")
                                                                 \tVALUES (?, ?, ?, ?, ?, ?, ?, ?);""");
                st.setInt(1, paciente.getID());
                st.setString(2, paciente.getNombres());
                st.setString(3, paciente.getApellidos());
                st.setInt(4, paciente.getEdad());
                st.setInt(5, paciente.getNumero());
                st.setString(6, paciente.getDireccion());
                st.setString(7, paciente.getEnfermedad());
                st.setString(8, paciente.getIngreso());

                

                st.execute();

            } else {
                System.out.println("No fue posible guardar el paciente");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar el paciente" + ex.getMessage());

        }
        JOptionPane.showMessageDialog(null, "Paciente registrado con exito");

    }

    public boolean actualizarPaciente(Paciente paciente, int id_paciente) {
        boolean res = false;

        try {
            if (conectar != null) {
                PreparedStatement st = conectar.prepareStatement("""
                                                                 UPDATE public.pacientes
                                                                 \tSET "Nombre"=?, "Apellido"=?, "Edad"=?, "Numero"=?, "Direccion"=?, "Enfermedad"=?, "Id_doctor"=?, "Ingreso"=?, "Salida"=?
                                                                 \tWHERE "ID"=""" + id_paciente+";" );
                st.setString(1, paciente.getNombres());
                st.setString(2, paciente.getApellidos());
                st.setInt(3, paciente.getEdad());
                st.setInt(4, paciente.getNumero());
                st.setString(5, paciente.getDireccion());
                st.setString(6, paciente.getEnfermedad());
                st.setInt(7, paciente.getDoctor());
                st.setString(8, paciente.getIngreso());
                st.setString(9, paciente.getSalida());

                st.executeUpdate();
                res = true;
            } else {
                res = false;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el paciente" + ex.getMessage());

        }
        
        return res;

    }

    public boolean Eliminar(int id_paciente) {
        boolean resultado = true;
        try {
            if (conectar == null) {
                throw new Exception("Error de conexion a la base de datos");
            } else {
                PreparedStatement st = conectar.prepareStatement("delete from pacientes where id=" + id_paciente + "");
                st.execute();
                st.close();

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error al eliminar el paciente" + ex.getMessage());
            resultado = false;

        }
        return resultado;

    }

    public void Consultar(DefaultTableModel tablemodel) throws SQLException {
        int numeroColumna = 0;
        ResultSet resultado = null;
        tablemodel.setRowCount(0);
        tablemodel.setColumnCount(0);
        PreparedStatement st = conectar.prepareStatement("""
                                                         SELECT 
                                                             p."ID",
                                                             p."Nombre",
                                                             p."Apellido",
                                                         \tp."Edad",
                                                         \tp."Numero",
                                                         \tp."Direccion",
                                                         \tp."Enfermedad",
                                                         \tp."Ingreso",
                                                         \tp."Salida",
                                                             d."Nombre" || ' ' || d."Apellido" AS "Nombre_Doctor"
                                                         FROM 
                                                             public."pacientes" p
                                                         LEFT JOIN 
                                                             public."Doctores" d
                                                         ON 
                                                             p."Id_doctor" = d."Id_Doctor";""");
        try {
            resultado = st.executeQuery();
            numeroColumna = resultado.getMetaData().getColumnCount();

            //llenamos los encabezados de las columnas;
            for (int j = 1; j <= numeroColumna; j++) {
                tablemodel.addColumn(resultado.getMetaData().getColumnName(j));
            }
            //llenamos el cuerpo de la tabla

            while (resultado.next()) {
                String[] datos = new String[numeroColumna];

                for (int i = 1; i <= numeroColumna; i++) {
                    datos[i - 1] = (String) resultado.getString(i);
                }

                tablemodel.addRow(datos);

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error al consultar los pacientes" + ex.getMessage());
        }

    }
    
    public void SeleccionarPaciente(JTable paramTablaPaciente) {
        try {
            int fila = paramTablaPaciente.getSelectedRow();
            if (fila >= 0) {

                Object[] datos = new Object[10];

                for (int i = 0; i < datos.length; i++) {
                    datos[i] = paramTablaPaciente.getValueAt(fila, i);
                }
                if (datos[8] == null  ) {
                    datos[8] = "";
                }
                
                

                FmrPaciente detalle = new FmrPaciente(datos);
                detalle.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una fila");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
        
    }
    
    public void LlenarComboBoxDoctores(JComboBox paramComboBox) throws SQLException {
        PreparedStatement st = conectar.prepareStatement("""
                                                         SELECT 
                                                             "Id_Doctor", 
                                                             "Nombre" || ' ' || "Apellido" AS nombre_completo 
                                                         FROM 
                                                             public."Doctores" 
                                                         ORDER BY 
                                                             nombre_completo;""");

        try {
            ResultSet rs = st.executeQuery();
            paramComboBox.removeAllItems();
            paramComboBox.addItem("<Asigne un Doctor>");

            while (rs.next()) {
                int id = rs.getInt("Id_Doctor");
                String nombre = rs.getString("nombre_completo");
                paramComboBox.addItem(new Doctor(id, nombre));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }
    
     public void LlenarComboBoxPacientes(JComboBox paramComboBox) throws SQLException {
        PreparedStatement st = conectar.prepareStatement("""
                                                         SELECT 
                                                             "ID", 
                                                             "Nombre" || ' ' || "Apellido" AS nombre_completo 
                                                         FROM 
                                                             public.pacientes 
                                                         ORDER BY 
                                                             nombre_completo;""");

        try {
            ResultSet rs = st.executeQuery();
            paramComboBox.removeAllItems();
            paramComboBox.addItem("<Seleccione un Paciente>");
            while (rs.next()) {
                int ID = rs.getInt("ID");
                String nombre = rs.getString("nombre_completo");
                paramComboBox.addItem(new Paciente(ID, nombre));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }
     
    public Integer agregarCita(int idPaciente, int idDoctor, Timestamp fechaHora) {
        String insertSQL = "INSERT INTO public.\"cita\" (id_paciente, id_doctor, fecha_hora) VALUES (?, ?, ?) RETURNING id_Cita";
        String updateSQL = "UPDATE public.\"pacientes\" SET \"Id_doctor\" = ? WHERE \"ID\" = ?";

        try (Connection conn = conectar) {
            conn.setAutoCommit(false); // Iniciar transacción

            try (
                    PreparedStatement psInsert = conn.prepareStatement(insertSQL); PreparedStatement psUpdate = conn.prepareStatement(updateSQL)) {
                // Insertar cita y obtener ID generado
                psInsert.setInt(1, idPaciente);
                psInsert.setInt(2, idDoctor);
                psInsert.setTimestamp(3, fechaHora);

                ResultSet rs = psInsert.executeQuery(); 
                Integer idCita = null;
                if (rs.next()) {
                    idCita = rs.getInt("id_Cita"); // obtener el ID generado
                }

                // Actualizar doctor del paciente
                psUpdate.setInt(1, idDoctor);
                psUpdate.setInt(2, idPaciente);
                psUpdate.executeUpdate();

                conn.commit(); // Confirmar si todo va bien
                return idCita; // retornar el ID de la cita insertada

            } catch (SQLException e) {
                conn.rollback(); // Deshacer si algo falla
                JOptionPane.showMessageDialog(null, "Error durante la transacción: " + e.getMessage());
                return null;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
            return null;
        }
    }

    
    public void ConsultarCitas(DefaultTableModel tablemodel) throws SQLException {
        int numeroColumna = 0;
        ResultSet resultado = null;
        tablemodel.setRowCount(0);
        tablemodel.setColumnCount(0);
        PreparedStatement st = conectar.prepareStatement("""
                                                         SELECT 
                                                             c.id_cita AS "Id",
                                                             p."Nombre" || ' ' || p."Apellido" AS "Paciente",
                                                             d."Nombre" || ' ' || d."Apellido" AS "Doctor",
                                                             c.fecha_hora AS "Fecha_Cita"
                                                         FROM 
                                                             public.cita c
                                                         JOIN 
                                                             public.pacientes p ON c.id_paciente = p."ID"
                                                         JOIN 
                                                             public."Doctores" d ON c.id_doctor = d."Id_Doctor"
                                                         ORDER BY 
                                                             c.fecha_hora ;""");
        try {
            resultado = st.executeQuery();
            numeroColumna = resultado.getMetaData().getColumnCount();

            //llenamos los encabezados de las columnas;
            for (int j = 1; j <= numeroColumna; j++) {
                tablemodel.addColumn(resultado.getMetaData().getColumnName(j));
            }
            //llenamos el cuerpo de la tabla

            while (resultado.next()) {
                String[] datos = new String[numeroColumna];

                for (int i = 1; i <= numeroColumna; i++) {
                    datos[i - 1] = (String) resultado.getString(i);
                }

                tablemodel.addRow(datos);

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error al consultar los pacientes" + ex.getMessage());
        }

    }
    
    public void guardarDoctores(Doctor doctor) {
       
        try {

            if (conectar != null) {  //preparar la sentencia sql para insertar
                
                PreparedStatement st = conectar.prepareStatement("""
                                                                 INSERT INTO public."Doctores"(
                                                                 \t "Id_Doctor","Nombre", "Apellido")
                                                                 \tVALUES (?, ?, ?);""");
                st.setInt(1, doctor.getId());
                st.setString(2, doctor.getNombre());
                st.setString(3, doctor.getApellido());
                
                st.execute();

            } else {
                System.out.println("No fue posible guardar el paciente");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar el paciente" + ex.getMessage());

        }
        JOptionPane.showMessageDialog(null, "Doctor registrado con exito");

    }
}



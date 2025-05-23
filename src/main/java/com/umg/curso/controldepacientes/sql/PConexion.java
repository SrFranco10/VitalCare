package com.umg.curso.controldepacientes.sql;

import com.umg.curso.controldepacientes.Modelo.Antecedente;
import com.umg.curso.controldepacientes.Modelo.Doctor;
import com.umg.curso.controldepacientes.Modelo.Paciente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

//clase que establece conexion con la base de datos de PostgresSql
public class PConexion {

    Connection conectar = null;

    String Usuario = "postgres";
    String Contrasenia = "muni123$";
    String bd = "CPacientesBD";
    String ip = "localhost";
    String puerto = "5432";

    String cadena = "jdbc:postgresql://" + ip + ":" + puerto + "/" + bd;

    public Connection establecerConexion() {
        try {
            Class.forName("org.postgresql.Driver");
            conectar = DriverManager.getConnection(cadena, Usuario, Contrasenia);
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR:" + e.toString());
        }
        return conectar;
    }

    public void guardarPacientes(Paciente paciente) {

        try {

            if (conectar != null) {  //preparar la sentencia sql para insertar

                PreparedStatement st = conectar.prepareStatement("""
                                                                 INSERT INTO public.pacientes(
                                                                     "ID", "Nombre", "Apellido", "Edad", "Numero", "Direccion", "Enfermedad", "Ingreso", "Estado", "Id_doctor")
                                                                 VALUES (?, ?, ?, ?, ?, ?, ?, ?, 'en atencion', 0);""");
                st.setLong(1, paciente.getID());
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
                                                                 \tSET "Nombre"=?, "Apellido"=?, "Edad"=?, "Numero"=?, "Direccion"=?, "Enfermedad"=?, "Id_doctor"=?, "Ingreso"=?, "Estado"=?
                                                                 \tWHERE "ID"=""" + id_paciente + ";");
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

    public boolean EliminarCita(int id_cita) {
        boolean resultado = true;
        try {
            if (conectar == null) {
                throw new Exception("Error de conexion a la base de datos");
            } else {
                PreparedStatement st = conectar.prepareStatement("""
                                                                 DELETE FROM public.cita
                                                                 \tWHERE id_cita =""" + id_cita + ";");
                st.execute();
                st.close();

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error al eliminar la cita" + ex.getMessage());
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
                                                              p."Nombre" || ' ' || p."Apellido" AS "Nombre_Paciente",
                                                              p."Edad",
                                                              p."Numero",
                                                              p."Direccion",
                                                              p."Enfermedad",
                                                              p."Ingreso",
                                                              p."Estado",
                                                              d."Nombre" || ' ' || d."Apellido" AS "Nombre_Doctor"
                                                          FROM 
                                                              public."pacientes" p
                                                          LEFT JOIN 
                                                              public."Doctores" d
                                                          ON 
                                                              p."Id_doctor" = d."Id_Doctor"
                                                          WHERE "Estado" = 'en atencion';""");
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

    public Object SeleccionarPaciente(JTable paramTablaPaciente) {
        Object[] datos = new Object[9];
        try {
            int fila = paramTablaPaciente.getSelectedRow();
            if (fila >= 0) {
                
                for (int i = 0; i < datos.length; i++) {
                    datos[i] = paramTablaPaciente.getValueAt(fila, i);
                }
                if(datos[8]==null){
                datos[8]="";
            }

            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una fila");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
        return datos;
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
                                                             c.fecha_hora AS "Fecha De Cita"
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

    public void DarAlta(Antecedente antecedente, Timestamp fechaHora, int id_paciente) {
        try {
            if (conectar != null) {
                // Insertar en la tabla antecedentes
                PreparedStatement st = conectar.prepareStatement("""
                INSERT INTO public.antecedentes(
                    id_paciente, fecha_salida, descripcion, doctor, enfermedad, fecha_ingreso)
                VALUES (?, ?, ?, ?, ?, ?);
            """);

                st.setInt(1, id_paciente);
                st.setTimestamp(2, fechaHora);
                st.setString(3, antecedente.getDescripcion());
                st.setString(4, antecedente.getDoctor());
                st.setString(5, antecedente.getEnfermedad());
                st.setString(6, antecedente.getFecha_Ingreso());

                st.execute();

                // Actualizar el estado del paciente y eliminar la fecha_ingreso
                PreparedStatement update = conectar.prepareStatement("""
                UPDATE public.pacientes
                SET "Estado" = 'alta', "Ingreso" = NULL, "Enfermedad" = NULL, "Id_doctor"=NULL
                WHERE "ID" = ?;
            """);

                update.setInt(1, id_paciente);
                update.executeUpdate();

                JOptionPane.showMessageDialog(null, "Paciente dado de alta con éxito");

            } else {
                System.out.println("No fue posible dar de alta");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar el paciente: " + ex.getMessage());
        }
    }

    public Object ConsultarPaciente(int id_paciente) throws SQLException {
        PreparedStatement st = conectar.prepareStatement("""
                                                         SELECT 
                                                             "Nombre", 
                                                             "Apellido",
                                                             "Edad",
                                                             "Numero",
                                                             "Direccion"
                                                         FROM 
                                                             public.pacientes 
                                                         WHERE 
                                                             "ID" = ?;
                                                         """);
        Paciente paciente = new Paciente();

        try {
            st.setInt(1, id_paciente);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {

                paciente.setNombres(rs.getString("Nombre"));
                paciente.setApellidos(rs.getString("Apellido"));
                paciente.setEdad(rs.getInt("Edad"));
                paciente.setNumero(rs.getInt("Numero"));
                paciente.setDireccion(rs.getString("Direccion"));
            } else {
                return null;
            }
            rs.close();
            st.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
        return paciente;
    }

    public boolean Reingreso(Paciente paciente, int id_paciente) {
        boolean res = false;

        try {
            if (conectar != null) {
                PreparedStatement st = conectar.prepareStatement("""
                                                                 UPDATE public.pacientes
                                                                 \tSET "Nombre"=?, "Apellido"=?, "Edad"=?, "Numero"=?, "Direccion"=?, "Enfermedad"=?, "Ingreso"=?, "Estado"=?, "Id_doctor"=0
                                                                 \tWHERE "ID"=""" + id_paciente + ";");
                st.setString(1, paciente.getNombres());
                st.setString(2, paciente.getApellidos());
                st.setInt(3, paciente.getEdad());
                st.setInt(4, paciente.getNumero());
                st.setString(5, paciente.getDireccion());
                st.setString(6, paciente.getEnfermedad());

                st.setString(7, paciente.getIngreso());
                st.setString(8, "en atencion");

                st.executeUpdate();
                res = true;
            } else {
                res = false;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al reingresar al paciente" + ex.getMessage());

        }

        return res;

    }

    public void ConsultarAntecedentes(DefaultTableModel tablemodel, int id_paciente) throws SQLException {
        int numeroColumna = 0;
        ResultSet resultado = null;
        tablemodel.setRowCount(0);
        tablemodel.setColumnCount(0);
        PreparedStatement st = conectar.prepareStatement("""
                                                         SELECT 
                                                             p."Nombre" || ' ' || p."Apellido" AS "Paciente",
                                                             a.doctor AS "Doctor", 
                                                             a.enfermedad AS "Enfermedad",
                                                             a.fecha_ingreso AS "Fecha Ingreso",
                                                             a.fecha_salida AS "Fecha Salida",
                                                             a.descripcion AS "Atencion Dada"
                                                             
                                                         FROM 
                                                             public.antecedentes a
                                                         JOIN 
                                                             public.pacientes p ON a.id_paciente = p."ID"
                                                         WHERE  
                                                             p."ID"=?
                                                         
                                                         ORDER BY 
                                                             a.fecha_salida ;""");
        try {
            st.setInt(1, id_paciente);
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
            JOptionPane.showMessageDialog(null, "error al consultar los antecedentes del paciente" + ex.getMessage());
        }

    }

    public void ConsultarAltas(DefaultTableModel tablemodel) throws SQLException {
        int numeroColumna = 0;
        ResultSet resultado = null;
        tablemodel.setRowCount(0);
        tablemodel.setColumnCount(0);
        PreparedStatement st = conectar.prepareStatement("""
                                                         SELECT 
                                                              p."ID",
                                                              p."Nombre" || ' ' || p."Apellido" AS "Nombre_Paciente",
                                                              p."Edad",
                                                              p."Numero",
                                                              p."Direccion",
                                                              p."Enfermedad",
                                                              p."Ingreso",
                                                              p."Estado",
                                                              d."Nombre" || ' ' || d."Apellido" AS "Nombre_Doctor"
                                                          FROM 
                                                              public."pacientes" p
                                                          LEFT JOIN 
                                                              public."Doctores" d
                                                          ON 
                                                              p."Id_doctor" = d."Id_Doctor"
                                                          WHERE "Estado" = 'alta';""");
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

    public Object SeleccionarCita(JTable paramTablaPaciente) {
        Object[] datos = new Object[4];
        try {
            int fila = paramTablaPaciente.getSelectedRow();
            if (fila >= 0) {

                for (int i = 0; i < datos.length; i++) {
                    datos[i] = paramTablaPaciente.getValueAt(fila, i);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una fila");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
        return datos;
    }

}

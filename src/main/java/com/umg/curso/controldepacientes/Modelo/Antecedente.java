/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.curso.controldepacientes.Modelo;

import javax.swing.JTextArea;

/**
 *
 * @author franc
 */
public class Antecedente {
    private int Id_Antecendente;
    private String Paciente;
    private String Enfermedad;
    private String Descripcion;
    private String Doctor;
    private String Fecha_Ingreso;

    public int getId_Antecendente() {
        return Id_Antecendente;
    }

    public void setId_Antecendente(int Id_Antecendente) {
        this.Id_Antecendente = Id_Antecendente;
    }

    public String getPaciente() {
        return Paciente;
    }

    public void setPaciente(String Paciente) {
        this.Paciente = Paciente;
    }

    public String getEnfermedad() {
        return Enfermedad;
    }

    public void setEnfermedad(String Enfermedad) {
        this.Enfermedad = Enfermedad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getDoctor() {
        return Doctor;
    }

    public void setDoctor(String Doctor) {
        this.Doctor = Doctor;
    }

    public String getFecha_Ingreso() {
        return Fecha_Ingreso;
    }

    public void setFecha_Ingreso(String Fecha_Ingreso) {
        this.Fecha_Ingreso = Fecha_Ingreso;
    }
   
            
    
}

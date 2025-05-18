
package com.umg.curso.controldepacientes.Modelo;


public class Paciente {

    

    private int ID;
    private String Nombres;
    private String Apellidos;
    private int Edad;
    private int Numero;
    private String Direccion;
    private String Enfermedad;
    private String Antecedentes;
    private String Ingreso;
    private String Salida;
    public String getIngreso;
    private String nombreCompleto;
    private int Doctor;
    
    
    public Paciente(int ID, String nombreCompleto){
        this.ID= ID;
        this.nombreCompleto= nombreCompleto;
    }
    
    public Paciente(){
        
    }
    
    
    //Getter
    
    public int getID() {
        return ID;
    }

    public String getNombres() {
        return Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public int getNumero() {
        return Numero;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getEnfermedad() {
        return Enfermedad;
    }

    public String getAntecedentes() {
        return Antecedentes;
    }

    public String getSalida() {
        return Salida;
    }
    
    public String getIngreso() {
        return Ingreso;
    }
    
    
    
    //Setter
    
    public void setID(int ID) {
        this.ID = ID;
    }
    
    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }
    
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
   public void setNumero(int Numero) {
        this.Numero = Numero;
    }
    
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    public void setEnfermedad(String Enfermedad) {
        this.Enfermedad = Enfermedad;
    }
    
    public void setAntecedentes(String Antecedentes) {
        this.Antecedentes = Antecedentes;
    }
    
    public void setIngreso(String Ingreso) {
        this.Ingreso = Ingreso;
    }
    
    public void setSalida(String Salida) {
        this.Salida = Salida;
    }
    
     public String toString() {
        return nombreCompleto;  
    }
    
   
    public int getDoctor() {
        return Doctor;
    }

    public void setDoctor(int Doctor) {
        this.Doctor = Doctor;
    }
  
  
}

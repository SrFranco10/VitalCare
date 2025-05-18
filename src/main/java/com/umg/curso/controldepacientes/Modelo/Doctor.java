
package com.umg.curso.controldepacientes.Modelo;


public class Doctor {

   public Doctor(){
       
   }

    
    private int id;
    private String nombreCompleto;
    private String Nombre;
    private String Apellido;
    
    public Doctor(int id, String nombreCompleto){
        this.id= id;
        this.nombreCompleto= nombreCompleto;
    }
    
    
    public int getId() {
        return id;
    }

  
    public void setId(int id) {
        this.id = id;
    }

    
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    
    public String toString() {
        return nombreCompleto;  
    }
    
     
    public String getNombre() {
        return Nombre;
    }

    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

   
    public String getApellido() {
        return Apellido;
    }

   
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
}

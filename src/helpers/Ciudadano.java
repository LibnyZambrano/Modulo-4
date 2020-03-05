/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author Libny Zambrano
 */
public class Ciudadano {
    
    // Nombre del ciudadano
    public String nombre; 
    
    private int edad;
    
    private int AñosDeExperiencia;
    
    public Ciudadano(String nombre, String edad, String AñosDeExperiencia){
        this.nombre = nombre;
        
        
    }
    public void ImprimirEdad(){
        System.out.println(edad);
    }
    public void ImprimirAñosDeExperiencia(){
        System.out.println(AñosDeExperiencia);
}
    public void setEdad(int _edad){
        this.edad = _edad; 
    }
    public int getEdad(){
        return edad;
    }
     public void setAñosDeExperiencia(int _añosDeExperiencia){ 
           this.AñosDeExperiencia = _añosDeExperiencia;
    }
      public int getAñosDeExperiencia(){
        return AñosDeExperiencia;
    }
 
}

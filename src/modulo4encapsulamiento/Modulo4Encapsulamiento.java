/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo4encapsulamiento;

import helpers.Ciudadano;

/**
 *
 * @author Libny Zambrano
 */
public class Modulo4Encapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Instanciar la Clase
        Ciudadano ciudadano = new Ciudadano("Libny Zambrano", "27","5");
        
        
        ciudadano.setEdad(27);
        ciudadano.setAñosDeExperiencia(5);
        
        System.out.println(ciudadano.getEdad());
        
        System.out.println(ciudadano.getAñosDeExperiencia());
    }
    
}

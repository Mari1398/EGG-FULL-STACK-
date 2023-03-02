
package poo7persona;

// @author Mariana

import persona.entidades.Persona;
import persona.servicios.ServicioPersona;

 
public class POO7Persona {

    public static void main(String[] args) {
//        Persona p1 = new Persona();
//        Persona p2 = new Persona();
//        Persona p3 = new Persona();
//        Persona p4 = new Persona();
        ServicioPersona sp = new ServicioPersona();
        Persona p1= sp.crearPersona();
        Persona p2 = sp.crearPersona();
        Persona p3 = sp.crearPersona();
        Persona p4= sp.crearPersona();
        
        
    }

}


package poo7persona;

// @author Mariana

import java.util.ArrayList;
import java.util.Collections;
import persona.entidades.Persona;
import persona.servicios.ServicioPersona;

 
public class POO7Persona {

    public static void main(String[] args) {

        ServicioPersona sp = new ServicioPersona();
        Persona p1= sp.crearPersona();
        Persona p2 = sp.crearPersona();
        Persona p3 = sp.crearPersona();
        Persona p4= sp.crearPersona();
        
        ArrayList <Persona> personas = new ArrayList();
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        
        for (Persona person: personas){
            System.out.println(person);
        }
        
        Collections.sort(personas,Persona.compararEdad);
        
        
        
        
    }

}

package collecperros_1;

// @author Mariana

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class CollecPerros_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> razas = new ArrayList();
        String raza, resp;
        boolean bandera= true;
        do {
            System.out.println("Ingrese el nombre del perro");
            raza= leer.next();
            razas.add(raza);
            System.out.println("¿Desea ingresar otra perro? resp SI/NO");
            resp= leer.next();
            if (resp.equalsIgnoreCase("no")) {
                bandera=false;
            }
        } while (bandera);
        
        System.out.println("Las razas ingresadas son:");
      razas.forEach((aux)->System.out.println(aux));
      
        System.out.println("Ingrese el nombre del perro que desea buscar");
        String buscar = leer.next();
       Iterator<String> it= razas.iterator();
       bandera=true;
        while (it.hasNext()) {
            String next = it.next();
            if (next.equals(buscar)) {
                it.remove();
                bandera=false;
            } 
            
        }
        if (bandera) {
            System.out.println("El nombre ingresado no esta en la lista");
        }
        Collections.sort(razas);
        razas.forEach((aux)->System.out.println(aux));
        
    }

   
}

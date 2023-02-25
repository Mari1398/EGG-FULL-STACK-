package mascotapp.servicios;

import mascotapp.entidades.Mascota;
import java.util.Scanner;

public class ServicioMascota {
    // SON COMO ATRIBUTOS PUEDEN TENER CONSTRUCTORES ETC
    // ATRIBUTOS DE CLASE O VARIABLES GLOBALES
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //soluciona el problema de next nextLine
   
    public Mascota crearMascota() {
        System.out.println("Introducir nombre");
        String nombre = leer.next();
        System.out.println("Introducir apodo");
        String apodo = leer.next();
        System.out.println("Introducir tipo");
        String tipo = leer.next();
        // Mascota m = new Mascota(nombre, apodo, tipo);
        // return m;
        // no se hace mucho con ella
        return new Mascota(nombre, apodo, tipo);
        // nacimiento de la mascota directo al return

    }
    

}

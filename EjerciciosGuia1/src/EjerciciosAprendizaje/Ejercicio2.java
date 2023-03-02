
package EjerciciosAprendizaje;

import java.util.Scanner;

public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String name="";
        nombre(name, leer);
    }
    public static void nombre(String name, Scanner leer){
        System.out.println("Ingrese su nombre");
        name= leer.next();
        
        System.out.println("Su nombre es " + name);
        
        
        
    }
    
    
}

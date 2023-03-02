
package EjerciciosAprendizaje;

import java.util.Scanner;


public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        double grados,fahren;
        System.out.println("Ingrese una temperatura en grados centigrados para convertir\n"
                + "a grados Fahrenheit");
        grados = leer.nextDouble();
        fahren=32+(9*grados/5);
        System.out.println("La temperatura es " + fahren + " grados Fahrenheit");
        
    }
    
}

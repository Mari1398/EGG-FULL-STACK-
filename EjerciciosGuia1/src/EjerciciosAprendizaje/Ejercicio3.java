
package EjerciciosAprendizaje;

import java.util.Scanner;

public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase=leer.nextLine();
        MayoMin (frase);
    }
    public static void MayoMin(String frase){
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
}
}
    

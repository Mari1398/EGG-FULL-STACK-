/*
 * Define una variable de tipo boolean, double y char. Guarda información en
 *ellas a través del
 *Scanner.
 */
package ManosALaObra;
import java.util.Scanner;
/**
 *
 * @author AADEMINCOL
 */
public class Ejercicio5Intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner leer = new Scanner (System.in);
        boolean vali;
        double punto;
        char one;
        System.out.println("Ingrese un false o true");
        vali = leer.nextBoolean();
        System.out.println("Ingrese un número decimal");
        punto = leer.nextDouble();
        System.out.println("Ingrese un caracter");
        one = leer.next().charAt(0);
        
        
        
        
        
        
    }
    
}

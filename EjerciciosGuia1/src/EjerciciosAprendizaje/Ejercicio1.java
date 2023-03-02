
package EjerciciosAprendizaje;

import java.util.Scanner;


public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in);
     int a=0, b=0;
     
     suma(a,b,leer);
    }
   
    
    public static void suma (int a, int b, Scanner leer){
        
        System.out.println("Ingrese el primer número a sumar");
        a = leer.nextInt();
        
        System.out.println("Ingrese el segundo número a sumar");
        
        b=leer.nextInt();
        
        System.out.println("La suma de los dos números es " + (a+b)); 
       
        
        
}
}

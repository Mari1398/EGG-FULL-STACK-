/*
 * public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num, pares=0, impares=0, numTotal=0;
        
        do {
            
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            
            if (num>0) {
                
                if (num%2==0) {
               //par 
               pares = pares + 1;
            }else{
               //impar
               impares = impares + 1;
            }
            
            }
            
            numTotal = pares + impares;
            
        } while (num%5!=0);
        
        System.out.println("La cantidad de números pares son: "+pares);
        System.out.println("La cantidad de números impares son: "+impares);
        System.out.println("El total de números es: "+numTotal);
    }
    
}
public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num, pares=0, impares=0, numTotal=0;
        
        do {
            
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            
            if (num>0) {
                
                if (num%2==0) {
               //par 
               pares = pares + 1;
            }else{
               //impar
               impares = impares + 1;
            }
            
            }
            
            numTotal = pares + impares;
            
        } while (num%5!=0);
        
        System.out.println("La cantidad de números pares son: "+pares);
        System.out.println("La cantidad de números impares son: "+impares);
        System.out.println("El total de números es: "+numTotal);
    }
    
}

 */
package EjerciciosAprendizaje;

import java.util.Scanner;

public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num;
        
        System.out.println("Ingrese un número para conocer si es par o impar");
        num = leer.nextInt();
        
        if (num%2==0) {
            
            System.out.println("El número es par");
        }else {
            
            System.out.println("El  número es impar");
            
            
        }
    }
    
}

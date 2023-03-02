/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package EjerciciosAprendizaje;

import java.util.Scanner;

public class Ejercicio10 {
    // @param args the command line argument
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       int num,ingre, suma=0;
       boolean bandera=true;
       
        System.out.println("Ingrese un valor limite");
        num = leer.nextInt();
        
        
        while(bandera==true){
        if (num>0){
            do {
                 System.out.println("Ingrese un numero");
                 ingre = leer.nextInt();
                suma=ingre+suma;
                bandera=false;
                
            } while (suma<num);
            
            
        }else {
            System.out.println("Ingrese un número valido");
            num= leer.nextInt();
            
                    }
        }
            
            
            
            
        }
    }
    





package ManosALaObra;

import java.util.Scanner;


public class Ejercicio10Intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
  
  int num1;
  
  int cont = 1;
        
        System.out.println("Ingrese cuatro numeros entre 1 y 20");
        
        do {
            
            System.out.println("Ingrese el numero " + cont);
             num1 = leer.nextInt();
        
             if (num1 < 20 && num1 > 1) {
            
                System.out.print(num1 +" ");   
                  for (int i = 0; i < num1; i++) {
                  System.out.print("*");
                 }
                  System.out.println(""); 
                    cont ++;
              }
             else{
                 System.out.println("Ha ingresado un número erroneo, por favor intente de nuevo");
                 
                 
                
             }
             
       
           
               
                 
        } while (cont < 5);
        
        }
        
    }
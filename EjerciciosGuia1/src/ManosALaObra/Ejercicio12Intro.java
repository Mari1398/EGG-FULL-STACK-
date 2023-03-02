
package ManosALaObra;

import java.util.Scanner;


public class Ejercicio12Intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        
        int num1, num2;
        System.out.println("Ingrese dos numeros para comprobar si son multiplos");
        
        num1=leer.nextInt();
        num2=leer.nextInt();
         
        esMultiplo(num1, num2);
                
    }
    
    
    public static void esMultiplo (int num1, int num2){
      
        
        if (num1%num2==0) {
            
            System.out.println("EL número 1 es multiplo del número 2");
        }else{
            System.out.println("Los números no son multiplos");
        
            
        }
        
    }
            
            
    
}

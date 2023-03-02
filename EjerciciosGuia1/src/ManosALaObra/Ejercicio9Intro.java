
package ManosALaObra;

import java.util.Scanner;

public class Ejercicio9Intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        
        int cont = 0;
        int suma = 0;
        
        do {
            
            System.out.println("Ingrese un numero: ");
            int num = leer.nextInt();
            
            if (num == 0){
            
                System.out.println("Se capturó el número 0!");
                break;
                
            } else if (num > 0){
            
                suma = suma + num;
            
            }
            
            cont++;
        
        }while (cont < 20);
        
        System.out.println("La suma de los numeros ingresados es: " + suma);
}
    }
    


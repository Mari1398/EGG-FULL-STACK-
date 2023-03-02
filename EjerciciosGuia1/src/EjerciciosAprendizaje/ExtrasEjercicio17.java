
package EjerciciosAprendizaje;

import java.util.Scanner;

public class ExtrasEjercicio17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         int num;
         boolean resultado;
         System.out.println("Ingrese un numero");
         num = leer.nextInt();
         resultado=primo(num);
         if (resultado){
           System.out.println("Es primo");   
         }else
             System.out.println("No es primo");
        
    }
    public static boolean primo(int num) {
        boolean bandera = true;
        if (num==1){
            bandera=false;
        }
        for (int i=2;i<num;i++) {
            if (num%i==0){
                bandera=false;
                break;
            }
        }
        return bandera;
    }
    
}

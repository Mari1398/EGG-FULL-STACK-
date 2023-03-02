
package EjerciciosAprendizaje;

import java.util.Scanner;

public class ExtraEjercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int x,y,resp,result;
        x=(int)(Math.random()*10)  ;
         y=(int)(Math.random()*10);
         result=x*y;
        do {
            System.out.println("Ingrese el producto de la multiplicación de dos números aleatorios del 1 al 9");
            resp=leer.nextInt();
            if (result==resp) {
                System.out.println("Enhorabuena has acertado"); 
            }
            
            
        } while (result!=resp);
        
    }
    
}

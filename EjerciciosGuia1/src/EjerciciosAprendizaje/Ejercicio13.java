/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package EjerciciosAprendizaje;

import java.util.Scanner;

/**
 *
 * @author AADEMINCOL
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int lado;
        System.out.println("Ingrese el lado del cuadrado");
        lado = leer.nextInt();
        for (int i = 0; i < lado; i++) {
            System.out.print("*");
            for (int j = 0; j < lado-1; j++) {
                if (i==0 || i==lado-1) {
                    System.out.print("*");
                    
                }else {
                    for (int k = 0; k < lado-2; k++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    break;
                }
                
            }
            System.out.println("");
        }
    }
    
}

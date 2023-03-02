/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package EjerciciosAprendizaje;

import java.util.Scanner;

/**
 *
 * @author AADEMINCOL
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner (System.in);
        
        int n, a=0, b=0, c=0, d=0, e=0;
        int [] vector;
        boolean bandera=true;
        System.out.println("Ingrese el tamaño del vector");
        n=leer.nextInt();
        vector= new int [n];
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int)(Math.random()*20);
            //System.out.println(vector[i]);
            if (vector[i]>=10000 && vector[i]<100000) {
                a++;
                }
            else if (vector[i]>1000 && vector[i]<10000) {
                b++;
                }
            else if (vector[i]>=100 && vector[i]<1000) {
                c++;
                }
            else if (vector[i]>=10 && vector[i]<100) {
                d++;
                }
            else if (vector[i]<10) {
                e++;
                }
            
    }
        System.out.println("Hay " + e + " numeros de un digito\n" +
                           "Hay " + d + " numeros de dos digito\n" +
                           "Hay " + c + " numeros de tres digito\n" +
                           "Hay " + b + " numeros de cuatro digito\n" +
                           "Hay " + a + " numeros de cinco digito");
    
}
}

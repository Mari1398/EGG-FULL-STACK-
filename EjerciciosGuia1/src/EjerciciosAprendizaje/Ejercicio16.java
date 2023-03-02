/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package EjerciciosAprendizaje;

import java.util.Scanner;

/**
 *
 * @author AADEMINCOL
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int n,busca, cont=0;
        int [] vector;
        boolean bandera=true;
        System.out.println("Ingrese el tamaño del vector");
        n=leer.nextInt();
        vector= new int [n];
        System.out.println("Ingrese el número que desea buscar");
        busca= leer.nextInt();
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int)(Math.random()*10);
            //System.out.println(vector[i]);
            
        }
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]==busca) {
                bandera=false;
                System.out.println("El número que busca se encuentra en la posicion " + i);
                cont++;
                
                
            } 
        }
        if (bandera==true){
            System.out.println("El numero no ha sido encontrado");
        }else if (bandera==false){
            if (cont==1) {
                    System.out.println("El número se encuentra 1 vez");
                }else {System.out.println("El número se encuentra " + cont + " veces" );
            }
        }
        }
    }
    


/*
 *Escribir un programa que lea un número entero por teclado y muestre por pantalla el
 *doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package EjerciciosAprendizaje;

import java.util.Scanner;

/**
 *
 * @author AADEMINCOL
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int entero;
        System.out.println("Ingrese un número entero para conocer su doble, triple y raiz cuadrada");
        entero = leer.nextInt();
        calculos(entero);
        
    }
    public static void calculos (int entero){
     
        double doble, triple, raiz;
        doble = Math.pow (entero,2);
        triple = Math.pow(entero, 3);
        raiz = Math.sqrt(entero);
        
        System.out.println("El doble del número ingresado es " + doble + " \n" +
                           "El triple del número ingresado es \n"+ triple + " \n" +
                           "La raiz del número ingresado es " + raiz);
    }
    }
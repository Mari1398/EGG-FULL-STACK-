/*
 Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.
 */
package EjerciciosAprendizaje;

import java.util.Scanner;

/**
 *
 * @author AADEMINCOL
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
      char vali;
        System.out.println("Ingrese una palabra o frase");
        vali = leer.next().charAt(0);
        String convert = String.valueOf(vali);
        
        
        if (convert.equals("A")){
            System.out.println("CORRECTO");
        } else 
            System.out.println("INCORRECTO");
            
        }
    }

    


package ManosALaObra;

import java.util.Scanner;

/**
* Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota
* se pedirá de nuevo hasta que la nota sea correcta.
*/


public class Ejercicio8Intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int nota;
           System.out.println("Ingrese una nota entre 0 - 10:");
            nota = leer.nextInt();
        while (nota > 10 || nota < 0){
        
            System.out.println("Ingrese una nota entre 0 - 10:");
            nota = leer.nextInt();
        }
        
    }
    
}


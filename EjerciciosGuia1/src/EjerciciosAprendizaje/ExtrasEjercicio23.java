
package EjerciciosAprendizaje;

import java.util.Scanner;

public class ExtrasEjercicio23 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String[] palabras = new String[5];
        String[][] sopa = new String[20][20];
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Ingrese la " + (i+1) + " palabra (de 3 a 5 caracteres)");
            palabras[i] = leer.next();
            if(palabras[i].length()<3){
                System.out.println("Palabra menor a 3 caracteres");
                i--;
            }
            if(palabras[i].length()>5){
                System.out.println("Palabra mayor a 5 caracteres");
                i--;
            }
        }
         for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[0].length; j++) {
                int x=(int)(Math.random()*10);
                String y;
                y=String.valueOf(x);
                sopa[i][j]=y;
            }
            
        }
        for (int i = 0; i < 5; i++) {
            palabrasSopa(palabras[i],sopa);
        }
        
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[0].length; j++) {
                System.out.print(sopa[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
            System.out.println(" ");
        }
    }
    
    public static void palabrasSopa(String palabra, String sopa[][]){
        int columna,fila;
        fila = (int) (Math.random()*20);
        columna = (int) (Math.random()*(20-palabra.length()));
        for (int j = 0; j < palabra.length(); j++) {
            sopa[fila][j+columna] = palabra.substring(j, j+1);
        }
    }
}

/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package EjerciciosAprendizaje;

import java.util.Scanner;

public class Ejercicio19 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int [][] matrizT,matrizA;
       int n;
       boolean bandera=false;
       
        System.out.println("Ingrese el tamaño de la matriz");
         n = leer.nextInt();
         matrizT= new int [n][n];
         matrizA= new int [n][n];
         
         for (int i = 0; i < matrizT.length; i++) {
             for (int j = 0; j < matrizT[0].length; j++) {
                 System.out.println("Ingrese el valor de la posición " + i+" "+ j  );
                 matrizT[i][j]=leer.nextInt();
                 
             }
        }
        
          for (int i = 0; i < matrizT.length; i++) {
             for (int j = 0; j < matrizT[0].length; j++) {
                 matrizA[i][j]=matrizT[j][i];
                     if ((-1*matrizT[i][j])!=matrizA[i][j]) {
                     bandera= true;
                 }
                 }
             }
          if (bandera==false) {
              System.out.println("La matriz es anti simetrica");
          
        }else {
              System.out.println("La matriz no es anti simetrica");
          }
        }  
    }  
    
    

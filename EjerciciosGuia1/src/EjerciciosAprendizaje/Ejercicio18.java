/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */
package EjerciciosAprendizaje;

/**
 *
 * @author AADEMINCOL
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      
       int[][] MatrizM = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                MatrizM[i][j] = (int) (Math.random()*10);
            }
        }
     
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + MatrizM[i][j]);
            }
            System.out.println("");
        } 
        System.out.println("");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + MatrizM[j][i]);
            }
            System.out.println("");
        }       
        }
    }
    


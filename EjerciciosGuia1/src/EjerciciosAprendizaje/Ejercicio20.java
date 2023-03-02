package EjerciciosAprendizaje;

import java.util.Scanner;

public class Ejercicio20 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] magic;
        int[][] mdiago;
        int n, suma = 0;
        int[] vsuma;
        boolean bandera=false;
        System.out.println("Bienvenido al provador de matrices mágicas\n"+
                " \n"+
                "Para iniciar, ingrese el tamaño de la matriz mágica");
                
        n = leer.nextInt();
        magic = new int[n][n];
        mdiago = new int[n][n];
        vsuma = new int[n+n+2];
        System.out.println("Es momento de ingreser la matriz");
        for (int i = 0; i < magic.length; i++) {
            for (int j = 0; j < magic[0].length; j++) {
                magic[i][j] = leer.nextInt();
            }
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        for (int i = 0; i < magic.length; i++) {
            for (int x : magic[i]) {
                suma = x + suma;
                vsuma[i] = suma;
            }
            suma = 0;
        }
        for (int i = 0; i < magic.length; i++) {
            for (int j = 0; j < magic[0].length; j++) {
                suma = magic[j][i] + suma;
                vsuma[magic.length + i] = suma;
            }
            suma = 0;
        }
        
        for (int i = 0; i < magic.length; i++) {
            for (int j = 0; j < magic[0].length; j++) {
                if (i == j) {
                    suma = magic[i][j] + suma;
                    vsuma[(magic.length * 2)] = suma;
                }
            }
        }
        suma=0;
        int i=0;
        int j;
        for (int l = (magic[0].length-1); l>-1; l--) {
            j=0;
            for (int k = 0; k < magic.length; k++) {
                mdiago[i][j] = magic[k][l];
                if (i == j) {
                    suma = mdiago[i][j] + suma;
                    vsuma[(mdiago.length * 2 + 1)] = suma;
                }
                j++;
            }
            i++;
        }
        
        for (int l = 0; l < vsuma.length; l++) {
            if (vsuma[0]!=vsuma[l]){
                bandera=true;
            }
            
            
        }
        
        
        if (bandera==false) {
            System.out.println("La matriz que ha ingresado es mágica");
            
        }else{
            System.out.println("La matriz que ha ingresado no es mágica");
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosAprendizaje;

import java.util.Scanner;

/**
 *
 * @author AADEMINCOL
 */
public class Ejercicio3Comp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n=0;
        
        System.out.println("Ingrese la dimensión del cuadrado");
        n = leer.nextInt();
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                
                if((i==0)||(i==n-1)||(j==0)||(j==n-1)){
                    System.out.print("*");
            }else{
                    System.out.print(" ");
                }
        }
            System.out.println("");
    }
    }
    
}

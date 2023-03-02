/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManosALaObra;

import java.util.Scanner;

/**
 *
 * @author AADEMINCOL
 */
public class Ejericioi6Intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("¿Números mayores a 25?");
        
        System.out.println("Ingrese el primer número a comparar");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo número a comparar");
        int num2= leer.nextInt();
        
        if (num1>25 && num2>25) {
        
            System.out.println("Ambos números son mayores a 25");
            
        }  else if (num1>25)  {
            System.out.println("El primer número ingresado es mayor a 25");
        }
        else if (num2>25) {
            System.out.println("El segundo número es mayor a 25");
        }
        else {
            System.out.println("Ninguno de los números es mayor a 25");
        }
        
    }
    
}

    

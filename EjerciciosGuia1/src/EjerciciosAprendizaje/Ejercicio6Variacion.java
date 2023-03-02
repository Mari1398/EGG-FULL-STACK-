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
public class Ejercicio6Variacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num, pares=0, impares=0, numTotal=0;
        
        do {
            
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            
            if (num>0) {
                
                if (num%2==0) {
               //par 
               pares = pares + 1;
            //}else if (num!=5){
                }else {
               //impar
               impares = impares + 1;
            }
            
            }
            
            numTotal = pares + impares;
            /*para con los multiplos de 5 ¿por qué hacerlo así?
            si quiere que 5 sea el que pare se debió poner 5/5=1
            */
        } while (num%5!=0);
       //} while (num==5);
        
        System.out.println("La cantidad de números pares son: "+pares);
        System.out.println("La cantidad de números impares son: "+impares);
        System.out.println("El total de números es: "+numTotal);
    }
    
}

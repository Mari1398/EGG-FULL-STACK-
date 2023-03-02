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
public class ExtraEjercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = 0, cont = 0;
        double valor = 0,valormin = 0, valormax = 0, suma = 0, promedio = 0;
        
        do {
            System.out.println("Ingrese la cantidad de numeros a ingresar: ");
            n = leer.nextInt();
        } while (n<=0);
        
             
        while(n>cont) {
            System.out.println("Ingrese valores para los números: ");
            valor = leer.nextDouble();
            cont++;
            suma = suma + valor;
            
            if(cont<=1){
                valormin=valor;
                valormax=valor;
            } else {
                 if(valor>valormax){
                valormax = valor;
                }
                 if(valor<valormin){
                 valormin=valor;
                 }
            }
            
           
        } 
        
        System.out.println("El promedio de los valores ingresados es: " + suma/n);
        System.out.println("El valor máximo ingresado es: " + valormax);
        System.out.println("El valor mínimo ingresado es: " + valormin);
    }
    
}

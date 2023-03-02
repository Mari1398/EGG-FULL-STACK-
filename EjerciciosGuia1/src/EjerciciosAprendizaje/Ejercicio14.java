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
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        
        double euros;
        String moneda;
        
        System.out.println("Ingrese la cantidad de euros");
        euros = leer.nextDouble();
        System.out.println("Ingrese la moneda a convertir");
        moneda = leer.next();
        
        convertir(euros,moneda);
    }
    
    public static void convertir(double cantidad, String cambio){
        switch (cambio){
            case "libras":
                System.out.println("La cantidad en libras es: "+ (cantidad*0.86));
                break;
            case "dolares":
                System.out.println("La cantidad en dolares es: "+ (cantidad*1.28611));
                break;
            case "yenes":
                System.out.println("La cantidad en yenes es: "+ (cantidad*129.852));
                break;
            default:
                System.out.println("Moneda invalida");
        }
    }
    
}

/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */
package EjerciciosAprendizaje;

import java.util.Scanner;

/**
 *
 * @author AADEMINCOL
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       String clave,usuario;
        System.out.println("Ingrese su usuario");
        usuario = leer.nextLine();
        System.out.println("Ingrese su clave");
        clave = leer.nextLine();
        if (clave.equals("eureka")){
            System.out.println("Correcto");
        }
        else{
            while (!"eureka".equals(clave)){
                System.out.println("Ha ingresado una clave incorrecta\n"+
                        "Ingrese su clave");
                 clave = leer.nextLine();
               System.out.println("Correcto");    
            }
            
            }
        
            
        }
        }
       
       
       
    
    


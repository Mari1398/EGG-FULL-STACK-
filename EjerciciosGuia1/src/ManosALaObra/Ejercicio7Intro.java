/*Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos
*que se trata del tipo de motor de una bomba para mover fluidos). Definir una variable tipoMotor y
*permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
*o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
*o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de
*gasolina”.
*o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de
*hormigón”.
*o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta
*alimenticia”.
*o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor
*válido para tipo de bomba”
*/
package ManosALaObra;

import java.util.Scanner;

public class Ejercicio7Intro {
    
     //@param args the command line arguments
  
    public static void main(String[] args) {
        
      Scanner leer = new Scanner (System.in);
        int opc;
        
        System.out.println("Bienvenido a la web del constructor\n" +
                           "A continuación encontrará el menu de nuestras bombas\n"+
                           " \n"+
                           "1. Bomba de agua\n"+
                           "2. Bomba de hormigón\n"+
                           "3. Bomba de pasta alimenticia\n"+
                           " \n"+
                           " \n"+
                           
                "Escoga la opción de acuerdo a la que desee comprar");
        opc = leer.nextInt();
        
        switch (opc) {
                case 1:
                    System.out.println("Ha escogido la opción 1\n"+
                                       "Comprará una bomba de agua");
                    break;
                case 2:
                    System.out.println("Ha escogido la opción 2\n"+
                                       "Comprará una bomba de hormigón");
                    break;
                case 3:
                    System.out.println("Ha escogido la opción 1\n"+
                                       "Comprará una bomba de pasta alimenticia");
                    break;
                default:
                    System.out.println("Ha ingresado una opción invalida");
                    break;
                    
                    
        
                         
        
         
    }
    
}
}


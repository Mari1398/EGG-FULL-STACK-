
package EjerciciosAprendizaje;

import java.util.Scanner;

/*
. Escribir un programa que lea un número entero y devuelva el número de dígitos que 
componen ese número. Por ejemplo, si introducimos el número 12345, el programa 
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador 
de división. Nota: recordar que las variables de tipo entero truncan los números o 
resultados.
*/
public class ExtraEjercicio11 {

    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       int n, cont=0;
        System.out.println("Ingrese un número para conocer el número de digitos que posee");
        n=leer.nextInt();
        do {
            n=n/10;
            cont++;        
        } while (n!=0);
        if (cont>1){
        System.out.println("El número ingresado es de "+cont+" cifras");
        }
        else if(cont==1){
           System.out.println("El número ingresado es de una cifra"); 
        }
    }
    
}

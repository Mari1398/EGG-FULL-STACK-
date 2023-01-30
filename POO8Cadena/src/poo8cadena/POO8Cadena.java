
package poo8cadena;

// @author Mariana

import cadena.entidades.Cadena;
import cadena.servicios.ServicioCadena;
import java.util.Scanner;

 
public class POO8Cadena {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
      Cadena c = new Cadena();
      ServicioCadena sc= new ServicioCadena();
        System.out.println("Ingrese una frase");
        c.setFrase(leer.nextLine());
       
        c.setLongitud(c.getFrase().length());
         System.out.println(c.toString());
         System.out.println("");
       sc.mostrarVocales(c);
        System.out.println("");
       sc.invertirFrase(c);
        System.out.println("");
       sc.vecesRepetido(c);
        System.out.println("");
       sc.compararLongitud(c);
        System.out.println("");
       sc.reemplazar(c);
        System.out.println("");
       sc.contiene(c);
       
    }

}

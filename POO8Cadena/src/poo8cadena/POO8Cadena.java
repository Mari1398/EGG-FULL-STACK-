
package poo8cadena;

// @author Mariana

import cadena.entidades.Cadena;
import java.util.Scanner;

 
public class POO8Cadena {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
      Cadena c = new Cadena();
        System.out.println("Ingrese una frase");
        c.setFrase(leer.nextLine());
        System.out.println(c.toString());
        c.setLongitud(c.getFrase().length());
        System.out.println(c.getLongitud());
        System.out.println("Metododoodspdofjapo  g");
    }

}

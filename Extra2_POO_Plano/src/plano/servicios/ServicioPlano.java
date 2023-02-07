
package plano.servicios;

//@author Mariana

import java.util.Scanner;
import plano.entidades.Plano;


public class ServicioPlano {
    Scanner leer = new Scanner(System.in);
public Plano crearPlano(){
    Plano p = new Plano();
    System.out.println("Ingrese el punto X1");
    p.setX1(leer.nextInt());
     System.out.println("Ingrese el punto X2");
    p.setX2(leer.nextInt());
     System.out.println("Ingrese el punto Y1");
    p.setY1(leer.nextInt());
     System.out.println("Ingrese el punto Y2");
    p.setY2(leer.nextInt());
    return p;
   
        
    
}
 public void distanciaPuntos(Plano p){
     double distancia;
     distancia=Math.sqrt((Math.pow((p.getX2()-p.getX1()), 2))+(Math.pow((p.getY2()-p.getY1()), 2)));
     System.out.println("La distancia entre los dos puntos es "+ distancia);
 }
}

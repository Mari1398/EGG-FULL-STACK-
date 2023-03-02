
package Servicio;

import Entidades.Circunferencias;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Servicio {
    Scanner leer= new Scanner (System.in);
    DecimalFormat forma = new DecimalFormat("#.00");
    public Circunferencias crearCircunferencia(){
        Circunferencias c1 = new Circunferencias();
        System.out.println("Ingrese el radio de la circunferencia");
       c1.setRadio(leer.nextDouble());
       return c1;
    }
    public void area (Circunferencias c1){
        double area;
        area=Math.PI*Math.pow(c1.getRadio(), 2);
        System.out.println("El área de la circunferencia es "+ forma.format(area));
        
        
    }
    public void perimetro (Circunferencias c1){
        double perimetro;
        perimetro= (2*Math.PI*c1.getRadio());
        System.out.println("El perimetro de la circunferencia es "+ forma.format(perimetro));
    }
}

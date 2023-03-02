
package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

public class Servicios {
    Scanner leer = new Scanner (System.in);
    public Rectangulo crearRectangulo(){
      Rectangulo r1= new Rectangulo();
        System.out.println("Ingrese la base del rectangulo");
        r1.setBase(leer.nextDouble());
        System.out.println("Ingrese la altura del rectangulo");
        r1.setAltura(leer.nextDouble());
      return r1;
        
    }
  
    public void superficie(Rectangulo r1){
    double superficie;
    superficie= r1.getAltura()*r1.getBase();
        System.out.println("La superficie del rectangulo es " + superficie);
            
}
    public void perimetro(Rectangulo r1){
        double perimetro;
        perimetro=(r1.getAltura()+r1.getBase())*2;
        System.out.println("El perimetro del rectangulo es "+ perimetro);
    }
   public void representacion (Rectangulo r1){
       System.out.println("A continuación verá representado el rectangulo mediante asteristicos redondeando el valor suministrado"+
               " para simplificar el diagrama");
       for (int i = 0; i <r1.getAltura(); i++) {
           for (int j = 0; j <r1.getBase(); j++) {
               if (i==0||i==(r1.getAltura()-1)||j==0||j==(r1.getBase()-1)){
                   System.out.print("* ");  
               }else{
                   System.out.print("  ");
               }
                   
           }
           System.out.println("  ");
       }
       
   } 
}

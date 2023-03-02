
package nespresso.servicios;

// @author Mariana

import java.util.Scanner;
import nespresso.entidades.Nespresso;


public class ServicioNespresso {
Scanner leer = new Scanner (System.in);
    public Nespresso crearNespresso (){
        Nespresso n1= new Nespresso();
        n1.setCantidadActual(n1.getCapMax());
        return n1;
    }
    public void servirTaza(Nespresso n1){
        int cafe;
        System.out.println("Ingrese la catidad de café que desea servir en mililitros, en función del tamaño de la taza");
        cafe=leer.nextInt();
        for (int i = 0; i < 7; i++) {
            System.out.println("****sirviendo*****");
            System.out.println(" ");
          
        }
        if (n1.getCantidadActual()>cafe) {
            System.out.println("Su taza ha sido llenada con "+ cafe+" ml");
            n1.setCantidadActual(n1.getCantidadActual()-cafe);
        }else if(n1.getCantidadActual()<=cafe){
            if (n1.getCantidadActual()==0) {
                System.out.println("Lo sentimos no queda cafe");
            }else if (n1.getCantidadActual()>0){
                 System.out.println("Su taza se ha llenado con "+n1.getCantidadActual()+" ml");
        n1.setCantidadActual(n1.getCantidadActual()-cafe);
            }
            
        }
    
        
    }
    public void vaciarCafetera(Nespresso n1){
       n1.setCantidadActual(0);
        System.out.println("Se ha vaciado la cafetera");
      
    }
    public void agregarCafe(Nespresso n1){
        int cafe;
        System.out.println("Ingrese la cantidad de café que desea ingresar a la cafetera");
        cafe=leer.nextInt();
     if (n1.getCantidadActual()<n1.getCapMax()){
        n1.setCantidadActual(n1.getCantidadActual()+cafe);
        if (n1.getCantidadActual()>n1.getCapMax()){
            n1.setCantidadActual(n1.getCapMax());
        }
            
     }
        System.out.println("La cantidad de café en la cafetera es " +n1.getCantidadActual()+" ml");
     
    }
    
}

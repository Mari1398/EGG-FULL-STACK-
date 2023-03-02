
package poo6nespresso;

// @author Mariana

import java.util.Scanner;
import nespresso.entidades.Nespresso;
import nespresso.servicios.ServicioNespresso;

 
public class POO6Nespresso {

    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
       ServicioNespresso sn = new ServicioNespresso();
       Nespresso n1=sn.crearNespresso();
       int resp;
       boolean bandera=false;
       
       do{
        System.out.println(" Menu\n"+
                           " 1. Servir\n"+
                           " 2. Vaciar\n"+
                           " 3. Agregar");
        
        resp=leer.nextInt();
        
        switch(resp){
            case 1: 
                sn.servirTaza(n1);
                break;
            case 2:
                sn.vaciarCafetera(n1);
                break;
            case 3:
                sn.agregarCafe(n1);
                break;
            case 4: 
                bandera=true;
                break;
            
            default:
                System.out.println("Ingrese una opción valida");
                break;
        }
        }while (bandera==false);
        System.out.println( "Gracias por usar nuestros servicios\n"+
                           "Vuelva pronto");
       
    }

}


package movil.servicios;

//@author Mariana

import java.util.Scanner;
import movil.entidad.Movil;


public class ServicioMovil {
Scanner leer = new Scanner(System.in);
    public Movil cargarCelular(){
        Movil m= new Movil();
        System.out.println("Ingrese la marca del movil");
        m.setMarca(leer.next());
        System.out.println("Ingrese el modelo");
        m.setModelo(leer.next());
        System.out.println("Ingrese la capacidad de memoria ram");
        m.setMemoriaRam(leer.nextInt());
        System.out.println("Ingrese el almacenamiento");
        m.setAlmacenamiento(leer.nextInt());
        System.out.println("Ingrese el precio del movil");
        m.setPrecio(leer.nextInt());
        System.out.println("Ingrese el codigo, digito por digito");
        for (int i = 0; i <m.getCodigo().length; i++) {
            m.getCodigo()[i]=leer.nextInt();
        }
        
        System.out.println(m.toString());
    return m;          
    }
    
}

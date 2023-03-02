
package poo;
import Entidad.PERSONA;
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PERSONA datos = new PERSONA ();
       datos.getNombre();
        System.out.println(datos.getNombre());
       datos.setEdad(21);
        System.out.println(datos.getEdad());
    }
    
}

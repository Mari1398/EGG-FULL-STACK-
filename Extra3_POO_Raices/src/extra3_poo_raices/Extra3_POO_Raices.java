
package extra3_poo_raices;

// @author Mariana

import raices.entidades.Indices;
import raices.servicios.ServiciosRaices;


public class Extra3_POO_Raices {

    public static void main(String[] args) {
        ServiciosRaices sr = new ServiciosRaices ();
        Indices i = new Indices();
        i=sr.crearIndices();
        sr.calcualar(i);
         
    }

}

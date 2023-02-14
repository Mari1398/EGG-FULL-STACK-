
package extra4_poo_nif;

// @author Mariana

import nif.entidades.Nif;
import nif.servicios.ServicioNif;


public class Extra4_POO_Nif {

    public static void main(String[] args) {
        ServicioNif sn = new ServicioNif();
        Nif n = sn.crearNif();
        
        sn.mostrarNif(n);
    }

}


package extra2_poo_plano;

// @author Mariana

import plano.entidades.Plano;
import plano.servicios.ServicioPlano;


public class Extra2_POO_Plano {

    public static void main(String[] args) {
        ServicioPlano sp = new ServicioPlano();
        Plano p;
        p=sp.crearPlano();
        sp.distanciaPuntos(p);
    }

}

package collec_5paises;
// @author Mariana

import pais.servicio.ServicioPais;


public class Collec_5Paises {

    public static void main(String[] args) {
      ServicioPais sp = new ServicioPais();
      sp.crearConjunto();
      sp.mostrar();
      sp.OrdenarPaises();
      sp.eliminarPais();
      sp.mostrar();
    }

}

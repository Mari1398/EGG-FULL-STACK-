
package circunferencia;

import Entidades.Circunferencias;
import Servicio.Servicio;


public class Circunferencia {

    public static void main(String[] args) {
       Servicio cs= new Servicio();
       Circunferencias c1 = cs.crearCircunferencia();
       cs.area(c1);
       cs.perimetro(c1);
    }
    
}

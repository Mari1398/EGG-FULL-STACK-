
package sueldos;

import Entidades.Vendedor;
import Servicio.VendedorServicio;
import java.util.Scanner;

public class Sueldos {

    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       //instanciar un objeto de tipo servicio
       VendedorServicio vs=new VendedorServicio();
       // instanciacion del objeto para  alojar el retorno de lo construido en servicio
       //hay que alojar al v1 crado en servicio en el main para poder luego llamarlo por parametro en los otros metodos
       Vendedor v1 = vs.altaVendedor();
       // cuando ya esta puedo llamar a los otros metodos declarados en servicio pasandole por parametro este objeto que creamos
       // en el primer metodo para hacer los calculos
       vs.SueldoMensual(v1, leer);
       vs.Vacaciones(v1);
       
    }
    
}

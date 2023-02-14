
package mes.servicio;

//@author Mariana

import java.util.Scanner;
import mes.entidad.Meses;


public class ServicioMeses {
Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Meses crearMeses() {

        Meses m = new Meses();
        int mesSecreto = (int) (Math.random() * 11);
        boolean aux;

        do {

            System.out.println("Ingrese el mes a adivinar: ");
            m.setMeses(leer.next());
            buscarMes(m, mesSecreto);
            
            if (buscarMes(m, mesSecreto)) {
                
                System.out.println("Adivinaste el mes secreto!!");
                aux = true;
                
            }else{
            
                System.out.println("No es el mes secreto, vuelve a intentar.");
                aux = false;
            }
            

        } while (!aux);

        return m;

    }

    private boolean buscarMes(Meses m, int mesSecreto) {

        String[] aux = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        return aux[mesSecreto].equalsIgnoreCase(m.getMeses());

    }
}

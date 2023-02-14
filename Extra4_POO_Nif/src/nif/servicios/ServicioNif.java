
package nif.servicios;

//@author Mariana

import java.util.Scanner;
import nif.entidades.Nif;


public class ServicioNif {
 Scanner leer = new Scanner(System.in);

    public Nif crearNif() {

        Nif nif = new Nif();

        System.out.println("Ingrese su DNI: ");
        nif.setDNI(leer.nextLong());

        buscarLetra(nif);

        return nif;
    }

    private void buscarLetra(Nif nif) {

        String[] aux = {"t", "r", "w", "a", "g", "m", "y", "f", "p", "d", "x", "b",
            "n", "j", "z", "s", "q", "v", "h", "l", "c", "k", "e"};

        nif.setLetra(aux[(int) nif.getDNI() % 23]);

    }

    public void mostrarNif(Nif n) {

        System.out.println("Su NIF es " + n.getDNI() + " - " + n.getLetra());

    }
}

package collecalumnos_2;

// @author Mariana
import alumnos.servicio.ServicioAlumno;
import java.util.Scanner;

public class CollecAlumnos_2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioAlumno sa = new ServicioAlumno();
        sa.crearAlumno();
        sa.mostrarAlumnos();
        String resp = " ";
        boolean bandera = false;
        do {
            System.out.println("Ingrese el nombre del alumno para saber su nota final");
            int finalnota = sa.notasFinales(leer.next());
            if (finalnota > 0) {
                System.out.println("La nota final de es: " + finalnota);
            } else {
                System.out.println("Estudiante inexistente");
            }
            do {
                System.out.println("Desea consultar otro estudiante? Responda S/N");
                resp = leer.next();
                if (resp.equalsIgnoreCase("s") || resp.equalsIgnoreCase("n")) {
                    bandera = true;
                }
            } while (!bandera);
        } while (resp.equalsIgnoreCase("s"));
        
    }

}

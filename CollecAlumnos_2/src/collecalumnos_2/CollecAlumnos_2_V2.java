package collecalumnos_2;

// @author Mariana
import alumnos.servicio.ServicioAlumno;

public class CollecAlumnos_2_V2 {

    public static void main(String[] args) {
       
        ServicioAlumno sa = new ServicioAlumno();
        sa.crearAlumno();
        sa.mostrarAlumnos();
        sa.buscarAlumnoNota();
        
    }

}

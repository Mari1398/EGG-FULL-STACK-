package alumnos.servicio;

//@author Mariana
import alumnos.entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioAlumno {

    private ArrayList<Alumno> alumnos;
    private Scanner leer;

    public ServicioAlumno() {
        this.alumnos = new ArrayList();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void crearAlumno() {
         
        String resp=" ";
        boolean bandera= false;
        do {
            System.out.println("Ingrese el nombre del estudiante");
            Alumno m = new Alumno();
            m.setNombre(leer.next());
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota " + (i + 1));
               
                m.getNotas().add(leer.nextInt());
            }
            do {
                System.out.println("Desea ingresar otro estudiante? Responda S/N");
               resp = leer.next();
                if (resp.equalsIgnoreCase("s") || resp.equalsIgnoreCase("n")) {
                    bandera= true;
                }
            } while (!bandera);
          alumnos.add(m);
        } while (resp.equalsIgnoreCase("s"));

    }
    public void mostrarAlumnos(){
        for (int i = 0; i <alumnos.size(); i++) {
            Alumno a= alumnos.get(i);
            System.out.println(a);
        }
}
    public int notasFinales(String nombre){
        Integer NFinal=0;
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno a = alumnos.get(i);
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                for (int j = 0; j < a.getNotas().size(); j++) {
                    NFinal= NFinal + a.getNotas().get(j);
                    
                }
                return NFinal/3;
            }
            
        }
       return -1; 
    }
    
    public void buscarAlumnoNota(){
        String resp = " ";
        boolean bandera = false;
        do {
            System.out.println("Ingrese el nombre del alumno para saber su nota final");
            int finalnota = notasFinales(leer.next());
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

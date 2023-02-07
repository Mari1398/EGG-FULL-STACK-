
package curso.servicios;

//@author Mariana

import curso.entidades.Curso;
import java.util.Scanner;


public class ServicioCursos {
    Scanner leer = new Scanner(System.in);
 private String[] cargarAlumnos (){
     String [] alumn;
     System.out.println("Ingrese la cantidad de alumnos de este curso");
     alumn= new String [leer.nextInt()];
     
     for (int i = 0; i < alumn.length; i++) {
         System.out.println("Ingrese el nombre del alumno número "+ (i+1));
         alumn[i]=leer.next();
     }
     return alumn;
 }
 public Curso crearCurso(){
     Curso c = new Curso();

     System.out.println("Ingrese el nombre del curso");  
     c.setNombreCurso(leer.next());
     System.out.println("Ingrese la cantidad de horas diarias");
     c.setCantidadHoraDia(leer.nextInt());
     System.out.println("Ingrese la cantidad de días por semana");
     c.setCantidadHoraSemana(leer.nextInt());
     System.out.println("Ingrese la jornada");
     c.setJornada(leer.next());
     System.out.println("Ingrese el precio por hora");
     c.setPrecioHora(leer.nextInt());
     c.setAlumnos(cargarAlumnos());
     System.out.println("Las ganancias por este curso son: "+ gananciasSemanalesPorCurso( c)+" pesos\n");
  return c;
 }
 public int gananciasSemanalesPorCurso(Curso c){
     int ganancias;
     ganancias=(c.getCantidadHoraDia()*c.getPrecioHora()*c.getAlumnos().length*c.getCantidadHoraSemana());
     return ganancias;
 }
}

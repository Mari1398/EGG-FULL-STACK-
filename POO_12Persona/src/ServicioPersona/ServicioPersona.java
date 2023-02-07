
package ServicioPersona;

import EntidadPersona.EntidadPersona;
import java.util.Date;
import java.util.Scanner;

public class ServicioPersona {
    
    Scanner leer = new Scanner(System.in);
    
    public EntidadPersona crearPersona(){
    int dia, mes, anio;
    
     EntidadPersona ep = new EntidadPersona();
        System.out.println("Ingrese su nombre: ");
        ep.setNombre(leer.next());
        System.out.println("Ingrese dia de su nacimiento: ");
        dia=leer.nextInt();
        System.out.println("Ingrese mes de su nacimiento: ");
        mes=leer.nextInt();
        System.out.println("Ingrese año de su nacimiento: ");
        anio=leer.nextInt();
       
     Date fechanacimiento = new Date(anio-1900,mes-1,dia);
     ep.setFechanacimiento(fechanacimiento);
     
        System.out.println( "Fecha de nacimiento de "+ep.getNombre()+" es:"
                 + ep.getFechanacimiento());
    calcularEdad(ep);
    mostrarPersona(ep,dia,mes,anio, fechanacimiento);
        return ep;
    }
    
    private void calcularEdad(EntidadPersona ep){
        Date fechaActual = new Date();
        System.out.println("Su edad es: " + (fechaActual.getYear()- ep.getFechanacimiento().getYear()));
    }
    private boolean menorQue(EntidadPersona ep, int dia, int mes, int anio, Date fechanacimiento){
        EntidadPersona ep1= new EntidadPersona();
        Date fechaActual = new Date();
        
        System.out.println("Ingrese el nombre de un nuevo usuario");
        ep1.setNombre(leer.next());
        System.out.println("Ingrese dia de su nacimiento: ");
        dia=leer.nextInt();
        System.out.println("Ingrese mes de su nacimiento: ");
        mes=leer.nextInt();
        System.out.println("Ingrese año de su nacimiento: ");
        anio=leer.nextInt();
        fechanacimiento.setDate(dia);
        fechanacimiento.setMonth(mes);
        fechanacimiento.setYear(anio);
        ep1.setFechanacimiento(fechanacimiento);
     
        boolean retorno;
        retorno=(fechaActual.getYear()- ep1.getFechanacimiento().getYear())>(fechaActual.getYear()- ep.getFechanacimiento().getYear());
        System.out.println(ep1.toString());
        return retorno;
      
    }
    private void mostrarPersona(EntidadPersona ep, int dia, int mes, int anio, Date fechanacimiento){
       boolean menor;
       menor=menorQue(ep,dia,mes,anio, fechanacimiento);
        System.out.println(menor);
    }
    
    
}

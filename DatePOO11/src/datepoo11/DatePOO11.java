
package datepoo11;

import java.util.Date;
import java.util.Scanner;

public class DatePOO11 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
    
   
    int dia, mes, anio;
    
        System.out.println("Ingrese el día: ");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes: ");
        mes = leer.nextInt();
        System.out.println("Ingrese el año: ");
        anio = leer.nextInt();
        
        Date f = new Date (anio, mes, dia);
        
        Date fechaActual = new Date();
        
        System.out.println("Fecha igresada: " +"Día:"+f.getDate()
                +  " Mes:" + (f.getMonth()) 
                + " Año:"+(f.getYear()) );
        System.out.println("Fecha actual:"
                +"Día:"+fechaActual.getDate()
                +  " Mes:" + (fechaActual.getMonth()+1) 
                + " Año:"+(fechaActual.getYear()+1900));
        System.out.println("Entre la fecha ingresada y la fecha actual hay: " + ((fechaActual.getYear()+1900) - f.getYear()) + "años");

    }
    
}

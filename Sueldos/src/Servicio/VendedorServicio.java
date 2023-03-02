
package Servicio;

import Entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;

public class VendedorServicio {
    // crear un metodo que retorne un objeto de tipo vendedor, no necesito parametros
    //al escribir Vendedor quiere decir que eso es lo que retorna es el TIPO, importar la entidad
    //para avisarle que lo que esta en entidades sera usado en servicios
    public Vendedor altaVendedor(){
        //instaciar objeto de tipo vendedor
        Vendedor v1 = new Vendedor ();
        // se usa el construcotr por defecto si quiera usar el otro dentro del parentesis pongo las variables para llenar
        // los atributos
        //V1 contiene todos los atributos pero estan vacios
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el nombre del vendedor");
        v1.setNombre(leer.next());
        System.out.println("Ingrese el DNI del vendedor");
        v1.setDni(leer.nextInt());
        System.out.println("Ingrese el sueldo básico del vendedor");
        v1.setSueldoBasico(leer.nextDouble());
        System.out.println("Ingrese el día que empezó a trabajar");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes en que comenzó a trabajar");
        int mes= leer.nextInt();
        System.out.println("Ingrese el año en que comenzó a trabajar");
        int ano=leer.nextInt();
        Date fecha = new Date (ano-1900, mes-1,dia);
        v1.setFechaInicio(fecha);
        return v1;
        
        
    }
    
    public void SueldoMensual(Vendedor v1, Scanner leer){
        System.out.println("Ingrese cuales fueron las ventas totales del vendedor");
        Double ventas=leer.nextDouble();
        v1.setComisiones(ventas*0.15);
        v1.setSueldoMensual(v1.getComisiones()+v1.getSueldoBasico());
        System.out.println("El sueldo mensual del vendedor:"
                +v1.getNombre()+ "es de $"+v1.getSueldoBasico()); 
    }
    public void Vacaciones(Vendedor v1){
        Date hoy = new Date();
        int antiguedad = hoy.getYear()-v1.getFechaInicio().getYear();
        if (antiguedad < 5){
            System.out.println("Le corresponden 14 días de vacaciones");
        }else if(antiguedad<10){
            System.out.println("Le corresponden 21 días de vacaciones");
        }else if (antiguedad<20){
            System.out.println("Le corresponden 28 días de vacaciones");
        }else if (antiguedad>20){
            System.out.println("Le corresponden 35 días de vacaciones");
        }else{
            System.out.println("El empleado tiene vacaiones proporcionales");
        }
            
        
        
    }
    
    
    
}

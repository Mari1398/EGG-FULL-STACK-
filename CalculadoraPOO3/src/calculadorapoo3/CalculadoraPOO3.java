
package calculadorapoo3;

import Entidades.Operacion;
import Servicios.ServiciosCal;

public class CalculadoraPOO3 {
    
    public static void main(String[] args) {
        ServiciosCal sc= new ServiciosCal();
        Operacion op1= sc.crearOperacion();
        int suma = sc.suma(op1);
        int resta = sc.resta(op1);
        int multi = sc.multi(op1);
        double divi= sc.divi(op1);
        
        System.out.println("La suma de los números es " + suma);
        System.out.println("La resta de los números es " + resta);
        System.out.println("La multiplicación de los números es " + multi);
        System.out.println("La división de los números es " + divi);
    }
    
}

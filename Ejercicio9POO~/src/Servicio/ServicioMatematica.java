package Servicio;

import Entidad.EntidadMatematica;
import java.util.Scanner;

public class ServicioMatematica {

    Scanner leer = new Scanner(System.in);

    public void devolverMayor(EntidadMatematica Mat) {
        double mayor;

        mayor = Math.max(Mat.getNum1(), Mat.getNum2());

        System.out.println("El número mayor es " + mayor);

    }

    public void calcularPotencia(EntidadMatematica Mat){
        double n1, n2, resultado;
       n1 = Math.round(Mat.getNum1());
       n2 = Math.round(Mat.getNum2());
                        
        System.out.println("Num1 redondeado" + n1);
        System.out.println("Num2 redondeado " + n2);
        
        resultado = Math.pow(Math.max(n1,n2), Math.min(n1,n2));
        System.out.println("El resultado de la potencia es " + resultado);
        
    }
    public void calcularRaiz(EntidadMatematica Mat){
        //double n1 = Math.sqrt(Math.abs(Math.min(Mat.getNum1(), Mat.getNum2())));
        System.out.println("La raiz cuadrada del menor de los valores es "+(Math.sqrt(Math.abs(Math.min(Mat.getNum1(), Mat.getNum2())))));
    }
}

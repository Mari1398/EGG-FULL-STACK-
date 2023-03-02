package ejercicio9;

import Entidad.EntidadMatematica;
import Servicio.ServicioMatematica;

public class Matematica {

    public static void main(String[] args) {
        
    
    EntidadMatematica Mat = new EntidadMatematica();
    
    Mat.setNum1(Math.random()*100);
        System.out.println("El primer número es " + Mat.getNum1());
    Mat.setNum2(Math.random()*100);
        System.out.println("El segundo número es " + Mat.getNum2());

    ServicioMatematica sMat = new ServicioMatematica();

    sMat.devolverMayor(Mat);
    sMat.calcularPotencia(Mat);
    sMat.calcularRaiz(Mat);
    
    }

}

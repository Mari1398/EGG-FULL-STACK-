
package Servicios;

import Entidades.Operacion;
import java.util.Scanner;

public class ServiciosCal {
    Scanner leer = new Scanner (System.in);
    public Operacion crearOperacion(){
        Operacion op1=new Operacion();
        System.out.println("Ingrese el primer valor entero");
        op1.setNum1(leer.nextInt());
        System.out.println("Ingrese el segundo valor entero");
        op1.setNum2(leer.nextInt());
        return op1;
    }
    public int suma (Operacion op1){
        int suma;
        suma=op1.getNum1()+op1.getNum2();
        return suma;
    }
    public int resta (Operacion op1){
        int resta;
        resta=op1.getNum1()-op1.getNum2();
        return resta;
    }
    public int multi (Operacion op1){
        int multi;
        if (op1.getNum1()!=0 & op1.getNum2()!=0) {
          multi=op1.getNum1()*op1.getNum2();  
        }else {
            multi=0;
        }
        return multi;
    }
    
    public double divi (Operacion op1){
        double divi=0;
        double num1=op1.getNum1();
        double num2 =op1.getNum2();
        if (op1.getNum2()!=0) {
          divi=num1/num2;  
        }else if (op1.getNum2()==0) {
            divi=0;
        }
        return divi;
    }
}

/*
 Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package EjerciciosAprendizaje;

import java.util.Scanner;

public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int num1,num2,ope,opc;
      double oped;
      String resp;
      boolean bandera = true;
      boolean bandera2 = true;
        System.out.println("Ingrese dos números para realizar las operaciones básicas");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        
        while(bandera==true){
        if (num1>=0 && num2>=0){
        bandera = false;
        do {
            System.out.println("Menu\n"+
                              "1. Sumar\n" +
                              "2. Restar\n" +
                              "3. Multiplicar\n" +
                              "4. Dividir\n" +
                              "5. Salir\n" +
                              "Elija opción:");
             opc=leer.nextInt();
 
           switch (opc) {
               case 1:
                   ope = num1 + num2;
                   System.out.println(num1+"+"+num2+"="+ope);
                   break;
               case 2:
                   ope = num1-num2;
                   System.out.println(num1+"-"+num2+"="+ope);
                   break;
               case 3:
                   ope=num1*num2;
                   System.out.println(num1+"*"+num2+"="+ope);
                   break;
               case 4:
                   if (num2==0) {
                       System.out.println("Operacion no valida \n" +
                                          "¿Desea ingresar otro valor (S/N)?");
                       resp = leer.next();
                       
                       
                       if (resp.equalsIgnoreCase("s")){
                           System.out.println("Ingrese el segundo número");
                           num2= leer.nextInt();
                        //el punto de continue es que continue al else y haga la operacion
                        // porque num2 ya seria mayor a 0 . no funciono
                        //continue;
                        
                       }else if (resp.equalsIgnoreCase("n")){
                           break;
                           //hasta que punto devuelve break que rompe 
                           //hasta el do
                       }
                                          
                   }
                   if (num2>0){  
                   //}else {
                     double num1d=num1,num2d=num2;
                    
                     oped=num1d/num2d;
                     System.out.println(num1+"/"+num2+"="+oped);
                   }
                   break;
               case 5:
                   System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                   resp = leer.next();

                   if (resp.equalsIgnoreCase("s")){
                      bandera2=false;
                      break;
                   }else if (resp.equalsIgnoreCase("n")) {
                     
                       break; 
                   }
           } 
            
            
        } while (bandera2==true);
        
      }else if (num1<0){
            System.out.println("Ingrese el primer número nuevamente");
            num1= leer.nextInt();
            
      }else if(num2<0){
          System.out.println("Ingrese el segundo número nuevamente");
            num2= leer.nextInt();
      }
        
        }
        
      
    }
    
}

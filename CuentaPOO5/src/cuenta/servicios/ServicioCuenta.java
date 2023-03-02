
package cuenta.servicios;

import cuenta.entidades.CuentaBancaria;
import java.util.Scanner;

public class ServicioCuenta {
    Scanner leer = new Scanner (System.in);
    public CuentaBancaria crearCuenta(){
        CuentaBancaria c1= new CuentaBancaria();
        System.out.println("Ingrese su DNI");
        c1.setDni(leer.nextLong());
        System.out.println("Ingrese su número de cuenta");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su saldo actual");
        c1.setSaldoActual(leer.nextDouble());
        return c1;
        
    }
   public void ingresar(CuentaBancaria c1){
       double ingreso;
       System.out.println("Ingrese el valor que desea ingresar a su cuenta");
       ingreso=leer.nextDouble();
       c1.setSaldoActual(c1.getSaldoActual()+ingreso);
  
   }
   public void retirar (CuentaBancaria c1){
       double retiro;
       boolean bandera=false, bandera2;
       String resp;
       do{
       System.out.println("Ingrese el valor que desea retirar de su cuenta");
       retiro=leer.nextDouble();
       if (retiro>c1.getSaldoActual()){
           System.out.println("El valor que desea retirar es mayor a su saldo actual $"+ c1.getSaldoActual() +"\n"+
                              "¿desea retirar todo el saldo actual? responda S/N");
          
           resp= leer.next();
           bandera2=false;
           do{
            
           if (resp.equalsIgnoreCase("s")) {
               c1.setSaldoActual(0); 
               bandera=true;
               bandera2=true;
               break;
               
           }else if(resp.equalsIgnoreCase("n")){
               //bandera2=true;
              break;
           }else {
               System.out.println("Ingrese una respuesta corresta\n"+
                       "¿desea retirar todo el saldo actual? responda S/N" );
               resp=leer.nextLine(); 
               
           }
           }while(bandera2==true);
       
       }else if((retiro<c1.getSaldoActual())){
           c1.setSaldoActual(c1.getSaldoActual()-retiro);
           bandera=true;
           break;
       }
           if (bandera==true) {
               break;
           }

       }while(bandera==true);
   }
   public void extraccionRapida(CuentaBancaria c1){
       double saldo;
       saldo=0.2*c1.getSaldoActual();
       System.out.println("Retirar el 20% de su saldo equivalente a $"+ saldo);
   }
   
   public void consultarSaldo(CuentaBancaria c1){
       System.out.println("Su saldo es $"+ c1.getSaldoActual() );
   }
   
   public void consultarDatos(CuentaBancaria c1){
       System.out.println("Su DNI " + c1.getDni());
     System.out.println("Su número de cuenta es  " + c1.getNumeroCuenta());
     System.out.println("Su saldo actual es  " + c1.getSaldoActual());
   }
    
}

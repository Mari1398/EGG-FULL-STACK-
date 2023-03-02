package cuentapoo5;

import cuenta.entidades.CuentaBancaria;
import cuenta.servicios.ServicioCuenta;
import java.util.Scanner;

public class CuentaPOO5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
 
        ServicioCuenta sc = new ServicioCuenta();
        CuentaBancaria c1= sc.crearCuenta();
        int resp;
        boolean bandera=false;
        do{
        System.out.println(" Menu\n"+
                           " 1. Consignaciones\n"+
                           " 2. Retiros\n"+
                           " 3. Consulta de saldo\n"+
                           " 4. Retiro rápido\n"+
                           " 5. Consulta de saldo\n"+
                           " 6. Consulta de datos\n"+
                           " 7. Finalizar transacción");
        
        resp=leer.nextInt();
        
        switch(resp){
            case 1: 
                sc.ingresar(c1);
                break;
            case 2:
                sc.retirar(c1);
                break;
            case 3:
                sc.consultarSaldo(c1);
                break;
            case 4: 
                sc.extraccionRapida(c1);
                break;
            case 5:
                sc.consultarSaldo(c1);
                break;
            case 6:
                sc.consultarDatos(c1);
                break;
            case 7:
                bandera=true;
                break;
            default:
                System.out.println("Ingrese una opción valida");
                break;
        }
        }while (bandera==false);
        System.out.println("Ha finalizado la transacción\n"+
                           "Gracias por usar nuestros servicios\n"+
                           "Vuelva pronto");
        
        
    }
    
}

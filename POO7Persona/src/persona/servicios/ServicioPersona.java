
package persona.servicios;

// @author Mariana

import java.util.Scanner;
import persona.entidades.Persona;


public class ServicioPersona {
    Scanner leer = new Scanner (System.in);
    public Persona crearPersona(){
        boolean bandera=false;
        Persona p1= new Persona();
        System.out.println("Ingrese el nombre del usuario");
        p1.setNombre(leer.next());
        System.out.println("Ingrese la edad del usuario");
        p1.setEdad(leer.nextInt());
        do {
            System.out.println("Ingrese el sexo del usuario('H' hombre, 'M' mujer, 'O' otro) ");
            p1.setSexo(leer.next());
            if (p1.getSexo().equalsIgnoreCase("H")||p1.getSexo().equalsIgnoreCase("M")||p1.getSexo().equalsIgnoreCase("H")||p1.getSexo().equalsIgnoreCase("O")) {
                
                bandera=true;
                
            } else{
                
                System.out.println("Caracter no reconocido, por favor intentelo de nuevo");
            }
        }while(bandera==false);
        System.out.println("Ingrese el peso del usuario, en kilogramos");
        p1.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura del usuario, en metros");
        p1.setAltura(leer.nextDouble());
        
        switch (calcularIMC(p1)){
            case 1:
                System.out.println("Tiene sobre peso");
                break;
            case 0:
                System.out.println("Esta en su peso ideal");
                break;
            case -1:
                System.out.println("Esta por debajo de su peso");
                break;
                
        }
                

        if (mayorEdad(p1)) {
            System.out.println("Es mayor de edad");
        }else {
            System.out.println("Es menor de edad");
        }

        
        return p1;
    }
    public int calcularIMC(Persona p1){
        double pesoI;
        pesoI=(p1.getPeso()/Math.pow(p1.getAltura(),2));
        if (pesoI<20) {
            return -1;
        }else if (pesoI>=20&pesoI<=25){
            return 0;
        }else if(pesoI>25){
            return 1;
        } 
      return 1;  
    }
    public boolean mayorEdad(Persona p1){
        return p1.getEdad()>=18;
        
    }
}

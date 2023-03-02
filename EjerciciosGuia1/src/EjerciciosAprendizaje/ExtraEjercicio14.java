
package EjerciciosAprendizaje;

import java.util.Scanner;


public class ExtraEjercicio14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int familias, hijos, edad,  cont=0;
        double media, sumaEdades=0.0;
        
        System.out.println("Ingrese la cantidad de familias");
        familias = leer.nextInt();
        for (int i = 1; i <= familias; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia: "+i);
            hijos = leer.nextInt();
            for (int j = 1; j <= hijos; j++) {
                System.out.println("Ingrese la edad del hijo: "+j);
                edad = leer.nextInt();
                sumaEdades = sumaEdades+edad;
                cont++;
            }
        }
        media = sumaEdades/cont;
        System.out.println("La edad promedio de los hijos de todas las familias es: "+ media);
    }
    
}


package EjerciciosAprendizaje;

import java.util.Scanner;

public class ExtraEjercicio13 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int n;
    String aux="";
        System.out.println("Ingrese la altura de la escalera");
        n=leer.nextInt();
        for (int i = 0; i < n; i++) {
            //aux= aux+(i+1);
            aux+=" "+(i+1)+" ";
            System.out.println(aux);
        }
    }
    
}


package EjerciciosAprendizaje;
import java.util.Scanner;
public class ExtrasEjercicio24 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int j=1, k=0,f,n;
    
        System.out.println("Ingrese el indice n al que desea llegar");
        n=leer.nextInt();
        int [] V=new int [n];
        
        for (int i = 0; i < n; i++) {
            f=k+j;
            V[i]=f;
            k=f;
            if (i>0){
            j=V[i-1];
            }else{
                j=1;
            }
        }
        for (int i = 0; i <V.length; i++) {
            System.out.print(V[i]+" ");
        }
    }
    
}

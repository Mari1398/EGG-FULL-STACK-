package arrays.servicio;

//@author Mariana
import arrays.entidades.Arreglos;
import java.util.Arrays;

public class ServicioArrays {

    public Arreglos crearArrays() {
        Arreglos a1 = new Arreglos();
        for (int i = 0; i <a1.getArregloA().length; i++) {
            a1.getArregloA()[i]=(Math.random()*100);
        }
        System.out.println(Arrays.toString(a1.getArregloA()));
       
        ordenar (a1);
        llenadoArrayB(a1);
        return a1;
    }

    private void ordenar(Arreglos a1) {
        Arrays.sort(a1.getArregloA());
        System.out.println(Arrays.toString(a1.getArregloA()));
    }
   private void llenadoArrayB (Arreglos a1){
       
       //a1.setArregloB(Arrays.copyOfRange(a1.getArregloA(), 0, 9)); puedo llenar el vector de 0 a 9
       //queda definido de ese tamaño
       a1.setArregloB(Arrays.copyOf(a1.getArregloA(), 20)); 
       //tendría que llenarlo completo para que luego me deje reemplazar
       //cuenta del 1 al 20
       Arrays.fill(a1.getArregloB(), 10, 20, 0.5);
       
     System.out.println(Arrays.toString(a1.getArregloB()));
       
   }
}

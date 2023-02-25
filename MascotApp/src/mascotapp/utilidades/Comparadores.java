package mascotapp.utilidades;

//@author Mariana

import java.util.Comparator;
import mascotapp.entidades.Mascota;


public class Comparadores {
// es un interfaz generica, el metodo compare recibe T para compara o1 y o2 se sobre escribe el objeto
    public static Comparator <Mascota> ordenarPorNombreDesc = new Comparator<Mascota>() {
        @Override
        public int compare(Mascota o1, Mascota o2) {
           return o2.getNombre().compareTo(o1.getNombre());
        }
    };
    
     public static Comparator <Mascota> ordenarPorEdadDesc = new Comparator<Mascota>() {
        @Override
        public int compare(Mascota o1, Mascota o2) {
           return o2.getEdad().compareTo(o1.getEdad());
        }
    };
            
}

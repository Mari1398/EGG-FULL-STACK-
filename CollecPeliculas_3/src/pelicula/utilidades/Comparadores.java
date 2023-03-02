package pelicula.utilidades;

//@author Mariana

import java.util.Comparator;
import pelicula.entidades.Pelicula;


public class Comparadores {
  
   public static Comparator<Pelicula> comparaPorDuracionAsc = new Comparator<Pelicula>() {
       @Override
       public int compare(Pelicula t, Pelicula t1) {
           return t.getDuracion().compareTo(t1.getDuracion());
       }
   };
   public static Comparator<Pelicula> comparaPorDuracionDesc = new Comparator<Pelicula>() {
       @Override
       public int compare(Pelicula t, Pelicula t1) {
           return t1.getDuracion().compareTo(t.getDuracion());
       }
   };
    public static Comparator<Pelicula> comparaPorTituloAsc = new Comparator<Pelicula>() {
       @Override
       public int compare(Pelicula t, Pelicula t1) {
           return t.getTitulo().compareTo(t1.getTitulo());
       }
   };
    public static Comparator<Pelicula> comparaPorDirectorAsc = new Comparator<Pelicula>() {
       @Override
       public int compare(Pelicula t, Pelicula t1) {
           return t.getDirector().compareTo(t1.getDirector());
       }
   };
    

}

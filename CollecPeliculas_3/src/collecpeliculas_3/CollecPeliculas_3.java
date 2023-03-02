package collecpeliculas_3;

// @author Mariana

import pelicula.servicio.ServicioPelicula;


public class CollecPeliculas_3 {

    public static void main(String[] args) {
        ServicioPelicula sp = new ServicioPelicula();
        sp.añadirPeliculas();
        sp.mostrarPelicula();
        sp.mayorHora();
        sp.ordenarPeliculasDurAsc();
        sp.ordenarPeliculasDurDesc();
        sp.ordenarPeliculasTituloAsc();
        sp.ordenarPeliculasDirectorAsc();
      
    }

}

package pelicula.servicio;

//@author Mariana
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import pelicula.entidades.Pelicula;
import pelicula.utilidades.Comparadores;

public class ServicioPelicula {

    private Scanner leer;
    private ArrayList<Pelicula> peliculas;

    public ServicioPelicula() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.peliculas = new ArrayList();
    }

    public Pelicula crearPelicula() {
        Pelicula p = new Pelicula();
        System.out.println("Ingrese el titulo");
        p.setTitulo(leer.next());
        System.out.println("Ingrese el director de la pelicula");
        p.setDirector(leer.next());
        System.out.println("Ingrese la duración de la pelicula en horas");
        p.setDuracion(leer.nextDouble());

        return p;
    }

    public void añadirPeliculas() {
        String resp = "";
        do {
            System.out.println("");
            peliculas.add(crearPelicula());

            do {
                System.out.println("\nDesea añadir una nueva pelicula a la lista? Responda S/N");
                resp = leer.next();
                
            } while (!(resp.equalsIgnoreCase("n") || resp.equalsIgnoreCase("s")));

        } while (resp.equalsIgnoreCase("s"));

    }

    public void mostrarPelicula() {
        System.out.println("\nLas Peliculas en la lista son");
        peliculas.forEach((aux) -> System.out.println(aux));
    }
    public void mayorHora(){
        System.out.println("\nLas Peliculas mayores a una hora en lista son");
        for (int i = 0; i <peliculas.size(); i++) {
             
            if (peliculas.get(i).getDuracion()>1) {
                System.out.println(peliculas.get(i));
            }
        }
    }
    public void ordenarPeliculasDurAsc(){
        System.out.println("\nLista de peliculas ordenadas por duración de menor a mayor");
        Collections.sort(peliculas, Comparadores.comparaPorDuracionAsc);
        mostrarPelicula();
    }
    
    public void ordenarPeliculasDurDesc(){
        System.out.println("\nLista de peliculas ordenadas por duración de mayor a menor");
        Collections.sort(peliculas, Comparadores.comparaPorDuracionDesc);
        mostrarPelicula();
    }
    public void ordenarPeliculasTituloAsc(){
        System.out.println("\nLista de peliculas ordenadas por titulo alfabeticamente");
        Collections.sort(peliculas, Comparadores.comparaPorTituloAsc);
        mostrarPelicula();
    }
    public void ordenarPeliculasDirectorAsc(){
        System.out.println("\nLista de peliculas ordenadas por director alfabeticamente");
        Collections.sort(peliculas, Comparadores.comparaPorDirectorAsc);
       mostrarPelicula();
    }
    
}

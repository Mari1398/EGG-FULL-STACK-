package mascotappcollections;

// @author Mariana
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import mascotapp.entidades.Mascota;

public class MascotappConjuntos {

    public static void main(String[] args) {
        // Recordar que los conjuntos SET son parte de las collection, sin elementos duplicados
        // TreeSet se ordena con un criterio implicitamente determinado o con uno que queramos
        // LinkedHashSet HashSet no se ordena en si mismo requiere 

        Set<String> nombres = new HashSet();

        nombres.add("Chiquito");
        nombres.add("Chiquito");
        nombres.add("Chiquito");

        nombres.forEach((aux) -> System.out.println(aux));
        // muestra en pantalla solo un chuiquito
       
       //HASHSET
       
        /*
        Set<Mascota> mascotas = new HashSet();
        
        // para que genere el codigo hash se debe crear en la entidad el hashcode y el equals
       
        mascotas.add(new Mascota("Fer", "Chiquito", "Perro"));
        mascotas.add(new Mascota("Fer", "Chiquito", "Perro"));
        mascotas.add(new Mascota("Fer", "Chiquito", "Perro"));
        mascotas.add(new Mascota("Fer", "Chiquito", "Perro"));
        mascotas.add(new Mascota("Ner", "Chiquito", "Perro"));
        mascotas.add(new Mascota("Pepa", "Lola", "Gato"));
        mascotas.add(new Mascota("Pepa", "Lola", "Gato"));
        mascotas.add(new Mascota("Pepa", "Lola", "Gato"));
        mascotas.add(new Mascota("Pepa", "Lola", "Gato"));
        mascotas.add(new Mascota("Aepa", "Lola", "Gato"));
        mascotas.add(new Mascota("Zepa", "Lola", "Gato"));

        mascotas.forEach((aux) -> System.out.println(aux));
       
       */
       // PARA ORDENAR SE GENERA EL ANTERIO SET COMO TREE
       
       
       Set<Mascota> mascotas = new TreeSet();
     
        mascotas.add(new Mascota("Fer", "Chiquito", "Perro"));
        mascotas.add(new Mascota("Fer", "Chiquito", "Perro"));
        mascotas.add(new Mascota("Fer", "Chiquito", "Perro"));
        mascotas.add(new Mascota("Fer", "Chiquito", "Perro"));
        mascotas.add(new Mascota("Ner", "Chiquito", "Perro"));
        mascotas.add(new Mascota("Pepa", "Lola", "Gato"));
        mascotas.add(new Mascota("Pepa", "Lola", "Gato"));
        mascotas.add(new Mascota("Pepa", "Lola", "Gato"));
        mascotas.add(new Mascota("Pepa", "Lola", "Gato"));
        mascotas.add(new Mascota("Aepa", "Lola", "Gato"));
        mascotas.add(new Mascota("Zepa", "Lola", "Gato"));

        mascotas.forEach((aux) -> System.out.println(aux));

        
        //se puede ordenar a traves de un comparator por medio del contructor
        //Set<Mascota> mascotas = new TreeSet(AQUÍ COMPARADOR (comparator comparator);
    }

}

package mascotappcollections;

// @author Mariana

import java.util.HashMap;
import java.util.Map;
import mascotapp.entidades.Mascota;


public class MascotappMaps {

    public static void main(String[] args) {
        // NO PERTECENE A COLLECTIONS FAMILIA INDEPENDIENTE
        // PUEDE SER ORDENADO
        //PUEDE REPETIRSE
        
        HashMap <Integer, String> nombres= new HashMap();
        
        nombres.put(1, "Chiquito");
        
        for (Map.Entry<Integer, String> aux : nombres.entrySet()) {
            Integer key = aux.getKey();
            String value = aux.getValue();
            System.out.println("Key: " + key + "\nValue: "+ value); 
        }
       
        HashMap <Integer, Mascota> mascotas= new HashMap();
        
        // esta bueno que la clase tenga el hash code el equals y comparable
        mascotas.put(1, new Mascota("Fer", "Chiquito", "Perro"));
        mascotas.put(2, new Mascota("Pepa", "Lola", "Gato"));
        
         mascotas.remove(1, new Mascota("Fer", "Chiquito", "Perro"));
        //demanda el objeto que quiero remover
        mascotas.remove(2);
        //remover solo con la llave
        // bucle para eliminar algo puntual o un itereator dependerá
        
        for (Map.Entry<Integer, Mascota> entry : mascotas.entrySet()) {
            Integer key = entry.getKey();
            Mascota value = entry.getValue();
            
            System.out.println("Key: " + key + "\nValue: "+ value);
            
        }
     
        
        mascotas.replace(1, new Mascota("Fer", "Chiquito", "Perro"));
        //demanda el objeto que quiero remover
    }

}

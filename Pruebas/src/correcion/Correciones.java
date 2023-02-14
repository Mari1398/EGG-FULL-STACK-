package correcion;

// @author Mariana
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Correciones {

    public static void main(String[] args) {

        ArrayList<Integer> listado = new ArrayList();
        TreeSet<String> conjunto = new TreeSet();
        HashMap<Integer, String> persona1 = new HashMap();

        //forma 1
        HashMap<String, String> personas = new HashMap();
        String n1 = "Albus";
        String n2 = "Severus";
        personas.put(n1, n2);

        // forma 2
        HashMap<Integer, String> personas1 = new HashMap<>();
        int llave = 1;
        int llave2 = 2;
        personas1.put(llave, n1);
        personas1.put(llave2, n2);

        //forma 3
        List<String> personas2 = new ArrayList<>();
        personas2.add(n1);
        personas2.add(n2);

        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it = bebidas.iterator();
        while (it.hasNext()) {
            if (it.next().equals("café")) {
                it.remove();
            }

        }
        
    }

}

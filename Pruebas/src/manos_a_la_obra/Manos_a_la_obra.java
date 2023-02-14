package manos_a_la_obra;

// @author Mariana
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Manos_a_la_obra {

    public static void main(String[] args) {

        // AGREGAR elementos para list and set .add
        ArrayList<Integer> numerosA = new ArrayList();
        int x = 20;
        numerosA.add(x);
        numerosA.add(21);
        numerosA.add(22);
        numerosA.add(23);
        numerosA.add(24);
        numerosA.add(25);
        numerosA.add(26);

        HashSet<Integer> numerosB = new HashSet();
        Integer y = 26;
        numerosB.add(y);
        numerosB.add(31);
        numerosB.add(22);
        numerosB.add(21);
        numerosB.add(36);
        numerosB.add(40);

        // agregar elementos para maps .put
        HashMap<Integer, String> alumnos = new HashMap();
        int dni = 1049654432;
        String nombreAlum = "Mari";
        alumnos.put(dni, nombreAlum);
        alumnos.put(1049654439, "Jime");
        alumnos.put(1049654421, "Martha ");
        alumnos.put(1049654490, "Sol");
        alumnos.put(1049654410, "Ana");
        alumnos.put(1049654407, "Olga");

        //\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\
        //\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\
        // REMOVER elementosde listas, se puede hacer por indice o por elemento
        numerosA.remove(4);
        //numerosA.remove(23); REVISAR

        //numerosA.remove(25);
        // En comjutos solo se puede remover por elemento, no son ordenados por indices
        numerosB.remove(31);

        //En mapas solo se puede remover el elemento por las llaves
        alumnos.remove(1049654437);
        //\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\
        //\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\

        //RECORRER
        for (Integer num : numerosA) {
            System.out.println("Valor en lista: " + num);
        }

        for (Integer num : numerosB) {
            System.out.println("Valor en conjuntos: " + num);
        }

        // Para mostrae maps se hace uso del método Map.Entry
        for (Map.Entry<Integer, String> alum : alumnos.entrySet()) {
            System.out.println("Documento: " + alum.getKey() + "\n" + "Nombres: " + alum.getValue());
        }
        // sin usar entry

        for (Integer doc : alumnos.keySet()) {
            System.out.println("Documento: " + doc);
        }
        for (String nom : alumnos.values()) {
            System.out.println("Nombres: " + nom);
        }
        //\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\
        //\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\

        //ITERATOR
        ArrayList<String> lista = new ArrayList();
        lista.add("a");
        lista.add("b");
        lista.add("z");
        lista.add("l");
        lista.add("e");
        lista.add("j");
        lista.add("x");
        lista.add("i");
        lista.add("m");
        for (String letra : lista) {
            System.out.println("Letra: " + letra);
        }
        Iterator iterator = lista.iterator();
//        System.out.println("Elementos de la lista: ");

//        while (iterator.hasNext()) {
//            System.out.print(iterator.next() + "");
//        }
//        System.out.println("");
//       si lo dejo no entra al bucle no hay hasnext, para usarlo varias veces habria que crear otra variable iterator para
//       igualar a la lista
        //REMOVE con iterator Los mapas son los únicos que no podemos eliminar mientras las iteramos.
        System.out.println(" REMOVE");
        while (iterator.hasNext()) {
            if (iterator.next().equals("b")) {
                iterator.remove();
            }
            // System.out.print(iterator.next() + "");
        }
        System.out.println("Elementos de la lista: ");

        for (String letra : lista) {
            System.out.println("Letra: " + letra);
        }
        
        Iterator<Integer> it = numerosB.iterator();
        while (it.hasNext()) {
            if (it.next() == 30) {
                it.remove();
            }
        }

        for (Integer num : numerosB) {
            System.out.println("Valor Set = " + num);
        }
        //\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\
        //\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\

        // ORDENAR 
        //Los conjuntos o los mapas no pueden utilizar el sort(), convertir en listas para ordenar o usar treeSet
        // y treeMap NO FUNCIONA CON OBJETOS.
        Collections.sort(lista);
        for (String letra : lista) {
            System.out.println("Letra: " + letra);
        }
        System.out.println("");
        //convertir el conjunto numerosB en un ArrayList listaNumerosB
        ArrayList<Integer> listaNumerosB = new ArrayList(numerosB);
        Collections.sort(listaNumerosB);
        for (Integer num : listaNumerosB) {
            System.out.println("Valor conjunto ordenado: " + num);
        }
         
       // convertir hashmap en treemap
        System.out.println("");
       TreeMap<Integer , String> alumnosTree= new TreeMap(alumnos);
        System.out.println("Mapa ordenado");
       for (Map.Entry<Integer, String> alum : alumnosTree.entrySet()) {
            System.out.println("Documento: " + alum.getKey() + "\n" + "Nombres: " + alum.getValue());
        }
        

    }

}

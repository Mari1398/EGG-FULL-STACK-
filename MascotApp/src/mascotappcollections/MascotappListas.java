package mascotappcollections;

// @author Mariana
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import mascotapp.entidades.Mascota;
import mascotapp.servicios.ServicioMascotaCollections;
import mascotapp.utilidades.Comparadores;

public class MascotappListas {

    public static void main(String[] args) {
///\/\/\/\/\/\/\/\\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\//\/\/\
//COLLECTIONS

/// ARRAYLIST TIPO STRING DESDE MAIN
        /*
        String []  nombresArray = new String [5];
        String nombresArray[] = {"lupe", "salome", "conito", "gomita", "osita"};
               for (String nombres : nombresArray) {
       
                    System.out.println(nombres);
               }
               ArrayList<String> nombresArrayList = new ArrayList<>();   //opcion del generico(?) es opccional <>
               nombresArrayList.add("Salo");
               nombresArrayList.add("Conis");
               nombresArrayList.add("gomito");
               nombresArrayList.add("osiris");
   
               System.out.println(nombresArrayList.size());

               nombresArrayList.remove("Lupita");
               nombresArrayList.remove(2);
               System.out.println(nombresArrayList.size());
               
         */
///\/\/\/\/\/\/\/\\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\//\/\/\
/// ARRAYLIST DESDE SERVICIO DE TIPO STRING
        ServicioMascotaCollections serMasc = new ServicioMascotaCollections();
        /*
           serMasc.crearMascotaS();
           serMasc.crearMascotaS();
           serMasc.mostrarMascotas();
         */

///\/\/\/\/\/\/\/\\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\//\/\/\
/// ARRAYLIST DESDE SERVICIO DE TIPO MASCOTA
        //Añadir y mostrar
        //  le pasamos al metodo el argumento desde el main
        //serMasc.fabricaChiquitos(14);
        //serMasc.mostrarMascotas();
        //serMasc.fabricaMascota(3);
        //serMasc.mostrarMascotas();
        // Actulizar y eliminar
        //serMasc.actualizarMascota(0);
        //serMasc.mostrarMascotas();
        /*
        serMasc.actulizarMascotaV2(1);
        serMasc.mostrarMascotas();
        serMasc.eliminarMascotas(2);
        serMasc.mostrarMascotas();
         */
///\/\/\/\/\/\/\/\\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\//\/\/\
/// ARRAYlIST OTRAS CARACTERISTICAS

        /*
        String[] nombres = {"pepe", "pepa"};
        List<String> nombresList = new ArrayList(Arrays.asList(nombres));
        // Este constructor convierte un array en array list desacomodando sus elementos
        // CTRL+SPACE   * Se puede inicializar con un valor que cambiara si se agregar mas elementos
        //              * Se puede agregar una collection

        List<String> nombresList2 = new ArrayList(Arrays.asList(nombres));

        nombresList2.addAll(1, nombresList2);
       // añade una lista a otra lista con la opcion puede escogerse el lugar donde se introducuran los nuevos elementos segun el indice,
      // asi quedara delante o detras de alguno en especifico o puede estar si eso, .addAll(collections)
         */
///\/\/\/\/\/\/\/\\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\//\/\/\
/// ITERAR O RECORRER
///******************************************ITERATOR YA NO SE USA**************************************************
        /*
        List<String> nombres = new ArrayList();
        nombres.add("Lola");
        nombres.add("Rodman");
        nombres.add("Chiquito");
        // si se elimina un objeto el for each no podrá completarse ya que esta diseñado desde un inicio para 
        // recorrer un numero determinado de elementos
        for (String aux : nombres) {
            System.out.println(aux);
        }
        // con el size se mantiene atado de forma dinamica
 
        for (int i = 0; i < nombres.size(); i++) {
            String m = nombres.get(i);
            if (m.equals("Lola")) {
                nombres.remove(m);
                
            }
            
        }
        
        nombres.forEach((e)->System.out.println(e));
        
        Iterator <String> it = nombres.iterator();
        
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equals("Rodman")) {
                it.remove();
            }
            
        }
        nombres.forEach((e)->System.out.println(e));
       // evalua y salta, hasNext corrobora la existencia del siguiente y no da false y se corta
       
        /*
        serMasc.eliminarMascotaPorNombre("Salome");
        serMasc.actualizarMascotaPorNombre("Lola", "Lupita");
        serMasc.mostrarMascotas();
         */
///\/\/\/\/\/\/\/\\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\//\/\/\
/// MATRICES CON ARRAYLIST adentro filas fuera columnas
        //ArrayList<ArrayList<String>> matriz = new ArrayList();
///\/\/\/\/\/\/\/\\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\//\/\/\
/// MATRICES CON ARRAYLIST adentro filas fuera columnas
        ArrayList<Mascota> mascotas = new ArrayList();

        mascotas.add(new Mascota("Fer", "Chiquito", "Perro"));
        mascotas.add(new Mascota("Fer", "Chiquito", "Perro"));
        mascotas.add(new Mascota("Fer", "Chiquito", "Perro"));
        mascotas.add(new Mascota("Fer", "Chiquito", "Perro"));
        mascotas.add(new Mascota("Fer", "Chiquito", "Perro"));
        mascotas.add(new Mascota("Pepa", "Lola", "Gato"));
        mascotas.add(new Mascota("Pepa", "Lola", "Gato"));
        mascotas.add(new Mascota("Pepa", "Lola", "Gato"));
        mascotas.add(new Mascota("Pepa", "Lola", "Gato"));
        mascotas.add(new Mascota("Pepa", "Lola", "Gato"));
        mascotas.add(new Mascota("Pepa", "Lola", "Gato"));
        
        

        mascotas.forEach((aux) -> {
            System.out.println(aux);
        });

        Collections.sort(mascotas, Comparadores.ordenarPorNombreDesc);

        mascotas.forEach((e) -> System.out.println(e));
        
        
        // desordenado (?)
        Collections.shuffle(mascotas);
     mascotas.forEach((e) -> System.out.println(e));
        
    }

}

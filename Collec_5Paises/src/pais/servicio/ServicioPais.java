package pais.servicio;

//@author Mariana

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
import pais.entidades.Pais;


public class ServicioPais {
private Scanner leer;
private HashSet<Pais> paises;

    public ServicioPais() {
        this.leer= new Scanner (System.in).useDelimiter("\n");
        this.paises= new HashSet();
        
    }
    
    public void crearConjunto(){
        String resp="";
        
        
     do {
           
         System.out.println("Ingrese el nombre del país");
         paises.add(new Pais(leer.next()));
            do {
                System.out.println("\nDesea añadir una nuevo país? Responda S/N");
                resp = leer.next();
                
            } while (!(resp.equalsIgnoreCase("n") || resp.equalsIgnoreCase("s")));

        } while (resp.equalsIgnoreCase("s"));
        
    }
    
    public void mostrar(){
        paises.forEach((aux)-> System.out.println(aux));
    }
    
    public void OrdenarPaises(){
        System.out.println("\nLos paises ordenados son: ");
        TreeSet<Pais> treePaises = new TreeSet(paises);
        treePaises.forEach(System.out::println);
       //TreeSeet cannot be converted to HashSet paises=treePaises;
    }
    
    public void eliminarPais(){
        boolean bandera=true;
        System.out.println("Ingrese el país que desea eliminar");
        Iterator<Pais> it=paises.iterator();
        while (it.hasNext()) {
            Pais next = it.next();
            if (next.getNombrePais().equalsIgnoreCase(leer.next())) {
                it.remove();
                bandera=false;
                break;
             
            }
        }
        if (bandera) {
            System.out.println("El país no encontrado");
        }
    }
    



}

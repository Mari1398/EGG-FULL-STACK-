
package mascotapp;

import mascotapp.entidades.Mascota;
import mascotapp.servicios.ServicioMascota;

public class MascotApp {

    
    public static void main(String[] args) {
        
    /*  Scanner leer= new Scanner (System.in);
      // para que nazca debe haber un constructor, en este caso es default {implicito)
      //luego de que se cree un constructor ctrl clik en la clase mascota  lleva direcatmente a la linea donde este este
      // sino lleva directamente a la clase
      Mascota m2=new Mascota();
      Mascota m1=new Mascota("Fernado Chiquito", leer.next(), "perro");
      //si es privado se deja ingresar por primera vez desde el constructor, para cambiar con setter
     
//      no hace falta hacerlo asi, CONTROL + ESPACIO EN EL PARENTESIS SUGIERE LOS CONSTRUCTORES  
//      si es publico se puede asignar como sigue sino, settear
//      m1.apodo="Chiquito";
//      m1.nombre=leer.next();
//      m1.tipo="Perro";
//      m1.edad=14;
//      m1.raza="Beagle";
//      m1.cola=true;
//      m1.color="Tricolor";
    
    //podría añadir más m para crear más mascotas
    
    //Mascota m2= new Mascota();
    //Mascota m3 = new Mascota();
   
   m1.setNombre("Pepe Chiquito");
        System.out.println(m1);
   //  muestra el espacion en memoria donde esta guardada el objeto m1 queeee
        System.out.println(" ");
       
   // muestra los lugares en memoria donde se guarda si se usa la funcion toString muestra un mensaje predeterminado mostrando
   //las objetos guardado 
   m1.pasear(100);
    System.out.println(m1);
*/
    
    ServicioMascota sm = new ServicioMascota();
    
    Mascota m1 = sm.crearMascota();
    
        System.out.println(m1);
        m1=null;
        System.out.println(m1);
        
        
   
      
      
        
        
        
        
    }
    
}

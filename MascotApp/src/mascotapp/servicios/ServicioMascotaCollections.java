package mascotapp.servicios;

//@author Mariana
import java.util.ArrayList;
import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class ServicioMascotaCollections {
// SON COMO ATRIBUTOS PUEDEN TENER CONSTRUCTORES ETC

    private Scanner leer;
    //soluciona el problema de next nextLine
    private ArrayList<String> mascotas;  /// PUEDE SER CON LIST
    private ArrayList<Mascota> mascotasO;

    public ServicioMascotaCollections() {
        // iniciamos en el constructor el scanner y la lista
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
        this.mascotasO = new ArrayList();
    }

    public void crearMascotaS() {
        System.out.println("Introducir nombre");
        String nombre = leer.next();
        System.out.println("Introducir apodo");
        String apodo = leer.next();
        System.out.println("Introducir tipo");
        String tipo = leer.next();

        String mascota = nombre + " " + apodo + " " + tipo;

        mascotas.add(mascota);
        // estoy guardando un String mas no el objeto

    }

    public Mascota crearMascotaO() {
        System.out.println("Introducir nombre");
        String nombre = leer.next();
        System.out.println("Introducir apodo");
        String apodo = leer.next();
        System.out.println("Introducir tipo");
        String tipo = leer.next();

        return new Mascota(nombre, apodo, tipo); // ctrl espacio para escoger el constructor

    }

    public void agregarMascota(Mascota m) {
        mascotasO.add(m);
    }

    public void mostrarMascotas() {
        System.out.println("Las mascotas actuales de las lista mascota son");

        for (Mascota aux : mascotasO) {
            System.out.println(aux.toString());
        }
        System.out.println("Cantidad= " + mascotasO.size());
    }

    /**
     * se pone el slach y astericos enter para que salga el comentario crear la
     * misma msacota
     *
     * @param cantidad equivale a la cantidad de mascota a crear y añadir a la
     * lista
     */
    public void fabricaChiquitos(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            mascotasO.add(new Mascota("Fer", "Chiquito", "Perro"));
        }
    }

    /**
     * fabrica mascotas diferentes
     *
     * @param cantidad
     */
    public void fabricaMascota(int cantidad) {

        for (int i = 0; i < cantidad; i++) {
            Mascota mascotaCreada = crearMascotaO();
            agregarMascota(mascotaCreada);
            System.out.println(mascotaCreada.toString());

        }
    }

    public void actualizarMascota(int index) {
        Mascota m = mascotasO.get(index);
        m.setApodo("Alfredo");
    }

    public void actulizarMascotaV2(int index) {

        if (index<= (mascotasO.size()-1)) {
            System.out.println("-----------------Actualizar-----------------");
            Mascota m = crearMascotaO();
            mascotasO.set(index, m);
        } else{
            System.out.println("Fallo al actualizar, el indice es incorrecto");
        }

    }

    public void eliminarMascotas(int index) {
       
        if (index<= (mascotasO.size()-1)) {
             mascotasO.remove(index);
        } else{
            System.out.println("Fallo al eliminar, el indice es incorrecto");
        }
    }
    
    public void eliminarMascotaPorNombre(String nombre){
        for (int i = 0; i < mascotasO.size(); i++) {
            Mascota m = mascotasO.get(i);
            if (m.getNombre().equals(nombre)) {
                mascotasO.remove(i);
            }
        }
    }
    public void actualizarMascotaPorNombre(String nombre, String nombreNuevo){
        for (int i = 0; i < mascotasO.size(); i++) {
            Mascota m = mascotasO.get(i);
            if (m.getNombre().equals(nombre)) {
                m.setNombre(nombreNuevo);
            }
        }
    }
}

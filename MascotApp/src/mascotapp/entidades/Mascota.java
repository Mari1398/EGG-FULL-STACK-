
package mascotapp.entidades;

import java.util.Objects;

public class Mascota implements Comparable<Mascota>{  // estamos haciendo que nuestra clase mascota se
    //compare contra otras mascotas, sin un criterio en especifico puede ser util para treeSet's
    



    // 1.atributos
    // si son privados se puede cambiar setteando, encapsulamiento
    private String nombre;
    private String apodo;
    //conejo, gato, perro...
    private String tipo;
    private String color;
    private Integer edad;
    private boolean cola;
    private String raza;
    // se pude inicializar no recomedable porque podria quedar como constante
    private int energia;
    
    
    // los objetos primitivos tienen valores por defecto, boolean es false por defecto, los objetos pone null
    //2.constructor
   // java crea un por default aunque no se vea ahi esta
   // no se pueden repetir constructores
    
    // vamos a a hacer que por defecto cada vez que nazca un objeto mascota sin importar el constructor 
    //es decir, a todos los construcotres se les agrega energia=1000
    public Mascota (){
        this.energia=1000;
        
    }

    public Mascota(String nombre, String apodo, String tipo) {
        //this hace referencia a la clase si fuera nombre=nombre ambos harian referencia al parametro
        // lo que se quiere es tomar lo que llega como parametro del constructor y asignarlo en la variable tipo nombre
        //clase nombre recibe cosas y va a tener atributos se le inyectan a esa clase atributos y se crea una copia
        // asiganaciones a distintos objetos
        
        this.nombre = nombre;
        this.apodo = apodo;
        
        // es posible aplicar logica dentro del objeto si es necesario
        if (tipo.equalsIgnoreCase("Perro")||tipo.equalsIgnoreCase("Gato")||tipo.equalsIgnoreCase("Loro")||tipo.equalsIgnoreCase("Conejo")||tipo.equalsIgnoreCase("Carpincho")) {
         this.tipo = tipo;   
        }
         this.energia=1000;
    }

    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.energia=1000;
    }
    
    public void setNombre(String nombre){
        //logica de verificacion
        if (nombre.length()>0)
        this.nombre=nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public String getNombre (){
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public Integer getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }
    /**
     * Funcion destinada a pasear
     * @param energiaRestar
     * @return energia
     */
    public int pasear (int energiaRestar){
        energia-= energiaRestar;
        return energia;
    }
    /**
     * funcion destinada a pasear por vueltas
     * @param energiaRestar
     * @param vueltas
     * @return energia
     */
    public int pasear (int energiaRestar, int vueltas){
         for (int i = 0; i < vueltas; i++) {
            energia-= energiaRestar;
        }
  
        return energia;
    }
    
// funciona como el comparator la clase se sabe comparar por si sola, un objeto contra otro objeto
// asigna el valor numerico, codigo hash.
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mascota other = (Mascota) obj;
        if (this.cola != other.cola) {
            return false;
        }
        if (this.energia != other.energia) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apodo, other.apodo)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        if (!Objects.equals(this.raza, other.raza)) {
            return false;
        }
        if (!Objects.equals(this.edad, other.edad)) {
            return false;
        }
        return true;
    }
    
    
    
    // ctl insert toStriung, se pueden seleccionar los atributos deseados

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + '}';
    }

    
    //ordenar un treeSet segun un criterio en especifico
    @Override
    public int compareTo(Mascota t) {
        
     return this.nombre.compareTo(t.getNombre());
     
     //si quiero descendente Z-A t.getNombre().compareTo(this.nombre);
    }
    
    
    
}

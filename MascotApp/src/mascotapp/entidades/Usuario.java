
package mascotapp.entidades;

import java.util.Date;

public class Usuario {
   public String nombre;
   public String apellido;
   //dni no se hacen calculos puede ser string
   public int dni;
   public Date nacimiento;
   public String pais;
   
   
   //alt+insert para generar codido

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, int dni, Date nacimiento, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.pais = pais;
    }
    
}

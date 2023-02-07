
package EntidadPersona;

import java.util.Date;

public class EntidadPersona {
    
    private String nombre;
    private Date fechanacimiento;

    
    public EntidadPersona(String nombre, Date fechanacimiento) {
        this.nombre = nombre;
        this.fechanacimiento = fechanacimiento;
    }
    
    public EntidadPersona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    @Override
    public String toString() {
        return "EntidadPersona{" + "nombre=" + nombre + ", fechanacimiento=" + fechanacimiento + '}';
    }
    
       
}


package nespresso.entidades;

// @author Mariana

public class Nespresso {
    private final int capMax=2000;
    private int cantidadActual;

    public Nespresso() {
    }

    public Nespresso(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getCapMax() {
        return capMax;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

   
    
    

}

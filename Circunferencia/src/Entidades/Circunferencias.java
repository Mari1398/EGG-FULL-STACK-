
package Entidades;

public class Circunferencias {
    private Double radio;

    public Circunferencias() {
    }

    public Circunferencias(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circunferencias{" + "radio=" + radio + '}';
    }
    
    
}

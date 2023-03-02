package pais.entidades;

//@author Mariana

public class Pais implements Comparable<Pais>{
private String nombrePais;

    public Pais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public Pais() {
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    @Override
    public String toString() {
        return "Pais{" + "nombrePais=" + nombrePais + '}';
    }

    @Override
    public int compareTo(Pais t) {
        return this.getNombrePais().compareTo(t.getNombrePais());
    }


}

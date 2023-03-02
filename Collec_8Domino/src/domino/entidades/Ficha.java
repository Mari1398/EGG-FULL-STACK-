package domino.entidades;

//@author Mariana

public class Ficha {
private Integer [] fichas;

    public Ficha() {
        this.fichas=new Integer [2];
    }

    public Ficha(Integer[] fichas) {
        this.fichas = fichas;
    }

    public Ficha(int i, int j) {
        this.fichas=new Integer []{i,j};
    }

    public Integer[] getFichas() {
        return fichas;
    }

    public void setFichas(Integer[] fichas) {
        this.fichas = fichas;
    }

    @Override
    public String toString() {
      
        return fichas[0]+":"+ fichas[1]+"|" ;
    }

}

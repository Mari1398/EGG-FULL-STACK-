package raices.servicios;

//@author Mariana
import java.util.Scanner;
import raices.entidades.Indices;

public class ServiciosRaices {

    Scanner leer = new Scanner(System.in);

    public Indices crearIndices() {
        Indices i = new Indices();
        System.out.println("Ingrese el indice a");
        i.setA(leer.nextInt());
        System.out.println("Ingrese el indice b");
        i.setB(leer.nextInt());
        System.out.println("Ingrese el indice c");
        i.setC(leer.nextInt());
        return i;
    }

    public double getdiscriminantes(Indices i) {
        return (Math.pow(i.getB(), 2) -(4 * i.getA() * i.getC()));
    }

    public boolean tieneRaices(Indices i) {
        return getdiscriminantes(i) > 0;
    }

    public boolean tieneRaiz(Indices i) {
        return getdiscriminantes(i) == 0;
    }

    public void obtenerRaices(Indices i) {
        double raiz1;
        double raiz2;
        raiz1 = ((-i.getB() + Math.sqrt(Math.pow(i.getB(), 2) - (4 * i.getA() * i.getC()))) / (2 * i.getA()));
        raiz2 = ((-i.getB() - Math.sqrt(Math.pow(i.getB(), 2) - (4 * i.getA() * i.getC()))) / (2 * i.getA()));
        if (tieneRaices(i)) {
            System.out.println("La solución 1 es " + raiz1);
            System.out.println("La solución 2 es " + raiz2);
        }
        obtenerRaiz(i, raiz1);

    }
    public void obtenerRaiz (Indices i, double raiz1){
        if (tieneRaiz(i)) {
            System.out.println("La solución es "+ raiz1);
        }
    }
    public void calcualar(Indices i){
            tieneRaices(i);
            tieneRaiz(i);
            obtenerRaices(i);
           
            if (getdiscriminantes(i) < 0 ) {
                System.out.println("No tiene solucion");
        }
    }
}

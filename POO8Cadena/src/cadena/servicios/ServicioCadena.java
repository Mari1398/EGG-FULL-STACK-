package cadena.servicios;

// @author Mariana
import cadena.entidades.Cadena;
import java.util.Scanner;

public class ServicioCadena {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void mostrarVocales(Cadena c) {
        int cont = 0;
        
        for (int i = 0; i < c.getLongitud(); i++) {
            String letra = c.getFrase().substring(i, i+1);
            if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equals("0") || letra.equalsIgnoreCase("u")) {
                cont++;
            }
        }
        if (cont == 1) {
            System.out.println("La frase tiene una vocal");
        } else {
            System.out.println("La frase tiene " + cont + " vocales");
        }

    }

    public void invertirFrase(Cadena c) {
        String[] aux = new String[c.getLongitud()];
        System.out.println("La frase invertidad es:");
        for (int i = c.getLongitud(); i > 0; i--) {
            
            String letra = c.getFrase().substring(i-1, i);
            aux[i-1] = letra;
            
            System.out.print(aux[i-1]);
        }
        System.out.println(" ");
    }

    public void vecesRepetido(Cadena c) {
        int cont = 0;
        String caracter;
        System.out.println("Ingrese un caracter para saber cuantas veces se encuentra dentro de la frase");
        caracter = leer.next();
        for (int i = 0; i < c.getLongitud(); i++) {
            String letra = c.getFrase().substring(i, i+1);
            if (letra.equalsIgnoreCase(caracter)) {
                cont++;
            }
            
        }
        if (cont == 1) {
                System.out.println("La frase tiene el caracter '" + caracter + "' una vez");
            } else if(cont==0){
                System.out.println("Caracter no encontrado");
            }else{
                System.out.println("La frase tiene el caracter '" + caracter + "' " + cont + " una vez");
            }
    }

    public void compararLongitud(Cadena c) {
        String frase2;
        System.out.println("Ingrese una nueva frase");
        frase2 = leer.next();
        if (frase2.length() == c.getLongitud()) {
            System.out.println("La frase ingresada tiene la misma longitud que " + c.getFrase());
        } else if (frase2.length() > c.getLongitud()) {
            System.out.println("La frase ingresada tiene " + (frase2.length() - c.getLongitud()) + " caracteres más que " + c.getFrase());

        } else if (frase2.length() < c.getLongitud()) {
            System.out.println("La frase ingresada tiene " + (c.getLongitud() - frase2.length()) + " caracteres más que " + c.getFrase());

        }
        System.out.println(" ");
        System.out.println("Las frases ingresadas forman la siguiente:");
        unirFrase(c, frase2);
    }

    private void unirFrase(Cadena c, String frase2) {
        System.out.println(c.getFrase() + " " + frase2);
    }

    public void reemplazar(Cadena c) {
        String carac;
        System.out.println("Ingrese un caracter con el cual desea reemplazar la vocal 'a'");
        carac = leer.next();
        for (int i = 0; i < c.getLongitud(); i++) {
            String letra = c.getFrase().substring(i, i+1);
            if (letra.equalsIgnoreCase("a")) {
                System.out.print(carac);
            } else {
                System.out.print(letra);
            }
            
        }
        System.out.println(" ");
    }
    public void contiene(Cadena c){
        String carac;
        boolean cont=false;
        System.out.println("Ingrese un caracter para saber si se encunetra en la frase");
        carac = leer.next();
        
        for (int i = 0; i < c.getLongitud(); i++) {
            String letra = c.getFrase().substring(i, i+1);
            if (letra.equalsIgnoreCase(carac)) {
                cont=true;
            
            }
            
    }
        System.out.println(cont);
}
}

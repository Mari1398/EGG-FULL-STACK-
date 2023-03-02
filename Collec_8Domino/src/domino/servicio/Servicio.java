package domino.servicio;

//@author Mariana
import domino.entidades.Ficha;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class Servicio {

    private LinkedList<Ficha> mano;
    private LinkedList<Ficha> mesa;
    private ArrayList<Integer[]> listAux;
    //    private ArrayList<Ficha> listAux;
    private Scanner leer;

    public Servicio() {
        this.mano = new LinkedList();
        this.mesa = new LinkedList();
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.listAux = new ArrayList();

    }

    public void manoLlena(int numMax) {
        numMax = numMax + 1;
        int numFichas = 0;
        do {
            for (int i = 0; i < numMax; i++) {
                for (int j = i; j < numMax; j++) {
                    mano.add(new Ficha(i, j));
                }
            }
            for (int i = 0; i < numMax; i++) {
                int aux = numMax - i;
                numFichas = numFichas + aux;
            }

        } while (mano.size() != numFichas);

        mesa.add(mano.getLast());
        mano.removeLast();

    }

    private void girarFicha(int index) {
        int j = 1;
        Integer[] aux = new Integer[2];
        for (int i = 0; i < aux.length; i++) {
            aux[i] = mano.get(index).getFichas()[j];
            j--;
        }

        mano.set(index, new Ficha(aux));
    }

    private boolean esUnDobleMesa() {
        return mesa.getFirst().getFichas()[0] == mesa.getLast().getFichas()[1];
    }

    public int numMax() {
        int valor;
        System.out.println("Bienvenido a Domino"
                + "\n Podrá presenciar como juega el robot en solitario dependiendo del número máximo con el que quiera jugar"
        );
        do {
            System.out.println(" Ingrese un valor entre 1 y 6");
            valor = leer.nextInt();

        } while (valor < 0 || valor > 7);

        return valor;
    }

    private void mostrarJuego() {
        System.out.println(mesa.toString());
        System.out.println(mano.toString());
        System.out.println("");
    }

    private void buscarEnMano(int numMax) {

        if (mesa.size() == 1) {
            for (int i = 0; i < mano.size(); i++) {
                for (int j = 0; j < 2; j++) {
                    if (mano.get(i).getFichas()[j] == numMax) {
                        Integer [] aux = new Integer[2];
                        aux[0] = i;
                        aux[1] = j;
                       listAux.add(aux);
                        //listAux.add(new Ficha(i,j));
                    }
                }
            }
        } else if (porIzquierda()) {
            porIzquierda();
        } else if (porDerecha()) {
            porDerecha();
        }
    }

    private boolean porDerecha() {
        boolean bandera = false;
        for (int i = 0; i < mano.size(); i++) {
            for (int j = 0; j < 2; j++) {
                if ((mano.get(i).getFichas()[j] == mesa.getLast().getFichas()[1])) {
                     Integer [] aux = new Integer[2];
                    aux[0] = i;
                    aux[1] = j;
                    listAux.add(aux);
//                    listAux.add(new Ficha(i,j));
                    bandera = true;
                }
            }
        }
        return bandera;
    }

    private boolean porIzquierda() {
        boolean bandera = false;

        for (int i = 0; i < mano.size(); i++) {
            for (int j = 0; j < 2; j++) {
                if ((mano.get(i).getFichas()[j] == mesa.getFirst().getFichas()[0])) {
                     Integer [] aux = new Integer[2];
                    aux[0] = i;
                    aux[1] = j;
                    listAux.add(aux);
//                    listAux.add(new Ficha(i,j));
                    bandera = true;

                }
            }
        }

        return bandera;
    }

    private int indiceListAux() {
        return ((int) (Math.floor(Math.random() * (listAux.size() - 1 + 1) + 1)) - 1);

    }

    private int indiceMano(int indice) {

        if (listAux.size() == 1) {
            return listAux.get(0)[0];
        } else {
            return listAux.get(indice)[0];
        }

    }

    private boolean vamosAgirarDerecha(int indice) {

        if (listAux.size() == 1) {
            if (Objects.equals(mesa.getLast().getFichas()[1], mano.get(listAux.get(0)[0]).getFichas()[0])) {
                return false;

            } 
            
        }else {
                if (Objects.equals(mesa.getLast().getFichas()[1], mano.get(listAux.get(indice)[0]).getFichas()[0])) {
                    return false;
                }

            }
        
        return true;
    }

    private boolean vamosAgirarIzquierda(int indice) {
        if (listAux.size() == 1) {
            if (Objects.equals(mesa.getFirst().getFichas()[0], mano.get(listAux.get(0)[0]).getFichas()[1])) {
                return false;

            } 
        }else {
                if (Objects.equals(mesa.getFirst().getFichas()[0], mano.get(listAux.get(indice)[0]).getFichas()[1])) {
                    return false;
                }

            }

        
        return true;
    }

    public void jugarRobotSolitario(int numMax) {
        System.out.println("\nTodo listo, empieza el juego\n");
        do {
            mostrarJuego();
            listAux.clear();
            buscarEnMano(numMax);
            int indiceListAux = indiceListAux();
            if (esUnDobleMesa()) {
                int firstOrLast = (int) (Math.floor(Math.random() * (2 - 1 + 1) + 1));
                if (firstOrLast == 1) {
                    if (true) {
                        if (vamosAgirarIzquierda(indiceListAux)) {
                            girarFicha(indiceMano(indiceListAux));
                        }
                        mesa.addFirst(mano.get(indiceMano(indiceListAux)));
                        mano.remove(mano.get(indiceMano(indiceListAux)));
                    }

                } else {
                    if (vamosAgirarDerecha(indiceListAux)) {
                        girarFicha(indiceMano(indiceListAux));
                    }
                    mesa.addLast(mano.get(indiceMano(indiceListAux)));
                    mano.remove(mano.get(indiceMano(indiceListAux)));

                }
            } else {
                if (porDerecha()&porIzquierda()) {
                    int izqOder= (int) (Math.floor(Math.random() * (2 - 1 + 1) + 1));;
                    if (izqOder==1) {
                        if (vamosAgirarDerecha(indiceListAux)) {
                        girarFicha(indiceMano(indiceListAux));
                    }
                    mesa.addLast(mano.get(indiceMano(indiceListAux)));
                    mano.remove(mano.get(indiceMano(indiceListAux)));
                    }else {
                        if (vamosAgirarIzquierda(indiceListAux)) {
                        girarFicha(indiceMano(indiceListAux));
                    }
                    mesa.addFirst(mano.get(indiceMano(indiceListAux)));
                    mano.remove(mano.get(indiceMano(indiceListAux)));
                    }
                } else if (porDerecha()) {
                    if (vamosAgirarIzquierda(indiceListAux)) {
                        girarFicha(indiceMano(indiceListAux));
                    }
                    mesa.addFirst(mano.get(indiceMano(indiceListAux)));
                    mano.remove(mano.get(indiceMano(indiceListAux)));

                } else if (porIzquierda()) {
                    if (vamosAgirarDerecha(indiceListAux)) {
                        girarFicha(indiceMano(indiceListAux));
                    }
                    mesa.addLast(mano.get(indiceMano(indiceListAux)));
                    mano.remove(mano.get(indiceMano(indiceListAux)));

                }

            }

        } while (porIzquierda() || porDerecha() || mesa.size() == 1);
        mostrarJuego();
    }

}

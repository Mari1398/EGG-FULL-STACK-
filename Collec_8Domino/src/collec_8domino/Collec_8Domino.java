package collec_8domino;

// @author Mariana

import domino.servicio.Servicio;


public class Collec_8Domino {

    public static void main(String[] args) {
        Servicio sf = new Servicio();
        int numMax=sf.numMax();
        sf.manoLlena(numMax);
        sf.jugarRobotSolitario(numMax);
    }

}


package rectangulopoo4;

import Entidades.Rectangulo;
import Servicios.Servicios;

public class RectanguloPOO4 {

    public static void main(String[] args) {
        Servicios sr = new Servicios ();
        Rectangulo r1= sr.crearRectangulo();
        sr.superficie(r1);
        sr.perimetro(r1);
        sr.representacion(r1);
    }
    
}

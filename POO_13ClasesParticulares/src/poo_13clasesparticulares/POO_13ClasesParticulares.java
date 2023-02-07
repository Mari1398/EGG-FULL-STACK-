package poo_13clasesparticulares;

// @author Mariana
import curso.entidades.Curso;
import curso.servicios.ServicioCursos;

public class POO_13ClasesParticulares {

    public static void main(String[] args) {
        ServicioCursos sc = new ServicioCursos();
        Curso c1 = new Curso();
        Curso c2 = new Curso();
        Curso c3 = new Curso();
        Curso c4 = new Curso();

        c1 = sc.crearCurso();
        c2 = sc.crearCurso();
        c3 = sc.crearCurso();
        c4 = sc.crearCurso();

        System.out.println("\nLas ganacias totales de todos los cursos son:" + (sc.gananciasSemanalesPorCurso(c1)
                + sc.gananciasSemanalesPorCurso(c2)
                + sc.gananciasSemanalesPorCurso(c3)
                + sc.gananciasSemanalesPorCurso(c4))+" pesos");

    }

}

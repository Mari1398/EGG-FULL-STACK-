package curso.entidades;

//@author Mariana
public class Curso {

    private String nombreCurso;
    private int cantidadHoraDia;
    private int cantidadHoraSemana;
    private String jornada;
    private int precioHora;
    private String[] alumnos;

    public Curso() {
        // inicializar vector
        //this.alumnos = new String[5];
    }

    public Curso(String nombreCurso, int cantidadHoraDia, int cantidadHoraSemana, String jornada, int precioHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHoraDia = cantidadHoraDia;
        this.cantidadHoraSemana = cantidadHoraSemana;
        this.jornada = jornada;
        this.precioHora = precioHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHoraDia() {
        return cantidadHoraDia;
    }

    public void setCantidadHoraDia(int cantidadHoraDia) {
        this.cantidadHoraDia = cantidadHoraDia;
    }

    public int getCantidadHoraSemana() {
        return cantidadHoraSemana;
    }

    public void setCantidadHoraSemana(int cantidadHoraSemana) {
        this.cantidadHoraSemana = cantidadHoraSemana;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public int getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(int precioHora) {
        this.precioHora = precioHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

}

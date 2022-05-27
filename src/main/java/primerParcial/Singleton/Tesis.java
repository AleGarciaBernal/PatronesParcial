package primerParcial.Singleton;

public class Tesis {

    private String titulo;
    private String mencion;
    private Estudiante estudiante;

    public Tesis(Estudiante estudiante){
        this.estudiante=estudiante;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMencion() {
        return mencion;
    }

    public void setMencion(String mencion) {
        this.mencion = mencion;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void showInfo(){
        System.out.println("Titulo"+this.getTitulo());
        System.out.println("Mencion"+this.getMencion());

    }



}

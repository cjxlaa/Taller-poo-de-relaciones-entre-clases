import java.util.ArrayList;
import java.util.List;

class Estudiante {
    private String nombre;
    // Un estudiante puede tener MUCHOS cursos
    private List<Curso> cursos; 

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void mostrarCursos() {
        System.out.print(nombre + " está inscrito en: ");
        for (Curso c : cursos) { System.out.print(c.getNombre() + " "); }
        System.out.println();
    }
}

class Curso {
    private String nombre;
    // Un curso puede tener MUCHOS estudiantes
    private List<Estudiante> estudiantes; 

    public Curso(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() { return nombre; }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
}

public class RegistroAcademico {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("Juan");
        Estudiante est2 = new Estudiante("María");

        Curso cursoJava = new Curso("Java Avanzado");
        Curso cursoDatos = new Curso("Estructuras de Datos");

        // Relacionamos muchos a muchos
        est1.agregarCurso(cursoJava);
        est1.agregarCurso(cursoDatos);
        cursoJava.agregarEstudiante(est1);
        cursoDatos.agregarEstudiante(est1);

        est2.agregarCurso(cursoJava);
        cursoJava.agregarEstudiante(est2);

        est1.mostrarCursos();
        est2.mostrarCursos();
    }
}
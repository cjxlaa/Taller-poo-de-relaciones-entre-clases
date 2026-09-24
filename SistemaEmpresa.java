class Empleado {
    protected String nombre; // Accesible para las clases hijas

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public void trabajar() {
        System.out.println(nombre + " está trabajando.");
    }
}

// Herencia usando 'extends'
class Desarrollador extends Empleado {
    private String lenguaje;

    public Desarrollador(String nombre, String lenguaje) {
        super(nombre); // Llama al constructor de Empleado
        this.lenguaje = lenguaje;
    }

    public void programar() {
        System.out.println(nombre + " está programando en " + lenguaje);
    }
}

public class SistemaEmpresa {
    public static void main(String[] args) {
        Desarrollador dev = new Desarrollador("Ana", "Python");
        dev.trabajar();  // Método heredado de Empleado
        dev.programar(); // Método propio de Desarrollador
    }
}
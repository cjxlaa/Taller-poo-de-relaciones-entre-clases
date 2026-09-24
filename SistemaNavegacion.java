// Clase independiente
class Ruta {
    private String destino;

    public Ruta(String destino) {
        this.destino = destino;
    }

    public String getDestino() {
        return destino;
    }
}

// La clase Conductor "depende" de la clase Ruta
class Conductor {
    private String nombre;

    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    // Dependencia: La Ruta se recibe como parámetro, se usa y termina. 
    // El Conductor no tiene una variable global "Ruta ruta;".
    public void iniciarViaje(Ruta rutaAsignada) {
        System.out.println(nombre + " ha iniciado la navegación hacia: " + rutaAsignada.getDestino());
    }
}

public class SistemaNavegacion {
    public static void main(String[] args) {
        Conductor conductor = new Conductor("Carlos");
        Ruta rutaCentro = new Ruta("Centro Histórico");
        
        // Se inyecta la dependencia temporalmente en el método
        conductor.iniciarViaje(rutaCentro);
    }
}
// Se define la interfaz (el contrato)
interface Notificable {
    // Método abstracto (sin llaves ni cuerpo)
    void enviarMensaje(String mensaje); 
}

// Clase que implementa la interfaz
class CorreoElectronico implements Notificable {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Simulando envío de Email: " + mensaje);
    }
}

// Otra clase que implementa la misma interfaz
class SMS implements Notificable {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje de texto (SMS) al celular: " + mensaje);
    }
}

public class AppNotificaciones {
    public static void main(String[] args) {
        // Podemos usar polimorfismo gracias a la interfaz
        Notificable notificacion1 = new CorreoElectronico();
        Notificable notificacion2 = new SMS();

        notificacion1.enviarMensaje("Bienvenido al sistema.");
        notificacion2.enviarMensaje("Tu código de seguridad es 4829.");
    }
}
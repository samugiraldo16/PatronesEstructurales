package Ejer3;

public class NotificacionCorreo extends Notificacion {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando correo electrónico: " + mensaje);
    }
}
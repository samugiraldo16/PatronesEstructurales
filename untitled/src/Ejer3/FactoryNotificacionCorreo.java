package Ejer3;

public class FactoryNotificacionCorreo extends FactoryNotificacion {

    @Override
    public Notificacion crearNotificacion() {
        return new NotificacionCorreo();
    }
}
package Ejer3;

public class FactoryNotificacionSMS extends FactoryNotificacion {

    @Override
    public Notificacion crearNotificacion() {

        ServicioSMS servicioSMS = new ServicioSMS();

        return new AdapterSMS(servicioSMS);
    }
}
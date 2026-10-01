package Ejer3;

public class FactoryNotificacionWhatsApp extends FactoryNotificacion {

    @Override
    public Notificacion crearNotificacion() {

        ServicioWhatsApp servicioWhatsApp = new ServicioWhatsApp();

        return new AdapterWhatsApp(servicioWhatsApp);
    }
}

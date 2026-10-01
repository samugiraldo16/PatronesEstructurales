package Ejer3;

public class AdapterWhatsApp extends Notificacion {

    private ServicioWhatsApp servicioWhatsApp;

    public AdapterWhatsApp(ServicioWhatsApp servicioWhatsApp) {
        this.servicioWhatsApp = servicioWhatsApp;
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Adaptando servicio WhatsApp...");
        servicioWhatsApp.mandarWhatsApp(mensaje);
    }
}

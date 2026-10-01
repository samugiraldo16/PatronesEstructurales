package Ejer3;


public class AdapterSMS extends Notificacion {

    private ServicioSMS servicioSMS;

    public AdapterSMS(ServicioSMS servicioSMS) {
        this.servicioSMS = servicioSMS;
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Adaptando servicio SMS...");
        servicioSMS.enviarSMS(mensaje);
    }
}
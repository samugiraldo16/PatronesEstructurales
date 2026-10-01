package Ejer3;

public class Main {

    public static void main(String[] args) {

        // Correo
        FactoryNotificacion factoryCorreo =
                new FactoryNotificacionCorreo();

        Notificacion correo =
                factoryCorreo.crearNotificacion();

        correo.enviar("Reunión a las 10:00 AM");


        // SMS
        FactoryNotificacion factorySMS =
                new FactoryNotificacionSMS();

        Notificacion sms =
                factorySMS.crearNotificacion();

        sms.enviar("Su código de verificación es 1234");


        // WhatsApp
        FactoryNotificacion factoryWhatsApp =
                new FactoryNotificacionWhatsApp();

        Notificacion whatsapp =
                factoryWhatsApp.crearNotificacion();

        whatsapp.enviar("Hola, tenemos una nueva promoción");
    }
}
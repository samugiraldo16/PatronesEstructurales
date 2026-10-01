package Ejer4;

public class PersonajeExterno {

    private String nombreExterno;
    private String claseExterna;
    private String armaExterna;

    public PersonajeExterno(
            String nombreExterno,
            String claseExterna,
            String armaExterna) {

        this.nombreExterno = nombreExterno;
        this.claseExterna = claseExterna;
        this.armaExterna = armaExterna;
    }

    public void mostrarPersonajeExterno() {
        System.out.println("Personaje externo: " + nombreExterno);
        System.out.println("Clase externa: " + claseExterna);
        System.out.println("Arma externa: " + armaExterna);
    }

    public String getNombreExterno() {
        return nombreExterno;
    }

    public String getClaseExterna() {
        return claseExterna;
    }

    public String getArmaExterna() {
        return armaExterna;
    }
}
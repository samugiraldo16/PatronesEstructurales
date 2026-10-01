package Ejer4;

public class AdapterPersonajeExterno {

    private PersonajeExterno personajeExterno;

    public AdapterPersonajeExterno(PersonajeExterno personajeExterno) {
        this.personajeExterno = personajeExterno;
    }

    public Personaje adaptar() {

        return new Personaje.Builder()
                .nombre(personajeExterno.getNombreExterno())
                .tipo(personajeExterno.getClaseExterna())
                .nivel(1)
                .arma(personajeExterno.getArmaExterna())
                .habilidad("Habilidad externa")
                .accesorio("Accesorio externo")
                .construir();
    }
}
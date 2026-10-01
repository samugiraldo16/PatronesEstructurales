package Ejer4;

public class Main {

    public static void main(String[] args) {

        // =========================
        // PERSONAJE GUERRERO
        // =========================

        FactoryPersonaje factoryGuerrero =
                new FactoryGuerrero();

        Personaje guerrero =
                factoryGuerrero.crearPersonaje();

        guerrero.mostrarInformacion();

        System.out.println("-------------------------");


        // =========================
        // PERSONAJE MAGO
        // =========================

        FactoryPersonaje factoryMago =
                new FactoryMago();

        Personaje mago =
                factoryMago.crearPersonaje();

        mago.mostrarInformacion();

        System.out.println("-------------------------");


        // =========================
        // PERSONAJE ARQUERO
        // =========================

        FactoryPersonaje factoryArquero =
                new FactoryArquero();

        Personaje arquero =
                factoryArquero.crearPersonaje();

        arquero.mostrarInformacion();

        System.out.println("-------------------------");


        // =========================
        // PERSONAJE EXTERNO
        // =========================

        PersonajeExterno externo =
                new PersonajeExterno(
                        "Personaje externo",
                        "Guerrero externo",
                        "Hacha"
                );

        AdapterPersonajeExterno adapter =
                new AdapterPersonajeExterno(externo);

        Personaje personajeAdaptado =
                adapter.adaptar();

        personajeAdaptado.mostrarInformacion();
    }
}
package Ejer4;

public class FactoryGuerrero extends FactoryPersonaje {

    @Override
    public Personaje crearPersonaje() {

        return new Personaje.Builder()
                .nombre("Guerrero")
                .tipo("Guerrero")
                .nivel(10)
                .arma("Espada")
                .habilidad("Golpe poderoso")
                .accesorio("Escudo")
                .construir();
    }
}
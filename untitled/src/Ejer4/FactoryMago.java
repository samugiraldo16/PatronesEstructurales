package Ejer4;

public class FactoryMago extends FactoryPersonaje {

    @Override
    public Personaje crearPersonaje() {

        return new Personaje.Builder()
                .nombre("Mago")
                .tipo("Mago")
                .nivel(10)
                .arma("Bastón mágico")
                .habilidad("Bola de fuego")
                .accesorio("Túnica")
                .construir();
    }
}
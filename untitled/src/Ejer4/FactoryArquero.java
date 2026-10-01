package Ejer4;

public class FactoryArquero extends FactoryPersonaje {

    @Override
    public Personaje crearPersonaje() {

        return new Personaje.Builder()
                .nombre("Arquero")
                .tipo("Arquero")
                .nivel(10)
                .arma("Arco")
                .habilidad("Flecha precisa")
                .accesorio("Capa")
                .construir();
    }
}
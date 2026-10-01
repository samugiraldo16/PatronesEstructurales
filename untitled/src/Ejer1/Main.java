package Ejer1;



public class Main {

    public static void main(String[] args) {

        ReproductorModerno moderno = new ReproductorModerno();
        ReproductorAntiguo antiguo = new ReproductorAntiguo();

        ReproductorMusica adapter =
                new AdapterReproductor(antiguo);

        moderno.reproducir("cancion_moderno.mp3");

        adapter.reproducir("cancion_antigua.mp3");
    }

}
package Ejer1;

public class ReproductorModerno implements ReproductorMusica {

    @Override
    public void reproducir(String archivo) {
        System.out.println("Reproduciendo con reproductor moderno: " + archivo);
    }

}
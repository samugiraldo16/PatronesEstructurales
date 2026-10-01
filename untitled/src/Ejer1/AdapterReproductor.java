package Ejer1;

public class AdapterReproductor implements ReproductorMusica {

    private ReproductorAntiguo reproductorAntiguo;

    public AdapterReproductor(ReproductorAntiguo reproductorAntiguo) {
        this.reproductorAntiguo = reproductorAntiguo;
    }

    @Override
    public void reproducir(String archivo) {
        System.out.println("Adaptando reproductor antiguo...");
        reproductorAntiguo.playMp3(archivo);
    }

}
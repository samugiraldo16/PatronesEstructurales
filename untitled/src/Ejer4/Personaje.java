package Ejer4;

public class Personaje {

    private String nombre;
    private String tipo;
    private int nivel;
    private String arma;
    private String habilidad;
    private String accesorio;

    private Personaje(Builder builder) {
        this.nombre = builder.nombre;
        this.tipo = builder.tipo;
        this.nivel = builder.nivel;
        this.arma = builder.arma;
        this.habilidad = builder.habilidad;
        this.accesorio = builder.accesorio;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Nivel: " + nivel);
        System.out.println("Arma: " + arma);
        System.out.println("Habilidad: " + habilidad);
        System.out.println("Accesorio: " + accesorio);
    }

    public static class Builder {

        private String nombre;
        private String tipo;
        private int nivel;
        private String arma;
        private String habilidad;
        private String accesorio;

        public Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder tipo(String tipo) {
            this.tipo = tipo;
            return this;
        }

        public Builder nivel(int nivel) {
            this.nivel = nivel;
            return this;
        }

        public Builder arma(String arma) {
            this.arma = arma;
            return this;
        }

        public Builder habilidad(String habilidad) {
            this.habilidad = habilidad;
            return this;
        }

        public Builder accesorio(String accesorio) {
            this.accesorio = accesorio;
            return this;
        }

        public Personaje construir() {
            return new Personaje(this);
        }
    }
}

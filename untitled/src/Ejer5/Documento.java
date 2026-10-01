package Ejer5;

public class Documento {

    private String tipo;
    private String titulo;
    private String encabezado;
    private String tabla;
    private String firma;
    private String grafico;

    private Documento(Builder builder) {
        this.tipo = builder.tipo;
        this.titulo = builder.titulo;
        this.encabezado = builder.encabezado;
        this.tabla = builder.tabla;
        this.firma = builder.firma;
        this.grafico = builder.grafico;
    }

    public void mostrarDocumento() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Título: " + titulo);
        System.out.println("Encabezado: " + encabezado);
        System.out.println("Tabla: " + tabla);
        System.out.println("Firma: " + firma);
        System.out.println("Gráfico: " + grafico);
    }

    public static class Builder {

        private String tipo;
        private String titulo;
        private String encabezado;
        private String tabla;
        private String firma;
        private String grafico;

        public Builder tipo(String tipo) {
            this.tipo = tipo;
            return this;
        }

        public Builder titulo(String titulo) {
            this.titulo = titulo;
            return this;
        }

        public Builder encabezado(String encabezado) {
            this.encabezado = encabezado;
            return this;
        }

        public Builder tabla(String tabla) {
            this.tabla = tabla;
            return this;
        }

        public Builder firma(String firma) {
            this.firma = firma;
            return this;
        }

        public Builder grafico(String grafico) {
            this.grafico = grafico;
            return this;
        }

        public Documento construir() {
            return new Documento(this);
        }
    }
}
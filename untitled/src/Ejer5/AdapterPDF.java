package Ejer5;

public class AdapterPDF {

    private BibliotecaPDF bibliotecaPDF;

    public AdapterPDF(BibliotecaPDF bibliotecaPDF) {
        this.bibliotecaPDF = bibliotecaPDF;
    }

    public void convertirAPDF(Documento documento) {

        System.out.println("Adaptando documento para PDF...");

        bibliotecaPDF.generarPDF(
                "Documento: " + documento
        );
    }
}
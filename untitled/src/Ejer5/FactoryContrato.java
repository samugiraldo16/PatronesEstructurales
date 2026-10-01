package Ejer5;

public class FactoryContrato extends FactoryDocumento {

    @Override
    public Documento crearDocumento() {

        return new Documento.Builder()
                .tipo("Contrato")
                .titulo("Contrato de prestación de servicios")
                .encabezado("Información de las partes")
                .tabla("Condiciones del contrato")
                .firma("Firma de las partes")
                .grafico("No aplica")
                .construir();
    }
}
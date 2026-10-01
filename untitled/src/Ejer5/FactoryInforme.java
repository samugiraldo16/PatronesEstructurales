package Ejer5;

public class FactoryInforme extends FactoryDocumento {

    @Override
    public Documento crearDocumento() {

        return new Documento.Builder()
                .tipo("Informe")
                .titulo("Informe empresarial")
                .encabezado("Resumen del informe")
                .tabla("Datos obtenidos")
                .firma("Responsable del informe")
                .grafico("Gráfico estadístico")
                .construir();
    }
}
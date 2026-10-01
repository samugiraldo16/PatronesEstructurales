package Ejer5;

public class FactoryFactura extends FactoryDocumento {

    @Override
    public Documento crearDocumento() {

        return new Documento.Builder()
                .tipo("Factura")
                .titulo("Factura de venta")
                .encabezado("Información de la empresa")
                .tabla("Productos y precios")
                .firma("Firma del cliente")
                .grafico("Gráfico de ventas")
                .construir();
    }
}
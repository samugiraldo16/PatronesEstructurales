package Ejer2;

public class FactoryPagoMercadoPago extends FactoryPago {

    @Override
    public Pago crearPago() {
        ServicioMercadoPago servicioMercadoPago = new ServicioMercadoPago();

        return new AdapterMercadoPago(servicioMercadoPago);
    }
}
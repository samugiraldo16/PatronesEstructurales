package Ejer2;

public class AdapterMercadoPago extends Pago {

    private ServicioMercadoPago servicioMercadoPago;

    public AdapterMercadoPago(ServicioMercadoPago servicioMercadoPago) {
        this.servicioMercadoPago = servicioMercadoPago;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Adaptando el servicio de Mercado Pago...");
        servicioMercadoPago.pagarMercadoPago(monto);
    }
}
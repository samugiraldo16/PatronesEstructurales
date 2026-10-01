package Ejer2;

public class AdapterPayPal extends Pago {

    private ServicioPayPal servicioPayPal;

    public AdapterPayPal(ServicioPayPal servicioPayPal) {
        this.servicioPayPal = servicioPayPal;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Adaptando el servicio de PayPal...");
        servicioPayPal.realizarPagoPayPal(monto);
    }
}
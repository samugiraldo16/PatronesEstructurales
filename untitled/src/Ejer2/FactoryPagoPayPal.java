package Ejer2;


public class FactoryPagoPayPal extends FactoryPago {

    @Override
    public Pago crearPago() {
        ServicioPayPal servicioPayPal = new ServicioPayPal();

        return new AdapterPayPal(servicioPayPal);
    }
}
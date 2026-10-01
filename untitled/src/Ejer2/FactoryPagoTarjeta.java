package Ejer2;


public class FactoryPagoTarjeta extends FactoryPago {

    @Override
    public Pago crearPago() {
        return new PagoTarjeta();
    }
}
package Ejer2;

public class Main {

    public static void main(String[] args) {

        // Pago con tarjeta
        FactoryPago factoryTarjeta = new FactoryPagoTarjeta();
        Pago pagoTarjeta = factoryTarjeta.crearPago();

        pagoTarjeta.procesarPago(100000);


        // Pago con PayPal
        FactoryPago factoryPayPal = new FactoryPagoPayPal();
        Pago pagoPayPal = factoryPayPal.crearPago();

        pagoPayPal.procesarPago(150000);


        // Pago con Mercado Pago
        FactoryPago factoryMercadoPago = new FactoryPagoMercadoPago();
        Pago pagoMercadoPago = factoryMercadoPago.crearPago();

        pagoMercadoPago.procesarPago(200000);
    }
}
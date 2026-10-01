package Ejer2;

public class PagoTarjeta extends Pago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta por $" + monto);
    }
}

package trabajoPracticoIII.pasarelaDePagosEcommerce;
public class Main {
    public static void main(String[] args) {
        // Ejemplos de datos (no son reales)
        String tarjNumero = "4111111111111111";
        String tarjCvv   = "123";
        String tarjTitular = "Juan Pérez";

        String paypalEmail = "usuario@paypal.com";

        String criptoDir = "1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa";
        String criptoTipo = "BTC";

        // 1) Pago con tarjeta de crédito
        TarjetaCredito tarjeta = new TarjetaCredito(tarjNumero, tarjCvv, tarjTitular);
        Checkout checkout = new Checkout(tarjeta);
        checkout.completarCompra(150.75);

        // 2) Cambiar a PayPal
        PayPalPago paypal = new PayPalPago(paypalEmail);
        checkout.cambiarMetodo(paypal);
        checkout.completarCompra(89.90);

        // 3) Cambiar a criptomoneda
        CriptoPago crypto = new CriptoPago(criptoDir, criptoTipo);
        checkout.cambiarMetodo(crypto);
        checkout.completarCompra(0.005);
    }
}
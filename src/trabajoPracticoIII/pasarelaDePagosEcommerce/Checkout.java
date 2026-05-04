package trabajoPracticoIII.pasarelaDePagosEcommerce;

public class Checkout {

    private MetodoPago metodoPago;

    public Checkout(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void completarCompra(double monto) {
        System.out.println("=== Inicio de proceso de pago ===");
        boolean exito = metodoPago.procesar(monto);
        System.out.printf("Compra de %.2f finalizada. Éxito: %s\n\n",
                monto, exito ? "Sí" : "No");
    }

    public void cambiarMetodo(MetodoPago nuevoMetodo) {
        this.metodoPago = nuevoMetodo;
        System.out.println("Método de pago cambiado.");
    }
}

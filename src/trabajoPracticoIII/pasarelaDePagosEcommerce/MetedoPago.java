package trabajoPracticoIII.pasarelaDePagosEcommerce;

public class MetedoPago {
    // Interfaz que define cómo se procesa cualquier pago
    public interface MetodoPago {
        boolean procesar(double monto);
    }
}


package trabajoPracticoIII.pasarelaDePagosEcommerce;

import java.util.Random;

public class TarjetaCredito implements MetodoPago {

    private String numeroTarjeta;
    private String cvv;
    private String nombreTitular;

    public TarjetaCredito(String numeroTarjeta, String cvv, String nombreTitular) {
        this.numeroTarjeta = numeroTarjeta;
        this.cvv = cvv;
        this.nombreTitular = nombreTitular;
    }

    @Override
    public boolean procesar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: el monto debe ser mayor a 0.");
            return false;
        }

        // Simulación de validación y conexión (en la vida real aquí iría la API real)
        if (numeroTarjeta == null || numeroTarjeta.length() < 13) {
            System.out.println("Error: número de tarjeta inválido.");
            return false;
        }

        if (cvv == null || cvv.length() != 3) {
            System.out.println("Error: CVV inválido.");
            return false;
        }

        System.out.printf("Conectando con pasarela de tarjeta de crédito...\n");
        System.out.printf("Autorizando pago de %.2f con tarjeta %s a nombre de %s\n",
                monto, numeroTarjeta, nombreTitular);

        // Simulación: 90% de éxito
        boolean exito = new Random().nextDouble() < 0.9;
        if (exito) {
            System.out.printf("Pago con tarjeta de crédito de %.2f aprobado.\n", monto);
        } else {
            System.out.printf("Pago con tarjeta de crédito de %.2f rechazado.\n", monto);
        }

        return exito;
    }
}
package trabajoPracticoIII.pasarelaDePagosEcommerce;
import java.util.Random;

public class PayPalPago implements MetodoPago {

    private String emailUsuario;

    public PayPalPago(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    @Override
    public boolean procesar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: el monto debe ser mayor a 0.");
            return false;
        }

        if (emailUsuario == null || !emailUsuario.contains("@")) {
            System.out.println("Error: email de PayPal inválido.");
            return false;
        }

        System.out.printf("Conectando con servidor de PayPal...\n");
        System.out.printf("Enviando pago de %.2f desde %s a la tienda\n", monto, emailUsuario);

        // Simulación: 95% de éxito
        boolean exito = new Random().nextDouble() < 0.95;
        if (exito) {
            System.out.printf("Pago con PayPal de %.2f aprobado.\n", monto);
        } else {
            System.out.printf("Pago con PayPal de %.2f rechazado.\n", monto);
        }

        return exito;
    }
}

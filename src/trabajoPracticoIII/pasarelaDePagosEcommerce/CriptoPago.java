package trabajoPracticoIII.pasarelaDePagosEcommerce;
import java.util.Random;

public class CriptoPago implements MetodoPago {

    private String direccionCrypto;
    private String tipoCripto; // Ej: "BTC", "ETH"

    public CriptoPago(String direccionCrypto, String tipoCripto) {
        this.direccionCrypto = direccionCrypto;
        this.tipoCripto = tipoCripto;
    }

    @Override
    public boolean procesar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: el monto debe ser mayor a 0.");
            return false;
        }

        if (direccionCrypto == null || direccionCrypto.length() < 10) {
            System.out.println("Error: dirección de criptomonedas inválida.");
            return false;
        }

        if (tipoCripto == null || tipoCripto.isEmpty()) {
            System.out.println("Error: tipo de cripto no especificado.");
            return false;
        }

        System.out.printf("Conectando con nodo de blockchain (%s)...\n", tipoCripto);
        System.out.printf("Enviando transacción de %.6f %s a la dirección %s\n",
                monto, tipoCripto, direccionCrypto);

        // Simulación: 85% de éxito (por volatilidad/red lenta)
        boolean exito = new Random().nextDouble() < 0.85;
        if (exito) {
            System.out.printf("Pago en criptomonedas (%.6f %s) aprobado.\n", monto, tipoCripto);
        } else {
            System.out.printf("Pago en criptomonedas (%.6f %s) rechazado.\n", monto, tipoCripto);
        }

        return exito;
    }
}
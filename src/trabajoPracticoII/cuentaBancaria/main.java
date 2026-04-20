package trabajoPracticoII.cuentaBancaria;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Creamos la cuenta usando el molde de arriba
        cuentaBancaria miCuenta = new cuentaBancaria("2007", "Mily", 10000);

        System.out.print("Ingrese monto a depositar: ");
        double monto = teclado.nextDouble();
        miCuenta.depositar(monto);

        System.out.print("¿Cuánto desea extraer?: ");
        double montoRet = teclado.nextDouble();
        miCuenta.extraer(montoRet);

        System.out.println("Saldo final: " + miCuenta.consultarSaldo());

        teclado.close();
    }
}
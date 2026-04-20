package trabajoPracticoII.cuentaBancaria;
public class cuentaBancaria {
import java.util.Scanner;

    class cuentaBancaria {
        // Atributos
        private String numeroCuenta;
        private String titular;
        private double saldo;

        // Constructor
        public cuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
            this.numeroCuenta = numeroCuenta;
            this.titular = titular;
            this.saldo = saldoInicial;
        }

        // Depositar
        public void depositar(double cantidad) {
            if (cantidad > 0) {
                saldo += cantidad;
                System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
            } else {
                System.out.println("La cantidad a depositar debe ser positiva.");
            }
        }
        // Extraer
        public void extraer(double cantidad) {
            if (cantidad <= saldo) {
                saldo -= cantidad;
                System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
            } else {
                System.out.println("Error: Saldo insuficiente.");
            }
        }
        // Saldo
        public double consultarSaldo() {
            return saldo;
        }
    }
}

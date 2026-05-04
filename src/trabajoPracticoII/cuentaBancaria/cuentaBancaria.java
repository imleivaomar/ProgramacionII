package trabajoPracticoII.cuentaBancaria;
class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = Math.max(0, saldoInicial); // Evita saldos iniciales negativos
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Se han añadido: $" + cantidad);
        } else {
            System.out.println("Error: La cantidad a depositar debe ser positiva.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad a retirar debe ser positiva.");
        } else if (cantidad > saldo) {
            System.out.println("Error: Fondos insuficientes. Saldo disponible: $" + saldo);
        } else {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Se han retirado: $" + cantidad);
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public String getTitular() { return titular; }
    public String getNumeroCuenta() { return numeroCuenta; }
}


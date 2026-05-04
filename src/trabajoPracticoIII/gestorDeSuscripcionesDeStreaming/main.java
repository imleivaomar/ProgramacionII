package trabajoPracticoIII.gestorDeSuscripcionesDeStreaming;

import java.util.ArrayList;
import java.util.List;

abstract class Suscripcion {
    protected String correoElectronico;
    protected String numeroCliente;
    protected double costoBase;

    public Suscripcion(String correoElectronico, String numeroCliente, double costoBase) {
        this.correoElectronico = correoElectronico;
        this.numeroCliente = numeroCliente;
        this.costoBase = costoBase;
    }

    public abstract double calcularCostoMensual();

    public String getCorreoElectronico() {
        return correoElectronico;
    }
}

class PlanBasico extends Suscripcion {

    public PlanBasico(String correoElectronico, String numeroCliente, double costoBase) {
        super(correoElectronico, numeroCliente, costoBase);
    }

    @Override
    public double calcularCostoMensual() {
        return costoBase; // Solo cobra el costo base
    }
}

class PlanFamiliar extends Suscripcion {
    private int perfilesAdicionales;
    private double recargoPorPerfil;

    public PlanFamiliar(String correoElectronico, String numeroCliente, double costoBase, int perfilesAdicionales, double recargoPorPerfil) {
        super(correoElectronico, numeroCliente, costoBase);
        this.perfilesAdicionales = perfilesAdicionales;
        this.recargoPorPerfil = recargoPorPerfil;
    }

    @Override
    public double calcularCostoMensual() {
        return costoBase + (perfilesAdicionales * recargoPorPerfil);
    }
}

class PlanPremium extends Suscripcion {
    private double cargoExtra4K;

    public PlanPremium(String correoElectronico, String numeroCliente, double costoBase, double cargoExtra4K) {
        super(correoElectronico, numeroCliente, costoBase);
        this.cargoExtra4K = cargoExtra4K;
    }

    @Override
    public double calcularCostoMensual() {
        return costoBase + cargoExtra4K;
    }
}

class MotorFacturacion {
    private List<Suscripcion> suscripcionesActivas;

    public MotorFacturacion() {
        this.suscripcionesActivas = new ArrayList<>();
    }

    public void agregarSuscripcion(Suscripcion suscripcion) {
        suscripcionesActivas.add(suscripcion);
    }

    public double calcularGananciasTotales() {
        double total = 0;
        System.out.println("--- Detalle de Facturación Mensual ---");
        for (Suscripcion sub : suscripcionesActivas) {
            double costo = sub.calcularCostoMensual();
            System.out.println("Usuario: " + sub.getCorreoElectronico() + " | Factura: $" + costo);
            total += costo;
        }
        System.out.println("--------------------------------------");
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        MotorFacturacion motor = new MotorFacturacion();

        Suscripcion sub1 = new PlanBasico("juan@email.com", "C-001", 10.0);
        Suscripcion sub2 = new PlanFamiliar("maria@email.com", "C-002", 10.0, 3, 2.5); // 3 perfiles extra a $2.5 c/u
        Suscripcion sub3 = new PlanPremium("carlos@email.com", "C-003", 10.0, 5.0); // Extra de $5.0 por 4K

        motor.agregarSuscripcion(sub1);
        motor.agregarSuscripcion(sub2);
        motor.agregarSuscripcion(sub3);

        double ganancias = motor.calcularGananciasTotales();
        System.out.println("Ganancias Totales de la Empresa: $" + ganancias);
    }
}
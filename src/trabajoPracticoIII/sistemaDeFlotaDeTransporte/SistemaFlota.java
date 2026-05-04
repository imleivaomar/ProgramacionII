package trabajoPracticoIII.sistemaDeFlotaDeTransporte;
import java.util.ArrayList;
import java.util.List;

public class SistemaFlota {
    public static void main(String[] args) {
        // Utilizamos una lista del tipo de la superclase para agrupar toda la flota
        List<Vehiculo> flota = new ArrayList<>();

        // Agregamos furgonetas y motocicletas a la misma lista
        flota.add(new Furgoneta("Mercedes-Benz", "Sprinter", 15000.0, 3500.0));
        flota.add(new Motocicleta("Honda", "CG 150 Titan", 3500.0, 150));
        flota.add(new Furgoneta("Renault", "Kangoo", 9000.0, 800.0));
        flota.add(new Motocicleta("Yamaha", "YBR 125", 3000.0, 125));

        System.out.println("==================================================");
        System.out.println("      REPORTE DETALLADO DE FLOTA DE TRANSPORTE    ");
        System.out.println("==================================================");

        // Iteramos sobre la flota. Gracias al polimorfismo, cada objeto sabe cómo imprimirse.
        for (Vehiculo vehiculo : flota) {
            vehiculo.mostrarInformacion();
        }

        System.out.println("==================================================");
    }
}
package trabajoPracticoIII.sistemaDeFlotaDeTransporte;

public class Furgoneta extends Vehiculo {
    private double capacidadCargaKg;

    public Furgoneta(String marca, String modelo, double tarifaBase, double capacidadCargaKg) {
        super(marca, modelo, tarifaBase); // Llama al constructor de la superclase
        this.capacidadCargaKg = capacidadCargaKg;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("🚐 [Furgoneta] Marca: " + marca + " | Modelo: " + modelo +
                " | Tarifa Base: $" + tarifaBase + " | Carga Max: " + capacidadCargaKg + " kg");
    }
}
package trabajoPracticoIII.sistemaDeFlotaDeTransporte;

public class Motocicleta extends Vehiculo {
    private int cilindrada;

    public Motocicleta(String marca, String modelo, double tarifaBase, int cilindrada) {
        super(marca, modelo, tarifaBase);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("🛵 [Motocicleta] Marca: " + marca + " | Modelo: " + modelo +
                " | Tarifa Base: $" + tarifaBase + " | Cilindrada: " + cilindrada + " cc");
    }
}
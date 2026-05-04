package trabajoPracticoIII.sistemaDeFlotaDeTransporte;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected double tarifaBase;

    public Vehiculo(String marca, String modelo, double tarifaBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.tarifaBase = tarifaBase;
    }

    public abstract void mostrarInformacion();
}
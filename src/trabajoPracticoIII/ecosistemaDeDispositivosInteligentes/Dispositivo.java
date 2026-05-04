package trabajoPracticoIII.ecosistemaDeDispositivosInteligentes;

public abstract class Dispositivo {

    private final String id;
    private final String nombre;
    private boolean encendido;


    public Dispositivo(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.encendido = false;
    }

    public String getId()     { return id; }
    public String getNombre() { return nombre; }
    public boolean isEncendido() { return encendido; }

    public String encender() {
        if (encendido) {
            return "[" + nombre + "] Ya se encuentra encendido.";
        }
        encendido = true;
        return "[" + nombre + "] Encendido correctamente.";
    }

    public String apagar() {
        if (!encendido) {
            return "[" + nombre + "] Ya se encuentra apagado.";
        }
        encendido = false;
        return "[" + nombre + "] Apagado correctamente.";
    }

    public abstract String obtenerEstado();

    @Override
    public String toString() {
        return String.format("Dispositivo{id='%s', nombre='%s', encendido=%b}",
                id, nombre, encendido);
    }
}

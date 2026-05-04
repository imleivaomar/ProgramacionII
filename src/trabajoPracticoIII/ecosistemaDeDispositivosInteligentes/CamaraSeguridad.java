package trabajoPracticoIII.ecosistemaDeDispositivosInteligentes;

public class CamaraSeguridad extends Dispositivo implements CapazTomarFotografia {

    private int fotosTomadas;
    private final String resolucion;
    public CamaraSeguridad(String id, String nombre, String resolucion) {
        super(id, nombre);
        this.resolucion = resolucion;
        this.fotosTomadas = 0;
    }

    @Override
    public String tomarFotografia() {
        if (!isEncendido()) {
            return "[" + getNombre() + "] No puede tomar fotografía: dispositivo apagado.";
        }
        fotosTomadas++;
        return "[" + getNombre() + "] Fotografía #" + fotosTomadas
                + " tomada en resolución " + resolucion + ".";
    }

    @Override
    public String obtenerEstado() {
        return String.format(
                "Cámara de Seguridad | ID: %s | Nombre: %s | Estado: %s | " +
                "Resolución: %s | Fotos tomadas: %d",
                getId(), getNombre(),
                isEncendido() ? "ENCENDIDA" : "APAGADA",
                resolucion, fotosTomadas);
    }

    public int getFotosTomadas() { return fotosTomadas; }
    public String getResolucion() { return resolucion; }
}

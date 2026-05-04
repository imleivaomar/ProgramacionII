package trabajoPracticoIII.ecosistemaDeDispositivosInteligentes;
public class Smartphone extends Dispositivo
        implements CapazTomarFotografia, CapazConectarWiFi {

    private int fotosTomadas;
    private final String megapixeles;
    private boolean conectadoWiFi;
    private String redWiFiActual;
    private final String marca;
    private final String modelo;


    public Smartphone(String id, String nombre, String marca,
                      String modelo, String megapixeles) {
        super(id, nombre);
        this.marca        = marca;
        this.modelo       = modelo;
        this.megapixeles  = megapixeles;
        this.fotosTomadas = 0;
        this.conectadoWiFi = false;
        this.redWiFiActual = null;
    }

    @Override
    public String tomarFotografia() {
        if (!isEncendido()) {
            return "[" + getNombre() + "] No puede tomar fotografía: dispositivo apagado.";
        }
        fotosTomadas++;
        return "[" + getNombre() + "] Fotografía #" + fotosTomadas
                + " capturada con cámara de " + megapixeles + ".";
    }


    @Override
    public String conectarseWiFi(String nombreRed) {
        if (!isEncendido()) {
            return "[" + getNombre() + "] No puede conectarse: dispositivo apagado.";
        }
        if (conectadoWiFi) {
            return "[" + getNombre() + "] Ya está conectado a \"" + redWiFiActual + "\".";
        }
        conectadoWiFi = true;
        redWiFiActual = nombreRed;
        return "[" + getNombre() + "] Conectado a la red \"" + nombreRed + "\" con éxito.";
    }

    @Override
    public String desconectarseWiFi() {
        if (!conectadoWiFi) {
            return "[" + getNombre() + "] No está conectado a ninguna red WiFi.";
        }
        String redAnterior = redWiFiActual;
        conectadoWiFi = false;
        redWiFiActual = null;
        return "[" + getNombre() + "] Desconectado de la red \"" + redAnterior + "\".";
    }

    @Override
    public boolean estaConectado() {
        return conectadoWiFi;
    }


    @Override
    public String obtenerEstado() {
        return String.format(
                "Smartphone | ID: %s | %s %s | Estado: %s | Cámara: %s | " +
                "Fotos: %d | WiFi: %s",
                getId(), marca, modelo,
                isEncendido() ? "ENCENDIDO" : "APAGADO",
                megapixeles, fotosTomadas,
                conectadoWiFi ? "Conectado (" + redWiFiActual + ")" : "Desconectado");
    }


    public int    getFotosTomadas()  { return fotosTomadas; }
    public String getMarca()         { return marca; }
    public String getModelo()        { return modelo; }
    public String getRedWiFiActual() { return redWiFiActual; }
}

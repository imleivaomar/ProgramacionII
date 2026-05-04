package trabajoPracticoIII.ecosistemaDeDispositivosInteligentes;


public class TermostatoInteligente extends Dispositivo implements CapazConectarWiFi {

    private double temperaturaActual;
    private double temperaturaObjetivo;
    private boolean conectadoWiFi;
    private String redWiFiActual;


    public TermostatoInteligente(String id, String nombre, double temperaturaObjetivo) {
        super(id, nombre);
        this.temperaturaObjetivo = temperaturaObjetivo;
        this.temperaturaActual   = 22.0; // temperatura ambiente por defecto
        this.conectadoWiFi       = false;
        this.redWiFiActual       = null;
    }


    @Override
    public String conectarseWiFi(String nombreRed) {
        if (!isEncendido()) {
            return "[" + getNombre() + "] No puede conectarse: dispositivo apagado.";
        }
        if (conectadoWiFi) {
            return "[" + getNombre() + "] Ya está conectado a la red \"" + redWiFiActual + "\".";
        }
        conectadoWiFi = true;
        redWiFiActual = nombreRed;
        return "[" + getNombre() + "] Conectado exitosamente a la red \"" + nombreRed + "\".";
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

    public String ajustarTemperatura(double temperatura) {
        if (!isEncendido()) {
            return "[" + getNombre() + "] No puede ajustar temperatura: dispositivo apagado.";
        }
        this.temperaturaObjetivo = temperatura;
        return "[" + getNombre() + "] Temperatura objetivo ajustada a " + temperatura + "°C.";
    }

    @Override
    public String obtenerEstado() {
        return String.format(
                "Termostato Inteligente | ID: %s | Nombre: %s | Estado: %s | " +
                "Temp. actual: %.1f°C | Temp. objetivo: %.1f°C | WiFi: %s",
                getId(), getNombre(),
                isEncendido() ? "ENCENDIDO" : "APAGADO",
                temperaturaActual, temperaturaObjetivo,
                conectadoWiFi ? "Conectado (" + redWiFiActual + ")" : "Desconectado");
    }


    public double getTemperaturaActual()  { return temperaturaActual; }
    public double getTemperaturaObjetivo(){ return temperaturaObjetivo; }
    public String getRedWiFiActual()      { return redWiFiActual; }
}

package trabajoPracticoIII.ecosistemaDeDispositivosInteligentes;

public interface CapazConectarWiFi {
    String conectarseWiFi(String nombreRed);
    String desconectarseWiFi();
    boolean estaConectado();
}

package trabajoPracticoIII.ecosistemaDeDispositivosInteligentes;

import java.util.ArrayList;
import java.util.List;
public class ControladorCentral {
    private final String nombreCasa;
    private final List<Dispositivo> dispositivos;
    public ControladorCentral(String nombreCasa) {
        this.nombreCasa  = nombreCasa;
        this.dispositivos = new ArrayList<>();
    }

    public void registrarDispositivo(Dispositivo dispositivo) {
        dispositivos.add(dispositivo);
        System.out.println("  [Registro] " + dispositivo.getNombre()
                + " (ID: " + dispositivo.getId() + ") registrado en el sistema.");
    }


    public boolean eliminarDispositivo(String id) {
        return dispositivos.removeIf(d -> d.getId().equals(id));
    }


    public void encenderTodos() {
        System.out.println("\n>> Encendiendo todos los dispositivos...");
        for (Dispositivo d : dispositivos) {
            System.out.println("  " + d.encender());
        }
    }

    public void apagarTodos() {
        System.out.println("\n>> Apagando todos los dispositivos...");
        for (Dispositivo d : dispositivos) {
            System.out.println("  " + d.apagar());
        }
    }

    public void conectarDispositivosWiFi(String nombreRed) {
        System.out.println("\n>> Conectando dispositivos WiFi a la red: \"" + nombreRed + "\"...");
        boolean hayDispositivosWiFi = false;

        for (Dispositivo d : dispositivos) {
            if (d instanceof CapazConectarWiFi wifi) {   // Pattern matching (Java 16+)
                hayDispositivosWiFi = true;
                System.out.println("  " + wifi.conectarseWiFi(nombreRed));
            }
        }

        if (!hayDispositivosWiFi) {
            System.out.println("  Ningún dispositivo registrado soporta WiFi.");
        }
    }

    public void tomarFotografiasEnTodos() {
        System.out.println("\n>> Solicitando fotografías a todos los dispositivos con cámara...");
        boolean hayCamaras = false;

        for (Dispositivo d : dispositivos) {
            if (d instanceof CapazTomarFotografia camara) {  // Pattern matching (Java 16+)
                hayCamaras = true;
                System.out.println("  " + camara.tomarFotografia());
            }
        }

        if (!hayCamaras) {
            System.out.println("  Ningún dispositivo registrado posee cámara.");
        }
    }


    public void desconectarDispositivosWiFi() {
        System.out.println("\n>> Desconectando dispositivos WiFi...");
        for (Dispositivo d : dispositivos) {
            if (d instanceof CapazConectarWiFi wifi) {
                System.out.println("  " + wifi.desconectarseWiFi());
            }
        }
    }


    public void mostrarEstadoGeneral() {
        System.out.println("\n╔══════════════════════════════════════════════════════════════╗");
        System.out.println("║       ESTADO GENERAL — Casa: " + nombreCasa);
        System.out.println("╚══════════════════════════════════════════════════════════════╝");

        if (dispositivos.isEmpty()) {
            System.out.println("  No hay dispositivos registrados.");
            return;
        }

        for (int i = 0; i < dispositivos.size(); i++) {
            System.out.printf("  [%d] %s%n", i + 1, dispositivos.get(i).obtenerEstado());
        }

        System.out.println("──────────────────────────────────────────────────────────────");
        System.out.println("  Total dispositivos  : " + dispositivos.size());
        System.out.println("  Con WiFi            : " + contarPorCapacidad(CapazConectarWiFi.class));
        System.out.println("  Con cámara          : " + contarPorCapacidad(CapazTomarFotografia.class));
        System.out.println("──────────────────────────────────────────────────────────────\n");
    }


    private long contarPorCapacidad(Class<?> interfaz) {
        return dispositivos.stream()
                .filter(interfaz::isInstance)
                .count();
    }


    public String getNombreCasa()          { return nombreCasa; }
    public List<Dispositivo> getDispositivos() { return List.copyOf(dispositivos); }
    public int getCantidadDispositivos()   { return dispositivos.size(); }
}

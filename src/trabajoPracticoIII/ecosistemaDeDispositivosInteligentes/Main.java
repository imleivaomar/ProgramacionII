package trabajoPracticoIII.ecosistemaDeDispositivosInteligentes;
public class Main {
    public static void main(String[] args) {
        separator("ECOSISTEMA DE DISPOSITIVOS INTELIGENTES");
        ControladorCentral controlador = new ControladorCentral("Casa Domótica Principal");
        CamaraSeguridad    camara      = new CamaraSeguridad(
                "CAM-001", "Cámara Frontal", "4K");
        TermostatoInteligente termostato = new TermostatoInteligente(
                "TERM-001", "Termostato Sala", 22.5);
        Smartphone smartphone = new Smartphone(
                "PHONE-001", "Teléfono Dueño", "Samsung", "Galaxy S24", "200MP");
        separator("REGISTRO DE DISPOSITIVOS");
        controlador.registrarDispositivo(camara);
        controlador.registrarDispositivo(termostato);
        controlador.registrarDispositivo(smartphone);
        separator("ESTADO INICIAL");
        controlador.mostrarEstadoGeneral();

        separator("OPERACIONES CON DISPOSITIVOS APAGADOS (deben fallar)");
        controlador.conectarDispositivosWiFi("RedCasa_5G");


        controlador.tomarFotografiasEnTodos();

        separator("ENCENDIDO DE DISPOSITIVOS");

        controlador.encenderTodos();
        separator("CONEXIÓN WiFi (solo dispositivos compatibles)");

        controlador.conectarDispositivosWiFi("RedCasa_5G");
        separator("TOMAR FOTOGRAFÍAS (solo dispositivos con cámara)");

        controlador.tomarFotografiasEnTodos();
        controlador.tomarFotografiasEnTodos(); // segunda ronda

        separator("AJUSTE DE TEMPERATURA (operación específica)");
        System.out.println("  " + termostato.ajustarTemperatura(24.0));

        separator("ESTADO FINAL");
        controlador.mostrarEstadoGeneral();

        separator("RECONEXIÓN (debe informar que ya está conectado)");
        controlador.conectarDispositivosWiFi("OtraRed");

        separator("DESCONEXIÓN WiFi");
        controlador.desconectarDispositivosWiFi();

        // ── 13. Estado post-desconexión ───────────────────────────────────────
        separator("ESTADO TRAS DESCONEXIÓN");
        controlador.mostrarEstadoGeneral();

        // ── 14. Apagado total ─────────────────────────────────────────────────
        separator("APAGADO TOTAL");
        controlador.apagarTodos();

        System.out.println("\n  Sistema finalizado correctamente.\n");
    }

    private static void separator(String titulo) {
        System.out.println();
        System.out.println("══════════════════════════════════════════════════════════════");
        System.out.println("  " + titulo);
        System.out.println("══════════════════════════════════════════════════════════════");
    }
}

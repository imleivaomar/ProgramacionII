package trabajoPracticoII.reloj;
public class reloj {
    private int hora;
    private int minutos;
    private int segundos;

    public void establecerHora(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void avanzarSegundos() {
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
        }
        if (minutos == 60) {
            minutos = 0;
            hora++;
        }
        if (hora == 24) {
            hora = 0;
        }
    }

    public void mostrarHora() {

        System.out.printf("%02d:%02d:%02d%n", hora, minutos, segundos);
    }
}
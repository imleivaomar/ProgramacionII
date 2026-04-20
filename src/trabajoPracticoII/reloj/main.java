package trabajoPracticoII.reloj;
public class main {
    public static void main(String[] args) {
        Reloj miReloj = new Reloj();
        miReloj.establecerHora(10, 30, 59);
        miReloj.mostrarHora();
        miReloj.avanzarSegundos();
        miReloj.mostrarHora();
    }
}
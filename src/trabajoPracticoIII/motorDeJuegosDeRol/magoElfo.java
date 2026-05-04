package trabajoPracticoIII.motorDeJuegosDeRol;
public class MagoElfo extends PersonajeJugable implements LanzadorDeHechizos {
    public MagoElfo(double x, double y) {
        super(x, y, 80);
    }

    @Override
    public String lanzarHechizo() {
        System.out.println("MagoElfo: lanza un hechizo mágico.");
        return "Rayo";
    }

    public void atacarConMagia() {
        if (estaVivo()) {
            System.out.println("MagoElfo: ataca usando su magia.");
        }
    }

    @Override
    public void dibujar() {
        System.out.printf("MagoElfo con %d puntos de vida en (%.1f, %.1f)%n",
                getPuntosVida(), getX(), getY());
    }
}
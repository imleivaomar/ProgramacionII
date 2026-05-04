package trabajoPracticoIII.motorDeJuegosDeRol;

public class GuerreroHumano extends PersonajeJugable {
    public GuerreroHumano(double x, double y) {
        super(x, y, 100);
    }

    public void atacarConFuerza() {
        System.out.println("GuerreroHumano: realiza un ataque físico.");
    }

    @Override
    public void dibujar() {
        System.out.printf("GuerreroHumano con %d puntos de vida en (%.1f, %.1f)%n",
                getPuntosVida(), getX(), getY());
    }
}

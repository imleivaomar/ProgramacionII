package trabajoPracticoIII.motorDeJuegosDeRol;

public class Orco extends MonstruoHostil {
    public Orco(double x, double y) {
        super(x, y, 120);
    }

    public void rugir() {
        System.out.println("Orco: gruñe y carga hacia el enemigo.");
    }

    @Override
    public void dibujar() {
        System.out.printf("Orco con %d puntos de vida en (%.1f, %.1f)%n",
                getPuntosVida(), getX(), getY());
    }
}
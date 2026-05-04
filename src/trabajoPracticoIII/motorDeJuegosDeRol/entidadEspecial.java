package trabajoPracticoIII.motorDeJuegosDeRol;
public abstract class EntidadEspacial {
    protected double x;
    protected double y;

    public EntidadEspacial(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void mover(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void dibujar() {
        System.out.printf("Dibujando entidad en (%.1f, %.1f)%n", x, y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "@" + x + "," + y;
    }
}
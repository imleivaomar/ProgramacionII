package trabajoPracticoIII.motorDeJuegosDeRol;

public abstract class SerVivo extends EntidadEspacial {
    protected int puntosVida;

    public SerVivo(double x, double y, int vidaInicial) {
        super(x, y);
        this.puntosVida = vidaInicial;
    }

    public void recibirDaño(int daño) {
        puntosViva = Math.max(0, puntosVida - daño);
    }

    public boolean estaVivo() {
        return puntosVida > 0;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    @Override
    public void dibujar() {
        System.out.printf("%s con %d puntos de vida en (%.1f, %.1f)%n",
                getClass().getSimpleName(), puntosVida, getX(), getY());
    }
}

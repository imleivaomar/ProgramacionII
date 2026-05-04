package trabajoPracticoIII.motorDeJuegosDeRol;
public class Dragon extends MonstruoHostil implements LanzadorDeHechizos {
    public Dragon(double x, double y) {
        super(x, y, 200);
    }

    @Override
    public String lanzarHechizo() {
        System.out.println("Dragon: lanza un hechizo de fuego.");
        return "Bola de Fuego";
    }

    public void aletear() {
        System.out.println("Dragon: agita sus alas.");
    }

    @Override
    public void dibujar() {
        System.out.printf("Dragon con %d puntos de vida en (%.1f, %.1f)%n",
                getPuntosVida(), getX(), getY());
    }
}
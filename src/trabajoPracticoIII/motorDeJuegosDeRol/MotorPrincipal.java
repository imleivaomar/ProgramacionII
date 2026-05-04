package trabajoPracticoIII.motorDeJuegosDeRol;
import java.util.ArrayList;
import java.util.List;

public class MotorPrincipal {
    private List<EntidadEspacial> entidades;

    public MotorPrincipal() {
        this.entidades = new ArrayList<>();
    }

    // Registrar una nueva entidad
    public void agregarEntidad(EntidadEspacial entidad) {
        entidades.add(entidad);
    }

    // Actualizar todas las coordenadas (simulación de movimiento)
    public void actualizarPosiciones() {
        for (EntidadEspacial entidad : entidades) {
            double dx = Math.random() * 4.0 - 2.0;
            double dy = Math.random() * 4.0 - 2.0;
            entidad.mover(entidad.getX() + dx, entidad.getY() + dy);
        }
    }

    // Calcular supervivencia: revisa vida de todos los SerVivo
    public void actualizarSupervivencia() {
        for (EntidadEspacial entidad : entidades) {
            if (entidad instanceof SerVivo) {
                SerVivo ser = (SerVivo) entidad;
                if (!ser.estaVivo()) {
                    System.out.println(">>> " + ser.getClass().getSimpleName() + " ha muerto.");
                }
            }
        }
    }

    // Permitir lanzar hechizos solo a quienes implementan LanzadorDeHechizos
    public void invocarHechizos() {
        for (EntidadEspacial entidad : entidades) {
            if (entidad instanceof LanzadorDeHechizos) {
                LanzadorDeHechizos lanzador = (LanzadorDeHechizos) entidad;
                System.out.printf("Invocando hechizo en %s:%n", entidad);
                lanzador.lanzarHechizo();
            }
        }
    }

    // Dibujar todo el mundo
    public void dibujarTodo() {
        System.out.println("\n=== Dibujando mundo ===");
        entidades.forEach(EntidadEspacial::dibujar);
    }

    // Método de prueba
    public static void main(String[] args) {
        MotorPrincipal motor = new MotorPrincipal();

        motor.agregarEntidad(new GuerreroHumano(10, 10));
        motor.agregarEntidad(new MagoElfo(15, 15));
        motor.agregarEntidad(new Orco(30, 30));
        motor.agregarEntidad(new Dragon(40, 40));

        // Actualizar posiciones
        motor.actualizarPosiciones();
        motor.dibujarTodo();

        // Simular daño para MagoElfo
        MagoElfo mago = null;
        for (EntidadEspacial e : motor.entidades) {
            if (e instanceof MagoElfo) {
                mago = (MagoElfo) e;
            }
        }
        if (mago != null) {
            mago.recibirDaño(50);
        }

        // Actualizar supervivencia
        motor.actualizarSupervivencia();

        // Invocar hechizos solo en lanzadores
        motor.invocarHechizos();
    }
}
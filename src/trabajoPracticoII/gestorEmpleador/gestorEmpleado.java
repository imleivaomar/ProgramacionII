package trabajoPracticoII.gestorEmpleador;
public class gestorEmpleado {
    private int legajo;
    private String nombre;
    private double salario;

    private static int cantidadEmpleados = 0;

    // Constructor
    public gestorEmpleado(int legajo, String nombre, double salario) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.salario = salario;
        cantidadEmpleados++;
    }
    //aumentos
    // (por porcentaje)
    public void aumentarSalario(double porcentaje, String motivo) {
        double aumento = this.salario * (porcentaje / 100);
        this.salario += aumento;
        System.out.println("Aumento para empleado: " + nombre + " (" + motivo + "): +%" + porcentaje);
    }

    //  (por monto fijo)
    public void aumentarSalario(String motivo, double montoFijo) {
        this.salario += montoFijo;
        System.out.println("Aumento para empleado: " + nombre + " (" + motivo + "): +$" + montoFijo);
    }

    public static int getCantidadTotal() {
        return cantidadEmpleados;
    }

    public void mostrarDatos() {
        System.out.println("Legajo: " + legajo + " | Nombre: " + nombre + " | Salario Actual: $" + salario);
    }
}
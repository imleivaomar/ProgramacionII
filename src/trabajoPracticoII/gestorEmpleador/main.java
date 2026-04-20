package trabajoPracticoII.gestorEmpleador;
public class main {
    public static void main(String[] args) {
        main emp1 = new main(2017, "Ian", 800000);
        main emp2 = new main(2007, "Mily", 880000);

        System.out.println("Empleados registrados: " + main.getCantidadTotal());

        System.out.println("- Aplicando Aumentos -");


        emp1.aumentarSalario(20.0, "Aumento de Abril");
        emp2.aumentarSalario("Bono por objetivos", 70000.0);

        System.out.println("\n- Resumen Final -");
        emp1.mostrarDatos();
        emp2.mostrarDatos();
    }
}
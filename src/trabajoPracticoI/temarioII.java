package trabajoPracticoI;
import java.util.Scanner;

public class temarioII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la nota del primer parcial: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Ingrese la nota del segundo parcial: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Ingrese la nota del tercer parcial: ");
        double nota3 = scanner.nextDouble();
        double promedio = (nota1 + nota2 + nota3) / 3.0;
        System.out.println("El promedio del alumno es: " + promedio);
        if (promedio >= 8) {
            System.out.println("El alumno esta PROMOCIONADO");
        } else {
            System.out.println("El alumno NO ESTA PROMOCIONAOD");
        }
        scanner.close();
    }
}
package trabajoPracticoI;
import java.util.Scanner;

public class temarioVI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de triangulos a evaluar: ");
        int n = scanner.nextInt();

        int cantEquilatero = 0;
        int cantIsosceles = 0;
        int cantEscaleno = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Triángulo " + i + "");
            System.out.print("Ingrese el lado 1: ");
            double lado1 = scanner.nextDouble();

            System.out.print("Ingrese el lado 2: ");
            double lado2 = scanner.nextDouble();

            System.out.print("Ingrese el lado 3: ");
            double lado3 = scanner.nextDouble();

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Es un triangulo EQUILATERO.");
                cantEquilatero++;

            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Es un triangulo ISOSCELES.");
                cantIsosceles++;

            } else {
                System.out.println("Es un triangulo ESCALENO.");
                cantEscaleno++;
            }
        }

        System.out.println("RESULTADOS");
        System.out.println("Cantidad de Equilateros: " + cantEquilatero);
        System.out.println("Cantidad de Isosceles: " + cantIsosceles);
        System.out.println("Cantidad de Escalenos: " + cantEscaleno);

        System.out.print("Tipo con menor cantidad: ");
        int min = cantEquilatero;
        if (cantIsosceles < min) {
            min = cantIsosceles;
        }
        if (cantEscaleno < min) {
            min = cantEscaleno;
        }
        if (cantEquilatero == min) {
            System.out.print("[Equilatero] ");
        }
        if (cantIsosceles == min) {
            System.out.print("[Isosceles] ");
        }
        if (cantEscaleno == min) {
            System.out.print("[Escaleno] ");
        }

        System.out.println("(Con una cantidad de " + min + " triangulos).");

        scanner.close();
    }
}
package trabajoPracticoI;
import java.util.Scanner;

public class temarioV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la coordenada X: ");
        int x = scanner.nextInt();
        System.out.print("Ingrese la coordenada Y: ");
        int y = scanner.nextInt();
        if (x == 0 || y == 0) {
            System.out.println("Ninguna de las coordenadas no pueden ser cero");
        }
        else if (x > 0 && y > 0) {
            System.out.println("El punto (" + x + ", " + y + ") se ubica en el PRIMER CUADRANTE");
        }
        else if (x < 0 && y > 0) {
            System.out.println("El punto (" + x + ", " + y + ") se ubica en el SEGUNDO CUADRANTE");
        }
        else if (x < 0 && y < 0) {
            System.out.println("El punto (" + x + ", " + y + ") se ubica en el TERCER CUADRANTE.");
        }
        else if (x > 0 && y < 0) {
            System.out.println("El punto (" + x + ", " + y + ") se ubica en el CUARTO CUADRANTE.");
        }
        scanner.close();
    }
}
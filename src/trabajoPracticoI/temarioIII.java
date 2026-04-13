package trabajoPracticoI;
import java.util.Scanner;

public class temarioIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un numero del 1 al 99): ");
        int numero = scanner.nextInt();
        if (numero >= 1 && numero <= 9) {
            System.out.println("El nuero tiene un solo digito.");
        } else if (numero >= 10 && numero <= 99) {
            System.out.println("El numero tiene tiene dos digito.");
        } else {
            System.out.println("Colocaste un numero nada que ver con lo que te pedi. ¡Debe ser un número del 1 al 99!");
        }
        scanner.close();
    }
}
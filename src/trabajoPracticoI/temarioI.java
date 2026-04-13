package trabajoPracticoI;
import java.util.Scanner;

public class temarioI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese la nota del alumno: ");
            double nota = scanner.nextDouble();
            if (nota >= 0 && nota <= 10) {
                if (nota < 4) {
                    System.out.println("Desaprobo");
                } else if (nota == 10) {
                    System.out.println("Aprobo. El alumno es Sobresaliente");
                } else {
                    System.out.println("Aprobo");
                }
            } else {
                System.out.println("Debes poner un numero entre 1 y 10");
            }
            scanner.close();
    }
}

package trabajoPracticoI;
import java.util.Scanner;

public class temarioIV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cual es el día: ");
        int dia = scanner.nextInt();
        System.out.print("Cual es el mes: ");
        int mes = scanner.nextInt();
        System.out.print("Cual es el año: ");
        int ano = scanner.nextInt();
        System.out.println("Fecha ingresada: " + dia + "/" + mes + "/" + ano);
        if (mes >= 1 && mes <= 3) {
            System.out.println("Esta fecha es del PRIMER TRIMESTRE del año.");
        } else if (mes >= 4 && mes <= 6) {
            System.out.println("Esta fecha es del SEGUNDO TRIMESTRE del año.");
        } else if (mes >= 7 && mes <= 9) {
            System.out.println("Esta fecha es del TERCER TRIMESTRE del año.");
        } else if (mes >= 10 && mes <= 12) {
            System.out.println("Esta fecha es del CUARTO TRIMESTRE del año.");
        } else {
            System.out.println("Colocaste un numero nada que ver. ¡Debe ser un número del 1 al 12!");
        }
        scanner.close();
    }
}

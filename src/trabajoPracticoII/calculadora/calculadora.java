package trabajoPracticoII.calculadora;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        double num1 = Scanner.nextDouble();
        System.out.println("ingrese el segundo número");
        double num2 = Scanner.nextDouble();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        Double division = null;
        if (num2 != (double) 0.0F) {// (solo si el número no es 0, realiza la operacion de dvision)
            division = num1 / num2;
        }
        System.out.println("\nResultado:");
        System.out.println("suma:" + suma);
        System.out.println("resta:" + resta);
        System.out.println("multiplicacion" + multiplicacion);

        if (division != null){
            System.out.println("división:" + division);
        } else {
            System.out.println("division: Error ( no es posible dividir en cero)");
        }

    }  }
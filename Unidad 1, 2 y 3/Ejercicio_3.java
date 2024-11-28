import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;

        if (num2 != 0) {
            double division = num1 / num2;
            double modulo = num1 % num2;
            System.out.println("División: " + division);
            System.out.println("Módulo: " + modulo);
        } else {
            System.out.println("División: Error, se esta dividiendo por cero");
            System.out.println("Módulo: Error, se esta dividiendo por cero");
        }

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);

        scanner.close();
    }
}

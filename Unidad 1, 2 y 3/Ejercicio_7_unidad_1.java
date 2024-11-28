import java.util.Scanner;

public class Ejercicio_7_unidad_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingresa el tercer número: ");
        double num3 = scanner.nextDouble();

        double media = (num1 + num2 + num3) / 3;

        System.out.println("La media de los tres números es: " + media);

        scanner.close();
    }
}

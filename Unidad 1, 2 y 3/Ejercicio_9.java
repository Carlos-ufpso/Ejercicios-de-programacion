import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingresa el tercer número: ");
        int num3 = scanner.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("El primer número es el mayor.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("El segundo número es el mayor.");
        } else {
            System.out.println("El tercer número es el mayor.");
        }

        scanner.close();
    }
}

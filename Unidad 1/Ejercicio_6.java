import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingresa tu altura (en metros): ");
        double altura = scanner.nextDouble();

        System.out.println("¡Hola, " + nombre + "!");
        System.out.println("Tienes " + edad + " años y mides " + altura + " metros.");

        scanner.close();
    }
}


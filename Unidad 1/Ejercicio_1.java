import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingresa la altura (ejemplo: 1,76): ");
        double altura = scanner.nextDouble();

        System.out.print("Ingresa la inicial del nombre: ");
        String inicialNombre = scanner.next();

        boolean esMayorDeEdad = edad >= 18;

        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Inicial del nombre: " + inicialNombre);
        System.out.println("¿Es mayor de edad? " + esMayorDeEdad);

        scanner.close();
    }
}

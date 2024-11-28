import java.util.Scanner;

public class Ejercicio_2_unidad_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14159;

        System.out.print("Ingresa el valor del radio: ");
        double radio = scanner.nextDouble();

        double area = PI * radio * radio;

        System.out.println("El área del círculo es: " + area + " unidades cuadradas");

        scanner.close();
    }
}

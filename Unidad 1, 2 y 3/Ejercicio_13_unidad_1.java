import java.util.Scanner;

public class Ejercicio_13_unidad_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número para generar su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}

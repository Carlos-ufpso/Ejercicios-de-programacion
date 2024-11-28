import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número para calcular su factorial: ");
        int numero = scanner.nextInt();

        int factorial = 1;
        int i = 1;

        while (i <= numero) {
            factorial *= i;
            i++;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);

        scanner.close();
    }
}
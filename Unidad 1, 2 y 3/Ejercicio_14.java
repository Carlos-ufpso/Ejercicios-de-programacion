import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        int suma = 0;
        double promedio;

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }

        promedio = suma / 5.0;

        System.out.println("El promedio de los números ingresados es: " + promedio);

        scanner.close();
    }
}

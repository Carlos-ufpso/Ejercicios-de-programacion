import java.io.*;
import java.util.Scanner;

public class Ejercicio_5_unidad_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String archivo = "notas.txt";
        
        try (FileWriter writer = new FileWriter(archivo, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

            System.out.println("Ingrese las notas (escriba 'fin' para terminar):");

            while (true) {
                System.out.print("Nota: ");
                String nota = scanner.nextLine();

                if (nota.equalsIgnoreCase("fin")) {
                    break;
                }

                bufferedWriter.write(nota);
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

        System.out.println("\nNotas guardadas en el archivo:");

        try (FileReader reader = new FileReader(archivo);
            BufferedReader bufferedReader = new BufferedReader(reader)) {

            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        scanner.close();
    }
}


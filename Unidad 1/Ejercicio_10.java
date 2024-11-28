public class Ejercicio_10 {
    public static void main(String[] args) {
        int contador = 0;

        for (int i = 2; i <= 100; i++) {
            boolean esPrimo = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                contador++;
            }
        }

        System.out.println("La cantidad de números primos entre 1 y 100 es: " + contador);
    }
}

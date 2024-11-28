
public class Ejercicio_1_unidad_2 {
    public static void main(String[] args) {
        System.out.println("El número más grande es: " + maximo(5, 8, 3));
        System.out.println("El número más grande es: " + maximo(10, 2, 7));
    }

    public static int maximo(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}

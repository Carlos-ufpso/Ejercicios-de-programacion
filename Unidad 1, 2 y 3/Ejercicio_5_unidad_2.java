public class Ejercicio_5_unidad_2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Antes de intercambiar: a = " + a + ", b = " + b);

        intercambiar(a, b);

        System.out.println("Después de intercambiar: a = " + a + ", b = " + b);  // Los valores no cambiarán fuera del método
    }

    public static void intercambiar(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Dentro del método intercambiar: a = " + a + ", b = " + b);
    }
}


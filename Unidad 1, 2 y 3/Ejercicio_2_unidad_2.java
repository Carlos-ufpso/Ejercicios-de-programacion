public class Ejercicio_2_unidad_2 {
    public static void main(String[] args) {
        int numero = 10;
        System.out.println("Valor antes del método: " + numero);
        cambiarValor(numero);
        System.out.println("Valor después del método: " + numero);
    }

    public static void cambiarValor(int num) {
        num = 20;
        System.out.println("Valor dentro del método: " + num);
    }
}

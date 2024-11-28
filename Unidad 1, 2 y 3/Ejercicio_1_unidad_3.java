public class Ejercicio_1_unidad_3 {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        try {
            int resultado = dividir(num1, num2);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error, no se puede dividir por cero");
        }
    }

    public static int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero no permitida");
        }
        return a / b;
    }
}


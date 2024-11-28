public class Ejercicio_2_unidad_3 {

    public static void main(String[] args) {
        double numero = -16;

        try {
            double resultado = calcularRaizCuadrada(numero);
            System.out.println("La raíz cuadrada de " + numero + " es " + resultado);
        } catch (NumeroNegativoException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double calcularRaizCuadrada(double numero) throws NumeroNegativoException {
        if (numero < 0) {
            throw new NumeroNegativoException("Error, no se puede calcular la raíz cuadrada de un número negativo");
        }
        return Math.sqrt(numero);
    }
}

class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
}

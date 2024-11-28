public class Ejercicio_8_unidad_2 {

    public static int aumentarValor(int num) {
        num += 3;
        System.out.println("Valor dentro del método: " + num);
        return num;
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println("Antes de modificar: " + num);
        num = aumentarValor(num);
        System.out.println("Después de modificar: " + num);
    }
}


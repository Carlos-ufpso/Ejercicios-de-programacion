public class Ejercicio_9_unidad_2 {

    public static void modificarCadena(String texto) {
        texto = texto + " modificado";
        System.out.println("Dentro del método: " + texto);
    }

    public static void main(String[] args) {
        String texto = "Original";
        System.out.println("Antes de llamar al método: " + texto);
        modificarCadena(texto);
        System.out.println("Después de llamar al método: " + texto);
    }
}


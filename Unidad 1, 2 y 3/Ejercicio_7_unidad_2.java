public class Ejercicio_7_unidad_2 {

    public static void main(String[] args) {
        int[] miArray = {1, 2, 3, 4, 5};

        System.out.println("Antes de modificar el array:");
        mostrarArray(miArray);

        modificarArray(miArray);

        System.out.println("Después de modificar el array:");
        mostrarArray(miArray);
    }

    public static void modificarArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
    }

    public static void mostrarArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

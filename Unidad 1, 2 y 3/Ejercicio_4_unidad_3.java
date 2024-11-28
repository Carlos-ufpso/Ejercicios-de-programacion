import java.util.ArrayList;

public class Ejercicio_4_unidad_3 {

    public static void main(String[] args) {
        ArrayList<String> listaElementos = new ArrayList<>();
        listaElementos.add("Elemento 1");
        listaElementos.add("Elemento 2");
        listaElementos.add("Elemento 3");

        System.out.println("Lista de elementos: " + listaElementos);

        try {
            System.out.println("Accediendo al índice 2: " + listaElementos.get(2));
            System.out.println("Accediendo al índice 5: " + listaElementos.get(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error, indice fuera de los límites de la lista");
        }
    }
}


public class Ejercicio_5_unidad_1 {
    public static void main(String[] args) {
        double cantidad_Inicial = 1000;
        double retiro_Semanal = 200;
        int semanas = 4;
        double cantidad_Final = cantidad_Inicial - (retiro_Semanal * semanas);
        System.out.println("Cantidad final en la cuenta: $" + cantidad_Final);
    }
}

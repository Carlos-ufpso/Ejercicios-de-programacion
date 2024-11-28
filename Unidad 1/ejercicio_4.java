public class ejercicio_4
{
    public static void main(String[] args) 
    {
        double precio_Camiseta = 25;
        double precio_Pantalon = 30;

        double descuento = 0.15; 

        double descuento_Adicional = 0.05; 

        double precio_Camiseta_Descuento = precio_Camiseta * (1 - descuento);
        double precio_Pantalon_Descuento = precio_Pantalon * (1 - descuento);

        double precio_Total = precio_Camiseta_Descuento + precio_Pantalon_Descuento;

        System.out.println("El precio total con descuento es: $" + precio_Total);

        double precio_Camiseta_Descuento_Adicional = precio_Camiseta_Descuento * (1 - descuento_Adicional) ;
        double precio_Total_Con_Segunda_Camiseta = precio_Total + precio_Camiseta_Descuento_Adicional;

        System.out.println("El precio total con la segunda camiseta y el descuento adicional es: $" + precio_Total_Con_Segunda_Camiseta);
    }
}

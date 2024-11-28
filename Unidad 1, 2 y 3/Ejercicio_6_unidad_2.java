class Rectangulo {
    int ancho;
    int alto;

    Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    public int calcularArea() {
        return this.ancho * this.alto;
    }

    public void mostrarEstado() {
        System.out.println("Rectángulo -> Ancho: " + this.ancho + ", Alto: " + this.alto + ", Área: " + calcularArea());
    }

    public static void modificarRectangulo(Rectangulo r) {
        r.ancho = 50;
        r.alto = 30;
        System.out.println("Dentro del método: ");
        r.mostrarEstado();
    }
}

public class Ejercicio_6_unidad_2 {

    public static void main(String[] args) {
        Rectangulo miRectangulo = new Rectangulo(10, 20);

        System.out.println("Antes de modificar:");
        miRectangulo.mostrarEstado();

        Rectangulo.modificarRectangulo(miRectangulo);

        System.out.println("Después de modificar:");
        miRectangulo.mostrarEstado();
    }
}

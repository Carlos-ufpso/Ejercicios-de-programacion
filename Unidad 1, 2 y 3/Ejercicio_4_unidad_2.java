class Persona {
    String nombre;
}

public class Ejercicio_4_unidad_2 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Ana";
        System.out.println("Antes de reasignar la referencia: " + persona.nombre);

        cambiarReferencia(persona);

        System.out.println("Después de reasignar la referencia: " + persona.nombre);  // Debería imprimir Ana, no María
    }

    public static void cambiarReferencia(Persona persona) {
        persona = new Persona();
        persona.nombre = "María";
    }
}

package Ejercicio1;

public class PruebaEjercicio1 {
    public static void main(String[] args) {


        Persona persona = new Persona("Batman", 46);
        persona.mostrarDetalles();

        System.out.println();


        Empleado empleado = new Empleado("Alfred", 56, "Asistencia");
        empleado.mostrarDetalles();
    }
}
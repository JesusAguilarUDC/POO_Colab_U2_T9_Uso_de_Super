package Ejercicio1;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad= edad;
    }

    public void mostrarDetalles(){
        System.out.println("El nombre es = " + nombre);
        System.out.println("La edad es = " + edad);
    }
}

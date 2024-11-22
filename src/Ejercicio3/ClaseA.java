package Ejercicio3;

public class ClaseA {

    private String nombre;
    private int edad;

    public ClaseA(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDetalles(){
        System.out.println("Nombre = " + nombre);
        System.out.println("Edad = " + edad);
    }

}

package Ejercicio2;

public class PruebaEjercicio2 {
    public static void main(String[] args) {

        Animal animal = new Animal("Tiburon Pintarroja");
        animal.mostrarEspecie();

        System.out.println();

        Pez pez = new Pez("Tiburon Blanco", "Dulce");
        pez.mostrarAgua();


    }
}

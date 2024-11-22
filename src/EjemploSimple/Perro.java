package Ejemplos.EjemploSimple;

public class Perro extends Animal {
    private String raza;
    public Perro(String especie, String raza) {
        super(especie); // Llama al constructor de la clase base
        this.raza = raza;
    }
}
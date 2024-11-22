package Ejemplos.EjemploSintaxisSuper;

public class Coche extends Vehiculo {
    private int numeroDePuertas;
    public Coche(String marca, int numeroDePuertas) {
        super(marca); // Llama al constructor de la clase base
        this.numeroDePuertas = numeroDePuertas;
    }
}
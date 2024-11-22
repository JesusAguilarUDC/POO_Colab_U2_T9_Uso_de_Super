package Ejercicio2;

public class Animal {
    private String especie;

    public Animal(String especie){
        this.especie = especie;
    }

    public void mostrarEspecie(){
        System.out.println("La especie es = " + especie);
    }
}

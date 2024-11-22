package Ejercicio3;

public class Coche extends Vehiculo{

    private String modelo;

    public Coche (String marca, String modelo){
        super(marca);
        this.modelo = modelo;
    }

    @Override
    public void mostrarDetalles(){
        super("Marca = " + super.marca);
        System.out.println("Modelo = " + modelo);
    }

}

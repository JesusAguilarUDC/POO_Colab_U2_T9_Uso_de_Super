package Ejercicio2;

public class Pez extends Animal{

    private String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua){
        super(especie);
        this.tipoDeAgua = tipoDeAgua;
    }


    public void mostrarAgua(){
        super.mostrarEspecie();
        System.out.println("El tipo de agua es = " + tipoDeAgua);
    }
}

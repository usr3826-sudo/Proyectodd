package Proyectodd.personajes;

public class mago extends personaje {
    private String elemento;

    public mago(String nombre, int nivel, String elemento) {
        super(nombre, nivel);
        this.elemento = elemento;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Elemento: " + elemento);
    }

    public void ataqueElemental() {
        gastarEnergia(25);
    }
}
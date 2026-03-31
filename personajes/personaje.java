package Proyectodd.personajes;

public class personaje {
    private String nombre;
    private int nivel;
    private int energia;
    private static int totalPersonajes = 0;

    public personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.energia = 100;
        totalPersonajes++;
    }
}
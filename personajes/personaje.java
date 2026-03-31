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

 public void entrenar(int x) {
    if (x > 0) nivel += x;
}

public void descansar(int x) {
    if (x > 0 && energia + x <= 100) energia += x;
}

public void gastarEnergia(int x) {
    if (x > 0 && energia - x >= 0) energia -= x;
}

public void mostrarInfo() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Nivel: " + nivel);
    System.out.println("Energia: " + energia);
}

public static void mostrarTotalPersonajes() {
    System.out.println("Total personajes: " + totalPersonajes);
}

}
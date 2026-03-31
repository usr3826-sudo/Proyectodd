package Proyectodd.personajes;

public class guerrero extends personaje {
    private String arma;

    public guerrero(String nombre, int nivel, String arma) {
        super(nombre, nivel);
        this.arma = arma;
    }
    
    @Override
public void mostrarInfo() {
    super.mostrarInfo();
    System.out.println("Arma: " + arma);
}

public void ataquePesado() {
    gastarEnergia(15);
}
}
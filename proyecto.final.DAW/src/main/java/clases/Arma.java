package clases;

public class Arma {
    
	private int fuerza;
    private byte peso;
    
    // Constructor
    public Arma(int fuerza, byte peso) {
        this.fuerza = fuerza;
        this.peso = peso;
    }
    
    // Getters y Setters
    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public byte getPeso() {
        return peso;
    }

    public void setPeso(byte peso) {
        this.peso = peso;
    }
}

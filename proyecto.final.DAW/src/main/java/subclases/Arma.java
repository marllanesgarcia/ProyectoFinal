package subclases;

public class Arma {

	private int fuerza;
	private byte peso;
	
	public Arma(int fuerza, byte peso) {
		super();
		this.fuerza = fuerza;
		this.peso = peso;
	}

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

	@Override
	public String toString() {
		return "Arma [fuerza=" + fuerza + ", peso=" + peso + "]";
	}
	
	
	
}

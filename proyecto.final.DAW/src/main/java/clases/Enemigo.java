package clases;

import enums.Elemento;

public class Enemigo extends ElementoConNombre{

	private int fuerza;
	private Elemento elemento;
	private byte vida;
	
	public Enemigo(String nombre, int fuerza, Elemento elemento, byte vida) {
		super(nombre);
		this.fuerza = fuerza;
		this.elemento = elemento;
		this.vida = vida;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public Elemento getElemento() {
		return elemento;
	}

	public void setElemento(Elemento elemento) {
		this.elemento = elemento;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(byte vida) {
		this.vida = vida;
	}

	
	public void recibirAtaque(int fuerzaAtaque) {
        vida -= fuerzaAtaque;
    }

    public boolean estaDerrotado() {
        return vida <= 0;
    }
	
	@Override
	public String toString() {
		return "Enemigo [fuerza=" + fuerza + ", elemento=" + elemento + ", vida=" + vida + "]";
	}
	
	

}

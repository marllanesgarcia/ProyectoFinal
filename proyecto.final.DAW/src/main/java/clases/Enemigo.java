package clases;

import enums.Elemento;

public class Enemigo extends ElementoConNombre{

	private int fuerza;
	private Elemento elemento;
	private int vida;
	
	public Enemigo(String nombre, int fuerza, Elemento elemento, int vida) {
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

	public void setVida(int vida) {
		this.vida = vida;
	}

	@Override
	public String toString() {
		return "Enemigo [fuerza=" + fuerza + ", elemento=" + elemento + ", vida=" + vida + "]";
	}
	
	

}

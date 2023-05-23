package clases;

import enums.Elemento;
import enums.Region;
import subclases.Arma;
import subclases.Talento;

public class Jugador extends ElementoConNombre{

	private Region region;
	private byte edad;
	private byte altura;
	private String genero;
	private Elemento elemento;
	private byte vida;
	private Talento talento;
	private Arma arma;
	
	public Jugador(String nombre, Region region, byte edad, byte altura, String genero,
			Elemento elemento, byte vida, Talento talento, Arma arma) {
		super(nombre);
		this.region = region;
		this.edad = edad;
		this.altura = altura;
		this.genero = genero;
		this.elemento = elemento;
		this.vida = vida;
		this.talento = talento;
		this.arma = arma;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public byte getAltura() {
		return altura;
	}

	public void setAltura(byte altura) {
		this.altura = altura;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Elemento getElemento() {
		return elemento;
	}

	public void setElemento(Elemento elemento) {
		this.elemento = elemento;
	}

	public byte getVida() {
		return vida;
	}

	public void setVida(byte vida) {
		this.vida = vida;
	}

	public Talento getTalento() {
		return talento;
	}

	public void setTalento(Talento talento) {
		this.talento = talento;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	@Override
	public String toString() {
		return "Jugador [region=" + region + ", edad=" + edad + ", altura=" + altura + ", genero=" + genero
				+ ", elemento=" + elemento + ", vida=" + vida + ", talento=" + talento + ", arma=" + arma + "]";
	}
	
	
	
	
}

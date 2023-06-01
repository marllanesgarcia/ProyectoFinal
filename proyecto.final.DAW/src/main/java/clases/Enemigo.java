package clases;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

import enums.Elemento;
import enums.Region;
import enums.Talento;
import util.DAO;

public class Enemigo extends ElementoConNombre{

	private int fuerza;
	private String elemento;
	private int vida;
		
	
	public Enemigo(String nombre, int fuerza, String elemento, int fuerza2) {
		super(nombre);
		this.fuerza = fuerza;
		this.elemento = elemento;
		this.vida = fuerza2;
	}

	public static ArrayList<Enemigo> getTodos() {
	    ArrayList<Enemigo> enemigos = new ArrayList<>();

	    try {
	        LinkedHashSet<String> columnasSelect = new LinkedHashSet<>();
	        columnasSelect.add("nombre");
	        columnasSelect.add("vida");
	        columnasSelect.add("elemento");
	        columnasSelect.add("fuerza");
	        
	        HashMap<String, Object> restricciones = new HashMap<>();

	        ArrayList<Object> result = DAO.consultar("Enemigo", columnasSelect, restricciones);

	        for (int i = 0; i < result.size(); i += 4) {
	            String nombre = (String) result.get(i);
	            int vida = (Integer) result.get(i + 1);
	            String elemento = (String) result.get(i + 2);
	            int fuerza = (Integer) result.get(i + 3);

	            Enemigo enemigo = new Enemigo(nombre, vida, elemento, fuerza);
	            enemigos.add(enemigo);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return enemigos;
	}
	
	
	
	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public String getElemento() {
		return elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
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

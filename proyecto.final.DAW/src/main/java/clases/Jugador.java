package clases;

import enums.Elemento;
import enums.Region;
import enums.Talento;
import util.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

import clases.Arma;

public class Jugador {

	private Region region;
	private byte edad;
	private float altura;
	private static String genero;
	private Elemento elemento;
	private static byte vida;
	private Talento talento;
	private static Arma arma;
	
	public Jugador(String nombre, byte edad, float altura, String genero,
			byte vida, Talento talento, Arma arma) {
		
		this.edad = edad;
		this.altura = altura;
		this.genero = genero;
		this.vida = vida;
		this.talento = talento;
		this.arma = arma;
	}
	
	public Jugador(Region region, byte edad, float altura, String genero,
			Elemento elemento, byte vida, Talento talento, Arma arma) throws SQLException {
		super();
    	HashMap<String, Object> columnas = new HashMap<>();
    	columnas.put("region", region);
    	columnas.put("edad", edad);
    	columnas.put("altura", altura);
    	columnas.put("genero", genero);
    	columnas.put("elemento", elemento);
    	columnas.put("vida", vida);
    	columnas.put("talento", talento);
    	columnas.put("arma", arma);
    	
	    DAO.insertar("jugador", columnas);
	    
	}
	
	public static ArrayList<Arma> getTodos() {
	    ArrayList<Arma> armas = new ArrayList<>();

	    try {
	        // Definir las columnas a seleccionar en la consulta
	        LinkedHashSet<String> columnasSelect = new LinkedHashSet<>();
	        columnasSelect.add("nombre");
	        columnasSelect.add("fuerza");
	        columnasSelect.add("peso");

	        // Definir las restricciones de la consulta (si es necesario)
	        HashMap<String, Object> restricciones = new HashMap<>();

	        // Realizar la consulta a la base de datos para obtener los resultados
	        ArrayList<Object> result = DAO.consultar("Arma", columnasSelect, restricciones);

	        // Recorrer los resultados y crear instancias de Arma
	        for (int i = 0; i < result.size(); i += 3) {
	            String nombre = (String) result.get(i);
	            int fuerza = (Integer) result.get(i + 1);
	            int peso = (Integer) result.get(i + 2);

	            Arma arma = new Arma(nombre, fuerza, peso);
	            armas.add(arma);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        // Manejar la excepción de SQL
	    }

	    return armas;
	}
	

	public static Jugador jugadorNuevo(Region region, byte edad, float altura, String genero,
			Elemento elemento, byte vida, Talento talento, Arma arma) throws SQLException {
		return new Jugador (region, edad, altura, genero, elemento, vida, talento, arma);
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

	public float getAltura() {
		return altura;
	}

	public void setAltura(byte altura) {
		this.altura = altura;
	}

	public static String getGenero() {
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

	public static byte getVida() {
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

	public static Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}
	
	public void recibirAtaque(int fuerzaAtaque) {
        vida -= fuerzaAtaque;
    }

    public boolean estaDerrotado() {
        return vida <= 0;
    }
	

	@Override
	public String toString() {
		return "Jugador [region=" + region + ", edad=" + edad + ", altura=" + altura + ", genero=" + genero
				+ ", elemento=" + elemento + ", vida=" + vida + ", talento=" + talento + ", arma=" + arma + "]";
	}
	
	
	
	
}

package clases;

import java.sql.SQLException;
import java.util.HashMap;

import util.DAO;

public class Usuario {

	private String password;
	private String email;
	private ElementoConNombre nombre;
	
	public Usuario (String email, String password, String nombre) throws SQLException {
		super();
		HashMap<String,Object> cols=new HashMap<String,Object>();
		cols.put("email", email);
		cols.put("nombre", nombre);
		cols.put("password", password);
		DAO.insertar("usuario",cols); 
		
	}

	public Usuario(String password, String email, ElementoConNombre nombre) {
		super();
		this.password = password;
		this.email = email;
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ElementoConNombre getNombre() {
		return nombre;
	}

	public void setNombre(ElementoConNombre nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Usuario [password=" + password + ", email=" + email + ", nombre=" + nombre + "]";
	}
	

	
	
}

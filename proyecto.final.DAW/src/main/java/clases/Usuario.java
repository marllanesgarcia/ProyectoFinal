package clases;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

import exceptions.ClienteNoExisteException;
import exceptions.ContaseñaInvalidaException;
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

	public Usuario(String email, String password) throws SQLException, ClienteNoExisteException, ContaseñaInvalidaException {
	super();
	LinkedHashSet columnasSacar=new LinkedHashSet<String>();
	columnasSacar.add("email");
	columnasSacar.add("password");
	columnasSacar.add("nombre");
	HashMap<String,Object> restricciones=new HashMap<String,Object>();
	restricciones.put("email", email);
	ArrayList<Object> resultado= DAO.consultar("usuario",columnasSacar,restricciones);
	if(resultado.isEmpty()) {
		throw new ClienteNoExisteException("El Usuario no existe");
	}else {
		String passwordAlmacenada=(String)resultado.get(1);
		if(passwordAlmacenada.equals(password)) {
			this.email=(String)resultado.get(0);
			this.nombre=(ElementoConNombre)resultado.get(2);
		}else {
			throw new ContaseñaInvalidaException("ERROR: la contraseña esta mal.");
		}
	}
	
	this.email = email;
	this.password = password;
	this.setNombre(nombre);
		
	}
	
	public Usuario(String password, String email, ElementoConNombre nombre) {
		super();
		this.password = password;
		this.email = email;
		this.nombre = nombre;
	}

	public void setEmail(String email) throws SQLException {
		HashMap<String,Object> emailModificar=new HashMap<String,Object>();
		emailModificar.put("email", email);
		HashMap<String,Object> restricciones=new HashMap<String,Object>();
		restricciones.put("email", email);
		DAO.actualizar("usuario", emailModificar, restricciones);
		this.email = email;
	}

	public void setNombre(String nombre) throws SQLException {
	HashMap<String,Object> nombreModificar=new HashMap<String,Object>();
	nombreModificar.put("nombre", nombre);
	HashMap<String,Object> restricciones=new HashMap<String,Object>();
	restricciones.put("email", email);
	DAO.actualizar("usuario", nombreModificar, restricciones);
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

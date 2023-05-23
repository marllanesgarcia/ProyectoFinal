package clases;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

import exceptions.ClienteNoExisteException;
import exceptions.ContaseñaInvalidaException;
import util.DAO;

public class Usuario extends ElementoConNombre {

	private String password;
	private String email;
	

	public Usuario(String nombre, String password, String email) {
		super(nombre);
		this.password = password;
		this.email = email;
	}

	public Usuario(String nombre, String password) throws SQLException, ClienteNoExisteException, ContaseñaInvalidaException {
	super(nombre);
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
		}else {
			throw new ContaseñaInvalidaException("ERROR: la contraseña esta mal.");
		}
	}
	
		
	}

	public void setEmail(String email) throws SQLException {
		HashMap<String,Object> emailModificar=new HashMap<String,Object>();
		emailModificar.put("email", email);
		HashMap<String,Object> restricciones=new HashMap<String,Object>();
		restricciones.put("email", email);
		DAO.actualizar("usuario", emailModificar, restricciones);
		this.email = email;
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

	@Override
	public String toString() {
		return "Usuario [password=" + password + ", email=" + email + "]";
	}

	
	
}

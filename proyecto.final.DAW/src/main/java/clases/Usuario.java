package clases;

public class Usuario {

	private String contraseña;
	private String correo;
	private ElementoConNombre nombre;
	
	public Usuario(String contraseña, String correo, ElementoConNombre nombre) {
		super();
		this.contraseña = contraseña;
		this.correo = correo;
		this.nombre = nombre;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public ElementoConNombre getNombre() {
		return nombre;
	}

	public void setNombre(ElementoConNombre nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Usuario [contraseña=" + contraseña + ", correo=" + correo + ", nombre=" + nombre + "]";
	}
	
	
}

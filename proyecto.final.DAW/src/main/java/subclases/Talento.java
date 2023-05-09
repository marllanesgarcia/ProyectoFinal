package subclases;

public class Talento {

	private String habilidadEspecial;
	private byte duracion;
	
	public Talento(String habilidadEspecial, byte duracion) {
		super();
		this.habilidadEspecial = habilidadEspecial;
		this.duracion = duracion;
	}

	public String getHabilidadEspecial() {
		return habilidadEspecial;
	}

	public void setHabilidadEspecial(String habilidadEspecial) {
		this.habilidadEspecial = habilidadEspecial;
	}

	public byte getDuracion() {
		return duracion;
	}

	public void setDuracion(byte duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Talento [habilidadEspecial=" + habilidadEspecial + ", duracion=" + duracion + "]";
	}
	
	
	
}

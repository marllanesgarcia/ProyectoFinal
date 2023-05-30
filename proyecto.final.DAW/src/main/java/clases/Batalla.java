package clases;

public class Batalla {

	private String turno;
	private int duracion;
	
	public Batalla(String turno, int duracion) {
		super();
		this.turno = turno;
		this.duracion = duracion;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	
	

	@Override
	public String toString() {
		return "Batalla [turno=" + turno + ", duracion=" + duracion + "]";
	}
	
	
	
}

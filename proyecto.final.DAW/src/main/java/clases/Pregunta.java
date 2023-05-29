package clases;

import java.util.ArrayList;

public class Pregunta {
	
	private String descripcion;
    private ArrayList<Respuesta> respuestasPosibles;
    
    // Constructor
    public Pregunta(String descripcion, ArrayList<Respuesta> respuestasPosibles) {
        this.descripcion = descripcion;
        this.respuestasPosibles = respuestasPosibles;
    }
    
    // Getters y Setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Respuesta> getRespuestasPosibles() {
        return respuestasPosibles;
    }

    public void setRespuestasPosibles(ArrayList<Respuesta> respuestasPosibles) {
        this.respuestasPosibles = respuestasPosibles;
    }

	@Override
	public String toString() {
		return "Pregunta [descripcion=" + descripcion + ", respuestasPosibles=" + respuestasPosibles + "]";
	}
    
}

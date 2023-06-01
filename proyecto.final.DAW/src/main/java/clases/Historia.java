package clases;

import java.util.ArrayList;

public class Historia {

	private String descripcion;
    private ArrayList<Pregunta> pregunta;
    private String titulo;
    
    public Historia(String descripcion, ArrayList<Pregunta> preguntas, String titulo) {
        this.descripcion = descripcion;
        this.pregunta = preguntas;
        this.titulo = titulo;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Pregunta> getPreguntas() {
        return pregunta;
    }

    public void setPregunta(ArrayList<Pregunta> preguntas) {
        this.pregunta = preguntas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

	@Override
	public String toString() {
		return "Historia [descripcion=" + descripcion + ", pregunta=" + pregunta + ", titulo=" + titulo + "]";
	}
    
}

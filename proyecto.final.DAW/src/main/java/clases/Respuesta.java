package clases;

import java.util.ArrayList;

public class Respuesta extends Pregunta {
    private boolean esCorrecta;
    
    // Constructor
    public Respuesta(String descripcion, boolean esCorrecta) {
        super("", null); // Llamada al constructor de la clase base sin argumentos
        this.setDescripcion(descripcion);
        this.esCorrecta = esCorrecta;
    }
    
    // Getter y Setter
    public boolean esCorrecta() {
        return esCorrecta;
    }

    public void setEsCorrecta(boolean esCorrecta) {
        this.esCorrecta = esCorrecta;
    }

	@Override
	public String toString() {
		return "Respuesta [esCorrecta=" + esCorrecta + "]";
	}
    
    
    
}

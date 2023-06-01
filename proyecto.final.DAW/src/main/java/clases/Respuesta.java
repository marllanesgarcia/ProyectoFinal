package clases;

import java.util.ArrayList;

public class Respuesta extends Pregunta {
    private boolean esCorrecta;
    
    public Respuesta(String descripcion, boolean esCorrecta) {
        super("", null); 
        this.setDescripcion(descripcion);
        this.esCorrecta = esCorrecta;
    }
    
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

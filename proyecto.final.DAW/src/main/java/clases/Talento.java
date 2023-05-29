package clases;

public class Talento {
    
	private String habilidadEspecial;
    private byte duracion;
    
    // Constructor
    public Talento(String habilidadEspecial, byte duracion) {
        this.habilidadEspecial = habilidadEspecial;
        this.duracion = duracion;
    }
    
    // Getters y Setters
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
}

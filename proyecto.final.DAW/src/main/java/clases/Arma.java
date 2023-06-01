package clases;

public class Arma extends ElementoConNombre {

	private ElementoConNombre nombre;
	private int fuerza;
    private int peso;
    
    // Constructor
	public Arma(String nombre, int fuerza, int peso) {
		super(nombre);
		this.fuerza = fuerza;
		this.peso = peso;
	}
    
   
	// Getters y Setters
    public int getFuerza() {
        return fuerza;
    }


	public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(byte peso) {
        this.peso = peso;
    }


    @Override
    public String toString() {
        return getNombre();
    }

    
    
}
/*

-- Tabla Arma
	CREATE TABLE Arma (
    id INT PRIMARY KEY,
    nombre String,
    fuerza INT,
    peso TINYINT
);

-- Tabla Talento
CREATE TABLE Talento (
    id INT PRIMARY KEY,
    habilidadEspecial VARCHAR(255),
    duracion TINYINT
);

-- Tabla Respuesta
CREATE TABLE Respuesta (
    id INT PRIMARY KEY,
    descripcion VARCHAR(255),
    esCorrecta BOOLEAN,
    pregunta_id INT,
    FOREIGN KEY (pregunta_id) REFERENCES Pregunta(id)
);

-- Tabla Pregunta
CREATE TABLE Pregunta (
    id INT PRIMARY KEY,
    descripcion VARCHAR(255)
);

-- Tabla Historia
CREATE TABLE Historia (
    id INT PRIMARY KEY,
    descripcion VARCHAR(255),
    titulo VARCHAR(255)
);


*/
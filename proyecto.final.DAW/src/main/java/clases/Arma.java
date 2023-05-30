package clases;

public class Arma extends ElementoConNombre {
    /*
     * una espada corta con fuerza 
     * 100 y peso 20kg, una chancla con fuerza 10 y peso 1kg, 
     * un bazooka con fuerza 800 y peso 7kg y escupitajo con fuerza 50 y peso 0kg
     * 
     */
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
package clases;

public class Arma {
    
	private int fuerza;
    private byte peso;
    
    // Constructor
    public Arma(int fuerza, byte peso) {
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

    public byte getPeso() {
        return peso;
    }

    public void setPeso(byte peso) {
        this.peso = peso;
    }
}
/*

-- Tabla Arma
CREATE TABLE Arma (
    id INT PRIMARY KEY,
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
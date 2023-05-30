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
	/*
	 public void iniciarBatalla() {
	        cargarEnemigos();
	        usuario = new Personaje("Usuario", 100, 10);
	        enemigo = seleccionarEnemigoAleatorio();
	        lblResultado.setText("¡Batalla iniciada! " + usuario.getNombre() + " vs " + enemigo.getNombre());
	        btnAtacar.setEnabled(true);
	    }

	    private void realizarAtaque() {
	        enemigo.recibirAtaque(usuario.getFuerza());

	        if (enemigo.estaDerrotado()) {
	            lblResultado.setText("¡Has ganado la batalla!");
	            btnAtacar.setEnabled(false);
	            // Cambiar a PantallaPregunta2 (código no proporcionado)
	        } else {
	            usuario.recibirAtaque(enemigo.getFuerza());

	            if (usuario.estaDerrotado()) {
	                lblResultado.setText("¡Has sido derrotado!");
	                btnAtacar.setEnabled(false);
	                // Cambiar a PantallaPregunta2 (código no proporcionado)
	            } else {
	                lblResultado.setText(usuario.getNombre() + " ha atacado a " + enemigo.getNombre() + ". " +
	                        enemigo.getNombre() + " ha contraatacado a " + usuario.getNombre() + ".");
	            }
	        }
	    }

	    private void cargarEnemigos() {
	        enemigos = new ArrayList<>();
	        enemigos.add(new Enemigo("Enemigo 1", 50, 5));
	        enemigos.add(new Enemigo("Enemigo 2", 70, 7));
	        enemigos.add(new Enemigo("Enemigo 3", 90, 9));
	    }

	    private Enemigo seleccionarEnemigoAleatorio() {
	        int indice = (int) (Math.random() * enemigos.size());
	        return enemigos.get(indice);
	    }*/
	
	
	@Override
	public String toString() {
		return "Batalla [turno=" + turno + ", duracion=" + duracion + "]";
	}
	
	
	
}

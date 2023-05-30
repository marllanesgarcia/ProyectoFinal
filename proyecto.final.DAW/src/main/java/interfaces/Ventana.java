package interfaces;

import javax.swing.JFrame;

import clases.Jugador;

public class Ventana extends JFrame{
	
	protected Jugador jugador;

	public Ventana() {
		this.setSize(600, 500);
		this.setTitle("¡Bienvenido a Stixer Naver!");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setContentPane(new PantallaLogin(this));
		this.setVisible(true); 
	}
	
	
	public void cambiarAPantalla(Class<?> clase) { 
		
		this.getContentPane().setVisible(false);
		if(clase.equals(PantallaRegistro.class)) {
			this.setContentPane(new PantallaRegistro(this));
		}
		if(clase.equals(PantallaLogin.class)) {
			this.setContentPane(new PantallaLogin(this));
		}
		if(clase.equals(PantallaPersonaje.class)) {
			this.setContentPane(new PantallaPersonaje(this));
		}
		if(clase.equals(PantallaHistoria.class)) {
			this.setContentPane(new PantallaHistoria(this));
		}
		if(clase.equals(PantallaPregunta1.class)) {
			this.setContentPane(new PantallaPregunta1(this));
		}
		if(clase.equals(PantallaPregunta2.class)) {
			this.setContentPane(new PantallaPregunta2(this));
		}
		if(clase.equals(PantallaPregunta3.class)) {
			this.setContentPane(new PantallaPregunta3(this));
		}
		if(clase.equals(PantallaPregunta3.class)) {
			this.setContentPane(new PantallaPregunta4(this));
		}
		if(clase.equals(PantallaPregunta3.class)) {
			this.setContentPane(new PantallaPregunta5(this));
		}
		if(clase.equals(PantallaCuidado.class)) {
			this.setContentPane(new PantallaCuidado(this));
		}
		if(clase.equals(PantallaBatalla.class)) {
			this.setContentPane(new PantallaBatalla(this));
		}
		this.getContentPane().setVisible(true);
	}
	
}

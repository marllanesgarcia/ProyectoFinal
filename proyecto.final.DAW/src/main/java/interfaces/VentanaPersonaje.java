package interfaces;

import javax.swing.JFrame;

public class VentanaPersonaje extends JFrame{

	public VentanaPersonaje() {
		this.setSize(800, 500);
		this.setTitle("¡Bienvenido a Stixer Naver!");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setContentPane(new PantallaPersonaje(this));
		this.setVisible(true); 
	}
	
}

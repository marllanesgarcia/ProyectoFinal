package interfaces;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

public class VentanaPersonaje extends JFrame{
	
	public VentanaPersonaje() {
		this.setSize(800, 501);
		this.setTitle("¡Bienvenido a Stixer Naver!");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setContentPane(new PantallaPersonaje(this));
		this.setVisible(true); 
	}
	
	
	
}

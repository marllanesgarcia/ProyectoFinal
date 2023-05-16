package interfaces;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;

public class PantallaPersonaje extends JPanel{

	
	private VentanaPersonaje ventana;
	
	public PantallaPersonaje(VentanaPersonaje v) {
		setBackground(new Color(224, 255, 255));
		this.ventana=v;
		setLayout(null);
		
		JButton botonNext = new JButton("Siguiente");
		botonNext.setFont(new Font("Monotype Corsiva", Font.BOLD, 18));
		botonNext.setBounds(555, 456, 135, 34);
		add(botonNext);
		
	}
}

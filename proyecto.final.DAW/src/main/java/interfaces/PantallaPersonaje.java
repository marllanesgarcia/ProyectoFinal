package interfaces;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

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
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBorder(new LineBorder(new Color(0, 0, 255), 2, true));
		panel.setBackground(new Color(100, 149, 237));
		panel.setBounds(190, 23, 333, 37);
		add(panel);
		
		JLabel titulo = new JLabel("¡Elige a tu personaje!");
		titulo.setForeground(new Color(255, 255, 255));
		titulo.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 19));
		panel.add(titulo);
		
	}
}

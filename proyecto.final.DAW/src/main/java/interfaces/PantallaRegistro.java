package interfaces;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JMenuBar;
import javax.swing.JEditorPane;
import javax.swing.JToggleButton;
import javax.swing.border.LineBorder;

public class PantallaRegistro extends JPanel{

	
	
	private Ventana ventana;
	
	public PantallaRegistro (Ventana v) {
		setBorder(new MatteBorder(3, 3, 3, 3, (Color) SystemColor.controlDkShadow));
		this.ventana=v;
		setLayout(null);
		
		JPanel background = new JPanel();
		background.setBorder(new LineBorder(SystemColor.textInactiveText, 3, true));
		background.setBounds(0, 0, 601, 500);
		add(background);
		background.setLayout(null);
		
		JButton botonStart = new JButton("New button");
		botonStart.setBounds(255, 451, 89, 23);
		background.add(botonStart);
	}
}

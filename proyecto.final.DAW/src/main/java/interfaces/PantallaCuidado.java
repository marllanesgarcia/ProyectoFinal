package interfaces;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class PantallaCuidado extends JPanel{

	private Ventana ventana;
	
	public PantallaCuidado(Ventana v) {
		
		this.ventana=v;
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setBorder(new LineBorder(new Color(178, 34, 34), 3, true));
		panel.setBackground(new Color(250, 235, 215));
		panel.setBounds(275, 11, 260, 37);
		add(panel);
		
		JLabel lblCagaste = new JLabel("Cagaste. . . ¡A luchar!");
		lblCagaste.setForeground(new Color(139, 0, 0));
		lblCagaste.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 19));
		lblCagaste.setBackground(new Color(139, 0, 0));
		panel.add(lblCagaste);
		this.ventana.setSize(820,510);
		
		
		
		
		
		
		
		
		
		
		
	}
}

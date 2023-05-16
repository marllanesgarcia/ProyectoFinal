package interfaces;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JToggleButton;
import javax.swing.ImageIcon;

public class PantallaUsuario extends JFrame{

	private Ventana ventana;
	
	public PantallaUsuario (Ventana v) {
		this.ventana=v;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{92, 108, 189, 60, -103, 0};
		gridBagLayout.rowHeights = new int[]{53, 75, 166, 52, -36, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JPanel cuadro = new JPanel();
		cuadro.setBackground(new Color(216, 191, 216));
		GridBagConstraints gbc_cuadro = new GridBagConstraints();
		gbc_cuadro.insets = new Insets(0, 0, 5, 5);
		gbc_cuadro.fill = GridBagConstraints.HORIZONTAL;
		gbc_cuadro.gridx = 2;
		gbc_cuadro.gridy = 0;
		getContentPane().add(cuadro, gbc_cuadro);
		
		JLabel elegir = new JLabel("Elige tu personaje");
		elegir.setFont(new Font("Javanese Text", Font.BOLD | Font.ITALIC, 17));
		cuadro.add(elegir);
		
		JLabel hombre = new JLabel("");
		hombre.setIcon(new ImageIcon(PantallaUsuario.class.getResource("/imagenes/modificado aether.png")));
		GridBagConstraints gbc_hombre = new GridBagConstraints();
		gbc_hombre.insets = new Insets(0, 0, 5, 5);
		gbc_hombre.gridx = 1;
		gbc_hombre.gridy = 2;
		getContentPane().add(hombre, gbc_hombre);
		
		JLabel Mujer = new JLabel("");
		Mujer.setIcon(new ImageIcon(PantallaUsuario.class.getResource("/imagenes/Lumine2.png")));
		GridBagConstraints gbc_Mujer = new GridBagConstraints();
		gbc_Mujer.insets = new Insets(0, 0, 5, 5);
		gbc_Mujer.gridx = 3;
		gbc_Mujer.gridy = 2;
		getContentPane().add(Mujer, gbc_Mujer);
		
		JSplitPane splitPane = new JSplitPane();
		GridBagConstraints gbc_splitPane = new GridBagConstraints();
		gbc_splitPane.insets = new Insets(0, 0, 5, 5);
		gbc_splitPane.fill = GridBagConstraints.BOTH;
		gbc_splitPane.gridx = 2;
		gbc_splitPane.gridy = 3;
		getContentPane().add(splitPane, gbc_splitPane);
		
		JButton next = new JButton("Siguiente");
		next.setFont(new Font("DejaVu Serif", Font.BOLD, 14));
		next.setBackground(new Color(147, 112, 219));
		GridBagConstraints gbc_next = new GridBagConstraints();
		gbc_next.gridx = 4;
		gbc_next.gridy = 4;
		getContentPane().add(next, gbc_next);
		
	}
	
	
	
}

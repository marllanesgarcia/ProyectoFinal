package interfaces;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

public class PantallaPersonaje extends JPanel{

	
	private VentanaPersonaje ventana;
	private JTextField textField;
	
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PantallaPersonaje.class.getResource("/imagenes/pensando2.png")));
		lblNewLabel.setBounds(0, 361, 195, 140);
		add(lblNewLabel);
		
		JButton botonChico = new JButton("Aether");
		botonChico.setFont(new Font("DejaVu Sans Condensed", Font.ITALIC, 13));
		botonChico.setBackground(new Color(100, 149, 237));
		botonChico.setBounds(20, 240, 89, 23);
		add(botonChico);
		
		JButton btnLumine = new JButton("Lumine");
		btnLumine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLumine.setFont(new Font("DejaVu Sans Condensed", Font.ITALIC, 13));
		btnLumine.setBackground(new Color(100, 149, 237));
		btnLumine.setBounds(144, 240, 89, 23);
		add(btnLumine);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(PantallaPersonaje.class.getResource("/imagenes/modificado aether.png")));
		lblNewLabel_1.setBounds(10, 83, 118, 157);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(PantallaPersonaje.class.getResource("/imagenes/Lumine2.png")));
		lblNewLabel_2.setBounds(134, 77, 135, 163);
		add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("DejaVu Sans Condensed", Font.ITALIC, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Asia", "África", "América del Norte", "América del Sur", "Antártida", "Europa", "Oceanía"}));
		comboBox.setBounds(306, 130, 134, 22);
		add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(527, 132, 118, 20);
		add(textField);
		textField.setColumns(10);
		
	}
}

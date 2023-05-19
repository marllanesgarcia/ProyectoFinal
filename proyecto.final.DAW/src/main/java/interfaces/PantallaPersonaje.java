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
	private JTextField datosEdad;
	private JTextField textoRegion;
	private JTextField txtEdad;
	private JTextField txtAltura;
	private JTextField txtElemento;
	private JTextField txtVida;
	private JTextField txtTalento;
	private JTextField datosAltura;
	private JTextField datosVida;
	private JTextField textoArma;
	
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
		comboBox.setBounds(306, 130, 128, 22);
		add(comboBox);
		
		datosEdad = new JTextField();
		datosEdad.setBounds(517, 132, 128, 20);
		add(datosEdad);
		datosEdad.setColumns(10);
		
		JPanel cuadroUsuario = new JPanel();
		cuadroUsuario.setBackground(new Color(230, 230, 250));
		cuadroUsuario.setBounds(306, 83, 128, 35);
		add(cuadroUsuario);
		
		textoRegion = new JTextField();
		textoRegion.setText("     Región");
		textoRegion.setFont(new Font("MV Boli", Font.PLAIN, 11));
		textoRegion.setEditable(false);
		textoRegion.setColumns(10);
		cuadroUsuario.add(textoRegion);
		
		JPanel cuadroUsuario_1 = new JPanel();
		cuadroUsuario_1.setBackground(new Color(230, 230, 250));
		cuadroUsuario_1.setBounds(517, 83, 128, 35);
		add(cuadroUsuario_1);
		
		txtEdad = new JTextField();
		txtEdad.setText("     Edad");
		txtEdad.setFont(new Font("MV Boli", Font.PLAIN, 11));
		txtEdad.setEditable(false);
		txtEdad.setColumns(10);
		cuadroUsuario_1.add(txtEdad);
		
		JPanel cuadroUsuario_2 = new JPanel();
		cuadroUsuario_2.setBackground(new Color(230, 230, 250));
		cuadroUsuario_2.setBounds(306, 175, 128, 35);
		add(cuadroUsuario_2);
		
		txtAltura = new JTextField();
		txtAltura.setText("     Altura");
		txtAltura.setFont(new Font("MV Boli", Font.PLAIN, 11));
		txtAltura.setEditable(false);
		txtAltura.setColumns(10);
		cuadroUsuario_2.add(txtAltura);
		
		JPanel cuadroUsuario_2_1 = new JPanel();
		cuadroUsuario_2_1.setBackground(new Color(230, 230, 250));
		cuadroUsuario_2_1.setBounds(517, 175, 128, 35);
		add(cuadroUsuario_2_1);
		
		txtElemento = new JTextField();
		txtElemento.setText("    Elemento");
		txtElemento.setFont(new Font("MV Boli", Font.PLAIN, 11));
		txtElemento.setEditable(false);
		txtElemento.setColumns(10);
		cuadroUsuario_2_1.add(txtElemento);
		
		JPanel cuadroUsuario_2_1_1 = new JPanel();
		cuadroUsuario_2_1_1.setBackground(new Color(230, 230, 250));
		cuadroUsuario_2_1_1.setBounds(306, 262, 128, 35);
		add(cuadroUsuario_2_1_1);
		
		txtVida = new JTextField();
		txtVida.setText("       Vida");
		txtVida.setFont(new Font("MV Boli", Font.PLAIN, 11));
		txtVida.setEditable(false);
		txtVida.setColumns(10);
		cuadroUsuario_2_1_1.add(txtVida);
		
		JPanel cuadroUsuario_2_1_1_1 = new JPanel();
		cuadroUsuario_2_1_1_1.setBackground(new Color(230, 230, 250));
		cuadroUsuario_2_1_1_1.setBounds(517, 262, 128, 35);
		add(cuadroUsuario_2_1_1_1);
		
		txtTalento = new JTextField();
		txtTalento.setText("    Talento");
		txtTalento.setFont(new Font("MV Boli", Font.PLAIN, 11));
		txtTalento.setEditable(false);
		txtTalento.setColumns(10);
		cuadroUsuario_2_1_1_1.add(txtTalento);
		
		JComboBox datosElemento = new JComboBox();
		datosElemento.setModel(new DefaultComboBoxModel(new String[] {"AIRE", "HIELO", "ELECTRO", "AGUA", "PLANTA", "ROCA"}));
		datosElemento.setFont(new Font("DejaVu Sans Condensed", Font.ITALIC, 13));
		datosElemento.setBounds(527, 221, 107, 22);
		add(datosElemento);
		
		datosAltura = new JTextField();
		datosAltura.setColumns(10);
		datosAltura.setBounds(306, 221, 128, 20);
		add(datosAltura);
		
		datosVida = new JTextField();
		datosVida.setColumns(10);
		datosVida.setBounds(306, 308, 128, 20);
		add(datosVida);
		
		JPanel cuadroUsuario_2_1_1_1_1 = new JPanel();
		cuadroUsuario_2_1_1_1_1.setBackground(new Color(230, 230, 250));
		cuadroUsuario_2_1_1_1_1.setBounds(409, 353, 128, 35);
		add(cuadroUsuario_2_1_1_1_1);
		
		textoArma = new JTextField();
		textoArma.setText("      Arma");
		textoArma.setFont(new Font("MV Boli", Font.PLAIN, 11));
		textoArma.setEditable(false);
		textoArma.setColumns(10);
		cuadroUsuario_2_1_1_1_1.add(textoArma);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("DejaVu Sans Condensed", Font.ITALIC, 13));
		comboBox_1.setBounds(517, 307, 128, 22);
		add(comboBox_1);
		
		JComboBox datosArma = new JComboBox();
		datosArma.setFont(new Font("DejaVu Sans Condensed", Font.ITALIC, 13));
		datosArma.setBounds(409, 403, 128, 22);
		add(datosArma);
		
		JLabel fondoPJ = new JLabel("New label");
		fondoPJ.setIcon(new ImageIcon(PantallaPersonaje.class.getResource("/imagenes/fondoPJ.jpg")));
		fondoPJ.setBounds(0, 0, 700, 501);
		add(fondoPJ);
		
	}
}

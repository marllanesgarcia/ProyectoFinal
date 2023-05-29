package interfaces;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.border.LineBorder;

import enums.Elemento;
import util.DAO;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;

public class PantallaPersonaje extends JPanel{

	
	private Ventana ventana;
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
	
	public PantallaPersonaje(Ventana v) {
		setBackground(new Color(224, 255, 255));
		this.ventana=v;
		this.ventana.setSize(700,504);
		setLayout(null);
		
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
		
		// BOTON PARA GÉNERO MASCULINO O FEMENINO
		
		JButton botonChico = new JButton("Aether");
		buttonGroup.add(botonChico);
	
		botonChico.setFont(new Font("DejaVu Sans Condensed", Font.ITALIC, 13));
		botonChico.setBackground(new Color(100, 149, 237));
		botonChico.setBounds(20, 240, 89, 23);
		add(botonChico);
		
		JButton btnLumine = new JButton("Lumine");
		buttonGroup.add(btnLumine);
	
		btnLumine.setFont(new Font("DejaVu Sans Condensed", Font.ITALIC, 13));
		btnLumine.setBackground(new Color(100, 149, 237));
		btnLumine.setBounds(144, 240, 89, 23);
		add(btnLumine);
		
		// IMAGENES BOTONES GENERO 
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(PantallaPersonaje.class.getResource("/imagenes/modificado aether.png")));
		lblNewLabel_1.setBounds(10, 83, 118, 157);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(PantallaPersonaje.class.getResource("/imagenes/Lumine2.png")));
		lblNewLabel_2.setBounds(134, 77, 135, 163);
		add(lblNewLabel_2);
		
		// BOTON PARA ELEGIR REGION
		 
		final JComboBox comboBox = new JComboBox();
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
		
		final JComboBox datosElemento = new JComboBox();
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
		
		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Cubierta Protectora", "Llamas Fervientes", "Aguas medicinales", "Vientos impetuosos"}));
		comboBox_1.setFont(new Font("DejaVu Sans Condensed", Font.ITALIC, 13));
		comboBox_1.setBounds(517, 308, 143, 22);
		add(comboBox_1);
		
		final JComboBox datosArma = new JComboBox();
		datosArma.setModel(new DefaultComboBoxModel(new String[] {"espada corta", "bazooka", "escupitajo", "chancla"}));
		datosArma.setFont(new Font("DejaVu Sans Condensed", Font.ITALIC, 13));
		datosArma.setBounds(409, 403, 128, 22);
		add(datosArma);
		
		JButton botonNext = new JButton("Siguiente");
		botonNext.setFont(new Font("Monotype Corsiva", Font.BOLD, 18));
		botonNext.setBounds(555, 456, 135, 34);
		botonNext.addMouseListener(new MouseAdapter() {
			@Override
			
			public void mouseClicked(MouseEvent e) {
				String region = comboBox.getSelectedItem().toString();
				int edad = Integer.parseInt(datosEdad.getText());
				int altura = Integer.parseInt(datosAltura.getText());
				String genero = buttonGroup.getSelection().getActionCommand();
				String elemento = datosElemento.getSelectedItem().toString();
				int vida = Integer.parseInt(datosVida.getText());
				String talento = comboBox_1.getSelectedItem().toString();
				String arma = datosArma.getSelectedItem().toString();
                System.out.println(region + " : " + edad + " : " + altura + " : " + 
				genero + " : " + elemento + " : " + vida + " : " + talento + " : " +
                		arma);
                
                try {
                	HashMap<String, Object> columnas = new HashMap<>();
                	columnas.put("region", region);
                	columnas.put("edad", edad);
                	columnas.put("altura", altura);
                	columnas.put("genero", genero);
                	columnas.put("elemento", elemento);
                	columnas.put("vida", vida);
                	columnas.put("talento", talento);
                	columnas.put("arma", arma);
                	try {
                	    DAO.insertar("Jugador", columnas);
                	    JOptionPane.showMessageDialog(ventana, "Registrado Correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                	    ventana.cambiarAPantalla(PantallaPregunta1.class);
                	} catch (SQLException e1) {
                	    e1.printStackTrace();
                	    System.out.println("Noup, no vale, hazlo de nuevo");
                	    ventana.cambiarAPantalla(PantallaPersonaje.class);
                	}
				} catch (HeadlessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                ventana.cambiarAPantalla(PantallaPersonaje.class);
            }
			
			
			
			
		/*	public void mouseClicked(MouseEvent e) {
				
				String region = comboBox.getSelectedItem().toString();
				int edad = Integer.parseInt(datosEdad.getText());
				int altura = Integer.parseInt(datosAltura.getText());
				String genero = buttonGroup.getSelection().getActionCommand();
				String elemento = datosElemento.getSelectedItem().toString();
				int vida = Integer.parseInt(datosVida.getText());
				String talento = comboBox_1.getSelectedItem().toString();
				String arma = datosArma.getSelectedItem().toString();

				// Realizando la inserción en la tabla jugador
				String sql = "INSERT INTO jugador (region, edad, altura, genero, elemento, vida, talento, arma) " +
				             "VALUES ('" + region + "', " + edad + ", " + altura + ", '" + genero + "', '" + 
						elemento + "', " + vida + ", '" + talento + "', '" + arma + "')";


				ventana.cambiarAPantalla(PantallaPregunta1.class);
			}*/
		});
		add(botonNext);
		
		
	}
	
	
	private final ButtonGroup buttonGroup = new ButtonGroup();
}

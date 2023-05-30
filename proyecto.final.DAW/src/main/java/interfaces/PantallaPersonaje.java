package interfaces;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.border.LineBorder;

import clases.Arma;
import clases.Jugador;
import enums.Elemento;
import enums.Region;
import enums.Talento;
//import clases.ReproductorAudio;
import util.DAO;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

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
	private JComboBox datosElemento;
	private JComboBox comboBox;
	private final ButtonGroup botonGenero = new ButtonGroup();
	
	public PantallaPersonaje(Ventana v) {
		setBackground(new Color(224, 255, 255));
		this.ventana=v;
		this.ventana.setSize(710,530);
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
		
		// MUSICA
		
//		final JButton botonReproducir = new JButton("Reproducir");
//		botonReproducir.addActionListener(new ActionListener() {
//		    public void actionPerformed(ActionEvent e) {
//		        ReproductorAudio.reproducir();
//		    }
//		});
		
		// IMAGENES BOTONES GENERO 
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(PantallaPersonaje.class.getResource("/imagenes/modificado aether.png")));
		lblNewLabel_1.setBounds(10, 83, 118, 157);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(PantallaPersonaje.class.getResource("/imagenes/Lumine2.png")));
		lblNewLabel_2.setBounds(134, 77, 135, 163);
		add(lblNewLabel_2);
			 
		final JComboBox<Region> datosRegion = new JComboBox<>();
		Region[] regiones = Region.values();
		DefaultComboBoxModel<Region> modeloRegion = new DefaultComboBoxModel<>(regiones);
		datosRegion.setModel(modeloRegion);
		datosRegion.setFont(new Font("DejaVu Sans Condensed", Font.ITALIC, 13));
		datosRegion.setBounds(292, 130, 156, 22);
		add(datosRegion);
		
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
		
		final JComboBox<Elemento> datosElemento = new JComboBox<>();
		Elemento[] elementos = Elemento.values();
		DefaultComboBoxModel<Elemento> modeloElemento = new DefaultComboBoxModel<>(elementos);
		datosElemento.setModel(modeloElemento);
		datosElemento.setFont(new Font("DejaVu Sans Condensed", Font.ITALIC, 13));
		datosElemento.setBounds(501, 218, 156, 22);
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
		
		final JComboBox datosArma = new JComboBox();
		ArrayList<Arma> armas = Jugador.getTodos();
		DefaultComboBoxModel<Arma> modeloArmas = new DefaultComboBoxModel<>(armas.toArray(new Arma[0]));
		datosArma.setModel(modeloArmas);
		datosArma.setFont(new Font("DejaVu Sans Condensed", Font.ITALIC, 13));
		datosArma.setBounds(350, 399, 238, 22);
		add(datosArma);
		
		
		final JComboBox<Talento> datosTalento = new JComboBox<>();
		Talento[] talentos = Talento.values();
		DefaultComboBoxModel<Talento> modeloTalentos = new DefaultComboBoxModel<>(talentos);
		datosTalento.setModel(modeloTalentos);
		datosTalento.setFont(new Font("DejaVu Sans Condensed", Font.ITALIC, 13));
		datosTalento.setBounds(501, 308, 171, 22);
		add(datosTalento);
		
		final JRadioButton aether = new JRadioButton("Aether");
		aether.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				aether.setActionCommand("aether");
				String genero = aether.getActionCommand();

		        // Guardar la selección en la base de datos
		        HashMap<String, Object> columnas = new HashMap<>();
		        columnas.put("genero", genero);
			}
		});
		botonGenero.add(aether);
		aether.setBounds(20, 240, 109, 23);
		
		add(aether);
		
		final JRadioButton lumine = new JRadioButton("Lumine");
		lumine.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lumine.setActionCommand("lumine");
		        String genero = lumine.getActionCommand();

		        // Guardar la selección en la base de datos
		        HashMap<String, Object> columnas = new HashMap<>();
		        columnas.put("genero", genero);
			}
		});
		botonGenero.add(lumine);
		lumine.setBounds(144, 240, 109, 23);
		add(lumine);
		
		JButton botonNext = new JButton("Siguiente");
		botonNext.addMouseListener(new MouseAdapter() {			
			@Override
		    public void mouseClicked(MouseEvent e) {
	
		            try {	
		            Region region = (Region) datosRegion.getSelectedItem();
					byte edad = Byte.parseByte(datosEdad.getText());
					float altura = Float.parseFloat(datosAltura.getText());
					String genero = botonGenero.getSelection().getActionCommand();
					Elemento elemento =  (Elemento) datosElemento.getSelectedItem();
					byte vida = Byte.parseByte(datosVida.getText());
					Talento talento = (Talento) datosTalento.getSelectedItem();
					Arma arma = (Arma) datosArma.getSelectedItem();
	                System.out.println(region + " : " + edad + " : " + altura + " : " + 
					genero + " : " + elemento + " : " + vida + " : " + talento + " : " + arma);
	            	
	                   
					Jugador jugadorCreado=Jugador.jugadorNuevo(region, edad, altura, genero, elemento, vida, talento, arma);
						
	        	    JOptionPane.showMessageDialog(ventana, "Registrado Correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
	        	    ventana.cambiarAPantalla(PantallaHistoria.class);
	            	} catch (SQLException e1) {
	            	    e1.printStackTrace();
	                System.out.println("Noup, no vale, hazlo de nuevo");
	            	    ventana.cambiarAPantalla(PantallaPersonaje.class);
	            	} catch (NumberFormatException e2) {
	            	    e2.printStackTrace();
	                System.out.println("Noup, no vale, esta mal el numerito");
	            	    ventana.cambiarAPantalla(PantallaPersonaje.class);
	            	}
			
                ventana.cambiarAPantalla(PantallaHistoria.class);
            }
		});
		botonNext.setFont(new Font("Monotype Corsiva", Font.BOLD, 18));
		botonNext.setBounds(555, 456, 135, 34);
		add(botonNext);
		
		JLabel fondoPJ = new JLabel("");
		fondoPJ.setIcon(new ImageIcon(PantallaPersonaje.class.getResource("/imagenes/7.jpg")));
		fondoPJ.setBounds(0, 0, 700, 501);
		add(fondoPJ);
		

			}
	
	

	
//	private Elemento guardarElemento() {
//		Elemento elementoElegido=null;
//
//		if (datosElemento.equals("AIRE")) {
//			elementoElegido=Elemento.AIRE;
//		}
//		if (datosElemento.equals("HIELO")) {
//			elementoElegido=Elemento.HIELO;
//		}
//		if (datosElemento.equals("ELECTRO")) {
//			elementoElegido=Elemento.ELECTRO;
//		}
//		if (datosElemento.equals("AGUA")) {
//			elementoElegido=Elemento.AGUA;
//		}
//		if (datosElemento.equals("PLANTA")) {
//			elementoElegido=Elemento.PLANTA;
//		}
//		if (datosElemento.equals("ROCA")) {
//			elementoElegido=Elemento.ROCA;
//		}
//
//		return elementoElegido;
//	}
	

	
	
//	private Region guardarRegion() {
//		Region regionElegida=null;
//
//		if (comboBox.equals("Asia")) {
//			regionElegida=Region.ASIA;
//		}
//		if (comboBox.equals("África")) {
//			regionElegida=Region.AFRICA;
//		}
//		if (comboBox.equals("Anérica del Norte")) {
//			regionElegida=Region.AMERICA_DEL_NORTE;
//		}
//		if (comboBox.equals("América del Sur")) {
//			regionElegida=Region.AMERICA_DEL_SUR;
//		}
//		if (comboBox.equals("Antártida")) {
//			regionElegida=Region.ANTARTIDA;
//		}
//		if (comboBox.equals("Europa")) {
//			regionElegida=Region.EUROPA;
//		}
//		if (comboBox.equals("Oceanía")) {
//			regionElegida=Region.OCEANIA;
//		}
//
//		return regionElegida;
//	}
	


//	private Talento guardarTalento() {
//		Talento talentoElegid0=null;
//
//		if (comboBox.equals("Cubierta Protectora")) {
//			talentoElegid0=Talento.CUBIERTA_PROTECTORA;
//		}
//		if (comboBox.equals("Llamas Fervientes")) {
//			talentoElegid0=Talento.LLAMAS_FERVIENTES;
//		}
//		if (comboBox.equals("Aguas medicinales")) {
//			talentoElegid0=Talento.AGUAS_MEDICIONALES;
//		}
//		if (comboBox.equals("Vientos impetuosos")) {
//			talentoElegid0=Talento.VIENTOS_IMPETUOSOS;
//		}
//
//		return talentoElegid0;
//	}


	
}

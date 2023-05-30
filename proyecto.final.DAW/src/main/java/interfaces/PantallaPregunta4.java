package interfaces;

import javax.swing.JPanel;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

import java.awt.Color;
import javax.swing.border.LineBorder;

import clases.ReproductorAudio;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import javax.swing.JScrollPane;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.List;
import javax.swing.ImageIcon;

public class PantallaPregunta4 extends JPanel{

	private Ventana ventana;
	private JTextField tituloPregunta;
	private JTextField pregunta2;
	private final ButtonGroup botonesRespuesta = new ButtonGroup();
	

	public PantallaPregunta4(Ventana v) {
		setBackground(new Color(216, 191, 216));

		this.ventana=v;
		this.ventana.setSize(800,508);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(291, 23, 224, 37);
		panel.setForeground(Color.BLACK);
		panel.setBorder(new LineBorder(new Color(128, 0, 128), 3, true));
		panel.setBackground(new Color(255, 228, 225));
		add(panel);
		
		JLabel lblempiezaElJuego = new JLabel("¡Siguiente Acertijo!");
		lblempiezaElJuego.setBackground(new Color(128, 0, 128));
		lblempiezaElJuego.setForeground(new Color(128, 0, 128));
		lblempiezaElJuego.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 19));
		panel.add(lblempiezaElJuego);
		
		// MUSICA
		
				final JButton botonReproducir = new JButton("Reproducir");
				botonReproducir.addActionListener(new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				        ReproductorAudio.reproducirPreguntas();
				    }
				});
		
		JScrollPane preguntaUno = new JScrollPane();
		preguntaUno.setToolTipText("");
		preguntaUno.setBounds(89, 71, 639, 155);
		add(preguntaUno);
		
		tituloPregunta = new JTextField();
		tituloPregunta.setEditable(false);
		tituloPregunta.setFont(new Font("MS PGothic", Font.ITALIC, 16));
		tituloPregunta.setText("CUARTA PREGUNTA: Elige para seguir con la aventura. Piensa bien la respuesta (!!!).");
		preguntaUno.setColumnHeaderView(tituloPregunta);
		tituloPregunta.setColumns(10);
		
		JTextArea txtrEnUnVasto = new JTextArea();
		txtrEnUnVasto.setEditable(false);
		txtrEnUnVasto.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		txtrEnUnVasto.setText("En un remoto rincón de Teyvat, existía un antiguo templo oculto \r\nconocido como \"El Santuario de los Sueños\". Se decía que aquellos \r\nque ingresaban al santuario eran transportados a un reino de \r\nensueño donde sus deseos más profundos se hacían realidad. \r\nLos rumores sobre el poder del santuario se extendieron rápidamente, \r\natrayendo a aventureros de todas partes de Teyvat en busca de su fortuna.");
		preguntaUno.setViewportView(txtrEnUnVasto);
		
		pregunta2 = new JTextField();
		pregunta2.setEditable(false);
		pregunta2.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		pregunta2.setText("El Santuario de los Sueños... ¿Es verdad o una ilusión?");
		pregunta2.setBounds(257, 227, 376, 37);
		add(pregunta2);
		pregunta2.setColumns(10);
		
		final JRadioButton respuesta1 = new JRadioButton("Respuesta 1");
		respuesta1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("¡Seleccionado!");
				respuesta1.setActionCommand("Respuesta 1");
			}
		});
		botonesRespuesta.add(respuesta1);
		respuesta1.setBounds(89, 321, 109, 23);
		add(respuesta1);
		
		final JRadioButton respuesta2 = new JRadioButton("Respuesta 2");
		respuesta2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("¡Seleccionado!");
				respuesta2.setActionCommand("Respuesta 2");
			}
		});
		botonesRespuesta.add(respuesta2);
		respuesta2.setBounds(89, 393, 109, 23);
		add(respuesta2);
		
		JLabel descripcionAnimo = new JLabel("¡ES TU MOMENTO! Elige una de las dos opciones...\r\n¿Cual será la correcta?");
		descripcionAnimo.setForeground(new Color(255, 255, 255));
		descripcionAnimo.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		descripcionAnimo.setBounds(188, 255, 445, 44);
		add(descripcionAnimo);
		
		JButton BotonNext = new JButton("Siguiente");
		BotonNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BotonNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String respuestaSeleccionada = botonesRespuesta.getSelection().getActionCommand();

                if (respuestaSeleccionada.equals("Respuesta 1")) {
                	JOptionPane.showMessageDialog(ventana, "¡Acertaste, bien hecho!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    ventana.cambiarAPantalla(PantallaPregunta5.class);
                    
                } else {
                    JOptionPane.showMessageDialog(ventana, "¡Oh no.... Cagaste!", "Dead", JOptionPane.INFORMATION_MESSAGE);
                    ventana.cambiarAPantalla(PantallaCuidado.class);
                }
				
			}
		});
		BotonNext.setForeground(new Color(240, 248, 255));
		BotonNext.setBackground(new Color(128, 0, 128));
		BotonNext.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		BotonNext.setBounds(333, 465, 157, 41);
		add(BotonNext);
		
		JScrollPane descripcion1 = new JScrollPane();
		descripcion1.setToolTipText("");
		descripcion1.setBounds(214, 295, 461, 73);
		add(descripcion1);
		
		JTextArea text1 = new JTextArea();
		text1.setEditable(false);
		text1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		text1.setText("Sin embargo, cuando los aventureros finalmente encontraban el \r\nSantuario de los Sueños, descubrían que era solo una ilusión. \r\nNo importaba cuánto anhelaran sus deseos, el santuario nunca \r\ncumplía realmente sus promesas. Los aventureros se daban \r\ncuenta de que el verdadero tesoro estaba en aprender a valorar \r\ny perseguir sus sueños en el mundo real, y no en las ilusiones \r\nefímeras del santuario.");
		descripcion1.setViewportView(text1);
		
		JScrollPane descipcion2 = new JScrollPane();
		descipcion2.setToolTipText("");
		descipcion2.setBounds(214, 378, 461, 73);
		add(descipcion2);
		
		JTextArea text2 = new JTextArea();
		text2.setEditable(false);
		text2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		text2.setText("A medida que los aventureros ingresaban al Santuario de los Sueños, \r\nse encontraban con una dimensión alterna llena de maravillas y \r\nriquezas sin fin. En este reino onírico, sus deseos se materializaban \r\ny podían vivir una vida de lujo y exuberancia. Los aventureros se \r\nvolvían adictos a la ilusión y abandonaban sus responsabilidades \r\nen Teyvat, quedando atrapados para siempre en el Santuario de \r\nlos Sueños, persiguiendo un sueño que nunca se convertiría en \r\nrealidad.");
		descipcion2.setViewportView(text2);
		
		JLabel fondoPantalla4 = new JLabel("");
		try {
			BufferedImage imagen = ImageIO.read(PantallaPregunta4.class.getResource("/imagenes/pantallaPregunta4.jpg"));
			Image enIcono = imagen.getScaledInstance(810, 520, Image.SCALE_SMOOTH);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		fondoPantalla4.setBounds(0, 0, 814, 534);
		add(fondoPantalla4);
		
		
		

		/*
		 * 
		 * JLabel lblFondo = new JLabel("");
		try {
			BufferedImage imagen = ImageIO.read(new File("./imagenes/fondo1.png"));
			Image enIcono = imagen.getScaledInstance(700, 500, Image.SCALE_SMOOTH);
			lblFondo.setIcon(new ImageIcon(enIcono));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		lblFondo.setBounds(0, 0, 700, 500);
		add(lblFondo);
		 */
		
		
	}
}

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

public class PantallaPregunta3 extends JPanel{

	private Ventana ventana;
	private JTextField tituloPregunta;
	private JTextField pregunta2;
	private final ButtonGroup botonesRespuesta = new ButtonGroup();
	

	public PantallaPregunta3(Ventana v) {
		setBackground(new Color(216, 191, 216));

		this.ventana=v;
		this.ventana.setSize(820,538);
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
		tituloPregunta.setText("TERCERA PREGUNTA: Elige para seguir con la aventura. Piensa bien la respuesta (!!!).");
		preguntaUno.setColumnHeaderView(tituloPregunta);
		tituloPregunta.setColumns(10);
		
		JTextArea txtrEnUnVasto = new JTextArea();
		txtrEnUnVasto.setEditable(false);
		txtrEnUnVasto.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		txtrEnUnVasto.setText("Hace siglos, en el mundo de Teyvat, existían dos poderosas facciones: los Alquimistas y los \r\nElementales. Los Alquimistas eran sabios estudiosos de la naturaleza y buscaban entender \r\ny dominar los secretos de la alquimia, mientras que los Elementales eran seres dotados de\r\npoderes elementales y eran venerados como semidioses.\r\n\r\nAmbas facciones vivían en relativa armonía, colaborando en la búsqueda del conocimiento\r\ny protegiendo a Teyvat de las amenazas externas. Sin embargo, a medida que \r\npasaban los años, comenzaron a surgir tensiones entre ellos. Los Elementales se volvieron\r\ncada vez más arrogantes y despreciaron a los Alquimistas, considerándolos inferiores \r\ny sin poder real. \r\n\r\nLa rivalidad llegó a su punto máximo cuando un grupo de Elementales liderados por un\r\npoderoso líder llamado Venti intentó usurpar el poder de los Alquimistas. Aprovechando\r\nsu control sobre los elementos, los Elementales lanzaron ataques contra los laboratorios y\r\nbibliotecas de los Alquimistas, tratando de destruir su conocimiento y controlar la alquimia\r\npara sí mismos.\r\n\r\nEn medio del conflicto, surgió un joven alquimista llamado Alphonse. Con su ingenio y\r\nconocimientos alquímicos, Alphonse descubrió una antigua fórmula que le permitía\r\ncanalizar el poder elemental y otorgarse visiones temporales. Armado con estas visiones y\r\nacompañado por un grupo de leales alquimistas, Alphonse se enfrentó a los Elementales\r\nen una batalla épica para defender el conocimiento y la libertad de los Alquimistas.\r\n\r\nFinalmente, Alphonse logró derrotar a Venti y a los Elementales rebeldes, restableciendo \r\nla paz y el equilibrio en Teyvat. Reconociendo el valor de la alquimia y la sabiduría de los \r\nAlquimistas, los Elementales se retractaron de su arrogancia y ambos grupos acordaron\r\ncolaborar en adelante, compartiendo su conocimiento y protegiendo juntos a\r\nTeyvat de futuras amenazas.");
		preguntaUno.setViewportView(txtrEnUnVasto);
		
		pregunta2 = new JTextField();
		pregunta2.setEditable(false);
		pregunta2.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		pregunta2.setText("¿Qué pasó después de dicha batalla? ¿Se fue todo a la verga?");
		pregunta2.setBounds(214, 227, 419, 37);
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
		descripcionAnimo.setBackground(Color.BLACK);
		descripcionAnimo.setForeground(Color.BLACK);
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

                if (respuestaSeleccionada.equals("Respuesta 2")) {
                	JOptionPane.showMessageDialog(ventana, "¡Acertaste, bien hecho!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    ventana.cambiarAPantalla(PantallaPregunta4.class);
                    
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
		text1.setText("A pesar de los esfuerzos de Alphonse y los alquimistas, los Elementales \r\nlograron destruir gran parte del conocimiento alquímico y sometieron \r\na los Alquimistas a su dominio. Los Elementales se convirtieron en la \r\nfacción dominante y prohibieron la práctica de la alquimia, \r\nconsiderándola una amenaza para su poder. Teyvat quedó bajo el \r\ncontrol totalitario de los Elementales, y los alquimistas fueron \r\ndesterrados o perseguidos, mientras el mundo se sumía en la \r\noscuridad y la opresión.");
		descripcion1.setViewportView(text1);
		
		JScrollPane descipcion2 = new JScrollPane();
		descipcion2.setToolTipText("");
		descipcion2.setBounds(214, 378, 461, 73);
		add(descipcion2);
		
		JTextArea text2 = new JTextArea();
		text2.setEditable(false);
		text2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		text2.setText("Después de una feroz batalla, Alphonse y los alquimistas lograron \r\nrepeler el ataque de los Elementales y proteger su conocimiento \r\ny poder alquímico. Los Elementales, conscientes de su derrota, \r\nse retiraron y acordaron mantener la paz con los Alquimistas. \r\nAmbas facciones reconocieron la importancia de la alquimia y \r\nlos poderes elementales, y trabajaron juntas para promover la \r\nprosperidad y el equilibrio en Teyvat.");
		descipcion2.setViewportView(text2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PantallaPregunta3.class.getResource("/imagenes/pantallaPregunta33.png")));
		lblNewLabel.setBounds(0, 0, 799, 518);
		add(lblNewLabel);
		
	/*	Label fondoPregunta3 = new JLabel("");
		try {
		BufferedImage imagen = ImageIO.read(PantallaPregunta3.class.getResource("/imagenes/pantallaPregunta3.jpg"));
		Image enIcono = imagen.getScaledInstance(810, 520, Image.SCALE_SMOOTH);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		fondoPregunta3.setBounds(0, 0, 808, 544);
		add(fondoPregunta3);
		

	
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

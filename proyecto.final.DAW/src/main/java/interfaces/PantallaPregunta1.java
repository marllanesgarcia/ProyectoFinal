package interfaces;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantallaPregunta1 extends JPanel{

	private Ventana ventana;
	private JTextField tituloPregunta;
	private JTextField pregunta1;
	private final ButtonGroup botonesRespuesta = new ButtonGroup();
	private JTextField descripcion1;
	private JTextField descripcion2;
	

	public PantallaPregunta1(Ventana v) {
		setBackground(new Color(216, 191, 216));

		this.ventana=v;
		this.ventana.setSize(820,510);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(291, 23, 224, 37);
		panel.setForeground(Color.BLACK);
		panel.setBorder(new LineBorder(new Color(128, 0, 128), 3, true));
		panel.setBackground(new Color(255, 228, 225));
		add(panel);
		
		JLabel lblempiezaElJuego = new JLabel("¡Empieza el juego!");
		lblempiezaElJuego.setBackground(new Color(128, 0, 128));
		lblempiezaElJuego.setForeground(new Color(128, 0, 128));
		lblempiezaElJuego.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 19));
		panel.add(lblempiezaElJuego);
		
		JScrollPane preguntaUno = new JScrollPane();
		preguntaUno.setToolTipText("");
		preguntaUno.setBounds(93, 91, 639, 155);
		add(preguntaUno);
		
		tituloPregunta = new JTextField();
		tituloPregunta.setEditable(false);
		tituloPregunta.setFont(new Font("MS PGothic", Font.ITALIC, 16));
		tituloPregunta.setText("PRIMERA PREGUNTA: Elige para seguir con la aventura. Piensa bien la respuesta (!!!).");
		preguntaUno.setColumnHeaderView(tituloPregunta);
		tituloPregunta.setColumns(10);
		
		JTextArea txtrEnUnVasto = new JTextArea();
		txtrEnUnVasto.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		txtrEnUnVasto.setText("En un vasto continente conocido como Teyvat, una vez existieron\r\nsiete dioses elementales que gobernaban sobre las diferentes regiones.\r\nSin embargo, hace milenios, estos dioses desaparecieron misteriosamente, \r\nsumiendo a Teyvat en un caos sin precedentes.\r\n\r\nEn medio de esta turbulencia, llegas tú, un viajero o viajera de otro mundo. \r\nTu búsqueda para encontrar a tu hermano gemelo perdido te lleva a Teyvat,\r\n un mundo lleno de maravillas y peligros. Te encuentras con una variedad \r\nde personajes, cada uno con su propia historia y motivaciones.\r\n\r\nUn día, mientras exploras la ciudad de Mondstadt, escuchas un rumor \r\nsobre un antiguo tesoro oculto en las profundidades de las ruinas de \r\nun templo olvidado. Intrigado/a, decides emprender la aventura para \r\ndescubrir este tesoro legendario y desentrañar los secretos del pasado de Teyvat.\r\n\r\nEn tu camino hacia las ruinas, te encuentras con un enigmático \r\nsabio llamado Albedo, quien te advierte sobre los peligros que acechan en las profundidades del templo. \r\nÉl te dice que el tesoro es conocido como \r\n\"El Corazón de los Elementos\", un artefacto poderoso que puede conceder\r\na su poseedor un control absoluto sobre los elementos.\r\n\r\nLlegas al templo y te enfrentas a una serie de desafíos y trampas mortales.\r\nSin embargo, tu determinación y habilidades te permiten superar cada \r\nobstáculo hasta que finalmente llegas a la sala del tesoro. Allí, encuentras \r\nuna estatua antigua que te habla en un lenguaje ancestral.");
		preguntaUno.setViewportView(txtrEnUnVasto);
		
		pregunta1 = new JTextField();
		pregunta1.setEditable(false);
		pregunta1.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		pregunta1.setText("La estatua te plantea una pregunta: \r\n\"¿Cuál es el verdadero propósito del poder elemental?\".");
		pregunta1.setBounds(103, 263, 619, 37);
		add(pregunta1);
		pregunta1.setColumns(10);
		
		final JRadioButton respuesta1 = new JRadioButton("Respuesta 1");
		respuesta1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("¡Seleccionado!");
				respuesta1.setActionCommand("Respuesta 1");
			}
		});
		botonesRespuesta.add(respuesta1);
		respuesta1.setBounds(46, 365, 109, 23);
		add(respuesta1);
		
		final JRadioButton respuesta2 = new JRadioButton("Respuesta 2");
		respuesta2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("¡Seleccionado!");
				respuesta1.setActionCommand("Respuesta 2");
			}
		});
		botonesRespuesta.add(respuesta2);
		respuesta2.setBounds(46, 405, 109, 23);
		add(respuesta2);
		
		JLabel descripcionAnimo = new JLabel("¡ES TU MOMENTO! Elige una de las dos opciones...\r\n¿Cual será la correcta?");
		descripcionAnimo.setForeground(new Color(255, 255, 255));
		descripcionAnimo.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		descripcionAnimo.setBounds(188, 311, 445, 44);
		add(descripcionAnimo);
		
		JButton BotonNext = new JButton("Siguiente");
		BotonNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (botonesRespuesta.equals("Respuesta 2")) {
					JOptionPane.showMessageDialog(ventana, "¡Acertaste, bien hecho!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
					ventana.cambiarAPantalla(PantallaPregunta2.class);
				}else {
					JOptionPane.showMessageDialog(ventana, "¡oh no....Cagaste!", "Dead", JOptionPane.INFORMATION_MESSAGE);
					ventana.cambiarAPantalla(PantallaBatalla.class);
				}
				
			}
		});
		BotonNext.setForeground(new Color(240, 248, 255));
		BotonNext.setBackground(new Color(128, 0, 128));
		BotonNext.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		BotonNext.setBounds(305, 449, 157, 41);
		add(BotonNext);
		
		descripcion1 = new JTextField();
		descripcion1.setEditable(false);
		descripcion1.setText("⇒  Con sabiduria: \"El verdadero propósito del poder elemental es proteger y preservar el equilibrio natural de Teyvat\".");
		descripcion1.setBounds(161, 366, 581, 20);
		add(descripcion1);
		descripcion1.setColumns(10);
		
		descripcion2 = new JTextField();
		descripcion2.setEditable(false);
		descripcion2.setText("⇒  Respondes impulsivamente: \"El verdadero propósito del poder elemental es obtener control y dominio sobre los demás\"");
		descripcion2.setBounds(161, 406, 599, 20);
		add(descripcion2);
		descripcion2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PantallaPregunta1.class.getResource("/imagenes/PantallaPreguntaDefinitiva.png")));
		lblNewLabel.setBounds(0, 0, 800, 501);
		add(lblNewLabel);

		
		
	}
}

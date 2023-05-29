package interfaces;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class PantallaPregunta2 extends JPanel{

	private Ventana ventana;
	private JTextField tituloPregunta;
	private JTextField pregunta1;
	private final ButtonGroup botonesRespuesta = new ButtonGroup();
	

	public PantallaPregunta2(Ventana v) {
		setBackground(new Color(216, 191, 216));

		this.ventana=v;
		this.ventana.setSize(800,501);
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
		
		JScrollPane preguntaUno = new JScrollPane();
		preguntaUno.setToolTipText("");
		preguntaUno.setBounds(93, 91, 639, 155);
		add(preguntaUno);
		
		tituloPregunta = new JTextField();
		tituloPregunta.setEditable(false);
		tituloPregunta.setFont(new Font("MS PGothic", Font.ITALIC, 16));
		tituloPregunta.setText("SEGUNDA PREGUNTA: Elige para seguir con la aventura. Piensa bien la respuesta (!!!).");
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
		pregunta1.setBounds(103, 247, 619, 37);
		add(pregunta1);
		pregunta1.setColumns(10);
		
		JRadioButton respuesta1 = new JRadioButton("Respuesta 1");
		botonesRespuesta.add(respuesta1);
		respuesta1.setBounds(46, 365, 109, 23);
		add(respuesta1);
		
		JRadioButton respuesta2 = new JRadioButton("Respuesta 2");
		botonesRespuesta.add(respuesta2);
		respuesta2.setBounds(46, 405, 109, 23);
		add(respuesta2);
		
		JLabel textoRespuesta1 = new JLabel("⇒  Con sabiduria: \"El verdadero propósito del poder elemental es proteger y preservar el equilibrio natural de Teyvat\".");
		textoRespuesta1.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 11));
		textoRespuesta1.setBounds(161, 362, 629, 33);
		add(textoRespuesta1);
		
		JLabel flechita2 = new JLabel("⇒  Respondes impulsivamente: \"El verdadero propósito del poder elemental es obtener control y dominio sobre los demás\"");
		flechita2.setBounds(161, 409, 629, 14);
		add(flechita2);
		
		JLabel descripcionAnimo = new JLabel("¡ES TU MOMENTO! Elige una de las dos opciones...\r\n¿Cual será la correcta?");
		descripcionAnimo.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		descripcionAnimo.setBounds(187, 295, 445, 44);
		add(descripcionAnimo);
		
		JButton BotonNext = new JButton("Siguiente");
		BotonNext.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		BotonNext.setBounds(305, 449, 157, 41);
		add(BotonNext);

		
		
	}
}

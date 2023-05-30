package interfaces;

import javax.swing.JPanel;
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
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

public class PantallaPregunta2 extends JPanel{

	private Ventana ventana;
	private JTextField tituloPregunta;
	private JTextField pregunta2;
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
		tituloPregunta.setText("SEGUNDA PREGUNTA: Elige para seguir con la aventura. Piensa bien la respuesta (!!!).");
		preguntaUno.setColumnHeaderView(tituloPregunta);
		tituloPregunta.setColumns(10);
		
		JTextArea txtrEnUnVasto = new JTextArea();
		txtrEnUnVasto.setEditable(false);
		txtrEnUnVasto.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		txtrEnUnVasto.setText("Hace mucho tiempo, en el mundo de Teyvat, existían siete dioses elementales\r\npor cada ciudad que gobernaban sobre las siete naciones. \r\nCada dios representaba un elemento y otorgaba visiones a sus seguidores, \r\npermitiéndoles manipular el poder elemental. Durante siglos, \r\nla paz reinó en Teyvat bajo la protección de los dioses.\r\n\r\nSin embargo, un día, un poderoso dios llamado \"El Destructor\" \r\nsurgió de las profundidades y amenazó con sumir a Teyvat en la \r\noscuridad. Los dioses unieron fuerzas para enfrentarlo, pero a \r\npesar de sus esfuerzos, El Destructor resultó ser demasiado poderoso \r\ny logró derrotarlos a todos. Como último recurso, los dioses sellaron \r\nsus propias visiones dentro de estatuas conocidas como Estatuas \r\nde los Siete para protegerlas de la corrupción de El Destructor.\r\n\r\nCon los dioses derrotados y las visiones selladas, Teyvat se \r\nsumió en el caos. Los habitantes se vieron privados de sus poderes\r\nelementales y el mundo comenzó a desequilibrarse. Sin embargo, \r\nen medio de la oscuridad, surgió una esperanza: el Viajero. \r\nEl Viajero era un ser de otro mundo que llegó a Teyvat buscando \r\nrespuestas sobre su pasado y su hermana perdida.\r\n\r\nEl Viajero se embarcó en una aventura épica a través de las\r\nsiete naciones de Teyvat, desentrañando los secretos de los dioses, \r\nconociendo a personajes fascinantes y enfrentándose a peligrosos \r\nenemigos. A lo largo de su viaje, el Viajero descubrió que la única \r\nmanera de liberar a los dioses y restaurar el equilibrio en Teyvat era \r\nencontrar las Estatuas de los Siete y despertar el poder de las visiones.");
		preguntaUno.setViewportView(txtrEnUnVasto);
		
		pregunta2 = new JTextField();
		pregunta2.setEditable(false);
		pregunta2.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		pregunta2.setText("¿Qué pasará con el destino del Viajero? ¿Encontrará las Estatuas de los Siete?");
		pregunta2.setBounds(143, 225, 529, 37);
		add(pregunta2);
		pregunta2.setColumns(10);
		
		JRadioButton respuesta1 = new JRadioButton("Respuesta 1");
		botonesRespuesta.add(respuesta1);
		respuesta1.setBounds(128, 320, 109, 23);
		add(respuesta1);
		
		JRadioButton respuesta2 = new JRadioButton("Respuesta 2");
		botonesRespuesta.add(respuesta2);
		respuesta2.setBounds(128, 403, 109, 23);
		add(respuesta2);
		
		JLabel descripcionAnimo = new JLabel("¡ES TU MOMENTO! Elige una de las dos opciones...\r\n¿Cual será la correcta?");
		descripcionAnimo.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		descripcionAnimo.setBounds(188, 255, 445, 44);
		add(descripcionAnimo);
		
		JButton BotonNext = new JButton("Siguiente");
		BotonNext.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		BotonNext.setBounds(301, 471, 157, 41);
		add(BotonNext);
		
		JScrollPane descripcion1 = new JScrollPane();
		descripcion1.setToolTipText("");
		descripcion1.setBounds(257, 303, 461, 73);
		add(descripcion1);
		
		JTextArea text1 = new JTextArea();
		text1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		text1.setText("A pesar de todos los esfuerzos del Viajero, no logró encontrar \r\ntodas las Estatuas de los Siete ni despertar el poder de las visiones. \r\nEl Destructor continuó extendiendo su influencia por todo Teyvat \r\ny sumió al mundo en un caos eterno. El Viajero, desesperado \r\npor encontrar una solución, se perdió en la oscuridad y su destino \r\nquedó desconocido. Teyvat quedó condenado a sufrir \r\nbajo el reinado de El Destructor por el resto de la eternidad.");
		descripcion1.setViewportView(text1);
		
		JScrollPane descipcion2 = new JScrollPane();
		descipcion2.setToolTipText("");
		descipcion2.setBounds(257, 387, 461, 73);
		add(descipcion2);
		
		JTextArea text2 = new JTextArea();
		text2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		text2.setText("El Viajero, con la ayuda de sus amigos y aliados, logró encontrar \r\nlas Estatuas de los Siete y liberar a los dioses de su cautiverio. \r\nCon el poder restaurado, los dioses unieron fuerzas una vez más \r\npara enfrentar a El Destructor y finalmente lo derrotaron, \r\ndevolviendo la paz a Teyvat. El Viajero cumplió su misión y\r\npudo encontrar respuestas sobre su pasado y reunirse con su \r\nhermana perdida, estableciendo un nuevo hogar en Teyvat.");
		descipcion2.setViewportView(text2);
		
		JLabel fondoPregunta2 = new JLabel("");
		fondoPregunta2.setIcon(new ImageIcon(PantallaPregunta2.class.getResource("/imagenes/fondoPregunta2.jpg")));
		fondoPregunta2.setBounds(10, 0, 777, 536);
		add(fondoPregunta2);

		
		
	}
}

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

public class PantallaPregunta5 extends JPanel{

	private Ventana ventana;
	private JTextField tituloPregunta;
	private JTextField pregunta2;
	private final ButtonGroup botonesRespuesta = new ButtonGroup();
	

	public PantallaPregunta5(Ventana v) {
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
		preguntaUno.setBounds(89, 71, 639, 110);
		add(preguntaUno);
		
		tituloPregunta = new JTextField();
		tituloPregunta.setEditable(false);
		tituloPregunta.setFont(new Font("MS PGothic", Font.ITALIC, 16));
		tituloPregunta.setText("QUINTA PREGUNTA: Elige para seguir con la aventura. Piensa bien la respuesta (!!!).");
		preguntaUno.setColumnHeaderView(tituloPregunta);
		tituloPregunta.setColumns(10);
		
		JTextArea txtrEnUnVasto = new JTextArea();
		txtrEnUnVasto.setEditable(false);
		txtrEnUnVasto.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		txtrEnUnVasto.setText("En un tranquilo pueblo de Teyvat llamado Arbolinia, se encontraba un \r\nlegendario árbol conocido como \"El Árbol de los Mil Deseos\". Según la \r\ntradición local, aquellos que escribían sus deseos en hojas especiales y \r\nlas ataban a las ramas del árbol, verían sus sueños cumplidos.");
		preguntaUno.setViewportView(txtrEnUnVasto);
		
		pregunta2 = new JTextField();
		pregunta2.setEditable(false);
		pregunta2.setFont(new Font("Mongolian Baiti", Font.BOLD, 15));
		pregunta2.setText("¿Que pasaba cuando la gente iba a dicho árbol? ¿Pasaba algo o no?");
		pregunta2.setBounds(191, 184, 471, 37);
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
		respuesta1.setBounds(89, 291, 109, 23);
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
		respuesta2.setBounds(89, 365, 109, 23);
		add(respuesta2);
		
		JLabel descripcionAnimo = new JLabel("¡ES TU MOMENTO! Elige una de las dos opciones...\r\n¿Cual será la correcta?");
		descripcionAnimo.setForeground(new Color(255, 255, 255));
		descripcionAnimo.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		descripcionAnimo.setBounds(203, 219, 445, 44);
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
                    ventana.cambiarAPantalla(PantallaFinal.class);
                    
                } else {
                    JOptionPane.showMessageDialog(ventana, "¡Oh no.... Cagaste!", "Dead", JOptionPane.INFORMATION_MESSAGE);
                    ventana.cambiarAPantalla(PantallaCuidado.class);
                }
				
			}
		});
		BotonNext.setForeground(new Color(240, 248, 255));
		BotonNext.setBackground(new Color(128, 0, 128));
		BotonNext.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
		BotonNext.setBounds(336, 431, 157, 41);
		add(BotonNext);
		
		JScrollPane descripcion1 = new JScrollPane();
		descripcion1.setToolTipText("");
		descripcion1.setBounds(213, 263, 461, 73);
		add(descripcion1);
		
		JTextArea text1 = new JTextArea();
		text1.setEditable(false);
		text1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		text1.setText("A medida que más y más personas visitaban el Árbol de los Mil Deseos \r\nen busca de su realización, surgieron problemas en el pueblo. Algunos \r\ncomenzaron a competir por la atención del árbol y se generaron \r\ntensiones entre los habitantes. Además, la codicia y la envidia \r\ncomenzaron a emerger cuando aquellos cuyos deseos no se cumplían \r\nempezaron a resentir a aquellos que parecían tener más suerte. \r\nFinalmente, el árbol se marchitó y perdió su poder, dejando a \r\nArbolinia sumida en la tristeza y el desencanto. Los habitantes \r\naprendieron la lección de que los deseos no pueden ser cumplidos \r\nsolo por la magia, sino que requieren esfuerzo y dedicación personal.");
		descripcion1.setViewportView(text1);
		
		JScrollPane descipcion2 = new JScrollPane();
		descipcion2.setToolTipText("");
		descipcion2.setBounds(213, 347, 461, 73);
		add(descipcion2);
		
		JTextArea text2 = new JTextArea();
		text2.setEditable(false);
		text2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		text2.setText("Los residentes de Arbolinia creían fervientemente en el poder del \r\nÁrbol de los Mil Deseos y lo visitaban regularmente para expresar sus \r\nesperanzas y aspiraciones. Aunque no todos los deseos se cumplían, se creía \r\nque el acto de compartirlos con el árbol inspiraba a las personas a trabajar \r\narduamente para lograr sus metas y encontrar la felicidad en el proceso.");
		descipcion2.setViewportView(text2);
		
		
	}
}

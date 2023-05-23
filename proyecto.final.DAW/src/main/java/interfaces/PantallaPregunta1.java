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

public class PantallaPregunta1 extends JPanel{

	private Ventana ventana;
	private JTextField tituloPregunta;
	private JTextField txtesTuMomento;
	

	public PantallaPregunta1(Ventana v) {

		this.ventana=v;
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(289, 21, 224, 37);
		panel.setForeground(Color.BLACK);
		panel.setBorder(new LineBorder(new Color(128, 0, 128), 3, true));
		panel.setBackground(new Color(216, 191, 216));
		add(panel);
		
		JLabel lblempiezaElJuego = new JLabel("¡Empieza el juego!");
		lblempiezaElJuego.setForeground(Color.WHITE);
		lblempiezaElJuego.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 19));
		panel.add(lblempiezaElJuego);
		
		JScrollPane preguntaUno = new JScrollPane();
		preguntaUno.setToolTipText("");
		preguntaUno.setBounds(123, 82, 639, 155);
		add(preguntaUno);
		
		tituloPregunta = new JTextField();
		tituloPregunta.setEditable(false);
		tituloPregunta.setFont(new Font("MS PGothic", Font.ITALIC, 16));
		tituloPregunta.setText("PRIMERA PREGUNTA: Elige para seguir con la aventura. Piensa bien la respuesta (!!!).");
		preguntaUno.setColumnHeaderView(tituloPregunta);
		tituloPregunta.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("descripcionUno");
		preguntaUno.setViewportView(lblNewLabel);
		
		txtesTuMomento = new JTextField();
		txtesTuMomento.setEditable(false);
		txtesTuMomento.setFont(new Font("Mongolian Baiti", Font.BOLD, 17));
		txtesTuMomento.setText("¡ES TU MOMENTO!\r\nElige una de las dos opciones...\r\n¿Cual será la correcta?");
		txtesTuMomento.setBounds(123, 273, 639, 53);
		add(txtesTuMomento);
		txtesTuMomento.setColumns(10);

		
		
	}
}

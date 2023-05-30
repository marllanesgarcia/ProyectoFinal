package interfaces;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import clases.ReproductorAudio;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridLayout;

public class PantallaCuidado extends JPanel{

	private Ventana ventana;
	private JTextArea areaTexto;
	private int cuidadoLetras = 0;
	private String[] letras = { "CAGASTE MAI FRIEN...", "¡CUIDADO, VIENEN LOS ENEMIGOS...!",
			"¡¡¡PREPARAOS PARA LA BATALLA MIS VALIENTES...!!!"," ¡QUIEN MUERA ES TONTO Y SE LLEVA UN SUSPENSO!",
			"A por todas", "Preparados..", "Listos..", "YAAAAAAAA."};
	
	public PantallaCuidado(Ventana v) {
		
		this.ventana=v;
		this.ventana.setSize(700,500);
		JPanel contenedorTexto = new JPanel();
		contenedorTexto.setBounds(0, 0, 770, 492);
		contenedorTexto.setBackground(Color.BLACK);
		
		final JLabel letrasLabel = new JLabel();
		letrasLabel.setBounds(38, 31, 684, 375);
		letrasLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		letrasLabel.setForeground(Color.WHITE);
		letrasLabel.setHorizontalAlignment(SwingConstants.CENTER);
	
		Border borde = BorderFactory.createLineBorder(Color.RED, 2);
		setLayout(null);
		contenedorTexto.setBorder(borde);
		contenedorTexto.setLayout(null);
		contenedorTexto.add(letrasLabel);
		add(contenedorTexto);
		
		// MUSICA
		
		final JButton botonReproducir = new JButton("Reproducir");
		botonReproducir.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        ReproductorAudio.reproduciroOtro();;
		    }
		});
		
		final JButton botonNext = new JButton("Next");
		botonNext.setBackground(new Color(192, 192, 192));
		botonNext.setBounds(129, 417, 446, 25);
		botonNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(PantallaBatalla.class);
			}
		});
		botonNext.setForeground(new Color(255, 0, 0));
		botonNext.setFont(new Font("DejaVu Serif", Font.BOLD | Font.ITALIC, 17));
		contenedorTexto.add(botonNext);
		
		// Crear y iniciar un hilo para mostrar la historia gradualmente
					Thread cuidadoThread = new Thread(new Runnable() {
						@Override
						public void run() {
							mostrarLetras(letrasLabel);
							 SwingUtilities.invokeLater(new Runnable() {
						            @Override
						            public void run() {
						                botonNext.setEnabled(true); // Habilitar el botón Continuar después de mostrar la historia
						            }
						        });
						}
					});
					cuidadoThread.start();
			}


	private void mostrarLetras(JLabel letrasLabel) {
		try {
			for (int i = 0; i < letras.length; i++) {
				String parteHistoria = letras[i];
				String[] lineas = parteHistoria.split("\n");

				for (String linea : lineas) {
					mostrarLinea(linea, letrasLabel);
					Thread.sleep(200); // Pausa de 2 segundos entre cada línea
				}

				if (i < letras.length - 1) {
					Thread.sleep(200); // Pausa de 2 segundos entre cada parte de la historia
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void mostrarLinea(String linea, JLabel historiaLabel) {
		StringBuilder textoVisible = new StringBuilder();
		for (int i = 0; i < linea.length(); i++) {
			char c = linea.charAt(i);
			textoVisible.append(c);

			historiaLabel.setText(textoVisible.toString());
			try {
				Thread.sleep(50); // Pausa de 50 milisegundos entre cada carácter
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		textoVisible.append(" "); 
		historiaLabel.setText(textoVisible.toString());
		try {
			Thread.sleep(100); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
		
	}


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

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class PantallaFinalMalo extends JPanel{

	private Ventana ventana;
	private JTextArea areaTexto;
	private int cuidadoLetras = 0;
	private String[] letras = { "Has fallado...","Ahora toda la poblacion de las diferentes ciudades..","Han sido destruidas..",
			"¿Me perdonas?","Si te he fallado, te pido perdon","De la única forma que se","abriendote las puertas de mi corazon",
			"para cuando decidas volver.","Xiao pescao."};
	public PantallaFinalMalo(Ventana v) {
		addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
				ReproductorAudio.reproduciroOtro();
			}
		});
		
		this.ventana=v;
		this.ventana.setSize(789,534);
		JPanel contenedorTexto = new JPanel();
		contenedorTexto.setForeground(new Color(128, 0, 0));
		contenedorTexto.setBounds(0, 0, 770, 492);
		contenedorTexto.setBackground(new Color(205, 133, 63));
		
		final JLabel letrasLabel = new JLabel();
		letrasLabel.setBackground(new Color(0, 0, 0));
		letrasLabel.setBounds(272, 11, 498, 375);
		letrasLabel.setFont(new Font("Dubai Medium", Font.BOLD | Font.ITALIC, 16));
		letrasLabel.setForeground(Color.WHITE);
		letrasLabel.setHorizontalAlignment(SwingConstants.CENTER);
	
		Border borde = BorderFactory.createLineBorder(Color.RED, 2);
		setLayout(null);
		contenedorTexto.setBorder(new LineBorder(new Color(128, 0, 0), 4));
		contenedorTexto.setLayout(null);
		contenedorTexto.add(letrasLabel);
		add(contenedorTexto);
		
		JLabel meme = new JLabel("");
		meme.setIcon(new ImageIcon(PantallaFinalMalo.class.getResource("/imagenes/memeFinal.png")));
		meme.setBounds(21, 137, 429, 370);
		contenedorTexto.add(meme);
	
		// Crear y iniciar un hilo para mostrar la historia gradualmente
					Thread cuidadoThread = new Thread(new Runnable() {
						@Override
						public void run() {
							mostrarLetras(letrasLabel);
							 SwingUtilities.invokeLater(new Runnable() {
						            @Override
						            public void run() {
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


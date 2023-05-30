package interfaces;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import clases.Enemigo;
import clases.Jugador;
import clases.ReproductorAudio;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class PantallaBatalla extends JPanel{

	private Ventana ventana;
	private JPanel panel;
    private JLabel lblResultado;
    private JButton btnAtacar;

    private Jugador jugador;
    private Enemigo enemigo;
    private List<Enemigo> enemigos;
	
	public PantallaBatalla(Ventana v) {
		
		this.ventana=v;
		setLayout(null);
		this.ventana.setSize(820,510);

		// MUSICA
		
				final JButton botonReproducir = new JButton("Reproducir");
				botonReproducir.addActionListener(new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				        ReproductorAudio.reproduciroBatalla();
				    }
				});
		
     /*   setTitle("Batalla");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        lblResultado = new JLabel("¡Bienvenido a la batalla!");
        panel.add(lblResultado, BorderLayout.CENTER);

        btnAtacar = new JButton("Atacar");
        btnAtacar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarAtaque();
            }
        });
        panel.add(btnAtacar, BorderLayout.SOUTH);

        add(panel);
    }

    public void iniciarBatalla() {
        cargarEnemigos();
        usuario = new Personaje("Usuario", 100, 10);
        enemigo = seleccionarEnemigoAleatorio();
        lblResultado.setText("¡Batalla iniciada! " + usuario.getNombre() + " vs " + enemigo.getNombre());
        btnAtacar.setEnabled(true);
    }

    private void realizarAtaque() {
        enemigo.recibirAtaque(usuario.getFuerza());

        if (enemigo.estaDerrotado()) {
            lblResultado.setText("¡Has ganado la batalla!");
            btnAtacar.setEnabled(false);
            // Cambiar a PantallaPregunta2 (código no proporcionado)
        } else {
            usuario.recibirAtaque(enemigo.getFuerza());

            if (usuario.estaDerrotado()) {
                lblResultado.setText("¡Has sido derrotado!");
                btnAtacar.setEnabled(false);
                // Cambiar a PantallaPregunta2 (código no proporcionado)
            } else {
                lblResultado.setText(usuario.getNombre() + " ha atacado a " + enemigo.getNombre() + ". " +
                        enemigo.getNombre() + " ha contraatacado a " + usuario.getNombre() + ".");
            }
        }
    }

    private void cargarEnemigos() {
        enemigos = new ArrayList<>();
        enemigos.add(new Enemigo("Enemigo 1", 50, 5));
        enemigos.add(new Enemigo("Enemigo 2", 70, 7));
        enemigos.add(new Enemigo("Enemigo 3", 90, 9));
    }

    private Enemigo seleccionarEnemigoAleatorio() {
        int indice = (int) (Math.random() * enemigos.size());
        return enemigos.get(indice);
   */
		
		
		
		
		
		
		
		
		
		
		
		
		
}
 }
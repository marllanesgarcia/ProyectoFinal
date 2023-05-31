package interfaces;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import clases.Arma;
import clases.Enemigo;
import clases.Jugador;
import clases.ReproductorAudio;
import util.DAO;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;

import javax.swing.JTextField;

public class PantallaBatalla extends JPanel{

	private Ventana ventana;
	private JPanel panel;
    private JLabel lblResultado;
    private JButton btnAtacar;

    private Jugador jugador;
    private Enemigo enemigo;
    private List<Enemigo> enemigos;
    private JTextField datosEnemigo;
    private JTextField datosUsuario;
	
	public PantallaBatalla(Ventana v) {
		setForeground(new Color(0, 0, 0));
		setBorder(new LineBorder(new Color(255, 0, 0), 6));
		setBackground(new Color(0, 0, 0));
		
		this.ventana=v;
		setLayout(null);
		
		// MUSICA
		
		final JButton botonReproducir = new JButton("Reproducir");
		botonReproducir.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        ReproductorAudio.reproduciroBatalla();
		    }
		});
		
		JLabel textoTitulo = new JLabel("¡A luchar!");
		textoTitulo.setBounds(300, -31, 257, 166);
		add(textoTitulo);
		textoTitulo.setForeground(new Color(255, 0, 0));
		textoTitulo.setFont(new Font("Gadugi", Font.BOLD, 42));
		textoTitulo.setBackground(new Color(255, 255, 255));
		
		JPanel panelEnemigo = new JPanel();
		panelEnemigo.setForeground(new Color(128, 0, 0));
		panelEnemigo.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		panelEnemigo.setBackground(new Color(0, 0, 0));
		panelEnemigo.setBounds(64, 107, 154, 49);
		add(panelEnemigo);
		
		JLabel textoEnemigo = new JLabel("Enemigo");
		textoEnemigo.setForeground(new Color(128, 0, 0));
		textoEnemigo.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 23));
		textoEnemigo.setBackground(new Color(128, 0, 0));
		panelEnemigo.add(textoEnemigo);
		
		datosEnemigo = new JTextField();
		datosEnemigo.setEditable(false);
		Enemigo enemigo = getEnemigoAlAzar();
        mostrarEnemigo(enemigo);
		datosEnemigo.setBounds(64, 167, 154, 62);
		add(datosEnemigo);
		datosEnemigo.setColumns(10);
		
		JPanel panelUsuario = new JPanel();
		panelUsuario.setForeground(new Color(0, 0, 0));
		panelUsuario.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		panelUsuario.setBackground(new Color(0, 0, 0));
		panelUsuario.setBounds(579, 107, 154, 49);
		add(panelUsuario);
		
		JLabel textoUsuario = new JLabel("Jugador\r\n");
		textoUsuario.setForeground(new Color(128, 0, 0));
		textoUsuario.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 23));
		textoUsuario.setBackground(new Color(128, 0, 0));
		panelUsuario.add(textoUsuario);
		
		datosUsuario = new JTextField();
		datosUsuario.setEditable(false);
		String nombreUsuario = null;   // <-----  OJO AQUI
		
		try {
			nombreUsuario = getUltimoJugador();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		datosUsuario.setText(nombreUsuario);             
		datosUsuario.setColumns(10);
		datosUsuario.setBounds(579, 167, 154, 62);
		add(datosUsuario);
		
		JLabel lblNewLabel = new JLabel("VS");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("MV Boli", Font.BOLD, 32));
		lblNewLabel.setBounds(373, 94, 63, 62);
		add(lblNewLabel);
		this.ventana.setSize(820,510);		

			
}
	
	public static ArrayList<Enemigo> getTodos() {
	    ArrayList<Enemigo> enemigos = new ArrayList<>();

	    try {
	        // Definir las columnas a seleccionar en la consulta
	        LinkedHashSet<String> columnasSelect = new LinkedHashSet<>();
	        columnasSelect.add("nombre");
	        columnasSelect.add("vida");
	        columnasSelect.add("elemento");
	        columnasSelect.add("fuerza");

	        // Definir las restricciones de la consulta (si es necesario)
	        HashMap<String, Object> restricciones = new HashMap<>();

	        // Realizar la consulta a la base de datos para obtener los resultados
	        ArrayList<Object> result = DAO.consultar("Enemigo", columnasSelect, restricciones);

	        // Recorrer los resultados y crear instancias de Arma
	        for (int i = 0; i < result.size(); i += 4) {
	            String nombre = (String) result.get(i);
	            int vida = (Integer) result.get(i + 1);
	            String elemento = (String) result.get(i + 2);
	            int fuerza = (Integer) result.get(i + 3);

	            Enemigo enemigo = new Enemigo(nombre, vida, elemento, fuerza);
	            enemigos.add(enemigo);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        // Manejar la excepción de SQL
	    }

	    return enemigos;
	}
	
	public Enemigo getEnemigoAlAzar() {
        ArrayList<Enemigo> enemigos = getTodos();

        // Verificar si hay enemigos disponibles
        if (enemigos.isEmpty()) {
            return null;
        }

        // Generar un índice aleatorio para seleccionar un enemigo
        Random random = new Random();
        int indiceAleatorio = random.nextInt(enemigos.size());

        // Obtener el enemigo al azar
        return enemigos.get(indiceAleatorio);
    }

    public void mostrarEnemigo(Enemigo enemigo) {
        if (enemigo != null) {
            // Obtener los detalles del enemigo
            String nombre = enemigo.getNombre();
            int vida = enemigo.getVida();
            String elemento = enemigo.getElemento();
            int fuerza = enemigo.getFuerza();

            // Mostrar los detalles del enemigo en el JTextField
            String texto = "Nombre: " + nombre + "\n" +
                    "Vida: " + vida + "\n" +
                    "Elemento: " + elemento + "\n" +
                    "Fuerza: " + fuerza;

            datosEnemigo.setText(texto);
        } else {
        	datosEnemigo.setText("No hay enemigos disponibles.");
        }
    }
    
//    public void mostrarNombreUsuario(String nombreUsuario) {
//        if (!nombreUsuario.isEmpty()) {
//            // Mostrar el nombre de usuario en el JTextField
//            datosUsuario.setText(nombreUsuario);
//        } else {
//        	datosUsuario.setText("No se encontró el nombre de usuario.");
//        }
//    }
//	
    public static String getUltimoJugador() throws SQLException {
        LinkedHashSet<String> columnasSelect = new LinkedHashSet<>();
        columnasSelect.add("usuario");

        ArrayList<Object> resultado = DAO.consultar("usuario");

        if (!resultado.isEmpty()) {
            int indexNombre = 0; // Índice de la columna "nombre"
            return (String) resultado.get(resultado.size() - indexNombre - 1);
        } else {
            return "No se encontró el último jugador.";
        }
    }
	
 }				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
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
		
				

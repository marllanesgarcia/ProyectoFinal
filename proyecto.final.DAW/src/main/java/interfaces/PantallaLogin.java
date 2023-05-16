package interfaces;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JMenuBar;
import javax.swing.JEditorPane;
import javax.swing.JToggleButton;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JProgressBar;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPasswordField;

public class PantallaLogin extends JPanel{

	
	
	private Ventana ventana;
	private JTextField descripcion;
	private JTextField email;
	private JTextField password;
	private JPasswordField cuadroPassword;
	
	public PantallaLogin (Ventana v) {
		setBackground(new Color(216, 191, 216));
		setBorder(new MatteBorder(3, 3, 3, 3, (Color) SystemColor.controlDkShadow));
		this.ventana=v;
		setLayout(null);
		
		JDesktopPane cuadro = new JDesktopPane();
		cuadro.setBackground(new Color(147, 112, 219));
		cuadro.setBounds(10, 11, 119, 46);
		add(cuadro);
		
		JLabel bienvenido = new JLabel("¡Bienvenid@!");
		bienvenido.setForeground(new Color(240, 255, 240));
		bienvenido.setBounds(20, 11, 99, 24);
		cuadro.add(bienvenido);
		bienvenido.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		
		descripcion = new JTextField();
		descripcion.setText("    ¡Introduce un correo y contraseña para empezar la aventura! ☺ ");
		descripcion.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		descripcion.setEditable(false);
		descripcion.setColumns(10);
		descripcion.setBounds(114, 220, 357, 43);
		add(descripcion);
		
		JButton iniciar = new JButton("Press Start");
		iniciar.setToolTipText("SUUUUU");
		iniciar.setFont(new Font("Impact", Font.PLAIN, 11));
		iniciar.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		iniciar.setBackground(new Color(216, 191, 216));
		iniciar.setActionCommand("Press Start");
		iniciar.setBounds(227, 430, 128, 23);
		add(iniciar);
		
		JProgressBar barraEstado = new JProgressBar();
		barraEstado.setValue(50);
		barraEstado.setBounds(26, 475, 146, 14);
		add(barraEstado);
		
		JPanel panelCorreo = new JPanel();
		panelCorreo.setBackground(new Color(230, 230, 250));
		panelCorreo.setBounds(105, 273, 128, 35);
		add(panelCorreo);
		
		email = new JTextField();
		email.setText("     Correo");
		email.setFont(new Font("MV Boli", Font.PLAIN, 11));
		email.setEditable(false);
		email.setColumns(10);
		panelCorreo.add(email);
		
		JPanel panelPassword = new JPanel();
		panelPassword.setBackground(new Color(230, 230, 250));
		panelPassword.setBounds(350, 273, 128, 35);
		add(panelPassword);
		
		password = new JTextField();
		password.setText("   Contraseña");
		password.setFont(new Font("MV Boli", Font.PLAIN, 11));
		password.setEditable(false);
		password.setColumns(10);
		panelPassword.add(password);
		
		TextField cuadroEmail = new TextField();
		cuadroEmail.setBounds(105, 314, 128, 28);
		add(cuadroEmail);
		
		cuadroPassword = new JPasswordField();
		cuadroPassword.setBounds(350, 314, 128, 28);
		add(cuadroPassword);
		
		JButton registro = new JButton("¡Registrate aqui!");
		registro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(PantallaLogin.class);
			}
		});
		registro.setBackground(new Color(216, 191, 216));
		registro.setForeground(Color.BLACK);
		registro.setFont(new Font("MV Boli", Font.PLAIN, 11));
		registro.setBounds(139, 11, 136, 23);
		add(registro);
		
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(PantallaLogin.class.getResource("/imagenes/HD-wallpaper-video-game-genshin-impact-inazuma-genshin-impact.jpg")));
		fondo.setBounds(0, 0, 601, 500);
		add(fondo);
	}
}

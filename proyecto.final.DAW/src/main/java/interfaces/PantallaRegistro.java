package interfaces;

import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JDesktopPane;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.TextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;

public class PantallaRegistro extends JPanel{

	
	private Ventana ventana;
	private JTextField descripcion;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField datosPassword;
	
	public PantallaRegistro (Ventana v) {
		setBackground(new Color(216, 191, 216));
		setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(128, 128, 128)));
		this.ventana=v;
		setLayout(null);
		
		descripcion = new JTextField();
		descripcion.setText("      El primer paso, hacer el registro para guardar tus progresos ☺ ");
		descripcion.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
		descripcion.setEditable(false);
		descripcion.setColumns(10);
		descripcion.setBounds(111, 101, 383, 43);
		add(descripcion);
		
		JDesktopPane cuadro = new JDesktopPane();
		cuadro.setSize(new Dimension(4, 0));
		cuadro.setBackground(new Color(135, 206, 250));
		cuadro.setBounds(10, 11, 119, 35);
		add(cuadro);
		
		JLabel lblaRegistrarse = new JLabel("¡A registrarse!");
		lblaRegistrarse.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		lblaRegistrarse.setBounds(22, 11, 107, 14);
		cuadro.add(lblaRegistrarse);
		
		JPanel cuadroUsuario = new JPanel();
		cuadroUsuario.setBackground(new Color(230, 230, 250));
		cuadroUsuario.setBounds(59, 177, 128, 35);
		add(cuadroUsuario);
		
		textField_1 = new JTextField();
		textField_1.setText("     Usuario");
		textField_1.setFont(new Font("MV Boli", Font.PLAIN, 11));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		cuadroUsuario.add(textField_1);
		
		TextField datosUsuario = new TextField();
		datosUsuario.setBounds(59, 239, 128, 28);
		add(datosUsuario);
		
		JPanel cuadroEmail = new JPanel();
		cuadroEmail.setBackground(new Color(230, 230, 250));
		cuadroEmail.setBounds(409, 177, 128, 35);
		add(cuadroEmail);
		
		textField_2 = new JTextField();
		textField_2.setText("     Correo");
		textField_2.setFont(new Font("MV Boli", Font.PLAIN, 11));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		cuadroEmail.add(textField_2);
		
		TextField datosEmail = new TextField();
		datosEmail.setBounds(409, 239, 128, 28);
		add(datosEmail);
		
		JPanel cuadroPassword = new JPanel();
		cuadroPassword.setBackground(new Color(230, 230, 250));
		cuadroPassword.setBounds(238, 177, 128, 35);
		add(cuadroPassword);
		
		textField_3 = new JTextField();
		textField_3.setText("   Contraseña");
		textField_3.setFont(new Font("MV Boli", Font.PLAIN, 11));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		cuadroPassword.add(textField_3);
		
		datosPassword = new JPasswordField();
		datosPassword.setBounds(238, 239, 128, 28);
		add(datosPassword);
		
		JButton guardarInfo = new JButton("Guardar");
		guardarInfo.setToolTipText("SUUUUU");
		guardarInfo.setFont(new Font("Impact", Font.PLAIN, 11));
		guardarInfo.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		guardarInfo.setBackground(new Color(216, 191, 216));
		guardarInfo.setActionCommand("Press Start");
		guardarInfo.setBounds(238, 431, 128, 23);
		add(guardarInfo);
		
		JLabel fondoRegistro = new JLabel("");
		fondoRegistro.setIcon(new ImageIcon(PantallaRegistro.class.getResource("/imagenes/registro4.jpg")));
		fondoRegistro.setBounds(0, 0, 601, 501);
		add(fondoRegistro);
		
		}
	
}

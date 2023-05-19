package interfaces;

import javax.swing.border.MatteBorder;

import clases.Usuario;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JDesktopPane;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;

public class PantallaRegistro extends JPanel{

	
	private Ventana ventana;
	private JTextField descripcion;
	private JTextField usuario;
	private JTextField email;
	private JTextField password;
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
		
		usuario = new JTextField();
		usuario.setText("     Usuario");
		usuario.setFont(new Font("MV Boli", Font.PLAIN, 11));
		usuario.setEditable(false);
		usuario.setColumns(10);
		cuadroUsuario.add(usuario);
		
		final TextField datosUsuario = new TextField();
		datosUsuario.setBounds(59, 239, 128, 28);
		add(datosUsuario);
		
		JPanel cuadroEmail = new JPanel();
		cuadroEmail.setBackground(new Color(230, 230, 250));
		cuadroEmail.setBounds(409, 177, 128, 35);
		add(cuadroEmail);
		
		email = new JTextField();
		email.setText("     Correo");
		email.setFont(new Font("MV Boli", Font.PLAIN, 11));
		email.setEditable(false);
		email.setColumns(10);
		cuadroEmail.add(email);
		
		final TextField datosEmail = new TextField();
		datosEmail.setBounds(409, 239, 128, 28);
		add(datosEmail);
		
		JPanel cuadroPassword = new JPanel();
		cuadroPassword.setBackground(new Color(230, 230, 250));
		cuadroPassword.setBounds(238, 177, 128, 35);
		add(cuadroPassword);
		
		password = new JTextField();
		password.setText("   Contraseña");
		password.setFont(new Font("MV Boli", Font.PLAIN, 11));
		password.setEditable(false);
		password.setColumns(10);
		cuadroPassword.add(password);
		
		datosPassword = new JPasswordField();
		datosPassword.setBounds(238, 239, 128, 28);
		add(datosPassword);
		
		JButton guardarInfo = new JButton("Guardar");
		guardarInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {;
			String usuario=datosUsuario.getText();
			String email=datosEmail.getText();
			String contraseña=new String(datosPassword.getPassword());
			System.out.println(usuario+" : "+contraseña);
			
			try {
				new Usuario(email,contraseña,usuario);
				JOptionPane.showMessageDialog(ventana, "Registrado Correctamente","Éxito",JOptionPane.INFORMATION_MESSAGE);
			}catch(SQLIntegrityConstraintViolationException e3) {
					JOptionPane.showMessageDialog(ventana,"El email ya existe", "No se pudo registrar",JOptionPane.ERROR_MESSAGE);
			}catch(SQLException e1) {
				JOptionPane.showMessageDialog(ventana,e1.getMessage(), "No se puede conectar con la BD",JOptionPane.ERROR_MESSAGE);
				e1.printStackTrace();
			}
			
			ventana.cambiarAPantalla(PantallaPersonaje.class);	
			}
		});
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

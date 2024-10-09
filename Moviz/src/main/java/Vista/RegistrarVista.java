package Vista;

import javax.swing.JPanel;
import javax.swing.JTextField;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class RegistrarVista extends JPanel {

	private static final long serialVersionUID = 1L;
	public JTextField txtUser;
	public JTextField txtPassword;
	public JTextField txtEmail;
	public JButton btnRegistrar;
	public JButton btnIniciarSesion;
	
	private JLabel logoApp, lblTitulo, textocontraseña, textousuario, yatienescuenta, 
	teléfono, fondo, lblNewJgoodiesTitle, lblNewJgoodiesTitle_1, iconoTelefono;

	public RegistrarVista() {
		setBackground(new Color(66, 72, 93));
		setLayout(null); // IMPORTANTE
		setBounds(0, 0, 1140, 640); // IMPORTANTE

		txtUser = new JTextField();
		txtUser.setBounds(499, 198, 545, 38);
		add(txtUser);
		txtUser.setColumns(10);

		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(499, 294, 545, 38);
		add(txtPassword);

		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(499, 389, 545, 38);
		add(txtEmail);

		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setForeground(new Color(255, 255, 255));
		btnRegistrar.setBackground(new Color(255, 128, 0));
		btnRegistrar.setBounds(919, 438, 125, 50);
		add(btnRegistrar);

		btnIniciarSesion = new JButton("INICIAR SESIÓN");
		btnIniciarSesion.setForeground(new Color(255, 255, 255));
		btnIniciarSesion.setBackground(new Color(255, 128, 0));
		btnIniciarSesion.setBounds(809, 512, 125, 50);
		add(btnIniciarSesion);
		
		logoApp = DefaultComponentFactory.getInstance().createLabel("");
		logoApp.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacion.png")));
		logoApp.setBounds(602, 26, 285, 69);
		add(logoApp);
		
		lblTitulo = new JLabel("Crea tu cuenta en Moviz");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Microsoft YaHei", Font.BOLD, 27));
		lblTitulo.setBounds(562, 106, 344, 36);
		add(lblTitulo);
		
		textocontraseña = new JLabel("Contraseña");
		textocontraseña.setForeground(Color.WHITE);
		textocontraseña.setFont(new Font("Microsoft YaHei", Font.BOLD, 27));
		textocontraseña.setBounds(445, 247, 333, 36);
		add(textocontraseña);
		
		textousuario = new JLabel("Usuario");
		textousuario.setForeground(Color.WHITE);
		textousuario.setFont(new Font("Microsoft YaHei", Font.BOLD, 27));
		textousuario.setBounds(445, 144, 213, 43);
		add(textousuario);
		
		yatienescuenta = new JLabel("Ya tienes cuenta?");
		yatienescuenta.setHorizontalAlignment(SwingConstants.RIGHT);
		yatienescuenta.setForeground(Color.WHITE);
		yatienescuenta.setFont(new Font("Microsoft YaHei", Font.BOLD, 27));
		yatienescuenta.setBounds(489, 514, 304, 43);
		add(yatienescuenta);
		
		teléfono = new JLabel("Correo electrónico");
		teléfono.setForeground(Color.WHITE);
		teléfono.setFont(new Font("Microsoft YaHei", Font.BOLD, 27));
		teléfono.setBounds(445, 342, 333, 36);
		add(teléfono);
		
		fondo = DefaultComponentFactory.getInstance().createLabel("");
		fondo.setBackground(new Color(13, 17, 28));
		fondo.setIcon(new ImageIcon(getClass().getResource("/Images/ImagenAcompañante2.png")));
		fondo.setBounds(0, -11, 366, 640);
		add(fondo);
		
		lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("");
		lblNewJgoodiesTitle.setIcon(new ImageIcon(getClass().getResource("/Images/UsuarioIcono.png")));
		lblNewJgoodiesTitle.setBounds(446, 196, 40, 40);
		add(lblNewJgoodiesTitle);
		
		lblNewJgoodiesTitle_1 = DefaultComponentFactory.getInstance().createTitle("");
		lblNewJgoodiesTitle_1.setIcon(new ImageIcon(getClass().getResource("/Images/PasswordIcono.png")));
		lblNewJgoodiesTitle_1.setBounds(446, 293, 40, 40);
		add(lblNewJgoodiesTitle_1);
		
		iconoTelefono = DefaultComponentFactory.getInstance().createTitle("");
		iconoTelefono.setIcon(new ImageIcon(getClass().getResource("/Images/CorreoIcono.png")));
		iconoTelefono.setBounds(446, 388, 40, 40);
		add(iconoTelefono);

		initStyles();
	}

	private void initStyles() {

	}
}

package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.jgoodies.forms.factories.DefaultComponentFactory;

public class LoginVista extends JPanel {

	private static final long serialVersionUID = 1L;

	public JButton btnRegistrar;
	public JButton btnIngresar;

	public JTextField txtUser;
	public JPasswordField txtPassword;

	private JLabel lblUsuario;
	private JLabel lblContrasea;
	private JLabel lblAnNoTienes;
	private JLabel logoApp;
	private JLabel lblTitulo;
	private JLabel lblFondo;
	private JLabel lblIconoUsuario;
	private JLabel lblIconoPassword;

	public LoginVista() {
		setBackground(new Color(66, 72, 93));
		setLayout(null); // IMPORTANTE
		setBounds(0, 0, 1140, 640); // IMPORTANTE

		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegistrar.setForeground(new Color(255, 255, 255));
		btnRegistrar.setBackground(new Color(255, 128, 0));
		btnRegistrar.setBounds(811, 513, 125, 50);
		add(btnRegistrar);

		btnIngresar = new JButton("INGRESAR");
		btnIngresar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnIngresar.setBackground(new Color(255, 128, 0));
		btnIngresar.setForeground(new Color(255, 255, 255));
		btnIngresar.setBounds(920, 433, 125, 50);
		add(btnIngresar);

		// CAMPO DE USUARIO CON PLACEHOLDER
		txtUser = new JTextField("Ingresar usuario");
		txtUser.setBounds(500, 243, 545, 38);
		txtUser.setForeground(Color.GRAY); // TEXTO EN GRIS PARA SIMULAR PLACEHOLDER
		add(txtUser);
		txtUser.setColumns(10);

		// CAMPO DE CONTRASEÑA CON PLACEHOLDER
		txtPassword = new JPasswordField("**********");
		txtPassword.setColumns(10);
		txtPassword.setBounds(500, 377, 545, 38);
		txtPassword.setForeground(Color.GRAY); // TEXTO EN GRIS PARA SIMULAR PLACEHOLDER
		txtPassword.setEchoChar((char) 0); // ELIMINA EL CARÁCTER DE ECO PARA MOSTRAR EL PLACEHOLDER
		add(txtPassword);

		lblFondo = DefaultComponentFactory.getInstance().createLabel("");
		lblFondo.setBackground(new Color(13, 17, 28));
		lblFondo.setIcon(new ImageIcon(getClass().getResource("/Images/ImagenAcompañante.png")));
		lblFondo.setBounds(0, -11, 366, 640);
		add(lblFondo);

		logoApp = DefaultComponentFactory.getInstance().createLabel("");
		logoApp.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacion.png")));
		logoApp.setBounds(602, 51, 285, 69);
		add(logoApp);

		lblTitulo = new JLabel("Inicia Sesión en Moviz");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Microsoft YaHei", Font.BOLD, 27));
		lblTitulo.setBounds(573, 131, 333, 36);
		add(lblTitulo);

		lblUsuario = new JLabel("Contraseña");
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setFont(new Font("Microsoft YaHei", Font.BOLD, 27));
		lblUsuario.setBounds(446, 328, 333, 36);
		add(lblUsuario);

		lblContrasea = new JLabel("Usuario");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Microsoft YaHei", Font.BOLD, 27));
		lblContrasea.setBounds(446, 189, 213, 43);
		add(lblContrasea);

		lblAnNoTienes = new JLabel("Aún no tienes cuenta?");
		lblAnNoTienes.setForeground(Color.WHITE);
		lblAnNoTienes.setFont(new Font("Microsoft YaHei", Font.BOLD, 27));
		lblAnNoTienes.setBounds(491, 515, 333, 43);
		add(lblAnNoTienes);

		lblIconoUsuario = DefaultComponentFactory.getInstance().createTitle("");
		lblIconoUsuario.setIcon(new ImageIcon(getClass().getResource("/Images/UsuarioIcono.png")));
		lblIconoUsuario.setBounds(446, 240, 40, 40);
		add(lblIconoUsuario);

		lblIconoPassword = DefaultComponentFactory.getInstance().createTitle("");
		lblIconoPassword.setIcon(new ImageIcon(getClass().getResource("/Images/PasswordIcono.png")));
		lblIconoPassword.setBounds(446, 373, 40, 40);
		add(lblIconoPassword);

		initStyles(); // INICIALIZA LOS LISTENERS PARA PLACEHOLDERS
	}

	// MÉTODO PARA INICIALIZAR LOS LISTENERS Y EL COMPORTAMIENTO DE LOS PLACEHOLDERS
	private void initStyles() {

	}
}

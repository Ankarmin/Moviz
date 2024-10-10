package Vista;

import javax.swing.*;
import java.awt.*;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class RegistrarVista extends JPanel {

	private static final long serialVersionUID = 1L;

	// COMPONENTES PÚBLICOS PARA ACCEDER DESDE OTRAS CLASES
	public JTextField txtUser;
	public JPasswordField txtPassword;
	public JTextField txtEmail;

	public JButton btnRegistrar;
	public JButton btnIniciarSesion;

	// OTROS COMPONENTES VISUALES
	private JLabel logoApp;
	private JLabel lblTitulo;
	private JLabel textocontraseña;
	private JLabel textousuario;
	private JLabel yatienescuenta;
	private JLabel teléfono;
	private JLabel fondo;
	private JLabel lblNewJgoodiesTitle;
	private JLabel lblNewJgoodiesTitle_1;
	private JLabel iconoTelefono;

	public RegistrarVista() {
		// CONFIGURACIÓN INICIAL DEL PANEL
		setBackground(new Color(66, 72, 93));
		setLayout(null); // IMPORTANTE
		setBounds(0, 0, 1140, 640); // IMPORTANTE

		// CAMPO DE USUARIO CON PLACEHOLDER
		txtUser = new JTextField("Ingresar usuario");
		txtUser.setBounds(499, 198, 545, 38);
		txtUser.setForeground(Color.GRAY); // COLOR DEL PLACEHOLDER
		add(txtUser);
		txtUser.setColumns(10);

		// CAMPO DE CONTRASEÑA CON PLACEHOLDER
		txtPassword = new JPasswordField("**********");
		txtPassword.setColumns(10);
		txtPassword.setBounds(499, 294, 545, 38);
		txtPassword.setForeground(Color.GRAY); // COLOR DEL PLACEHOLDER
		txtPassword.setEchoChar((char) 0); // ELIMINA EL CARÁCTER DE ECO PARA MOSTRAR EL PLACEHOLDER
		add(txtPassword);

		// CAMPO DE CORREO ELECTRÓNICO CON PLACEHOLDER
		txtEmail = new JTextField("Ingresar correo electrónico");
		txtEmail.setColumns(10);
		txtEmail.setBounds(499, 389, 545, 38);
		txtEmail.setForeground(Color.GRAY); // COLOR DEL PLACEHOLDER
		add(txtEmail);

		// BOTÓN "REGISTRAR"
		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegistrar.setForeground(new Color(255, 255, 255));
		btnRegistrar.setBackground(new Color(255, 128, 0));
		btnRegistrar.setBounds(919, 438, 125, 50);
		add(btnRegistrar);

		// BOTÓN "INICIAR SESIÓN"
		btnIniciarSesion = new JButton("INICIAR SESIÓN");
		btnIniciarSesion.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnIniciarSesion.setForeground(new Color(255, 255, 255));
		btnIniciarSesion.setBackground(new Color(255, 128, 0));
		btnIniciarSesion.setBounds(783, 512, 160, 50);
		add(btnIniciarSesion);

		// ICONO DE LA APLICACIÓN
		logoApp = DefaultComponentFactory.getInstance().createLabel("");
		logoApp.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacion.png")));
		logoApp.setBounds(602, 26, 285, 69);
		add(logoApp);

		// TÍTULO PRINCIPAL
		lblTitulo = new JLabel("Crea tu cuenta en Moviz");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Microsoft YaHei", Font.BOLD, 27));
		lblTitulo.setBounds(562, 106, 344, 36);
		add(lblTitulo);

		// ETIQUETA PARA CONTRASEÑA
		textocontraseña = new JLabel("Contraseña");
		textocontraseña.setForeground(Color.WHITE);
		textocontraseña.setFont(new Font("Microsoft YaHei", Font.BOLD, 27));
		textocontraseña.setBounds(445, 247, 333, 36);
		add(textocontraseña);

		// ETIQUETA PARA USUARIO
		textousuario = new JLabel("Usuario");
		textousuario.setForeground(Color.WHITE);
		textousuario.setFont(new Font("Microsoft YaHei", Font.BOLD, 27));
		textousuario.setBounds(445, 144, 213, 43);
		add(textousuario);

		// TEXTO "YA TIENES CUENTA?"
		yatienescuenta = new JLabel("Ya tienes cuenta?");
		yatienescuenta.setHorizontalAlignment(SwingConstants.RIGHT);
		yatienescuenta.setForeground(Color.WHITE);
		yatienescuenta.setFont(new Font("Microsoft YaHei", Font.BOLD, 27));
		yatienescuenta.setBounds(463, 514, 304, 43);
		add(yatienescuenta);

		// ETIQUETA PARA CORREO ELECTRÓNICO
		teléfono = new JLabel("Correo electrónico");
		teléfono.setForeground(Color.WHITE);
		teléfono.setFont(new Font("Microsoft YaHei", Font.BOLD, 27));
		teléfono.setBounds(445, 342, 333, 36);
		add(teléfono);

		// IMAGEN DE FONDO
		fondo = DefaultComponentFactory.getInstance().createLabel("");
		fondo.setBackground(new Color(13, 17, 28));
		fondo.setIcon(new ImageIcon(getClass().getResource("/Images/ImagenAcompañante2.png")));
		fondo.setBounds(0, -11, 366, 640);
		add(fondo);

		// ICONO DE USUARIO
		lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("");
		lblNewJgoodiesTitle.setIcon(new ImageIcon(getClass().getResource("/Images/UsuarioIcono.png")));
		lblNewJgoodiesTitle.setBounds(446, 196, 40, 40);
		add(lblNewJgoodiesTitle);

		// ICONO DE CONTRASEÑA
		lblNewJgoodiesTitle_1 = DefaultComponentFactory.getInstance().createTitle("");
		lblNewJgoodiesTitle_1.setIcon(new ImageIcon(getClass().getResource("/Images/PasswordIcono.png")));
		lblNewJgoodiesTitle_1.setBounds(446, 293, 40, 40);
		add(lblNewJgoodiesTitle_1);

		// ICONO DE CORREO ELECTRÓNICO
		iconoTelefono = DefaultComponentFactory.getInstance().createTitle("");
		iconoTelefono.setIcon(new ImageIcon(getClass().getResource("/Images/CorreoIcono.png")));
		iconoTelefono.setBounds(446, 388, 40, 40);
		add(iconoTelefono);

		// INICIALIZACIÓN DE LOS LISTENERS DE FOCUS PARA LOS PLACEHOLDERS
		initStyles();
	}

	// MÉTODO PARA INICIALIZAR LOS LISTENERS Y EL COMPORTAMIENTO DE LOS PLACEHOLDERS
	private void initStyles() {
		// PLACEHOLDER PARA EL CAMPO DE USUARIO
		txtUser.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				if (txtUser.getText().equals("Ingresar usuario")) {
					txtUser.setText(""); // ELIMINA EL PLACEHOLDER CUANDO EL USUARIO HACE CLIC
					txtUser.setForeground(Color.WHITE); // CAMBIA EL TEXTO A BLANCO
				}
			}

			public void focusLost(FocusEvent e) {
				if (txtUser.getText().isEmpty()) {
					txtUser.setForeground(Color.GRAY);
					txtUser.setText("Ingresar usuario"); // RESTAURA EL PLACEHOLDER SI ESTÁ VACÍO
				}
			}
		});

		// PLACEHOLDER PARA EL CAMPO DE CONTRASEÑA
		txtPassword.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				String password = new String(txtPassword.getPassword());
				if (password.equals("**********")) {
					txtPassword.setText(""); // ELIMINA EL PLACEHOLDER CUANDO EL USUARIO HACE CLIC
					txtPassword.setForeground(Color.WHITE); // CAMBIA EL TEXTO A BLANCO
					txtPassword.setEchoChar('●'); // ESTABLECE EL CARÁCTER DE ECO CUANDO EL USUARIO EMPIEZA A
													// ESCRIBIR
				}
			}

			public void focusLost(FocusEvent e) {
				String password = new String(txtPassword.getPassword());
				if (password.isEmpty()) {
					txtPassword.setForeground(Color.GRAY);
					txtPassword.setText("**********"); // RESTAURA EL PLACEHOLDER SI ESTÁ VACÍO
					txtPassword.setEchoChar((char) 0); // ELIMINA EL CARÁCTER DE ECO PARA MOSTRAR EL PLACEHOLDER
				}
			}
		});

		// PLACEHOLDER PARA EL CAMPO DE CORREO ELECTRÓNICO
		txtEmail.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				if (txtEmail.getText().equals("Ingresar correo electrónico")) {
					txtEmail.setText(""); // ELIMINA EL PLACEHOLDER CUANDO EL USUARIO HACE CLIC
					txtEmail.setForeground(Color.WHITE); // CAMBIA EL TEXTO A BLANCO
				}
			}

			public void focusLost(FocusEvent e) {
				if (txtEmail.getText().isEmpty()) {
					txtEmail.setForeground(Color.GRAY);
					txtEmail.setText("Ingresar correo electrónico"); // RESTAURA EL PLACEHOLDER SI ESTÁ VACÍO
				}
			}
		});
	}
}

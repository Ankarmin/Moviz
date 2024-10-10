package Vista;

import javax.swing.*;
import java.awt.*;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class RegistrarVista extends JPanel {

	private static final long serialVersionUID = 1L;

	public JTextField txtUser;
	public JPasswordField txtPassword; // Cambiado a JPasswordField
	public JTextField txtEmail;

	public JButton btnRegistrar;
	public JButton btnIniciarSesion;

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
		setBackground(new Color(66, 72, 93));
		setLayout(null); // IMPORTANTE
		setBounds(0, 0, 1140, 640); // IMPORTANTE

		// Campo de usuario con placeholder
		txtUser = new JTextField("Ingresar usuario");
		txtUser.setBounds(499, 198, 545, 38);
		txtUser.setForeground(Color.GRAY); // Placeholder color
		add(txtUser);
		txtUser.setColumns(10);

		// Campo de contraseña con placeholder
		txtPassword = new JPasswordField("**********");
		txtPassword.setColumns(10);
		txtPassword.setBounds(499, 294, 545, 38);
		txtPassword.setForeground(Color.GRAY); // Placeholder color
		add(txtPassword);

		// Campo de correo electrónico con placeholder
		txtEmail = new JTextField("Ingresar correo electrónico");
		txtEmail.setColumns(10);
		txtEmail.setBounds(499, 389, 545, 38);
		txtEmail.setForeground(Color.GRAY); // Placeholder color
		add(txtEmail);

		// Botón "Registrar"
		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setForeground(new Color(255, 255, 255));
		btnRegistrar.setBackground(new Color(255, 128, 0));
		btnRegistrar.setBounds(919, 438, 125, 50);
		add(btnRegistrar);

		// Botón "Iniciar Sesión"
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

		// Añadir los listeners de focus para simular los placeholders
		initStyles();
	}

	private void initStyles() {
	    // Placeholder para el campo de usuario
	    txtUser.addFocusListener(new FocusAdapter() {
	        public void focusGained(FocusEvent e) {
	            if (txtUser.getText().equals("Ingresar usuario")) {
	                txtUser.setText(""); // Elimina el placeholder cuando el usuario hace clic
	                txtUser.setForeground(Color.WHITE); // Cambia el texto a blanco
	            }
	        }

	        public void focusLost(FocusEvent e) {
	            if (txtUser.getText().isEmpty()) {
	                txtUser.setForeground(Color.GRAY);
	                txtUser.setText("Ingresar usuario"); // Restaura el placeholder si está vacío
	            }
	        }
	    });

	    // Placeholder para el campo de contraseña
	    txtPassword.addFocusListener(new FocusAdapter() {
	        public void focusGained(FocusEvent e) {
	            String password = new String(txtPassword.getPassword());
	            if (password.equals("**********")) {
	                txtPassword.setText(""); // Elimina el placeholder cuando el usuario hace clic
	                txtPassword.setForeground(Color.WHITE); // Cambia el texto a blanco
	            }
	        }

	        public void focusLost(FocusEvent e) {
	            String password = new String(txtPassword.getPassword());
	            if (password.isEmpty()) {
	                txtPassword.setForeground(Color.GRAY);
	                txtPassword.setText("**********"); // Restaura el placeholder si está vacío
	            }
	        }
	    });

	    // Placeholder para el campo de correo electrónico
	    txtEmail.addFocusListener(new FocusAdapter() {
	        public void focusGained(FocusEvent e) {
	            if (txtEmail.getText().equals("Ingresar correo electrónico")) {
	                txtEmail.setText(""); // Elimina el placeholder cuando el usuario hace clic
	                txtEmail.setForeground(Color.WHITE); // Cambia el texto a blanco
	            }
	        }

	        public void focusLost(FocusEvent e) {
	            if (txtEmail.getText().isEmpty()) {
	                txtEmail.setForeground(Color.GRAY);
	                txtEmail.setText("Ingresar correo electrónico"); // Restaura el placeholder si está vacío
	            }
	        }
	    });
	}
}

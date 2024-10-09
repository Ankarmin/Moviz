package Vista;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class LoginVista extends JPanel {

	private static final long serialVersionUID = 1L;
	public JButton btnRegistrar;
	public JButton btnIngresar;
	public JTextField txtUser;
	public JTextField txtPassword;
	private JLabel lblUsuario;
	private JLabel lblContrasea;
	private JLabel lblAnNoTienes;
	private JLabel logoApp;
	private JLabel lblTitulo;

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

		txtUser = new JTextField();
		txtUser.setText("Ingresar usuario");
		txtUser.setBounds(500, 243, 545, 38);
		add(txtUser);
		txtUser.setColumns(10);

		txtPassword = new JTextField();
		txtPassword.setText("**********");
		txtPassword.setColumns(10);
		txtPassword.setBounds(500, 377, 545, 38);
		add(txtPassword);
		
		JLabel Fondo = DefaultComponentFactory.getInstance().createLabel("");
		Fondo.setBackground(new Color(13, 17, 28));
		Fondo.setIcon(new ImageIcon(getClass().getResource("/Images/ImagenAcompañante.png")));
		Fondo.setBounds(0, -11, 366, 640);
		add(Fondo);
		
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
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("");
		lblNewJgoodiesTitle.setIcon(new ImageIcon(getClass().getResource("/Images/UsuarioIcono.png")));
		lblNewJgoodiesTitle.setBounds(446, 240, 40, 40);
		add(lblNewJgoodiesTitle);
		
		JLabel lblNewJgoodiesTitle_1 = DefaultComponentFactory.getInstance().createTitle("");
		lblNewJgoodiesTitle_1.setIcon(new ImageIcon(getClass().getResource("/Images/PasswordIcono.png")));
		lblNewJgoodiesTitle_1.setBounds(446, 373, 40, 40);
		add(lblNewJgoodiesTitle_1);
		
		// Utilizar el siguiente codigo para poner la imagen que desees:  setIcon(new ImageIcon(getClass().getResource("/Images/NOMBREDETUIMAGEN.png"))
		// Esa imagen tuvo que haber sido subida en la carpeta Moviz\src\main\resources\Images
		initStyles();
		
	}

	private void initStyles() {

	}
}

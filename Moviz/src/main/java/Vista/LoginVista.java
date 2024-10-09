package Vista;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;


public class LoginVista extends JPanel {

	private static final long serialVersionUID = 1L;
	public JButton btnRegistrar;
	public JButton btnIngresar;
	public JTextField txtUser;
	public JTextField txtPassword;

	public LoginVista() {
		setLayout(null); // IMPORTANTE
		setBounds(0, 0, 1140, 640); // IMPORTANTE

		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setBounds(723, 377, 125, 50);
		add(btnRegistrar);

		btnIngresar = new JButton("INGRESAR");
		btnIngresar.setBounds(559, 377, 125, 50);
		add(btnIngresar);

		txtUser = new JTextField();
		txtUser.setBounds(640, 190, 181, 38);
		add(txtUser);
		txtUser.setColumns(10);

		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(608, 269, 181, 38);
		add(txtPassword);
		
		JLabel Fondo = DefaultComponentFactory.getInstance().createLabel("");
		Fondo.setBackground(new Color(13, 17, 28));
		Fondo.setIcon(new ImageIcon(getClass().getResource("/Images/ImagenAcompañante.png")));
		Fondo.setBounds(0, 0, 366, 640);
		add(Fondo);
		
		JLabel LogoApp = DefaultComponentFactory.getInstance().createLabel("");
		LogoApp.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacion.png")));
		LogoApp.setBounds(602, 51, 285, 69);
		add(LogoApp);
		
		JLabel lblTitulo = new JLabel("Inicia Sesión en Moviz");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Monospaced", Font.BOLD, 27));
		lblTitulo.setBounds(550, 131, 445, 36);
		add(lblTitulo);
		
		initStyles();
		
		
		
		
	}

	private void initStyles() {

	}
}

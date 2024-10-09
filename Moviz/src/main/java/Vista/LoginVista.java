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

	public LoginVista() {
		setLayout(null); // IMPORTANTE
		setBounds(0, 0, 1140, 640); // IMPORTANTE

		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrar.setBounds(811, 513, 125, 50);
		add(btnRegistrar);

		btnIngresar = new JButton("INGRESAR");
		btnIngresar.setBounds(920, 433, 125, 50);
		add(btnIngresar);

		txtUser = new JTextField();
		txtUser.setBounds(446, 243, 599, 38);
		add(txtUser);
		txtUser.setColumns(10);

		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(446, 377, 599, 38);
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
		lblAnNoTienes.setBounds(491, 510, 333, 43);
		add(lblAnNoTienes);
		
		initStyles();
		
		
		
		
	}

	private void initStyles() {

	}
}

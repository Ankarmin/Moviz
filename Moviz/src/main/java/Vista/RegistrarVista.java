package Vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class RegistrarVista extends JPanel {

	private static final long serialVersionUID = 1L;
	public JTextField txtUser;
	public JTextField txtPassword;
	public JTextField txtEmail;
	public JButton btnRegistrar;
	public JButton btnIniciarSesion;

	public RegistrarVista() {
		setLayout(null); // IMPORTANTE
		setBounds(0, 0, 1140, 640); // IMPORTANTE

		txtUser = new JTextField();
		txtUser.setBounds(161, 125, 225, 52);
		add(txtUser);
		txtUser.setColumns(10);

		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(161, 218, 225, 52);
		add(txtPassword);

		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(161, 300, 225, 52);
		add(txtEmail);

		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setBounds(199, 396, 125, 50);
		add(btnRegistrar);

		btnIniciarSesion = new JButton("INICIAR SESIÓN");
		btnIniciarSesion.setBounds(199, 476, 125, 50);
		add(btnIniciarSesion);

		initStyles();
	}

	private void initStyles() {

	}
}

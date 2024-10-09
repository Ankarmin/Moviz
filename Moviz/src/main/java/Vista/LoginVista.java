package Vista;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
		txtUser.setBounds(587, 135, 181, 38);
		add(txtUser);
		txtUser.setColumns(10);

		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(587, 211, 181, 38);
		add(txtPassword);

		initStyles();
	}

	private void initStyles() {

	}
}

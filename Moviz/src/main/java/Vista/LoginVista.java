package Vista;

import javax.swing.JButton;
import javax.swing.JPanel;

public class LoginVista extends JPanel {

	private static final long serialVersionUID = 1L;
	public JButton btnRegistrar;
	public JButton btnIngresar;

	public LoginVista() {
		setLayout(null);
		setBounds(0, 0, 1140, 640);

		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setBounds(723, 377, 125, 50);
		add(btnRegistrar);

		btnIngresar = new JButton("INGRESAR");
		btnIngresar.setBounds(559, 377, 125, 50);
		add(btnIngresar);

		initStyles();
	}

	private void initStyles() {

	}
}

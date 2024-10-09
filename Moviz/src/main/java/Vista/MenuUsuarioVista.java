package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

public class MenuUsuarioVista extends JPanel {

	private static final long serialVersionUID = 1L;
	public JLabel lblNewLabel;
	public JButton btnSalir;

	public MenuUsuarioVista() {
		setLayout(null); // IMPORTANTE
		setBounds(0, 0, 1140, 640); // IMPORTANTE

		lblNewLabel = new JLabel("MENU USUARIO");
		lblNewLabel.setBounds(246, 175, 245, 75);
		add(lblNewLabel);

		btnSalir = new JButton("SALIR");
		btnSalir.setBounds(610, 32, 135, 47);
		add(btnSalir);

		initStyles();
	}

	private void initStyles() {

	}
}

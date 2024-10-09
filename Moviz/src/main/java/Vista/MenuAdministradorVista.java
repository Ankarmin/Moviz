package Vista;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class MenuAdministradorVista extends JPanel {

	private static final long serialVersionUID = 1L;
	public JLabel lblNewLabel;
	public JButton btnSalir;

	public MenuAdministradorVista() {
		setLayout(null); // IMPORTANTE
		setBounds(0, 0, 1140, 640); // IMPORTANTE

		lblNewLabel = new JLabel("MENU ADMINISTRADOR");
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

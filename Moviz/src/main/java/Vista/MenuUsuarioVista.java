package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.ImageIcon;
import java.awt.Canvas;
import java.awt.FlowLayout;
import javax.swing.JTextField;

public class MenuUsuarioVista extends JPanel {

	private static final long serialVersionUID = 1L;
	public JLabel lblNewLabel;
	public JButton btnSalir;
	private JTextField txtBuscar;

	public MenuUsuarioVista() {
		setBackground(new Color(66, 72, 93));
		setLayout(null); // IMPORTANTE
		setBounds(0, 0, 1140, 640); // IMPORTANTE
		
		JButton btnSalir_1 = new JButton("");
		btnSalir_1.setIcon(new ImageIcon(MenuUsuarioVista.class.getResource("/Images/iconosalida.png")));
		btnSalir_1.setBounds(1065, 12, 42, 46);
		add(btnSalir_1);
		
		JButton BotonHistorial = new JButton("HISTORIAL");
		BotonHistorial.setBounds(878, 19, 120, 35);
		add(BotonHistorial);
		
		JButton BotonPeliculas = new JButton("PELICULAS");
		BotonPeliculas.setBounds(748, 19, 120, 35);
		add(BotonPeliculas);
		
		JLabel Busqueda = DefaultComponentFactory.getInstance().createLabel("");
		Busqueda.setIcon(new ImageIcon(getClass().getResource("/Images/BuscarIcono.png")));
		Busqueda.setBounds(280, 17, 40, 40);
		add(Busqueda);

		lblNewLabel = new JLabel("MENU USUARIO");
		lblNewLabel.setBounds(246, 175, 245, 41);
		add(lblNewLabel);

		btnSalir = new JButton("SALIR");
		btnSalir.setBounds(995, 504, 135, 47);
		add(btnSalir);
		
		JLabel IconoLogo = DefaultComponentFactory.getInstance().createLabel("");
		IconoLogo.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacion.png")));
		IconoLogo.setBounds(4, 6, 283, 56);
		add(IconoLogo);
		
		txtBuscar = new JTextField();
		txtBuscar.setText("Buscar");
		txtBuscar.setBounds(322, 21, 407, 32);
		add(txtBuscar);
		txtBuscar.setColumns(10);
		
		JPanel panel = new JPanel();
		
		panel.setBackground(new Color(56, 59, 74));
		panel.setBounds(0, 0, 1225, 69);
		add(panel);

		initStyles();
	}

	private void initStyles() {

	}
}

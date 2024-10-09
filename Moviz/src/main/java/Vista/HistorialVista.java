package Vista;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.jgoodies.forms.factories.DefaultComponentFactory;

public class HistorialVista extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton btnSalir;
	private JButton BtnHistorial;
	private JButton BotonPeliculas;
	private JLabel Busqueda;
	private JLabel IconoLogo;
	private JTextField txtBuscar;
	private JPanel panel;

	/**
	 * Create the panel.
	 */
	public HistorialVista() {
		setBackground(new Color(66, 72, 93));
		setLayout(null); // IMPORTANTE
		setBounds(0, 0, 1140, 640); // IMPORTANTE
		
		btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon(MenuUsuarioVista.class.getResource("/Images/iconosalida.png")));
		btnSalir.setBounds(1065, 12, 42, 46);
		add(btnSalir);
		
		BtnHistorial = new JButton("HISTORIAL");
		BtnHistorial.setBounds(878, 19, 120, 35);
		add(BtnHistorial);
		
		BotonPeliculas = new JButton("PELICULAS");
		BotonPeliculas.setBounds(748, 19, 120, 35);
		add(BotonPeliculas);
		
		Busqueda = DefaultComponentFactory.getInstance().createLabel("");
		Busqueda.setIcon(new ImageIcon(getClass().getResource("/Images/BuscarIcono.png")));
		Busqueda.setBounds(280, 17, 40, 40);
		add(Busqueda);

		
		IconoLogo = DefaultComponentFactory.getInstance().createLabel("");
		IconoLogo.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacion.png")));
		IconoLogo.setBounds(4, 6, 283, 56);
		add(IconoLogo);
		
		txtBuscar = new JTextField();
		txtBuscar.setText("Buscar");
		txtBuscar.setBounds(322, 21, 407, 32);
		add(txtBuscar);
		txtBuscar.setColumns(10);
		
		panel = new JPanel();
		
		panel.setBackground(new Color(56, 59, 74));
		panel.setBounds(0, 0, 1225, 69);
		add(panel);
	}

}

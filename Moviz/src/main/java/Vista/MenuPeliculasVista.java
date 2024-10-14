package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import com.jgoodies.forms.factories.DefaultComponentFactory;

public class MenuPeliculasVista extends JPanel {

	private static final long serialVersionUID = 1L;

	// VARIABLES JLABEL
	public JLabel lblBusqueda;
	public JLabel lblIconoLogo;
	public JLabel lblNewJgoodiesLabel1;
	public JLabel lblNewLabel;

	// VARIABLES JTEXTFIELD
	public JTextField txtBuscar;

	// VARIABLES JBUTTON
	public JButton btnSalir;
	public JButton btnHistorial;
	public JButton btnPeliculas;

	// VARIABLES JPANEL
	public JPanel pnlPrincipal;
	public JPanel pnlGrid;
	public JPanel pnlLineaBlanca;

	// VARIABLES JSCROLLPANE
	public JScrollPane spTablaPeliculas;

	// VARIABLES JCOMBOBOX
	public JComboBox<String> comboBoxGenero;
	public JComboBox<String> comboBoxAño;
	public JComboBox<String> comboBoxPuntuacion;

	// CONSTRUCTOR PARA CONFIGURAR LA VISTA
	public MenuPeliculasVista() {
		// CONFIGURACIÓN DEL PANEL
		setBackground(new Color(66, 72, 93));
		setLayout(null);
		setBounds(0, 0, 1140, 640);

		// PANEL LÍNEA BLANCA
		pnlLineaBlanca = new JPanel();
		pnlLineaBlanca.setBackground(Color.WHITE);
		pnlLineaBlanca.setBounds(26, 123, 1060, 2);
		add(pnlLineaBlanca);

		// ETIQUETA "BUSCAR POR"
		lblNewJgoodiesLabel1 = DefaultComponentFactory.getInstance().createLabel("Buscar por");
		lblNewJgoodiesLabel1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblNewJgoodiesLabel1.setForeground(new Color(255, 255, 255));
		lblNewJgoodiesLabel1.setBounds(26, 98, 135, 14);
		add(lblNewJgoodiesLabel1);

		// BOTÓN "SALIR" CON ICONO
		btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon(MenuUsuarioVista.class.getResource("/Images/iconosalida.png")));
		btnSalir.setBounds(1065, 12, 42, 46);
		add(btnSalir);

		// BOTÓN "HISTORIAL"
		btnHistorial = new JButton("HISTORIAL");
		btnHistorial.setBounds(878, 19, 120, 35);
		add(btnHistorial);

		// BOTÓN "PELICULAS"
		btnPeliculas = new JButton("PELICULAS");
		btnPeliculas.setBounds(748, 19, 120, 35);
		add(btnPeliculas);

		// ETIQUETA "BUSCAR"
		lblBusqueda = DefaultComponentFactory.getInstance().createLabel("");
		lblBusqueda.setIcon(new ImageIcon(getClass().getResource("/Images/BuscarIcono.png")));
		lblBusqueda.setBounds(280, 17, 40, 40);
		add(lblBusqueda);

		// ICONO DEL LOGO
		lblIconoLogo = DefaultComponentFactory.getInstance().createLabel("");
		lblIconoLogo.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacion.png")));
		lblIconoLogo.setBounds(4, 6, 283, 56);
		add(lblIconoLogo);

		// CAMPO DE TEXTO "BUSCAR"
		txtBuscar = new JTextField();
		txtBuscar.setText("Buscar");
		txtBuscar.setBounds(322, 21, 407, 32);
		add(txtBuscar);
		txtBuscar.setColumns(10);

		// PANEL PRINCIPAL
		pnlPrincipal = new JPanel();
		pnlPrincipal.setBackground(new Color(56, 59, 74));
		pnlPrincipal.setBounds(0, 0, 1225, 69);
		add(pnlPrincipal);

		// CONFIGURAR EL SCROLLPANE
		spTablaPeliculas = new JScrollPane();
		spTablaPeliculas.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		spTablaPeliculas.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		spTablaPeliculas.setBounds(26, 136, 1060, 437);
		add(spTablaPeliculas);

		// CREAR EL PANEL QUE CONTENDRÁ LA CUADRÍCULA
		pnlGrid = new JPanel();
		pnlGrid.setLayout(new GridLayout(0, 3, 10, 10)); // 0 filas, 3 columnas, con 10px de espacio entre celdas
		spTablaPeliculas.setViewportView(pnlGrid);

		// CREAR UN COMBOBOX PARA LAS OPCIONES DESPLEGABLES
		String[] generos = { "Todos", "Acción", "Aventura", "Animación", "Comedia", "Crimen", "Documental", "Drama",
				"Familia", "Fantasía", "Historia", "Terror", "Música", "Misterio", "Romance", "Ciencia Ficción",
				"Película de TV", "Suspense", "Bélico", "Western" };

		comboBoxGenero = new JComboBox<>(generos);
		comboBoxGenero.setBounds(254, 81, 150, 35);
		add(comboBoxGenero);

		// CREAR UN COMBOBOX PARA LAS OPCIONES DESPLEGABLES DE AÑO
		String[] año = { "Todos", "2020s", "2010s", "2000s", "1990s", "1980s", "1970s", "1960s", "1950s", "1940s",
				"1930s", "1920s", "1910s", "1900s", "1890s" };

		comboBoxAño = new JComboBox<>(año);
		comboBoxAño.setBounds(491, 81, 150, 35);
		add(comboBoxAño);

		// CREAR UN COMBOBOX PARA LAS OPCIONES DE PUNTUACIÓN
		String[] puntuacion = { "Todos", "5-4", "4-3", "3-2", "2-1", "0-1" };
		comboBoxPuntuacion = new JComboBox<>(puntuacion);
		comboBoxPuntuacion.setBounds(794, 81, 150, 35);
		add(comboBoxPuntuacion);
	}
}
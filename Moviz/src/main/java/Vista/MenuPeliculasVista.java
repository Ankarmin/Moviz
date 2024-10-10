package Vista;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;

public class MenuPeliculasVista extends JPanel {

	private static final long serialVersionUID = 1L;

	// VARIABLES JLABEL
	public JLabel lblBusqueda;
	public JLabel lblIconoLogo;
	public JLabel lblNewJgoodiesLabel1;
	public JLabel lblNewLabel;
	public JLabel lblImagen;
	public JLabel lblTitulo;

	// VARIABLES JTEXTFIELD
	public JTextField txtBuscar;
	public JTextField txtAsdfasdfasdf;

	// VARIABLES JBUTTON
	public JButton btnSalir;
	public JButton btnHistorial;
	public JButton btnPeliculas;

	// VARIABLES JPANEL
	public JPanel pnlPrincipal;
	public JPanel pnlGrid;
	public JPanel pnlLineaBlanca;
	public JPanel panel_1;
	public JPanel panelItem;

	// VARIABLES JSCROLLPANE
	public JScrollPane spTablaPeliculas;

	// VARIABLES JCOMBOBOX
	public JComboBox<String> comboBoxGenero;
	public JComboBox<String> comboBoxAño;
	public JComboBox<String> comboBoxPuntuacion;

	// VARIABLES JTEXTAREA
	public JTextArea txtrPuntuacion;
	public JTextArea txtGenero;
	public JTextArea txtGenero_1;

	// VARIABLES RELACIONADAS CON IMÁGENES
	public ImageIcon originalIcon;
	public Image imagenRedimensionada;
	public ImageIcon iconoRedimensionado;

	// CONSTRUCTOR PARA CONFIGURAR LA VISTA
	public MenuPeliculasVista() {
		// CONFIGURACIÓN DEL PANEL
		setBackground(new Color(66, 72, 93));
		setLayout(null); // IMPORTANTE
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
		pnlGrid.setLayout(new GridLayout(3, 4, 10, 10)); // 3 FILAS, 4 COLUMNAS, CON 10PX DE ESPACIO ENTRE CELDAS
		spTablaPeliculas.setViewportView(pnlGrid);

		// CREAR UN COMBOBOX PARA LAS OPCIONES DESPLEGABLES
		String[] generos = { "Todos", "Acción", "Aventura", "Animación", "Comedia", "Crimen", "Documental", "Drama",
				"Familia", "Fantasía", "Historia", "Terror", "Música", "Misterio", "Romance", "Ciencia Ficción",
				"Película de TV", "Suspense", "Bélico", "Western" };

		// CREAR UN COMBOBOX PARA LAS OPCIONES DESPLEGABLES DE AÑO
		String[] año = { "Todos", "2020s", "2010s", "2000s", "1990s", "1980s", "1970s", "1960s", "1950s", "1940s",
				"1930s", "1920s", "1910s", "1900s", "1890s" };

		// OPCIONES DE PUNTUACIÓN
		String[] puntuacion = { "Todos", "5-4", "4-3", "3-2", "2-1", "0-1" };

		// COMBOBOX DE GÉNERO
		comboBoxGenero = new JComboBox<>(generos);
		comboBoxGenero.setBounds(254, 81, 150, 35); // POSICIONA EL JCOMBOBOX
		add(comboBoxGenero);

		// COMBOBOX DE AÑO
		comboBoxAño = new JComboBox<String>(año);
		comboBoxAño.setBounds(491, 81, 150, 35);
		add(comboBoxAño);

		// COMBOBOX DE PUNTUACIÓN
		comboBoxPuntuacion = new JComboBox<String>(puntuacion);
		comboBoxPuntuacion.setBounds(794, 81, 150, 35);
		add(comboBoxPuntuacion);

		// AGREGAR ACTIONLISTENER AL COMBOBOX DE GÉNERO
		comboBoxGenero.addActionListener(e -> {
			String opcionSeleccionada = (String) comboBoxGenero.getSelectedItem();
			if (!opcionSeleccionada.equals("Todos")) {
				JOptionPane.showMessageDialog(null, "Seleccionaste género: " + opcionSeleccionada);
			}
		});

		// AGREGAR ACTIONLISTENER AL COMBOBOX DE AÑO
		comboBoxAño.addActionListener(e -> {
			String opcionSeleccionada = (String) comboBoxAño.getSelectedItem();
			JOptionPane.showMessageDialog(null, "Seleccionaste año: " + opcionSeleccionada);
		});

		// AGREGAR ACTIONLISTENER AL COMBOBOX DE PUNTUACIÓN
		comboBoxPuntuacion.addActionListener(e -> {
			String opcionSeleccionada = (String) comboBoxPuntuacion.getSelectedItem();
			JOptionPane.showMessageDialog(null, "Seleccionaste puntuación: " + opcionSeleccionada);
		});

		// TEXTO "GÉNERO"
		txtGenero = new JTextArea();
		txtGenero.setWrapStyleWord(true);
		txtGenero.setText("Genero:");
		txtGenero.setTabSize(10);
		txtGenero.setRows(3);
		txtGenero.setLineWrap(true);
		txtGenero.setForeground(Color.WHITE);
		txtGenero.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		txtGenero.setBackground(new Color(66, 72, 93));
		txtGenero.setBounds(167, 86, 98, 24);
		add(txtGenero);

		// TEXTO "AÑO"
		txtGenero_1 = new JTextArea();
		txtGenero_1.setWrapStyleWord(true);
		txtGenero_1.setText("Año:");
		txtGenero_1.setTabSize(10);
		txtGenero_1.setRows(3);
		txtGenero_1.setLineWrap(true);
		txtGenero_1.setForeground(Color.WHITE);
		txtGenero_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		txtGenero_1.setBackground(new Color(66, 72, 93));
		txtGenero_1.setBounds(431, 85, 77, 24);
		add(txtGenero_1);

		// TEXTO "PUNTUACIÓN"
		txtrPuntuacion = new JTextArea();
		txtrPuntuacion.setWrapStyleWord(true);
		txtrPuntuacion.setText("Puntuación:");
		txtrPuntuacion.setTabSize(10);
		txtrPuntuacion.setRows(3);
		txtrPuntuacion.setLineWrap(true);
		txtrPuntuacion.setForeground(Color.WHITE);
		txtrPuntuacion.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		txtrPuntuacion.setBackground(new Color(66, 72, 93));
		txtrPuntuacion.setBounds(669, 85, 135, 24);
		add(txtrPuntuacion);

		// AÑADIR 12 ELEMENTOS (4 COLUMNAS Y 3 FILAS) CON UNA IMAGEN Y UN TÍTULO EN CADA
		// CELDA
		for (int i = 1; i <= 12; i++) {
			// CREAR UN PANEL PARA CADA CELDA
			panelItem = new JPanel();
			panelItem.setLayout(new BorderLayout());

			// AÑADIR UNA IMAGEN
			lblImagen = new JLabel();
			originalIcon = new ImageIcon(getClass().getResource("/Images/ImagenPelicula.png"));

			// ESCALAR LA IMAGEN A 140X176 PÍXELES
			imagenRedimensionada = originalIcon.getImage().getScaledInstance(140, 176, Image.SCALE_SMOOTH);

			// CREAR UN NUEVO IMAGEICON CON LA IMAGEN REDIMENSIONADA
			iconoRedimensionado = new ImageIcon(imagenRedimensionada);

			// ASIGNAR EL ICONO REDIMENSIONADO AL JLABEL
			lblImagen.setIcon(iconoRedimensionado);
			lblImagen.setHorizontalAlignment(SwingConstants.CENTER);

			// AÑADIR UN TÍTULO DEBAJO DE LA IMAGEN
			lblTitulo = new JLabel("Título " + i);
			lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
			lblTitulo.setForeground(Color.WHITE);

			// AÑADIR IMAGEN Y TÍTULO AL PANELITEM
			panelItem.add(lblImagen, BorderLayout.CENTER);
			panelItem.add(lblTitulo, BorderLayout.SOUTH);

			// AÑADIR EL PANELITEM AL PNLGRID (EL GRIDLAYOUT)
			pnlGrid.add(panelItem);

		}

		initStyles();
	}

	// MÉTODO PARA INICIALIZAR LOS ESTILOS
	private void initStyles() {

	}
}

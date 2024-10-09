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
	
	// Variables JLabel
	public JLabel lblBusqueda;
	public JLabel lblIconoLogo;
	public JLabel lblNewJgoodiesLabel1;
	public JLabel lblNewLabel;
	public JLabel lblImagen;
	public JLabel lblTitulo;
	
	// Variables JTextField
	public JTextField txtBuscar;
	public JTextField txtAsdfasdfasdf;
	
	// Variables JButton
	public JButton btnSalir;
	public JButton btnHistorial;
	public JButton btnPeliculas;
	
	// Variables JPanel
	public JPanel pnlPrincipal;
	public JPanel pnlGrid;
	public JPanel pnlLineaBlanca;
	public JPanel panel_1;
	public JPanel panelItem;
	
	// Variables JScrollPane
	public JScrollPane spTablaPeliculas;
	
	// Variables JComboBox
	public JComboBox<String> comboBoxGenero;
	public JComboBox<String> comboBoxAño;
	public JComboBox<String> comboBoxPuntuacion;
	
	// Variables JTextArea
	public JTextArea txtrPuntuacion;
	public JTextArea txtGenero;
	public JTextArea txtGenero_1;
	
	// Variables relacionadas con imágenes
	public ImageIcon originalIcon;
	public Image imagenRedimensionada;
	public ImageIcon iconoRedimensionado;

	public MenuPeliculasVista() {
		setBackground(new Color(66, 72, 93));
		setLayout(null); // IMPORTANTE
		setBounds(0, 0, 1140, 640);
		
		pnlLineaBlanca = new JPanel();
		pnlLineaBlanca.setBackground(Color.WHITE); 
		pnlLineaBlanca.setBounds(26, 123, 1060, 2);
		add(pnlLineaBlanca);
		
		lblNewJgoodiesLabel1 = DefaultComponentFactory.getInstance().createLabel("Buscar por");
		lblNewJgoodiesLabel1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblNewJgoodiesLabel1.setForeground(new Color(255, 255, 255));
		lblNewJgoodiesLabel1.setBounds(26, 98, 135, 14);
		add(lblNewJgoodiesLabel1);
		
		btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon(MenuUsuarioVista.class.getResource("/Images/iconosalida.png")));
		btnSalir.setBounds(1065, 12, 42, 46);
		add(btnSalir);
		
		btnHistorial = new JButton("HISTORIAL");
		btnHistorial.setBounds(878, 19, 120, 35);
		add(btnHistorial);
		
		btnPeliculas = new JButton("PELICULAS");
		btnPeliculas.setBounds(748, 19, 120, 35);
		add(btnPeliculas);
		
		lblBusqueda = DefaultComponentFactory.getInstance().createLabel("");
		lblBusqueda.setIcon(new ImageIcon(getClass().getResource("/Images/BuscarIcono.png")));
		lblBusqueda.setBounds(280, 17, 40, 40);
		add(lblBusqueda);

		
		lblIconoLogo = DefaultComponentFactory.getInstance().createLabel("");
		lblIconoLogo.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacion.png")));
		lblIconoLogo.setBounds(4, 6, 283, 56);
		add(lblIconoLogo);
		
		txtBuscar = new JTextField();
		txtBuscar.setText("Buscar");
		txtBuscar.setBounds(322, 21, 407, 32);
		add(txtBuscar);
		txtBuscar.setColumns(10);
		
		pnlPrincipal = new JPanel();
		pnlPrincipal.setBackground(new Color(56, 59, 74));
		pnlPrincipal.setBounds(0, 0, 1225, 69);
		add(pnlPrincipal);
		
		// Configurar el JScrollPane
		spTablaPeliculas = new JScrollPane();
		spTablaPeliculas.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		spTablaPeliculas.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		spTablaPeliculas.setBounds(26, 136, 1060, 437);
		add(spTablaPeliculas);
		
		// Crear el panel que contendrá la cuadrícula
		pnlGrid = new JPanel();
		pnlGrid.setLayout(new GridLayout(3, 4, 10, 10));  // 3 filas, 4 columnas, con 10px de espacio entre celdas
		spTablaPeliculas.setViewportView(pnlGrid);
		
		// Crear un JComboBox para las opciones desplegables
		String[] generos = { "Todos", "Acción", "Aventura", "Animación", "Comedia", "Crimen", 
		                     "Documental", "Drama", "Familia", "Fantasía", "Historia", "Terror", 
		                     "Música", "Misterio", "Romance", "Ciencia Ficción", "Película de TV", 
		                     "Suspense", "Bélico", "Western" };
		
		// Crear un JComboBox para las opciones desplegables de año
		String[] año = { "Todos", "2020s", "2010s", "2000s", "1990s", "1980s", 
		                     "1970s", "1960s", "1950s", "1940s", "1930s", "1920s", 
		                     "1910s", "1900s", "1890s"};
		
		// Opciones de puntuación
		String[] puntuacion = { "Todos", "5-4", "4-3", "3-2", "2-1", "0-1"};
		
		comboBoxGenero = new JComboBox<>(generos);
		comboBoxGenero.setBounds(254, 81, 150, 35);  // Posiciona el JComboBox
		add(comboBoxGenero);
		
		comboBoxAño = new JComboBox<String>(año);
		comboBoxAño.setBounds(491, 81, 150, 35);
		add(comboBoxAño);
		
		comboBoxPuntuacion = new JComboBox<String>(puntuacion);
		comboBoxPuntuacion.setBounds(794, 81, 150, 35);
		add(comboBoxPuntuacion);
		
		// Agregar ActionListener al comboBox de género
		comboBoxGenero.addActionListener(e -> {
		    String opcionSeleccionada = (String) comboBoxGenero.getSelectedItem();	    
		    if (!opcionSeleccionada.equals("Todos")) {
		        JOptionPane.showMessageDialog(null, "Seleccionaste género: " + opcionSeleccionada);
		    }
		});

		// Agregar ActionListener al comboBox de año
		comboBoxAño.addActionListener(e -> {
		    String opcionSeleccionada = (String) comboBoxAño.getSelectedItem();
		    JOptionPane.showMessageDialog(null, "Seleccionaste año: " + opcionSeleccionada);
		});

		// Agregar ActionListener al comboBox de puntuación
		comboBoxPuntuacion.addActionListener(e -> {
		    String opcionSeleccionada = (String) comboBoxPuntuacion.getSelectedItem();
		    JOptionPane.showMessageDialog(null, "Seleccionaste puntuación: " + opcionSeleccionada);
		});
		
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

		// Añadir 12 elementos (4 columnas y 3 filas) con una imagen y un título en cada celda
		for (int i = 1; i <= 12; i++) {
			// Crear un panel para cada celda
			panelItem = new JPanel();
			panelItem.setLayout(new BorderLayout());
			
			// Añadir una imagen
			lblImagen = new JLabel();
			originalIcon = new ImageIcon(getClass().getResource("/Images/ImagenPelicula.png"));

			// Escalar la imagen a 26x156 píxeles
			imagenRedimensionada = originalIcon.getImage().getScaledInstance(140, 176, Image.SCALE_SMOOTH);

			// Crear un nuevo ImageIcon con la imagen redimensionada
			iconoRedimensionado = new ImageIcon(imagenRedimensionada);

			// Asignar el icono redimensionado al JLabel
			lblImagen.setIcon(iconoRedimensionado);
			lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
			
			// Añadir un título debajo de la imagen
			lblTitulo = new JLabel("Título " + i);
			lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
			lblTitulo.setForeground(Color.WHITE);
			
			// Añadir imagen y título al panelItem
			panelItem.add(lblImagen, BorderLayout.CENTER);
			panelItem.add(lblTitulo, BorderLayout.SOUTH);
			
			// Añadir el panelItem al panel_1 (el GridLayout)
			pnlGrid.add(panelItem);
			
		}
		
		initStyles();
	}

	private void initStyles() {

	}
}

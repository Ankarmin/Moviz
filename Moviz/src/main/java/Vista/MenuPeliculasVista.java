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
	private JLabel Busqueda;
	private JLabel IconoLogo;
	private JTextField txtBuscar;
	private JPanel panel;
	private JButton btnSalir;
	private JButton BtnHistorial;
	private JButton BotonPeliculas;
	private JPanel LineaBlanca;
	private JLabel lblNewJgoodiesLabel1;
	private JPanel panel_1;
	private JTextField txtAsdfasdfasdf;
	private JLabel lblNewLabel;
	private JComboBox<String> comboBox_2;
	private JTextArea txtrPuntuacin;
	
	public MenuPeliculasVista() {
		setBackground(new Color(66, 72, 93));
		setLayout(null); // IMPORTANTE
		setBounds(0, 0, 1140, 640);
		
		LineaBlanca = new JPanel();
		LineaBlanca.setBackground(Color.WHITE); 
		LineaBlanca.setBounds(26, 123, 1060, 2);
		add(LineaBlanca);
		
		lblNewJgoodiesLabel1 = DefaultComponentFactory.getInstance().createLabel("Buscar por");
		lblNewJgoodiesLabel1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblNewJgoodiesLabel1.setForeground(new Color(255, 255, 255));
		lblNewJgoodiesLabel1.setBounds(26, 90, 135, 14);
		add(lblNewJgoodiesLabel1);
		
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
		
		// Configurar el JScrollPane
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(26, 136, 1060, 437);
		add(scrollPane);
		
		// Crear el panel que contendrá la cuadrícula
		panel_1 = new JPanel();
		panel_1.setLayout(new GridLayout(3, 4, 10, 10));  // 3 filas, 4 columnas, con 10px de espacio entre celdas
		scrollPane.setViewportView(panel_1);
		
		// Crear un JComboBox para las opciones desplegables
		String[] generos = { "Todos", "Acción", "Aventura", "Animación", "Comedia", "Crimen", 
		                     "Documental", "Drama", "Familia", "Fantasía", "Historia", "Terror", 
		                     "Música", "Misterio", "Romance", "Ciencia Ficción", "Película de TV", 
		                     "Suspense", "Bélico", "Western" };
		
		// Crear un JComboBox para las opciones desplegables
		String[] año = { "Todos", "2020s", "2010s", "2000s", "1990s", "1980s", 
		                     "1970s", "1960s", "1950s", "1940s", "1930s", "1920s", 
		                     "1910s", "1900s", "1890s"};
		
		String[] puntuacion = { "Todos", "5-4", "4-3", "3-2", "2-1", "0-1"};
		
		JComboBox<String> comboBoxGenero = new JComboBox<>(generos);
		comboBoxGenero.setBounds(254, 81, 150, 35);  // Posiciona el JComboBox
		add(comboBoxGenero);
		
		JComboBox<String> comboBoxAño = new JComboBox<String>(año);
		comboBoxAño.setBounds(491, 81, 150, 35);
		add(comboBoxAño);
		
		JComboBox<String> comboBoxPuntuacion = new JComboBox<String>(puntuacion);
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
		
		JTextArea txtGenero = new JTextArea();
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

		
		JTextArea txtGenero_1 = new JTextArea();
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
		

		
		txtrPuntuacin = new JTextArea();
		txtrPuntuacin.setWrapStyleWord(true);
		txtrPuntuacin.setText("Puntuación:");
		txtrPuntuacin.setTabSize(10);
		txtrPuntuacin.setRows(3);
		txtrPuntuacin.setLineWrap(true);
		txtrPuntuacin.setForeground(Color.WHITE);
		txtrPuntuacin.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		txtrPuntuacin.setBackground(new Color(66, 72, 93));
		txtrPuntuacin.setBounds(669, 85, 135, 24);
		add(txtrPuntuacin);

	
		// Añadir 12 elementos (4 columnas y 3 filas) con una imagen y un título en cada celda
		for (int i = 1; i <= 12; i++) {
			// Crear un panel para cada celda
			JPanel panelItem = new JPanel();
			panelItem.setLayout(new BorderLayout());
			
			// Añadir una imagen
			JLabel labelImagen = new JLabel();
			ImageIcon originalIcon = new ImageIcon(getClass().getResource("/Images/ImagenPelicula.png"));

			// Escalar la imagen a 26x156 píxeles
			Image imagenRedimensionada = originalIcon.getImage().getScaledInstance(140, 176, Image.SCALE_SMOOTH);

			// Crear un nuevo ImageIcon con la imagen redimensionada
			ImageIcon iconoRedimensionado = new ImageIcon(imagenRedimensionada);

			// Asignar el icono redimensionado al JLabel
			labelImagen.setIcon(iconoRedimensionado);
			labelImagen.setHorizontalAlignment(SwingConstants.CENTER);
			
			// Añadir un título debajo de la imagen
			JLabel labelTitulo = new JLabel("Título " + i);
			labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
			labelTitulo.setForeground(Color.WHITE);
			
			// Añadir imagen y título al panelItem
			panelItem.add(labelImagen, BorderLayout.CENTER);
			panelItem.add(labelTitulo, BorderLayout.SOUTH);
			
			// Añadir el panelItem al panel_1 (el GridLayout)
			panel_1.add(panelItem);
			
		}
		
		initStyles();
	}

	private void initStyles() {

	}
}
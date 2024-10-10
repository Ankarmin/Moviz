package Vista;

import javax.swing.*;
import java.awt.*;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class AgregarPeliculaVista extends JPanel {

	private static final long serialVersionUID = 1L;

	// Todos los componentes son públicos según tu convención
	public JButton btnSalir;
	public JButton btnAñadirPelicula;
	public JButton btnVolver;
	public JButton btnTitulo;
	public JButton btnGenero;
	public JButton btnDuracionAprox;
	public JButton btnSinopsis;
	public JButton btnSubirImagen;

	public JLabel lblTituloSeccion;
	public JLabel lblGenero;
	public JLabel lblAnioPublicacion;
	public JLabel lblDuracionAprox;
	public JLabel lblIconoLogo;
	public JPanel pnlLineaBlanca;
	public JPanel pnlCabecera;

	public JTextField txtTitulo;
	public JTextField txtDuracionAprox;
	public JTextField txtRutaImagen;
	public JTextArea txtSinopsis;
	public JScrollPane scrollSinopsis; // ScrollPane para la sinopsis

	public JComboBox<String> cmbGenero;
	public JComboBox<String> cmbAnioPublicacion;

	public AgregarPeliculaVista() {
		setBackground(new Color(66, 72, 93));
		setBorder(null);
		setLayout(null); // IMPORTANTE
		setBounds(0, 0, 1140, 640); // IMPORTANTE

		// Botón "Salir" con Icono
		btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon(getClass().getResource("/Images/iconosalida.png")));
		btnSalir.setBounds(1054, 15, 42, 46);
		add(btnSalir);

		// Botón "Volver" en la esquina superior derecha
		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVolver.setBackground(new Color(255, 128, 0));
		btnVolver.setForeground(new Color(255, 255, 255));
		btnVolver.setBounds(966, 102, 120, 35);
		add(btnVolver);

		// Icono del Logo
		lblIconoLogo = DefaultComponentFactory.getInstance().createLabel("");
		lblIconoLogo.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacionAdministrador.png")));
		lblIconoLogo.setBounds(4, 6, 578, 56);
		add(lblIconoLogo);

		// Panel de Cabecera
		pnlCabecera = new JPanel();
		pnlCabecera.setBackground(new Color(56, 59, 74));
		pnlCabecera.setBounds(-85, 0, 1225, 69);
		add(pnlCabecera);

		// Título de la sección "Añadir Películas"
		lblTituloSeccion = new JLabel("Añadir Películas");
		lblTituloSeccion.setFont(new Font("Microsoft YaHei", Font.BOLD, 21));
		lblTituloSeccion.setForeground(new Color(255, 255, 255));
		lblTituloSeccion.setBounds(26, 108, 227, 29);
		add(lblTituloSeccion);

		// Línea divisoria
		pnlLineaBlanca = new JPanel();
		pnlLineaBlanca.setBackground(Color.WHITE);
		pnlLineaBlanca.setBounds(26, 143, 1060, 2);
		add(pnlLineaBlanca);

		// Botón estilizado para "Título"
		btnTitulo = new JButton("Título");
		btnTitulo.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		btnTitulo.setBackground(new Color(224, 224, 224));
		btnTitulo.setBounds(100, 180, 200, 30);
		btnTitulo.setEnabled(false); // Botón deshabilitado para que luzca como etiqueta
		add(btnTitulo);

		// Campo de texto "Título"
		txtTitulo = new JTextField();
		txtTitulo.setBounds(350, 180, 400, 30);
		txtTitulo.setBackground(new Color(70, 76, 90)); // Fondo oscuro
		txtTitulo.setForeground(Color.WHITE);
		txtTitulo.setBorder(BorderFactory.createLineBorder(new Color(56, 59, 74))); // Borde oscuro
		add(txtTitulo);

		// Botón estilizado para "Género"
		btnGenero = new JButton("Género");
		btnGenero.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		btnGenero.setBackground(new Color(224, 224, 224));
		btnGenero.setBounds(100, 240, 200, 30);
		btnGenero.setEnabled(false); // Botón deshabilitado
		add(btnGenero);

		// ComboBox para "Género"
		cmbGenero = new JComboBox<>();
		cmbGenero.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		cmbGenero.setBounds(350, 240, 400, 30);
		cmbGenero.setBackground(new Color(70, 76, 90));
		cmbGenero.setForeground(Color.WHITE); // Texto en blanco

		// Agregar los géneros actualizados al ComboBox
		cmbGenero.addItem("Todos");
		cmbGenero.addItem("Acción");
		cmbGenero.addItem("Aventura");
		cmbGenero.addItem("Animación");
		cmbGenero.addItem("Comedia");
		cmbGenero.addItem("Crimen");
		cmbGenero.addItem("Documental");
		cmbGenero.addItem("Drama");
		cmbGenero.addItem("Familia");
		cmbGenero.addItem("Fantasía");
		cmbGenero.addItem("Historia");
		cmbGenero.addItem("Terror");
		cmbGenero.addItem("Música");
		cmbGenero.addItem("Misterio");
		cmbGenero.addItem("Romance");
		cmbGenero.addItem("Ciencia Ficción");
		cmbGenero.addItem("Película de TV");
		cmbGenero.addItem("Suspense");
		cmbGenero.addItem("Bélico");
		cmbGenero.addItem("Western");
		add(cmbGenero);

		// Botón estilizado para "Año de Publicación"
		JButton btnAnioPublicacion = new JButton("Año de Publicación");
		btnAnioPublicacion.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		btnAnioPublicacion.setBackground(new Color(224, 224, 224));
		btnAnioPublicacion.setBounds(100, 300, 200, 30);
		btnAnioPublicacion.setEnabled(false); // Botón deshabilitado
		add(btnAnioPublicacion);

		// ComboBox para "Año de Publicación" con los años actualizados
		cmbAnioPublicacion = new JComboBox<>();
		cmbAnioPublicacion.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		cmbAnioPublicacion.setBounds(350, 300, 400, 30);
		cmbAnioPublicacion.setBackground(new Color(70, 76, 90));
		cmbAnioPublicacion.setForeground(Color.WHITE); // Texto en blanco

		// Agregar los años correctos al ComboBox
		cmbAnioPublicacion.addItem("2020s");
		cmbAnioPublicacion.addItem("2010s");
		cmbAnioPublicacion.addItem("2000s");
		cmbAnioPublicacion.addItem("1990s");
		cmbAnioPublicacion.addItem("1980s");
		cmbAnioPublicacion.addItem("1970s");
		cmbAnioPublicacion.addItem("1960s");
		cmbAnioPublicacion.addItem("1950s");
		cmbAnioPublicacion.addItem("1940s");
		cmbAnioPublicacion.addItem("1930s");
		cmbAnioPublicacion.addItem("1920s");
		cmbAnioPublicacion.addItem("1910s");
		cmbAnioPublicacion.addItem("1900s");
		cmbAnioPublicacion.addItem("1890s");
		add(cmbAnioPublicacion);

		// Botón estilizado para "Duración Aprox"
		btnDuracionAprox = new JButton("Duración Aprox");
		btnDuracionAprox.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		btnDuracionAprox.setBackground(new Color(66, 72, 93));
		btnDuracionAprox.setBounds(100, 360, 200, 30);
		btnDuracionAprox.setEnabled(false); // Botón deshabilitado
		add(btnDuracionAprox);

		// Campo de texto "Duración Aprox"
		txtDuracionAprox = new JTextField();
		txtDuracionAprox.setBounds(350, 360, 400, 30);
		txtDuracionAprox.setBackground(new Color(70, 76, 90));
		txtDuracionAprox.setForeground(Color.WHITE); // Texto en blanco
		txtDuracionAprox.setBorder(BorderFactory.createLineBorder(new Color(56, 59, 74))); // Borde oscuro
		add(txtDuracionAprox);

		// Botón "Añadir Película" con estilo naranja
		btnAñadirPelicula = new JButton("Añadir");
		btnAñadirPelicula.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAñadirPelicula.setForeground(new Color(255, 255, 255));
		btnAñadirPelicula.setBackground(new Color(255, 128, 0));
		btnAñadirPelicula.setBounds(961, 520, 125, 50); // Estilo naranja
		add(btnAñadirPelicula);

		// Botón estilizado para "Sinopsis"
		btnSinopsis = new JButton("Sinopsis");
		btnSinopsis.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		btnSinopsis.setBackground(new Color(224, 224, 224));
		btnSinopsis.setBounds(100, 420, 200, 30);
		btnSinopsis.setEnabled(false); // Botón deshabilitado
		add(btnSinopsis);

		// Área de texto para "Sinopsis" con un ScrollPane
		txtSinopsis = new JTextArea();
		txtSinopsis.setBackground(new Color(70, 76, 90)); // Fondo oscuro
		txtSinopsis.setForeground(Color.WHITE);
		txtSinopsis.setLineWrap(true); // Ajuste de línea
		txtSinopsis.setWrapStyleWord(true);
		txtSinopsis.setBorder(BorderFactory.createLineBorder(new Color(56, 59, 74))); // Borde oscuro

		// JScrollPane para la sinopsis
		scrollSinopsis = new JScrollPane(txtSinopsis);
		scrollSinopsis.setBounds(350, 420, 400, 100);
		scrollSinopsis.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		add(scrollSinopsis);

		// Botón estilizado para "Subir Imagen"
		btnSubirImagen = new JButton("Subir Imagen");
		btnSubirImagen.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		btnSubirImagen.setBackground(new Color(224, 224, 224));
		btnSubirImagen.setBounds(100, 540, 200, 30);
		btnSubirImagen.setEnabled(false); // Botón deshabilitado
		add(btnSubirImagen);

		// Campo de texto para ingresar la ruta de la imagen
		txtRutaImagen = new JTextField();
		txtRutaImagen.setBounds(350, 540, 400, 30);
		txtRutaImagen.setBackground(new Color(70, 76, 90));
		txtRutaImagen.setForeground(Color.WHITE);
		txtRutaImagen.setBorder(BorderFactory.createLineBorder(new Color(56, 59, 74))); // Borde oscuro
		add(txtRutaImagen);

		initStyles();
	}

	public void initStyles() {
		// Aquí podrías agregar más personalizaciones si es necesario.
	}
}

package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.jgoodies.forms.factories.DefaultComponentFactory;

public class AgregarPeliculaVista extends JPanel {

	private static final long serialVersionUID = 1L;

	// TODOS LOS COMPONENTES SON PÚBLICOS SEGÚN TU CONVENCIÓN
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
	public JTextField txtAnioPublicacion;
	public JTextArea txtSinopsis;

	public JScrollPane scrollSinopsis; // SCROLLPANE PARA LA SINOPSIS

	public JComboBox<String> cmbGenero;

	// CONSTRUCTOR PARA CONFIGURAR LA VISTA
	public AgregarPeliculaVista() {
		// CONFIGURAR EL COLOR DE FONDO Y EL LAYOUT
		setBackground(new Color(66, 72, 93));
		setBorder(null);
		setLayout(null); // IMPORTANTE
		setBounds(0, 0, 1140, 640); // IMPORTANTE

		// BOTÓN "SALIR" CON ICONO
		btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon(getClass().getResource("/Images/iconosalida.png")));
		btnSalir.setBounds(1054, 15, 42, 46);
		add(btnSalir);

		// BOTÓN "VOLVER" EN LA ESQUINA SUPERIOR DERECHA
		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVolver.setBackground(new Color(255, 128, 0));
		btnVolver.setForeground(new Color(255, 255, 255));
		btnVolver.setBounds(966, 102, 120, 35);
		add(btnVolver);

		// ICONO DEL LOGO
		lblIconoLogo = DefaultComponentFactory.getInstance().createLabel("");
		lblIconoLogo.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacionAdministrador.png")));
		lblIconoLogo.setBounds(4, 6, 578, 56);
		add(lblIconoLogo);

		// PANEL DE CABECERA
		pnlCabecera = new JPanel();
		pnlCabecera.setBackground(new Color(56, 59, 74));
		pnlCabecera.setBounds(-85, 0, 1225, 69);
		add(pnlCabecera);

		// TÍTULO DE LA SECCIÓN "AÑADIR PELÍCULAS"
		lblTituloSeccion = new JLabel("Añadir Películas");
		lblTituloSeccion.setFont(new Font("Microsoft YaHei", Font.BOLD, 21));
		lblTituloSeccion.setForeground(new Color(255, 255, 255));
		lblTituloSeccion.setBounds(26, 108, 227, 29);
		add(lblTituloSeccion);

		// LÍNEA DIVISORIA
		pnlLineaBlanca = new JPanel();
		pnlLineaBlanca.setBackground(Color.WHITE);
		pnlLineaBlanca.setBounds(26, 143, 1060, 2);
		add(pnlLineaBlanca);

		// BOTÓN ESTILIZADO PARA "TÍTULO"
		btnTitulo = new JButton("Título");
		btnTitulo.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		btnTitulo.setBackground(new Color(224, 224, 224));
		btnTitulo.setBounds(100, 180, 200, 30);
		btnTitulo.setEnabled(false); // BOTÓN DESHABILITADO PARA QUE LUZCA COMO ETIQUETA
		add(btnTitulo);

		// CAMPO DE TEXTO "TÍTULO"
		txtTitulo = new JTextField();
		txtTitulo.setBounds(350, 180, 400, 30);
		txtTitulo.setBackground(new Color(70, 76, 90)); // FONDO OSCURO
		txtTitulo.setForeground(Color.WHITE);
		txtTitulo.setBorder(BorderFactory.createLineBorder(new Color(56, 59, 74))); // BORDE OSCURO
		add(txtTitulo);

		// BOTÓN ESTILIZADO PARA "GÉNERO"
		btnGenero = new JButton("Género");
		btnGenero.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		btnGenero.setBackground(new Color(224, 224, 224));
		btnGenero.setBounds(100, 240, 200, 30);
		btnGenero.setEnabled(false); // BOTÓN DESHABILITADO
		add(btnGenero);

		// COMBOBOX PARA "GÉNERO"
		cmbGenero = new JComboBox<>();
		cmbGenero.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		cmbGenero.setBounds(350, 240, 400, 30);
		cmbGenero.setBackground(new Color(70, 76, 90));
		cmbGenero.setForeground(Color.WHITE); // TEXTO EN BLANCO

		// AGREGAR LOS GÉNEROS ACTUALIZADOS AL COMBOBOX
		cmbGenero.addItem("-Seleccionar-");
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

		// BOTÓN ESTILIZADO PARA "AÑO DE PUBLICACIÓN"
		JButton btnAnioPublicacion = new JButton("Año de Publicación");
		btnAnioPublicacion.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		btnAnioPublicacion.setBackground(new Color(224, 224, 224));
		btnAnioPublicacion.setBounds(100, 300, 200, 30);
		btnAnioPublicacion.setEnabled(false); // BOTÓN DESHABILITADO
		add(btnAnioPublicacion);

		// BOTÓN ESTILIZADO PARA "DURACIÓN APROX"
		btnDuracionAprox = new JButton("Duración Aprox");
		btnDuracionAprox.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		btnDuracionAprox.setBackground(new Color(66, 72, 93));
		btnDuracionAprox.setBounds(100, 360, 200, 30);
		btnDuracionAprox.setEnabled(false); // BOTÓN DESHABILITADO
		add(btnDuracionAprox);

		// CAMPO DE TEXTO "DURACIÓN APROX"
		txtDuracionAprox = new JTextField();
		txtDuracionAprox.setBounds(350, 360, 400, 30);
		txtDuracionAprox.setBackground(new Color(70, 76, 90));
		txtDuracionAprox.setForeground(Color.WHITE); // TEXTO EN BLANCO
		txtDuracionAprox.setBorder(BorderFactory.createLineBorder(new Color(56, 59, 74))); // BORDE OSCURO
		add(txtDuracionAprox);

		// BOTÓN "AÑADIR PELÍCULA" CON ESTILO NARANJA
		btnAñadirPelicula = new JButton("Añadir");
		btnAñadirPelicula.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAñadirPelicula.setForeground(new Color(255, 255, 255));
		btnAñadirPelicula.setBackground(new Color(255, 128, 0));
		btnAñadirPelicula.setBounds(961, 520, 125, 50); // ESTILO NARANJA
		add(btnAñadirPelicula);

		// BOTÓN ESTILIZADO PARA "SINOPSIS"
		btnSinopsis = new JButton("Sinopsis");
		btnSinopsis.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		btnSinopsis.setBackground(new Color(224, 224, 224));
		btnSinopsis.setBounds(100, 420, 200, 30);
		btnSinopsis.setEnabled(false); // BOTÓN DESHABILITADO
		add(btnSinopsis);

		// ÁREA DE TEXTO PARA "SINOPSIS" CON UN SCROLLPANE
		txtSinopsis = new JTextArea();
		txtSinopsis.setBackground(new Color(70, 76, 90)); // FONDO OSCURO
		txtSinopsis.setForeground(Color.WHITE);
		txtSinopsis.setLineWrap(true); // AJUSTE DE LÍNEA
		txtSinopsis.setWrapStyleWord(true);
		txtSinopsis.setBorder(BorderFactory.createLineBorder(new Color(56, 59, 74))); // BORDE OSCURO

		// JSCROLLPANE PARA LA SINOPSIS
		scrollSinopsis = new JScrollPane(txtSinopsis);
		scrollSinopsis.setBounds(350, 420, 400, 100);
		scrollSinopsis.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		add(scrollSinopsis);

		// BOTÓN ESTILIZADO PARA "SUBIR IMAGEN"
		btnSubirImagen = new JButton("Subir Imagen");
		btnSubirImagen.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		btnDuracionAprox.setBackground(new Color(66, 72, 93));
		btnSubirImagen.setBounds(100, 540, 200, 30);
		add(btnSubirImagen);

		// CAMPO DE TEXTO PARA INGRESAR LA RUTA DE LA IMAGEN
		txtRutaImagen = new JTextField();
		txtRutaImagen.setBounds(350, 540, 400, 30);
		txtRutaImagen.setBackground(new Color(70, 76, 90));
		txtRutaImagen.setForeground(Color.WHITE);
		txtRutaImagen.setBorder(BorderFactory.createLineBorder(new Color(56, 59, 74)));
		add(txtRutaImagen);

		// CAMPO DE TEXTO PARA EL AÑO DE PUBLICACIÓN
		txtAnioPublicacion = new JTextField();
		txtAnioPublicacion.setForeground(Color.WHITE);
		txtAnioPublicacion.setBorder(BorderFactory.createLineBorder(new Color(56, 59, 74)));
		txtAnioPublicacion.setBackground(new Color(70, 76, 90));
		txtAnioPublicacion.setBounds(350, 300, 400, 30);
		add(txtAnioPublicacion);

		// INICIALIZAR LOS ESTILOS
		initStyles();
	}

	// MÉTODO PARA INICIALIZAR LOS ESTILOS (OPCIONAL PARA PERSONALIZAR AÚN MÁS)
	public void initStyles() {
		// AQUÍ PODRÍAS AGREGAR MÁS PERSONALIZACIONES SI ES NECESARIO.
	}
}

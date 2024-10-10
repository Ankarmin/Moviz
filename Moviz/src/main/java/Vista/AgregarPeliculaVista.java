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

	public JLabel lblTituloSeccion;
	public JLabel lblGenero;
	public JLabel lblAnioPublicacion;
	public JLabel lblDuracionAprox;
	public JLabel lblIconoLogo;
	public JPanel pnlLineaBlanca;
	public JPanel pnlCabecera;

	public JTextField txtTitulo;
	public JTextField txtDuracionAprox;

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

		// ComboBox para "Año de Publicación" con rangos de años
		cmbAnioPublicacion = new JComboBox<>();
		cmbAnioPublicacion.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		cmbAnioPublicacion.setBounds(350, 300, 400, 30);
		cmbAnioPublicacion.setBackground(new Color(70, 76, 90));
		cmbAnioPublicacion.setForeground(Color.WHITE); // Texto en blanco

		// Agregar los rangos de años al ComboBox
		cmbAnioPublicacion.addItem("Todos");
		cmbAnioPublicacion.addItem("5-4");
		cmbAnioPublicacion.addItem("4-3");
		cmbAnioPublicacion.addItem("3-2");
		cmbAnioPublicacion.addItem("2-1");
		cmbAnioPublicacion.addItem("0-1");
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
		add(txtDuracionAprox);

		// Botón "Añadir Película" con estilo naranja
		btnAñadirPelicula = new JButton("Añadir");
		btnAñadirPelicula.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAñadirPelicula.setForeground(new Color(255, 255, 255));
		btnAñadirPelicula.setBackground(new Color(255, 128, 0));
		btnAñadirPelicula.setBounds(811, 513, 125, 50); // Estilo naranja
		add(btnAñadirPelicula);

		initStyles();
	}

	public void initStyles() {
		// Aquí podrías agregar más personalizaciones si es necesario.
	}
}

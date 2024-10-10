package Vista;

import javax.swing.*;
import java.awt.*;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class EliminarPeliculaVista extends JPanel {

	private static final long serialVersionUID = 1L;

	// Todos los componentes son públicos según tu convención
	public JButton btnSalir;
	public JButton btnVolver; // Nuevo botón "Volver"
	public JButton btnEliminarPelicula;

	public JLabel lblTituloSeccion;
	public JLabel lblNombrePelicula;
	public JLabel lblSinopsis;
	public JLabel lblImagenPelicula;
	public JLabel lblIconoLogo;
	public JLabel Busqueda;

	public JTextField txtBuscar;
	public JTextArea txtSinopsis;

	public JPanel pnlLineaBlanca;
	public JPanel pnlCabecera;

	public JTable tblPeliculas;
	public JScrollPane spTabla;

	public EliminarPeliculaVista() {
		// Configuración del panel
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

		// Título de la sección "Eliminar Películas"
		lblTituloSeccion = new JLabel("Eliminar Películas");
		lblTituloSeccion.setFont(new Font("Microsoft YaHei", Font.BOLD, 21));
		lblTituloSeccion.setForeground(new Color(255, 255, 255));
		lblTituloSeccion.setBounds(26, 108, 227, 29);
		add(lblTituloSeccion);

		// Línea divisoria
		pnlLineaBlanca = new JPanel();
		pnlLineaBlanca.setBackground(Color.WHITE);
		pnlLineaBlanca.setBounds(26, 143, 1060, 2);
		add(pnlLineaBlanca);

		// Campo de búsqueda
		txtBuscar = new JTextField();
		txtBuscar.setText("Buscar");
		txtBuscar.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		txtBuscar.setBounds(80, 180, 250, 30);
		txtBuscar.setColumns(10);
		add(txtBuscar);

		// Etiqueta de icono de búsqueda
		Busqueda = DefaultComponentFactory.getInstance().createLabel("");
		Busqueda.setIcon(new ImageIcon(getClass().getResource("/Images/BuscarIcono.png"))); // Icono de búsqueda
		Busqueda.setBounds(37, 180, 42, 30);
		add(Busqueda);

		// Etiqueta para el nombre de la película
		lblNombrePelicula = new JLabel("Nombre película");
		lblNombrePelicula.setFont(new Font("Microsoft YaHei", Font.BOLD, 24));
		lblNombrePelicula.setForeground(new Color(255, 140, 0));
		lblNombrePelicula.setBounds(436, 181, 400, 30);
		add(lblNombrePelicula);

		// Imagen de la película (placeholder)
		lblImagenPelicula = new JLabel("");
		lblImagenPelicula.setOpaque(true);
		lblImagenPelicula.setBackground(Color.LIGHT_GRAY);
		lblImagenPelicula.setBounds(436, 231, 200, 300);
		add(lblImagenPelicula);

		// Etiqueta "Sinopsis"
		lblSinopsis = new JLabel("Sinopsis:");
		lblSinopsis.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
		lblSinopsis.setForeground(new Color(255, 255, 255));
		lblSinopsis.setBounds(686, 231, 100, 30);
		add(lblSinopsis);

		// Área de texto para la sinopsis
		txtSinopsis = new JTextArea();
		txtSinopsis.setWrapStyleWord(true);
		txtSinopsis.setLineWrap(true);
		txtSinopsis.setEditable(false);
		txtSinopsis.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		txtSinopsis.setForeground(new Color(255, 255, 255));
		txtSinopsis.setBackground(new Color(66, 72, 93));
		txtSinopsis.setText("**Lorem ipsum dolor sit amet, consectetur adipiscing elit...");
		txtSinopsis.setBounds(686, 271, 400, 150);
		add(txtSinopsis);

		// Botón "Eliminar"
		btnEliminarPelicula = new JButton("Eliminar");
		btnEliminarPelicula.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		btnEliminarPelicula.setBackground(new Color(255, 128, 0));
		btnEliminarPelicula.setForeground(new Color(255, 255, 255));
		btnEliminarPelicula.setBounds(686, 451, 150, 40);
		add(btnEliminarPelicula);

		// Configuración de la tabla
		String[] columnNames = { "Lista Películas" };
		Object[][] data = { { "Título 1" }, { "Título 2" }, { "Título 3" }, { "Título 4" }, { "Título 5" },
				{ "Título 6" }, { "Título 7" }, { "Título 8" }, { "Título 9" }, { "Título 10" }, { "Título 11" },
				{ "Título 12" } };

		// Creación de la tabla con los títulos
		tblPeliculas = new JTable(data, columnNames);
		tblPeliculas.setFillsViewportHeight(true);
		tblPeliculas.setRowHeight(30); // Ajusta la altura de las filas para que se vea más compacta
		tblPeliculas.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		tblPeliculas.setBackground(new Color(70, 76, 90));
		tblPeliculas.setForeground(Color.WHITE); // Texto en blanco

		// Desactiva la edición de las celdas
		tblPeliculas.setDefaultEditor(Object.class, null);

		// Configuración del JScrollPane que contiene la tabla
		spTabla = new JScrollPane(tblPeliculas);
		spTabla.setBounds(50, 231, 300, 300); // Ajusta la posición y tamaño
		add(spTabla); // Añadimos el JScrollPane (que contiene la JTable) al panel

		initStyles();
	}

	public void initStyles() {
		// Aquí podrías agregar más personalizaciones si es necesario.
	}
}

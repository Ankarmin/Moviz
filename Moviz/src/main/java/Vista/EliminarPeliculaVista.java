package Vista;

import javax.swing.*;
import java.awt.*;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class EliminarPeliculaVista extends JPanel {

	private static final long serialVersionUID = 1L;

	// TODOS LOS COMPONENTES SON PÚBLICOS SEGÚN TU CONVENCIÓN
	public JButton btnSalir;
	public JButton btnVolver;
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

	// CONSTRUCTOR PARA CONFIGURAR LA VISTA
	public EliminarPeliculaVista() {
		// CONFIGURACIÓN DEL PANEL
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

		// TÍTULO DE LA SECCIÓN "ELIMINAR PELÍCULAS"
		lblTituloSeccion = new JLabel("Eliminar Películas");
		lblTituloSeccion.setFont(new Font("Microsoft YaHei", Font.BOLD, 21));
		lblTituloSeccion.setForeground(new Color(255, 255, 255));
		lblTituloSeccion.setBounds(26, 108, 227, 29);
		add(lblTituloSeccion);

		// LÍNEA DIVISORIA
		pnlLineaBlanca = new JPanel();
		pnlLineaBlanca.setBackground(Color.WHITE);
		pnlLineaBlanca.setBounds(26, 143, 1060, 2);
		add(pnlLineaBlanca);

		// CAMPO DE BÚSQUEDA
		txtBuscar = new JTextField();
		txtBuscar.setText("Buscar");
		txtBuscar.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		txtBuscar.setBounds(80, 180, 250, 30);
		txtBuscar.setColumns(10);
		add(txtBuscar);

		// ETIQUETA DE ICONO DE BÚSQUEDA
		Busqueda = DefaultComponentFactory.getInstance().createLabel("");
		Busqueda.setIcon(new ImageIcon(getClass().getResource("/Images/BuscarIcono.png"))); // ICONO DE BÚSQUEDA
		Busqueda.setBounds(37, 180, 42, 30);
		add(Busqueda);

		// ETIQUETA PARA EL NOMBRE DE LA PELÍCULA
		lblNombrePelicula = new JLabel("Nombre película");
		lblNombrePelicula.setFont(new Font("Microsoft YaHei", Font.BOLD, 24));
		lblNombrePelicula.setForeground(new Color(255, 140, 0));
		lblNombrePelicula.setBounds(436, 181, 400, 30);
		add(lblNombrePelicula);

		// IMAGEN DE LA PELÍCULA (PLACEHOLDER)
		lblImagenPelicula = new JLabel("");
		lblImagenPelicula.setOpaque(true);
		lblImagenPelicula.setBackground(Color.LIGHT_GRAY);
		lblImagenPelicula.setBounds(436, 231, 200, 300);
		add(lblImagenPelicula);

		// ETIQUETA "SINOPSIS"
		lblSinopsis = new JLabel("Sinopsis:");
		lblSinopsis.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
		lblSinopsis.setForeground(new Color(255, 255, 255));
		lblSinopsis.setBounds(686, 231, 100, 30);
		add(lblSinopsis);

		// ÁREA DE TEXTO PARA LA SINOPSIS
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

		// BOTÓN "ELIMINAR"
		btnEliminarPelicula = new JButton("Eliminar");
		btnEliminarPelicula.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		btnEliminarPelicula.setBackground(new Color(255, 128, 0));
		btnEliminarPelicula.setForeground(new Color(255, 255, 255));
		btnEliminarPelicula.setBounds(686, 451, 150, 40);
		add(btnEliminarPelicula);

		// CONFIGURACIÓN DE LA TABLA
		String[] columnNames = { "Lista Películas" };
		Object[][] data = { { "Título 1" }, { "Título 2" }, { "Título 3" }, { "Título 4" }, { "Título 5" },
				{ "Título 6" }, { "Título 7" }, { "Título 8" }, { "Título 9" }, { "Título 10" }, { "Título 11" },
				{ "Título 12" } };

		// CREACIÓN DE LA TABLA CON LOS TÍTULOS
		tblPeliculas = new JTable(data, columnNames);
		tblPeliculas.setFillsViewportHeight(true);
		tblPeliculas.setRowHeight(30); // AJUSTA LA ALTURA DE LAS FILAS PARA QUE SE VEA MÁS COMPACTA
		tblPeliculas.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		tblPeliculas.setBackground(new Color(70, 76, 90));
		tblPeliculas.setForeground(Color.WHITE); // TEXTO EN BLANCO

		// DESACTIVA LA EDICIÓN DE LAS CELDAS
		tblPeliculas.setDefaultEditor(Object.class, null);

		// CONFIGURACIÓN DEL JSCROLLPANE QUE CONTIENE LA TABLA
		spTabla = new JScrollPane(tblPeliculas);
		spTabla.setBounds(50, 231, 300, 300); // AJUSTA LA POSICIÓN Y TAMAÑO
		add(spTabla); // AÑADIMOS EL JSCROLLPANE (QUE CONTIENE LA JTABLE) AL PANEL

		// INICIALIZAR LOS ESTILOS
		initStyles();
	}

	// MÉTODO PARA INICIALIZAR LOS ESTILOS (OPCIONAL)
	public void initStyles() {
		// AQUÍ PODRÍAS AGREGAR MÁS PERSONALIZACIONES SI ES NECESARIO.
	}
}

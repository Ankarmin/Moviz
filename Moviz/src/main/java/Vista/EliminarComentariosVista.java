package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import com.jgoodies.forms.factories.DefaultComponentFactory;

public class EliminarComentariosVista extends JPanel {

	private static final long serialVersionUID = 1L;

	// VARIABLES JBUTTON
	public JButton btnSalir;
	public JButton btnVolver;
	public JButton btnEliminar;

	// VARIABLES JLABEL
	public JLabel lblTituloSeccion;
	public JLabel lblNombrePelicula;
	public JLabel lblIconoLogo;
	public JLabel Busqueda;

	// VARIABLES JTABLE
	public JTable tblPeliculas;
	public JTable tblComentarios;

	// VARIABLES JSCROLLPANE
	public JScrollPane spTablaPeliculas;
	public JScrollPane spTablaComentarios;

	// VARIABLES JTEXTFIELD
	public JTextField txtBuscar;

	// VARIABLES JPANEL
	public JPanel pnlLineaBlanca;
	public JPanel pnlCabecera;

	// MODELO DE LA TABLA DE COMENTARIOS
	public DefaultTableModel comentariosModel;

	// FUNCIÓN PARA REESCALAR LA IMAGEN
	public ImageIcon getScaledIcon(String path, int width, int height) {
		ImageIcon originalIcon = new ImageIcon(getClass().getResource(path));
		Image scaledImage = originalIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
		return new ImageIcon(scaledImage);
	}

	// CONSTRUCTOR PARA CONFIGURAR LA VISTA
	public EliminarComentariosVista() {
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

		// TÍTULO DE LA SECCIÓN "ELIMINAR COMENTARIOS"
		lblTituloSeccion = new JLabel("Eliminar Comentarios");
		lblTituloSeccion.setFont(new Font("Microsoft YaHei", Font.BOLD, 21));
		lblTituloSeccion.setForeground(new Color(255, 255, 255));
		lblTituloSeccion.setBounds(26, 108, 271, 29);
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

		// CONFIGURACIÓN DE LA TABLA DE PELÍCULAS (VACÍA INICIALMENTE)
		String[] columnPeliculas = { "Lista Películas" };
		Object[][] dataPeliculas = {}; // TABLA VACÍA AL INICIO

		DefaultTableModel peliculasModel = new DefaultTableModel(dataPeliculas, columnPeliculas);
		tblPeliculas = new JTable(peliculasModel);
		tblPeliculas.setFillsViewportHeight(true);
		tblPeliculas.setRowHeight(30); // AJUSTA LA ALTURA DE LAS FILAS
		tblPeliculas.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		tblPeliculas.setBackground(new Color(70, 76, 90));
		tblPeliculas.setForeground(Color.WHITE); // TEXTO EN BLANCO
		tblPeliculas.setDefaultEditor(Object.class, null); // DESACTIVA LA EDICIÓN DE CELDAS

		// CONFIGURACIÓN DEL JSCROLLPANE PARA QUE APAREZCA SCROLL SI HAY VARIAS
		// PELÍCULAS
		spTablaPeliculas = new JScrollPane(tblPeliculas);
		spTablaPeliculas.setBounds(50, 231, 300, 300); // AJUSTA LA POSICIÓN Y TAMAÑO
		spTablaPeliculas.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); // FORZAR EL SCROLL SI SE
																							// EXCEDE EL TAMAÑO
		add(spTablaPeliculas); // AÑADIMOS EL JSCROLLPANE (QUE CONTIENE LA JTABLE) AL PANEL

		// DATOS DE PRUEBA PARA LA TABLA DE COMENTARIOS
		String[] columnComentarios = { "Usuario", "Comentario", "Eliminar" };
		Object[][] dataComentarios = {
				{ "Usuario 1 - (3/5) - 18/07/24", "Lorem ipsum dolor sit amet...", Boolean.FALSE },
				{ "Usuario 2 - (3/5) - 10/03/24", "Lorem ipsum dolor sit amet...", Boolean.FALSE },
				{ "Usuario 3 - (3/5) - 02/11/23", "Lorem ipsum dolor sit amet...", Boolean.FALSE },
				{ "Usuario 4 - (3/5) - 01/08/23", "Lorem ipsum dolor sit amet...", Boolean.FALSE },
				{ "Usuario 5 - (3/5) - 15/07/23", "Lorem ipsum dolor sit amet...", Boolean.FALSE },
				{ "Usuario 6 - (3/5) - 10/06/23", "Lorem ipsum dolor sit amet...", Boolean.FALSE },
				{ "Usuario 7 - (3/5) - 28/05/23", "Lorem ipsum dolor sit amet...", Boolean.FALSE } };

		// CREACIÓN DE LA TABLA CON LOS COMENTARIOS
		comentariosModel = new DefaultTableModel(dataComentarios, columnComentarios) {
			private static final long serialVersionUID = 1L;

			@Override
			public Class<?> getColumnClass(int column) {
				switch (column) {
				case 0: // USUARIO
				case 1: // COMENTARIO
					return String.class;
				case 2: // ELIMINAR (CHECKBOX)
					return Boolean.class;
				default:
					return Object.class;
				}
			}
		};

		tblComentarios = new JTable(comentariosModel);
		tblComentarios.setFillsViewportHeight(true);
		tblComentarios.setRowHeight(60); // AJUSTA LA ALTURA DE LAS FILAS
		tblComentarios.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		tblComentarios.setSelectionBackground(new Color(60, 62, 77)); // GRIS OSCURO
		tblComentarios.setBackground(new Color(70, 76, 90));
		tblComentarios.setForeground(Color.WHITE); // TEXTO EN BLANCO

		// AJUSTE DEL ANCHO DE COLUMNAS
		TableColumnModel columnModel = tblComentarios.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(150); // USUARIO
		columnModel.getColumn(1).setPreferredWidth(300); // COMENTARIO
		columnModel.getColumn(2).setPreferredWidth(50); // CHECKBOX

		// CONFIGURACIÓN DEL JSCROLLPANE QUE CONTIENE LA TABLA DE COMENTARIOS
		spTablaComentarios = new JScrollPane(tblComentarios);
		spTablaComentarios.setBounds(436, 231, 650, 300); // AJUSTA LA POSICIÓN Y TAMAÑO
		spTablaComentarios.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); // AÑADIR SCROLL VERTICAL
		add(spTablaComentarios); // AÑADIMOS EL JSCROLLPANE (QUE CONTIENE LA JTABLE) AL PANEL

		// BOTÓN "ELIMINAR" EN LA PARTE INFERIOR DERECHA
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setBackground(new Color(255, 128, 0));
		btnEliminar.setBounds(966, 553, 120, 35); // COLOCACIÓN DEL BOTÓN
		add(btnEliminar);

		// INICIALIZAR LOS ESTILOS
		initStyles();
	}

	// MÉTODO PARA INICIALIZAR LOS ESTILOS (OPCIONAL)
	public void initStyles() {
		// AQUÍ PODRÍAS AGREGAR MÁS PERSONALIZACIONES SI ES NECESARIO.
	}
}

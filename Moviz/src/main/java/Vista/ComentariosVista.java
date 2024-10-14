package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import com.jgoodies.forms.factories.DefaultComponentFactory;

public class ComentariosVista extends JPanel {

	private static final long serialVersionUID = 1L;

	// PARTE SUPERIOR (LOGO, BÚSQUEDA, BOTONES, SALIR)
	public JButton btnSalir;
	public JButton btnVolver;
	public JButton btnHistorial;
	public JButton btnPeliculas;
	private JTextField txtBuscar;
	public JLabel Busqueda;
	public JLabel IconoLogo;
	private JPanel panel;

	// SECCIÓN DE COMENTARIOS
	public JLabel lblTituloSeccion;
	public JLabel lblAgregarPuntuacion;
	public JComboBox<String> comboBoxPuntuacion;
	public JTextArea txtNuevoComentario;
	public JButton btnComentar;
	public JTable tablaComentarios;
	public JScrollPane scrollTablaComentarios;

	// CONSTRUCTOR PARA CONFIGURAR LA VISTA
	public ComentariosVista() {
		// CONFIGURACIÓN DEL PANEL
		setBackground(new Color(66, 72, 93));
		setBorder(null);
		setLayout(null); // IMPORTANTE
		setBounds(0, 0, 1140, 640); // IMPORTANTE

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

		// ICONO DE BÚSQUEDA
		Busqueda = DefaultComponentFactory.getInstance().createLabel("");
		Busqueda.setIcon(new ImageIcon(getClass().getResource("/Images/BuscarIcono.png")));
		Busqueda.setBounds(280, 17, 40, 40);
		add(Busqueda);

		// ICONO DEL LOGO
		IconoLogo = DefaultComponentFactory.getInstance().createLabel("");
		IconoLogo.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacion.png")));
		IconoLogo.setBounds(4, 6, 283, 56);
		add(IconoLogo);

		// CAMPO DE BÚSQUEDA
		txtBuscar = new JTextField();
		txtBuscar.setText("Buscar");
		txtBuscar.setBounds(322, 21, 407, 32);
		add(txtBuscar);
		txtBuscar.setColumns(10);

		// PANEL PARA LA CABECERA (FONDO GRIS OSCURO)
		panel = new JPanel();
		panel.setBackground(new Color(56, 59, 74));
		panel.setBounds(0, 0, 1225, 69);
		add(panel);

		// TÍTULO DE LA SECCIÓN "COMENTARIOS"
		lblTituloSeccion = new JLabel("Comentarios");
		lblTituloSeccion.setFont(new Font("Microsoft YaHei", Font.BOLD, 28));
		lblTituloSeccion.setForeground(new Color(255, 255, 255));
		lblTituloSeccion.setBounds(26, 80, 200, 30);
		add(lblTituloSeccion);

		// BOTÓN "VOLVER" EN LA ESQUINA SUPERIOR DERECHA
		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVolver.setBackground(new Color(255, 128, 0));
		btnVolver.setForeground(new Color(255, 255, 255));
		btnVolver.setBounds(930, 80, 120, 35);
		add(btnVolver);

		// ETIQUETA "AGREGAR COMENTARIO"
		lblAgregarPuntuacion = new JLabel("Agregar puntuación:");
		lblAgregarPuntuacion.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		lblAgregarPuntuacion.setForeground(new Color(255, 255, 255));
		lblAgregarPuntuacion.setBounds(26, 130, 200, 30);
		add(lblAgregarPuntuacion);

		// COMBOBOX PARA LA PUNTUACIÓN
		String[] puntuaciones = { "1/5", "2/5", "3/5", "4/5", "5/5" };
		comboBoxPuntuacion = new JComboBox<>(puntuaciones);
		comboBoxPuntuacion.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		comboBoxPuntuacion.setBounds(230, 130, 100, 30);
		add(comboBoxPuntuacion);

		// TEXTAREA PARA INGRESAR NUEVO COMENTARIO
		txtNuevoComentario = new JTextArea();
		txtNuevoComentario.setLineWrap(true);
		txtNuevoComentario.setWrapStyleWord(true);
		txtNuevoComentario.setFont(new Font("Microsoft YaHei", Font.PLAIN, 16));
		txtNuevoComentario.setBounds(26, 180, 850, 60);
		add(txtNuevoComentario);

		// BOTÓN "COMENTAR"
		btnComentar = new JButton("Comentar");
		btnComentar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnComentar.setBackground(new Color(255, 128, 0));
		btnComentar.setForeground(new Color(255, 255, 255));
		btnComentar.setBounds(900, 200, 150, 40);
		add(btnComentar);

		// CONFIGURACIÓN DE LA TABLA DE COMENTARIOS
		String[] columnComentarios = { "Comentario" };
		Object[][] dataComentarios = { {
				"Usuario 1 - (3/5) - 18/07/24\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Duis vulputate commodo lectus..." },
				{ "Usuario 2 - (3/5) - 10/03/24\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Duis vulputate commodo lectus..." },
				{ "Usuario 3 - (3/5) - 02/11/23\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Duis vulputate commodo lectus..." },
				{ "Usuario 4 - (3/5) - 01/08/23\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Duis vulputate commodo lectus..." },
				{ "Usuario 5 - (3/5) - 15/07/23\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Duis vulputate commodo lectus..." },
				{ "Usuario 6 - (3/5) - 10/06/23\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Duis vulputate commodo lectus..." },
				{ "Usuario 7 - (3/5) - 28/05/23\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Duis vulputate commodo lectus..." } };

		DefaultTableModel model = new DefaultTableModel(dataComentarios, columnComentarios);
		tablaComentarios = new JTable(model);
		tablaComentarios.setFont(new Font("Microsoft YaHei", Font.PLAIN, 16));
		tablaComentarios.setBackground(new Color(66, 72, 93));
		tablaComentarios.setForeground(Color.WHITE);
		tablaComentarios.setRowHeight(60); // AJUSTA LA ALTURA DE LAS FILAS
		tablaComentarios.setShowGrid(false); // OCULTA LAS LÍNEAS DE LA TABLA
		tablaComentarios.setIntercellSpacing(new Dimension(0, 0)); // REMUEVE EL ESPACIO ENTRE CELDAS
		tablaComentarios.setEnabled(false); // DESACTIVA LA EDICIÓN DE LA TABLA

		// OCULTAR EL ENCABEZADO DE LA TABLA
		JTableHeader header = tablaComentarios.getTableHeader();
		header.setVisible(false); // OCULTA EL ENCABEZADO
		tablaComentarios.setTableHeader(null); // REMUEVE COMPLETAMENTE EL ENCABEZADO

		// CONFIGURACIÓN DEL JSCROLLPANE QUE CONTIENE LA TABLA DE COMENTARIOS
		scrollTablaComentarios = new JScrollPane(tablaComentarios);
		scrollTablaComentarios.setBounds(26, 270, 1020, 300);
		scrollTablaComentarios.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		add(scrollTablaComentarios); // AÑADIMOS EL JSCROLLPANE (QUE CONTIENE LA JTABLE) AL PANEL
	}
}

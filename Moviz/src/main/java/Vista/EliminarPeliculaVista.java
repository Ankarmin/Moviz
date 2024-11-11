package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.jgoodies.forms.factories.DefaultComponentFactory;

public class EliminarPeliculaVista extends JPanel {

	private static final long serialVersionUID = 1L;

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

	public EliminarPeliculaVista() {
		setBackground(new Color(66, 72, 93));
		setBorder(null);
		setLayout(null);
		setBounds(0, 0, 1140, 640);

		// Panel de cabecera superior
		pnlCabecera = new JPanel(new BorderLayout());
		pnlCabecera.setBackground(new Color(56, 59, 74));
		pnlCabecera.setPreferredSize(new Dimension(1140, 70));
		pnlCabecera.setBounds(0, 0, 1140, 70);
		add(pnlCabecera);

		// Panel para el logo a la izquierda
		JPanel logoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		logoPanel.setOpaque(false);

		lblIconoLogo = DefaultComponentFactory.getInstance().createLabel("");
		lblIconoLogo.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacionAdministrador.png")));
		logoPanel.add(lblIconoLogo);

		// Panel para el botón de salir a la derecha
		JPanel exitPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		exitPanel.setOpaque(false);

		btnSalir = new JButton(new ImageIcon(getClass().getResource("/Images/iconosalida.png")));
		btnSalir.setContentAreaFilled(false);
		btnSalir.setBorderPainted(false);
		exitPanel.add(btnSalir);

		pnlCabecera.add(logoPanel, BorderLayout.WEST);
		pnlCabecera.add(exitPanel, BorderLayout.EAST);

		// Título de la sección
		lblTituloSeccion = new JLabel("Eliminar Películas");
		lblTituloSeccion.setFont(new Font("Microsoft YaHei", Font.BOLD, 21));
		lblTituloSeccion.setForeground(new Color(255, 255, 255));
		lblTituloSeccion.setBounds(26, 108, 227, 29);
		add(lblTituloSeccion);

		// Línea divisoria blanca
		pnlLineaBlanca = new JPanel();
		pnlLineaBlanca.setBackground(Color.WHITE);
		pnlLineaBlanca.setBounds(26, 143, getWidth() - 80, 2);
		add(pnlLineaBlanca);

		// Campo de búsqueda
		txtBuscar = new JTextField("Buscar");
		txtBuscar.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		txtBuscar.setBounds(80, 180, 250, 30);
		txtBuscar.setColumns(10);
		add(txtBuscar);

		// Icono de búsqueda
		Busqueda = DefaultComponentFactory.getInstance().createLabel("");
		Busqueda.setIcon(new ImageIcon(getClass().getResource("/Images/BuscarIcono.png")));
		Busqueda.setBounds(37, 180, 42, 30);
		add(Busqueda);

		// Nombre de la película
		lblNombrePelicula = new JLabel("Nombre película");
		lblNombrePelicula.setFont(new Font("Microsoft YaHei", Font.BOLD, 24));
		lblNombrePelicula.setForeground(new Color(255, 140, 0));
		lblNombrePelicula.setBounds(436, 181, 400, 30);
		add(lblNombrePelicula);

		// Imagen de la película
		lblImagenPelicula = new JLabel("");
		lblImagenPelicula.setOpaque(true);
		lblImagenPelicula.setBackground(Color.LIGHT_GRAY);
		lblImagenPelicula.setBounds(436, 231, 200, 300);
		add(lblImagenPelicula);

		// Etiqueta para la sinopsis
		lblSinopsis = new JLabel("Sinopsis:");
		lblSinopsis.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
		lblSinopsis.setForeground(Color.WHITE);
		lblSinopsis.setBounds(686, 231, 100, 30);
		add(lblSinopsis);

		// Área de texto para la sinopsis
		txtSinopsis = new JTextArea();
		txtSinopsis.setWrapStyleWord(true);
		txtSinopsis.setLineWrap(true);
		txtSinopsis.setEditable(false);
		txtSinopsis.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		txtSinopsis.setForeground(Color.WHITE);
		txtSinopsis.setBackground(new Color(66, 72, 93));
		txtSinopsis.setText("**Lorem ipsum dolor sit amet, consectetur adipiscing elit...");
		txtSinopsis.setBounds(686, 271, 400, 150);
		add(txtSinopsis);

		// Botón "Eliminar"
		btnEliminarPelicula = new JButton("Eliminar");
		btnEliminarPelicula.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		btnEliminarPelicula.setBackground(new Color(255, 128, 0));
		btnEliminarPelicula.setForeground(Color.WHITE);
		btnEliminarPelicula.setBounds(686, 451, 150, 40);
		add(btnEliminarPelicula);

		// Tabla de películas
		String[] columnNames = { "Lista Películas" };
		Object[][] data = {};

		tblPeliculas = new JTable(data, columnNames);
		tblPeliculas.setFillsViewportHeight(true);
		tblPeliculas.setRowHeight(30);
		tblPeliculas.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		tblPeliculas.setBackground(new Color(70, 76, 90));
		tblPeliculas.setForeground(Color.WHITE);
		tblPeliculas.setDefaultEditor(Object.class, null);

		spTabla = new JScrollPane(tblPeliculas);
		spTabla.setBounds(50, 231, 300, 300);
		add(spTabla);

		// Botón "Volver"
		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVolver.setBackground(new Color(255, 128, 0));
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setBounds(getWidth() - 180, 102, 120, 35);
		add(btnVolver);

		// Resizing components on window resize
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				int panelWidth = getWidth();
				int panelHeight = getHeight();

				pnlCabecera.setPreferredSize(new Dimension(panelWidth, 70));
				pnlCabecera.setBounds(0, 0, panelWidth, 70);

				pnlLineaBlanca.setBounds(26, 143, panelWidth - 80, 2);

				// Ajuste de posición para evitar superposición con la tabla
				int baseX = Math.max(436, panelWidth / 3); // Move left but ensure it doesn't overlap the table
				int baseY = lblNombrePelicula.getY() + lblNombrePelicula.getHeight() + 20;

				lblImagenPelicula.setBounds(baseX, baseY, 200, 300);
				lblSinopsis.setBounds(baseX + 250, baseY, 100, 30);

				// Ajustar el ancho de txtSinopsis según el ancho de la ventana
				int sinopsisWidth = Math.max(250, panelWidth - baseX - 350);
				txtSinopsis.setBounds(baseX + 250, baseY + 40, sinopsisWidth, 150);

				// Mantener la tabla sin superposición
				spTabla.setBounds(50, 231, 300, Math.min(300, panelHeight - 331));

				btnEliminarPelicula.setBounds(baseX + 250, baseY + 220, 150, 40);
				btnVolver.setBounds(panelWidth - 180, 102, 120, 35);

				revalidate();
				repaint();
			}
		});
	}

	public void initStyles() {
		// Personalizaciones adicionales si es necesario
	}
}

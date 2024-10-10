package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

import com.jgoodies.forms.factories.DefaultComponentFactory;

public class HistorialVista extends JPanel {

	private static final long serialVersionUID = 1L;
	// Variables JButton
	public JButton btnSalir;
	public JButton btnHistorial;
	public JButton btnPeliculas;

	// Variables JLabel
	public JLabel lblBusqueda;
	public JLabel lblIconoLogo;
	public JLabel lblHistorialPeliculas;
	public JLabel lblImagen;
	public JLabel lblTitulo;

	// Variables JTextField
	public JTextField txtBuscar;

	// Variables JPanel
	public JPanel pnlPrincipal;
	public JPanel pnlGrid;
	public JPanel pnlLineaBlanca;
	public JPanel panelItem;

	// Variables JScrollPane
	public JScrollPane spTablaHistorial;

	// Variables relacionadas con imágenes
	public ImageIcon originalIcon;
	public Image imagenRedimensionada;
	public ImageIcon iconoRedimensionado;

	public HistorialVista() {
		setBackground(new Color(66, 72, 93));
		setLayout(null); // IMPORTANTE
		setBounds(0, 0, 1140, 640); // IMPORTANTE

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

		pnlLineaBlanca = new JPanel();
		pnlLineaBlanca.setBackground(Color.WHITE);
		pnlLineaBlanca.setBounds(26, 123, 1060, 2);
		add(pnlLineaBlanca);

		lblHistorialPeliculas = DefaultComponentFactory.getInstance().createLabel("Historial de Peliculas");
		lblHistorialPeliculas.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblHistorialPeliculas.setForeground(new Color(255, 255, 255));
		lblHistorialPeliculas.setBounds(26, 98, 135, 14);
		add(lblHistorialPeliculas);

		spTablaHistorial = new JScrollPane();
		spTablaHistorial.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		spTablaHistorial.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		spTablaHistorial.setBounds(26, 136, 1060, 437);
		add(spTablaHistorial);

		// Crear el panel que contendrá la cuadrícula
		pnlGrid = new JPanel();
		pnlGrid.setLayout(new GridLayout(3, 4, 10, 10)); // 3 filas, 4 columnas, con 10px de espacio entre celdas
		spTablaHistorial.setViewportView(pnlGrid);

		// Añadir 12 elementos (4 columnas y 3 filas) con una imagen y un título en cada
		// celda
		for (int i = 1; i <= 12; i++) {
			panelItem = new JPanel();
			panelItem.setLayout(new BorderLayout());

			lblImagen = new JLabel();
			originalIcon = new ImageIcon(getClass().getResource("/Images/ImagenPelicula.png"));

			imagenRedimensionada = originalIcon.getImage().getScaledInstance(140, 176, Image.SCALE_SMOOTH);

			iconoRedimensionado = new ImageIcon(imagenRedimensionada);

			// Asignar el icono redimensionado al JLabel
			lblImagen.setIcon(iconoRedimensionado);
			lblImagen.setHorizontalAlignment(SwingConstants.CENTER);

			lblTitulo = new JLabel("Título " + i);
			lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
			lblTitulo.setForeground(Color.WHITE);

			// Añadir imagen y título al panelItem
			panelItem.add(lblImagen, BorderLayout.CENTER);
			panelItem.add(lblTitulo, BorderLayout.SOUTH);

			// Añadir el panelItem al pnlGrid (el GridLayout)
			pnlGrid.add(panelItem);
		}

	}

}

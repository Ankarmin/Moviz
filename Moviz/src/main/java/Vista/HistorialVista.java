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
	// VARIABLES JBUTTON
	public JButton btnSalir;
	public JButton btnHistorial;
	public JButton btnPeliculas;

	// VARIABLES JLABEL
	public JLabel lblBusqueda;
	public JLabel lblIconoLogo;
	public JLabel lblHistorialPeliculas;
	public JLabel lblImagen;
	public JLabel lblTitulo;

	// VARIABLES JTEXTFIELD
	public JTextField txtBuscar;

	// VARIABLES JPANEL
	public JPanel pnlPrincipal;
	public JPanel pnlGrid;
	public JPanel pnlLineaBlanca;
	public JPanel panelItem;

	// VARIABLES JSCROLLPANE
	public JScrollPane spTablaHistorial;

	// VARIABLES RELACIONADAS CON IMÁGENES
	public ImageIcon originalIcon;
	public Image imagenRedimensionada;
	public ImageIcon iconoRedimensionado;

	// CONSTRUCTOR PARA CONFIGURAR LA VISTA
	public HistorialVista() {
		// CONFIGURACIÓN DEL COLOR DE FONDO Y EL LAYOUT
		setBackground(new Color(66, 72, 93));
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

		// ETIQUETA "BUSCAR"
		lblBusqueda = DefaultComponentFactory.getInstance().createLabel("");
		lblBusqueda.setIcon(new ImageIcon(getClass().getResource("/Images/BuscarIcono.png")));
		lblBusqueda.setBounds(280, 17, 40, 40);
		add(lblBusqueda);

		// ICONO DEL LOGO
		lblIconoLogo = DefaultComponentFactory.getInstance().createLabel("");
		lblIconoLogo.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacion.png")));
		lblIconoLogo.setBounds(4, 6, 283, 56);
		add(lblIconoLogo);

		// CAMPO DE TEXTO "BUSCAR"
		txtBuscar = new JTextField();
		txtBuscar.setText("Buscar");
		txtBuscar.setBounds(322, 21, 407, 32);
		add(txtBuscar);
		txtBuscar.setColumns(10);

		// PANEL PRINCIPAL
		pnlPrincipal = new JPanel();
		pnlPrincipal.setBackground(new Color(56, 59, 74));
		pnlPrincipal.setBounds(0, 0, 1225, 69);
		add(pnlPrincipal);

		// LÍNEA BLANCA DIVISORIA
		pnlLineaBlanca = new JPanel();
		pnlLineaBlanca.setBackground(Color.WHITE);
		pnlLineaBlanca.setBounds(26, 123, 1060, 2);
		add(pnlLineaBlanca);

		// ETIQUETA "HISTORIAL DE PELÍCULAS"
		lblHistorialPeliculas = DefaultComponentFactory.getInstance().createLabel("Historial de Peliculas");
		lblHistorialPeliculas.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblHistorialPeliculas.setForeground(new Color(255, 255, 255));
		lblHistorialPeliculas.setBounds(26, 98, 135, 14);
		add(lblHistorialPeliculas);

		// SCROLLPANE PARA MOSTRAR EL HISTORIAL
		spTablaHistorial = new JScrollPane();
		spTablaHistorial.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		spTablaHistorial.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		spTablaHistorial.setBounds(26, 136, 1060, 437);
		add(spTablaHistorial);

		// CREAR EL PANEL QUE CONTENDRÁ LA CUADRÍCULA
		pnlGrid = new JPanel();
		pnlGrid.setLayout(new GridLayout(3, 4, 10, 10)); // 3 FILAS, 4 COLUMNAS, CON 10PX DE ESPACIO ENTRE CELDAS
		spTablaHistorial.setViewportView(pnlGrid);

		// AÑADIR 12 ELEMENTOS (4 COLUMNAS Y 3 FILAS) CON UNA IMAGEN Y UN TÍTULO EN CADA
		// CELDA
		for (int i = 1; i <= 12; i++) {
			panelItem = new JPanel();
			panelItem.setLayout(new BorderLayout());

			// LABEL PARA LA IMAGEN
			lblImagen = new JLabel();
			originalIcon = new ImageIcon(getClass().getResource("/Images/ImagenPelicula.png"));

			// REDIMENSIONAR LA IMAGEN
			imagenRedimensionada = originalIcon.getImage().getScaledInstance(140, 176, Image.SCALE_SMOOTH);
			iconoRedimensionado = new ImageIcon(imagenRedimensionada);

			// ASIGNAR EL ICONO REDIMENSIONADO AL JLABEL
			lblImagen.setIcon(iconoRedimensionado);
			lblImagen.setHorizontalAlignment(SwingConstants.CENTER);

			// LABEL PARA EL TÍTULO
			lblTitulo = new JLabel("Título " + i);
			lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
			lblTitulo.setForeground(Color.WHITE);

			// AÑADIR IMAGEN Y TÍTULO AL PANELITEM
			panelItem.add(lblImagen, BorderLayout.CENTER);
			panelItem.add(lblTitulo, BorderLayout.SOUTH);

			// AÑADIR EL PANELITEM AL PNGRID (EL GRIDLAYOUT)
			pnlGrid.add(panelItem);
		}
	}
}

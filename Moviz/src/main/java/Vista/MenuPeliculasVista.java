package Vista;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class MenuPeliculasVista extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel Busqueda;
	private JLabel IconoLogo;
	private JTextField txtBuscar;
	private JPanel panel;
	private JButton btnSalir;
	private JButton BtnHistorial;
	private JButton BotonPeliculas;
	private JPanel LineaBlanca;
	private JLabel lblNewJgoodiesLabel1;
	private JPanel panel_1;
	private JTextField txtAsdfasdfasdf;
	private JLabel lblNewLabel;
	
	public MenuPeliculasVista() {
		setBackground(new Color(66, 72, 93));
		setLayout(null); // IMPORTANTE
		setBounds(0, 0, 1140, 640);
		
		LineaBlanca = new JPanel();
		LineaBlanca.setBackground(Color.WHITE); 
		LineaBlanca.setBounds(26, 110, 1060, 2);
		add(LineaBlanca);
		
		lblNewJgoodiesLabel1 = DefaultComponentFactory.getInstance().createLabel("Peliculas Recientes");
		lblNewJgoodiesLabel1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblNewJgoodiesLabel1.setForeground(new Color(255, 255, 255));
		lblNewJgoodiesLabel1.setBounds(26, 90, 135, 14);
		add(lblNewJgoodiesLabel1);
		
		btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon(MenuUsuarioVista.class.getResource("/Images/iconosalida.png")));
		btnSalir.setBounds(1065, 12, 42, 46);
		add(btnSalir);
		
		BtnHistorial = new JButton("HISTORIAL");
		BtnHistorial.setBounds(878, 19, 120, 35);
		add(BtnHistorial);
		
		BotonPeliculas = new JButton("PELICULAS");
		BotonPeliculas.setBounds(748, 19, 120, 35);
		add(BotonPeliculas);
		
		Busqueda = DefaultComponentFactory.getInstance().createLabel("");
		Busqueda.setIcon(new ImageIcon(getClass().getResource("/Images/BuscarIcono.png")));
		Busqueda.setBounds(280, 17, 40, 40);
		add(Busqueda);

		
		IconoLogo = DefaultComponentFactory.getInstance().createLabel("");
		IconoLogo.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacion.png")));
		IconoLogo.setBounds(4, 6, 283, 56);
		add(IconoLogo);
		
		txtBuscar = new JTextField();
		txtBuscar.setText("Buscar");
		txtBuscar.setBounds(322, 21, 407, 32);
		add(txtBuscar);
		txtBuscar.setColumns(10);
		
		panel = new JPanel();
		
		panel.setBackground(new Color(56, 59, 74));
		panel.setBounds(0, 0, 1225, 69);
		add(panel);
		
		// Configurar el JScrollPane
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(26, 136, 1060, 437);
		add(scrollPane);
		
		// Crear el panel que contendrá la cuadrícula
		panel_1 = new JPanel();
		panel_1.setLayout(new GridLayout(3, 4, 10, 10));  // 3 filas, 4 columnas, con 10px de espacio entre celdas
		scrollPane.setViewportView(panel_1);
		
		// Añadir 12 elementos (4 columnas y 3 filas) con una imagen y un título en cada celda
		for (int i = 1; i <= 12; i++) {
			// Crear un panel para cada celda
			JPanel panelItem = new JPanel();
			panelItem.setLayout(new BorderLayout());
			
			// Añadir una imagen
			JLabel labelImagen = new JLabel();
			ImageIcon originalIcon = new ImageIcon(getClass().getResource("/Images/ImagenPelicula.png"));

			// Escalar la imagen a 26x156 píxeles
			Image imagenRedimensionada = originalIcon.getImage().getScaledInstance(140, 176, Image.SCALE_SMOOTH);

			// Crear un nuevo ImageIcon con la imagen redimensionada
			ImageIcon iconoRedimensionado = new ImageIcon(imagenRedimensionada);

			// Asignar el icono redimensionado al JLabel
			labelImagen.setIcon(iconoRedimensionado);
			labelImagen.setHorizontalAlignment(SwingConstants.CENTER);
			
			// Añadir un título debajo de la imagen
			JLabel labelTitulo = new JLabel("Título " + i);
			labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
			labelTitulo.setForeground(Color.WHITE);
			
			// Añadir imagen y título al panelItem
			panelItem.add(labelImagen, BorderLayout.CENTER);
			panelItem.add(labelTitulo, BorderLayout.SOUTH);
			
			// Añadir el panelItem al panel_1 (el GridLayout)
			panel_1.add(panelItem);
		}
		
		initStyles();
	}

	private void initStyles() {

	}

}
package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuUsuarioVista extends JPanel {

	private static final long serialVersionUID = 1L;
	public JButton btnSalir;
	private JTextField txtBuscar;

	public MenuUsuarioVista() {
		setBackground(new Color(66, 72, 93));
		setLayout(null); // IMPORTANTE
		setBounds(0, 0, 1140, 640); // IMPORTANTE
		
		btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon(MenuUsuarioVista.class.getResource("/Images/iconosalida.png")));
		btnSalir.setBounds(1065, 12, 42, 46);
		add(btnSalir);
		
		JButton BotonHistorial = new JButton("HISTORIAL");
		BotonHistorial.setBounds(878, 19, 120, 35);
		add(BotonHistorial);
		
		JButton BotonPeliculas = new JButton("PELICULAS");
		BotonPeliculas.setBounds(748, 19, 120, 35);
		add(BotonPeliculas);
		
		JLabel Busqueda = DefaultComponentFactory.getInstance().createLabel("");
		Busqueda.setIcon(new ImageIcon(getClass().getResource("/Images/BuscarIcono.png")));
		Busqueda.setBounds(280, 17, 40, 40);
		add(Busqueda);

		
		JLabel IconoLogo = DefaultComponentFactory.getInstance().createLabel("");
		IconoLogo.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacion.png")));
		IconoLogo.setBounds(4, 6, 283, 56);
		add(IconoLogo);
		
		txtBuscar = new JTextField();
		txtBuscar.setText("Buscar");
		txtBuscar.setBounds(322, 21, 407, 32);
		add(txtBuscar);
		txtBuscar.setColumns(10);
		
		JPanel panel = new JPanel();
		
		panel.setBackground(new Color(56, 59, 74));
		panel.setBounds(0, 0, 1225, 69);
		add(panel);
		
		JLabel TextoBienvenido = DefaultComponentFactory.getInstance().createLabel("Bienvenido de nuevo Diegote, esto es lo que estuviste viendo... ");
		TextoBienvenido.setForeground(new Color(255, 255, 255));
		TextoBienvenido.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		TextoBienvenido.setBackground(new Color(255, 255, 255));
		TextoBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		TextoBienvenido.setBounds(142, 78, 824, 47);
		add(TextoBienvenido);
		
		JPanel LineaBlanca = new JPanel();
		LineaBlanca.setBackground(Color.WHITE); 
		LineaBlanca.setBounds(26, 143, 1060, 2);
		add(LineaBlanca);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Ver lista en:");
		lblNewJgoodiesLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewJgoodiesLabel.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblNewJgoodiesLabel.setForeground(new Color(255, 255, 255));
		lblNewJgoodiesLabel.setBounds(860, 123, 125, 14);
		add(lblNewJgoodiesLabel);
		
		JLabel lblNewJgoodiesLabel1 = DefaultComponentFactory.getInstance().createLabel("Peliculas Recientes");
		lblNewJgoodiesLabel1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblNewJgoodiesLabel1.setForeground(new Color(255, 255, 255));
		lblNewJgoodiesLabel1.setBounds(26, 123, 135, 14);
		add(lblNewJgoodiesLabel1);
		
		JButton btnNewButton = new JButton("HISTORIAL");
		btnNewButton.setBounds(995, 115, 89, 23);
		add(btnNewButton);

		JPanel LineaBlanca1 = new JPanel();
		LineaBlanca1.setBackground(Color.WHITE); 
		LineaBlanca1.setBounds(26, 363, 1060, 2);
		add(LineaBlanca1);
		
		JLabel lblNewJgoodiesLabel3 = DefaultComponentFactory.getInstance().createLabel("Peliculas Favoritas");
		lblNewJgoodiesLabel3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblNewJgoodiesLabel3.setForeground(new Color(255, 255, 255));
		lblNewJgoodiesLabel3.setBounds(26, 343, 135, 14);
		add(lblNewJgoodiesLabel3);
		
		JButton btnNewButton1 = new JButton("BUSCAR PELICULAS");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton1.setBounds(949, 335, 135, 23);
		add(btnNewButton1);
		
 
		//Aqui se va a redimensionar la imagen y utilizar como ejemplo		
		JLabel PosterPelicula1 = DefaultComponentFactory.getInstance().createLabel("");
		JLabel PosterPelicula2 = DefaultComponentFactory.getInstance().createLabel("");
		// Cargar la imagen original
		ImageIcon originalIcon = new ImageIcon(MenuUsuarioVista.class.getResource("/Images/ImagenPelicula.png"));
		// Redimensionar la imagen a 140x176 píxeles para que coincida con el tamaño del JLabel
		Image imagenRedimensionada = originalIcon.getImage().getScaledInstance(140, 176, Image.SCALE_SMOOTH);
		// Crear un nuevo ImageIcon con la imagen redimensionada
		ImageIcon iconoRedimensionado = new ImageIcon(imagenRedimensionada);
		// Asignar el icono redimensionado al JLabel
		PosterPelicula1.setIcon(iconoRedimensionado);
		PosterPelicula1.setBackground(new Color(255, 255, 255));
		PosterPelicula1.setForeground(new Color(255, 255, 255));
		PosterPelicula1.setBounds(26, 156, 140, 176); // Mantener el tamaño original del JLabel
		add(PosterPelicula1);

		PosterPelicula2.setIcon(iconoRedimensionado);
		PosterPelicula2.setBackground(new Color(255, 255, 255));
		PosterPelicula2.setForeground(new Color(255, 255, 255));
		PosterPelicula2.setBounds(326, 156, 140, 176); // Mantener el tamaño original del JLabel
		add(PosterPelicula2);
		
		initStyles();
	}

	private void initStyles() {

	}
}

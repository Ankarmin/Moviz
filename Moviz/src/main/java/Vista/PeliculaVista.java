package Vista;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

public class PeliculaVista extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel posterPelicula1;
	private JLabel LblFavoritos;
	private JLabel LblEstrellas;
	private JPanel panel;
	private JLabel Busqueda;
	private JLabel IconoLogo;
	
	public JButton btnAlquilar;
	public JButton btnAlquilado;
	public JButton btnComentarios;
	public JButton btnSalir;
	public JButton btnHistorial;
	public JButton btnPeliculas;

	private JTextArea titulo1_1;
	private JTextArea txtrTextoSinopsis;
	private JTextArea TxtSinopsis;
	
	private JTextField txtBuscar;

	public PeliculaVista() {
		setBackground(new Color(66, 72, 93));
		setBounds(0, 0, 1140, 640);
		setLayout(null);
		initStyles();
				
				Busqueda = DefaultComponentFactory.getInstance().createLabel("");
				Busqueda.setIcon(new ImageIcon(getClass().getResource("/Images/BuscarIcono.png")));
				Busqueda.setBounds(280, 17, 40, 40);
				add(Busqueda);
		
				btnPeliculas = new JButton("PELICULAS");
				btnPeliculas.setBounds(748, 19, 120, 35);
				add(btnPeliculas);
		
		btnHistorial = new JButton("HISTORIAL");
		btnHistorial.setBounds(878, 19, 120, 35);
		add(btnHistorial);
		
		btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon(MenuUsuarioVista.class.getResource("/Images/iconosalida.png")));
		btnSalir.setBounds(1065, 12, 42, 46);
		add(btnSalir);
		
		txtBuscar = new JTextField();
		txtBuscar.setText("Buscar");
		txtBuscar.setBounds(322, 21, 407, 32);
		add(txtBuscar);
		txtBuscar.setColumns(10);
		
		IconoLogo = DefaultComponentFactory.getInstance().createLabel("");
		IconoLogo.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacion.png")));
		IconoLogo.setBounds(4, 6, 283, 56);
		add(IconoLogo);

		titulo1_1 = new JTextArea();
		titulo1_1.setBackground(new Color(66, 72, 93));
		titulo1_1.setForeground(new Color(255, 128, 0));
		titulo1_1.setWrapStyleWord(true);
		titulo1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 24));
		titulo1_1.setTabSize(10);
		titulo1_1.setLineWrap(true);
		titulo1_1.setRows(3);
		titulo1_1.setText("Minions: Nace un villano");
		titulo1_1.setBounds(437, 109, 314, 40);
		add(titulo1_1);

		txtrTextoSinopsis = new JTextArea();
		txtrTextoSinopsis.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		txtrTextoSinopsis.setText(
				"**Lorem ipsum dolor sit amet, consectetur adipiscing elit. \r\nNulla quam velit, vulputate eu pharetra nec, mattis ac neque. \r\nDuis vulputate commodo lectus, ac blandit elit tincidunt id. \r\nSed rhoncus, tortor sed eleifend tristique, tortor mauris \r\nmolestie elit, et lacinia ipsum quam nec dui. Quisque nec \r\nmauris sit amet elit iaculis pretium sit amet quis magna.  \r\nVivamus varius pretium ligula, a aliquam odio euismod sit \r\namet. Quisque laoreet sem sit amet orci ullamcorper at \r\nultricies metus viverra. Pellentesque arcu mauris, \r\nmalesuada quis ornare accumsan, blandit sed diam.**");
		txtrTextoSinopsis.setBackground(new Color(66, 72, 93));
		txtrTextoSinopsis.setForeground(new Color(255, 255, 255));
		txtrTextoSinopsis.setBounds(440, 203, 540, 241);
		add(txtrTextoSinopsis);

		TxtSinopsis = new JTextArea();
		TxtSinopsis.setBackground(new Color(66, 72, 93));
		TxtSinopsis.setForeground(new Color(255, 255, 255));
		TxtSinopsis.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
		TxtSinopsis.setText("Sinopsis:");
		TxtSinopsis.setBounds(440, 160, 112, 32);
		add(TxtSinopsis);

		btnAlquilar = new JButton("ALQUILAR");
		btnAlquilar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAlquilar.setBackground(new Color(255, 128, 0));
		btnAlquilar.setForeground(new Color(255, 255, 255));
		btnAlquilar.setBounds(453, 467, 139, 46);
		add(btnAlquilar);

		btnAlquilado = new JButton("ALQUILADO");
		btnAlquilado.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAlquilado.setBackground(new Color(90, 202, 23));
		btnAlquilado.setForeground(new Color(255, 255, 255));
		btnAlquilado.setBounds(453, 532, 139, 46);
		add(btnAlquilado);

		btnComentarios = new JButton("COMENTARIOS");
		btnComentarios.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnComentarios.setBackground(new Color(255, 128, 0));
		btnComentarios.setForeground(new Color(255, 255, 255));
		btnComentarios.setBounds(678, 467, 200, 46);
		add(btnComentarios);

		posterPelicula1 = DefaultComponentFactory.getInstance().createLabel("");
		ImageIcon originalIcon = new ImageIcon(MenuUsuarioVista.class.getResource("/Images/ImagenPelicula.png"));
		Image imagenRedimensionada = originalIcon.getImage().getScaledInstance(300, 323, Image.SCALE_SMOOTH);
		ImageIcon iconoRedimensionado = new ImageIcon(imagenRedimensionada);
		posterPelicula1.setIcon(iconoRedimensionado);
		posterPelicula1.setBackground(new Color(255, 255, 255));
		posterPelicula1.setForeground(new Color(255, 255, 255));
		posterPelicula1.setBounds(75, 110, 300, 323);
		add(posterPelicula1);

		LblFavoritos = DefaultComponentFactory.getInstance().createLabel("");
		ImageIcon originalIcono = new ImageIcon(PeliculaVista.class.getResource("/Images/favoritos.png"));
		Image imagenRedimen = originalIcono.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		ImageIcon iconoRedimen = new ImageIcon(imagenRedimen);
		LblFavoritos.setIcon(iconoRedimen);
		LblFavoritos.setBackground(new Color(255, 255, 255));
		LblFavoritos.setForeground(new Color(255, 255, 255));
		LblFavoritos.setBounds(73, 532, 40, 40);
		add(LblFavoritos);

		LblEstrellas = DefaultComponentFactory.getInstance().createLabel("");
		LblEstrellas.setIcon(new ImageIcon(getClass().getResource("/Images/estrellas.png")));
		LblEstrellas.setBounds(73, 467, 40, 40);
		add(LblEstrellas);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(new Color(255, 255, 255));
		textArea.setBackground(new Color(66, 72, 93));
		textArea.setFont(new Font("Microsoft YaHei", Font.BOLD, 19));
		textArea.setText("3.3");
		textArea.setBounds(128, 467, 157, 32);
		add(textArea);
		
		JTextArea txtrAadirAFavoritos = new JTextArea();
		txtrAadirAFavoritos.setForeground(new Color(255, 255, 255));
		txtrAadirAFavoritos.setBackground(new Color(66, 72, 93));
		txtrAadirAFavoritos.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
		txtrAadirAFavoritos.setText("Añadir a favoritos");
		txtrAadirAFavoritos.setBounds(128, 542, 157, 30);
		add(txtrAadirAFavoritos);
		
		panel = new JPanel();

		panel.setBackground(new Color(56, 59, 74));
		panel.setBounds(0, 0, 1225, 69);
		add(panel);
	}

	private void initStyles() {

	}
}

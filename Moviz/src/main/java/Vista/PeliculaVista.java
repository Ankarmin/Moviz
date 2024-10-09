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

	/**
	 * Create the panel.
	 */
	private JLabel lblLogoApp;
	private JLabel Busqueda;
	private JTextField txtBuscar;
	public JButton btnSalir;
	public JButton btnHistorial;
	public JButton btnPeliculas;
	private JTextArea titulo1_1;
	public JButton btnAlquilar;
	public JButton btnAlquilado;
	public JButton btnComentarios;
	private JLabel posterPelicula1;
	private JLabel LblFavoritos;
	private JLabel LblEstrellas;
	private JTextField TxtFavoritos;
	private JTextField textField;
	
	public PeliculaVista() {
		setBackground(new Color(66, 72, 93));
		setBounds(0, 0, 1140, 640);
		setLayout(null);
		
		lblLogoApp = DefaultComponentFactory.getInstance().createLabel("");
		lblLogoApp.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacion.png")));
		lblLogoApp.setBounds(10, 14, 263, 62);
		add(lblLogoApp);
		initStyles();
		
		Busqueda = DefaultComponentFactory.getInstance().createLabel("");
		Busqueda.setIcon(new ImageIcon(getClass().getResource("/Images/BuscarIcono.png")));
		Busqueda.setBounds(280, 14, 40, 40);
		add(Busqueda);
		
		txtBuscar = new JTextField();
		txtBuscar.setText("Buscar");
		txtBuscar.setBounds(330, 22, 407, 32);
		add(txtBuscar);
		txtBuscar.setColumns(10);
		
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
		
		titulo1_1 = new JTextArea();
		titulo1_1.setBackground(new Color(66, 72, 93));
		titulo1_1.setForeground(new Color(255, 128, 0));
		titulo1_1.setWrapStyleWord(true);
		titulo1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 24));
		titulo1_1.setTabSize(10);
		titulo1_1.setLineWrap(true);
		titulo1_1.setRows(3);
		titulo1_1.setText("Minions: Nace un villano");
		titulo1_1.setBounds(383, 109, 314, 40);
		add(titulo1_1);
		
		JTextArea txtrHola = new JTextArea();
		txtrHola.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		txtrHola.setText("**Lorem ipsum dolor sit amet, consectetur adipiscing elit. \r\nNulla quam velit, vulputate eu pharetra nec, mattis ac neque. \r\nDuis vulputate commodo lectus, ac blandit elit tincidunt id. \r\nSed rhoncus, tortor sed eleifend tristique, tortor mauris \r\nmolestie elit, et lacinia ipsum quam nec dui. Quisque nec \r\nmauris sit amet elit iaculis pretium sit amet quis magna.  \r\nVivamus varius pretium ligula, a aliquam odio euismod sit \r\namet. Quisque laoreet sem sit amet orci ullamcorper at \r\nultricies metus viverra. Pellentesque arcu mauris, \r\nmalesuada quis ornare accumsan, blandit sed diam.**");
		txtrHola.setBackground(new Color(66, 72, 93));
		txtrHola.setForeground(new Color(255, 255, 255));
		txtrHola.setBounds(383, 203, 540, 241);
		add(txtrHola);
		
		JTextArea TxtSinopsis = new JTextArea();
		TxtSinopsis.setBackground(new Color(66, 72, 93));
		TxtSinopsis.setForeground(new Color(255, 255, 255));
		TxtSinopsis.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
		TxtSinopsis.setText("Sinopsis:");
		TxtSinopsis.setBounds(383, 160, 112, 32);
		add(TxtSinopsis);
		
		btnAlquilar = new JButton("ALQUILAR");
		btnAlquilar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAlquilar.setBackground(new Color(255, 128, 0));
		btnAlquilar.setForeground(new Color(255, 255, 255));
		btnAlquilar.setBounds(417, 467, 139, 46);
		add(btnAlquilar);
		
		btnAlquilado = new JButton("ALQUILAR");
		btnAlquilado.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAlquilado.setBackground(new Color(128, 255, 0));
		btnAlquilado.setForeground(new Color(255, 255, 255));
		btnAlquilado.setBounds(417, 547, 139, 46);
		add(btnAlquilado);
		
		btnComentarios = new JButton("COMENTARIOS");
		btnComentarios.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnComentarios.setBackground(new Color(255, 128, 0));
		btnComentarios.setForeground(new Color(255, 255, 255));
		btnComentarios.setBounds(655, 467, 200, 46);
		add(btnComentarios);
		
		posterPelicula1 = DefaultComponentFactory.getInstance().createLabel("");
		ImageIcon originalIcon = new ImageIcon(MenuUsuarioVista.class.getResource("/Images/ImagenPelicula.png"));
		Image imagenRedimensionada = originalIcon.getImage().getScaledInstance(300, 323, Image.SCALE_SMOOTH);
		ImageIcon iconoRedimensionado = new ImageIcon(imagenRedimensionada);
		posterPelicula1.setIcon(iconoRedimensionado);
		posterPelicula1.setBackground(new Color(255, 255, 255));
		posterPelicula1.setForeground(new Color(255, 255, 255));
		posterPelicula1.setBounds(45, 109, 300, 323);
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
		
		TxtFavoritos = new JTextField();
		TxtFavoritos.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
		TxtFavoritos.setForeground(new Color(255, 255, 255));
		TxtFavoritos.setBackground(new Color(66, 72, 93));
		TxtFavoritos.setText("Añadir a favoritos");
		TxtFavoritos.setBounds(128, 532, 157, 40);
		add(TxtFavoritos);
		TxtFavoritos.setColumns(10);
		
		textField = new JTextField();
		textField.setText("3.3");
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(66, 72, 93));
		textField.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
		textField.setBounds(123, 467, 162, 35);
		add(textField);
		textField.setColumns(10);
		
	}
	private void initStyles() {

	}
}

package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.jgoodies.forms.factories.DefaultComponentFactory;

public class MenuUsuarioVista extends JPanel {

	private static final long serialVersionUID = 1L;
	public JButton btnSalir;
	public JButton btnHistorial;
	public JButton btnPeliculas;
	public JButton btnHistorialSecundario;
	public JButton btnPeliculaSecundario;

	private JTextField txtBuscar;

	public JLabel posterPelicula1;
	private JLabel posterPelicula2;
	private JLabel posterPelicula3;
	private JLabel posterPelicula4;
	private JLabel posterPelicula5;
	private JLabel posterPelicula6;
	public JLabel Busqueda;
	public JLabel IconoLogo;
	private JLabel TextoBienvenido;
	private JLabel lblNewJgoodiesLabel;
	private JLabel lblNewJgoodiesLabel1;
	private JLabel lblNewJgoodiesLabel3;

	private JTextArea titulo1_1;
	private JTextArea titulo2_1;
	private JTextArea titulo3;
	private JTextArea titulo4;
	private JTextArea titulo5;
	private JTextArea titulo6;
	private JTextArea tiempoHoras1;
	private JTextArea tiempoHoras2;
	private JTextArea tiempoHoras3;
	private JTextArea tiempoHoras4;
	private JTextArea tiempoHoras5;
	private JTextArea tiempoHoras6;

	private JPanel panel;
	private JPanel LineaBlanca;
	private JPanel LineaBlanca1;

	private JTextArea textohorassmall1;
	private JTextArea textohorassmall2;
	private JTextArea textohorassmall3;
	private JTextArea textohorassmall4;
	private JTextArea textohorassmall5;
	private JTextArea textohorassmall6;
	private JTextArea textoduracion1;
	private JTextArea textoduracion2;
	private JTextArea textoduracion3;
	private JTextArea textoduracion4;
	private JTextArea textoduracion5;
	private JTextArea textoduracion6;

	public MenuUsuarioVista() {
		setBackground(new Color(66, 72, 93));
		setLayout(null); // IMPORTANTE
		setBounds(0, 0, 1140, 640); // IMPORTANTE

		textohorassmall2 = new JTextArea();
		textohorassmall2.setWrapStyleWord(true);
		textohorassmall2.setText("horas");
		textohorassmall2.setTabSize(10);
		textohorassmall2.setRows(3);
		textohorassmall2.setLineWrap(true);
		textohorassmall2.setForeground(Color.WHITE);
		textohorassmall2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		textohorassmall2.setBackground(new Color(66, 72, 93));
		textohorassmall2.setBounds(570, 311, 67, 26);
		add(textohorassmall2);

		textohorassmall1 = new JTextArea();
		textohorassmall1.setWrapStyleWord(true);
		textohorassmall1.setText("horas");
		textohorassmall1.setTabSize(10);
		textohorassmall1.setRows(3);
		textohorassmall1.setLineWrap(true);
		textohorassmall1.setForeground(Color.WHITE);
		textohorassmall1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		textohorassmall1.setBackground(new Color(66, 72, 93));
		textohorassmall1.setBounds(220, 311, 67, 26);
		add(textohorassmall1);

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

		TextoBienvenido = DefaultComponentFactory.getInstance()
				.createLabel("Bienvenido de nuevo Diegote, esto es lo que estuviste viendo... ");
		TextoBienvenido.setForeground(new Color(255, 255, 255));
		TextoBienvenido.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		TextoBienvenido.setBackground(new Color(255, 255, 255));
		TextoBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		TextoBienvenido.setBounds(142, 78, 824, 47);
		add(TextoBienvenido);

		LineaBlanca = new JPanel();
		LineaBlanca.setBackground(Color.WHITE);
		LineaBlanca.setBounds(26, 143, 1060, 2);
		add(LineaBlanca);

		lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Ver lista en:");
		lblNewJgoodiesLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewJgoodiesLabel.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblNewJgoodiesLabel.setForeground(new Color(255, 255, 255));
		lblNewJgoodiesLabel.setBounds(860, 123, 125, 14);
		add(lblNewJgoodiesLabel);

		lblNewJgoodiesLabel1 = DefaultComponentFactory.getInstance().createLabel("Peliculas Recientes");
		lblNewJgoodiesLabel1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblNewJgoodiesLabel1.setForeground(new Color(255, 255, 255));
		lblNewJgoodiesLabel1.setBounds(26, 123, 135, 14);
		add(lblNewJgoodiesLabel1);

		btnHistorialSecundario = new JButton("HISTORIAL");
		btnHistorialSecundario.setBounds(995, 115, 89, 23);
		add(btnHistorialSecundario);

		LineaBlanca1 = new JPanel();
		LineaBlanca1.setBackground(Color.WHITE);
		LineaBlanca1.setBounds(26, 373, 1060, 2);
		add(LineaBlanca1);

		lblNewJgoodiesLabel3 = DefaultComponentFactory.getInstance().createLabel("Peliculas Favoritas");
		lblNewJgoodiesLabel3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblNewJgoodiesLabel3.setForeground(new Color(255, 255, 255));
		lblNewJgoodiesLabel3.setBounds(26, 353, 135, 14);
		add(lblNewJgoodiesLabel3);

		btnPeliculaSecundario = new JButton("BUSCAR PELICULAS");
		btnPeliculaSecundario.setBounds(949, 345, 135, 23);
		add(btnPeliculaSecundario);

		// IMAGENES DE HISTORIAL
		posterPelicula1 = DefaultComponentFactory.getInstance().createLabel("");
		posterPelicula2 = DefaultComponentFactory.getInstance().createLabel("");
		posterPelicula3 = DefaultComponentFactory.getInstance().createLabel("");
		ImageIcon originalIcon = new ImageIcon(MenuUsuarioVista.class.getResource("/Images/ImagenPelicula.png"));
		Image imagenRedimensionada = originalIcon.getImage().getScaledInstance(140, 176, Image.SCALE_SMOOTH);
		ImageIcon iconoRedimensionado = new ImageIcon(imagenRedimensionada);

		posterPelicula1.setIcon(iconoRedimensionado);
		posterPelicula1.setBackground(new Color(255, 255, 255));
		posterPelicula1.setForeground(new Color(255, 255, 255));
		posterPelicula1.setBounds(26, 156, 140, 176);
		add(posterPelicula1);

		posterPelicula2.setIcon(iconoRedimensionado);
		posterPelicula2.setBackground(new Color(255, 255, 255));
		posterPelicula2.setForeground(new Color(255, 255, 255));
		posterPelicula2.setBounds(376, 156, 140, 176);
		add(posterPelicula2);

		posterPelicula3.setIcon(iconoRedimensionado);
		posterPelicula3.setBackground(new Color(255, 255, 255));
		posterPelicula3.setForeground(new Color(255, 255, 255));
		posterPelicula3.setBounds(726, 156, 140, 176);
		add(posterPelicula3);

		// IMAGENES DE RECIENTES
		posterPelicula4 = DefaultComponentFactory.getInstance().createLabel("");
		posterPelicula5 = DefaultComponentFactory.getInstance().createLabel("");
		posterPelicula6 = DefaultComponentFactory.getInstance().createLabel("");

		posterPelicula4.setIcon(iconoRedimensionado);
		posterPelicula4.setBackground(new Color(255, 255, 255));
		posterPelicula4.setForeground(new Color(255, 255, 255));
		posterPelicula4.setBounds(26, 386, 140, 176);
		add(posterPelicula4);

		posterPelicula5.setIcon(iconoRedimensionado);
		posterPelicula5.setBackground(new Color(255, 255, 255));
		posterPelicula5.setForeground(new Color(255, 255, 255));
		posterPelicula5.setBounds(376, 386, 140, 176);
		add(posterPelicula5);

		posterPelicula6.setIcon(iconoRedimensionado);
		posterPelicula6.setBackground(new Color(255, 255, 255));
		posterPelicula6.setForeground(new Color(255, 255, 255));
		posterPelicula6.setBounds(726, 386, 140, 176);
		add(posterPelicula6);

		titulo1_1 = new JTextArea();
		titulo1_1.setBackground(new Color(66, 72, 93));
		titulo1_1.setForeground(new Color(255, 255, 255));
		titulo1_1.setWrapStyleWord(true);
		titulo1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		titulo1_1.setTabSize(10);
		titulo1_1.setLineWrap(true);
		titulo1_1.setRows(3);
		titulo1_1.setText("Minions: Nace un villano");
		titulo1_1.setBounds(176, 156, 135, 97);
		add(titulo1_1);

		tiempoHoras1 = new JTextArea();
		tiempoHoras1.setWrapStyleWord(true);
		tiempoHoras1.setText("1:30 ");
		tiempoHoras1.setTabSize(10);
		tiempoHoras1.setRows(3);
		tiempoHoras1.setLineWrap(true);
		tiempoHoras1.setForeground(Color.WHITE);
		tiempoHoras1.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		tiempoHoras1.setBackground(new Color(66, 72, 93));
		tiempoHoras1.setBounds(176, 307, 49, 26);
		add(tiempoHoras1);

		textoduracion1 = new JTextArea();
		textoduracion1.setWrapStyleWord(true);
		textoduracion1.setText("Duración:");
		textoduracion1.setTabSize(10);
		textoduracion1.setRows(3);
		textoduracion1.setLineWrap(true);
		textoduracion1.setForeground(Color.WHITE);
		textoduracion1.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		textoduracion1.setBackground(new Color(66, 72, 93));
		textoduracion1.setBounds(176, 280, 98, 24);
		add(textoduracion1);

		textoduracion2 = new JTextArea();
		textoduracion2.setWrapStyleWord(true);
		textoduracion2.setText("Duración:");
		textoduracion2.setTabSize(10);
		textoduracion2.setRows(3);
		textoduracion2.setLineWrap(true);
		textoduracion2.setForeground(Color.WHITE);
		textoduracion2.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		textoduracion2.setBackground(new Color(66, 72, 93));
		textoduracion2.setBounds(526, 280, 98, 24);
		add(textoduracion2);

		tiempoHoras2 = new JTextArea();
		tiempoHoras2.setWrapStyleWord(true);
		tiempoHoras2.setText("1:30 ");
		tiempoHoras2.setTabSize(10);
		tiempoHoras2.setRows(3);
		tiempoHoras2.setLineWrap(true);
		tiempoHoras2.setForeground(Color.WHITE);
		tiempoHoras2.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		tiempoHoras2.setBackground(new Color(66, 72, 93));
		tiempoHoras2.setBounds(526, 307, 49, 26);
		add(tiempoHoras2);

		titulo2_1 = new JTextArea();
		titulo2_1.setWrapStyleWord(true);
		titulo2_1.setText("Minions: Nace un villano");
		titulo2_1.setTabSize(10);
		titulo2_1.setRows(3);
		titulo2_1.setLineWrap(true);
		titulo2_1.setForeground(Color.WHITE);
		titulo2_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		titulo2_1.setBackground(new Color(66, 72, 93));
		titulo2_1.setBounds(526, 156, 135, 97);
		add(titulo2_1);

		textohorassmall3 = new JTextArea();
		textohorassmall3.setWrapStyleWord(true);
		textohorassmall3.setText("horas");
		textohorassmall3.setTabSize(10);
		textohorassmall3.setRows(3);
		textohorassmall3.setLineWrap(true);
		textohorassmall3.setForeground(Color.WHITE);
		textohorassmall3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		textohorassmall3.setBackground(new Color(66, 72, 93));
		textohorassmall3.setBounds(922, 311, 67, 26);
		add(textohorassmall3);

		tiempoHoras3 = new JTextArea();
		tiempoHoras3.setWrapStyleWord(true);
		tiempoHoras3.setText("1:30 ");
		tiempoHoras3.setTabSize(10);
		tiempoHoras3.setRows(3);
		tiempoHoras3.setLineWrap(true);
		tiempoHoras3.setForeground(Color.WHITE);
		tiempoHoras3.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		tiempoHoras3.setBackground(new Color(66, 72, 93));
		tiempoHoras3.setBounds(878, 307, 49, 26);
		add(tiempoHoras3);

		textoduracion3 = new JTextArea();
		textoduracion3.setWrapStyleWord(true);
		textoduracion3.setText("Duración:");
		textoduracion3.setTabSize(10);
		textoduracion3.setRows(3);
		textoduracion3.setLineWrap(true);
		textoduracion3.setForeground(Color.WHITE);
		textoduracion3.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		textoduracion3.setBackground(new Color(66, 72, 93));
		textoduracion3.setBounds(878, 280, 98, 24);
		add(textoduracion3);

		titulo3 = new JTextArea();
		titulo3.setWrapStyleWord(true);
		titulo3.setText("Minions: Nace un villano");
		titulo3.setTabSize(10);
		titulo3.setRows(3);
		titulo3.setLineWrap(true);
		titulo3.setForeground(Color.WHITE);
		titulo3.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		titulo3.setBackground(new Color(66, 72, 93));
		titulo3.setBounds(878, 156, 135, 97);
		add(titulo3);

		textohorassmall6 = new JTextArea();
		textohorassmall6.setWrapStyleWord(true);
		textohorassmall6.setText("horas");
		textohorassmall6.setTabSize(10);
		textohorassmall6.setRows(3);
		textohorassmall6.setLineWrap(true);
		textohorassmall6.setForeground(Color.WHITE);
		textohorassmall6.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		textohorassmall6.setBackground(new Color(66, 72, 93));
		textohorassmall6.setBounds(922, 541, 67, 26);
		add(textohorassmall6);

		tiempoHoras6 = new JTextArea();
		tiempoHoras6.setWrapStyleWord(true);
		tiempoHoras6.setText("1:30 ");
		tiempoHoras6.setTabSize(10);
		tiempoHoras6.setRows(3);
		tiempoHoras6.setLineWrap(true);
		tiempoHoras6.setForeground(Color.WHITE);
		tiempoHoras6.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		tiempoHoras6.setBackground(new Color(66, 72, 93));
		tiempoHoras6.setBounds(878, 537, 49, 26);
		add(tiempoHoras6);

		textoduracion6 = new JTextArea();
		textoduracion6.setWrapStyleWord(true);
		textoduracion6.setText("Duración:");
		textoduracion6.setTabSize(10);
		textoduracion6.setRows(3);
		textoduracion6.setLineWrap(true);
		textoduracion6.setForeground(Color.WHITE);
		textoduracion6.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		textoduracion6.setBackground(new Color(66, 72, 93));
		textoduracion6.setBounds(878, 510, 98, 24);
		add(textoduracion6);

		titulo6 = new JTextArea();
		titulo6.setWrapStyleWord(true);
		titulo6.setText("Minions: Nace un villano");
		titulo6.setTabSize(10);
		titulo6.setRows(3);
		titulo6.setLineWrap(true);
		titulo6.setForeground(Color.WHITE);
		titulo6.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		titulo6.setBackground(new Color(66, 72, 93));
		titulo6.setBounds(878, 386, 135, 97);
		add(titulo6);

		textohorassmall5 = new JTextArea();
		textohorassmall5.setWrapStyleWord(true);
		textohorassmall5.setText("horas");
		textohorassmall5.setTabSize(10);
		textohorassmall5.setRows(3);
		textohorassmall5.setLineWrap(true);
		textohorassmall5.setForeground(Color.WHITE);
		textohorassmall5.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		textohorassmall5.setBackground(new Color(66, 72, 93));
		textohorassmall5.setBounds(570, 541, 67, 26);
		add(textohorassmall5);

		tiempoHoras5 = new JTextArea();
		tiempoHoras5.setWrapStyleWord(true);
		tiempoHoras5.setText("1:30 ");
		tiempoHoras5.setTabSize(10);
		tiempoHoras5.setRows(3);
		tiempoHoras5.setLineWrap(true);
		tiempoHoras5.setForeground(Color.WHITE);
		tiempoHoras5.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		tiempoHoras5.setBackground(new Color(66, 72, 93));
		tiempoHoras5.setBounds(526, 537, 49, 26);
		add(tiempoHoras5);

		textoduracion5 = new JTextArea();
		textoduracion5.setWrapStyleWord(true);
		textoduracion5.setText("Duración:");
		textoduracion5.setTabSize(10);
		textoduracion5.setRows(3);
		textoduracion5.setLineWrap(true);
		textoduracion5.setForeground(Color.WHITE);
		textoduracion5.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		textoduracion5.setBackground(new Color(66, 72, 93));
		textoduracion5.setBounds(526, 510, 98, 24);
		add(textoduracion5);

		titulo5 = new JTextArea();
		titulo5.setWrapStyleWord(true);
		titulo5.setText("Minions: Nace un villano");
		titulo5.setTabSize(10);
		titulo5.setRows(3);
		titulo5.setLineWrap(true);
		titulo5.setForeground(Color.WHITE);
		titulo5.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		titulo5.setBackground(new Color(66, 72, 93));
		titulo5.setBounds(526, 386, 135, 97);
		add(titulo5);

		tiempoHoras4 = new JTextArea();
		tiempoHoras4.setWrapStyleWord(true);
		tiempoHoras4.setText("1:30 ");
		tiempoHoras4.setTabSize(10);
		tiempoHoras4.setRows(3);
		tiempoHoras4.setLineWrap(true);
		tiempoHoras4.setForeground(Color.WHITE);
		tiempoHoras4.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		tiempoHoras4.setBackground(new Color(66, 72, 93));
		tiempoHoras4.setBounds(176, 537, 49, 26);
		add(tiempoHoras4);

		textohorassmall4 = new JTextArea();
		textohorassmall4.setWrapStyleWord(true);
		textohorassmall4.setText("horas");
		textohorassmall4.setTabSize(10);
		textohorassmall4.setRows(3);
		textohorassmall4.setLineWrap(true);
		textohorassmall4.setForeground(Color.WHITE);
		textohorassmall4.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		textohorassmall4.setBackground(new Color(66, 72, 93));
		textohorassmall4.setBounds(220, 541, 67, 26);
		add(textohorassmall4);

		textoduracion4 = new JTextArea();
		textoduracion4.setWrapStyleWord(true);
		textoduracion4.setText("Duración:");
		textoduracion4.setTabSize(10);
		textoduracion4.setRows(3);
		textoduracion4.setLineWrap(true);
		textoduracion4.setForeground(Color.WHITE);
		textoduracion4.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		textoduracion4.setBackground(new Color(66, 72, 93));
		textoduracion4.setBounds(176, 510, 98, 24);
		add(textoduracion4);

		titulo4 = new JTextArea();
		titulo4.setWrapStyleWord(true);
		titulo4.setText("Minions: Nace un villano");
		titulo4.setTabSize(10);
		titulo4.setRows(3);
		titulo4.setLineWrap(true);
		titulo4.setForeground(Color.WHITE);
		titulo4.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		titulo4.setBackground(new Color(66, 72, 93));
		titulo4.setBounds(176, 386, 135, 97);
		add(titulo4);

		initStyles();
	}

	private void initStyles() {

	}
}

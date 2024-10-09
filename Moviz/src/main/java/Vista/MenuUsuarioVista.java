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
import javax.swing.JTextArea;

public class MenuUsuarioVista extends JPanel {

	private static final long serialVersionUID = 1L;
	public JButton btnSalir, BotonHistorial, BotonPeliculas,BotonHistorialSecundario, BotonPeliculaSecundario;
	public JTextField txtBuscar;
	public JLabel PosterPelicula1, PosterPelicula2, PosterPelicula3,PosterPelicula4, PosterPelicula5, PosterPelicula6;
	
	public JTextArea Titulo1_1,Titulo2_1,Titulo3,titulo4, titulo5, titulo6, 
	TiempoHoras1,TiempoHoras2,TiempoHoras3,tiempoHoras4,tiempoHoras5,tiempoHoras6; 
	
	private JLabel Busqueda, IconoLogo, TextoBienvenido, lblNewJgoodiesLabel,lblNewJgoodiesLabel1, lblNewJgoodiesLabel3;
	private JPanel panel,LineaBlanca, LineaBlanca1;
	private JTextArea textohorassmall1,textohorassmall2,  textohorassmall3,textohorassmall4,textohorassmall5, textohorassmall6;;
	private JTextArea textoduracion1, textoduracion2, textoduracion3, textoduracion4, textoduracion5, textoduracion6;


	
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
		
		BotonHistorial = new JButton("HISTORIAL");
		BotonHistorial.setBounds(878, 19, 120, 35);
		add(BotonHistorial);
		
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
		
		TextoBienvenido = DefaultComponentFactory.getInstance().createLabel("Bienvenido de nuevo Diegote, esto es lo que estuviste viendo... ");
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
		
		BotonHistorialSecundario = new JButton("HISTORIAL");
		BotonHistorialSecundario.setBounds(995, 115, 89, 23);
		add(BotonHistorialSecundario);

		LineaBlanca1 = new JPanel();
		LineaBlanca1.setBackground(Color.WHITE); 
		LineaBlanca1.setBounds(26, 373, 1060, 2);
		add(LineaBlanca1);
		
		lblNewJgoodiesLabel3 = DefaultComponentFactory.getInstance().createLabel("Peliculas Favoritas");
		lblNewJgoodiesLabel3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblNewJgoodiesLabel3.setForeground(new Color(255, 255, 255));
		lblNewJgoodiesLabel3.setBounds(26, 353, 135, 14);
		add(lblNewJgoodiesLabel3);
		
		BotonPeliculaSecundario = new JButton("BUSCAR PELICULAS");
		BotonPeliculaSecundario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BotonPeliculaSecundario.setBounds(949, 345, 135, 23);
		add(BotonPeliculaSecundario);
		
		//IMAGENES DE HISTORIAL
			//Aqui se va a redimensionar la imagen y utilizar como ejemplo		
			PosterPelicula1 = DefaultComponentFactory.getInstance().createLabel("");
			PosterPelicula2 = DefaultComponentFactory.getInstance().createLabel("");
			PosterPelicula3 = DefaultComponentFactory.getInstance().createLabel("");
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
			PosterPelicula2.setBounds(376, 156, 140, 176); // Mantener el tamaño original del JLabel
			add(PosterPelicula2);
			
			PosterPelicula3.setIcon(iconoRedimensionado);
			PosterPelicula3.setBackground(new Color(255, 255, 255));
			PosterPelicula3.setForeground(new Color(255, 255, 255));
			PosterPelicula3.setBounds(726, 156, 140, 176); // Mantener el tamaño original del JLabel
			add(PosterPelicula3);

			//IMAGENES DE RECIENTES
			//Aqui se va a redimensionar la imagen y utilizar como ejemplo		
			PosterPelicula4 = DefaultComponentFactory.getInstance().createLabel("");
			PosterPelicula5 = DefaultComponentFactory.getInstance().createLabel("");
			PosterPelicula6 = DefaultComponentFactory.getInstance().createLabel("");
		
			//ImageIcon originalIcon = new ImageIcon(MenuUsuarioVista.class.getResource("/Images/ImagenPelicula.png"));
		
			//Image imagenRedimensionada = originalIcon.getImage().getScaledInstance(140, 176, Image.SCALE_SMOOTH);
		
			//ImageIcon iconoRedimensionado = new ImageIcon(imagenRedimensionada);
			
			PosterPelicula4.setIcon(iconoRedimensionado);
			PosterPelicula4.setBackground(new Color(255, 255, 255));
			PosterPelicula4.setForeground(new Color(255, 255, 255));
			PosterPelicula4.setBounds(26, 386, 140, 176); // Mantener el tamaño original del JLabel
			add(PosterPelicula4);
	
			PosterPelicula5.setIcon(iconoRedimensionado);
			PosterPelicula5.setBackground(new Color(255, 255, 255));
			PosterPelicula5.setForeground(new Color(255, 255, 255));
			PosterPelicula5.setBounds(376, 386, 140, 176); // Mantener el tamaño original del JLabel
			add(PosterPelicula5);
			
			PosterPelicula6.setIcon(iconoRedimensionado);
			PosterPelicula6.setBackground(new Color(255, 255, 255));
			PosterPelicula6.setForeground(new Color(255, 255, 255));
			PosterPelicula6.setBounds(726, 386, 140, 176); // Mantener el tamaño original del JLabel
			add(PosterPelicula6);		
		
		
		Titulo1_1 = new JTextArea();
		Titulo1_1.setBackground(new Color(66, 72, 93));
		Titulo1_1.setForeground(new Color(255, 255, 255));
		Titulo1_1.setWrapStyleWord(true);
		Titulo1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		Titulo1_1.setTabSize(10);
		Titulo1_1.setLineWrap(true);
		Titulo1_1.setRows(3);
		Titulo1_1.setText("Minions: Nace un villano");
		Titulo1_1.setBounds(176, 156, 135, 97);
		add(Titulo1_1);
		
		TiempoHoras1 = new JTextArea();
		TiempoHoras1.setWrapStyleWord(true);
		TiempoHoras1.setText("1:30 ");
		TiempoHoras1.setTabSize(10);
		TiempoHoras1.setRows(3);
		TiempoHoras1.setLineWrap(true);
		TiempoHoras1.setForeground(Color.WHITE);
		TiempoHoras1.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		TiempoHoras1.setBackground(new Color(66, 72, 93));
		TiempoHoras1.setBounds(176, 307, 49, 26);
		add(TiempoHoras1);
		
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
		
		TiempoHoras2 = new JTextArea();
		TiempoHoras2.setWrapStyleWord(true);
		TiempoHoras2.setText("1:30 ");
		TiempoHoras2.setTabSize(10);
		TiempoHoras2.setRows(3);
		TiempoHoras2.setLineWrap(true);
		TiempoHoras2.setForeground(Color.WHITE);
		TiempoHoras2.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		TiempoHoras2.setBackground(new Color(66, 72, 93));
		TiempoHoras2.setBounds(526, 307, 49, 26);
		add(TiempoHoras2);
		
		Titulo2_1 = new JTextArea();
		Titulo2_1.setWrapStyleWord(true);
		Titulo2_1.setText("Minions: Nace un villano");
		Titulo2_1.setTabSize(10);
		Titulo2_1.setRows(3);
		Titulo2_1.setLineWrap(true);
		Titulo2_1.setForeground(Color.WHITE);
		Titulo2_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		Titulo2_1.setBackground(new Color(66, 72, 93));
		Titulo2_1.setBounds(526, 156, 135, 97);
		add(Titulo2_1);
		
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
		
		TiempoHoras3 = new JTextArea();
		TiempoHoras3.setWrapStyleWord(true);
		TiempoHoras3.setText("1:30 ");
		TiempoHoras3.setTabSize(10);
		TiempoHoras3.setRows(3);
		TiempoHoras3.setLineWrap(true);
		TiempoHoras3.setForeground(Color.WHITE);
		TiempoHoras3.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		TiempoHoras3.setBackground(new Color(66, 72, 93));
		TiempoHoras3.setBounds(878, 307, 49, 26);
		add(TiempoHoras3);
		
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
		
		Titulo3 = new JTextArea();
		Titulo3.setWrapStyleWord(true);
		Titulo3.setText("Minions: Nace un villano");
		Titulo3.setTabSize(10);
		Titulo3.setRows(3);
		Titulo3.setLineWrap(true);
		Titulo3.setForeground(Color.WHITE);
		Titulo3.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		Titulo3.setBackground(new Color(66, 72, 93));
		Titulo3.setBounds(878, 156, 135, 97);
		add(Titulo3);
		
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

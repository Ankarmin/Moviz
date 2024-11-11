package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.jgoodies.forms.factories.DefaultComponentFactory;

public class PeliculaVista extends JPanel {

	private static final long serialVersionUID = 1L;
	public JLabel posterPelicula1;
	public JLabel LblFavoritos;
	public JLabel LblEstrellas;
	public JLabel Busqueda;
	public JLabel IconoLogo;
	public JLabel textPuntuacion;

	public JButton btnAlquilar;
	public JButton btnAlquilado;
	public JButton btnComentarios;
	public JButton btnSalir;
	public JButton btnHistorial;
	public JButton btnPeliculas;

	public JTextField txtBuscar;
	public JLabel titulo1_1;
	public JTextArea txtrTextoSinopsis;
	public JTextArea txtrAadirAFavoritos;
	public JScrollPane scrollSinopsis;
	public JLabel lblSinopsis;

	public PeliculaVista() {
		setPreferredSize(new Dimension(1140, 640));
		setBackground(new Color(66, 72, 93));
		setLayout(new BorderLayout());

		JPanel pnlSuperior = new JPanel(new BorderLayout());
		pnlSuperior.setBackground(new Color(56, 59, 74));
		add(pnlSuperior, BorderLayout.NORTH);

		IconoLogo = DefaultComponentFactory.getInstance().createLabel("");
		IconoLogo.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacion.png")));
		pnlSuperior.add(IconoLogo, BorderLayout.WEST);

		JPanel pnlSalir = new JPanel();
		pnlSalir.setBackground(new Color(56, 59, 74));
		pnlSuperior.add(pnlSalir, BorderLayout.EAST);
		pnlSalir.setLayout(new BorderLayout(0, 0));

		JLabel lblSpaceTop = new JLabel("   ");
		pnlSalir.add(lblSpaceTop, BorderLayout.NORTH);

		JLabel lblSpaceBottom = new JLabel("   ");
		pnlSalir.add(lblSpaceBottom, BorderLayout.SOUTH);

		btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon(getClass().getResource("/Images/iconosalida.png")));
		pnlSalir.add(btnSalir);

		JLabel lblSpaceRight = new JLabel("   ");
		pnlSalir.add(lblSpaceRight, BorderLayout.EAST);

		JPanel pnlMenu = new JPanel();
		pnlMenu.setBackground(new Color(56, 59, 74));
		pnlSuperior.add(pnlMenu, BorderLayout.CENTER);
		pnlMenu.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_3 = new JLabel("   ");
		pnlMenu.add(lblNewLabel_3, BorderLayout.NORTH);

		JLabel lblNewLabel_4 = new JLabel("   ");
		pnlMenu.add(lblNewLabel_4, BorderLayout.SOUTH);

		JPanel pnlMenuSuperior = new JPanel();
		pnlMenuSuperior.setBackground(new Color(56, 59, 74));
		pnlMenu.add(pnlMenuSuperior, BorderLayout.CENTER);
		pnlMenuSuperior.setLayout(new BorderLayout(0, 0));

		Busqueda = new JLabel("");
		Busqueda.setIcon(new ImageIcon(getClass().getResource("/Images/BuscarIcono.png")));
		pnlMenuSuperior.add(Busqueda, BorderLayout.WEST);

		JPanel pnlContenidoBotones = new JPanel();
		pnlContenidoBotones.setBackground(new Color(56, 59, 74));
		pnlMenuSuperior.add(pnlContenidoBotones, BorderLayout.EAST);
		pnlContenidoBotones.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_11 = new JLabel("      ");
		pnlContenidoBotones.add(lblNewLabel_11, BorderLayout.NORTH);

		JPanel pnlBotones = new JPanel();
		pnlBotones.setBackground(new Color(56, 59, 74));
		pnlContenidoBotones.add(pnlBotones);

		btnPeliculas = new JButton("PELICULAS");
		pnlBotones.add(btnPeliculas);

		btnHistorial = new JButton("HISTORIAL");
		pnlBotones.add(btnHistorial);

		JLabel lblNewLabel_12 = new JLabel("      ");
		pnlContenidoBotones.add(lblNewLabel_12, BorderLayout.SOUTH);

		JPanel pnlBusqueda = new JPanel();
		pnlBusqueda.setBackground(new Color(56, 59, 74));
		pnlMenuSuperior.add(pnlBusqueda, BorderLayout.CENTER);
		pnlBusqueda.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_8 = new JLabel("     ");
		pnlBusqueda.add(lblNewLabel_8, BorderLayout.NORTH);

		JLabel lblNewLabel_9 = new JLabel("     ");
		pnlBusqueda.add(lblNewLabel_9, BorderLayout.SOUTH);

		JLabel lblNewLabel_7 = new JLabel("     ");
		pnlBusqueda.add(lblNewLabel_7, BorderLayout.EAST);

		JLabel lblNewLabel_10 = new JLabel("     ");
		pnlBusqueda.add(lblNewLabel_10, BorderLayout.WEST);

		txtBuscar = new JTextField();
		txtBuscar.setText("Buscar");
		txtBuscar.setColumns(10);
		pnlBusqueda.add(txtBuscar, BorderLayout.CENTER);

		JPanel pnlCentral = new JPanel(new GridBagLayout());
		pnlCentral.setBackground(new Color(66, 72, 93));
		add(pnlCentral, BorderLayout.CENTER);

		GridBagConstraints gbcPoster = new GridBagConstraints();
		gbcPoster.insets = new Insets(10, 10, 10, 10);
		gbcPoster.gridx = 0;
		gbcPoster.gridy = 0;
		gbcPoster.gridheight = 2;
		gbcPoster.anchor = GridBagConstraints.NORTHWEST;

		posterPelicula1 = DefaultComponentFactory.getInstance().createLabel("");
		ImageIcon originalIcon = new ImageIcon(getClass().getResource("/Images/ImagenPelicula.png"));
		Image imagenRedimensionada = originalIcon.getImage().getScaledInstance(300, 323, Image.SCALE_SMOOTH);
		posterPelicula1.setIcon(new ImageIcon(imagenRedimensionada));
		pnlCentral.add(posterPelicula1, gbcPoster);

		GridBagConstraints gbcDetalles = new GridBagConstraints();
		gbcDetalles.insets = new Insets(10, 10, 10, 10);
		gbcDetalles.gridx = 1;
		gbcDetalles.gridy = 0;
		gbcDetalles.gridheight = 1;
		gbcDetalles.fill = GridBagConstraints.HORIZONTAL;
		gbcDetalles.anchor = GridBagConstraints.NORTHWEST;

		JPanel pnlDetalles = new JPanel();
		pnlDetalles.setBackground(new Color(66, 72, 93));
		pnlDetalles.setLayout(new BoxLayout(pnlDetalles, BoxLayout.Y_AXIS));
		pnlCentral.add(pnlDetalles, gbcDetalles);

		titulo1_1 = new JLabel("Minions: Nace un villano");
		titulo1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 24));
		titulo1_1.setForeground(new Color(255, 128, 0));
		titulo1_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		pnlDetalles.add(titulo1_1);

		lblSinopsis = new JLabel("Sinopsis:");
		lblSinopsis.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
		lblSinopsis.setForeground(Color.WHITE);
		lblSinopsis.setAlignmentX(Component.CENTER_ALIGNMENT);
		pnlDetalles.add(lblSinopsis);

		txtrTextoSinopsis = new JTextArea(
				"**Lorem ipsum dolor sit amet, consectetur adipiscing elit. \r\nNulla quam velit, vulputate eu pharetra nec, mattis ac neque. \r\nDuis vulputate commodo lectus, ac blandit elit tincidunt id. \r\nSed rhoncus, tortor sed eleifend tristique, tortor mauris \r\nmolestie elit, et lacinia ipsum quam nec dui. Quisque nec \r\nmauris sit amet elit iaculis pretium sit amet quis magna.  \r\nVivamus varius pretium ligula, a aliquam odio euismod sit \r\namet. Quisque laoreet sem sit amet orci ullamcorper at \r\nultricies metus viverra. Pellentesque arcu mauris, \r\nmalesuada quis ornare accumsan, blandit sed diam.**");
		txtrTextoSinopsis.setFont(new Font("Microsoft YaHei", Font.PLAIN, 17));
		txtrTextoSinopsis.setForeground(Color.WHITE);
		txtrTextoSinopsis.setBackground(new Color(66, 72, 93));
		txtrTextoSinopsis.setWrapStyleWord(true);
		txtrTextoSinopsis.setLineWrap(true);
		txtrTextoSinopsis.setEditable(false);

		scrollSinopsis = new JScrollPane(txtrTextoSinopsis);
		scrollSinopsis.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollSinopsis.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		scrollSinopsis.setPreferredSize(new Dimension(550, 225));
		scrollSinopsis.setMinimumSize(new Dimension(400, 100));

		pnlDetalles.add(scrollSinopsis);

		pnlDetalles.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				Dimension size = pnlDetalles.getSize();
				scrollSinopsis.setPreferredSize(new Dimension(size.width - 20, size.height - 100));
				scrollSinopsis.revalidate();
			}
		});
		GridBagConstraints gbcOpciones = new GridBagConstraints();
		gbcOpciones.insets = new Insets(10, 10, 10, 10);
		gbcOpciones.gridx = 1;
		gbcOpciones.gridy = 1;
		gbcOpciones.anchor = GridBagConstraints.WEST;

		JPanel pnlOpciones = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
		pnlOpciones.setBackground(new Color(66, 72, 93));
		pnlCentral.add(pnlOpciones, gbcOpciones);

		btnAlquilar = new JButton("ALQUILAR");
		btnAlquilar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAlquilar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAlquilar.setBackground(new Color(255, 128, 0));
		btnAlquilar.setForeground(Color.WHITE);
		pnlOpciones.add(btnAlquilar);

		btnAlquilado = new JButton("ALQUILADO");
		btnAlquilado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAlquilado.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAlquilado.setBackground(Color.RED);
		btnAlquilado.setForeground(Color.WHITE);
		pnlOpciones.add(btnAlquilado);

		btnComentarios = new JButton("COMENTARIOS");
		btnComentarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnComentarios.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnComentarios.setBackground(new Color(255, 128, 0));
		btnComentarios.setForeground(Color.WHITE);
		pnlOpciones.add(btnComentarios);

		JPanel pnlBottom = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
		pnlBottom.setBackground(new Color(66, 72, 93));
		GridBagConstraints gbcBottom = new GridBagConstraints();
		gbcBottom.insets = new Insets(10, 10, 10, 10);
		gbcBottom.gridx = 0;
		gbcBottom.gridy = 2;
		gbcBottom.anchor = GridBagConstraints.WEST;
		gbcBottom.gridwidth = 2;
		pnlCentral.add(pnlBottom, gbcBottom);

		LblFavoritos = DefaultComponentFactory.getInstance().createLabel("");
		LblFavoritos.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Images/favoritos.png")).getImage()
				.getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
		pnlBottom.add(LblFavoritos);

		txtrAadirAFavoritos = new JTextArea("Añadir a favoritos");
		txtrAadirAFavoritos.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
		txtrAadirAFavoritos.setForeground(Color.WHITE);
		txtrAadirAFavoritos.setBackground(new Color(66, 72, 93));
		txtrAadirAFavoritos.setEditable(false);
		pnlBottom.add(txtrAadirAFavoritos);

		LblEstrellas = DefaultComponentFactory.getInstance().createLabel("");
		LblEstrellas.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Images/estrellas.png")).getImage()
				.getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
		pnlBottom.add(LblEstrellas);

		textPuntuacion = new JLabel("4.5/5");
		textPuntuacion.setFont(new Font("Microsoft YaHei", Font.BOLD, 19));
		textPuntuacion.setForeground(Color.WHITE);
		pnlBottom.add(textPuntuacion);

		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				Dimension size = getSize();
				double scaleFactor = Math.min(size.getWidth() / 1140, size.getHeight() / 640);

				titulo1_1.setFont(titulo1_1.getFont().deriveFont((float) (24 * scaleFactor)));
				txtrTextoSinopsis.setFont(txtrTextoSinopsis.getFont().deriveFont((float) (17 * scaleFactor)));
				btnAlquilar.setFont(btnAlquilar.getFont().deriveFont((float) (14 * scaleFactor)));
				lblSinopsis.setFont(lblSinopsis.getFont().deriveFont((float) (20 * scaleFactor)));
				btnAlquilado.setFont(btnAlquilado.getFont().deriveFont((float) (14 * scaleFactor)));
				btnComentarios.setFont(btnComentarios.getFont().deriveFont((float) (14 * scaleFactor)));
				txtrAadirAFavoritos.setFont(txtrAadirAFavoritos.getFont().deriveFont((float) (16 * scaleFactor)));
				textPuntuacion.setFont(textPuntuacion.getFont().deriveFont((float) (19 * scaleFactor)));

				revalidate();
				repaint();
			}
		});
	}
}

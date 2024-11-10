package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.SwingConstants;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextArea;
import javax.swing.BoxLayout;

public class MenuUsuarioVista2 extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtBuscar;
	
	public MenuUsuarioVista2() {
		
		setBounds(0, 0, 1140, 640);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel_43 = new JPanel();
		add(panel_43, BorderLayout.CENTER);
		panel_43.setLayout(new BorderLayout(0, 0));
		
		
		
		JPanel panel_44 = new JPanel();
		add(panel_44, BorderLayout.NORTH);
		panel_44.setLayout(new GridLayout(0, 3, 0, 0));
		
		
		JPanel pnlSuperior = new JPanel();
		pnlSuperior.setBackground(new Color(56, 59, 74));
		panel_43.add(pnlSuperior, BorderLayout.NORTH);
		pnlSuperior.setLayout(new BorderLayout(0, 0));
		
		JLabel lblIconoLogo = new JLabel("");
		lblIconoLogo.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacion.png")));
		lblIconoLogo.setBounds(4, 6, 283, 56);
		pnlSuperior.add(lblIconoLogo, BorderLayout.WEST);
		
		JPanel pnlSalir = new JPanel();
		pnlSalir.setBackground(new Color(56, 59, 74));
		pnlSuperior.add(pnlSalir, BorderLayout.EAST);
		pnlSalir.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("   ");
		pnlSalir.add(lblNewLabel, BorderLayout.NORTH);
		
		JLabel lblNewLabel_2 = new JLabel("   ");
		pnlSalir.add(lblNewLabel_2, BorderLayout.SOUTH);
		
		JButton btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon(BuscadorDePeliculasVista2.class.getResource("/Images/iconosalida.png")));
		pnlSalir.add(btnSalir);
		
		JLabel lblNewLabel_1 = new JLabel("   ");
		pnlSalir.add(lblNewLabel_1, BorderLayout.EAST);
		
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
		
		JLabel lblNewLabel_5 = new JLabel("          ");
		pnlMenuSuperior.add(lblNewLabel_5, BorderLayout.EAST);
		
		JPanel pnlContenido = new JPanel();
		pnlContenido.setBackground(new Color(56, 59, 74));
		pnlMenuSuperior.add(pnlContenido);
		pnlContenido.setLayout(new BorderLayout(0, 0));
		
		JLabel lblBusqueda = new JLabel("");
		lblBusqueda.setIcon(new ImageIcon(getClass().getResource("/Images/BuscarIcono.png")));
		lblBusqueda.setBounds(280, 17, 40, 40);
		pnlContenido.add(lblBusqueda, BorderLayout.WEST);
		
		JPanel pnlContenidoBotones = new JPanel();
		pnlContenidoBotones.setBackground(new Color(56, 59, 74));
		pnlContenido.add(pnlContenidoBotones, BorderLayout.EAST);
		pnlContenidoBotones.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_11 = new JLabel("      ");
		pnlContenidoBotones.add(lblNewLabel_11, BorderLayout.NORTH);
		
		JPanel pnlBotones = new JPanel();
		pnlBotones.setBackground(new Color(56, 59, 74));
		FlowLayout fl_pnlBotones = (FlowLayout) pnlBotones.getLayout();
		pnlContenidoBotones.add(pnlBotones);
		
		JButton btnPeliculas = new JButton("PELICULAS");
		pnlBotones.add(btnPeliculas);
		
		JButton btnHistorial = new JButton("HISTORIAL");
		pnlBotones.add(btnHistorial);
		
		JLabel lblNewLabel_12 = new JLabel("      ");
		pnlContenidoBotones.add(lblNewLabel_12, BorderLayout.SOUTH);
		
		JPanel pnlBusqueda = new JPanel();
		pnlBusqueda.setBackground(new Color(56, 59, 74));
		pnlContenido.add(pnlBusqueda, BorderLayout.CENTER);
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
		
		JLabel lblNewLabel_6 = new JLabel("          ");
		pnlMenuSuperior.add(lblNewLabel_6, BorderLayout.WEST);
		
		JPanel pnlCentral = new JPanel();
		panel_43.add(pnlCentral, BorderLayout.CENTER);
		pnlCentral.setBackground(new Color(56, 59, 74));
		pnlCentral.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlBienvenida = new JPanel();
		pnlCentral.add(pnlBienvenida, BorderLayout.NORTH);
		pnlBienvenida.setBackground(new Color(56, 59, 74));
		
		JLabel lbTextoDeBienvenido = new JLabel("Bienvenido de nuevo Diegote, esto es lo que estuviste viendo... ");
		lbTextoDeBienvenido.setForeground(new Color(255, 255, 255));
		lbTextoDeBienvenido.setFont(new Font("Microsoft YaHei", Font.BOLD, 22));
		pnlBienvenida.add(lbTextoDeBienvenido);
		
		JPanel pnlPeliculas = new JPanel();
		pnlCentral.add(pnlPeliculas, BorderLayout.CENTER);
		pnlPeliculas.setBackground(new Color(56, 59, 74));
		pnlPeliculas.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pnlPeliculasRecientes = new JPanel();
		pnlPeliculas.add(pnlPeliculasRecientes);
		pnlPeliculasRecientes.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		pnlPeliculasRecientes.add(panel_3, BorderLayout.NORTH);
		panel_3.setBackground(new Color(56, 59, 74));
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_35 = new JPanel();
		panel_35.setBackground(new Color(56, 58, 74));
		panel_3.add(panel_35, BorderLayout.WEST);
		panel_35.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_38 = new JPanel();
		panel_38.setBackground(new Color(56, 58, 74));
		panel_35.add(panel_38, BorderLayout.EAST);
		
		JLabel lblNewLabel_13 = new JLabel("Peliculas Recientes");
		panel_35.add(lblNewLabel_13, BorderLayout.CENTER);
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_13.setForeground(new Color(255, 255, 255));
		
		JPanel panel_39 = new JPanel();
		panel_39.setBackground(new Color(56, 58, 74));
		panel_35.add(panel_39, BorderLayout.WEST);
		
		JPanel panel_36 = new JPanel();
		panel_36.setBackground(new Color(56, 58, 74));
		panel_3.add(panel_36, BorderLayout.CENTER);
		
		JPanel panel_37 = new JPanel();
		panel_3.add(panel_37, BorderLayout.EAST);
		panel_37.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_40 = new JPanel();
		panel_40.setBackground(new Color(56, 58, 74));
		panel_37.add(panel_40, BorderLayout.EAST);
		
		JPanel panel_41 = new JPanel();
		panel_41.setBackground(new Color(56, 58, 74));
		panel_37.add(panel_41, BorderLayout.WEST);
		
		JPanel panel_42 = new JPanel();
		panel_42.setBackground(new Color(56, 58, 74));
		panel_37.add(panel_42, BorderLayout.CENTER);
		
		JLabel lblNewLabel_14 = new JLabel("Ver lista en:");
		panel_42.add(lblNewLabel_14);
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_14.setForeground(new Color(255, 255, 255));
		
		JButton btnNewButton = new JButton("Historial");
		panel_42.add(btnNewButton);
		
		JPanel panel_4 = new JPanel();
		pnlPeliculasRecientes.add(panel_4, BorderLayout.CENTER);
		panel_4.setBackground(new Color(56, 59, 74));
		panel_4.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel pnlPelicula1 = new JPanel();
		panel_4.add(pnlPelicula1);
		pnlPelicula1.setLayout(new GridLayout(0, 2, 0, 0));
		
	
		ImageIcon originalIcon = new ImageIcon(MenuUsuarioVista.class.getResource("/Images/ImagenPelicula.png"));
		Image imagenRedimensionada = originalIcon.getImage().getScaledInstance(200, 250, Image.SCALE_SMOOTH);
		ImageIcon iconoRedimensionado = new ImageIcon(imagenRedimensionada);


		
		
		JPanel panel = new JPanel();
		pnlPelicula1.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		
		
		
		
		
		JLabel lblPelicula1 = new JLabel("");
		lblPelicula1.setIcon(iconoRedimensionado);
		panel.add(lblPelicula1, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		pnlPelicula1.add(panel_2);
		panel_2.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(56, 59, 74));
		panel_2.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JTextArea txtTitulo1 = new JTextArea();
		txtTitulo1.setForeground(new Color(255, 255, 255));
		txtTitulo1.setFont(new Font("Microsoft YaHei", Font.BOLD, 19));
		txtTitulo1.setBackground(new Color(56, 59, 74));
		txtTitulo1.setLineWrap(true);
		txtTitulo1.setTabSize(10);
		txtTitulo1.setRows(3);
		txtTitulo1.setText("Minions: Nace un Villano");
		panel_7.add(txtTitulo1);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(56, 59, 74));
		panel_2.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblDuracion1 = new JLabel("Duración");
		lblDuracion1.setBounds(10, 11, 190, 52);
		lblDuracion1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDuracion1.setForeground(new Color(255, 255, 255));
		panel_8.add(lblDuracion1);
		
		JLabel lblHoras1 = new JLabel("1:30 horas");
		lblHoras1.setForeground(new Color(255, 255, 255));
		lblHoras1.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		lblHoras1.setBounds(10, 61, 190, 14);
		panel_8.add(lblHoras1);
		
		
		
		
		
		
		
		
		
		
		JPanel pnlPelicula2 = new JPanel();
		panel_4.add(pnlPelicula2);
		pnlPelicula2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(56, 59, 74));
		pnlPelicula2.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPelicula2 = new JLabel("");
		lblPelicula2.setIcon(iconoRedimensionado);
		panel_1.add(lblPelicula2);
		
		JPanel panel_9 = new JPanel();
		pnlPelicula2.add(panel_9);
		panel_9.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel_11 = new JPanel();
		panel_9.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JTextArea txtTitulo2 = new JTextArea();
		txtTitulo2.setForeground(new Color(255, 255, 255));
		txtTitulo2.setFont(new Font("Microsoft YaHei", Font.BOLD, 19));
		txtTitulo2.setBackground(new Color(56, 59, 74));
		txtTitulo2.setLineWrap(true);
		txtTitulo2.setTabSize(10);
		txtTitulo2.setRows(3);
		txtTitulo2.setText("Minions: Nace un Villano");
		panel_11.add(txtTitulo2, BorderLayout.CENTER);
			
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(56, 59, 74));
		panel_9.add(panel_10);
		panel_10.setLayout(null);
		
		JLabel lblDuracion2 = new JLabel("Duración");
		lblDuracion2.setBounds(10, 11, 190, 52);
		lblDuracion2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDuracion2.setForeground(new Color(255, 255, 255));
		panel_10.add(lblDuracion2);
		
		
		JLabel lblHoras2 = new JLabel("1:30 horas");
		lblHoras2.setForeground(new Color(255, 255, 255));
		lblHoras2.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		lblHoras2.setBounds(10, 61, 190, 14);
		panel_10.add(lblHoras2);
		
		JPanel pnlPelicula3 = new JPanel();
		panel_4.add(pnlPelicula3);
		pnlPelicula3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_15 = new JPanel();
		pnlPelicula3.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPelicula3 = new JLabel("");
		lblPelicula3.setIcon(iconoRedimensionado);
		panel_15.add(lblPelicula3);
		
		JPanel panel_12 = new JPanel();
		pnlPelicula3.add(panel_12);
		panel_12.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel_26 = new JPanel();
		panel_12.add(panel_26);
		panel_26.setLayout(new GridLayout(1, 0, 0, 0));
		
		JTextArea txtTitulo3 = new JTextArea();
		txtTitulo3.setForeground(new Color(255, 255, 255));
		txtTitulo3.setFont(new Font("Microsoft YaHei", Font.BOLD, 19));
		txtTitulo3.setBackground(new Color(56, 59, 74));
		txtTitulo3.setLineWrap(true);
		txtTitulo3.setTabSize(10);
		txtTitulo3.setRows(3);
		txtTitulo3.setText("Minions: Nace un Villano");
		panel_26.add(txtTitulo3);
		
		JPanel panel_27 = new JPanel();
		panel_27.setBackground(new Color(56, 59, 74));
		panel_12.add(panel_27);
		panel_27.setLayout(null);
		
		JLabel lblDuracion3 = new JLabel("Duración");
		lblDuracion3.setBounds(10, 11, 190, 52);
		lblDuracion3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDuracion3.setForeground(new Color(255, 255, 255));
		panel_27.add(lblDuracion3);
		
		JLabel lblHoras3 = new JLabel("1:30 horas");
		lblHoras3.setForeground(new Color(255, 255, 255));
		lblHoras3.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		lblHoras3.setBounds(10, 61, 190, 14);
		panel_27.add(lblHoras3);
		
		JPanel pnlPeliculasFavoritas = new JPanel();
		pnlPeliculas.add(pnlPeliculasFavoritas);
		pnlPeliculasFavoritas.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		pnlPeliculasFavoritas.add(panel_5, BorderLayout.NORTH);
		panel_5.setBackground(new Color(56, 59, 74));
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_28 = new JPanel();
		panel_5.add(panel_28, BorderLayout.EAST);
		panel_28.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton_1 = new JButton("Buscar Peliculas");
		panel_28.add(btnNewButton_1);
		
		JPanel panel_33 = new JPanel();
		panel_33.setBackground(new Color(56, 58, 74));
		panel_28.add(panel_33, BorderLayout.WEST);
		
		JPanel panel_34 = new JPanel();
		panel_34.setBackground(new Color(56, 58, 74));
		panel_28.add(panel_34, BorderLayout.EAST);
		
		JPanel panel_29 = new JPanel();
		panel_29.setBackground(new Color(56, 58, 74));
		panel_5.add(panel_29, BorderLayout.CENTER);
		
		JPanel panel_30 = new JPanel();
		panel_30.setBackground(new Color(56, 58, 74));
		panel_5.add(panel_30, BorderLayout.WEST);
		panel_30.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_16 = new JLabel("Peliculas Favoritas");
		panel_30.add(lblNewLabel_16);
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_16.setForeground(new Color(255, 255, 255));
		
		JPanel panel_31 = new JPanel();
		panel_31.setBackground(new Color(56, 58, 74));
		panel_30.add(panel_31, BorderLayout.WEST);
		
		JPanel panel_32 = new JPanel();
		panel_32.setBackground(new Color(56, 58, 74));
		panel_30.add(panel_32, BorderLayout.EAST);
		
		JPanel panel_6 = new JPanel();
		pnlPeliculasFavoritas.add(panel_6, BorderLayout.CENTER);
		panel_6.setBackground(new Color(56, 59, 74));
		panel_6.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel pnlPelicula4 = new JPanel();
		panel_6.add(pnlPelicula4);
		pnlPelicula4.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_16 = new JPanel();
		pnlPelicula4.add(panel_16);
		panel_16.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPelicula4 = new JLabel("");
		lblPelicula4.setIcon(iconoRedimensionado);
		panel_16.add(lblPelicula4, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		pnlPelicula4.add(panel_13);
		panel_13.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel_19 = new JPanel();
		panel_13.add(panel_19);
		panel_19.setLayout(new GridLayout(1, 0, 0, 0));
		
		JTextArea txtTitulo4 = new JTextArea();
		txtTitulo4.setForeground(new Color(255, 255, 255));
		txtTitulo4.setFont(new Font("Microsoft YaHei", Font.BOLD, 19));
		txtTitulo4.setBackground(new Color(56, 59, 74));
		txtTitulo4.setLineWrap(true);
		txtTitulo4.setTabSize(10);
		txtTitulo4.setRows(3);
		txtTitulo4.setText("Minions: Nace un Villano");
		panel_19.add(txtTitulo4);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(56, 59, 74));
		panel_13.add(panel_14);
		panel_14.setLayout(null);
		
		JLabel lblDuracion4 = new JLabel("Duración");
		lblDuracion4.setBounds(10, 11, 190, 52);
		lblDuracion4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDuracion4.setForeground(new Color(255, 255, 255));
		panel_14.add(lblDuracion4);
		
		JLabel lblHoras4 = new JLabel("1:30 horas");
		lblHoras4.setForeground(new Color(255, 255, 255));
		lblHoras4.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		lblHoras4.setBounds(10, 61, 190, 14);
		panel_14.add(lblHoras4);
		
		JPanel pnlPelicula5 = new JPanel();
		panel_6.add(pnlPelicula5);
		pnlPelicula5.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_17 = new JPanel();
		pnlPelicula5.add(panel_17);
		panel_17.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPelicula5 = new JLabel("");
		lblPelicula5.setIcon(iconoRedimensionado);
		panel_17.add(lblPelicula5, BorderLayout.CENTER);
		
		JPanel panel_20 = new JPanel();
		pnlPelicula5.add(panel_20);
		panel_20.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel_22 = new JPanel();
		panel_20.add(panel_22);
		panel_22.setLayout(new GridLayout(1, 0, 0, 0));
		
		JTextArea txtTitulo5 = new JTextArea();
		txtTitulo5.setForeground(new Color(255, 255, 255));
		txtTitulo5.setFont(new Font("Microsoft YaHei", Font.BOLD, 19));
		txtTitulo5.setBackground(new Color(56, 59, 74));
		txtTitulo5.setLineWrap(true);
		txtTitulo5.setTabSize(10);
		txtTitulo5.setRows(3);
		txtTitulo5.setText("Minions: Nace un Villano");
		panel_22.add(txtTitulo5);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBackground(new Color(56, 59, 74));
		panel_20.add(panel_21);
		panel_21.setLayout(null);
		
		JLabel lblDuracion5 = new JLabel("Duración");
		lblDuracion5.setBounds(10, 11, 190, 52);
		lblDuracion5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDuracion5.setForeground(new Color(255, 255, 255));
		panel_21.add(lblDuracion5);
		
		JLabel lblHoras5 = new JLabel("1:30 horas");
		lblHoras5.setForeground(new Color(255, 255, 255));
		lblHoras5.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		lblHoras5.setBounds(10, 61, 190, 14);
		panel_21.add(lblHoras5);
		
		JPanel pnlPelicula6 = new JPanel();
		panel_6.add(pnlPelicula6);
		pnlPelicula6.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_18 = new JPanel();
		pnlPelicula6.add(panel_18);
		panel_18.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPelicula6 = new JLabel("");
		lblPelicula6.setIcon(iconoRedimensionado);
		panel_18.add(lblPelicula6, BorderLayout.CENTER);
		
		JPanel panel_23 = new JPanel();
		pnlPelicula6.add(panel_23);
		panel_23.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel_25 = new JPanel();
		panel_23.add(panel_25);
		panel_25.setLayout(new GridLayout(1, 0, 0, 0));
		
		JTextArea txtTitulo6 = new JTextArea();
		txtTitulo6.setForeground(new Color(255, 255, 255));
		txtTitulo6.setFont(new Font("Microsoft YaHei", Font.BOLD, 19));
		txtTitulo6.setBackground(new Color(56, 59, 74));
		txtTitulo6.setLineWrap(true);
		txtTitulo6.setTabSize(10);
		txtTitulo6.setRows(3);
		txtTitulo6.setText("Minions: Nace un Villano");
		panel_25.add(txtTitulo6);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBackground(new Color(56, 59, 74));
		panel_23.add(panel_24);
		panel_24.setLayout(null);
		
		JLabel lblDuracion6 = new JLabel("Duración");
		lblDuracion6.setBounds(10, 11, 190, 52);
		lblDuracion6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDuracion6.setForeground(new Color(255, 255, 255));
		panel_24.add(lblDuracion6);
		
		JLabel lblHoras6 = new JLabel("1:30 horas");
		lblHoras6.setForeground(new Color(255, 255, 255));
		lblHoras6.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		lblHoras6.setBounds(10, 61, 190, 14);
		panel_24.add(lblHoras6);
		
		JPanel panel_45 = new JPanel();
		add(panel_45, BorderLayout.SOUTH);
		panel_45.setLayout(new GridLayout(0, 3, 0, 0));
		
		
		
		initStyles();
	}
	private void initStyles() {

	}
}
	


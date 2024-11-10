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

import javax.swing.JTextArea;

public class MenuUsuarioVista extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtBuscar;
	public JButton btnSalir;
	public JButton btnPeliculas;
	public JButton btnHistorial;
	public JLabel Busqueda;
	public JLabel IconoLogo;
	
	public MenuUsuarioVista() {
		
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
		
		IconoLogo = new JLabel("");
		IconoLogo.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacion.png")));
		IconoLogo.setBounds(4, 6, 283, 56);
		pnlSuperior.add(IconoLogo, BorderLayout.WEST);
		
		JPanel pnlSalir = new JPanel();
		pnlSalir.setBackground(new Color(56, 59, 74));
		pnlSuperior.add(pnlSalir, BorderLayout.EAST);
		pnlSalir.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("   ");
		pnlSalir.add(lblNewLabel, BorderLayout.NORTH);
		
		JLabel lblNewLabel_2 = new JLabel("   ");
		pnlSalir.add(lblNewLabel_2, BorderLayout.SOUTH);
		
		btnSalir = new JButton("");
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
		
		Busqueda = new JLabel("");
		Busqueda.setIcon(new ImageIcon(getClass().getResource("/Images/BuscarIcono.png")));
		Busqueda.setBounds(280, 17, 40, 40);
		pnlContenido.add(Busqueda, BorderLayout.WEST);
		
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
		
		btnPeliculas = new JButton("PELICULAS");
		pnlBotones.add(btnPeliculas);
		
		btnHistorial = new JButton("HISTORIAL");
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
		
		JPanel panel_45 = new JPanel();
		add(panel_45, BorderLayout.SOUTH);
		panel_45.setLayout(new GridLayout(0, 3, 0, 0));
		
		initStyles();
	}
	private void initStyles() {

	}
}
	


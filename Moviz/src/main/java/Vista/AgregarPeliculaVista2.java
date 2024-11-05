package Vista;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class AgregarPeliculaVista2 extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JTextField txtTitulo;
	private JTextField txtAnioPublicacion;
	private JTextField txtDuracionAprox;
	private JTextField txtRutaImagen;
	
	public AgregarPeliculaVista2() {
		setBackground(new Color(66, 72, 93));
		setBounds(0, 0, 1140, 640);
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnlPrincipal = new JPanel();
		add(pnlPrincipal, BorderLayout.CENTER);
		pnlPrincipal.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlSuperior = new JPanel();
		pnlSuperior.setBackground(new Color(56, 59, 74));
		pnlPrincipal.add(pnlSuperior, BorderLayout.NORTH);
		pnlSuperior.setLayout(new BorderLayout(0, 0));
		
		JLabel lblIconoLogo = new JLabel("");
		lblIconoLogo.setHorizontalAlignment(SwingConstants.LEFT);
		lblIconoLogo.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacionAdministrador.png")));
		lblIconoLogo.setBounds(4, 6, 578, 56);
		pnlSuperior.add(lblIconoLogo, BorderLayout.WEST);
		
		JPanel pnlSalir = new JPanel();
		pnlSuperior.add(pnlSalir, BorderLayout.EAST);
		pnlSalir.setBackground(new Color(56, 59, 74));
		pnlSalir.setLayout(new BorderLayout(0, 0));
		
		JButton btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon(getClass().getResource("/Images/iconosalida.png")));
		pnlSalir.add(btnSalir);
		
		JLabel lblVacioSuperior = new JLabel("   ");
		pnlSalir.add(lblVacioSuperior, BorderLayout.NORTH);
		
		JLabel lblVacioInferior = new JLabel("    ");
		pnlSalir.add(lblVacioInferior, BorderLayout.SOUTH);
		
		JLabel lblVacioDerecha = new JLabel("   ");
		pnlSalir.add(lblVacioDerecha, BorderLayout.EAST);
		
		JPanel pnlCentral = new JPanel();
		pnlCentral.setBackground(new Color(66, 72, 93));
		pnlPrincipal.add(pnlCentral, BorderLayout.CENTER);
		pnlCentral.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlCentralSuperior = new JPanel();
		pnlCentralSuperior.setBackground(new Color(66, 72, 93));
		pnlCentral.add(pnlCentralSuperior, BorderLayout.NORTH);
		pnlCentralSuperior.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("      ");
		pnlCentralSuperior.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel pnlAñadirPeliculas = new JPanel();
		pnlAñadirPeliculas.setBackground(new Color(66, 72, 93));
		pnlCentralSuperior.add(pnlAñadirPeliculas, BorderLayout.WEST);
		pnlAñadirPeliculas.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTituloSeccion = new JLabel("Añadir Películas");
		lblTituloSeccion.setForeground(Color.WHITE);
		lblTituloSeccion.setFont(new Font("Microsoft YaHei", Font.BOLD, 21));
		pnlAñadirPeliculas.add(lblTituloSeccion);
		
		JLabel lblVacio1 = new JLabel("                ");
		pnlAñadirPeliculas.add(lblVacio1, BorderLayout.WEST);
		
		JLabel lblVacio2 = new JLabel("      ");
		pnlAñadirPeliculas.add(lblVacio2, BorderLayout.NORTH);
		
		JPanel pnlBtnVolver = new JPanel();
		pnlBtnVolver.setBackground(new Color(66, 72, 93));
		pnlCentralSuperior.add(pnlBtnVolver, BorderLayout.EAST);
		pnlBtnVolver.setLayout(new BorderLayout(0, 0));
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVolver.setBackground(new Color(255, 128, 0));
		pnlBtnVolver.add(btnVolver);
		
		JLabel lblVacio3 = new JLabel("                ");
		pnlBtnVolver.add(lblVacio3, BorderLayout.EAST);
		
		JLabel lblVacio4 = new JLabel("       ");
		pnlBtnVolver.add(lblVacio4, BorderLayout.NORTH);
		
		JPanel pnlLinea = new JPanel();
		pnlLinea.setBackground(new Color(66, 72, 93));
		pnlCentralSuperior.add(pnlLinea, BorderLayout.SOUTH);
		pnlLinea.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("             ");
		pnlLinea.add(lblNewLabel_4, BorderLayout.WEST);
		
		JLabel lblNewLabel_5 = new JLabel("             ");
		pnlLinea.add(lblNewLabel_5, BorderLayout.EAST);
		
		JSeparator separator = new JSeparator();
		pnlLinea.add(separator, BorderLayout.CENTER);
		
		JLabel lblNewLabel_3 = new JLabel("            ");
		pnlLinea.add(lblNewLabel_3, BorderLayout.NORTH);
		
		JPanel pnlCentralInferior = new JPanel();
		pnlCentral.add(pnlCentralInferior, BorderLayout.CENTER);
		pnlCentralInferior.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlCentralInferiorIzquierda = new JPanel();
		pnlCentralInferiorIzquierda.setBackground(new Color(66, 72, 93));
		pnlCentralInferior.add(pnlCentralInferiorIzquierda, BorderLayout.WEST);
		pnlCentralInferiorIzquierda.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("                        ");
		pnlCentralInferiorIzquierda.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JLabel lblVacio = new JLabel("                                        ");
		pnlCentralInferiorIzquierda.add(lblVacio, BorderLayout.WEST);
		
		JPanel pnlBotones = new JPanel();
		pnlBotones.setBackground(new Color(66, 72, 93));
		pnlCentralInferiorIzquierda.add(pnlBotones, BorderLayout.CENTER);
		pnlBotones.setLayout(new GridLayout(0, 1, 0, 60));
		
		JButton btnTitulo = new JButton("Título");
		btnTitulo.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		btnTitulo.setEnabled(false);
		btnTitulo.setBackground(new Color(224, 224, 224));
		pnlBotones.add(btnTitulo);
		
		JButton btnGenero = new JButton("Género");
		btnGenero.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		btnGenero.setEnabled(false);
		btnGenero.setBackground(new Color(224, 224, 224));
		pnlBotones.add(btnGenero);
		
		JButton btnAnioPublicacion = new JButton("Año de Publicación");
		btnAnioPublicacion.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		btnAnioPublicacion.setEnabled(false);
		btnAnioPublicacion.setBackground(new Color(224, 224, 224));
		pnlBotones.add(btnAnioPublicacion);
		
		JButton btnDuracionAprox = new JButton("Duración Aprox");
		btnDuracionAprox.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		btnDuracionAprox.setEnabled(false);
		btnDuracionAprox.setBackground(new Color(66, 72, 93));
		pnlBotones.add(btnDuracionAprox);
		
		JButton btnSinopsis = new JButton("Sinopsis");
		btnSinopsis.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		btnSinopsis.setEnabled(false);
		btnSinopsis.setBackground(new Color(224, 224, 224));
		pnlBotones.add(btnSinopsis);
		
		JButton btnSubirImagen = new JButton("Subir Imagen");
		btnSubirImagen.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		pnlBotones.add(btnSubirImagen);
		
		JLabel lblNewLabel_2 = new JLabel("                           ");
		pnlCentralInferiorIzquierda.add(lblNewLabel_2, BorderLayout.SOUTH);
		
		JPanel pnlCentralInferiorDerecha = new JPanel();
		pnlCentralInferiorDerecha.setBackground(new Color(66, 72, 93));
		pnlCentralInferior.add(pnlCentralInferiorDerecha, BorderLayout.EAST);
		pnlCentralInferiorDerecha.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_9 = new JLabel("                  ");
		pnlCentralInferiorDerecha.add(lblNewLabel_9, BorderLayout.NORTH);
		
		JPanel pnlAñadirPelicula = new JPanel();
		pnlAñadirPelicula.setBackground(new Color(66, 72, 93));
		pnlCentralInferiorDerecha.add(pnlAñadirPelicula, BorderLayout.CENTER);
		pnlAñadirPelicula.setLayout(new GridLayout(0, 1, 0, 60));
		
		JLabel lblNewLabel_7 = new JLabel("                                     ");
		pnlAñadirPelicula.add(lblNewLabel_7);
		
		JLabel lblNewLabel_11 = new JLabel("                                     ");
		pnlAñadirPelicula.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("                                     ");
		pnlAñadirPelicula.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("                                     ");
		pnlAñadirPelicula.add(lblNewLabel_13);
		
		JLabel lblNewLabel_8 = new JLabel("                                     ");
		pnlAñadirPelicula.add(lblNewLabel_8);
		
		JButton btnAñadirPelicula = new JButton("Añadir");
		btnAñadirPelicula.setForeground(Color.WHITE);
		btnAñadirPelicula.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAñadirPelicula.setBackground(new Color(255, 128, 0));
		pnlAñadirPelicula.add(btnAñadirPelicula);
		
		JLabel lblNewLabel_10 = new JLabel("                  ");
		pnlCentralInferiorDerecha.add(lblNewLabel_10, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_6 = new JLabel("                                        ");
		pnlCentralInferiorDerecha.add(lblNewLabel_6, BorderLayout.EAST);
		
		JPanel pnlCentralInferiorCentral = new JPanel();
		pnlCentralInferiorCentral.setBackground(new Color(66, 72, 93));
		pnlCentralInferior.add(pnlCentralInferiorCentral, BorderLayout.CENTER);
		pnlCentralInferiorCentral.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_14 = new JLabel("                          ");
		pnlCentralInferiorCentral.add(lblNewLabel_14, BorderLayout.NORTH);
		
		JLabel lblNewLabel_15 = new JLabel("                          ");
		pnlCentralInferiorCentral.add(lblNewLabel_15, BorderLayout.WEST);
		
		JPanel pnlEntradasDeTexto = new JPanel();
		pnlEntradasDeTexto.setBackground(new Color(66, 72, 93));
		pnlCentralInferiorCentral.add(pnlEntradasDeTexto);
		pnlEntradasDeTexto.setLayout(new GridLayout(0, 1, 0, 60));
		
		txtTitulo = new JTextField();
		txtTitulo.setForeground(Color.WHITE);
		txtTitulo.setBorder(BorderFactory.createLineBorder(new Color(56, 59, 74)));
		txtTitulo.setBackground(new Color(70, 76, 90));
		pnlEntradasDeTexto.add(txtTitulo);
		
		JComboBox<String> cmbGenero = new JComboBox<String>();
		cmbGenero.setForeground(Color.WHITE);
		cmbGenero.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		cmbGenero.setBackground(new Color(70, 76, 90));
		pnlEntradasDeTexto.add(cmbGenero);
		
		txtAnioPublicacion = new JTextField();
		txtAnioPublicacion.setForeground(Color.WHITE);
		txtAnioPublicacion.setBorder(BorderFactory.createLineBorder(new Color(56, 59, 74)));
		txtAnioPublicacion.setBackground(new Color(70, 76, 90));
		pnlEntradasDeTexto.add(txtAnioPublicacion);
		
		txtDuracionAprox = new JTextField();
		txtDuracionAprox.setForeground(Color.WHITE);
		txtDuracionAprox.setBorder(BorderFactory.createLineBorder(new Color(56, 59, 74)));
		txtDuracionAprox.setBackground(new Color(70, 76, 90));
		pnlEntradasDeTexto.add(txtDuracionAprox);
		
		JTextArea txtSinopsis = new JTextArea();
		txtSinopsis.setWrapStyleWord(true);
		txtSinopsis.setLineWrap(true);
		txtSinopsis.setForeground(Color.WHITE);
		txtSinopsis.setBorder(BorderFactory.createLineBorder(new Color(56, 59, 74)));
		txtSinopsis.setBackground(new Color(70, 76, 90));
		pnlEntradasDeTexto.add(txtSinopsis);
		
		txtRutaImagen = new JTextField();
		txtRutaImagen.setForeground(Color.WHITE);
		txtRutaImagen.setBorder(BorderFactory.createLineBorder(new Color(56, 59, 74)));
		txtRutaImagen.setBackground(new Color(70, 76, 90));
		pnlEntradasDeTexto.add(txtRutaImagen);
		
		JLabel lblNewLabel_16 = new JLabel("                          ");
		pnlCentralInferiorCentral.add(lblNewLabel_16, BorderLayout.EAST);
		
		JLabel lblNewLabel_17 = new JLabel("                          ");
		pnlCentralInferiorCentral.add(lblNewLabel_17, BorderLayout.SOUTH);
	}

}

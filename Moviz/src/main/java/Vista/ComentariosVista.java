package Vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class ComentariosVista extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtBuscar;
	private JTable tablaComentarios;
	public JComboBox<String> comboBoxPuntuacion;
	public JButton btnVolver;
	public JButton btnSalir;
	public JButton btnPeliculas;
	public JButton btnHistorial;
	public JLabel Busqueda;
	public JLabel IconoLogo;
	
	public ComentariosVista() {
		setBounds(0, 0, 1140, 640);
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnlSuperior = new JPanel();
		pnlSuperior.setBackground(new Color(56, 59, 74));
		add(pnlSuperior, BorderLayout.NORTH);
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
		btnSalir.setIcon(new ImageIcon(ComentariosVista.class.getResource("/Images/iconosalida.png")));
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
		pnlCentral.setBackground(new Color(66, 72, 93));
		add(pnlCentral, BorderLayout.CENTER);
		pnlCentral.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_13 = new JLabel("                ");
		pnlCentral.add(lblNewLabel_13, BorderLayout.NORTH);
		
		JLabel lblNewLabel_14 = new JLabel("                ");
		pnlCentral.add(lblNewLabel_14, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_15 = new JLabel("                ");
		pnlCentral.add(lblNewLabel_15, BorderLayout.EAST);
		
		JLabel lblNewLabel_16 = new JLabel("                ");
		pnlCentral.add(lblNewLabel_16, BorderLayout.WEST);
		
		JPanel pnlCentralContenido = new JPanel();
		pnlCentral.add(pnlCentralContenido, BorderLayout.CENTER);
		pnlCentralContenido.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		pnlCentralContenido.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollTablaComentarios = new JScrollPane((Component) null);
		scrollTablaComentarios.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panel.add(scrollTablaComentarios, BorderLayout.CENTER);
		
		tablaComentarios = new JTable((TableModel) null);
		tablaComentarios.setShowGrid(false);
		tablaComentarios.setRowHeight(60);
		tablaComentarios.setIntercellSpacing(new Dimension(0, 0));
		tablaComentarios.setForeground(Color.WHITE);
		tablaComentarios.setFont(new Font("Microsoft YaHei", Font.PLAIN, 16));
		tablaComentarios.setEnabled(false);
		tablaComentarios.setBackground(new Color(66, 72, 93));
		scrollTablaComentarios.setViewportView(tablaComentarios);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(66, 72, 93));
		pnlCentralContenido.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTituloSeccion = new JLabel("Comentarios");
		lblTituloSeccion.setForeground(Color.WHITE);
		lblTituloSeccion.setFont(new Font("Microsoft YaHei", Font.BOLD, 28));
		panel_1.add(lblTituloSeccion, BorderLayout.WEST);
		
		btnVolver = new JButton("Volver");
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVolver.setBackground(new Color(255, 128, 0));
		panel_1.add(btnVolver, BorderLayout.EAST);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(66, 72, 93));
		panel_1.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_17 = new JLabel("    ");
		panel_2.add(lblNewLabel_17, BorderLayout.NORTH);
		
		JLabel lblAgregarPuntuacion = new JLabel("Agregar puntuación:    ");
		lblAgregarPuntuacion.setForeground(Color.WHITE);
		lblAgregarPuntuacion.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		panel_2.add(lblAgregarPuntuacion, BorderLayout.WEST);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(66, 72, 93));
		panel_2.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		String[] puntuaciones = { "1/5", "2/5", "3/5", "4/5", "5/5" };
		comboBoxPuntuacion = new JComboBox<>(puntuaciones);
		comboBoxPuntuacion.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
		panel_3.add(comboBoxPuntuacion, BorderLayout.WEST);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(66, 72, 93));
		panel_2.add(panel_4, BorderLayout.SOUTH);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JTextArea txtNuevoComentario = new JTextArea();
		txtNuevoComentario.setWrapStyleWord(true);
		txtNuevoComentario.setLineWrap(true);
		txtNuevoComentario.setFont(new Font("Microsoft YaHei", Font.PLAIN, 16));
		panel_4.add(txtNuevoComentario, BorderLayout.CENTER);
		
		JLabel lblNewLabel_18 = new JLabel("      ");
		panel_4.add(lblNewLabel_18, BorderLayout.NORTH);
		
		JLabel lblNewLabel_19 = new JLabel("      ");
		panel_4.add(lblNewLabel_19, BorderLayout.SOUTH);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(66, 72, 93));
		panel_4.add(panel_5, BorderLayout.EAST);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JButton btnComentar = new JButton("Comentar");
		btnComentar.setForeground(Color.WHITE);
		btnComentar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnComentar.setBackground(new Color(255, 128, 0));
		panel_5.add(btnComentar, BorderLayout.EAST);
		
		JLabel lblNewLabel_20 = new JLabel("     ");
		panel_5.add(lblNewLabel_20, BorderLayout.NORTH);
		
		JLabel lblNewLabel_21 = new JLabel("           ");
		panel_5.add(lblNewLabel_21, BorderLayout.WEST);
		
		JLabel lblHistorialPeliculas = new JLabel("New label");
	}

}

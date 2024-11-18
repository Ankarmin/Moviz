package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.jgoodies.forms.factories.DefaultComponentFactory;

public class MenuEliminarComentariosVista extends JPanel {

	private static final long serialVersionUID = 1L;

	public JButton btnSalir;
	public JButton btnVolver;
	public JButton btnEliminar;

	public JLabel lblTituloSeccion;
	public JLabel lblNombrePelicula;
	public JLabel lblIconoLogo;
	public JLabel Busqueda;
	public JLabel lblImagenPelicula;

	public JTable tblPeliculas;
	public JTable tblComentarios;

	public JScrollPane spTablaPeliculas;
	public JScrollPane spTablaComentarios;

	public JTextField txtBuscar;

	public JPanel pnlLineaBlanca;
	public JPanel pnlCabecera;

	public DefaultTableModel comentariosModel;

	public MenuEliminarComentariosVista() {
		setBackground(new Color(66, 72, 93));
		setBorder(null);
		setLayout(null);
		setBounds(0, 0, 1140, 640);

		pnlCabecera = new JPanel(new BorderLayout());
		pnlCabecera.setBackground(new Color(56, 59, 74));
		pnlCabecera.setPreferredSize(new Dimension(1140, 70));
		pnlCabecera.setBounds(0, 0, 1140, 70);
		add(pnlCabecera);

		JPanel logoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		logoPanel.setOpaque(false);

		lblIconoLogo = DefaultComponentFactory.getInstance().createLabel("");
		lblIconoLogo.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacionAdministrador.png")));
		logoPanel.add(lblIconoLogo);

		JPanel exitPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		exitPanel.setOpaque(false);

		btnSalir = new JButton(new ImageIcon(getClass().getResource("/Images/iconosalida.png")));
		btnSalir.setContentAreaFilled(false);
		btnSalir.setBorderPainted(false);
		exitPanel.add(btnSalir);

		pnlCabecera.add(logoPanel, BorderLayout.WEST);
		pnlCabecera.add(exitPanel, BorderLayout.EAST);

		lblTituloSeccion = new JLabel("Eliminar Comentarios");
		lblTituloSeccion.setFont(new Font("Microsoft YaHei", Font.BOLD, 21));
		lblTituloSeccion.setForeground(new Color(255, 255, 255));
		lblTituloSeccion.setBounds(26, 108, 271, 29);
		add(lblTituloSeccion);

		pnlLineaBlanca = new JPanel();
		pnlLineaBlanca.setBackground(Color.WHITE);
		pnlLineaBlanca.setBounds(26, 143, getWidth() - 80, 2);
		add(pnlLineaBlanca);

		txtBuscar = new JTextField("Buscar");
		txtBuscar.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		txtBuscar.setBounds(80, 180, 250, 30);
		txtBuscar.setColumns(10);
		add(txtBuscar);

		Busqueda = DefaultComponentFactory.getInstance().createLabel("");
		Busqueda.setIcon(new ImageIcon(getClass().getResource("/Images/BuscarIcono.png")));
		Busqueda.setBounds(37, 180, 42, 30);
		add(Busqueda);

		lblNombrePelicula = new JLabel("Nombre película");
		lblNombrePelicula.setFont(new Font("Microsoft YaHei", Font.BOLD, 24));
		lblNombrePelicula.setForeground(new Color(255, 140, 0));
		lblNombrePelicula.setBounds(448, 175, 400, 30);
		add(lblNombrePelicula);

		String[] columnPeliculas = { "Lista Películas" };
		DefaultTableModel peliculasModel = new DefaultTableModel(null, columnPeliculas);
		tblPeliculas = new JTable(peliculasModel);
		tblPeliculas.setFillsViewportHeight(true);
		tblPeliculas.setRowHeight(30);
		tblPeliculas.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		tblPeliculas.setBackground(new Color(70, 76, 90));
		tblPeliculas.setForeground(Color.WHITE);
		tblPeliculas.setDefaultEditor(Object.class, null);

		spTablaPeliculas = new JScrollPane(tblPeliculas);
		spTablaPeliculas.setBounds(50, 231, 300, 300);
		spTablaPeliculas.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		add(spTablaPeliculas);

		comentariosModel = new DefaultTableModel(); // Modelo vacío
		tblComentarios = new JTable(comentariosModel);
		tblComentarios.setFillsViewportHeight(true);
		tblComentarios.setRowHeight(60);
		tblComentarios.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		tblComentarios.setBackground(new Color(70, 76, 90));
		tblComentarios.setForeground(Color.WHITE);

		spTablaComentarios = new JScrollPane(tblComentarios);
		spTablaComentarios.setBounds(565, 231, 300, 300);
		spTablaComentarios.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		add(spTablaComentarios);

		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVolver.setBackground(new Color(255, 128, 0));
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setBounds(getWidth() - 180, 102, 120, 35);
		add(btnVolver);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setBackground(new Color(255, 128, 0));
		btnEliminar.setBounds(getWidth() - 180, 553, 120, 35);
		add(btnEliminar);

		lblImagenPelicula = new JLabel("");
		lblImagenPelicula.setOpaque(true);
		lblImagenPelicula.setBackground(Color.LIGHT_GRAY);
		lblImagenPelicula.setBounds(421, 231, 250, 360);
		add(lblImagenPelicula);

		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				int panelWidth = getWidth();
				int panelHeight = getHeight();

				pnlCabecera.setPreferredSize(new Dimension(panelWidth, 70));
				pnlCabecera.setBounds(0, 0, panelWidth, 70);

				pnlLineaBlanca.setBounds(26, 143, panelWidth - 80, 2);

				int tableWidth = Math.min(300, panelWidth / 3);
				spTablaPeliculas.setBounds(50, 231, tableWidth, panelHeight - 330);

				spTablaComentarios.setBounds(panelWidth / 2 - 50, 231, panelWidth - tableWidth - 100,
						panelHeight - 330);

				btnVolver.setBounds(panelWidth - 180, 102, 120, 35);
				btnEliminar.setBounds(panelWidth - 180, panelHeight - 80, 120, 35);

				revalidate();
				repaint();
			}
		});
	}

	public ImageIcon getScaledIcon(String path, int width, int height) {
		ImageIcon originalIcon = new ImageIcon(getClass().getResource(path));
		Image scaledImage = originalIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
		return new ImageIcon(scaledImage);
	}
}

package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import com.jgoodies.forms.factories.DefaultComponentFactory;

public class MenuBuscadorVista extends JPanel {

	private static final long serialVersionUID = 1L;
	public JTextField txtBuscar;
	public JButton btnPeliculas;
	public JButton btnSalir;
	public JButton btnHistorial;
	public JLabel lblBusqueda;
	public JLabel lblIconoLogo;
	public JPanel pnlGrid;

	public MenuBuscadorVista() {
		setBounds(0, 0, 1140, 640);
		setLayout(new BorderLayout(0, 0));

		JPanel pnlSuperior = new JPanel();
		pnlSuperior.setBackground(new Color(56, 59, 74));
		add(pnlSuperior, BorderLayout.NORTH);
		pnlSuperior.setLayout(new BorderLayout(0, 0));

		lblIconoLogo = new JLabel("");
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

		btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon(MenuBuscadorVista.class.getResource("/Images/iconosalida.png")));
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

		lblBusqueda = new JLabel("");
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

		JPanel pnlContieneGrid = new JPanel();
		pnlContieneGrid.setBackground(new Color(66, 72, 93));
		pnlCentral.add(pnlContieneGrid, BorderLayout.CENTER);
		pnlContieneGrid.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_18 = new JLabel("                ");
		pnlContieneGrid.add(lblNewLabel_18, BorderLayout.SOUTH);

		JPanel pnlTexto = new JPanel();
		pnlTexto.setBackground(new Color(66, 72, 93));
		pnlContieneGrid.add(pnlTexto, BorderLayout.NORTH);
		pnlTexto.setLayout(new BorderLayout(0, 0));

		JLabel lblHistorialPeliculas = new JLabel("New label");
		lblHistorialPeliculas = DefaultComponentFactory.getInstance().createLabel("Coincidencias de Busqueda");
		lblHistorialPeliculas.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblHistorialPeliculas.setForeground(new Color(255, 255, 255));
		pnlTexto.add(lblHistorialPeliculas, BorderLayout.WEST);

		JPanel pnlContieneSeparador = new JPanel();
		pnlContieneSeparador.setBackground(new Color(66, 72, 93));
		pnlTexto.add(pnlContieneSeparador, BorderLayout.SOUTH);
		pnlContieneSeparador.setLayout(new BorderLayout(0, 0));

		JSeparator separator = new JSeparator();
		pnlContieneSeparador.add(separator, BorderLayout.SOUTH);

		JLabel lblNewLabel_17 = new JLabel("      ");
		pnlContieneSeparador.add(lblNewLabel_17, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(66, 72, 93));
		pnlContieneGrid.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_19 = new JLabel("     ");
		panel.add(lblNewLabel_19, BorderLayout.NORTH);

		JScrollPane spTablaBusqueda = new JScrollPane();
		spTablaBusqueda.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		spTablaBusqueda.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(spTablaBusqueda, BorderLayout.CENTER);

		pnlGrid = new JPanel();
		spTablaBusqueda.setViewportView(pnlGrid);
		pnlGrid.setLayout(new GridLayout(0, 4, 10, 10));

	}

}

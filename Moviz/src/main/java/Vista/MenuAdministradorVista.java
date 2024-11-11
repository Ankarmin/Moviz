package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.jgoodies.forms.factories.DefaultComponentFactory;

public class MenuAdministradorVista extends JPanel {

	private static final long serialVersionUID = 1L;

	public JButton btnSalir;
	public JButton btnEliminarP;
	public JButton btnEliminarC;
	public JButton btnAgregarP;

	private JLabel lblComentarios;
	private JPanel panel_1;
	private JPanel LineaBlanca;
	private JLabel lblMenuAdministrador;
	private JPanel LineaBlanca_1;
	private JPanel LineaBlanca_1_1;
	private JLabel lblPeliculas;

	public MenuAdministradorVista() {
		setBackground(new Color(66, 72, 93));
		setBorder(null);
		setLayout(null);
		setBounds(0, 0, 1140, 640);

		// Top panel (panel_1) with BorderLayout to handle resizing
		panel_1 = new JPanel(new BorderLayout());
		panel_1.setBackground(new Color(56, 59, 74));
		panel_1.setPreferredSize(new Dimension(1140, 70)); // Fixed height
		panel_1.setBounds(0, 0, 1140, 70);
		add(panel_1);

		// Panel for logo aligned to the left
		JPanel logoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		logoPanel.setOpaque(false);

		// Icon logo on the left side of panel_1
		JLabel IconoLogo = DefaultComponentFactory.getInstance().createLabel("");
		IconoLogo.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacionAdministrador.png")));
		logoPanel.add(IconoLogo);

		// Panel for exit button aligned to the right
		JPanel exitPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		exitPanel.setOpaque(false);

		btnSalir = new JButton(new ImageIcon(getClass().getResource("/Images/iconosalida.png")));
		btnSalir.setContentAreaFilled(false);
		btnSalir.setBorderPainted(false);
		exitPanel.add(btnSalir);

		// Add logo and exit button panels to panel_1
		panel_1.add(logoPanel, BorderLayout.WEST);
		panel_1.add(exitPanel, BorderLayout.EAST);

		// Title label for "Menu administrador"
		lblMenuAdministrador = DefaultComponentFactory.getInstance().createLabel("Menu administrador");
		lblMenuAdministrador.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblMenuAdministrador.setForeground(new Color(255, 255, 255));
		lblMenuAdministrador.setBounds(26, 123, 135, 14);
		add(lblMenuAdministrador);

		// White dividing line under the title
		LineaBlanca = new JPanel();
		LineaBlanca.setBackground(Color.WHITE);
		LineaBlanca.setBounds(26, 143, getWidth() - 80, 2);
		add(LineaBlanca);

		// "Películas" section
		lblPeliculas = new JLabel("Películas");
		lblPeliculas.setFont(new Font("Microsoft YaHei", Font.BOLD, 25));
		lblPeliculas.setHorizontalAlignment(SwingConstants.CENTER);
		lblPeliculas.setBounds(253, 257, 183, 40);
		add(lblPeliculas);

		// White line below "Películas"
		LineaBlanca_1 = new JPanel();
		LineaBlanca_1.setBackground(Color.WHITE);
		LineaBlanca_1.setBounds(115, 299, 400, 2);
		add(LineaBlanca_1);

		// "Agregar Película" button
		btnAgregarP = new JButton("Agregar Película");
		btnAgregarP.setForeground(Color.WHITE);
		btnAgregarP.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		btnAgregarP.setBackground(new Color(247, 114, 15));
		btnAgregarP.setBounds(171, 322, 283, 38);
		add(btnAgregarP);

		// "Eliminar Película" button
		btnEliminarP = new JButton("Eliminar Película");
		btnEliminarP.setForeground(Color.WHITE);
		btnEliminarP.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		btnEliminarP.setBackground(new Color(255, 128, 0));
		btnEliminarP.setBounds(171, 382, 283, 38);
		add(btnEliminarP);

		// "Comentarios" section
		lblComentarios = new JLabel("Comentarios");
		lblComentarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblComentarios.setFont(new Font("Microsoft YaHei", Font.BOLD, 25));
		lblComentarios.setBounds(748, 257, 183, 40);
		add(lblComentarios);

		// White line below "Comentarios"
		LineaBlanca_1_1 = new JPanel();
		LineaBlanca_1_1.setBackground(Color.WHITE);
		LineaBlanca_1_1.setBounds(649, 299, 400, 2);
		add(LineaBlanca_1_1);

		// "Eliminar comentario" button
		btnEliminarC = new JButton("Eliminar comentario");
		btnEliminarC.setForeground(Color.WHITE);
		btnEliminarC.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		btnEliminarC.setBackground(new Color(255, 128, 0));
		btnEliminarC.setBounds(697, 322, 283, 38);
		add(btnEliminarC);

		// Adjust components based on window resizing
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				int panelWidth = getWidth();
				int panelHeight = getHeight();

				// Resize panel_1 to the full width of the window
				panel_1.setPreferredSize(new Dimension(panelWidth, 70));
				panel_1.setBounds(0, 0, panelWidth, 70);

				// Adjust the width of the line under the title
				LineaBlanca.setBounds(26, 143, panelWidth - 80, 2);

				// Define minimum Y position to prevent moving above the "Menu Administrador"
				// line
				int minY = 160; // Set this to slightly below the "Menu Administrador" line

				// Calculate Y position with a lower bound
				int baseY = Math.max(minY, Math.min(257, panelHeight / 2 - 100));

				// Center align the buttons, labels, and lines
				int buttonWidth = 283;
				int labelWidth = 183;
				int leftMargin = (panelWidth - buttonWidth * 2 - 60) / 2;

				lblPeliculas.setBounds(leftMargin + (buttonWidth - labelWidth) / 2, baseY, labelWidth, 40);
				lblComentarios.setBounds(leftMargin + buttonWidth + 60 + (buttonWidth - labelWidth) / 2, baseY,
						labelWidth, 40);

				btnAgregarP.setBounds(leftMargin, baseY + 65, buttonWidth, 38);
				btnEliminarP.setBounds(leftMargin, baseY + 125, buttonWidth, 38);
				btnEliminarC.setBounds(leftMargin + buttonWidth + 60, baseY + 65, buttonWidth, 38);

				LineaBlanca_1.setBounds(leftMargin, baseY + 42, buttonWidth, 2);
				LineaBlanca_1_1.setBounds(leftMargin + buttonWidth + 60, baseY + 42, buttonWidth, 2);

				revalidate();
				repaint();
			}
		});
	}
}

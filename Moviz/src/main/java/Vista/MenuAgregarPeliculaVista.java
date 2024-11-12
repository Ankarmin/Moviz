package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.jgoodies.forms.factories.DefaultComponentFactory;

public class MenuAgregarPeliculaVista extends JPanel {

	private static final long serialVersionUID = 1L;

	public JButton btnSalir;
	public JButton btnAñadirPelicula;
	public JButton btnVolver;
	public JButton btnTitulo;
	public JButton btnGenero;
	public JButton btnDuracionAprox;
	public JButton btnSinopsis;
	public JButton btnSubirImagen;

	public JLabel lblTituloSeccion;
	public JPanel pnlLineaBlanca;
	public JPanel pnlCabecera;

	public JTextField txtTitulo;
	public JTextField txtDuracionAprox;
	public JTextField txtRutaImagen;
	public JTextField txtAnioPublicacion;
	public JTextArea txtSinopsis;

	public JScrollPane scrollSinopsis;

	public JComboBox<String> cmbGenero;

	public MenuAgregarPeliculaVista() {
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
		JLabel IconoLogo = DefaultComponentFactory.getInstance().createLabel("");
		IconoLogo.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacionAdministrador.png")));
		logoPanel.add(IconoLogo);

		JPanel exitPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		exitPanel.setOpaque(false);
		btnSalir = new JButton(new ImageIcon(getClass().getResource("/Images/iconosalida.png")));
		btnSalir.setContentAreaFilled(false);
		btnSalir.setBorderPainted(false);
		exitPanel.add(btnSalir);

		pnlCabecera.add(logoPanel, BorderLayout.WEST);
		pnlCabecera.add(exitPanel, BorderLayout.EAST);

		lblTituloSeccion = new JLabel("Añadir Películas");
		lblTituloSeccion.setFont(new Font("Microsoft YaHei", Font.BOLD, 21));
		lblTituloSeccion.setForeground(new Color(255, 255, 255));
		lblTituloSeccion.setBounds(26, 108, 227, 29);
		add(lblTituloSeccion);

		pnlLineaBlanca = new JPanel();
		pnlLineaBlanca.setBackground(Color.WHITE);
		pnlLineaBlanca.setBounds(26, 143, getWidth() - 80, 2);
		add(pnlLineaBlanca);

		btnTitulo = createButton("Título", 100, 180, 200, 30);
		add(btnTitulo);
		txtTitulo = createTextField(350, 180, 400, 30);
		add(txtTitulo);

		btnGenero = createButton("Género", 100, 240, 200, 30);
		add(btnGenero);
		cmbGenero = new JComboBox<>(new String[] { "-Seleccionar-", "Acción", "Aventura", "Animación", "Comedia",
				"Crimen", "Documental", "Drama", "Familia", "Fantasía", "Historia", "Terror", "Música", "Misterio",
				"Romance", "Ciencia Ficción", "Película de TV", "Suspense", "Bélico", "Western" });
		cmbGenero.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		cmbGenero.setBounds(350, 240, 400, 30);
		cmbGenero.setBackground(new Color(70, 76, 90));
		cmbGenero.setForeground(Color.WHITE);
		add(cmbGenero);

		JButton btnAnioPublicacion = createButton("Año de Publicación", 100, 300, 200, 30);
		add(btnAnioPublicacion);
		txtAnioPublicacion = createTextField(350, 300, 400, 30);
		add(txtAnioPublicacion);

		btnDuracionAprox = createButton("Duración Aprox", 100, 360, 200, 30);
		add(btnDuracionAprox);
		txtDuracionAprox = createTextField(350, 360, 400, 30);
		add(txtDuracionAprox);

		btnSinopsis = createButton("Sinopsis", 100, 420, 200, 30);
		add(btnSinopsis);
		txtSinopsis = new JTextArea();
		txtSinopsis.setBackground(new Color(70, 76, 90));
		txtSinopsis.setForeground(Color.WHITE);
		txtSinopsis.setLineWrap(true);
		txtSinopsis.setWrapStyleWord(true);
		txtSinopsis.setBorder(BorderFactory.createLineBorder(new Color(56, 59, 74)));
		scrollSinopsis = new JScrollPane(txtSinopsis);
		scrollSinopsis.setBounds(350, 420, 400, 100);
		scrollSinopsis.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		add(scrollSinopsis);

		btnSubirImagen = createButton("Subir Imagen", 100, 540, 200, 30);
		add(btnSubirImagen);
		txtRutaImagen = createTextField(350, 540, 400, 30);
		add(txtRutaImagen);

		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVolver.setBackground(new Color(255, 128, 0));
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setBounds(966, 102, 120, 35);
		add(btnVolver);

		btnAñadirPelicula = new JButton("Añadir");
		btnAñadirPelicula.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAñadirPelicula.setForeground(Color.WHITE);
		btnAñadirPelicula.setBackground(new Color(255, 128, 0));
		btnAñadirPelicula.setBounds(961, 520, 125, 50);
		add(btnAñadirPelicula);

		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				int panelWidth = getWidth();
				int leftMargin = (panelWidth - 800) / 2;
				int inputWidth = 400;
				int labelWidth = 200;

				pnlCabecera.setBounds(0, 0, panelWidth, 70);
				pnlLineaBlanca.setBounds(26, 143, panelWidth - 80, 2);

				int baseY = 160;

				btnTitulo.setBounds(leftMargin, baseY + 20, labelWidth, 30);
				txtTitulo.setBounds(leftMargin + labelWidth + 20, baseY + 20, inputWidth, 30);

				btnGenero.setBounds(leftMargin, baseY + 80, labelWidth, 30);
				cmbGenero.setBounds(leftMargin + labelWidth + 20, baseY + 80, inputWidth, 30);

				btnAnioPublicacion.setBounds(leftMargin, baseY + 140, labelWidth, 30);
				txtAnioPublicacion.setBounds(leftMargin + labelWidth + 20, baseY + 140, inputWidth, 30);

				btnDuracionAprox.setBounds(leftMargin, baseY + 200, labelWidth, 30);
				txtDuracionAprox.setBounds(leftMargin + labelWidth + 20, baseY + 200, inputWidth, 30);

				btnSinopsis.setBounds(leftMargin, baseY + 260, labelWidth, 30);
				scrollSinopsis.setBounds(leftMargin + labelWidth + 20, baseY + 260, inputWidth, 100);

				btnSubirImagen.setBounds(leftMargin, baseY + 380, labelWidth, 30);
				txtRutaImagen.setBounds(leftMargin + labelWidth + 20, baseY + 380, inputWidth, 30);

				btnVolver.setBounds(panelWidth - 160, baseY, 120, 35);
				btnAñadirPelicula.setBounds(panelWidth - 160, baseY + 400, 125, 50);

				revalidate();
				repaint();
			}
		});
	}

	private JButton createButton(String text, int x, int y, int width, int height) {
		JButton button = new JButton(text);
		button.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		button.setBackground(new Color(224, 224, 224));
		button.setBounds(x, y, width, height);
		button.setEnabled(false);
		return button;
	}

	private JTextField createTextField(int x, int y, int width, int height) {
		JTextField textField = new JTextField();
		textField.setBounds(x, y, width, height);
		textField.setBackground(new Color(70, 76, 90));
		textField.setForeground(Color.WHITE);
		textField.setBorder(BorderFactory.createLineBorder(new Color(56, 59, 74)));
		return textField;
	}
}

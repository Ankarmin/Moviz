package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.jgoodies.forms.factories.DefaultComponentFactory;

public class MenuLoginVista extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel Fondo;
	private JPanel Cuerpo;

	public JButton btnRegistrar;
	public JButton btnIngresar;
	public JTextField txtUser;
	public JPasswordField txtPassword;
	public JLabel lblFondo;
	public JLabel logoApp;
	public JLabel lblTitulo;
	public JLabel lblUsuario;
	public JLabel lblContrasea;
	public JLabel lblAnNoTienes;
	public JLabel lblIconoUsuario;
	public JLabel lblIconoPassword;
	public JLabel lblEspacioVacio;
	private GridBagConstraints gbc_1;
	private GridBagConstraints gbc_2;
	private GridBagConstraints gbc_3;
	private GridBagConstraints gbc_4;
	private GridBagConstraints gbc_5;

	public MenuLoginVista() {
		setBackground(new Color(66, 72, 93));
		setBounds(0, 0, 1140, 640);
		setLayout(new BorderLayout(0, 0));

		Fondo = new JPanel();
		Fondo.setLayout(new BorderLayout());
		add(Fondo, BorderLayout.WEST);

		lblFondo = new JLabel();
		lblFondo.setHorizontalAlignment(JLabel.CENTER);
		Fondo.add(lblFondo, BorderLayout.CENTER);
		lblFondo.setIcon(new ImageIcon(getClass().getResource("/Images/ImagenAcompañante.png")));
		lblFondo.setPreferredSize(new Dimension(400, lblFondo.getHeight()));

		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				int anchoVentana = getWidth();
				int anchoMinimoVentana = 1100;
				int anchoMaximoVentana = 1600;
				int anchoMinimoFondo = 400;
				int anchoMaximoFondo = 640;

				if (anchoVentana <= anchoMinimoVentana) {
					lblFondo.setPreferredSize(new Dimension(anchoMinimoFondo, lblFondo.getHeight()));
				} else if (anchoVentana >= anchoMaximoVentana) {
					lblFondo.setPreferredSize(new Dimension(anchoMaximoFondo, lblFondo.getHeight()));
				} else {
					int nuevoAncho = anchoMinimoFondo + (anchoVentana - anchoMinimoVentana)
							* (anchoMaximoFondo - anchoMinimoFondo) / (anchoMaximoVentana - anchoMinimoVentana);
					lblFondo.setPreferredSize(new Dimension(nuevoAncho, lblFondo.getHeight()));
				}

				Fondo.revalidate();
				Fondo.repaint();
			}
		});

		Cuerpo = new JPanel();
		Cuerpo.setBackground(new Color(66, 72, 93));
		Cuerpo.setLayout(new GridBagLayout());
		add(Cuerpo, BorderLayout.CENTER);

		Cuerpo.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				Dimension size = Cuerpo.getSize();
				double scaleFactor = Math.min(size.getWidth() / 840, size.getHeight() / 540);

				logoApp.setFont(logoApp.getFont().deriveFont((float) (30 * scaleFactor)));
				lblTitulo.setFont(lblTitulo.getFont().deriveFont((float) (27 * scaleFactor)));
				lblAnNoTienes.setFont(lblAnNoTienes.getFont().deriveFont((float) (25 * scaleFactor)));
				btnIngresar.setFont(btnIngresar.getFont().deriveFont((float) (14 * scaleFactor)));
				btnRegistrar.setFont(btnRegistrar.getFont().deriveFont((float) (14 * scaleFactor)));

				Cuerpo.revalidate();
				Cuerpo.repaint();
			}
		});

		GridBagConstraints gbc;

		logoApp = DefaultComponentFactory.getInstance().createLabel("");
		logoApp.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacion.png")));
		gbc = new GridBagConstraints();
		gbc.insets = new Insets(10, 10, 10, 10);
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 3;
		gbc.anchor = GridBagConstraints.CENTER;
		Cuerpo.add(logoApp, gbc);

		lblTitulo = new JLabel("Inicia Sesión en Moviz");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Microsoft YaHei", Font.BOLD, 27));
		gbc = new GridBagConstraints();
		gbc.insets = new Insets(10, 10, 10, 10);
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 3;
		Cuerpo.add(lblTitulo, gbc);

		lblIconoUsuario = DefaultComponentFactory.getInstance().createTitle("");
		lblIconoUsuario.setIcon(new ImageIcon(getClass().getResource("/Images/UsuarioIcono.png")));
		gbc = new GridBagConstraints();
		gbc.insets = new Insets(10, 10, 10, 10);
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.WEST;
		Cuerpo.add(lblIconoUsuario, gbc);

		lblEspacioVacio = DefaultComponentFactory.getInstance().createTitle("");
		lblEspacioVacio.setIcon(new ImageIcon(getClass().getResource("/Images/blankSpace.png")));
		gbc = new GridBagConstraints();
		gbc.insets = new Insets(10, 10, 10, 10);
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.anchor = GridBagConstraints.WEST;
		Cuerpo.add(lblEspacioVacio, gbc);

		txtUser = new JTextField("Ingresar usuario");
		txtUser.setForeground(Color.GRAY);
		txtUser.setColumns(20);
		gbc_3 = new GridBagConstraints();
		gbc_3.gridwidth = 2;
		gbc_3.insets = new Insets(10, 10, 10, 10);
		gbc_3.gridx = 1;
		gbc_3.gridy = 2;
		gbc_3.fill = GridBagConstraints.BOTH;
		Cuerpo.add(txtUser, gbc_3);

		lblIconoPassword = DefaultComponentFactory.getInstance().createTitle("");
		lblIconoPassword.setIcon(new ImageIcon(getClass().getResource("/Images/PasswordIcono.png")));
		gbc = new GridBagConstraints();
		gbc.insets = new Insets(10, 10, 10, 10);
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.WEST;
		Cuerpo.add(lblIconoPassword, gbc);

		txtPassword = new JPasswordField("**********");
		txtPassword.setForeground(Color.GRAY);
		txtPassword.setColumns(20);
		gbc_4 = new GridBagConstraints();
		gbc_4.gridwidth = 2;
		gbc_4.insets = new Insets(10, 10, 10, 10);
		gbc_4.gridx = 1;
		gbc_4.gridy = 3;
		gbc_4.fill = GridBagConstraints.BOTH;
		Cuerpo.add(txtPassword, gbc_4);

		btnIngresar = new JButton(" INGRESAR ");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIngresar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnIngresar.setBackground(new Color(255, 128, 0));
		btnIngresar.setForeground(Color.WHITE);
		gbc_1 = new GridBagConstraints();
		gbc_1.fill = GridBagConstraints.BOTH;
		gbc_1.insets = new Insets(10, 10, 10, 10);
		gbc_1.gridx = 2;
		gbc_1.gridy = 4;
		Cuerpo.add(btnIngresar, gbc_1);

		btnRegistrar = new JButton(" REGISTRARSE ");
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegistrar.setBackground(new Color(255, 128, 0));
		btnRegistrar.setForeground(Color.WHITE);
		gbc_2 = new GridBagConstraints();
		gbc_2.fill = GridBagConstraints.BOTH;
		gbc_2.insets = new Insets(10, 10, 10, 10);
		gbc_2.gridx = 2;
		gbc_2.gridy = 6;
		Cuerpo.add(btnRegistrar, gbc_2);

		lblAnNoTienes = new JLabel("Aún no tienes cuenta?");
		lblAnNoTienes.setForeground(Color.WHITE);
		lblAnNoTienes.setFont(new Font("Microsoft YaHei", Font.BOLD, 27));
		gbc_5 = new GridBagConstraints();
		gbc_5.insets = new Insets(20, 20, 10, 10);
		gbc_5.gridx = 1;
		gbc_5.gridy = 6;
		gbc_5.gridwidth = 1;
		gbc_5.anchor = GridBagConstraints.NORTHWEST;
		Cuerpo.add(lblAnNoTienes, gbc_5);
	}
}
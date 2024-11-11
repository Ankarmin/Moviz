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

public class RegistrarVista extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel Fondo;
	private JPanel Cuerpo;

	public JTextField txtUser;
	public JPasswordField txtPassword;
	public JTextField txtEmail;

	public JButton btnRegistrar;
	public JButton btnIniciarSesion;
	public JLabel lblFondo;
	public JLabel logoApp;
	public JLabel lblTitulo;
	public JLabel textocontraseña;
	public JLabel textousuario;
	public JLabel yatienescuenta;
	public JLabel teléfono;
	public JLabel lblIconoUsuario;
	public JLabel lblIconoPassword;
	public JLabel iconoCorreo;
	public JLabel lblEspacioVacio;

	public RegistrarVista() {
		setBackground(new Color(66, 72, 93));
		setBounds(0, 0, 1140, 640);
		setLayout(new BorderLayout(0, 0));

		Fondo = new JPanel();
		Fondo.setLayout(new BorderLayout());
		add(Fondo, BorderLayout.WEST);

		lblFondo = new JLabel();
		lblFondo.setHorizontalAlignment(JLabel.CENTER);
		Fondo.add(lblFondo, BorderLayout.CENTER);
		lblFondo.setIcon(new ImageIcon(getClass().getResource("/Images/ImagenAcompañante2.png")));
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

		initStyles();

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
				yatienescuenta.setFont(yatienescuenta.getFont().deriveFont((float) (27 * scaleFactor)));
				btnRegistrar.setFont(btnRegistrar.getFont().deriveFont((float) (14 * scaleFactor)));
				lblEspacioVacio.setFont(yatienescuenta.getFont().deriveFont((float) (27 * scaleFactor)));
				btnIniciarSesion.setFont(btnRegistrar.getFont().deriveFont((float) (14 * scaleFactor)));
				Cuerpo.revalidate();
				Cuerpo.repaint();
			}
		});

		GridBagConstraints gbc;

		// Logo de la aplicación
		logoApp = DefaultComponentFactory.getInstance().createLabel("");
		logoApp.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacion.png")));
		gbc = new GridBagConstraints();
		gbc.insets = new Insets(10, 10, 10, 10);
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 3;
		gbc.anchor = GridBagConstraints.CENTER;
		Cuerpo.add(logoApp, gbc);

		lblEspacioVacio = DefaultComponentFactory.getInstance().createTitle("");
		lblEspacioVacio.setIcon(new ImageIcon(getClass().getResource("/Images/blankSpace.png")));
		gbc = new GridBagConstraints();
		gbc.insets = new Insets(10, 10, 10, 10);
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.anchor = GridBagConstraints.WEST;
		Cuerpo.add(lblEspacioVacio, gbc);

		// Título
		lblTitulo = new JLabel("Crea tu cuenta en Moviz");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Microsoft YaHei", Font.BOLD, 27));
		gbc = new GridBagConstraints();
		gbc.insets = new Insets(10, 10, 10, 10);
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 3;
		Cuerpo.add(lblTitulo, gbc);

		// Icono de usuario
		lblIconoUsuario = DefaultComponentFactory.getInstance().createTitle("");
		lblIconoUsuario.setIcon(new ImageIcon(getClass().getResource("/Images/UsuarioIcono.png")));
		gbc = new GridBagConstraints();
		gbc.insets = new Insets(10, 10, 10, 10);
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.WEST;
		Cuerpo.add(lblIconoUsuario, gbc);

		// Campo de usuario
		txtUser = new JTextField("Ingresar usuario");
		txtUser.setForeground(Color.GRAY);
		txtUser.setColumns(20);
		gbc = new GridBagConstraints();
		gbc.gridwidth = 2;
		gbc.insets = new Insets(10, 10, 10, 10);
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.fill = GridBagConstraints.BOTH;
		Cuerpo.add(txtUser, gbc);

		// Icono de contraseña
		lblIconoPassword = DefaultComponentFactory.getInstance().createTitle("");
		lblIconoPassword.setIcon(new ImageIcon(getClass().getResource("/Images/PasswordIcono.png")));
		gbc = new GridBagConstraints();
		gbc.insets = new Insets(10, 10, 10, 10);
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.WEST;
		Cuerpo.add(lblIconoPassword, gbc);

		// Campo de contraseña
		txtPassword = new JPasswordField("**********");
		txtPassword.setForeground(Color.GRAY);
		txtPassword.setColumns(20);
		gbc = new GridBagConstraints();
		gbc.gridwidth = 2;
		gbc.insets = new Insets(10, 10, 10, 10);
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.fill = GridBagConstraints.BOTH;
		Cuerpo.add(txtPassword, gbc);

		// Icono de correo electrónico
		iconoCorreo = DefaultComponentFactory.getInstance().createTitle("");
		iconoCorreo.setIcon(new ImageIcon(getClass().getResource("/Images/CorreoIcono.png")));
		gbc = new GridBagConstraints();
		gbc.insets = new Insets(10, 10, 10, 10);
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.anchor = GridBagConstraints.WEST;
		Cuerpo.add(iconoCorreo, gbc);

		// Campo de correo electrónico
		txtEmail = new JTextField("Ingresar correo electrónico");
		txtEmail.setForeground(Color.GRAY);
		txtEmail.setColumns(20);
		gbc = new GridBagConstraints();
		gbc.gridwidth = 2;
		gbc.insets = new Insets(10, 10, 10, 10);
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.fill = GridBagConstraints.BOTH;
		Cuerpo.add(txtEmail, gbc);

		// Botón "Registrar"
		btnRegistrar = new JButton("       REGISTRAR       ");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegistrar.setForeground(Color.WHITE);
		btnRegistrar.setBackground(new Color(255, 128, 0));
		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(10, 10, 10, 10);
		gbc.gridx = 2;
		gbc.gridy = 5;
		Cuerpo.add(btnRegistrar, gbc);

		// Botón "Iniciar Sesión"
		btnIniciarSesion = new JButton("INICIAR SESIÓN");
		btnIniciarSesion.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnIniciarSesion.setForeground(Color.WHITE);
		btnIniciarSesion.setBackground(new Color(255, 128, 0));
		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(10, 10, 10, 10);
		gbc.gridx = 2;
		gbc.gridy = 6;
		Cuerpo.add(btnIniciarSesion, gbc);

		// Etiqueta "Ya tienes cuenta?"
		yatienescuenta = new JLabel("Ya tienes cuenta?");
		yatienescuenta.setForeground(Color.WHITE);
		yatienescuenta.setFont(new Font("Microsoft YaHei", Font.BOLD, 27));
		gbc = new GridBagConstraints();
		gbc.insets = new Insets(20, 20, 10, 10);
		gbc.gridx = 1;
		gbc.gridy = 6;
		gbc.gridwidth = 1;
		gbc.anchor = GridBagConstraints.NORTHWEST;
		Cuerpo.add(yatienescuenta, gbc);

		initStyles();
	}

	private void initStyles() {
		// Implementa los listeners para placeholders si es necesario
	}
}

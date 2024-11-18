package controlador;

import java.awt.Color;
import java.sql.Connection;

import javax.swing.JOptionPane;

import modelo.MenuLoginModelo;
import repositorio.AdministradorRepositorio;
import repositorio.ClienteRepositorio;
import repositorio.Usuario;
import repositorio.UsuarioRepositorio;
import vista.MenuLoginVista;

public class PnlMenuLoginControlador {

	private final FrameControlador frameControlador;

	private final MenuLoginVista vista;
	private final MenuLoginModelo modelo;

	public PnlMenuLoginControlador(Connection openConexion, FrameControlador frameControlador) {

		this.frameControlador = frameControlador;

		vista = new MenuLoginVista();
		modelo = new MenuLoginModelo(new UsuarioRepositorio(openConexion), new ClienteRepositorio(openConexion),
				new AdministradorRepositorio(openConexion));

		setEvents();
	}

	public final void setEvents() {
		vista.btnIngresar.addActionListener((e) -> {
			iniciarSesion();
		});

		vista.btnRegistrar.addActionListener((e) -> {
			irAMenuRegistrar();
		});

		vista.txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent e) {
				if (vista.txtUser.getText().equals("Ingresar usuario")) {
					vista.txtUser.setText("");
					vista.txtUser.setForeground(Color.WHITE);
				}
			}

			public void focusLost(java.awt.event.FocusEvent e) {
				if (vista.txtUser.getText().isEmpty()) {
					vista.txtUser.setForeground(Color.GRAY);
					vista.txtUser.setText("Ingresar usuario");
				}
			}
		});

		vista.txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent e) {
				String password = new String(vista.txtPassword.getPassword());
				if (password.equals("**********")) {
					vista.txtPassword.setText("");
					vista.txtPassword.setForeground(Color.WHITE);
					vista.txtPassword.setEchoChar('●');
				}
			}

			public void focusLost(java.awt.event.FocusEvent e) {
				String password = new String(vista.txtPassword.getPassword());
				if (password.isEmpty()) {
					vista.txtPassword.setForeground(Color.GRAY);
					vista.txtPassword.setText("**********");
					vista.txtPassword.setEchoChar((char) 0);
				}
			}
		});

		vista.txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
			@Override
			public void keyPressed(java.awt.event.KeyEvent e) {
				if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
					iniciarSesion();
				}
			}
		});

		vista.txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
			@Override
			public void keyPressed(java.awt.event.KeyEvent e) {
				if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
					iniciarSesion();
				}
			}
		});
	}

	public void mostrar() {
		frameControlador.getFrameVista().pnlContenido.removeAll();
		frameControlador.getFrameVista().pnlContenido.add(vista);
		frameControlador.getFrameVista().pnlContenido.revalidate();
		frameControlador.getFrameVista().pnlContenido.repaint();
	}

	private void limpiar() {
		vista.txtUser.setForeground(Color.GRAY);
		vista.txtUser.setText("Ingresar usuario");
		vista.txtPassword.setForeground(Color.GRAY);
		vista.txtPassword.setText("**********");
		vista.txtPassword.setEchoChar((char) 0);
	}

	private void iniciarSesion() {
		String user = vista.txtUser.getText();
		String password = new String(vista.txtPassword.getPassword());
		String rol = modelo.login(user, password);
		Usuario usuario = modelo.obtenerUsuario(user, password);

		if (rol != null) {
			if (rol.equals("cliente")) {
				PnlMenuUsuarioControlador menuUsuarioControalador = new PnlMenuUsuarioControlador(
						frameControlador.getOpenConexion(), frameControlador, usuario);
				menuUsuarioControalador.mostrar();
				limpiar();
			} else if (rol.equals("administrador")) {
				frameControlador.getMenuAdministradorControlador().mostrar();
				limpiar();
			}
		} else {
			JOptionPane.showMessageDialog(vista, "Usuario o contraseña incorrectos", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	private void irAMenuRegistrar() {
		frameControlador.getMenuRegistrarControlador().mostrar();
		limpiar();
	}

	public MenuLoginVista getVista() {
		return vista;
	}
}

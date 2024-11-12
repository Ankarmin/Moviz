package Controlador;

import java.awt.Color;
import java.sql.Connection;

import javax.swing.JOptionPane;

import DBRepositorio.AdministradorRepositorio;
import DBRepositorio.ClienteRepositorio;
import DBRepositorio.Usuario;
import DBRepositorio.UsuarioRepositorio;
import Modelo.LoginModelo;
import Vista.MenuLoginVista;

public class PnlMenuLoginControlador {

	private final FrameControlador frameControlador;

	private final MenuLoginVista vista;
	private final LoginModelo modelo;

	public PnlMenuLoginControlador(Connection openConexion, FrameControlador frameControlador) {

		this.frameControlador = frameControlador;

		vista = new MenuLoginVista();
		modelo = new LoginModelo(new UsuarioRepositorio(openConexion), new ClienteRepositorio(openConexion),
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

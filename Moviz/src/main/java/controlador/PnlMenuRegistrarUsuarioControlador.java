package controlador;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.Connection;

import javax.swing.JOptionPane;

import modelo.MenuRegistrarUsuarioModelo;
import repositorio.Cliente;
import repositorio.ClienteRepositorio;
import repositorio.Usuario;
import repositorio.UsuarioRepositorio;
import vista.MenuRegistrarUsuarioVista;

public class PnlMenuRegistrarUsuarioControlador {

	private final FrameControlador frameControlador;
	private final MenuRegistrarUsuarioVista vista;
	private final MenuRegistrarUsuarioModelo modelo;

	public PnlMenuRegistrarUsuarioControlador(Connection openConexion, FrameControlador frameControlador) {

		this.frameControlador = frameControlador;

		vista = new MenuRegistrarUsuarioVista();
		modelo = new MenuRegistrarUsuarioModelo(new UsuarioRepositorio(openConexion), new ClienteRepositorio(openConexion));

		setEvents();
	}

	public final void setEvents() {
		vista.btnRegistrar.addActionListener((e) -> {
			registrar();
		});

		vista.btnIniciarSesion.addActionListener((e) -> {
			irAMenuLogin();
		});

		vista.txtUser.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				if (vista.txtUser.getText().equals("Ingresar usuario")) {
					vista.txtUser.setText("");
					vista.txtUser.setForeground(Color.WHITE);
				}
			}

			public void focusLost(FocusEvent e) {
				if (vista.txtUser.getText().isEmpty()) {
					vista.txtUser.setForeground(Color.GRAY);
					vista.txtUser.setText("Ingresar usuario");
				}
			}
		});

		vista.txtPassword.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				String password = new String(vista.txtPassword.getPassword());
				if (password.equals("**********")) {
					vista.txtPassword.setText("");
					vista.txtPassword.setForeground(Color.WHITE);
					vista.txtPassword.setEchoChar('●');
				}
			}

			public void focusLost(FocusEvent e) {
				String password = new String(vista.txtPassword.getPassword());
				if (password.isEmpty()) {
					vista.txtPassword.setForeground(Color.GRAY);
					vista.txtPassword.setText("**********");
					vista.txtPassword.setEchoChar((char) 0);
				}
			}
		});

		vista.txtEmail.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				if (vista.txtEmail.getText().equals("Ingresar correo electrónico")) {
					vista.txtEmail.setText("");
					vista.txtEmail.setForeground(Color.WHITE);
				}
			}

			public void focusLost(FocusEvent e) {
				if (vista.txtEmail.getText().isEmpty()) {
					vista.txtEmail.setForeground(Color.GRAY);
					vista.txtEmail.setText("Ingresar correo electrónico");
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
		vista.txtEmail.setForeground(Color.GRAY);
		vista.txtEmail.setText("Ingresar correo electrónico");
	}

	private void registrar() {
		String username = vista.txtUser.getText();
		String password = new String(vista.txtPassword.getPassword());
		String email = vista.txtEmail.getText();

		Usuario usuario = new Usuario();
		usuario.setUser(username);
		usuario.setPassword(password);

		boolean usuarioRegistrado = modelo.agregarUsuario(usuario);

		if (usuarioRegistrado) {
			int idUsuario = usuario.getId();

			Cliente cliente = new Cliente();
			cliente.setIdUsuario(idUsuario);
			cliente.setEmail(email);

			boolean clienteRegistrado = modelo.agregarCliente(cliente);

			if (clienteRegistrado) {
				JOptionPane.showMessageDialog(vista, "Cliente registrados con éxito.");
				limpiar();
				irAMenuLogin();
			} else {
				System.out.println("Error al registar el Cliente.");
			}
		} else {
			System.out.println("Error al registar el Usuario.");
		}
	}

	private void irAMenuLogin() {
		frameControlador.getMenuLoginControlador().mostrar();
		limpiar();
	}

	public MenuRegistrarUsuarioVista getVista() {
		return vista;
	}
}

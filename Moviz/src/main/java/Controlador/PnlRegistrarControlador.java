package Controlador;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.Connection;

import javax.swing.JOptionPane;

import DBRepositorio.Cliente;
import DBRepositorio.ClienteRepositorio;
import DBRepositorio.Usuario;
import DBRepositorio.UsuarioRepositorio;
import Modelo.RegistrarModelo;
import Vista.RegistrarVista;

public class PnlRegistrarControlador {

	private final FrameControlador frameControlador;
	private final RegistrarVista vista;
	private final RegistrarModelo modelo;

	public PnlRegistrarControlador(Connection openConexion, FrameControlador frameControlador) {

		this.frameControlador = frameControlador;

		vista = new RegistrarVista();
		modelo = new RegistrarModelo(new UsuarioRepositorio(openConexion), new ClienteRepositorio(openConexion));

		setEvents();
	}

	// MÉTODO QUE CONFIGURA LOS EVENTOS DE CLICK DE LOS BOTONES DE BIBLIOTECAVISTA
	public final void setEvents() {
		vista.btnRegistrar.addActionListener((e) -> {
			registrar();
		});

		vista.btnIniciarSesion.addActionListener((e) -> {
			irALogin();
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
		vista.txtPassword.setEchoChar((char) 0); // ELIMINAR EL CARÁCTER DE ECO
		vista.txtEmail.setForeground(Color.GRAY);
		vista.txtEmail.setText("Ingresar correo electrónico");
	}

	private void registrar() {
		// OBTENER DATOS DE LA VISTA
		String username = vista.txtUser.getText();
		String password = new String(vista.txtPassword.getPassword());
		String email = vista.txtEmail.getText();

		// CREAR EL OBJETO USUARIO
		Usuario usuario = new Usuario();
		usuario.setUser(username);
		usuario.setPassword(password);

		// INTENTAR AGREGAR EL USUARIO EN LA BASE DE DATOS
		boolean usuarioRegistrado = modelo.agregarUsuario(usuario);

		if (usuarioRegistrado) {
			// SI EL USUARIO SE REGISTRA CORRECTAMENTE, OBTENEMOS SU ID
			int idUsuario = usuario.getId(); // ESTE ID DEBE HABER SIDO ASIGNADO EN EL REPOSITORIO AL USUARIO

			// CREAR EL OBJETO CLIENTE CON EL ID DEL USUARIO
			Cliente cliente = new Cliente();
			cliente.setIdUsuario(idUsuario);
			cliente.setEmail(email);

			// AGREGAR EL CLIENTE EN LA BASE DE DATOS
			boolean clienteRegistrado = modelo.agregarCliente(cliente);

			if (clienteRegistrado) {
				JOptionPane.showMessageDialog(vista, "Cliente registrados con éxito.");
				limpiar();
				irALogin();
			} else {
				System.out.println("Error al registar el Cliente.");
			}
		} else {
			System.out.println("Error al registar el Usuario.");
		}
	}

	private void irALogin() {
		frameControlador.getLoginControlador().mostrar();
		limpiar();
	}

	public RegistrarVista getVista() {
		return vista;
	}
}

package Controlador;

import java.sql.Connection;

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
			limpiar();
		});
	}

	public void mostrar() {
		frameControlador.getFrameVista().pnlContenido.removeAll();
		frameControlador.getFrameVista().pnlContenido.add(vista);
		frameControlador.getFrameVista().pnlContenido.revalidate();
		frameControlador.getFrameVista().pnlContenido.repaint();
	}

	private void limpiar() {
		vista.txtUser.setText("");
		vista.txtPassword.setText("");
		vista.txtEmail.setText("");
	}

	private void registrar() {
		// OBTENER DATOS DE LA VISTA
		String username = vista.txtUser.getText();
		String password = vista.txtPassword.getText();
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

			// INTENTAR AGREGAR EL CLIENTE EN LA BASE DE DATOS
			boolean clienteRegistrado = modelo.agregarCliente(cliente);

			if (clienteRegistrado) {
				System.out.println("Usuario y Cliente registrados con éxito.");
				limpiar(); // LIMPIAR LOS CAMPOS SI TODO VA BIEN
			} else {
				System.out.println("Error al registar el Cliente.");
			}
		} else {
			System.out.println("Error al registar el Usuario.");
		}
	}

	private void irALogin() {
		frameControlador.getLoginControlador().mostrar();
	}

	public RegistrarVista getVista() {
		return vista;
	}
}

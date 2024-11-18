package modelo;

import repositorio.Administrador;
import repositorio.AdministradorRepositorio;
import repositorio.Cliente;
import repositorio.ClienteRepositorio;
import repositorio.Usuario;
import repositorio.UsuarioRepositorio;

public class MenuLoginModelo {

	private final UsuarioRepositorio usuarioRepositorio;
	private final ClienteRepositorio clienteRepositorio;
	private final AdministradorRepositorio administradorRepositorio;

	public MenuLoginModelo(UsuarioRepositorio usuarioRepositorio, ClienteRepositorio clienteRepositorio,
			AdministradorRepositorio administradorRepositorio) {
		this.usuarioRepositorio = usuarioRepositorio;
		this.clienteRepositorio = clienteRepositorio;
		this.administradorRepositorio = administradorRepositorio;
	}

	public String login(String username, String password) {
		Usuario usuario = usuarioRepositorio.obtenerPorUsuarioYPassword(username, password);

		if (usuario != null) {
			// VERIFICAR SI ES UN CLIENTE
			Cliente cliente = clienteRepositorio.obtenerPorIdUsuario(usuario.getId());
			if (cliente != null) {
				return "cliente";
			}

			// VERIFICAR SI ES UN CLIENTE
			Administrador administrador = administradorRepositorio.obtenerPorIdUsuario(usuario.getId());
			if (administrador != null) {
				return "administrador";
			}
		}
		return null; // SI EN CASO NO ENCUENTRA NADA
	}

	public Usuario obtenerUsuario(String username, String password) {
		return usuarioRepositorio.obtenerPorUsuarioYPassword(username, password);
	}
}

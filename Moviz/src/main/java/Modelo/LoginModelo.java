package Modelo;

import DBRepositorio.Administrador;
import DBRepositorio.AdministradorRepositorio;
import DBRepositorio.Cliente;
import DBRepositorio.ClienteRepositorio;
import DBRepositorio.Usuario;
import DBRepositorio.UsuarioRepositorio;

public class LoginModelo {

	private final UsuarioRepositorio usuarioRepositorio;
	private final ClienteRepositorio clienteRepositorio;
	private final AdministradorRepositorio administradorRepositorio;

	public LoginModelo(UsuarioRepositorio usuarioRepositorio, ClienteRepositorio clienteRepositorio,
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
}

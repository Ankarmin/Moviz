package Modelo;

import DBRepositorio.Cliente;
import DBRepositorio.ClienteRepositorio;
import DBRepositorio.Usuario;
import DBRepositorio.UsuarioRepositorio;

public class RegistrarModelo {

	private final UsuarioRepositorio usuarioRepositorio;
	private final ClienteRepositorio clienteRepositorio;

	public RegistrarModelo(UsuarioRepositorio usuarioRepositorio, ClienteRepositorio clienteRepositorio) {
		this.usuarioRepositorio = usuarioRepositorio;
		this.clienteRepositorio = clienteRepositorio;
	}

	public boolean agregarUsuario(Usuario usuario) {
		return usuarioRepositorio.agregar(usuario);
	}

	public boolean agregarCliente(Cliente cliente) {
		return clienteRepositorio.agregar(cliente);
	}
}

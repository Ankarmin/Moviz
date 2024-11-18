package modelo;

import repositorio.Cliente;
import repositorio.ClienteRepositorio;
import repositorio.Usuario;
import repositorio.UsuarioRepositorio;

public class MenuRegistrarUsuarioModelo {

	private final UsuarioRepositorio usuarioRepositorio;
	private final ClienteRepositorio clienteRepositorio;

	public MenuRegistrarUsuarioModelo(UsuarioRepositorio usuarioRepositorio, ClienteRepositorio clienteRepositorio) {
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

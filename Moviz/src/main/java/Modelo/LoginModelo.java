package Modelo;

import DBRepositorio.AdministradorRepositorio;
import DBRepositorio.ClienteRepositorio;
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

	// MÉTODOS
}

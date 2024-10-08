package Modelo;

import DBRepositorio.ClienteRepositorio;
import DBRepositorio.Usuario;
import DBRepositorio.UsuarioRepositorio;

public class LoginModelo {

	private final UsuarioRepositorio usuarioRepositorio;
	private final ClienteRepositorio clienteRepositorio;

	public LoginModelo(UsuarioRepositorio usuarioRepositorio, ClienteRepositorio clienteRepositorio) {
		this.usuarioRepositorio = usuarioRepositorio;
		this.clienteRepositorio = clienteRepositorio;
	}

	//MÉTODOS
}

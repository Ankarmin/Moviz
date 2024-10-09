package Controlador;

import java.sql.Connection;

import DBRepositorio.AdministradorRepositorio;
import DBRepositorio.ClienteRepositorio;
import DBRepositorio.UsuarioRepositorio;
import Modelo.LoginModelo;
import Vista.LoginVista;

public class PnlLoginControlador {

	private final FrameControlador frameControlador;
	private final LoginVista vista;
	private final LoginModelo modelo;

	public PnlLoginControlador(Connection openConexion, FrameControlador frameControlador) {

		this.frameControlador = frameControlador;

		vista = new LoginVista();
		modelo = new LoginModelo(new UsuarioRepositorio(openConexion), new ClienteRepositorio(openConexion),
				new AdministradorRepositorio(openConexion));

		vista.btnIngresar.addActionListener((e) -> {
			iniciarSesion();
			limpiar();
		});

		vista.btnRegistrar.addActionListener((e) -> {
			irARegistrar();
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
	}

	private void iniciarSesion() {
		String user = vista.txtUser.getText();

		if (user.equals("usuario")) {
			frameControlador.getMenuUsuarioControlador().mostrar();
		} else if (user.equals("admin")) {
			frameControlador.getMenuAdministradorControlador().mostrar();
		}
	}

	private void irARegistrar() {
		frameControlador.getRegistrarControlador().mostrar();
	}

	public LoginVista getVista() {
		return vista;
	}
}

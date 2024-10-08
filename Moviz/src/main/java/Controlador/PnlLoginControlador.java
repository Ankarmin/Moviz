package Controlador;

import java.sql.Connection;
import DBRepositorio.ClienteRepositorio;
import DBRepositorio.UsuarioRepositorio;
import Modelo.LoginModelo;
import Vista.LoginVista;

public class PnlLoginControlador {

	private final FrameControlador frameControlador;
	private final LoginVista vista;
	private final LoginModelo loginModelo;

	public PnlLoginControlador(Connection openConexion, FrameControlador frameControlador) {

		this.frameControlador = frameControlador;

		vista = new LoginVista();
		loginModelo = new LoginModelo(new UsuarioRepositorio(openConexion), new ClienteRepositorio(openConexion));

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
	}

	private void iniciarSesion() {

	}

	private void irARegistrar() {
		frameControlador.getRegistrarControlador().mostrar();
	}

	public LoginVista getVista() {
		return vista;
	}
}

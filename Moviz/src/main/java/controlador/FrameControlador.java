package controlador;

import java.sql.Connection;

import conexion.Conexion;
import vista.FrameVista;

public class FrameControlador {

	private Connection openConexion;
	private final Conexion conexion;

	private final FrameVista frameVista;

	private final PnlMenuLoginControlador menuLoginControlador;
	private final PnlMenuRegistrarUsuarioControlador menuRegistrarControlador;

	public FrameControlador() {

		conexion = new Conexion(openConexion);
		openConexion = conexion.getOpenConexion();

		frameVista = new FrameVista();

		menuRegistrarControlador = new PnlMenuRegistrarUsuarioControlador(openConexion, this);
		menuLoginControlador = new PnlMenuLoginControlador(openConexion, this);
	}

	public void iniciar() {
		frameVista.setLocationRelativeTo(null);
		frameVista.setVisible(true);
		menuLoginControlador.mostrar();
	}

	public FrameVista getFrameVista() {
		return frameVista;
	}

	public Connection getOpenConexion() {
		return openConexion;
	}

	public PnlMenuLoginControlador getMenuLoginControlador() {
		return menuLoginControlador;
	}

	public PnlMenuRegistrarUsuarioControlador getMenuRegistrarControlador() {
		return menuRegistrarControlador;
	}
}

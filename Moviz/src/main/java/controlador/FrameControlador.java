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
	private final PnlMenuAdministradorControlador menuAdministradorControlador;
	private final PnlMenuAgregarPeliculaControlador menuAgregarPeliculaControlador;
	private final PnlMenuEliminarPeliculasControlador menuEliminarPeliculasControlador;
	private final PnlMenuEliminarComentariosControlador menuEliminarComentariosControlador;

	public FrameControlador() {

		conexion = new Conexion(openConexion);
		openConexion = conexion.getOpenConexion();

		frameVista = new FrameVista();

		menuRegistrarControlador = new PnlMenuRegistrarUsuarioControlador(openConexion, this);
		menuLoginControlador = new PnlMenuLoginControlador(openConexion, this);
		menuAgregarPeliculaControlador = new PnlMenuAgregarPeliculaControlador(openConexion, this);
		menuEliminarPeliculasControlador = new PnlMenuEliminarPeliculasControlador(openConexion, this);
		menuAdministradorControlador = new PnlMenuAdministradorControlador(openConexion, this);
		menuEliminarComentariosControlador = new PnlMenuEliminarComentariosControlador(openConexion, this);
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

	public PnlMenuAdministradorControlador getMenuAdministradorControlador() {
		return menuAdministradorControlador;
	}

	public PnlMenuAgregarPeliculaControlador getMenuAgregarPeliculaControlador() {
		return menuAgregarPeliculaControlador;
	}

	public PnlMenuEliminarPeliculasControlador getMenuEliminarPeliculasControlador() {
		return menuEliminarPeliculasControlador;
	}

	public PnlMenuEliminarComentariosControlador getMenuEliminarComentariosControlador() {
		return menuEliminarComentariosControlador;
	}
}

package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Vista.FrameVista;

public class FrameControlador {

	private Connection openConexion;

	private static final String URL = "jdbc:mysql://junction.proxy.rlwy.net:22381/db_moviz";
	private static final String USER = "root";
	private static final String PASSWORD = "ShUTTFGcSybgWnDLCZYqwWSlvWMiINBK";

	private final FrameVista frameVista;

	private final PnlMenuLoginControlador menuLoginControlador;
	private final PnlMenuRegistrarUsuarioControlador menuRegistrarControlador;
	private final PnlMenuAdministradorControlador menuAdministradorControlador;
	private final PnlMenuAgregarPeliculaControlador menuAgregarPeliculaControlador;
	private final PnlMenuEliminarPeliculasControlador menuEliminarPeliculasControlador;
	private final PnlMenuEliminarComentariosControlador menuEliminarComentariosControlador;

	public FrameControlador() {

		Conectar();

		frameVista = new FrameVista();

		menuRegistrarControlador = new PnlMenuRegistrarUsuarioControlador(openConexion, this);
		menuLoginControlador = new PnlMenuLoginControlador(openConexion, this);
		menuAgregarPeliculaControlador = new PnlMenuAgregarPeliculaControlador(openConexion, this);
		menuEliminarPeliculasControlador = new PnlMenuEliminarPeliculasControlador(openConexion, this);
		menuAdministradorControlador = new PnlMenuAdministradorControlador(openConexion, this);
		menuEliminarComentariosControlador = new PnlMenuEliminarComentariosControlador(openConexion, this);
	}

	private void Conectar() {
		try {
			this.openConexion = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Conexion exitosa a la base de datos.");
		} catch (SQLException e) {
			System.out.println("Error de conexión: " + e.getMessage());
		}
	}

	public void iniciar() {
		frameVista.setLocationRelativeTo(null);
		frameVista.setVisible(true);
		menuLoginControlador.mostrar();
	}

	public Connection getOpenConexion() {
		return openConexion;
	}

	public FrameVista getFrameVista() {
		return frameVista;
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

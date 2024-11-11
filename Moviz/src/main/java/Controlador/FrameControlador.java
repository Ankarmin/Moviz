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

	private final PnlLoginControlador loginControlador;
	private final PnlRegistrarControlador registrarControlador;
	private final PnlMenuAdministradorControlador menuAdministradorControlador;
	private final PnlAgregarPeliculaControlador agregarPeliculaControlador;
	private final PnlEliminarPeliculaControlador eliminarPeliculaControlador;
	private final PnlEliminarComentarioControlador eliminarComentarioControlador;

	public FrameControlador() {

		Conectar();

		frameVista = new FrameVista();

		registrarControlador = new PnlRegistrarControlador(openConexion, this);
		loginControlador = new PnlLoginControlador(openConexion, this);
		agregarPeliculaControlador = new PnlAgregarPeliculaControlador(openConexion, this);
		eliminarPeliculaControlador = new PnlEliminarPeliculaControlador(openConexion, this);
		menuAdministradorControlador = new PnlMenuAdministradorControlador(openConexion, this);
		eliminarComentarioControlador = new PnlEliminarComentarioControlador(openConexion, this);
	}

	private void Conectar() {
		try {
			this.openConexion = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Conexion exitosa a la base de datos.");
		} catch (SQLException e) {
			System.out.println("Error de conexión: " + e.getMessage());
		}
	}

	public FrameVista getFrameVista() {
		return frameVista;
	}

	public Connection getOpenConexion() {
		return openConexion;
	}

	public void iniciar() {
		frameVista.setLocationRelativeTo(null);
		frameVista.setVisible(true);
		loginControlador.mostrar();
	}

	public PnlLoginControlador getLoginControlador() {
		return loginControlador;
	}

	public PnlAgregarPeliculaControlador getAgregarPeliculaControlador() {
		return agregarPeliculaControlador;
	}

	public PnlEliminarPeliculaControlador getEliminarPeliculaControlador() {
		return eliminarPeliculaControlador;
	}

	public PnlRegistrarControlador getRegistrarControlador() {
		return registrarControlador;
	}

	public PnlMenuAdministradorControlador getMenuAdministradorControlador() {
		return menuAdministradorControlador;
	}

	public PnlEliminarComentarioControlador getEliminarComentarioControlador() {
		return eliminarComentarioControlador;
	}
}

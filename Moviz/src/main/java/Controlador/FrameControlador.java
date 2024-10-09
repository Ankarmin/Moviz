package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Vista.FrameVista;

public class FrameControlador {

	// ATRIBUTOS DESTINADOS A CONECTARSE CON LA BASE DE DATOS
	private Connection openConexion;
	private static final String URL = "jdbc:mysql://localhost:3306/db_moviz";
	private static final String USER = "root";
	private static final String PASSWORD = "Ankarmin";

	// VISTA DEL CONTROLADOR AL INICIAR EL PROGRAMA
	private final FrameVista frameVista;

	// TODOS LOS DEMÁS CONTROLADORES
	private final PnlLoginControlador loginControlador;
	private final PnlRegistrarControlador registrarControlador;
	private final PnlMenuUsuarioControlador menuUsuarioControlador;
	private final PnlMenuAdministradorControlador menuAdministradorControlador;

	// CONSTRUCTOR DEL CONTROLADOR DEL FRAME LoginVista
	public FrameControlador() {

		// INICIALIZA CONEXION
		Conectar();

		// INSTANCIACIÓN DEL FRAME DE BIBLIOTECA
		frameVista = new FrameVista();

		// INSTANCIAMOS LOS DEMAS CONTROLADORES
		registrarControlador = new PnlRegistrarControlador(openConexion, this);
		loginControlador = new PnlLoginControlador(openConexion, this);
		menuUsuarioControlador = new PnlMenuUsuarioControlador(openConexion, this);
		menuAdministradorControlador = new PnlMenuAdministradorControlador(openConexion, this);
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

	public void iniciar() {
		frameVista.setLocationRelativeTo(null);
		frameVista.setVisible(true);
		loginControlador.mostrar();
	}

	// SE DEBE HACER RETORNOS DE LOS CONTROLADORES
	public PnlLoginControlador getLoginControlador() {
		return loginControlador;
	}

	public PnlRegistrarControlador getRegistrarControlador() {
		return registrarControlador;
	}

	public PnlMenuUsuarioControlador getMenuUsuarioControlador() {
		return menuUsuarioControlador;
	}

	public PnlMenuAdministradorControlador getMenuAdministradorControlador() {
		return menuAdministradorControlador;
	}
}

package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Vista.LoginVista;

public class FrmLoginControlador {

	// ATRIBUTOS DESTINADOS A CONECTARSE CON LA BASE DE DATOS
	private Connection openConexion;
	private static final String URL = "jdbc:mysql://localhost:3306/db_moviz";
	private static final String USER = "root";
	private static final String PASSWORD = "Ankarmin";

	// VISTA DEL CONTROLADOR AL INICIAR EL PROGRAMA
	private final LoginVista frmLogin;

	// TODOS LOS DEMÁS CONTROLADORES

	// CONSTRUCTOR DEL CONTROLADOR DEL FRAME LoginVista
	public FrmLoginControlador() {

		// INICIALIZA CONEXION
		Conectar();

		frmLogin = new LoginVista();

		// INSTANCIAMOS LOS DEMAS CONTROLADORES

		// MÉTODO QUE AGREGA EL EVENTO DE LOS BOTONES
		setEvents();
	}

	private void Conectar() {
		try {
            this.openConexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexion exitosa a la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
	}

	// MÉTODO QUE CONFIGURA LOS EVENTOS DE CLICK DE LOS BOTONES DE BIBLIOTECAVISTA
	private void setEvents() {

	}

	public void iniciar() {
		frmLogin.setLocationRelativeTo(null);
		frmLogin.setVisible(true);
	}

	// SE DEBE HACER RETORNOS DE LOS CONTROLADORES
}

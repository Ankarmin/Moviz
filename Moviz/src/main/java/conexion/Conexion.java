package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	private Connection openConexion;
	private static final String URL = "jdbc:mysql://junction.proxy.rlwy.net:22381/db_moviz";
	private static final String USER = "root";
	private static final String PASSWORD = "ShUTTFGcSybgWnDLCZYqwWSlvWMiINBK";

	public Conexion(Connection openConexion) {
		Conectar();
	}

	private void Conectar() {
		try {
			this.openConexion = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Conexion exitosa a la base de datos.");
		} catch (SQLException e) {
			System.out.println("Error de conexión: " + e.getMessage());
		}
	}

	public Connection getOpenConexion() {
		return openConexion;
	}
}

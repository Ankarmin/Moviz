package repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdministradorRepositorio {

	private Connection openConexion;
	private final String searchIdUsuarioQuery = "SELECT * FROM administrador WHERE idUsuario = ?";

	public AdministradorRepositorio(Connection openConexion) {
		this.openConexion = openConexion;
	}

	public Administrador obtenerPorIdUsuario(Integer idUsuario) {
		Administrador encontrado = null;
		try {
			ResultSet rs;
			try (PreparedStatement pst = openConexion.prepareStatement(searchIdUsuarioQuery)) {
				pst.setInt(1, idUsuario);
				rs = pst.executeQuery();
				if (rs.next()) {
					encontrado = new Administrador(rs.getInt("idAdmin"), rs.getInt("idUsuario"));
				}
			}
			rs.close();
			return encontrado;
		} catch (SQLException e) {
			System.out.println("Error al buscar administrador por idUsuario: " + e.getMessage());
			return null;
		}
	}
}

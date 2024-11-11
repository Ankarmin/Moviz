package DBRepositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class AdministradorRepositorio extends IConectar<Administrador, Integer> {

	public AdministradorRepositorio(Connection openConexion) {
		super(openConexion);
	}

	@Override
	public boolean agregar(Administrador filaNueva) {
		throw new UnsupportedOperationException("Método no implementado en AdministradorRepositorio.");
	}

	@Override
	public Administrador obtenerPorId(Integer id) {
		throw new UnsupportedOperationException("Método no implementado en AdministradorRepositorio.");
	}

	@Override
	public List<Administrador> obtenerTodos() {
		throw new UnsupportedOperationException("Método no implementado en AdministradorRepositorio.");
	}

	@Override
	public boolean actualizar(Administrador filaActualizada) {
		throw new UnsupportedOperationException("Método no implementado en AdministradorRepositorio.");
	}

	@Override
	public boolean eliminar(Integer id) {
		throw new UnsupportedOperationException("Método no implementado en AdministradorRepositorio.");
	}

	public Administrador obtenerPorIdUsuario(int idUsuario) {
		Administrador encontrado = null;
		String query = "SELECT * FROM administrador WHERE idUsuario = ?";
		try {
			ResultSet rs;
			try (PreparedStatement pst = openConexion.prepareStatement(query)) {
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

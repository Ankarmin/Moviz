package DBRepositorio;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public abstract class IConectar<T extends Entidades, I> {
	protected Connection openConexion;
	protected String insertQuery, searchIDQuery, searchAllQuery, updateRowQuery, deleteRowQuery;

	public IConectar(Connection openConexion) {
		this.openConexion = openConexion;
	}

	public void killConexion() {
		try {
			openConexion.close();
		} catch (SQLException e) {
			System.out.println("Error de desconexion: " + e.getMessage());
		}
	}

	public abstract boolean agregar(T filaNueva);

	public abstract T obtenerPorId(I id);

	public abstract List<T> obtenerTodos();

	public abstract boolean actualizar(T filaActualizada);

	public abstract boolean eliminar(I id);
}
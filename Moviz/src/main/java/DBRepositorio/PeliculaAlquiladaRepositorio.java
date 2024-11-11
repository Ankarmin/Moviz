package DBRepositorio;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PeliculaAlquiladaRepositorio extends IConectar<PeliculaAlquilada, Integer> {

	public PeliculaAlquiladaRepositorio(Connection openConexion) {
		super(openConexion);
		this.insertQuery = "INSERT INTO peliculaalquilada (idPelicula, idusuario, fechaAlquiler) VALUES (?, ?, ?)";
		this.searchIDQuery = "SELECT * FROM peliculaalquilada WHERE idPrestamo = ?";
		this.searchAllQuery = "SELECT * FROM peliculaalquilada";
		this.updateRowQuery = "UPDATE peliculaalquilada SET idPelicula = ?, idusuario = ?, fechaAlquiler = ?, fechaDevolucion = ? WHERE idPrestamo = ?";
		this.deleteRowQuery = "DELETE FROM peliculaalquilada WHERE idPrestamo = ?";
	}

	@Override
	public boolean agregar(PeliculaAlquilada filaNueva) {
		try {
			try (PreparedStatement pst = openConexion.prepareStatement(insertQuery)) {
				pst.setInt(1, filaNueva.getIdPelicula());
				pst.setInt(2, filaNueva.getIdUsuario());
				pst.setDate(3, new Date(filaNueva.getFechaAlquiler().getTime()));
				pst.executeUpdate();
			}
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	@Override
	public PeliculaAlquilada obtenerPorId(Integer id) {
		PeliculaAlquilada encontrada = null;
		try {
			ResultSet rs;
			try (PreparedStatement pst = openConexion.prepareStatement(searchIDQuery)) {
				pst.setInt(1, id);
				rs = pst.executeQuery();
				while (rs.next()) {
					encontrada = new PeliculaAlquilada();
					encontrada.setIdPrestamo(rs.getInt("idPrestamo"));
					encontrada.setIdPelicula(rs.getInt("idPelicula"));
					encontrada.setIdUsuario(rs.getInt("idusuario"));
					encontrada.setFechaAlquiler(rs.getDate("fechaAlquiler"));
					encontrada.setFechaDevolucion(rs.getDate("fechaDevolucion"));
				}
			}
			rs.close();
			return encontrada;
		} catch (SQLException e) {
			return encontrada;
		}
	}

	@Override
	public List<PeliculaAlquilada> obtenerTodos() {
		List<PeliculaAlquilada> peliculasAlquiladas = new ArrayList<>();
		try {
			ResultSet rs;
			try (PreparedStatement pst = openConexion.prepareStatement(searchAllQuery)) {
				rs = pst.executeQuery();
				while (rs.next()) {
					PeliculaAlquilada peliculaAlquilada = new PeliculaAlquilada(rs.getInt("idPrestamo"),
							rs.getInt("idPelicula"), rs.getInt("idusuario"), rs.getDate("fechaAlquiler"),
							rs.getDate("fechaDevolucion"));
					peliculasAlquiladas.add(peliculaAlquilada);
				}
			}
			rs.close();
		} catch (SQLException e) {
		}
		return peliculasAlquiladas.isEmpty() ? new ArrayList<>() : peliculasAlquiladas;
	}

	@Override
	public boolean actualizar(PeliculaAlquilada filaActualizada) {
		throw new UnsupportedOperationException("Método no implementado en PeliculaAlquiladaRepositorio.");
	}

	@Override
	public boolean eliminar(Integer id) {
		try {
			try (PreparedStatement pst = openConexion.prepareStatement(deleteRowQuery)) {
				pst.setInt(1, id);
				pst.executeUpdate();
			}
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	public boolean esAlquilada(int idPelicula, int idUsuario) {
		String query = "SELECT * FROM peliculaalquilada WHERE idPelicula = ? AND idUsuario = ?";
		try (PreparedStatement pst = openConexion.prepareStatement(query)) {
			pst.setInt(1, idPelicula);
			pst.setInt(2, idUsuario);
			try (ResultSet rs = pst.executeQuery()) {
				return rs.next();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean limiteAlquiler(int idUsuario) {
		String query = "SELECT COUNT(*) FROM peliculaalquilada WHERE idUsuario = ?";
		try (PreparedStatement pst = openConexion.prepareStatement(query)) {
			pst.setInt(1, idUsuario);
			try (ResultSet rs = pst.executeQuery()) {
				if (rs.next()) {
					int conteoAlquileres = rs.getInt(1);
					return conteoAlquileres > 1;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}

package DBRepositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PeliculaFavoritaRepositorio extends IConectar<PeliculaFavorita, Integer> {

	public PeliculaFavoritaRepositorio(Connection openConexion) {
		super(openConexion);
		this.insertQuery = "INSERT INTO peliculafavorita (idPelicula, idUsuario) VALUES (?, ?)";
		this.searchIDQuery = "SELECT * FROM peliculafavorita WHERE idPeliculaFavorita = ?";
		this.searchAllQuery = "SELECT * FROM peliculafavorita";
		this.updateRowQuery = "UPDATE peliculafavorita SET idPelicula = ?, idUsuario = ? WHERE idPeliculaFavorita = ?";
		this.deleteRowQuery = "DELETE FROM peliculafavorita WHERE idPeliculaFavorita = ?";
	}

	@Override
	public boolean agregar(PeliculaFavorita filaNueva) {
		try {
			try (PreparedStatement pst = openConexion.prepareStatement(insertQuery)) {
				pst.setInt(1, filaNueva.getIdPelicula());
				pst.setInt(2, filaNueva.getIdUsuario());
				pst.executeUpdate();
			}
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	@Override
	public PeliculaFavorita obtenerPorId(Integer id) {
		PeliculaFavorita encontrada = null;
		try {
			ResultSet rs;
			try (PreparedStatement pst = openConexion.prepareStatement(searchIDQuery)) {
				pst.setInt(1, id);
				rs = pst.executeQuery();
				while (rs.next()) {
					encontrada = new PeliculaFavorita();
					encontrada.setIdPeliculaFavorita(rs.getInt("idPeliculaFavorita"));
					encontrada.setIdPelicula(rs.getInt("idPelicula"));
					encontrada.setIdUsuario(rs.getInt("idUsuario"));
				}
			}
			rs.close();
			return encontrada;
		} catch (SQLException e) {
			return encontrada;
		}
	}

	@Override
	public List<PeliculaFavorita> obtenerTodos() {
		List<PeliculaFavorita> PeliculaFavoritas = new ArrayList<>();
		try {
			ResultSet rs;
			try (PreparedStatement pst = openConexion.prepareStatement(searchAllQuery)) {
				rs = pst.executeQuery();
				while (rs.next()) {
					PeliculaFavorita PeliculaFavorita = new PeliculaFavorita(rs.getInt("idPeliculaFavorita"),
							rs.getInt("idPelicula"), rs.getInt("idUsuario"));
					PeliculaFavoritas.add(PeliculaFavorita);
				}
			}
			rs.close();
		} catch (SQLException e) {
		}
		return PeliculaFavoritas.isEmpty() ? new ArrayList<>() : PeliculaFavoritas;
	}

	@Override
	public boolean actualizar(PeliculaFavorita filaActualizada) {
		throw new UnsupportedOperationException("Método no implementado en PeliculaFavoritaRepositorio.");
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

	public boolean esFavorita(int idPelicula, int idUsuario) {
		String query = "SELECT * FROM peliculafavorita WHERE idPelicula = ? AND idUsuario = ?";
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

	public PeliculaFavorita obtenerPorUsuarioYPelicula(int idPelicula, int idUsuario) {
		PeliculaFavorita peliculaFavorita = null;
		String query = "SELECT * FROM peliculafavorita WHERE idPelicula = ? AND idUsuario = ?";
		try (PreparedStatement pst = openConexion.prepareStatement(query)) {
			pst.setInt(1, idPelicula);
			pst.setInt(2, idUsuario);
			try (ResultSet rs = pst.executeQuery()) {
				if (rs.next()) {
					peliculaFavorita = new PeliculaFavorita();
					peliculaFavorita.setIdPeliculaFavorita(rs.getInt("idPeliculaFavorita"));
					peliculaFavorita.setIdPelicula(rs.getInt("idPelicula"));
					peliculaFavorita.setIdUsuario(rs.getInt("idUsuario"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return peliculaFavorita;
	}

	public Pelicula obtenerPeliculaPorId(int id) {
		Pelicula encontrada = null;
		String query = "SELECT * FROM pelicula WHERE idPelicula = ?";
		try {
			ResultSet rs;
			try (PreparedStatement pst = openConexion.prepareStatement(query)) {
				pst.setInt(1, id);
				rs = pst.executeQuery();
				while (rs.next()) {
					encontrada = new Pelicula();
					encontrada.setIdPelicula(rs.getInt("idPelicula"));
					encontrada.setNombre(rs.getString("nombre"));
					encontrada.setAnioEstreno(rs.getInt("añoEstreno"));
					encontrada.setGenero(rs.getString("genero"));
					encontrada.setDuracion(rs.getString("duracion"));
					encontrada.setPuntuacion(rs.getInt("puntuacion"));
					encontrada.setSinopsis(rs.getString("sinopsis"));
					encontrada.setImagen(rs.getBinaryStream("imagen"));
				}
			}
			rs.close();
			return encontrada;
		} catch (SQLException e) {
			return encontrada;
		}
	}
}

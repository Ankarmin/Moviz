package repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PeliculaFavoritaRepositorio {

	private Connection openConexion;
	private final String insertQuery = "INSERT INTO peliculafavorita (idPelicula, idUsuario) VALUES (?, ?)";
	private final String deleteRowQuery = "DELETE FROM peliculafavorita WHERE idPeliculaFavorita = ?";
	private final String searchIdPeliculaAndIdUsuarioQuery = "SELECT * FROM peliculafavorita WHERE idPelicula = ? AND idUsuario = ?";
	private final String searchIdPeliculaQuery = "SELECT * FROM pelicula WHERE idPelicula = ?";
	private final String searchAllIdUsuarioQuery = "SELECT * FROM peliculafavorita WHERE idUsuario = ?";

	public PeliculaFavoritaRepositorio(Connection openConexion) {
		this.openConexion = openConexion;

	}

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

	public boolean esFavorita(Integer idPelicula, Integer idUsuario) {
		try (PreparedStatement pst = openConexion.prepareStatement(searchIdPeliculaAndIdUsuarioQuery)) {
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

	public PeliculaFavorita obtenerPorUsuarioYPelicula(Integer idPelicula, Integer idUsuario) {
		PeliculaFavorita peliculaFavorita = null;
		try (PreparedStatement pst = openConexion.prepareStatement(searchIdPeliculaAndIdUsuarioQuery)) {
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

	public Pelicula obtenerPeliculaPorId(Integer id) {
		Pelicula encontrada = null;
		try {
			ResultSet rs;
			try (PreparedStatement pst = openConexion.prepareStatement(searchIdPeliculaQuery)) {
				pst.setInt(1, id);
				rs = pst.executeQuery();
				while (rs.next()) {
					encontrada = new Pelicula();
					encontrada.setIdPelicula(rs.getInt("idPelicula"));
					encontrada.setNombre(rs.getString("nombre"));
					encontrada.setAnioEstreno(rs.getInt("añoEstreno"));
					encontrada.setGenero(rs.getString("genero"));
					encontrada.setDuracion(rs.getString("duracion"));
					encontrada.setPuntuacion(rs.getBigDecimal("puntuacion"));
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

	public List<PeliculaFavorita> obtenerTodosPorIdUsuario(Integer id) {
		List<PeliculaFavorita> PeliculaFavoritas = new ArrayList<>();
		try {
			ResultSet rs;
			try (PreparedStatement pst = openConexion.prepareStatement(searchAllIdUsuarioQuery)) {
				pst.setInt(1, id);
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
}

package repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ComentarioRepositorio {

	private Connection openConexion;

	private final String insertQuery = "INSERT INTO comentario (idPelicula, user, comentario, puntuacion) VALUES (?, ?, ?, ?)";
	private final String searchIdPeliculaQuery = "SELECT * FROM comentario WHERE idPelicula = ?";
	private final String deleteRowQuery = "DELETE FROM comentario WHERE idComentario = ?";

	public ComentarioRepositorio(Connection openConexion) {
		this.openConexion = openConexion;
	}

	public boolean agregar(Comentario filaNueva) {
		try {
			try (PreparedStatement pst = openConexion.prepareStatement(insertQuery)) {
				pst.setInt(1, filaNueva.getIdPelicula());
				pst.setString(2, filaNueva.getUser());
				pst.setString(3, filaNueva.getComentario());
				pst.setInt(4, filaNueva.getPuntuacion());
				pst.executeUpdate();
			}
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	public List<Comentario> obtenerComentariosPelicula(Integer id) {
		List<Comentario> comentarios = new ArrayList<>();
		try {
			ResultSet rs;
			try (PreparedStatement pst = openConexion.prepareStatement(searchIdPeliculaQuery)) {
				pst.setInt(1, id);
				rs = pst.executeQuery();
				while (rs.next()) {
					Comentario comentario = new Comentario(rs.getInt("idComentario"), rs.getInt("idPelicula"),
							rs.getString("user"), rs.getString("comentario"), rs.getInt("puntuacion"));
					comentarios.add(comentario);
				}
			}
			rs.close();
		} catch (SQLException e) {
		}
		return comentarios.isEmpty() ? new ArrayList<>() : comentarios;
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
}

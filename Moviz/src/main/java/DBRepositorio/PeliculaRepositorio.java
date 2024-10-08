package DBRepositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PeliculaRepositorio extends IConectar<Pelicula, Integer> {

	public PeliculaRepositorio(Connection openConexion) {
		super(openConexion);
		this.insertQuery = "INSERT INTO pelicula (idPelicula, nombre, añoEstreno, genero, duracion, puntuacion, sinopsis, imagen) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		this.searchIDQuery = "SELECT * FROM pelicula WHERE idPelicula = ?";
		this.searchAllQuery = "SELECT * FROM pelicula";
		this.updateRowQuery = "UPDATE pelicula SET nombre = ?, añoEstreno = ?, genero = ?, duracion = ?, puntuacion = ?, sinopsis = ?, imagen = ? WHERE idPelicula = ?";
		this.deleteRowQuery = "DELETE FROM pelicula WHERE idPelicula = ?";
	}

	@Override
	public boolean agregar(Pelicula filaNueva) {
		try {
			try (PreparedStatement pst = conexion.prepareStatement(insertQuery)) {
				pst.setInt(1, filaNueva.getIdPelicula());
				pst.setString(2, filaNueva.getNombre());
				pst.setInt(3, filaNueva.getAñoEstreno());
				pst.setString(4, filaNueva.getGenero());
				pst.setString(5, filaNueva.getDuracion());
				pst.setInt(6, filaNueva.getPuntuacion());
				pst.setString(7, filaNueva.getSinopsis());
				pst.setBytes(8, filaNueva.getImagen());
				pst.executeUpdate();
			}
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	@Override
	public Pelicula obtenerPorId(Integer id) {
		Pelicula encontrada = null;
		try {
			ResultSet rs;
			try (PreparedStatement pst = conexion.prepareStatement(searchIDQuery)) {
				pst.setInt(1, id);
				rs = pst.executeQuery();
				while (rs.next()) {
					encontrada = new Pelicula();
					encontrada.setIdPelicula(rs.getInt("idPelicula"));
					encontrada.setNombre(rs.getString("nombre"));
					encontrada.setAñoEstreno(rs.getInt("añoEstreno"));
					encontrada.setGenero(rs.getString("genero"));
					encontrada.setDuracion(rs.getString("duracion"));
					encontrada.setPuntuacion(rs.getInt("puntuacion"));
					encontrada.setSinopsis(rs.getString("sinopsis"));
					encontrada.setImagen(rs.getBytes("imagen"));
				}
			}
			rs.close();
			return encontrada;
		} catch (SQLException e) {
			return encontrada;
		}
	}

	@Override
	public List<Pelicula> obtenerTodos() {
		List<Pelicula> peliculas = new ArrayList<>();
		try {
			ResultSet rs;
			try (PreparedStatement pst = conexion.prepareStatement(searchAllQuery)) {
				rs = pst.executeQuery();
				while (rs.next()) {
					Pelicula pelicula = new Pelicula(rs.getInt("idPelicula"), rs.getString("nombre"),
							rs.getInt("añoEstreno"), rs.getString("genero"), rs.getString("duracion"),
							rs.getInt("puntuacion"), rs.getString("sinopsis"), rs.getBytes("imagen"));
					peliculas.add(pelicula);
				}
			}
			rs.close();
		} catch (SQLException e) {
		}
		return peliculas.isEmpty() ? new ArrayList<>() : peliculas;
	}

	@Override
	public boolean actualizar(Pelicula filaActualizada) {
		try {
			try (PreparedStatement pst = conexion.prepareStatement(updateRowQuery)) {
				pst.setString(1, filaActualizada.getNombre());
				pst.setInt(2, filaActualizada.getAñoEstreno());
				pst.setString(3, filaActualizada.getGenero());
				pst.setString(4, filaActualizada.getDuracion());
				pst.setInt(5, filaActualizada.getPuntuacion());
				pst.setString(6, filaActualizada.getSinopsis());
				pst.setBytes(7, filaActualizada.getImagen());
				pst.setInt(8, filaActualizada.getIdPelicula());
				pst.executeUpdate();
			}
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	@Override
	public boolean eliminar(Integer id) {
		try {
			try (PreparedStatement pst = conexion.prepareStatement(deleteRowQuery)) {
				pst.setInt(1, id);
				pst.executeUpdate();
			}
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
}

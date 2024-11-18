package repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PeliculaRepositorio {

	private Connection openConexion;
	private final String insertQuery = "INSERT INTO pelicula (nombre, añoEstreno, genero, duracion, sinopsis, imagen) VALUES (?, ?, ?, ?, ?, ?)";
	private final String searchIDQuery = "SELECT * FROM pelicula WHERE idPelicula = ?";
	private final String searchAllQuery = "SELECT * FROM pelicula";
	private final String updateRowQuery = "UPDATE pelicula SET nombre = ?, añoEstreno = ?, genero = ?, duracion = ?, puntuacion = ?, sinopsis = ?, imagen = ? WHERE idPelicula = ?";
	private final String deleteRowQuery = "DELETE FROM pelicula WHERE idPelicula = ?";
	private final String yearsIntervalQuery = "SELECT * FROM pelicula WHERE añoEstreno BETWEEN ? AND ?";
	private final String searchGenreQuery = "SELECT * FROM pelicula WHERE genero = ?";
	private final String searchRatingIntervalQuery = "SELECT * FROM pelicula WHERE puntuacion BETWEEN ? AND ?";
	private final String searchMoviesQuery = "SELECT * FROM pelicula WHERE nombre LIKE ?";
	private final String searchTitlesQuery = "SELECT idPelicula, nombre FROM pelicula";
	private final String searchTitlesSimilaryQuery = "SELECT idPelicula, nombre FROM pelicula WHERE nombre LIKE ?";

	public PeliculaRepositorio(Connection openConexion) {
		this.openConexion = openConexion;
	}

	public boolean agregar(Pelicula filaNueva) {
		try {
			try (PreparedStatement pst = openConexion.prepareStatement(insertQuery)) {
				pst.setString(1, filaNueva.getNombre());
				pst.setInt(2, filaNueva.getAnioEstreno());
				pst.setString(3, filaNueva.getGenero());
				pst.setString(4, filaNueva.getDuracion());
				pst.setString(5, filaNueva.getSinopsis());
				pst.setBinaryStream(6, filaNueva.getImagen());
				pst.executeUpdate();
			}
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	public Pelicula obtenerPorId(Integer id) {
		Pelicula encontrada = null;
		try {
			ResultSet rs;
			try (PreparedStatement pst = openConexion.prepareStatement(searchIDQuery)) {
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

	public List<Pelicula> obtenerTodos() {
		List<Pelicula> peliculas = new ArrayList<>();
		try {
			ResultSet rs;
			try (PreparedStatement pst = openConexion.prepareStatement(searchAllQuery)) {
				rs = pst.executeQuery();
				while (rs.next()) {
					Pelicula pelicula = new Pelicula(rs.getInt("idPelicula"), rs.getString("nombre"),
							rs.getInt("añoEstreno"), rs.getString("genero"), rs.getString("duracion"),
							rs.getBigDecimal("puntuacion"), rs.getString("sinopsis"), rs.getBinaryStream("imagen"));
					peliculas.add(pelicula);
				}
			}
			rs.close();
		} catch (SQLException e) {
		}
		return peliculas.isEmpty() ? new ArrayList<>() : peliculas;
	}

	public boolean actualizar(Pelicula filaActualizada) {
		try {
			try (PreparedStatement pst = openConexion.prepareStatement(updateRowQuery)) {
				pst.setString(1, filaActualizada.getNombre());
				pst.setInt(2, filaActualizada.getAnioEstreno());
				pst.setString(3, filaActualizada.getGenero());
				pst.setString(4, filaActualizada.getDuracion());
				pst.setBigDecimal(5, filaActualizada.getPuntuacion());
				pst.setString(6, filaActualizada.getSinopsis());
				pst.setBinaryStream(7, filaActualizada.getImagen());
				pst.setInt(8, filaActualizada.getIdPelicula());
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

	public List<Pelicula> obtenerPorAnio(Integer anioInicio, Integer anioFin) {
		List<Pelicula> peliculas = new ArrayList<>();
		try {
			ResultSet rs;
			try (PreparedStatement pst = openConexion.prepareStatement(yearsIntervalQuery)) {
				pst.setInt(1, anioInicio);
				pst.setInt(2, anioFin);
				rs = pst.executeQuery();
				while (rs.next()) {
					Pelicula pelicula = new Pelicula(rs.getInt("idPelicula"), rs.getString("nombre"),
							rs.getInt("añoEstreno"), rs.getString("genero"), rs.getString("duracion"),
							rs.getBigDecimal("puntuacion"), rs.getString("sinopsis"), rs.getBinaryStream("imagen"));
					peliculas.add(pelicula);
				}
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return peliculas;
	}

	public List<Pelicula> obtenerPorGenero(String genero) {
		List<Pelicula> peliculas = new ArrayList<>();
		try {
			ResultSet rs;
			try (PreparedStatement pst = openConexion.prepareStatement(searchGenreQuery)) {
				pst.setString(1, genero);
				rs = pst.executeQuery();
				while (rs.next()) {
					Pelicula pelicula = new Pelicula(rs.getInt("idPelicula"), rs.getString("nombre"),
							rs.getInt("añoEstreno"), rs.getString("genero"), rs.getString("duracion"),
							rs.getBigDecimal("puntuacion"), rs.getString("sinopsis"), rs.getBinaryStream("imagen"));
					peliculas.add(pelicula);
				}
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return peliculas;
	}

	public List<Pelicula> obtenerPorPuntuacion(Integer puntuacionMin, Integer puntuacionMax) {
		List<Pelicula> peliculas = new ArrayList<>();
		try {
			ResultSet rs;
			try (PreparedStatement pst = openConexion.prepareStatement(searchRatingIntervalQuery)) {
				pst.setInt(1, puntuacionMin);
				pst.setInt(2, puntuacionMax);
				rs = pst.executeQuery();
				while (rs.next()) {
					Pelicula pelicula = new Pelicula(rs.getInt("idPelicula"), rs.getString("nombre"),
							rs.getInt("añoEstreno"), rs.getString("genero"), rs.getString("duracion"),
							rs.getBigDecimal("puntuacion"), rs.getString("sinopsis"), rs.getBinaryStream("imagen"));
					peliculas.add(pelicula);
				}
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return peliculas;
	}

	public List<Pelicula> busquedaPeliculas(String busqueda) {
		List<Pelicula> peliculas = new ArrayList<>();
		try {
			ResultSet rs;
			try (PreparedStatement pst = openConexion.prepareStatement(searchMoviesQuery)) {
				pst.setString(1, "%" + busqueda + "%");
				rs = pst.executeQuery();
				while (rs.next()) {
					Pelicula pelicula = new Pelicula(rs.getInt("idPelicula"), rs.getString("nombre"),
							rs.getInt("añoEstreno"), rs.getString("genero"), rs.getString("duracion"),
							rs.getBigDecimal("puntuacion"), rs.getString("sinopsis"), rs.getBinaryStream("imagen"));
					peliculas.add(pelicula);
				}
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return peliculas;
	}

	public List<Pelicula> listaTitulos() {
		List<Pelicula> peliculas = new ArrayList<>();
		try {
			ResultSet rs;
			try (PreparedStatement pst = openConexion.prepareStatement(searchTitlesQuery)) {
				rs = pst.executeQuery();
				while (rs.next()) {
					Pelicula pelicula = new Pelicula();
					pelicula.setIdPelicula(rs.getInt("idPelicula"));
					pelicula.setNombre(rs.getString("nombre"));
					peliculas.add(pelicula);
				}
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return peliculas;
	}

	public List<Pelicula> listaTituloBusqueda(String busqueda) {
		List<Pelicula> peliculas = new ArrayList<>();
		try {
			ResultSet rs;
			try (PreparedStatement pst = openConexion.prepareStatement(searchTitlesSimilaryQuery)) {
				pst.setString(1, "%" + busqueda + "%");
				rs = pst.executeQuery();
				while (rs.next()) {
					Pelicula pelicula = new Pelicula();
					pelicula.setIdPelicula(rs.getInt("idPelicula"));
					pelicula.setNombre(rs.getString("nombre"));
					peliculas.add(pelicula);
				}
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return peliculas;
	}
}

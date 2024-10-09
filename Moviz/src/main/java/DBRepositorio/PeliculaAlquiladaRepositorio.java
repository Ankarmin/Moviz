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
		this.insertQuery = "INSERT INTO peliculaalquilada (idPelicula, usuario, fechaAlquiler, fechaDevolucion) VALUES (?, ?, ?, ?)";
		this.searchIDQuery = "SELECT * FROM peliculaalquilada WHERE idPrestamo = ?";
		this.searchAllQuery = "SELECT * FROM peliculaalquilada";
		this.updateRowQuery = "UPDATE peliculaalquilada SET idPelicula = ?, usuario = ?, fechaAlquiler = ?, fechaDevolucion = ? WHERE idPrestamo = ?";
		this.deleteRowQuery = "DELETE FROM peliculaalquilada WHERE idPrestamo = ?";
	}

	@Override
	public boolean agregar(PeliculaAlquilada filaNueva) {
		try {
			try (PreparedStatement pst = conexion.prepareStatement(insertQuery)) {
				pst.setInt(1, filaNueva.getIdPelicula());
				pst.setString(2, filaNueva.getUsuario());
				pst.setDate(3, new Date(filaNueva.getFechaAlquiler().getTime()));
				pst.setDate(4, new Date(filaNueva.getFechaDevolucion().getTime()));
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
			try (PreparedStatement pst = conexion.prepareStatement(searchIDQuery)) {
				pst.setInt(1, id);
				rs = pst.executeQuery();
				while (rs.next()) {
					encontrada = new PeliculaAlquilada();
					encontrada.setIdPrestamo(rs.getInt("idPrestamo"));
					encontrada.setIdPelicula(rs.getInt("idPelicula"));
					encontrada.setUsuario(rs.getString("usuario"));
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
			try (PreparedStatement pst = conexion.prepareStatement(searchAllQuery)) {
				rs = pst.executeQuery();
				while (rs.next()) {
					PeliculaAlquilada peliculaAlquilada = new PeliculaAlquilada(rs.getInt("idPrestamo"),
							rs.getInt("idPelicula"), rs.getString("usuario"), rs.getDate("fechaAlquiler"),
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
		try {
			try (PreparedStatement pst = conexion.prepareStatement(updateRowQuery)) {
				pst.setInt(1, filaActualizada.getIdPelicula());
				pst.setString(2, filaActualizada.getUsuario());
				pst.setDate(3, new Date(filaActualizada.getFechaAlquiler().getTime()));
				pst.setDate(4, new Date(filaActualizada.getFechaDevolucion().getTime()));
				pst.setInt(5, filaActualizada.getIdPrestamo());
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

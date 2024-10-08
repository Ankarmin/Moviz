package DBRepositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorio extends IConectar<Usuario, Integer> {

	public UsuarioRepositorio(Connection openConexion) {
		super(openConexion);
		this.insertQuery = "INSERT INTO usuario (id, user, password) VALUES (?, ?, ?)";
		this.searchIDQuery = "SELECT * FROM usuario WHERE id = ?";
		this.searchAllQuery = "SELECT * FROM usuario";
		this.updateRowQuery = "UPDATE usuario SET user = ?, password = ? WHERE id = ?";
		this.deleteRowQuery = "DELETE FROM usuario WHERE id = ?";
	}

	@Override
	public boolean agregar(Usuario filaNueva) {
		try {
			try (PreparedStatement pst = conexion.prepareStatement(insertQuery)) {
				pst.setInt(1, filaNueva.getId());
				pst.setString(2, filaNueva.getUser());
				pst.setString(3, filaNueva.getPassword());
				pst.executeUpdate();
			}
			System.out.println("Usuario registrado con exito en la BD");
			return true;
		} catch (SQLException e) {
			System.out.println("Error al registrar en la BD: " + e.getMessage());
			return false;
		}
	}

	@Override
	public Usuario obtenerPorId(Integer id) {
		Usuario encontrado = null;
		try {
			ResultSet rs;
			try (PreparedStatement pst = conexion.prepareStatement(searchIDQuery)) {
				pst.setInt(1, id);
				rs = pst.executeQuery();
				while (rs.next()) {
					encontrado = new Usuario();
					encontrado.setId(rs.getInt("id"));
					encontrado.setUser(rs.getString("user"));
					encontrado.setPassword(rs.getString("password"));
				}
			}
			rs.close();
			System.out.println("El Usuario ha sido encontrado");
			return encontrado;
		} catch (SQLException e) {
			System.out.println("Error al buscar al Usuario: " + e.getMessage());
			return encontrado;
		}
	}

	@Override
	public List<Usuario> obtenerTodos() {
		List<Usuario> usuarios = new ArrayList<>();
		try {
			ResultSet rs;
			try (PreparedStatement pst = conexion.prepareStatement(searchAllQuery)) {
				rs = pst.executeQuery();
				while (rs.next()) {
					Usuario usuario = new Usuario(rs.getInt("id"), rs.getString("user"), rs.getString("password"));
					usuarios.add(usuario);
				}
				System.out.println("Usuarios recolectados");
			}
			rs.close();
		} catch (SQLException e) {
			System.out.println("Error al recopilar usuarios: " + e.getMessage());
		}
		return usuarios.isEmpty() ? new ArrayList<>() : usuarios;
	}

	@Override
	public boolean actualizar(Usuario filaActualizada) {
		try {
			try (PreparedStatement pst = conexion.prepareStatement(updateRowQuery)) {
				pst.setString(1, filaActualizada.getUser());
				pst.setString(2, filaActualizada.getPassword());
				pst.executeUpdate();
			}
			System.out.println("Fila actualizada");
			return true;
		} catch (SQLException e) {
			System.out.println("No se pudo actualizar la fila: " + e.getMessage());
			return false;
		}
	}

	@Override
	public boolean eliminar(Integer id) {
		try {
			try (PreparedStatement pst = conexion.prepareStatement(deleteRowQuery)) {
				pst.setInt(1, id);
				pst.executeUpdate();
				System.out.println("Fila eliminada con exito");
			}
			return true;
		} catch (SQLException e) {
			System.out.println("No se pudo eliminar la fila: " + e.getMessage());
			return false;
		}
	}
}

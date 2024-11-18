package repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorio {

	private Connection openConexion;
	private final String insertQuery = "INSERT INTO usuario (user, password) VALUES (?, ?)";
	private final String searchIDQuery = "SELECT * FROM usuario WHERE id = ?";
	private final String searchAllQuery = "SELECT * FROM usuario";
	private final String searchUserAndPasswordQuery = "SELECT * FROM usuario WHERE user = ? AND password = ?";

	public UsuarioRepositorio(Connection openConexion) {
		this.openConexion = openConexion;

	}

	public boolean agregar(Usuario filaNueva) {
		try {
			try (PreparedStatement pst = openConexion.prepareStatement(insertQuery,
					PreparedStatement.RETURN_GENERATED_KEYS)) {
				pst.setString(1, filaNueva.getUser());
				pst.setString(2, filaNueva.getPassword());
				pst.executeUpdate();

				try (ResultSet generatedKeys = pst.getGeneratedKeys()) {
					if (generatedKeys.next()) {
						int generatedId = generatedKeys.getInt(1);
						filaNueva.setId(generatedId);
					}
				}
			}
			System.out.println("Usuario registrado con éxito en la BD");
			return true;
		} catch (SQLException e) {
			System.out.println("Error al registrar en la BD: " + e.getMessage());
			return false;
		}
	}

	public Usuario obtenerPorId(Integer id) {
		Usuario encontrado = null;
		try {
			ResultSet rs;
			try (PreparedStatement pst = openConexion.prepareStatement(searchIDQuery)) {
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

	public List<Usuario> obtenerTodos() {
		List<Usuario> usuarios = new ArrayList<>();
		try {
			ResultSet rs;
			try (PreparedStatement pst = openConexion.prepareStatement(searchAllQuery)) {
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

	public Usuario obtenerPorUsuarioYPassword(String username, String password) {
		Usuario encontrado = null;
		try {
			ResultSet rs;
			try (PreparedStatement pst = openConexion.prepareStatement(searchUserAndPasswordQuery)) {
				pst.setString(1, username);
				pst.setString(2, password);
				rs = pst.executeQuery();
				if (rs.next()) {
					encontrado = new Usuario();
					encontrado.setId(rs.getInt("id"));
					encontrado.setUser(rs.getString("user"));
					encontrado.setPassword(rs.getString("password"));
				}
			}
			rs.close();
			return encontrado;
		} catch (SQLException e) {
			System.out.println("Error al buscar por username y password: " + e.getMessage());
			return null;
		}
	}
}

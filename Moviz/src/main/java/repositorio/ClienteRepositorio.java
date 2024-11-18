package repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepositorio {

	private Connection openConexion;

	private final String insertQuery = "INSERT INTO cliente (idUsuario, email) VALUES (?, ?)";
	private final String searchIDQuery = "SELECT * FROM cliente WHERE idCliente = ?";
	private final String searchAllQuery = "SELECT * FROM cliente";
	private final String searchIdUsuarioQuery = "SELECT * FROM cliente WHERE idUsuario = ?";

	public ClienteRepositorio(Connection openConexion) {
		this.openConexion = openConexion;
	}

	public boolean agregar(Cliente filaNueva) {
		try {
			try (PreparedStatement pst = openConexion.prepareStatement(insertQuery)) {
				pst.setInt(1, filaNueva.getIdUsuario());
				pst.setString(2, filaNueva.getEmail());
				pst.executeUpdate();
			}
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	public Cliente obtenerPorId(Integer id) {
		Cliente encontrado = null;
		try {
			ResultSet rs;
			try (PreparedStatement pst = openConexion.prepareStatement(searchIDQuery)) {
				pst.setInt(1, id);
				rs = pst.executeQuery();
				while (rs.next()) {
					encontrado = new Cliente();
					encontrado.setIdCliente(rs.getInt("idCliente"));
					encontrado.setIdUsuario(rs.getInt("idUsuario"));
					encontrado.setEmail(rs.getString("email"));
				}
			}
			rs.close();
			return encontrado;
		} catch (SQLException e) {
			return encontrado;
		}
	}

	public List<Cliente> obtenerTodos() {
		List<Cliente> clientes = new ArrayList<>();
		try {
			ResultSet rs;
			try (PreparedStatement pst = openConexion.prepareStatement(searchAllQuery)) {
				rs = pst.executeQuery();
				while (rs.next()) {
					Cliente cliente = new Cliente(rs.getInt("idCliente"), rs.getInt("idUsuario"),
							rs.getString("email"));
					clientes.add(cliente);
				}
			}
			rs.close();
		} catch (SQLException e) {
		}
		return clientes.isEmpty() ? new ArrayList<>() : clientes;
	}

	public Cliente obtenerPorIdUsuario(Integer idUsuario) {
		Cliente encontrado = null;
		try {
			ResultSet rs;
			try (PreparedStatement pst = openConexion.prepareStatement(searchIdUsuarioQuery)) {
				pst.setInt(1, idUsuario);
				rs = pst.executeQuery();
				if (rs.next()) {
					encontrado = new Cliente(rs.getInt("idCliente"), rs.getInt("idUsuario"), rs.getString("email"));
				}
			}
			rs.close();
			return encontrado;
		} catch (SQLException e) {
			return null;
		}
	}
}

package DBRepositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepositorio extends IConectar<Cliente, Integer> {

	public ClienteRepositorio(Connection openConexion) {
		super(openConexion);
		this.insertQuery = "INSERT INTO cliente (idCliente, idUsuario, email) VALUES (?, ?, ?)";
		this.searchIDQuery = "SELECT * FROM cliente WHERE idCliente = ?";
		this.searchAllQuery = "SELECT * FROM cliente";
		this.updateRowQuery = "UPDATE cliente SET idUsuario = ?, email = ? WHERE idCliente = ?";
		this.deleteRowQuery = "DELETE FROM cliente WHERE idCliente = ?";
	}

	@Override
	public boolean agregar(Cliente filaNueva) {
		try {
			try (PreparedStatement pst = conexion.prepareStatement(insertQuery)) {
				pst.setInt(1, filaNueva.getIdCliente());
				pst.setInt(2, filaNueva.getIdUsuario());
				pst.setString(3, filaNueva.getEmail());
				pst.executeUpdate();
			}
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	@Override
	public Cliente obtenerPorId(Integer id) {
		Cliente encontrado = null;
		try {
			ResultSet rs;
			try (PreparedStatement pst = conexion.prepareStatement(searchIDQuery)) {
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

	@Override
	public List<Cliente> obtenerTodos() {
		List<Cliente> clientes = new ArrayList<>();
		try {
			ResultSet rs;
			try (PreparedStatement pst = conexion.prepareStatement(searchAllQuery)) {
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

	@Override
	public boolean actualizar(Cliente filaActualizada) {
		try {
			try (PreparedStatement pst = conexion.prepareStatement(updateRowQuery)) {
				pst.setInt(1, filaActualizada.getIdUsuario());
				pst.setString(2, filaActualizada.getEmail());
				pst.setInt(3, filaActualizada.getIdCliente());
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

package DBRepositorio;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Entidades {

	private int idCliente;
	private int idUsuario;
	private String email;

	public Cliente() {
	}

	public Cliente(int idCliente, int idUsuario, String email) {
		this.idCliente = idCliente;
		this.idUsuario = idUsuario;
		this.email = email;
	}

	@Override
	public Object[] toArray() {
		return new Object[] { getIdCliente(), getIdUsuario(), getEmail() };
	}

	public static Cliente toCliente(List<Object> datos) {
		return new Cliente((Integer) datos.get(0), (Integer) datos.get(1), (String) datos.get(2));
	}

	public static List<String> getColumnas() {
		List<String> columnas = new ArrayList<>();
		columnas.add("Id Cliente");
		columnas.add("Id Usuario");
		columnas.add("Email");
		return columnas;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String phoneNumber) {
		this.email = phoneNumber;
	}
}

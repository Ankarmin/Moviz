package DBRepositorio;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Entidades {

	private int idCliente;
	private int idUsuario;
	private String phoneNumber;

	public Cliente() {
	}

	public Cliente(int idCliente, int idUsuario, String phoneNumber) {
		this.idCliente = idCliente;
		this.idUsuario = idUsuario;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public Object[] toArray() {
		return new Object[] { getIdCliente(), getIdUsuario(), getPhoneNumber() };
	}

	public static Cliente toCliente(List<Object> datos) {
		return new Cliente((Integer) datos.get(0), (Integer) datos.get(1), (String) datos.get(2));
	}

	public static List<String> getColumnas() {
		List<String> columnas = new ArrayList<>();
		columnas.add("Id Cliente");
		columnas.add("Id Usuario");
		columnas.add("Número de teléfono");
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}

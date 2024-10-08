package DBRepositorio;

import java.util.ArrayList;
import java.util.List;

public class Administrador extends Entidades {

	private int idAdmin;
	private int idUsuario;

	public Administrador() {
	}

	public Administrador(int idAdmin, int idUsuario) {
		this.idAdmin = idAdmin;
		this.idUsuario = idUsuario;
	}

	@Override
	public Object[] toArray() {
		return new Object[] { getIdAdmin(), getIdUsuario() };
	}

	public static Administrador toAdministrador(List<Object> datos) {
		return new Administrador((Integer) datos.get(0), (Integer) datos.get(1));
	}

	public static List<String> getColumnas() {
		List<String> columnas = new ArrayList<>();
		columnas.add("Id Admin");
		columnas.add("Id Usuario");
		return columnas;
	}

	public int getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
}

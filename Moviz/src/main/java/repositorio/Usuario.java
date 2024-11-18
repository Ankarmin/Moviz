package repositorio;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Entidades {

	private int id;
	private String user;
	private String password;

	public Usuario() {
	}

	public Usuario(int id, String user, String password) {
		this.id = id;
		this.user = user;
		this.password = password;
	}

	@Override
	public Object[] toArray() {
		return new Object[] { getId(), getUser(), getPassword() };
	}

	public static Usuario toUsuario(List<Object> datos) {
		return new Usuario((Integer) datos.get(0), (String) datos.get(1), (String) datos.get(2));
	}

	public static List<String> getColumnas() {
		List<String> columnas = new ArrayList<>();
		columnas.add("Id");
		columnas.add("Usuario");
		columnas.add("Contraseña");
		return columnas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

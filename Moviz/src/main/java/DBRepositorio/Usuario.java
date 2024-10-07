package DBRepositorio;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Entidades {

	private String user;
	private String password;
	private int phoneNumber;

	// CONSTRUCTOR DEFAULT PARA EL REPOSITORIO
	public Usuario() {
	}

	// CONSTRUCTOR PARAMETRIZADO
	public Usuario(String user, String password, int phoneNumber) {
		this.user = user;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public Object[] toArray() {
		return new Object[] { getUser(), getPassword(), getPhoneNumber() };
	}

	public static Usuario toUsuario(List<Object> datos) {
		return new Usuario((String) datos.get(0), (String) datos.get(1), (Integer) datos.get(2));
	}

	public static List<String> getColumnas() {
		List<String> columnas = new ArrayList<>();
		columnas.add("Usuario");
		columnas.add("Contraseña");
		columnas.add("Número de telefono");

		return columnas;
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

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}

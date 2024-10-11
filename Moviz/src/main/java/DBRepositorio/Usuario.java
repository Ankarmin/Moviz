package DBRepositorio;

import java.util.ArrayList;
import java.util.List;

//HEREDA DE ENTIDADES (ENTIDADES ES UNA CLASE ABSTRACTA)
public class Usuario extends Entidades {

	// LOS ATRIBUTOS PRIVADOS REPRESENTAN CADA COLUMNA DE LA TABLA DE LIBROS
	private int id;
	private String user;
	private String password;

	// CONSTRUCTOR POR DEFAULT (SE USA EN LOS REPOSITORIOS)
	public Usuario() {
	}

	// CONSTRUCTOR PARAMETRIZADO
	public Usuario(int id, String user, String password) {
		this.user = user;
		this.password = password;
	}

	// IMPLEMENTACION DEL METODO TO ARRAY (SE USA EN LLENARTABLA)
	@Override
	public Object[] toArray() {
		return new Object[] { getId(), getUser(), getPassword() };
	}

	// MÉTODO ESTÁTICO PARA CONVERTIR UN ARRAY DE OBJETOS A USUARIO (UN ARRAY DE
	// OBJETOS ES COMO UN COMODIN, LITERALEMENTE UN OBJETO
	// OBJECT PUEDE REPRESENTAR CUALQUIER TIPO DE DATO) Y LOS DEVUELVE
	public static Usuario toUsuario(List<Object> datos) {
		return new Usuario((Integer) datos.get(0), (String) datos.get(1), (String) datos.get(2));
	}

	// MÉTODO ESTÁTICO PARA CONSEGUIR LAS COLUMNAS DE LA TABLA QUE LE CORRESPONDE A
	// LA ENTIDAD
	public static List<String> getColumnas() {
		List<String> columnas = new ArrayList<>();
		columnas.add("Id");
		columnas.add("Usuario");
		columnas.add("Contraseña");
		return columnas;
	}

	// GETTERS Y SETTERS
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

package modelo;

import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import repositorio.Comentario;
import repositorio.ComentarioRepositorio;
import repositorio.CommonFunctions;
import repositorio.Pelicula;
import repositorio.PeliculaRepositorio;

public class MenuEliminarComentariosModelo {

	private final PeliculaRepositorio peliculaRepositorio;
	private final ComentarioRepositorio comentarioRepositorio;

	List<Pelicula> titulos;
	List<Comentario> comentarios;

	private TableModel modeloTablaTitulos;
	private TableModel modeloTablaComentarios;

	public MenuEliminarComentariosModelo(PeliculaRepositorio peliculaRepositorio,
			ComentarioRepositorio comentarioRepositorio) {
		this.peliculaRepositorio = peliculaRepositorio;
		this.comentarioRepositorio = comentarioRepositorio;
	}

	public void generarModeloTitulos(JTable tblTitulos, String busqueda) {
		titulos = peliculaRepositorio.listaTituloBusqueda(busqueda);
		CommonFunctions.llenarTabla(tblTitulos, Pelicula.getTitulos(), titulos);
		modeloTablaTitulos = tblTitulos.getModel();
		tblTitulos.setModel(new DefaultTableModel());
	}

	public void cargarModeloTitulos(JTable tblTitulos) {
		tblTitulos.setModel(this.modeloTablaTitulos);
	}

	public boolean eliminarComentario(Integer id) {
		return comentarioRepositorio.eliminar(id);
	}

	public void generarModeloComentarios(JTable tblComentarios, Integer idPelicula) {
		comentarios = comentarioRepositorio.obtenerComentariosPelicula(idPelicula);
		CommonFunctions.llenarTabla(tblComentarios, Comentario.getColumnas(), comentarios);
		modeloTablaComentarios = tblComentarios.getModel();
		tblComentarios.setModel(new DefaultTableModel());
	}

	public void cargarModeloComentario(JTable tblComentarios) {
		tblComentarios.setModel(this.modeloTablaComentarios);
	}

	public Pelicula obtenerPorId(Integer id) {
		return peliculaRepositorio.obtenerPorId(id);
	}
}

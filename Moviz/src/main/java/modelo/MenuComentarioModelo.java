package modelo;

import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import repositorio.Comentario;
import repositorio.ComentarioRepositorio;
import repositorio.CommonFunctions;

public class MenuComentarioModelo {

	private final ComentarioRepositorio comentarioRepositorio;

	List<Comentario> comentarios;

	private TableModel modeloTablaComentarios;

	public MenuComentarioModelo(ComentarioRepositorio comentarioRepositorio) {
		this.comentarioRepositorio = comentarioRepositorio;
	}

	public boolean agregarComentario(Comentario comentario) {
		return comentarioRepositorio.agregar(comentario);
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
}

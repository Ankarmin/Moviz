package modelo;

import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import repositorio.CommonFunctions;
import repositorio.Pelicula;
import repositorio.PeliculaRepositorio;

public class MenuEliminarPeliculaModelo {

	List<Pelicula> titulos;

	private TableModel modeloTablaTitulos;

	private final PeliculaRepositorio peliculaRepositorio;

	public MenuEliminarPeliculaModelo(PeliculaRepositorio peliculaRepositorio) {
		this.peliculaRepositorio = peliculaRepositorio;
	}

	public boolean eliminarPelicula(Integer id) {
		return peliculaRepositorio.eliminar(id);
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

	public Pelicula obtenerPorId(Integer id) {
		return peliculaRepositorio.obtenerPorId(id);
	}
}

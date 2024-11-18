package controlador;

import java.sql.Connection;

import vista.MenuAdministradorVista;

public class PnlMenuAdministradorControlador {

	private final FrameControlador frameControlador;
	private final MenuAdministradorVista vista;

	public PnlMenuAdministradorControlador(Connection openConexion, FrameControlador frameControlador) {
		this.frameControlador = frameControlador;

		vista = new MenuAdministradorVista();

		setEvents();
	}

	public final void setEvents() {
		vista.btnSalir.addActionListener((e) -> {
			irAMenuLogin();
		});
		vista.btnAgregarP.addActionListener((e) -> {
			irAMenuAgregarPelicula();
		});
		vista.btnEliminarP.addActionListener((e) -> {
			irAMenuEliminarPeliculas();
		});
		vista.btnEliminarC.addActionListener((e) -> {
			irAMenuEliminarComentarios();
		});
	}

	public void mostrar() {
		frameControlador.getFrameVista().pnlContenido.removeAll();
		frameControlador.getFrameVista().pnlContenido.add(vista);
		frameControlador.getFrameVista().pnlContenido.revalidate();
		frameControlador.getFrameVista().pnlContenido.repaint();
	}

	private void irAMenuLogin() {
		frameControlador.getMenuLoginControlador().mostrar();
	}

	private void irAMenuAgregarPelicula() {
		frameControlador.getMenuAgregarPeliculaControlador().mostrar();
	}

	private void irAMenuEliminarPeliculas() {
		frameControlador.getMenuEliminarPeliculasControlador().mostrar();
	}

	private void irAMenuEliminarComentarios() {
		frameControlador.getMenuEliminarComentariosControlador().mostrar();
	}
}

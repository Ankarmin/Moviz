package controlador;

import java.sql.Connection;

import vista.MenuAdministradorVista;

public class PnlMenuAdministradorControlador {

	private final FrameControlador frameControlador;
	private final MenuAdministradorVista vista;

	private final PnlMenuAgregarPeliculaControlador menuAgregarPeliculaControlador;
	private final PnlMenuEliminarPeliculasControlador menuEliminarPeliculasControlador;
	private final PnlMenuEliminarComentariosControlador menuEliminarComentariosControlador;

	public PnlMenuAdministradorControlador(Connection openConexion, FrameControlador frameControlador) {
		this.frameControlador = frameControlador;

		vista = new MenuAdministradorVista();

		menuAgregarPeliculaControlador = new PnlMenuAgregarPeliculaControlador(openConexion, frameControlador, this);
		menuEliminarPeliculasControlador = new PnlMenuEliminarPeliculasControlador(openConexion, frameControlador,
				this);
		menuEliminarComentariosControlador = new PnlMenuEliminarComentariosControlador(openConexion, frameControlador,
				this);

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
		menuAgregarPeliculaControlador.mostrar();
	}

	private void irAMenuEliminarPeliculas() {
		menuEliminarPeliculasControlador.mostrar();
	}

	private void irAMenuEliminarComentarios() {
		menuEliminarComentariosControlador.mostrar();
	}
}

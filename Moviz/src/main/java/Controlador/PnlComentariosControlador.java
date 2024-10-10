package Controlador;

import java.sql.Connection;

import Vista.ComentariosVista;

public class PnlComentariosControlador {

	private final FrameControlador frameControlador;
	private final ComentariosVista vista;

	public PnlComentariosControlador(Connection openConexion, FrameControlador frameControlador) {
		this.frameControlador = frameControlador;
		vista = new ComentariosVista();

		setEvents();
	}

	public final void setEvents() {
		vista.btnVolver.addActionListener((e) -> {
			irAPelicula();
		});

		vista.btnSalir.addActionListener((e) -> {
			irALogin();
		});
	}

	public void mostrar() {
		frameControlador.getFrameVista().pnlContenido.removeAll();
		frameControlador.getFrameVista().pnlContenido.add(vista);
		frameControlador.getFrameVista().pnlContenido.revalidate();
		frameControlador.getFrameVista().pnlContenido.repaint();
	}

	private void irALogin() {
		frameControlador.getLoginControlador().mostrar();
	}

	private void irAPelicula() {
		frameControlador.getPeliculaControlador().mostrar();
	}
}

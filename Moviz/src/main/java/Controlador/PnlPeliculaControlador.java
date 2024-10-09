package Controlador;

import java.sql.Connection;
import Vista.PeliculaVista;

public class PnlPeliculaControlador {

	private final FrameControlador frameControlador;
	private final PeliculaVista vista;

	public PnlPeliculaControlador(Connection openConexion, FrameControlador frameControlador) {
		this.frameControlador = frameControlador;

		vista = new PeliculaVista();
		// INSTACIA MODELO FUTURO

		setEvents();
	}

	public final void setEvents() {

	}

	public void mostrar() {
		frameControlador.getFrameVista().pnlContenido.removeAll();
		frameControlador.getFrameVista().pnlContenido.add(vista);
		frameControlador.getFrameVista().pnlContenido.revalidate();
		frameControlador.getFrameVista().pnlContenido.repaint();
	}
}

package Controlador;

import java.sql.Connection;
import Vista.AgregarPeliculaVista;

public class PnlAgregarPeliculaControlador {

	private final FrameControlador frameControlador;
	private final AgregarPeliculaVista vista;

	public PnlAgregarPeliculaControlador(Connection openConexion, FrameControlador frameControlador) {
		this.frameControlador = frameControlador;

		vista = new AgregarPeliculaVista();
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

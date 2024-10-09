package Controlador;

import java.sql.Connection;
import Vista.HistorialVista;

public class PnlHistorialControlador {

	private final FrameControlador frameControlador;
	private final HistorialVista vista;

	public PnlHistorialControlador(Connection openConexion, FrameControlador frameControlador) {
		this.frameControlador = frameControlador;

		vista = new HistorialVista();
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

package Controlador;

import java.sql.Connection;

import Vista.EliminarComentariosVista;

public class PnlEliminarComentarioControlador {

	private final FrameControlador frameControlador;
	private final EliminarComentariosVista vista;

	public PnlEliminarComentarioControlador(Connection openConexion, FrameControlador frameControlador) {
		this.frameControlador = frameControlador;
		vista = new EliminarComentariosVista();

		setEvents();
	}

	public final void setEvents() {
		vista.btnVolver.addActionListener((e) -> {
			frameControlador.getMenuAdministradorControlador().mostrar();
		});
	}

	public void mostrar() {
		frameControlador.getFrameVista().pnlContenido.removeAll();
		frameControlador.getFrameVista().pnlContenido.add(vista);
		frameControlador.getFrameVista().pnlContenido.revalidate();
		frameControlador.getFrameVista().pnlContenido.repaint();
	}
}

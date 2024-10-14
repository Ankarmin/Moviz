package Controlador;

import java.sql.Connection;

import Vista.EliminarPeliculaVista;

public class PnlEliminarPeliculaControlador {

	private final FrameControlador frameControlador;
	private final EliminarPeliculaVista vista;

	public PnlEliminarPeliculaControlador(Connection openConexion, FrameControlador frameControlador) {
		this.frameControlador = frameControlador;

		vista = new EliminarPeliculaVista();
		// INSTACIA MODELO FUTURO

		setEvents();
	}

	public final void setEvents() {
		vista.btnVolver.addActionListener((e) -> {
			irAMenuAdministrador();
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

	private void irAMenuAdministrador() {
		frameControlador.getMenuAdministradorControlador().mostrar();
	}
}

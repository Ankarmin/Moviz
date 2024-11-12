package Controlador;

import java.sql.Connection;

import Vista.MenuEliminarComentariosVista;

public class PnlMenuEliminarComentariosControlador {

	private final FrameControlador frameControlador;
	private final MenuEliminarComentariosVista vista;

	public PnlMenuEliminarComentariosControlador(Connection openConexion, FrameControlador frameControlador) {
		this.frameControlador = frameControlador;

		vista = new MenuEliminarComentariosVista();

		setEvents();
	}

	public final void setEvents() {
		vista.btnVolver.addActionListener((e) -> {
			irAMenuAdministrador();
		});

		vista.btnSalir.addActionListener((e) -> {
			irAMenuLogin();
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

	private void irAMenuAdministrador() {
		frameControlador.getMenuAdministradorControlador().mostrar();
	}
}

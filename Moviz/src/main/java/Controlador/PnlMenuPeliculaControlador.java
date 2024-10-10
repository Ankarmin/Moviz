package Controlador;

import java.sql.Connection;
import Vista.MenuPeliculasVista;

public class PnlMenuPeliculaControlador {

	private final FrameControlador frameControlador;
	private final MenuPeliculasVista vista;

	public PnlMenuPeliculaControlador(Connection openConexion, FrameControlador frameControlador) {
		this.frameControlador = frameControlador;

		vista = new MenuPeliculasVista();
		// INSTACIA MODELO FUTURO

		setEvents();
	}

	public final void setEvents() {
		vista.btnHistorial.addActionListener((e) -> {
			irAHistorial();
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

	private void irAHistorial() {
		frameControlador.getHistorialControlador().mostrar();
	}
}

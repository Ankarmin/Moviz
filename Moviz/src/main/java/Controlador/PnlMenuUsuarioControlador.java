package Controlador;

import java.sql.Connection;

import Modelo.MenuUsuarioModelo;
import Vista.MenuUsuarioVista;

public class PnlMenuUsuarioControlador {

	private final FrameControlador frameControlador;
	private final MenuUsuarioVista vista;
	private final MenuUsuarioModelo modelo;

	public PnlMenuUsuarioControlador(Connection openConexion, FrameControlador frameControlador) {
		this.frameControlador = frameControlador;

		vista = new MenuUsuarioVista();
		modelo = new MenuUsuarioModelo();// FALTA

		setEvents();
	}

	public final void setEvents() {
		vista.btnSalir.addActionListener((e) -> {
			irALogin();
		});

		vista.btnPeliculas.addActionListener((e) -> {
			irAMenuPeliculas();
		});
		
		vista.btnHistorial.addActionListener((e) -> {
			irAHistorial();
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

	private void irAMenuPeliculas() {
		frameControlador.getMenuPeliculaControlador().mostrar();
	}

	private void irAHistorial() {
		frameControlador.getHistorialControlador().mostrar();
	}

}

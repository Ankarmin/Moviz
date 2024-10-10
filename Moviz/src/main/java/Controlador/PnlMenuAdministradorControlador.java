package Controlador;

import java.sql.Connection;

//import Modelo.MenuAdministradorModelo;
import Vista.MenuAdministradorVista;

public class PnlMenuAdministradorControlador {

	private final FrameControlador frameControlador;
	private final MenuAdministradorVista vista;
	// private final MenuAdministradorModelo modelo;

	public PnlMenuAdministradorControlador(Connection openConexion, FrameControlador frameControlador) {
		this.frameControlador = frameControlador;
		vista = new MenuAdministradorVista();
		// modelo = new MenuAdministradorModelo();

		setEvents();
	}

	public final void setEvents() {
		vista.btnSalir.addActionListener((e) -> {
			irALogin();
		});
		vista.btnAgregarP.addActionListener((e) -> {
			agregarP();
		});
		vista.btnEliminarP.addActionListener((e) -> {
			eliminarP();
		});

		vista.btnEliminarC.addActionListener((e) -> {
			eliminarC();
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

	private void agregarP() {
		frameControlador.getAgregarPeliculaControlador().mostrar();
	}

	private void eliminarP() {
		frameControlador.getEliminarPeliculaControlador().mostrar();
	}

	private void eliminarC() {
		frameControlador.getEliminarComentarioControlador().mostrar();
	}
}

package Controlador;

import java.sql.Connection;

import DBRepositorio.PeliculaRepositorio;
import Modelo.AgregarPeliculaModelo;
import Vista.AgregarPeliculaVista;

public class PnlAgregarPeliculaControlador {

	private final FrameControlador frameControlador;
	private final AgregarPeliculaVista vista;
	private final AgregarPeliculaModelo modelo;

	public PnlAgregarPeliculaControlador(Connection openConexion, FrameControlador frameControlador) {
		this.frameControlador = frameControlador;

		vista = new AgregarPeliculaVista();
		modelo = new AgregarPeliculaModelo(new PeliculaRepositorio(openConexion));

		setEvents();
	}

	public final void setEvents() {
		vista.btnVolver.addActionListener((e) -> {
			frameControlador.getMenuAdministradorControlador().mostrar();
		});

		vista.btnAñadirPelicula.addActionListener((e) -> {
			añadirPelicula();
		});
	}

	private void añadirPelicula() {
		// FALTA TXT EN LA VISTA
	}

	public void mostrar() {
		frameControlador.getFrameVista().pnlContenido.removeAll();
		frameControlador.getFrameVista().pnlContenido.add(vista);
		frameControlador.getFrameVista().pnlContenido.revalidate();
		frameControlador.getFrameVista().pnlContenido.repaint();
	}
}

package Controlador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;

import Vista.ComentariosVista;

public class PnlComentariosControlador {

	private final FrameControlador frameControlador;
	private final ComentariosVista vista;
	private final int id;

	public PnlComentariosControlador(Connection openConexion, FrameControlador frameControlador, int id) {
		this.frameControlador = frameControlador;
		this.id = id;
		vista = new ComentariosVista();

		setEvents();
	}

	public final void setEvents() {
		vista.btnVolver.addActionListener((e) -> {
			irAPelicula();
		});

		vista.btnSalir.addActionListener((e) -> {
			irALogin();
		});

		vista.btnPeliculas.addActionListener((e) -> {
			irAMenuPeliculas();
		});

		vista.btnHistorial.addActionListener((e) -> {
			irAHistorial();
		});

		vista.Busqueda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				irABusqueda();
			}
		});

		vista.IconoLogo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				irAMenuUsuario();
			}
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

	private void irAMenuPeliculas() {
		frameControlador.getMenuPeliculaControlador().mostrar();
	}

	private void irABusqueda() {
		frameControlador.getBuscadorDePeliculasControlador().mostrar();
	}

	private void irAMenuUsuario() {
		frameControlador.getMenuUsuarioControlador().mostrar();
	}

	private void irAPelicula() {
		PnlPeliculaControlador peliculaControlador = new PnlPeliculaControlador(frameControlador.getOpenConexion(),
				frameControlador, id);
		peliculaControlador.mostrar();
	}
}

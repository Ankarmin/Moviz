package Controlador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;

//import Modelo.MenuUsuarioModelo;
import Vista.MenuUsuarioVista;

public class PnlMenuUsuarioControlador {

	private final FrameControlador frameControlador;
	private final MenuUsuarioVista vista;
	// private final MenuUsuarioModelo modelo;

	public PnlMenuUsuarioControlador(Connection openConexion, FrameControlador frameControlador) {
		this.frameControlador = frameControlador;

		vista = new MenuUsuarioVista();
		// modelo = new MenuUsuarioModelo();

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

		vista.posterPelicula1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
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

	private void irAMenuPeliculas() {
		frameControlador.getMenuPeliculaControlador().mostrar();
	}

	private void irAHistorial() {
		frameControlador.getHistorialControlador().mostrar();
	}

	private void irABusqueda() {
		frameControlador.getBuscadorDePeliculasControlador().mostrar();
	}

	private void irAMenuUsuario() {
		frameControlador.getMenuUsuarioControlador().mostrar();
	}
}

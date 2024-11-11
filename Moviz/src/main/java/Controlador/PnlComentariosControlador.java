package Controlador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;

import DBRepositorio.Usuario;
import Vista.ComentariosVista;

public class PnlComentariosControlador {

	private final FrameControlador frameControlador;
	private final PnlMenuUsuarioControlador pnlMenuUsuarioControlador;

	private final ComentariosVista vista;

	private final int idPelicula;
	private final Usuario usuario;

	public PnlComentariosControlador(Connection openConexion, FrameControlador frameControlador,
			PnlMenuUsuarioControlador pnlMenuUsuarioControlador, Usuario usuario, int idPelicula) {
		this.frameControlador = frameControlador;
		this.pnlMenuUsuarioControlador = pnlMenuUsuarioControlador;
		this.idPelicula = idPelicula;
		this.usuario = usuario;
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
		pnlMenuUsuarioControlador.getHistorialControlador().mostrar();
	}

	private void irAMenuPeliculas() {
		pnlMenuUsuarioControlador.getMenuPeliculaControlador().mostrar();
	}

	private void irABusqueda() {
		pnlMenuUsuarioControlador.getBuscadorDePeliculasControlador().mostrar();
	}

	private void irAMenuUsuario() {
		pnlMenuUsuarioControlador.mostrar();
	}

	private void irAPelicula() {
		PnlPeliculaControlador peliculaControlador = new PnlPeliculaControlador(frameControlador.getOpenConexion(),
				frameControlador, pnlMenuUsuarioControlador, usuario, idPelicula);
		peliculaControlador.mostrar();
	}
}

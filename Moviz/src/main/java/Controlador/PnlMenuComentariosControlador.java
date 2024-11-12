package Controlador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;

import DBRepositorio.Usuario;
import Vista.MenuComentariosVista;

public class PnlMenuComentariosControlador {

	private final FrameControlador frameControlador;
	private final PnlMenuUsuarioControlador pnlMenuUsuarioControlador;

	private final MenuComentariosVista vista;

	private final int idPelicula;
	private final Usuario usuario;

	public PnlMenuComentariosControlador(Connection openConexion, FrameControlador frameControlador,
			PnlMenuUsuarioControlador pnlMenuUsuarioControlador, Usuario usuario, int idPelicula) {
		this.frameControlador = frameControlador;
		this.pnlMenuUsuarioControlador = pnlMenuUsuarioControlador;
		this.idPelicula = idPelicula;
		this.usuario = usuario;
		vista = new MenuComentariosVista();

		setEvents();
	}

	public final void setEvents() {
		vista.btnVolver.addActionListener((e) -> {
			irAMenuPelicula();
		});

		vista.btnSalir.addActionListener((e) -> {
			irAMenuLogin();
		});

		vista.btnPeliculas.addActionListener((e) -> {
			irAMenuPeliculas();
		});

		vista.btnFavoritas.addActionListener((e) -> {
			irAMenuFavoritas();
		});

		vista.Busqueda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				irAMenuBusqueda();
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

	private void irAMenuLogin() {
		frameControlador.getMenuLoginControlador().mostrar();
	}

	private void irAMenuFavoritas() {
		pnlMenuUsuarioControlador.getMenuFavoritasControlador().mostrar();
	}

	private void irAMenuPeliculas() {
		pnlMenuUsuarioControlador.getMenuPeliculaControlador().mostrar();
	}

	private void irAMenuBusqueda() {
		pnlMenuUsuarioControlador.getMenuBuscadorControlador().mostrar();
	}

	private void irAMenuUsuario() {
		pnlMenuUsuarioControlador.mostrar();
	}

	private void irAMenuPelicula() {
		PnlPeliculaControlador peliculaControlador = new PnlPeliculaControlador(frameControlador.getOpenConexion(),
				frameControlador, pnlMenuUsuarioControlador, usuario, idPelicula);
		peliculaControlador.mostrar();
	}
}

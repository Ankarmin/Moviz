package Controlador;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.Connection;
import java.time.LocalTime;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import DBRepositorio.Pelicula;
import DBRepositorio.PeliculaFavorita;
import DBRepositorio.PeliculaFavoritaRepositorio;
import DBRepositorio.PeliculaRepositorio;
import DBRepositorio.Usuario;
import Modelo.MenuUsuarioModelo;
import Vista.MenuUsuarioVista;

public class PnlMenuUsuarioControlador {

	private final FrameControlador frameControlador;

	private final MenuUsuarioVista vista;
	private final MenuUsuarioModelo modelo;

	private final PnlMenuPeliculaControlador menuPeliculaControlador;
	private final PnlBuscadorDePeliculasControlador buscadorDePeliculasControlador;
	private final PnlHistorialControlador historialControlador;

	private final Usuario usuario;

	public PnlMenuUsuarioControlador(Connection openConexion, FrameControlador frameControlador, Usuario usuario) {
		this.frameControlador = frameControlador;
		this.usuario = usuario;

		vista = new MenuUsuarioVista();
		modelo = new MenuUsuarioModelo(new PeliculaRepositorio(openConexion),
				new PeliculaFavoritaRepositorio(openConexion));

		menuPeliculaControlador = new PnlMenuPeliculaControlador(openConexion, frameControlador, this, usuario);
		historialControlador = new PnlHistorialControlador(openConexion, frameControlador, this, usuario);
		buscadorDePeliculasControlador = new PnlBuscadorDePeliculasControlador(openConexion, frameControlador, this,
				usuario);

		setEvents();
		setSaludo();
		mostrarPeliculasEnHistorial();
		mostrarPeliculasEnFavoritos();
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

		vista.Busqueda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				irABusqueda();
			}
		});
	}

	public void mostrar() {
		frameControlador.getFrameVista().pnlContenido.removeAll();
		frameControlador.getFrameVista().pnlContenido.add(vista);
		frameControlador.getFrameVista().pnlContenido.revalidate();
		frameControlador.getFrameVista().pnlContenido.repaint();
		mostrarPeliculasEnHistorial();
		mostrarPeliculasEnFavoritos();
	}

	private void irALogin() {
		frameControlador.getLoginControlador().mostrar();
	}

	private void irAMenuPeliculas() {
		menuPeliculaControlador.mostrar();
	}

	private void irAHistorial() {
		historialControlador.mostrar();
	}

	private void irABusqueda() {
		buscadorDePeliculasControlador.mostrar();
	}

	public FrameControlador getFrameControlador() {
		return frameControlador;
	}

	public PnlMenuPeliculaControlador getMenuPeliculaControlador() {
		return menuPeliculaControlador;
	}

	public PnlBuscadorDePeliculasControlador getBuscadorDePeliculasControlador() {
		return buscadorDePeliculasControlador;
	}

	public PnlHistorialControlador getHistorialControlador() {
		return historialControlador;
	}

	private void setSaludo() {
		LocalTime currentTime = LocalTime.now();
		String saludo;

		if (currentTime.isBefore(LocalTime.NOON)) {
			saludo = "Buenos días " + usuario.getUser() + ", esto es lo que estuviste viendo...";
		} else if (currentTime.isBefore(LocalTime.of(18, 0))) {
			saludo = "Buenas tardes " + usuario.getUser() + ", esto es lo que estuviste viendo...";
		} else {
			saludo = "Buenas noches " + usuario.getUser() + ", esto es lo que estuviste viendo...";
		}
		vista.lbTextoDeBienvenido.setText(saludo);
	}

	public void mostrarPeliculasEnHistorial() {
		List<Pelicula> listaPeliculas = modelo.obtenerPeliculas();
		vista.panel_4.removeAll();
		vista.panel_4.revalidate();
		vista.panel_4.repaint();

		for (int i = 0; i < Math.min(listaPeliculas.size(), 5); i++) {
			Pelicula pelicula = listaPeliculas.get(i);
			JPanel panelItem = new JPanel();
			panelItem.setLayout(new BorderLayout());

			JLabel lblImagen = new JLabel();
			ImageIcon iconoRedimensionado;

			try {
				Image imagen = ImageIO.read(pelicula.getImagen()).getScaledInstance(140, 176, Image.SCALE_SMOOTH);
				iconoRedimensionado = new ImageIcon(imagen);
			} catch (IOException e) {
				iconoRedimensionado = new ImageIcon(getClass().getResource("/Images/ImagenPelicula.png"));
			}

			lblImagen.setIcon(iconoRedimensionado);
			lblImagen.setHorizontalAlignment(SwingConstants.CENTER);

			lblImagen.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					irAPelicula(pelicula.getIdPelicula());
				}
			});

			JLabel lblTitulo = new JLabel(pelicula.getNombre());
			lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
			lblTitulo.setForeground(Color.WHITE);

			panelItem.add(lblImagen, BorderLayout.CENTER);
			panelItem.add(lblTitulo, BorderLayout.SOUTH);

			panelItem.setPreferredSize(new Dimension(140, 200));
			vista.panel_4.add(panelItem);
		}
	}

	public void mostrarPeliculasEnFavoritos() {
		List<PeliculaFavorita> listaPeliculasFavoritas = modelo.obtenerPeliculasFavoritas();
		vista.panel_6.removeAll();
		vista.panel_6.revalidate();
		vista.panel_6.repaint();

		for (int i = 0; i < Math.min(listaPeliculasFavoritas.size(), 5); i++) {
			PeliculaFavorita peliculaFavorita = listaPeliculasFavoritas.get(i);
			Pelicula pelicula = modelo.obtenerPelicula(peliculaFavorita.getIdPelicula());
			JPanel panelItem = new JPanel();
			panelItem.setLayout(new BorderLayout());

			JLabel lblImagen = new JLabel();
			ImageIcon iconoRedimensionado;

			try {
				Image imagen = ImageIO.read(pelicula.getImagen()).getScaledInstance(140, 176, Image.SCALE_SMOOTH);
				iconoRedimensionado = new ImageIcon(imagen);
			} catch (IOException e) {
				iconoRedimensionado = new ImageIcon(getClass().getResource("/Images/ImagenPelicula.png"));
			}

			lblImagen.setIcon(iconoRedimensionado);
			lblImagen.setHorizontalAlignment(SwingConstants.CENTER);

			lblImagen.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					irAPelicula(pelicula.getIdPelicula());
				}
			});

			JLabel lblTitulo = new JLabel(pelicula.getNombre());
			lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
			lblTitulo.setForeground(Color.WHITE);

			panelItem.add(lblImagen, BorderLayout.CENTER);
			panelItem.add(lblTitulo, BorderLayout.SOUTH);

			panelItem.setPreferredSize(new Dimension(140, 200));
			vista.panel_6.add(panelItem);
		}
	}

	private void irAPelicula(int id) {
		PnlPeliculaControlador peliculaControlador = new PnlPeliculaControlador(frameControlador.getOpenConexion(),
				frameControlador, this, usuario, id);
		peliculaControlador.mostrar();
	}
}

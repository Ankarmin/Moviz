package controlador;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import modelo.MenuPeliculasModelo;
import repositorio.Pelicula;
import repositorio.PeliculaRepositorio;
import repositorio.Usuario;
import vista.MenuPeliculasVista;

public class PnlMenuPeliculaControlador {

	private final FrameControlador frameControlador;
	private final PnlMenuUsuarioControlador pnlMenuUsuarioControlador;

	private final MenuPeliculasVista vista;
	private final MenuPeliculasModelo modelo;

	private final Usuario usuario;

	public PnlMenuPeliculaControlador(Connection openConexion, FrameControlador frameControlador,
			PnlMenuUsuarioControlador pnlMenuUsuarioControlador, Usuario usuario) {
		this.frameControlador = frameControlador;
		this.pnlMenuUsuarioControlador = pnlMenuUsuarioControlador;

		this.usuario = usuario;

		vista = new MenuPeliculasVista();
		modelo = new MenuPeliculasModelo(new PeliculaRepositorio(openConexion));

		setEvents();
	}

	public final void setEvents() {
		vista.btnFavoritas.addActionListener((e) -> {
			irAMenuFavoritas();
		});

		vista.btnSalir.addActionListener((e) -> {
			irAMenuLogin();
		});

		vista.comboBoxGenero.addActionListener(e -> {
			desactivarEventos();
			String opcionSeleccionada = (String) vista.comboBoxGenero.getSelectedItem();

			vista.comboBoxAnio.setSelectedIndex(0);
			vista.comboBoxPuntuacion.setSelectedIndex(0);

			if (opcionSeleccionada == null || opcionSeleccionada.equals("Todos")) {
				List<Pelicula> listaPeliculas = modelo.obtenerTodos();
				mostrarPeliculasEnVista(listaPeliculas);
				activarEventos();
				return;
			}

			List<Pelicula> peliculasPorGenero = modelo.obtenerPorGenero(opcionSeleccionada);
			mostrarPeliculasEnVista(peliculasPorGenero);
			activarEventos();
		});

		vista.comboBoxAnio.addActionListener(e -> {
			desactivarEventos();
			String opcionSeleccionada = (String) vista.comboBoxAnio.getSelectedItem();
			int anioInicio = 0;
			int anioFin = 0;

			vista.comboBoxGenero.setSelectedIndex(0);
			vista.comboBoxPuntuacion.setSelectedIndex(0);

			switch (opcionSeleccionada) {
			case "1980s":
				anioInicio = 1980;
				anioFin = 1989;
				break;
			case "1990s":
				anioInicio = 1990;
				anioFin = 1999;
				break;
			case "2000s":
				anioInicio = 2000;
				anioFin = 2009;
				break;
			case "2010s":
				anioInicio = 2010;
				anioFin = 2019;
				break;
			case "2020s":
				anioInicio = 2020;
				anioFin = 2029;
				break;
			default:
				List<Pelicula> listaPeliculas = modelo.obtenerTodos();
				mostrarPeliculasEnVista(listaPeliculas);
				activarEventos();
				return;
			}

			List<Pelicula> peliculasPorAnio = modelo.obtenerPorAnio(anioInicio, anioFin);
			mostrarPeliculasEnVista(peliculasPorAnio);
			activarEventos();
		});

		vista.comboBoxPuntuacion.addActionListener(e -> {
			desactivarEventos();
			String opcionSeleccionada = (String) vista.comboBoxPuntuacion.getSelectedItem();
			int puntuacionMin;
			int puntuacionMax;

			vista.comboBoxAnio.setSelectedIndex(0);
			vista.comboBoxGenero.setSelectedIndex(0);

			switch (opcionSeleccionada) {
			case "1+": {
				puntuacionMin = 1;
				puntuacionMax = 5;
				break;
			}
			case "2+": {
				puntuacionMin = 2;
				puntuacionMax = 5;
				break;
			}
			case "3+": {
				puntuacionMin = 3;
				puntuacionMax = 5;
				break;
			}
			case "4+": {
				puntuacionMin = 4;
				puntuacionMax = 5;
				break;
			}
			default:
				List<Pelicula> listaPeliculas = modelo.obtenerTodos();
				mostrarPeliculasEnVista(listaPeliculas);
				activarEventos();
				return;
			}

			List<Pelicula> peliculasPorPuntuacion = modelo.obtenerPorPuntuacion(puntuacionMin, puntuacionMax);
			mostrarPeliculasEnVista(peliculasPorPuntuacion);
			activarEventos();
		});

		vista.lblBusqueda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				irAMenuBusqueda();
			}
		});

		vista.lblIconoLogo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				irAMenuUsuario();
			}
		});
	}

	public void mostrar() {
		List<Pelicula> listaPeliculas = modelo.obtenerTodos();
		mostrarPeliculasEnVista(listaPeliculas);
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

	public void mostrarPeliculasEnVista(List<Pelicula> listaPeliculas) {
		vista.pnlGrid.removeAll();
		vista.pnlGrid.revalidate();
		vista.pnlGrid.repaint();

		for (Pelicula pelicula : listaPeliculas) {
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
			vista.pnlGrid.add(panelItem);
		}

		vista.pnlGrid.revalidate();
		vista.pnlGrid.repaint();
	}

	private void irAMenuBusqueda() {
		pnlMenuUsuarioControlador.getMenuBuscadorControlador().mostrar();
	}

	private void irAMenuUsuario() {
		pnlMenuUsuarioControlador.mostrar();
	}

	private void irAPelicula(int id) {
		PnlPeliculaControlador peliculaControlador = new PnlPeliculaControlador(frameControlador.getOpenConexion(),
				frameControlador, pnlMenuUsuarioControlador, usuario, id);
		peliculaControlador.mostrar();
	}

	private void desactivarEventos() {
		for (var listener : vista.comboBoxGenero.getActionListeners()) {
			vista.comboBoxGenero.removeActionListener(listener);
		}
		for (var listener : vista.comboBoxAnio.getActionListeners()) {
			vista.comboBoxAnio.removeActionListener(listener);
		}
		for (var listener : vista.comboBoxPuntuacion.getActionListeners()) {
			vista.comboBoxPuntuacion.removeActionListener(listener);
		}
	}

	private void activarEventos() {
		setEvents();
	}
}

package Controlador;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.Connection;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import DBRepositorio.Pelicula;
import DBRepositorio.PeliculaRepositorio;
import Vista.PeliculaVista;

public class PnlPeliculaControlador {

	private final FrameControlador frameControlador;
	private final PeliculaVista vista;
	private final int id;
	private final PeliculaRepositorio peliculaRepositorio;

	public PnlPeliculaControlador(Connection openConexion, FrameControlador frameControlador, int id) {
		this.frameControlador = frameControlador;
		this.id = id;
		this.vista = new PeliculaVista();
		peliculaRepositorio = new PeliculaRepositorio(openConexion);
		// INSTACIA MODELO FUTURO

		mostrarDetallesPelicula();
		setEvents();
	}

	public final void setEvents() {
		vista.btnComentarios.addActionListener((e) -> {
			irAComentarios();
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

	private void irAMenuPeliculas() {
		frameControlador.getMenuPeliculaControlador().mostrar();
	}

	private void irAHistorial() {
		frameControlador.getHistorialControlador().mostrar();
	}

	private void irALogin() {
		frameControlador.getLoginControlador().mostrar();
	}

	private void irAComentarios() {
		PnlComentariosControlador comentarioControlador = new PnlComentariosControlador(
				frameControlador.getOpenConexion(), frameControlador, id);
		comentarioControlador.mostrar();
	}

	private void irABusqueda() {
		frameControlador.getBuscadorDePeliculasControlador().mostrar();
	}

	private void irAMenuUsuario() {
		frameControlador.getMenuUsuarioControlador().mostrar();
	}

	public void mostrarDetallesPelicula() {
		Pelicula pelicula = peliculaRepositorio.obtenerPorId(id);
		vista.titulo1_1.setText(pelicula.getNombre());
		vista.txtrTextoSinopsis.setText(pelicula.getSinopsis());
		vista.textPuntuacion.setText(String.valueOf(pelicula.getPuntuacion()));

		ImageIcon iconoRedimensionado;

		try {
			Image imagenRedimensionada = ImageIO.read(pelicula.getImagen()).getScaledInstance(300, 323,
					Image.SCALE_SMOOTH);
			iconoRedimensionado = new ImageIcon(imagenRedimensionada);

		} catch (IOException e) {
			iconoRedimensionado = new ImageIcon(getClass().getResource("/Images/ImagenPelicula.png"));
		}
		vista.posterPelicula1.setIcon(iconoRedimensionado);
		vista.posterPelicula1.setHorizontalAlignment(SwingConstants.CENTER);
	}
}

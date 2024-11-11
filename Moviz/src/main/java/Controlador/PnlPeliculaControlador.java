package Controlador;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.time.LocalDate;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import DBRepositorio.Pelicula;
import DBRepositorio.PeliculaAlquilada;
import DBRepositorio.PeliculaAlquiladaRepositorio;
import DBRepositorio.PeliculaFavorita;
import DBRepositorio.PeliculaFavoritaRepositorio;
import DBRepositorio.PeliculaRepositorio;
import DBRepositorio.Usuario;
import Modelo.PeliculaModelo;
import Vista.PeliculaVista;

public class PnlPeliculaControlador {

	private final FrameControlador frameControlador;
	private final PnlMenuUsuarioControlador pnlMenuUsuarioControlador;

	private final PeliculaVista vista;
	private final PeliculaModelo modelo;

	private final int idPelicula;
	private final Usuario usuario;

	public PnlPeliculaControlador(Connection openConexion, FrameControlador frameControlador,
			PnlMenuUsuarioControlador pnlMenuUsuarioControlador, Usuario usuario, int idPelicula) {
		this.frameControlador = frameControlador;
		this.pnlMenuUsuarioControlador = pnlMenuUsuarioControlador;

		this.idPelicula = idPelicula;
		this.usuario = usuario;

		this.vista = new PeliculaVista();
		modelo = new PeliculaModelo(new PeliculaRepositorio(openConexion),
				new PeliculaFavoritaRepositorio(openConexion), new PeliculaAlquiladaRepositorio(openConexion));

		mostrarDetallesPelicula();
		verificarFavoritos();
		verificarAlquiler();
		verificarLimite();
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

		vista.LblFavoritos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				boolean verificarFavoritos = modelo.verificarFavoritos(idPelicula, usuario.getId());
				if (verificarFavoritos) {
					eliminarFavoritos();
					verificarFavoritos();
				} else {
					agregarFavoritos();
					verificarFavoritos();
				}
			}
		});

		vista.btnAlquilar.addActionListener((e) -> {
			alquilarPelicula();
		});
	}

	public void mostrar() {
		frameControlador.getFrameVista().pnlContenido.removeAll();
		frameControlador.getFrameVista().pnlContenido.add(vista);
		frameControlador.getFrameVista().pnlContenido.revalidate();
		frameControlador.getFrameVista().pnlContenido.repaint();
	}

	private void irAMenuPeliculas() {
		pnlMenuUsuarioControlador.getMenuPeliculaControlador().mostrar();
	}

	private void irAHistorial() {
		pnlMenuUsuarioControlador.getHistorialControlador().mostrar();
	}

	private void irALogin() {
		frameControlador.getLoginControlador().mostrar();
	}

	private void irAComentarios() {
		PnlComentariosControlador comentarioControlador = new PnlComentariosControlador(
				frameControlador.getOpenConexion(), frameControlador, pnlMenuUsuarioControlador, usuario, idPelicula);
		comentarioControlador.mostrar();
	}

	private void irABusqueda() {
		pnlMenuUsuarioControlador.getBuscadorDePeliculasControlador().mostrar();
	}

	private void irAMenuUsuario() {
		pnlMenuUsuarioControlador.mostrar();
	}

	public void mostrarDetallesPelicula() {
		Pelicula pelicula = modelo.obtenerPorId(idPelicula);
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

	public void agregarFavoritos() {
		PeliculaFavorita peliculaFavorita = new PeliculaFavorita();
		peliculaFavorita.setIdPelicula(idPelicula);
		peliculaFavorita.setIdUsuario(usuario.getId());
		boolean favorita = modelo.agregarFavorita(peliculaFavorita);
		if (favorita) {
			System.out.println("Pelicula favorita agregada con éxito.");
		} else {
			System.out.println("Error al agregar la Película Favorita.");
		}
	}

	public void eliminarFavoritos() {
		PeliculaFavorita peliculaFavorita = modelo.obtenerPeliculaFavorita(idPelicula, usuario.getId());
		boolean eliminada = modelo.eliminarFavoritos(peliculaFavorita.getIdPeliculaFavorita());
		if (eliminada) {
			System.out.println("Película favorita eliminada con éxito.");
		} else {
			System.out.println("Error al eliminar la película favorita.");
		}
	}

	public void verificarFavoritos() {
		boolean verificarFavoritos = modelo.verificarFavoritos(idPelicula, usuario.getId());
		if (verificarFavoritos) {
			String favorito = "Eliminar de Favoritos";
			vista.txtrAadirAFavoritos.setText(favorito);
		} else {
			String noFavorito = "Añadir a Favoritos";
			vista.txtrAadirAFavoritos.setText(noFavorito);
		}
	}

	private void alquilarPelicula() {
		PeliculaAlquilada peliculaAlquilada = new PeliculaAlquilada();
		peliculaAlquilada.setIdPelicula(idPelicula);
		peliculaAlquilada.setIdUsuario(usuario.getId());
		peliculaAlquilada.setFechaAlquiler(Date.valueOf(LocalDate.now()));
		boolean alquiler = modelo.agregarAlquiler(peliculaAlquilada);
		if (alquiler) {
			System.out.println("La Película ha sido alquilada con éxito");
			verificarAlquiler();
		} else {
			System.out.println("Error al alquilar la Película");
		}
	}

	public void verificarAlquiler() {
		boolean verificarAlquiler = modelo.verificarAlquiler(idPelicula, usuario.getId());
		if (verificarAlquiler) {
			String alquiler = "ALQUILADO";
			vista.btnAlquilar.setEnabled(false);
			vista.btnAlquilado.setText(alquiler);
			vista.btnAlquilado.setBackground(Color.GREEN);
			vista.btnAlquilado.setForeground(Color.WHITE);
		} else {
			String noFavorito = "NO ALQUILADO";
			vista.btnAlquilar.setEnabled(true);
			vista.btnAlquilado.setText(noFavorito);
			vista.btnAlquilado.setBackground(Color.RED);
			vista.btnAlquilado.setForeground(Color.WHITE);
		}
	}

	public void verificarLimite() {
		boolean verificarLimite = modelo.verificarLimiteAlquiler(usuario.getId());
		if (verificarLimite) {
			vista.btnAlquilar.setEnabled(false);
		}
	}
}

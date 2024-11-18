package controlador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;

import javax.swing.JOptionPane;

import modelo.MenuComentarioModelo;
import repositorio.Comentario;
import repositorio.ComentarioRepositorio;
import repositorio.Usuario;
import vista.MenuComentariosVista;

public class PnlMenuComentariosControlador {

	private final FrameControlador frameControlador;

	private final PnlMenuUsuarioControlador pnlMenuUsuarioControlador;

	private final MenuComentarioModelo modelo;

	private final MenuComentariosVista vista;

	private final int idPelicula;
	private final Usuario usuario;

	public PnlMenuComentariosControlador(Connection openConexion, FrameControlador frameControlador,
			PnlMenuUsuarioControlador pnlMenuUsuarioControlador, Usuario usuario, int idPelicula) {

		this.frameControlador = frameControlador;
		this.pnlMenuUsuarioControlador = pnlMenuUsuarioControlador;
		this.idPelicula = idPelicula;
		this.usuario = usuario;

		modelo = new MenuComentarioModelo(new ComentarioRepositorio(openConexion));
		vista = new MenuComentariosVista();

		modelo.generarModeloComentarios(vista.tablaComentarios, idPelicula);
		modelo.cargarModeloComentario(vista.tablaComentarios);

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

		vista.btnComentar.addActionListener((e) -> {
			agregarComentario();
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

	private void agregarComentario() {
		Comentario comentario = new Comentario();
		comentario.setIdPelicula(idPelicula);
		comentario.setUser(usuario.getUser());
		comentario.setComentario(vista.txtNuevoComentario.getText());

		String seleccion = (String) vista.comboBoxPuntuacion.getSelectedItem();

		int puntuacion;
		switch (seleccion) {
		case "1/5":
			puntuacion = 1;
			break;
		case "2/5":
			puntuacion = 2;
			break;
		case "3/5":
			puntuacion = 3;
			break;
		case "4/5":
			puntuacion = 4;
			break;
		case "5/5":
			puntuacion = 5;
			break;
		default:
			JOptionPane.showMessageDialog(null, "Seleccione una puntuación", "Advertencia",
					JOptionPane.WARNING_MESSAGE);
			return;
		}

		comentario.setPuntuacion(puntuacion);

		boolean agregarComentario = modelo.agregarComentario(comentario);
		if (agregarComentario) {
			System.out.println("Comentario registrado con éxito.");
			modelo.generarModeloComentarios(vista.tablaComentarios, idPelicula);
			modelo.cargarModeloComentario(vista.tablaComentarios);
		} else {
			System.out.println("Error al registrar el comentario.");
		}
	}

}

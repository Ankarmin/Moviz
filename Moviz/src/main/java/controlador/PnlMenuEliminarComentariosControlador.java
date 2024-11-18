package controlador;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import modelo.MenuEliminarComentariosModelo;
import repositorio.Comentario;
import repositorio.ComentarioRepositorio;
import repositorio.Pelicula;
import repositorio.PeliculaRepositorio;
import vista.MenuEliminarComentariosVista;

public class PnlMenuEliminarComentariosControlador {

	private final FrameControlador frameControlador;
	private final MenuEliminarComentariosVista vista;
	private final MenuEliminarComentariosModelo modelo;
	private final PnlMenuAdministradorControlador menuAdministradorControlador;

	private Pelicula peliculaSeleccionada;
	private Comentario comentarioSeleccionado;

	public PnlMenuEliminarComentariosControlador(Connection openConexion, FrameControlador frameControlador,
			PnlMenuAdministradorControlador menuAdministradorControlador) {
		this.frameControlador = frameControlador;
		this.menuAdministradorControlador = menuAdministradorControlador;

		vista = new MenuEliminarComentariosVista();
		modelo = new MenuEliminarComentariosModelo(new PeliculaRepositorio(openConexion),
				new ComentarioRepositorio(openConexion));

		modelo.generarModeloTitulos(vista.tblPeliculas, "");
		modelo.cargarModeloTitulos(vista.tblPeliculas);

		setEvents();
		setClickPelicula();
	}

	public final void setEvents() {
		vista.btnVolver.addActionListener((e) -> {
			irAMenuAdministrador();
		});

		vista.btnSalir.addActionListener((e) -> {
			irAMenuLogin();
		});

		vista.txtBuscar.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (vista.txtBuscar.getText().equals("Buscar")) {
					vista.txtBuscar.setText("");
					vista.txtBuscar.setForeground(Color.WHITE);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (vista.txtBuscar.getText().isEmpty()) {
					vista.txtBuscar.setForeground(Color.GRAY);
					vista.txtBuscar.setText("Buscar");
				}
			}
		});

		vista.Busqueda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String busqueda = vista.txtBuscar.getText();
				modelo.generarModeloTitulos(vista.tblPeliculas, busqueda);
				modelo.cargarModeloTitulos(vista.tblPeliculas);
			}
		});

		vista.txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
			@Override
			public void keyPressed(java.awt.event.KeyEvent e) {
				if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
					String busqueda = vista.txtBuscar.getText();
					modelo.generarModeloTitulos(vista.tblPeliculas, busqueda);
					modelo.cargarModeloTitulos(vista.tblPeliculas);
				}
			}
		});

		vista.btnEliminar.addActionListener((e) -> {
			eliminarComentario();
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

	private void irAMenuAdministrador() {
		menuAdministradorControlador.mostrar();
	}

	private void setClickPelicula() {
		vista.tblPeliculas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				List<Object> datos = new ArrayList<>();
				int filaSeleccionada = vista.tblPeliculas.getSelectedRow();

				if (filaSeleccionada != -1) {
					for (int i = 0; i < vista.tblPeliculas.getColumnCount(); i++) {
						datos.add(vista.tblPeliculas.getValueAt(filaSeleccionada, i));
					}
				}

				peliculaSeleccionada = Pelicula.toPelicula(datos);
				modelo.generarModeloComentarios(vista.tblComentarios, peliculaSeleccionada.getIdPelicula());
				modelo.cargarModeloComentario(vista.tblComentarios);
				setClickComentario();
				llenarCamposPelicula();
			}
		});
	}

	private void setClickComentario() {
		vista.tblComentarios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				List<Object> datos = new ArrayList<>();
				int filaSeleccionada = vista.tblComentarios.getSelectedRow();

				if (filaSeleccionada != -1) {
					for (int i = 0; i < vista.tblComentarios.getColumnCount(); i++) {
						datos.add(vista.tblComentarios.getValueAt(filaSeleccionada, i));
					}
				}

				comentarioSeleccionado = Comentario.toComentario(datos);
			}
		});
	}

	private void llenarCamposPelicula() {
		Pelicula pelicula = modelo.obtenerPorId(peliculaSeleccionada.getIdPelicula());
		vista.lblNombrePelicula.setText(pelicula.getNombre());
		ImageIcon iconoRedimensionado;

		try {
			Image imagenRedimensionada = ImageIO.read(pelicula.getImagen()).getScaledInstance(250, 360,
					Image.SCALE_SMOOTH);
			iconoRedimensionado = new ImageIcon(imagenRedimensionada);

		} catch (IOException e) {
			iconoRedimensionado = new ImageIcon(getClass().getResource("/Images/ImagenPelicula.png"));
		}
		vista.lblImagenPelicula.setIcon(iconoRedimensionado);
		vista.lblImagenPelicula.setHorizontalAlignment(SwingConstants.CENTER);
	}

	private void eliminarComentario() {
		boolean comentarioEliminado = modelo.eliminarComentario(comentarioSeleccionado.getIdComentario());
		if (comentarioEliminado) {
			System.out.println("Comentario eliminado con éxito.");
			modelo.generarModeloComentarios(vista.tblComentarios, peliculaSeleccionada.getIdPelicula());
			modelo.cargarModeloComentario(vista.tblComentarios);
		} else {
			System.out.println("Error al eliminar el Comentario.");
		}
	}
}

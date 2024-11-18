package controlador;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.Connection;
import java.time.LocalTime;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import modelo.MenuUsuarioModelo;
import repositorio.Pelicula;
import repositorio.PeliculaFavorita;
import repositorio.PeliculaFavoritaRepositorio;
import repositorio.PeliculaRepositorio;
import repositorio.Usuario;
import vista.MenuUsuarioVista;

public class PnlMenuUsuarioControlador {

	private final FrameControlador frameControlador;

	private final MenuUsuarioVista vista;
	private final MenuUsuarioModelo modelo;

	private final PnlMenuPeliculasControlador menuPeliculasControlador;
	private final PnlMenuBuscadorControlador menuBuscadorControlador;
	private final PnlMenuFavoritasControlador menuFavoritasControlador;

	private final Usuario usuario;

	public PnlMenuUsuarioControlador(Connection openConexion, FrameControlador frameControlador, Usuario usuario) {
		this.frameControlador = frameControlador;
		this.usuario = usuario;

		vista = new MenuUsuarioVista();
		modelo = new MenuUsuarioModelo(new PeliculaRepositorio(openConexion),
				new PeliculaFavoritaRepositorio(openConexion));

		menuPeliculasControlador = new PnlMenuPeliculasControlador(openConexion, frameControlador, this, usuario);
		menuBuscadorControlador = new PnlMenuBuscadorControlador(openConexion, frameControlador, this, usuario);
		menuFavoritasControlador = new PnlMenuFavoritasControlador(openConexion, frameControlador, this, usuario);

		setEvents();
		setSaludo();
		mostrarPeliculasEnHistorial();
		mostrarPeliculasEnFavoritos();
	}

	public final void setEvents() {
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
				String busqueda = vista.txtBuscar.getText();
				irAMenuBusqueda(busqueda);
			}
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

		vista.txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
			@Override
			public void keyPressed(java.awt.event.KeyEvent e) {
				if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
					String busqueda = vista.txtBuscar.getText();
					irAMenuBusqueda(busqueda);
				}
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

	private void irAMenuLogin() {
		frameControlador.getMenuLoginControlador().mostrar();
	}

	private void irAMenuPeliculas() {
		menuPeliculasControlador.mostrar();
	}

	private void irAMenuFavoritas() {
		menuFavoritasControlador.mostrar();
	}

	private void irAMenuBusqueda(String busqueda) {
		menuBuscadorControlador.mostrar(busqueda);
	}

	public FrameControlador getFrameControlador() {
		return frameControlador;
	}

	public PnlMenuPeliculasControlador getMenuPeliculasControlador() {
		return menuPeliculasControlador;
	}

	public PnlMenuBuscadorControlador getMenuBuscadorControlador() {
		return menuBuscadorControlador;
	}

	public PnlMenuFavoritasControlador getMenuFavoritasControlador() {
		return menuFavoritasControlador;
	}

	private void setSaludo() {
		LocalTime currentTime = LocalTime.now();
		String saludo;

		if (currentTime.isBefore(LocalTime.NOON)) {
			saludo = "Buenos días " + usuario.getUser() + ", estas son algunas de las películas que puedes ver...";
		} else if (currentTime.isBefore(LocalTime.of(18, 0))) {
			saludo = "Buenas tardes " + usuario.getUser() + ", estas son algunas de las películas que puedes ver...";
		} else {
			saludo = "Buenas noches " + usuario.getUser() + ", estas son algunas de las películas que puedes ver...";
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
			panelItem.setLayout(new BoxLayout(panelItem, BoxLayout.Y_AXIS));

			JLabel lblImagen = new JLabel();
			ImageIcon iconoRedimensionado;

			try {
				Image imagen = ImageIO.read(pelicula.getImagen()).getScaledInstance(160, 200, Image.SCALE_SMOOTH);
				iconoRedimensionado = new ImageIcon(imagen);
			} catch (IOException e) {
				iconoRedimensionado = new ImageIcon(getClass().getResource("/Images/ImagenPelicula.png"));
			}

			lblImagen.setIcon(iconoRedimensionado);
			lblImagen.setAlignmentX(JLabel.CENTER_ALIGNMENT);

			lblImagen.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					irAPelicula(pelicula.getIdPelicula());
				}
			});

			JLabel lblTitulo = new JLabel(pelicula.getNombre());
			lblTitulo.setForeground(Color.WHITE);
			lblTitulo.setAlignmentX(JLabel.CENTER_ALIGNMENT);

			panelItem.add(lblImagen);
			panelItem.add(lblTitulo);

			panelItem.setPreferredSize(new Dimension(160, 240));
			vista.panel_4.add(panelItem);
		}
	}

	public void mostrarPeliculasEnFavoritos() {
		List<PeliculaFavorita> listaPeliculasFavoritas = modelo.obtenerPeliculasFavoritas(usuario.getId());
		vista.panel_6.removeAll();
		vista.panel_6.revalidate();
		vista.panel_6.repaint();

		for (int i = 0; i < Math.min(listaPeliculasFavoritas.size(), 5); i++) {
			PeliculaFavorita peliculaFavorita = listaPeliculasFavoritas.get(i);
			Pelicula pelicula = modelo.obtenerPelicula(peliculaFavorita.getIdPelicula());

			JPanel panelItem = new JPanel();
			panelItem.setLayout(new BoxLayout(panelItem, BoxLayout.Y_AXIS));

			JLabel lblImagen = new JLabel();
			ImageIcon iconoRedimensionado;

			try {
				Image imagen = ImageIO.read(pelicula.getImagen()).getScaledInstance(160, 200, Image.SCALE_SMOOTH);
				iconoRedimensionado = new ImageIcon(imagen);
			} catch (IOException e) {
				iconoRedimensionado = new ImageIcon(getClass().getResource("/Images/ImagenPelicula.png"));
			}

			lblImagen.setIcon(iconoRedimensionado);
			lblImagen.setAlignmentX(JLabel.CENTER_ALIGNMENT);

			lblImagen.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					irAPelicula(pelicula.getIdPelicula());
				}
			});

			JLabel lblTitulo = new JLabel(pelicula.getNombre());
			lblTitulo.setForeground(Color.WHITE);
			lblTitulo.setAlignmentX(JLabel.CENTER_ALIGNMENT);

			panelItem.add(lblImagen);
			panelItem.add(lblTitulo);

			panelItem.setPreferredSize(new Dimension(160, 240));
			vista.panel_6.add(panelItem);
		}
	}

	private void irAPelicula(int id) {
		PnlMenuPeliculaControlador menuPeliculaControlador = new PnlMenuPeliculaControlador(
				frameControlador.getOpenConexion(), frameControlador, this, usuario, id);
		menuPeliculaControlador.mostrar();
	}
}

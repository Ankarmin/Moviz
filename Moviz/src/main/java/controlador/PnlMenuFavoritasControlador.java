package controlador;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
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

import modelo.MenuFavoritasModelo;
import repositorio.Pelicula;
import repositorio.PeliculaFavorita;
import repositorio.PeliculaFavoritaRepositorio;
import repositorio.Usuario;
import vista.MenuFavoritasVista;

public class PnlMenuFavoritasControlador {

	private final FrameControlador frameControlador;
	private final PnlMenuUsuarioControlador pnlMenuUsuarioControlador;

	private final MenuFavoritasVista vista;
	private final MenuFavoritasModelo modelo;

	private final Usuario usuario;

	public PnlMenuFavoritasControlador(Connection openConexion, FrameControlador frameControlador,
			PnlMenuUsuarioControlador pnlMenuUsuarioControlador, Usuario usuario) {
		this.pnlMenuUsuarioControlador = pnlMenuUsuarioControlador;
		this.frameControlador = frameControlador;
		this.usuario = usuario;

		vista = new MenuFavoritasVista();
		modelo = new MenuFavoritasModelo(new PeliculaFavoritaRepositorio(openConexion));

		setEvents();
	}

	public final void setEvents() {
		vista.btnPeliculas.addActionListener((e) -> {
			irAMenuPeliculas();
		});

		vista.btnSalir.addActionListener((e) -> {
			irAMenuLogin();
		});

		vista.lblBusqueda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String busqueda = vista.txtBuscar.getText();
				irAMenuBusqueda(busqueda);
			}
		});

		vista.lblIconoLogo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				irAMenuUsuario();
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
	}

	public void mostrar() {
		mostrarPeliculasEnFavoritos();
		frameControlador.getFrameVista().pnlContenido.removeAll();
		frameControlador.getFrameVista().pnlContenido.add(vista);
		frameControlador.getFrameVista().pnlContenido.revalidate();
		frameControlador.getFrameVista().pnlContenido.repaint();
	}

	public void mostrarPeliculasEnFavoritos() {
		List<PeliculaFavorita> listaPeliculasFavoritas = modelo.obtenerPeliculasFavoritas(usuario.getId());
		vista.pnlGrid.removeAll();
		vista.pnlGrid.revalidate();
		vista.pnlGrid.repaint();

		for (PeliculaFavorita peliculaFavorita : listaPeliculasFavoritas) {
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
			vista.pnlGrid.add(panelItem);
		}
	}

	private void irAMenuLogin() {
		frameControlador.getMenuLoginControlador().mostrar();
	}

	private void irAMenuPeliculas() {
		pnlMenuUsuarioControlador.getMenuPeliculaControlador().mostrar();
	}

	private void irAMenuBusqueda(String busqueda) {
		pnlMenuUsuarioControlador.getMenuBuscadorControlador().mostrar(busqueda);
	}

	private void irAMenuUsuario() {
		pnlMenuUsuarioControlador.mostrar();
	}

	private void irAPelicula(int id) {
		PnlPeliculaControlador peliculaControlador = new PnlPeliculaControlador(frameControlador.getOpenConexion(),
				frameControlador, pnlMenuUsuarioControlador, usuario, id);
		peliculaControlador.mostrar();
	}
}

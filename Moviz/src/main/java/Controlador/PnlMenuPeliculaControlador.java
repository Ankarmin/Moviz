package Controlador;

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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import DBRepositorio.Pelicula;
import DBRepositorio.PeliculaRepositorio;
import Modelo.MenuPeliculasModelo;
import Vista.MenuPeliculasVista;

public class PnlMenuPeliculaControlador {

	private final FrameControlador frameControlador;
	private final MenuPeliculasVista vista;
	private final MenuPeliculasModelo modelo;

	public PnlMenuPeliculaControlador(Connection openConexion, FrameControlador frameControlador) {
		this.frameControlador = frameControlador;

		vista = new MenuPeliculasVista();
		modelo = new MenuPeliculasModelo(new PeliculaRepositorio(openConexion));
		setEvents();
	}

	public final void setEvents() {
		vista.btnHistorial.addActionListener((e) -> {
			irAHistorial();
		});

		vista.btnSalir.addActionListener((e) -> {
			irALogin();
		});

		vista.comboBoxGenero.addActionListener(e -> {
			String opcionSeleccionada = (String) vista.comboBoxGenero.getSelectedItem();
			if (!opcionSeleccionada.equals("Todos")) {
				JOptionPane.showMessageDialog(vista, "Seleccionaste género: " + opcionSeleccionada);
			}
		});

		vista.comboBoxAño.addActionListener(e -> {
			String opcionSeleccionada = (String) vista.comboBoxAño.getSelectedItem();
			JOptionPane.showMessageDialog(vista, "Seleccionaste año: " + opcionSeleccionada);
		});

		vista.comboBoxPuntuacion.addActionListener(e -> {
			String opcionSeleccionada = (String) vista.comboBoxPuntuacion.getSelectedItem();
			JOptionPane.showMessageDialog(vista, "Seleccionaste puntuación: " + opcionSeleccionada);
		});

		vista.lblBusqueda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				irABusqueda();
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
		mostrarPeliculasEnVista();
		frameControlador.getFrameVista().pnlContenido.removeAll();
		frameControlador.getFrameVista().pnlContenido.add(vista);
		frameControlador.getFrameVista().pnlContenido.revalidate();
		frameControlador.getFrameVista().pnlContenido.repaint();
	}

	private void irALogin() {
		frameControlador.getLoginControlador().mostrar();
	}

	private void irAHistorial() {
		frameControlador.getHistorialControlador().mostrar();
	}

	public void mostrarPeliculasEnVista() {
		List<Pelicula> listaPeliculas = modelo.getPeliculaRepositorio().obtenerTodos();
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

	private void irABusqueda() {
		frameControlador.getBuscadorDePeliculasControlador().mostrar();
	}

	private void irAMenuUsuario() {
		frameControlador.getMenuUsuarioControlador().mostrar();
	}

	private void irAPelicula(int id) {
		PnlPeliculaControlador peliculaControlador = new PnlPeliculaControlador(frameControlador.getOpenConexion(),
				frameControlador, id);
		peliculaControlador.mostrar();
	}
}

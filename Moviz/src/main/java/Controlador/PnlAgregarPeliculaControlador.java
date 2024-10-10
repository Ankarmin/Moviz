package Controlador;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import DBRepositorio.Pelicula;
import DBRepositorio.PeliculaRepositorio;
import Modelo.AgregarPeliculaModelo;
import Vista.AgregarPeliculaVista;

public class PnlAgregarPeliculaControlador {

	private final FrameControlador frameControlador;
	private final AgregarPeliculaVista vista;
	private final AgregarPeliculaModelo modelo;

	public PnlAgregarPeliculaControlador(Connection openConexion, FrameControlador frameControlador) {
		this.frameControlador = frameControlador;

		vista = new AgregarPeliculaVista();
		modelo = new AgregarPeliculaModelo(new PeliculaRepositorio(openConexion));

		setEvents();
	}

	public final void setEvents() {
		vista.btnVolver.addActionListener((e) -> {
			frameControlador.getMenuAdministradorControlador().mostrar();
		});

		vista.btnAñadirPelicula.addActionListener((e) -> {
			añadirPelicula();
		});

		vista.btnSubirImagen.addActionListener((e) -> {
			JFileChooser jfc = new JFileChooser();
			int ap = jfc.showOpenDialog(vista);
			if (ap == JFileChooser.APPROVE_OPTION) {
				String ruta = jfc.getSelectedFile().getAbsolutePath();
				vista.txtRutaImagen.setText(ruta);
			}
		});
	}

	private void añadirPelicula() {
		String nombre = vista.txtTitulo.getText();
		int anioEstreno = Integer.parseInt(vista.txtAnioPublicacion.getText());
		String genero = (String) vista.cmbGenero.getSelectedItem();
		String duracion = vista.txtDuracionAprox.getText();
		String sinopsis = vista.txtSinopsis.getText();
		String ruta = vista.txtRutaImagen.getText().trim();
		File file = new File(ruta);
		FileInputStream imagen = null;
		try {
			imagen = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(vista,
					"Archivo no encontrado o inválido. Por favor, selecciona una imagen válida.");
			return;
		}

		Pelicula pelicula = new Pelicula();
		pelicula.setNombre(nombre);
		pelicula.setAnioEstreno(anioEstreno);
		pelicula.setGenero(genero);
		pelicula.setDuracion(duracion);
		pelicula.setSinopsis(sinopsis);
		pelicula.setImagen(imagen);

		boolean peliculaAgregada = modelo.agregarPelicula(pelicula);
		if (peliculaAgregada) {
			System.out.println("Pelicula agregada con éxito.");
			limpiar(); // LIMPIAR LOS CAMPOS SI TODO VA BIEN
		} else {
			System.out.println("Error al agregar la Película.");
		}
	}

	private void limpiar() {
		vista.txtTitulo.setText("");
		vista.txtAnioPublicacion.setText("");
		vista.cmbGenero.setSelectedItem(0);
		vista.txtDuracionAprox.setText("");
		vista.txtSinopsis.setText("");
		vista.txtRutaImagen.setText("");
	}

	public void mostrar() {
		frameControlador.getFrameVista().pnlContenido.removeAll();
		frameControlador.getFrameVista().pnlContenido.add(vista);
		frameControlador.getFrameVista().pnlContenido.revalidate();
		frameControlador.getFrameVista().pnlContenido.repaint();
	}
}

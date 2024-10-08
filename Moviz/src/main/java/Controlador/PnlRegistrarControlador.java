package Controlador;

import java.sql.Connection;

import DBRepositorio.Cliente;
import DBRepositorio.ClienteRepositorio;
import DBRepositorio.Usuario;
import DBRepositorio.UsuarioRepositorio;
import Modelo.RegistrarModelo;
import Vista.RegistrarVista;

public class PnlRegistrarControlador {

	private final FrameControlador frameControlador;
	private final RegistrarVista vista;
	private final RegistrarModelo registrarModelo;

	public PnlRegistrarControlador(Connection openConexion, FrameControlador frameControlador) {

		this.frameControlador = frameControlador;

		vista = new RegistrarVista();
		registrarModelo = new RegistrarModelo(new UsuarioRepositorio(openConexion),
				new ClienteRepositorio(openConexion));

		setEvents();
	}

	// MÉTODO QUE CONFIGURA LOS EVENTOS DE CLICK DE LOS BOTONES DE BIBLIOTECAVISTA
	public void setEvents() {
		vista.btnRegistrar.addActionListener((e) -> {
			registrar();
		});

		vista.btnIniciarSesion.addActionListener((e) -> {
			irLogin();
			limpiar();
		});
	}

	public void mostrar() {
		frameControlador.getFrameVista().pnlContenido.removeAll();
		frameControlador.getFrameVista().pnlContenido.add(vista);
		frameControlador.getFrameVista().pnlContenido.revalidate();
		frameControlador.getFrameVista().pnlContenido.repaint();
	}

	private void limpiar() {
		vista.txtUser.setText("");
		vista.txtPassword.setText("");
		vista.txtEmail.setText("");
	}

	private void registrar() {
	    String username = vista.txtUser.getText();
	    String password = vista.txtPassword.getText();
	    String email = vista.txtEmail.getText();
	}

	private void irLogin() {
		frameControlador.getLoginControlador().mostrar();
	}

	public RegistrarVista getVista() {
		return vista;
	}
}

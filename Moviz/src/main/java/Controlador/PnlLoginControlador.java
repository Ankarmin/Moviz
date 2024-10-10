package Controlador;

import java.sql.Connection;

import javax.swing.JOptionPane;

import DBRepositorio.AdministradorRepositorio;
import DBRepositorio.ClienteRepositorio;
import DBRepositorio.UsuarioRepositorio;
import Modelo.LoginModelo;
import Vista.LoginVista;

public class PnlLoginControlador {

	private final FrameControlador frameControlador;
	private final LoginVista vista;
	private final LoginModelo modelo;

	public PnlLoginControlador(Connection openConexion, FrameControlador frameControlador) {

		this.frameControlador = frameControlador;

		vista = new LoginVista();
		modelo = new LoginModelo(new UsuarioRepositorio(openConexion), new ClienteRepositorio(openConexion),
				new AdministradorRepositorio(openConexion));

		vista.btnIngresar.addActionListener((e) -> {
			iniciarSesion();
			limpiar();
		});

		vista.btnRegistrar.addActionListener((e) -> {
			irARegistrar();
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
	}

	private void iniciarSesion() {
		String user = vista.txtUser.getText();
		String password = new String(vista.txtPassword.getPassword());

		// LLAMO A MI MÉTODO LOGIN DEL MODELO PARA SABER EL ROL
		String rol = modelo.login(user, password);

		if (rol != null) {
			if (rol.equals("cliente")) {
				frameControlador.getMenuUsuarioControlador().mostrar();
			} else if (rol.equals("administrador")) {
				frameControlador.getMenuAdministradorControlador().mostrar();
			}
		} else {
			// SI NO ENCUENTRA USUARIO
			JOptionPane.showMessageDialog(vista, "Usuario o contraseña incorrectos", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	private void irARegistrar() {
		frameControlador.getRegistrarControlador().mostrar();
	}

	public LoginVista getVista() {
		return vista;
	}
}

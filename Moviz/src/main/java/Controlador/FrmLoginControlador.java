package Controlador;

import Vista.LoginVista;

public class FrmLoginControlador {

	// VISTA DEL CONTROLADOR AL INICIAR EL PROGRAMA
	private final LoginVista frmLogin;

	// TODOS LOS DEMÁS CONTROLADORES

	// CONSTRUCTOR DEL CONTROLADOR DEL FRAME LoginVista
	public FrmLoginControlador() {

		frmLogin = new LoginVista();

		// INSTANCIAMOS LOS DEMAS CONTROLADORES

		// MÉTODO QUE AGREGA EL EVENTO DE LOS BOTONES
		setEvents();
	}

	private void setEvents() {
	}

	public void iniciar() {
		frmLogin.setLocationRelativeTo(null);
		frmLogin.setVisible(true);
	}
	
	//SE DEBE HACER RETORNOS DE LOS CONTROLADORES
}

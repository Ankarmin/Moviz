package tempRunner;

import javax.swing.UIManager;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;

import Controlador.FrmLoginControlador;

public class App {

	// METODO MAIN PARA INCIAR EL PROGRAMA
	public static void main(String[] args) {

		// FUNCION RARA PARA INCIAR LOS ESTILOS DE FLATLAF
		FlatArcDarkOrangeIJTheme.setup();

		// FUNCION RARA PARA INCIAR LOS ESTILOS DE ELEMENTOS
		UIManager.put("Button.arc", 999);
		UIManager.put("Component.arc", 999);
		UIManager.put("ProgressBar.arc", 999);
		UIManager.put("TextComponent.arc", 999);
		UIManager.put("Component.focusWidth", 0);

		// INSTANCIACION DEL CONTROLADOR MAESTRO
		FrmLoginControlador controladorLogin = new FrmLoginControlador();

		// METODO QUE CARGA EL JFRAME INICIAL (LA VENTANA)
		controladorLogin.iniciar();

	}
}

package runner;

import javax.swing.UIManager;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;

import controlador.FrameControlador;

public class App {

	public static void main(String[] args) {

		FlatArcDarkOrangeIJTheme.setup();

		UIManager.put("Button.arc", 999);
		UIManager.put("Component.arc", 999);
		UIManager.put("ProgressBar.arc", 999);
		UIManager.put("TextComponent.arc", 999);
		UIManager.put("Component.focusWidth", 0);

		FrameControlador frameControlador = new FrameControlador();

		frameControlador.iniciar();
	}
}

package Vista;

import javax.swing.JPanel;
import java.awt.Color;

public class MenuPeliculasVista extends JPanel {

	private static final long serialVersionUID = 1L;

	public MenuPeliculasVista() {
		setBackground(new Color(66, 72, 93));
		setLayout(null); // IMPORTANTE
		setBounds(0, 0, 1140, 640); // IMPORTANTE

		// Utilizar el siguiente codigo para poner la imagen que desees: setIcon(new
		// ImageIcon(getClass().getResource("/Images/NOMBREDETUIMAGEN.png"))
		// Esa imagen tuvo que haber sido subida en la carpeta
		// Moviz\src\main\resources\Images
		initStyles();

	}

	private void initStyles() {

	}
}

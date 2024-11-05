package Vista;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class EliminarPeliculaVista2 extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	public EliminarPeliculaVista2() {
		setBackground(new Color(66, 72, 93));
		setBounds(0, 0, 1140, 640);
		setLayout(new BorderLayout(0, 0));
		
		JPanel pnlPrincipal = new JPanel();
		add(pnlPrincipal, BorderLayout.CENTER);
		pnlPrincipal.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlSuperior = new JPanel();
		pnlSuperior.setBackground(new Color(56, 59, 74));
		pnlPrincipal.add(pnlSuperior, BorderLayout.NORTH);
		pnlSuperior.setLayout(new BorderLayout(0, 0));
		
		JLabel lblIconoLogo = new JLabel("");
		lblIconoLogo.setHorizontalAlignment(SwingConstants.LEFT);
		lblIconoLogo.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacionAdministrador.png")));
		lblIconoLogo.setBounds(4, 6, 578, 56);
		pnlSuperior.add(lblIconoLogo, BorderLayout.WEST);
		
		JPanel pnlSalir = new JPanel();
		pnlSuperior.add(pnlSalir, BorderLayout.EAST);
		pnlSalir.setBackground(new Color(56, 59, 74));
		pnlSalir.setLayout(new BorderLayout(0, 0));
		
		JButton btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon(getClass().getResource("/Images/iconosalida.png")));
		pnlSalir.add(btnSalir);
		
		JLabel lblVacioSuperior = new JLabel("   ");
		pnlSalir.add(lblVacioSuperior, BorderLayout.NORTH);
		
		JLabel lblVacioInferior = new JLabel("    ");
		pnlSalir.add(lblVacioInferior, BorderLayout.SOUTH);
		
		JLabel lblVacioDerecha = new JLabel("   ");
		pnlSalir.add(lblVacioDerecha, BorderLayout.EAST);
		
		JPanel pnlCentral = new JPanel();
		pnlCentral.setBackground(new Color(66, 72, 93));
		pnlPrincipal.add(pnlCentral, BorderLayout.CENTER);
		pnlCentral.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlCentralSuperior = new JPanel();
		pnlCentralSuperior.setBackground(new Color(66, 72, 93));
		pnlCentral.add(pnlCentralSuperior, BorderLayout.NORTH);
		pnlCentralSuperior.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("      ");
		pnlCentralSuperior.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel pnlAñadirPeliculas = new JPanel();
		pnlAñadirPeliculas.setBackground(new Color(66, 72, 93));
		pnlCentralSuperior.add(pnlAñadirPeliculas, BorderLayout.WEST);
		pnlAñadirPeliculas.setLayout(new BorderLayout(0, 0));
		
		JLabel lblVacio1 = new JLabel("                ");
		pnlAñadirPeliculas.add(lblVacio1, BorderLayout.WEST);
		
		JLabel lblVacio2 = new JLabel("      ");
		pnlAñadirPeliculas.add(lblVacio2, BorderLayout.NORTH);
		
		JLabel lblTituloSeccion = new JLabel("Eliminar Películas");
		lblTituloSeccion.setForeground(Color.WHITE);
		lblTituloSeccion.setFont(new Font("Microsoft YaHei", Font.BOLD, 21));
		pnlAñadirPeliculas.add(lblTituloSeccion, BorderLayout.CENTER);
		
		JPanel pnlBtnVolver = new JPanel();
		pnlBtnVolver.setBackground(new Color(66, 72, 93));
		pnlCentralSuperior.add(pnlBtnVolver, BorderLayout.EAST);
		pnlBtnVolver.setLayout(new BorderLayout(0, 0));
		
		JLabel lblVacio3 = new JLabel("                ");
		pnlBtnVolver.add(lblVacio3, BorderLayout.EAST);
		
		JLabel lblVacio4 = new JLabel("       ");
		pnlBtnVolver.add(lblVacio4, BorderLayout.NORTH);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVolver.setBackground(new Color(255, 128, 0));
		pnlBtnVolver.add(btnVolver, BorderLayout.CENTER);
		
		JPanel pnlLinea = new JPanel();
		pnlLinea.setBackground(new Color(66, 72, 93));
		pnlCentralSuperior.add(pnlLinea, BorderLayout.SOUTH);
		pnlLinea.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("             ");
		pnlLinea.add(lblNewLabel_4, BorderLayout.WEST);
		
		JLabel lblNewLabel_5 = new JLabel("             ");
		pnlLinea.add(lblNewLabel_5, BorderLayout.EAST);
		
		JSeparator separator = new JSeparator();
		pnlLinea.add(separator, BorderLayout.CENTER);
		
		JLabel lblNewLabel_3 = new JLabel("            ");
		pnlLinea.add(lblNewLabel_3, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		pnlCentral.add(panel, BorderLayout.CENTER);
	}

}

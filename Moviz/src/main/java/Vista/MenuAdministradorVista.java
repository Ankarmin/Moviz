package Vista;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.border.LineBorder;

public class MenuAdministradorVista extends JPanel {

	private static final long serialVersionUID = 1L;
	public JButton btnSalir;
	public JButton btnEliminarPelicula;
	public JLabel lblComentarios;
	public JButton btnEliminarComentario;
	public JButton btnAgregarPelicula;
	public JLabel lblIconoLogo;
	public JLabel lblPeliculas;
	public JPanel pnlLineaBlanca;
	public JLabel lblMenuAdministrador;
	public JPanel pnlLineaBlanca_1;
	public JPanel pnlLineaBlanca_1_1;
	public JPanel pnlCabecera;

	public MenuAdministradorVista() {
		setBackground(new Color(66, 72, 93));
		setBorder(null);
		setLayout(null); // IMPORTANTE
		setBounds(0, 0, 1140, 640); // IMPORTANTE

		btnSalir = new JButton("");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalir.setIcon(new ImageIcon(getClass().getResource("/Images/iconosalida.png")));
		btnSalir.setBounds(1054, 15, 42, 46);
		add(btnSalir);

		lblIconoLogo = DefaultComponentFactory.getInstance().createLabel("");
		lblIconoLogo.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacionAdministrador.png")));
		lblIconoLogo.setBounds(4, 6, 578, 56);
		add(lblIconoLogo);

		btnAgregarPelicula = new JButton("Agregar Película");
		btnAgregarPelicula.setForeground(new Color(255, 255, 255));
		btnAgregarPelicula.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		btnAgregarPelicula.setBackground(new Color(247, 114, 15));
		btnAgregarPelicula.setBounds(171, 299, 283, 38);
		add(btnAgregarPelicula);

		btnEliminarPelicula = new JButton("Eliminar Película");
		btnEliminarPelicula.setForeground(new Color(255, 255, 255));
		btnEliminarPelicula.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		btnEliminarPelicula.setBackground(new Color(255, 128, 0));
		btnEliminarPelicula.setBounds(171, 382, 283, 38);
		add(btnEliminarPelicula);

		lblPeliculas = new JLabel("Películas");
		lblPeliculas.setFont(new Font("Microsoft YaHei", Font.BOLD, 25));
		lblPeliculas.setBounds(253, 231, 109, 21);
		add(lblPeliculas);

		lblComentarios = new JLabel("Comentarios");
		lblComentarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblComentarios.setFont(new Font("Microsoft YaHei", Font.BOLD, 25));
		lblComentarios.setBounds(748, 221, 183, 40);
		add(lblComentarios);

		btnEliminarComentario = new JButton("Eliminar comentario");
		btnEliminarComentario.setForeground(new Color(255, 255, 255));
		btnEliminarComentario.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		btnEliminarComentario.setBackground(new Color(255, 128, 0));
		btnEliminarComentario.setBounds(694, 332, 283, 38);
		add(btnEliminarComentario);

		pnlCabecera = new JPanel();
		pnlCabecera.setBackground(new Color(56, 59, 74));
		pnlCabecera.setBounds(-85, 0, 1225, 69);
		add(pnlCabecera);

		pnlLineaBlanca = new JPanel();
		pnlLineaBlanca.setBackground(Color.WHITE);
		pnlLineaBlanca.setBounds(26, 143, 1060, 2);
		add(pnlLineaBlanca);

		lblMenuAdministrador = DefaultComponentFactory.getInstance().createLabel("Menu administrador");
		lblMenuAdministrador.setFont(new Font("Microsoft YaHei", Font.BOLD, 21));
		lblMenuAdministrador.setForeground(new Color(255, 255, 255));
		lblMenuAdministrador.setBounds(26, 108, 227, 29);
		add(lblMenuAdministrador);

		pnlLineaBlanca_1 = new JPanel();
		pnlLineaBlanca_1.setBackground(Color.WHITE);
		pnlLineaBlanca_1.setBounds(120, 263, 400, 2);
		add(pnlLineaBlanca_1);

		pnlLineaBlanca_1_1 = new JPanel();
		pnlLineaBlanca_1_1.setBackground(Color.WHITE);
		pnlLineaBlanca_1_1.setBounds(642, 263, 400, 2);
		add(pnlLineaBlanca_1_1);

		initStyles();
	}

	private void initStyles() {

	}
}

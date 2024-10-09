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
	public JLabel lblNewLabel;
	public JButton btnSalir;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton_2;
	private JTextField txtBuscar;


	public MenuAdministradorVista() {
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
		
		

		JButton BotonHistorial = new JButton("Historial");
		BotonHistorial.setBounds(878, 19, 120, 35);
		add(BotonHistorial);
		
		JButton BotonPeliculas = new JButton("PELICULAS");
		BotonPeliculas.setBounds(748, 19, 120, 35);
		add(BotonPeliculas);
		
		JLabel Busqueda = DefaultComponentFactory.getInstance().createLabel("");
		Busqueda.setIcon(new ImageIcon(getClass().getResource("/Images/BuscarIcono.png")));
		Busqueda.setBounds(280, 17, 40, 40);
		add(Busqueda);
		
		
		JLabel IconoLogo = DefaultComponentFactory.getInstance().createLabel("");
		IconoLogo.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacion.png")));
		IconoLogo.setBounds(4, 6, 283, 56);
		add(IconoLogo);
		
		txtBuscar = new JTextField();
		txtBuscar.setText("Buscar");
		txtBuscar.setBounds(322, 21, 407, 32);
		add(txtBuscar);
		txtBuscar.setColumns(10);


		
		JButton btnNewButton = new JButton("Agregar Película");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Microsoft YaHei", Font.BOLD, 24));
		btnNewButton.setBackground(new Color(247, 114, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(237, 394, 283, 56);
		add(btnNewButton);
		
		btnNewButton_1 = new JButton("Eliminar Película");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 24));
		btnNewButton_1.setBackground(new Color(255, 128, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(237, 487, 283, 56);
		add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Películas");
		lblNewLabel_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 25));
		lblNewLabel_1.setBounds(323, 334, 109, 21);
		add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Comentarios");
		lblNewLabel_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 25));
		lblNewLabel_2.setBounds(744, 324, 183, 40);
		add(lblNewLabel_2);
		
		btnNewButton_2 = new JButton("Eliminar comentario");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 24));
		btnNewButton_2.setBackground(new Color(255, 128, 0));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(683, 394, 283, 56);
		add(btnNewButton_2);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignOnBaseline(true);
		panel.setBackground(new Color(255, 128, 0));
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(338, 92, 464, 56);
		add(panel);
		
				lblNewLabel = new JLabel("MENU ADMINISTRADOR");
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				panel.add(lblNewLabel);
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
				lblNewLabel.setForeground(new Color(255, 255, 255));
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBorder(new LineBorder(new Color(255, 255, 255)));
		horizontalBox.setBackground(new Color(0, 0, 0));
		horizontalBox.setBounds(739, 362, 170, 3);
		add(horizontalBox);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		horizontalBox_1.setBorder(new LineBorder(new Color(255, 255, 255)));
		horizontalBox_1.setBackground(Color.BLACK);
		horizontalBox_1.setBounds(322, 362, 120, 3);
		add(horizontalBox_1);
		
		JLabel lblNewLabel_3 = new JLabel("Opciones del administrador");
		lblNewLabel_3.setBounds(41, 202, 471, 25);
		add(lblNewLabel_3);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Microsoft YaHei", Font.BOLD, 27));
		
		Box horizontalBox_1_1 = Box.createHorizontalBox();
		horizontalBox_1_1.setBorder(new LineBorder(new Color(255, 255, 255)));
		horizontalBox_1_1.setBackground(Color.BLACK);
		horizontalBox_1_1.setBounds(87, 238, 380, 3);
		add(horizontalBox_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(56, 59, 74));
		panel_1.setBounds(-85, 0, 1225, 69);
		add(panel_1);

		initStyles();
	}

	private void initStyles() {

	}
}

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
	public JButton btnEliminarP;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton_2;
	public JButton btnAgregarP;


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
		
		
		JLabel IconoLogo = DefaultComponentFactory.getInstance().createLabel("");
		IconoLogo.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacionAdministrador.png")));
		IconoLogo.setBounds(4, 6, 578, 56);
		add(IconoLogo);


		
		btnAgregarP = new JButton("Agregar Película");
		btnAgregarP.setForeground(new Color(255, 255, 255));
		btnAgregarP.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		btnAgregarP.setBackground(new Color(247, 114, 15));
		btnAgregarP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAgregarP.setBounds(171, 322, 283, 38);
		add(btnAgregarP);
		
		btnEliminarP = new JButton("Eliminar Película");
		btnEliminarP.setForeground(new Color(255, 255, 255));
		btnEliminarP.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		btnEliminarP.setBackground(new Color(255, 128, 0));
		btnEliminarP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminarP.setBounds(171, 382, 283, 38);
		add(btnEliminarP);
		
		JLabel lblNewLabel_1 = new JLabel("Películas");
		lblNewLabel_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 25));
		lblNewLabel_1.setBounds(253, 267, 168, 21);
		add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Comentarios");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 25));
		lblNewLabel_2.setBounds(748, 257, 183, 40);
		add(lblNewLabel_2);
		
		btnNewButton_2 = new JButton("Eliminar comentario");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		btnNewButton_2.setBackground(new Color(255, 128, 0));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(697, 322, 283, 38);
		add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(56, 59, 74));
		panel_1.setBounds(-85, 0, 1225, 69);
		add(panel_1);

		JPanel LineaBlanca = new JPanel();
		LineaBlanca.setBackground(Color.WHITE); 
		LineaBlanca.setBounds(26, 143, 1060, 2);
		add(LineaBlanca);
		
		JLabel lblNewJgoodiesLabel1 = DefaultComponentFactory.getInstance().createLabel("Menu administrador");
		lblNewJgoodiesLabel1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblNewJgoodiesLabel1.setForeground(new Color(255, 255, 255));
		lblNewJgoodiesLabel1.setBounds(26, 123, 135, 14);
		add(lblNewJgoodiesLabel1);
		
		JPanel LineaBlanca_1 = new JPanel();
		LineaBlanca_1.setBackground(Color.WHITE);
		LineaBlanca_1.setBounds(115, 299, 400, 2);
		add(LineaBlanca_1);
		
		JPanel LineaBlanca_1_1 = new JPanel();
		LineaBlanca_1_1.setBackground(Color.WHITE);
		LineaBlanca_1_1.setBounds(649, 299, 400, 2);
		add(LineaBlanca_1_1);
		
		initStyles();
	}

	private void initStyles() {

	}
}
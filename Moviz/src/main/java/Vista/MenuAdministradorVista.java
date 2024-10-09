package Vista;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.FlowLayout;

public class MenuAdministradorVista extends JPanel {

	private static final long serialVersionUID = 1L;
	public JLabel lblNewLabel;
	public JButton btnSalir;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton_2;

	public MenuAdministradorVista() {
		setBorder(null);
		setLayout(null); // IMPORTANTE
		setBounds(0, 0, 1140, 640); // IMPORTANTE

		lblNewLabel = new JLabel("MENU ADMINISTRADOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(203, -14, 170, 75);
		add(lblNewLabel);

		btnSalir = new JButton("");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalir.setIcon(new ImageIcon(getClass().getResource("/Images/iconosalida.png")));
		btnSalir.setBounds(1054, 15, 42, 46);
		add(btnSalir);
		
		JButton btnNewButton = new JButton("Agregar Película");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(247, 114, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(168, 298, 170, 37);
		add(btnNewButton);
		
		btnNewButton_1 = new JButton("Eliminar Película");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBackground(new Color(255, 128, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(168, 361, 170, 37);
		add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Películas");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(225, 245, 58, 21);
		add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Comentarios");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(550, 248, 87, 14);
		add(lblNewLabel_2);
		
		btnNewButton_2 = new JButton("Eliminar comentario");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBackground(new Color(255, 128, 0));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(514, 322, 170, 37);
		add(btnNewButton_2);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignOnBaseline(true);
		panel.setBackground(new Color(255, 128, 0));
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(0, 83, 335, 37);
		add(panel);
		
		JLabel lblNewLabel_3 = new JLabel("Opciones del administrador");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));

		initStyles();
	}

	private void initStyles() {

	}
}

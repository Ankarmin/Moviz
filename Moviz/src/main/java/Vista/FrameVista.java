package Vista;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FrameVista extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel pnlContenido;

	public FrameVista() {
		setIconImage(new ImageIcon(getClass().getResource("/Images/M.png")).getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);

		setMinimumSize(new Dimension(840, 470));

		pnlContenido = new JPanel();
		pnlContenido.setBorder(new EmptyBorder(5, 5, 5, 5));
		pnlContenido.setLayout(new BorderLayout());

		setContentPane(pnlContenido);
	}
}

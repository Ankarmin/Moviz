package Vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FrameVista extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel pnlContenido;

	public FrameVista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1140, 640);
		pnlContenido = new JPanel();
		pnlContenido.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(pnlContenido);
		pnlContenido.setLayout(null);
	}
}

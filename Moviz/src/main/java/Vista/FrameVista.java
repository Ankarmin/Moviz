package Vista;

import java.awt.Dimension;
import java.awt.BorderLayout;

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
        setBounds(0, 0, 1140, 640);

        setMinimumSize(new Dimension(840, 440));

        pnlContenido = new JPanel();
        pnlContenido.setBorder(new EmptyBorder(5, 5, 5, 5));
        pnlContenido.setLayout(new BorderLayout()); 

        setContentPane(pnlContenido);
    }
}

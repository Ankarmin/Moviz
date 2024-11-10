package Vista;

import java.awt.*;
import javax.swing.*;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PeliculaVista2 extends JPanel {

    private static final long serialVersionUID = 1L;
    public JLabel posterPelicula1;
    private JLabel LblFavoritos;
    private JLabel LblEstrellas;
    private JLabel Busqueda;
    private JLabel IconoLogo;
    private JLabel textPuntuacion;

    public JButton btnAlquilar;
    public JButton btnAlquilado;
    public JButton btnComentarios;
    public JButton btnSalir;
    public JButton btnHistorial;
    public JButton btnPeliculas;

    private JTextField txtBuscar;
    private JLabel titulo1_1;
    private JTextArea txtrTextoSinopsis;
    private JTextArea txtrAadirAFavoritos;
    private JScrollPane scrollSinopsis;
    private JLabel lblSinopsis;

    public PeliculaVista2() {
        setPreferredSize(new Dimension(1140, 640));
        setBackground(new Color(66, 72, 93));
        setLayout(new BorderLayout());

        JPanel pnlSuperior = new JPanel(new BorderLayout());
        pnlSuperior.setBackground(new Color(56, 59, 74));
        add(pnlSuperior, BorderLayout.NORTH);

        IconoLogo = DefaultComponentFactory.getInstance().createLabel("");
        IconoLogo.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacion.png")));
        pnlSuperior.add(IconoLogo, BorderLayout.WEST);

        JPanel pnlCenter = new JPanel(new GridBagLayout());
        pnlCenter.setBackground(new Color(56, 59, 74));
        pnlSuperior.add(pnlCenter, BorderLayout.CENTER);
        
        GridBagConstraints gbcIcon = new GridBagConstraints();
        gbcIcon.insets = new Insets(0, 5, 0, 5);
        gbcIcon.gridx = 0;
        gbcIcon.gridy = 0;
        gbcIcon.anchor = GridBagConstraints.WEST;
        Busqueda = DefaultComponentFactory.getInstance().createLabel("");
        Busqueda.setIcon(new ImageIcon(getClass().getResource("/Images/BuscarIcono.png")));
        pnlCenter.add(Busqueda, gbcIcon);

        GridBagConstraints gbcSearch = new GridBagConstraints();
        gbcSearch.insets = new Insets(0, 5, 0, 5);
        gbcSearch.gridx = 1;
        gbcSearch.gridy = 0;
        gbcSearch.fill = GridBagConstraints.HORIZONTAL;
        gbcSearch.weightx = 1.0; // Make the search bar expand horizontally
        txtBuscar = new JTextField("Buscar", 20);
        pnlCenter.add(txtBuscar, gbcSearch);

        GridBagConstraints gbcPeliculas = new GridBagConstraints();
        gbcPeliculas.insets = new Insets(0, 5, 0, 5);
        gbcPeliculas.gridx = 2;
        gbcPeliculas.gridy = 0;
        btnPeliculas = new JButton("PELICULAS");
        pnlCenter.add(btnPeliculas, gbcPeliculas);

        GridBagConstraints gbcHistorial = new GridBagConstraints();
        gbcHistorial.insets = new Insets(0, 5, 0, 5);
        gbcHistorial.gridx = 3;
        gbcHistorial.gridy = 0;
        btnHistorial = new JButton("HISTORIAL");
        pnlCenter.add(btnHistorial, gbcHistorial);

        btnSalir = new JButton("");
        btnSalir.setIcon(new ImageIcon(getClass().getResource("/Images/iconosalida.png")));
        pnlSuperior.add(btnSalir, BorderLayout.EAST);

        JPanel pnlCentral = new JPanel(new GridBagLayout());
        pnlCentral.setBackground(new Color(66, 72, 93));
        add(pnlCentral, BorderLayout.CENTER); 
        
        GridBagConstraints gbcPoster = new GridBagConstraints();
        gbcPoster.insets = new Insets(10, 10, 10, 10);
        gbcPoster.gridx = 0;
        gbcPoster.gridy = 0;
        gbcPoster.gridheight = 2;
        gbcPoster.anchor = GridBagConstraints.NORTHWEST;

        posterPelicula1 = DefaultComponentFactory.getInstance().createLabel("");
        ImageIcon originalIcon = new ImageIcon(getClass().getResource("/Images/ImagenPelicula.png"));
        Image imagenRedimensionada = originalIcon.getImage().getScaledInstance(300, 323, Image.SCALE_SMOOTH);
        posterPelicula1.setIcon(new ImageIcon(imagenRedimensionada));
        pnlCentral.add(posterPelicula1, gbcPoster);

        GridBagConstraints gbcDetalles = new GridBagConstraints();
        gbcDetalles.insets = new Insets(10, 10, 10, 10);
        gbcDetalles.gridx = 1;
        gbcDetalles.gridy = 0;
        gbcDetalles.gridheight = 1;
        gbcDetalles.fill = GridBagConstraints.HORIZONTAL;
        gbcDetalles.anchor = GridBagConstraints.NORTHWEST;

        JPanel pnlDetalles = new JPanel();
        pnlDetalles.setBackground(new Color(66, 72, 93));
        pnlDetalles.setLayout(new BoxLayout(pnlDetalles, BoxLayout.Y_AXIS));
        pnlCentral.add(pnlDetalles, gbcDetalles);

        titulo1_1 = new JLabel("Minions: Nace un villano");
        titulo1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 24));
        titulo1_1.setForeground(new Color(255, 128, 0));
        titulo1_1.setAlignmentX(Component.CENTER_ALIGNMENT); 
        pnlDetalles.add(titulo1_1);
        
        lblSinopsis = new JLabel("Sinopsis:");
        lblSinopsis.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
        lblSinopsis.setForeground(Color.WHITE);
        lblSinopsis.setAlignmentX(Component.CENTER_ALIGNMENT); 
        pnlDetalles.add(lblSinopsis);


        txtrTextoSinopsis = new JTextArea(
        		"**Lorem ipsum dolor sit amet, consectetur adipiscing elit. \r\nNulla quam velit, vulputate eu pharetra nec, mattis ac neque. \r\nDuis vulputate commodo lectus, ac blandit elit tincidunt id. \r\nSed rhoncus, tortor sed eleifend tristique, tortor mauris \r\nmolestie elit, et lacinia ipsum quam nec dui. Quisque nec \r\nmauris sit amet elit iaculis pretium sit amet quis magna.  \r\nVivamus varius pretium ligula, a aliquam odio euismod sit \r\namet. Quisque laoreet sem sit amet orci ullamcorper at \r\nultricies metus viverra. Pellentesque arcu mauris, \r\nmalesuada quis ornare accumsan, blandit sed diam.**");
        txtrTextoSinopsis.setFont(new Font("Microsoft YaHei", Font.PLAIN, 17));
        txtrTextoSinopsis.setForeground(Color.WHITE);
        txtrTextoSinopsis.setBackground(new Color(66, 72, 93));
        txtrTextoSinopsis.setWrapStyleWord(true); 
        txtrTextoSinopsis.setLineWrap(true);      
        txtrTextoSinopsis.setEditable(false);

        scrollSinopsis = new JScrollPane(txtrTextoSinopsis);
        scrollSinopsis.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollSinopsis.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); 
        
        scrollSinopsis.setPreferredSize(new Dimension(550, 225)); 
        scrollSinopsis.setMinimumSize(new Dimension(400, 100));   

        pnlDetalles.add(scrollSinopsis);

        // Add a ComponentListener to dynamically adjust the scroll pane's size
        pnlDetalles.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                Dimension size = pnlDetalles.getSize();
                scrollSinopsis.setPreferredSize(new Dimension(size.width - 20, size.height - 100));
                scrollSinopsis.revalidate();
            }
        });
        // Constraints for User Options Panel
        GridBagConstraints gbcOpciones = new GridBagConstraints();
        gbcOpciones.insets = new Insets(10, 10, 10, 10);
        gbcOpciones.gridx = 1;
        gbcOpciones.gridy = 1;
        gbcOpciones.anchor = GridBagConstraints.WEST;

        JPanel pnlOpciones = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        pnlOpciones.setBackground(new Color(66, 72, 93));
        pnlCentral.add(pnlOpciones, gbcOpciones);

        btnAlquilar = new JButton("ALQUILAR");
        btnAlquilar.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnAlquilar.setBackground(new Color(255, 128, 0));
        btnAlquilar.setForeground(Color.WHITE);
        pnlOpciones.add(btnAlquilar);
        
        btnAlquilado = new JButton("ALQUILADO");
        btnAlquilado.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnAlquilado.setBackground(new Color(90, 202, 23));
        btnAlquilado.setForeground(Color.WHITE);
        pnlOpciones.add(btnAlquilado);

        btnComentarios = new JButton("COMENTARIOS");
        btnComentarios.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnComentarios.setBackground(new Color(255, 128, 0));
        btnComentarios.setForeground(Color.WHITE);
        pnlOpciones.add(btnComentarios);

        // Bottom panel for "Add to Favorites"
        JPanel pnlBottom = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        pnlBottom.setBackground(new Color(66, 72, 93));
        GridBagConstraints gbcBottom = new GridBagConstraints();
        gbcBottom.insets = new Insets(10, 10, 10, 10);
        gbcBottom.gridx = 0;
        gbcBottom.gridy = 2;
        gbcBottom.anchor = GridBagConstraints.WEST;
        gbcBottom.gridwidth = 2;  // Span across two columns for balance
        pnlCentral.add(pnlBottom, gbcBottom);

        LblFavoritos = DefaultComponentFactory.getInstance().createLabel("");
        LblFavoritos.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Images/favoritos.png"))
                .getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
        pnlBottom.add(LblFavoritos);

        txtrAadirAFavoritos = new JTextArea("Añadir a favoritos");
        txtrAadirAFavoritos.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
        txtrAadirAFavoritos.setForeground(Color.WHITE);
        txtrAadirAFavoritos.setBackground(new Color(66, 72, 93));
        txtrAadirAFavoritos.setEditable(false);
        pnlBottom.add(txtrAadirAFavoritos);

        LblEstrellas = DefaultComponentFactory.getInstance().createLabel("");
        LblEstrellas.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Images/estrellas.png"))
                .getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
        pnlBottom.add(LblEstrellas);

        textPuntuacion = new JLabel("4.5/5");
        textPuntuacion.setFont(new Font("Microsoft YaHei", Font.BOLD, 19));
        textPuntuacion.setForeground(Color.WHITE);
        pnlBottom.add(textPuntuacion);

        // ComponentAdapter for dynamic resizing
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                Dimension size = getSize();
                double scaleFactor = Math.min(size.getWidth() / 1140, size.getHeight() / 640);

                titulo1_1.setFont(titulo1_1.getFont().deriveFont((float) (24 * scaleFactor)));
                txtrTextoSinopsis.setFont(txtrTextoSinopsis.getFont().deriveFont((float) (17 * scaleFactor)));
                btnAlquilar.setFont(btnAlquilar.getFont().deriveFont((float) (14 * scaleFactor)));
                lblSinopsis.setFont(lblSinopsis.getFont().deriveFont((float) (20 * scaleFactor)));
                btnAlquilado.setFont(btnAlquilado.getFont().deriveFont((float) (14 * scaleFactor)));
                btnComentarios.setFont(btnComentarios.getFont().deriveFont((float) (14 * scaleFactor)));
                txtrAadirAFavoritos.setFont(txtrAadirAFavoritos.getFont().deriveFont((float) (16 * scaleFactor)));
                textPuntuacion.setFont(textPuntuacion.getFont().deriveFont((float) (19 * scaleFactor)));

                revalidate();
                repaint();
            }
        });
    }
}

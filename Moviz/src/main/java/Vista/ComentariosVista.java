package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JComboBox;

public class ComentariosVista extends JPanel {

    private static final long serialVersionUID = 1L;

    // Parte superior (logo, búsqueda, botones, salir)
    public JButton btnSalir;
    public JButton btnHistorial;
    public JButton btnPeliculas;
    private JTextField txtBuscar;
    private JLabel Busqueda;
    private JLabel IconoLogo;
    private JPanel panel;

    // Sección de comentarios
    public JLabel lblTituloSeccion;
    public JLabel lblAgregarComentario;
    public JComboBox<String> comboBoxPuntuacion;
    public JTextArea txtNuevoComentario;
    public JButton btnComentar;
    public JTextArea txtComentarios;
    public JScrollPane scrollComentarios;

    public ComentariosVista() {
        // Configuración del panel
        setBackground(new Color(66, 72, 93));
        setBorder(null);
        setLayout(null); // IMPORTANTE
        setBounds(0, 0, 1140, 640); // IMPORTANTE

        // Botón "Salir" con Icono
        btnSalir = new JButton("");
        btnSalir.setIcon(new ImageIcon(MenuUsuarioVista.class.getResource("/Images/iconosalida.png")));
        btnSalir.setBounds(1065, 12, 42, 46);
        add(btnSalir);

        // Botón "Historial"
        btnHistorial = new JButton("HISTORIAL");
        btnHistorial.setBounds(878, 19, 120, 35);
        add(btnHistorial);

        // Botón "Películas"
        btnPeliculas = new JButton("PELICULAS");
        btnPeliculas.setBounds(748, 19, 120, 35);
        add(btnPeliculas);

        // Icono de búsqueda
        Busqueda = DefaultComponentFactory.getInstance().createLabel("");
        Busqueda.setIcon(new ImageIcon(getClass().getResource("/Images/BuscarIcono.png")));
        Busqueda.setBounds(280, 17, 40, 40);
        add(Busqueda);

        // Icono del logo
        IconoLogo = DefaultComponentFactory.getInstance().createLabel("");
        IconoLogo.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacion.png")));
        IconoLogo.setBounds(4, 6, 283, 56);
        add(IconoLogo);

        // Campo de búsqueda
        txtBuscar = new JTextField();
        txtBuscar.setText("Buscar");
        txtBuscar.setBounds(322, 21, 407, 32);
        add(txtBuscar);
        txtBuscar.setColumns(10);

        // Panel para la cabecera (fondo gris oscuro)
        panel = new JPanel();
        panel.setBackground(new Color(56, 59, 74));
        panel.setBounds(0, 0, 1225, 69);
        add(panel);

        // Título de la sección "Comentarios"
        lblTituloSeccion = new JLabel("Comentarios");
        lblTituloSeccion.setFont(new Font("Microsoft YaHei", Font.BOLD, 28));
        lblTituloSeccion.setForeground(new Color(255, 255, 255));
        lblTituloSeccion.setBounds(26, 80, 200, 30);
        add(lblTituloSeccion);

        // Etiqueta "Agregar comentario"
        lblAgregarComentario = new JLabel("Agregar comentario:");
        lblAgregarComentario.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        lblAgregarComentario.setForeground(new Color(255, 255, 255));
        lblAgregarComentario.setBounds(26, 130, 200, 30);
        add(lblAgregarComentario);

        // ComboBox para la puntuación
        String[] puntuaciones = { "1/5", "2/5", "3/5", "4/5", "5/5" };
        comboBoxPuntuacion = new JComboBox<>(puntuaciones);
        comboBoxPuntuacion.setFont(new Font("Microsoft YaHei", Font.PLAIN, 18));
        comboBoxPuntuacion.setBounds(230, 130, 100, 30);
        add(comboBoxPuntuacion);

        // TextArea para ingresar nuevo comentario
        txtNuevoComentario = new JTextArea();
        txtNuevoComentario.setLineWrap(true);
        txtNuevoComentario.setWrapStyleWord(true);
        txtNuevoComentario.setFont(new Font("Microsoft YaHei", Font.PLAIN, 16));
        txtNuevoComentario.setBounds(26, 180, 850, 60);
        add(txtNuevoComentario);

        // Botón "Comentar"
        btnComentar = new JButton("Comentar");
        btnComentar.setFont(new Font("Microsoft YaHei", Font.PLAIN, 16));
        btnComentar.setBackground(new Color(224, 224, 224));
        btnComentar.setBounds(900, 200, 150, 40);
        add(btnComentar);

        // TextArea para mostrar los comentarios
        txtComentarios = new JTextArea();
        txtComentarios.setEditable(false);
        txtComentarios.setFont(new Font("Microsoft YaHei", Font.PLAIN, 16));
        txtComentarios.setLineWrap(true);
        txtComentarios.setWrapStyleWord(true);
        txtComentarios.setText("Usuario 1 - (3/5) - 18/07/24\n"
                + "*Lorem ipsum dolor sit amet, consectetur adipiscing elit...\n\n"
                + "Usuario 1 - (3/5) - 10/03/24\n"
                + "*Lorem ipsum dolor sit amet, consectetur adipiscing elit...\n\n"
                + "Usuario 1 - (3/5) - 02/11/23\n"
                + "*Lorem ipsum dolor sit amet, consectetur adipiscing elit...\n");

        // ScrollPane para los comentarios
        scrollComentarios = new JScrollPane(txtComentarios);
        scrollComentarios.setBounds(26, 270, 1020, 300);
        scrollComentarios.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollComentarios);
    }
}

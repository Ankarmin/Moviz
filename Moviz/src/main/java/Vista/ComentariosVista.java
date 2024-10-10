package Vista;

import javax.swing.*;
import java.awt.*;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class ComentariosVista extends JPanel {

    private static final long serialVersionUID = 1L;

    // Parte superior (logo, búsqueda, botones, salir)
    public JButton btnSalir;
    public JButton btnVolver; // Nuevo botón "Volver"
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
    public JTable tablaComentarios;
    public JScrollPane scrollTablaComentarios;

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
        
        // Botón "Volver" en la esquina superior derecha
        btnVolver = new JButton("Volver");
        btnVolver.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnVolver.setBackground(new Color(255, 128, 0));
        btnVolver.setForeground(new Color(255, 255, 255));
        btnVolver.setBounds(930, 80, 120, 35);
        add(btnVolver);

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
        btnComentar.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnComentar.setBackground(new Color(255, 128, 0));
        btnComentar.setForeground(new Color(255, 255, 255));
        btnComentar.setBounds(900, 200, 150, 40);
        add(btnComentar);

        // Configuración de la tabla de comentarios
        String[] columnComentarios = {"Comentario"};
        Object[][] dataComentarios = {
            {"Usuario 1 - (3/5) - 18/07/24\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Duis vulputate commodo lectus..."},
            {"Usuario 2 - (3/5) - 10/03/24\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Duis vulputate commodo lectus..."},
            {"Usuario 3 - (3/5) - 02/11/23\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Duis vulputate commodo lectus..."},
            {"Usuario 4 - (3/5) - 01/08/23\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Duis vulputate commodo lectus..."},
            {"Usuario 5 - (3/5) - 15/07/23\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Duis vulputate commodo lectus..."},
            {"Usuario 6 - (3/5) - 10/06/23\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Duis vulputate commodo lectus..."},
            {"Usuario 7 - (3/5) - 28/05/23\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Duis vulputate commodo lectus..."}
        };

        DefaultTableModel model = new DefaultTableModel(dataComentarios, columnComentarios);
        tablaComentarios = new JTable(model);
        tablaComentarios.setFont(new Font("Microsoft YaHei", Font.PLAIN, 16));
        tablaComentarios.setBackground(new Color(66, 72, 93));
        tablaComentarios.setForeground(Color.WHITE);
        tablaComentarios.setRowHeight(60);  // Ajusta la altura de las filas
        tablaComentarios.setShowGrid(false);  // Oculta las líneas de la tabla
        tablaComentarios.setIntercellSpacing(new Dimension(0, 0));  // Remueve el espacio entre celdas
        tablaComentarios.setEnabled(false);  // Desactiva la edición de la tabla

        // Ocultar el encabezado de la tabla
        JTableHeader header = tablaComentarios.getTableHeader();
        header.setVisible(false);  // Oculta el encabezado
        tablaComentarios.setTableHeader(null);  // Remueve completamente el encabezado

        // Configuración del JScrollPane que contiene la tabla de comentarios
        scrollTablaComentarios = new JScrollPane(tablaComentarios);
        scrollTablaComentarios.setBounds(26, 270, 1020, 300);
        scrollTablaComentarios.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollTablaComentarios);  // Añadimos el JScrollPane (que contiene la JTable) al panel
    }
}

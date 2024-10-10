package Vista;

import javax.swing.*;
import java.awt.*;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class EliminarComentariosVista extends JPanel {

    private static final long serialVersionUID = 1L;

    public JButton btnSalir;
    public JButton btnVolver;
    public JButton btnEliminar;

    public JLabel lblTituloSeccion;
    public JLabel lblNombrePelicula;
    public JLabel lblIconoLogo;
    public JLabel Busqueda;

    public JTable tblPeliculas;
    public JTable tblComentarios;

    public JScrollPane spTablaPeliculas;
    public JScrollPane spTablaComentarios;

    public JTextField txtBuscar;

    public JPanel pnlLineaBlanca;
    public JPanel pnlCabecera;

    // Función para reescalar la imagen
    public ImageIcon getScaledIcon(String path, int width, int height) {
        ImageIcon originalIcon = new ImageIcon(getClass().getResource(path));
        Image scaledImage = originalIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }

    public EliminarComentariosVista() {
        // Configuración del panel
        setBackground(new Color(66, 72, 93));
        setBorder(null);
        setLayout(null); // IMPORTANTE
        setBounds(0, 0, 1140, 640); // IMPORTANTE

        // Botón "Salir" con Icono
        btnSalir = new JButton("");
        btnSalir.setIcon(new ImageIcon(getClass().getResource("/Images/iconosalida.png")));
        btnSalir.setBounds(1054, 15, 42, 46);
        add(btnSalir);

        // Botón "Volver" en la esquina superior derecha
        btnVolver = new JButton("Volver");
        btnVolver.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnVolver.setBackground(new Color(255, 128, 0));
        btnVolver.setForeground(new Color(255, 255, 255));
        btnVolver.setBounds(966, 102, 120, 35);
        add(btnVolver);

        // Icono del Logo
        lblIconoLogo = DefaultComponentFactory.getInstance().createLabel("");
        lblIconoLogo.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacionAdministrador.png")));
        lblIconoLogo.setBounds(4, 6, 578, 56);
        add(lblIconoLogo);

        // Panel de Cabecera
        pnlCabecera = new JPanel();
        pnlCabecera.setBackground(new Color(56, 59, 74));
        pnlCabecera.setBounds(-85, 0, 1225, 69);
        add(pnlCabecera);

        // Título de la sección "Eliminar Comentarios"
        lblTituloSeccion = new JLabel("Eliminar Comentarios");
        lblTituloSeccion.setFont(new Font("Microsoft YaHei", Font.BOLD, 21));
        lblTituloSeccion.setForeground(new Color(255, 255, 255));
        lblTituloSeccion.setBounds(26, 108, 271, 29);
        add(lblTituloSeccion);

        // Línea divisoria
        pnlLineaBlanca = new JPanel();
        pnlLineaBlanca.setBackground(Color.WHITE);
        pnlLineaBlanca.setBounds(26, 143, 1060, 2);
        add(pnlLineaBlanca);

        // Campo de búsqueda
        txtBuscar = new JTextField();
        txtBuscar.setText("Buscar");
        txtBuscar.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
        txtBuscar.setBounds(80, 180, 250, 30);
        txtBuscar.setColumns(10);
        add(txtBuscar);

        // Etiqueta de icono de búsqueda
        Busqueda = DefaultComponentFactory.getInstance().createLabel("");
        Busqueda.setIcon(new ImageIcon(getClass().getResource("/Images/BuscarIcono.png"))); // Icono de búsqueda
        Busqueda.setBounds(37, 180, 42, 30);
        add(Busqueda);

        // Etiqueta para el nombre de la película
        lblNombrePelicula = new JLabel("Nombre película");
        lblNombrePelicula.setFont(new Font("Microsoft YaHei", Font.BOLD, 24));
        lblNombrePelicula.setForeground(new Color(255, 140, 0));
        lblNombrePelicula.setBounds(436, 181, 400, 30);
        add(lblNombrePelicula);

        // Configuración de la tabla de películas (vacía inicialmente)
        String[] columnPeliculas = { "Lista Películas" };
        Object[][] dataPeliculas = {}; // Tabla vacía al inicio

        DefaultTableModel peliculasModel = new DefaultTableModel(dataPeliculas, columnPeliculas);
        tblPeliculas = new JTable(peliculasModel);
        tblPeliculas.setFillsViewportHeight(true);
        tblPeliculas.setRowHeight(30); // Ajusta la altura de las filas
        tblPeliculas.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
        tblPeliculas.setBackground(new Color(70, 76, 90));
        tblPeliculas.setForeground(Color.WHITE); // Texto en blanco
        tblPeliculas.setDefaultEditor(Object.class, null); // Desactiva la edición de celdas

        // Configuración del JScrollPane para que aparezca scroll si hay varias películas
        spTablaPeliculas = new JScrollPane(tblPeliculas);
        spTablaPeliculas.setBounds(50, 231, 300, 300); // Ajusta la posición y tamaño
        spTablaPeliculas.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); // Forzar el scroll si se excede el tamaño
        add(spTablaPeliculas); // Añadimos el JScrollPane (que contiene la JTable) al panel

        // Datos de prueba para la tabla de comentarios
        String[] columnComentarios = { "Usuario", "Comentario", "Eliminar" };
        Object[][] dataComentarios = {
            { "Usuario 1 - (3/5) - 18/07/24", "Lorem ipsum dolor sit amet...", Boolean.FALSE },
            { "Usuario 2 - (3/5) - 10/03/24", "Lorem ipsum dolor sit amet...", Boolean.FALSE },
            { "Usuario 3 - (3/5) - 02/11/23", "Lorem ipsum dolor sit amet...", Boolean.FALSE },
            { "Usuario 4 - (3/5) - 01/08/23", "Lorem ipsum dolor sit amet...", Boolean.FALSE },
            { "Usuario 5 - (3/5) - 15/07/23", "Lorem ipsum dolor sit amet...", Boolean.FALSE },
            { "Usuario 6 - (3/5) - 10/06/23", "Lorem ipsum dolor sit amet...", Boolean.FALSE },
            { "Usuario 7 - (3/5) - 28/05/23", "Lorem ipsum dolor sit amet...", Boolean.FALSE }
        };

        // Creación de la tabla con los comentarios
        DefaultTableModel comentariosModel = new DefaultTableModel(dataComentarios, columnComentarios) {
            @Override
            public Class<?> getColumnClass(int column) {
                switch (column) {
                    case 0: // Usuario
                    case 1: // Comentario
                        return String.class;
                    case 2: // Eliminar (checkbox)
                        return Boolean.class;
                    default:
                        return Object.class;
                }
            }
        };

        tblComentarios = new JTable(comentariosModel);
        tblComentarios.setFillsViewportHeight(true);
        tblComentarios.setRowHeight(60); // Ajusta la altura de las filas
        tblComentarios.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
        tblComentarios.setSelectionBackground(new Color(60, 62, 77)); // Gris oscuro
        tblComentarios.setBackground(new Color(70, 76, 90));
        tblComentarios.setForeground(Color.WHITE); // Texto en blanco

        // Ajuste del ancho de columnas
        TableColumnModel columnModel = tblComentarios.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(150); // Usuario
        columnModel.getColumn(1).setPreferredWidth(300); // Comentario
        columnModel.getColumn(2).setPreferredWidth(50);  // Checkbox

        // Configuración del JScrollPane que contiene la tabla de comentarios
        spTablaComentarios = new JScrollPane(tblComentarios);
        spTablaComentarios.setBounds(436, 231, 527, 300); // Ajusta la posición y tamaño
        spTablaComentarios.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); // Añadir scroll vertical
        add(spTablaComentarios); // Añadimos el JScrollPane (que contiene la JTable) al panel

        // Botón "Eliminar" en la parte inferior derecha
        btnEliminar = new JButton("Eliminar");
        btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnEliminar.setForeground(Color.WHITE);
        btnEliminar.setBackground(new Color(255, 128, 0));
        btnEliminar.setBounds(850, 550, 120, 35); // Colocación del botón
        add(btnEliminar);

        initStyles();
    }

    public void initStyles() {
        // Aquí podrías agregar más personalizaciones si es necesario.
    }
}

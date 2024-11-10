package Vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JComboBox;

public class MenuPeliculasVista extends JPanel {

    private static final long serialVersionUID = 1L;
    
    public JTextField txtBuscar;
    public JLabel lblBusqueda;
    public JLabel lblIconoLogo;
    public JButton btnSalir;
    public JButton btnHistorial;
    public JComboBox<String> comboBoxGenero;
    public JComboBox<String> comboBoxAño;
    public JComboBox<String> comboBoxPuntuacion;
    public JPanel pnlGrid;

    public MenuPeliculasVista() {
        setBounds(0, 0, 1140, 640);
        setLayout(new BorderLayout(0, 0));
        
        JPanel pnlSuperior = new JPanel();
        pnlSuperior.setBackground(new Color(56, 59, 74));
        add(pnlSuperior, BorderLayout.NORTH);
        pnlSuperior.setLayout(new BorderLayout(0, 0));
        
        lblIconoLogo = new JLabel("");
        lblIconoLogo.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacion.png")));
        lblIconoLogo.setBounds(4, 6, 283, 56);
        pnlSuperior.add(lblIconoLogo, BorderLayout.WEST);
        
        JPanel pnlSalir = new JPanel();
        pnlSalir.setBackground(new Color(56, 59, 74));
        pnlSuperior.add(pnlSalir, BorderLayout.EAST);
        pnlSalir.setLayout(new BorderLayout(0, 0));
        
        JLabel lblNewLabel = new JLabel("   ");
        pnlSalir.add(lblNewLabel, BorderLayout.NORTH);
        
        JLabel lblNewLabel_2 = new JLabel("   ");
        pnlSalir.add(lblNewLabel_2, BorderLayout.SOUTH);
        
        btnSalir = new JButton("");
        btnSalir.setIcon(new ImageIcon(getClass().getResource("/Images/iconosalida.png")));
        pnlSalir.add(btnSalir);
        
        JLabel lblNewLabel_1 = new JLabel("   ");
        pnlSalir.add(lblNewLabel_1, BorderLayout.EAST);
        
        JPanel pnlMenu = new JPanel();
        pnlMenu.setBackground(new Color(56, 59, 74));
        pnlSuperior.add(pnlMenu, BorderLayout.CENTER);
        pnlMenu.setLayout(new BorderLayout(0, 0));
        
        JLabel lblNewLabel_3 = new JLabel("   ");
        pnlMenu.add(lblNewLabel_3, BorderLayout.NORTH);
        
        JLabel lblNewLabel_4 = new JLabel("   ");
        pnlMenu.add(lblNewLabel_4, BorderLayout.SOUTH);
        
        JPanel pnlMenuSuperior = new JPanel();
        pnlMenuSuperior.setBackground(new Color(56, 59, 74));
        pnlMenu.add(pnlMenuSuperior, BorderLayout.CENTER);
        pnlMenuSuperior.setLayout(new BorderLayout(0, 0));
        
        JLabel lblNewLabel_5 = new JLabel("          ");
        pnlMenuSuperior.add(lblNewLabel_5, BorderLayout.EAST);
        
        JPanel pnlContenido = new JPanel();
        pnlContenido.setBackground(new Color(56, 59, 74));
        pnlMenuSuperior.add(pnlContenido);
        pnlContenido.setLayout(new BorderLayout(0, 0));
        
        lblBusqueda = new JLabel("");
        lblBusqueda.setIcon(new ImageIcon(getClass().getResource("/Images/BuscarIcono.png")));
        lblBusqueda.setBounds(280, 17, 40, 40);
        pnlContenido.add(lblBusqueda, BorderLayout.WEST);
        
        JPanel pnlContenidoBotones = new JPanel();
        pnlContenidoBotones.setBackground(new Color(56, 59, 74));
        pnlContenido.add(pnlContenidoBotones, BorderLayout.EAST);
        pnlContenidoBotones.setLayout(new BorderLayout(0, 0));
        
        JLabel lblNewLabel_11 = new JLabel("      ");
        pnlContenidoBotones.add(lblNewLabel_11, BorderLayout.NORTH);
        
        JPanel pnlBotones = new JPanel();
        pnlBotones.setBackground(new Color(56, 59, 74));
        FlowLayout fl_pnlBotones = (FlowLayout) pnlBotones.getLayout();
        pnlContenidoBotones.add(pnlBotones);
        
        JButton btnPeliculas = new JButton("PELICULAS");
        pnlBotones.add(btnPeliculas);
        
        btnHistorial = new JButton("HISTORIAL");
        pnlBotones.add(btnHistorial);
        
        JLabel lblNewLabel_12 = new JLabel("      ");
        pnlContenidoBotones.add(lblNewLabel_12, BorderLayout.SOUTH);
        
        JPanel pnlBusqueda = new JPanel();
        pnlBusqueda.setBackground(new Color(56, 59, 74));
        pnlContenido.add(pnlBusqueda, BorderLayout.CENTER);
        pnlBusqueda.setLayout(new BorderLayout(0, 0));
        
        JLabel lblNewLabel_8 = new JLabel("     ");
        pnlBusqueda.add(lblNewLabel_8, BorderLayout.NORTH);
        
        JLabel lblNewLabel_9 = new JLabel("     ");
        pnlBusqueda.add(lblNewLabel_9, BorderLayout.SOUTH);
        
        JLabel lblNewLabel_7 = new JLabel("     ");
        pnlBusqueda.add(lblNewLabel_7, BorderLayout.EAST);
        
        JLabel lblNewLabel_10 = new JLabel("     ");
        pnlBusqueda.add(lblNewLabel_10, BorderLayout.WEST);
        
        txtBuscar = new JTextField();
        txtBuscar.setText("Buscar");
        txtBuscar.setColumns(10);
        pnlBusqueda.add(txtBuscar, BorderLayout.CENTER);
        
        JLabel lblNewLabel_6 = new JLabel("          ");
        pnlMenuSuperior.add(lblNewLabel_6, BorderLayout.WEST);
        
        JPanel pnlCentral = new JPanel();
        pnlCentral.setBackground(new Color(66, 72, 93));
        add(pnlCentral, BorderLayout.CENTER);
        pnlCentral.setLayout(new BorderLayout(0, 0));
        
        JLabel lblNewLabel_13 = new JLabel("                ");
        pnlCentral.add(lblNewLabel_13, BorderLayout.NORTH);
        
        JLabel lblNewLabel_14 = new JLabel("                ");
        pnlCentral.add(lblNewLabel_14, BorderLayout.SOUTH);
        
        JLabel lblNewLabel_15 = new JLabel("                ");
        pnlCentral.add(lblNewLabel_15, BorderLayout.EAST);
        
        JLabel lblNewLabel_16 = new JLabel("                ");
        pnlCentral.add(lblNewLabel_16, BorderLayout.WEST);
        
        JPanel pnlContieneGrid = new JPanel();
        pnlContieneGrid.setBackground(new Color(66, 72, 93));
        pnlCentral.add(pnlContieneGrid, BorderLayout.CENTER);
        pnlContieneGrid.setLayout(new BorderLayout(0, 0));
        
        JLabel lblNewLabel_18 = new JLabel("                ");
        pnlContieneGrid.add(lblNewLabel_18, BorderLayout.SOUTH);
        
        JPanel pnlTexto = new JPanel();
        pnlTexto.setBackground(new Color(66, 72, 93));
        pnlContieneGrid.add(pnlTexto, BorderLayout.NORTH);
        pnlTexto.setLayout(new BorderLayout(0, 0));
        
        JLabel lblHistorialPeliculas = new JLabel("New label");
        
        JPanel pnlContieneSeparador = new JPanel();
        pnlContieneSeparador.setBackground(new Color(66, 72, 93));
        pnlTexto.add(pnlContieneSeparador, BorderLayout.SOUTH);
        pnlContieneSeparador.setLayout(new GridLayout(0, 6, 0, 0));
        
        JLabel lblBuscarPor_1 = DefaultComponentFactory.getInstance().createLabel("Buscar Por:");
        pnlContieneSeparador.add(lblBuscarPor_1);
        lblBuscarPor_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
        lblBuscarPor_1.setForeground(new Color(255, 255, 255));
        
        String[] generos = { "Todos", "Acción", "Aventura", "Animación", "Comedia", "Crimen", "Documental", "Drama",
                "Familia", "Fantasía", "Historia", "Terror", "Música", "Misterio", "Romance", "Ciencia Ficción",
                "Película de TV", "Suspense", "Bélico", "Western" };
        comboBoxGenero = new JComboBox<>(generos);
        pnlContieneSeparador.add(comboBoxGenero);
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setBackground(new Color(56, 59, 74));
        pnlContieneSeparador.add(separator_1);
        
        String[] año = { "Todos", "2020s", "2010s", "2000s", "1990s", "1980s", "1970s", "1960s", "1950s", "1940s",
                "1930s", "1920s", "1910s", "1900s", "1890s" };
        
        comboBoxAño = new JComboBox<>(año);
        pnlContieneSeparador.add(comboBoxAño);
        
        JSeparator separator_2 = new JSeparator();
        separator_2.setBackground(new Color(56, 59, 74));
        pnlContieneSeparador.add(separator_2);
        
        String[] puntuacion = { "Todas", "1+", "2+", "3+", "4+", "5+", "6+", "7+", "8+", "9+" };
        comboBoxPuntuacion = new JComboBox<>(puntuacion);
        pnlContieneSeparador.add(comboBoxPuntuacion);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        pnlContieneGrid.add(scrollPane, BorderLayout.CENTER);
        
        pnlGrid = new JPanel();
        scrollPane.setViewportView(pnlGrid);
        pnlGrid.setBackground(new Color(66, 72, 93));
        pnlGrid.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
    }
}

package Vista;

import javax.swing.*;
import java.awt.*;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class LoginVista extends JPanel {

    private static final long serialVersionUID = 1L;

    public JButton btnRegistrar;
    public JButton btnIngresar;

    public JTextField txtUser;
    public JPasswordField txtPassword; // Cambiar JTextField a JPasswordField para las contraseñas

    private JLabel lblUsuario;
    private JLabel lblContrasea;
    private JLabel lblAnNoTienes;
    private JLabel logoApp;
    private JLabel lblTitulo;
    private JLabel lblFondo;
    private JLabel lblIconoUsuario;
    private JLabel lblIconoPassword;

    public LoginVista() {
        setBackground(new Color(66, 72, 93));
        setLayout(null); // IMPORTANTE
        setBounds(0, 0, 1140, 640); // IMPORTANTE

        btnRegistrar = new JButton("REGISTRAR");
        btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnRegistrar.setForeground(new Color(255, 255, 255));
        btnRegistrar.setBackground(new Color(255, 128, 0));
        btnRegistrar.setBounds(811, 513, 125, 50);
        add(btnRegistrar);

        btnIngresar = new JButton("INGRESAR");
        btnIngresar.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnIngresar.setBackground(new Color(255, 128, 0));
        btnIngresar.setForeground(new Color(255, 255, 255));
        btnIngresar.setBounds(920, 433, 125, 50);
        add(btnIngresar);

        // Campo de usuario con placeholder
        txtUser = new JTextField("Ingresar usuario");
        txtUser.setBounds(500, 243, 545, 38);
        txtUser.setForeground(Color.GRAY); // Texto en gris para simular placeholder
        add(txtUser);
        txtUser.setColumns(10);

        // Campo de contraseña con placeholder
        txtPassword = new JPasswordField("**********");
        txtPassword.setColumns(10);
        txtPassword.setBounds(500, 377, 545, 38);
        txtPassword.setForeground(Color.GRAY); // Texto en gris para simular placeholder
        add(txtPassword);

        // Evento para el campo de usuario
        txtUser.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (txtUser.getText().equals("Ingresar usuario")) {
                    txtUser.setText(""); // Elimina el placeholder cuando el usuario hace clic
                    txtUser.setForeground(Color.WHITE); // Cambia el texto a blanco
                }
            }

            public void focusLost(FocusEvent e) {
                if (txtUser.getText().isEmpty()) {
                    txtUser.setForeground(Color.GRAY);
                    txtUser.setText("Ingresar usuario"); // Restaura el placeholder si está vacío
                }
            }
        });

        // Evento para el campo de contraseña
        txtPassword.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                String password = new String(txtPassword.getPassword());
                if (password.equals("**********")) {
                    txtPassword.setText(""); // Elimina el placeholder cuando el usuario hace clic
                    txtPassword.setForeground(Color.WHITE); // Cambia el texto a blanco
                }
            }

            public void focusLost(FocusEvent e) {
                String password = new String(txtPassword.getPassword());
                if (password.isEmpty()) {
                    txtPassword.setForeground(Color.GRAY);
                    txtPassword.setText("**********"); // Restaura el placeholder si está vacío
                }
            }
        });

        lblFondo = DefaultComponentFactory.getInstance().createLabel("");
        lblFondo.setBackground(new Color(13, 17, 28));
        lblFondo.setIcon(new ImageIcon(getClass().getResource("/Images/ImagenAcompañante.png")));
        lblFondo.setBounds(0, -11, 366, 640);
        add(lblFondo);

        logoApp = DefaultComponentFactory.getInstance().createLabel("");
        logoApp.setIcon(new ImageIcon(getClass().getResource("/Images/IconoAplicacion.png")));
        logoApp.setBounds(602, 51, 285, 69);
        add(logoApp);

        lblTitulo = new JLabel("Inicia Sesión en Moviz");
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setFont(new Font("Microsoft YaHei", Font.BOLD, 27));
        lblTitulo.setBounds(573, 131, 333, 36);
        add(lblTitulo);

        lblUsuario = new JLabel("Contraseña");
        lblUsuario.setForeground(Color.WHITE);
        lblUsuario.setFont(new Font("Microsoft YaHei", Font.BOLD, 27));
        lblUsuario.setBounds(446, 328, 333, 36);
        add(lblUsuario);

        lblContrasea = new JLabel("Usuario");
        lblContrasea.setForeground(Color.WHITE);
        lblContrasea.setFont(new Font("Microsoft YaHei", Font.BOLD, 27));
        lblContrasea.setBounds(446, 189, 213, 43);
        add(lblContrasea);

        lblAnNoTienes = new JLabel("Aún no tienes cuenta?");
        lblAnNoTienes.setForeground(Color.WHITE);
        lblAnNoTienes.setFont(new Font("Microsoft YaHei", Font.BOLD, 27));
        lblAnNoTienes.setBounds(491, 515, 333, 43);
        add(lblAnNoTienes);

        lblIconoUsuario = DefaultComponentFactory.getInstance().createTitle("");
        lblIconoUsuario.setIcon(new ImageIcon(getClass().getResource("/Images/UsuarioIcono.png")));
        lblIconoUsuario.setBounds(446, 240, 40, 40);
        add(lblIconoUsuario);

        lblIconoPassword = DefaultComponentFactory.getInstance().createTitle("");
        lblIconoPassword.setIcon(new ImageIcon(getClass().getResource("/Images/PasswordIcono.png")));
        lblIconoPassword.setBounds(446, 373, 40, 40);
        add(lblIconoPassword);

        initStyles();
    }

    private void initStyles() {
        // Aquí podrías agregar más personalizaciones si es necesario.
    }
}

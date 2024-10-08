package DBRepositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdministradorRepositorio extends IConectar<Administrador, Integer> {

    public AdministradorRepositorio(Connection openConexion) {
        super(openConexion);
        this.insertQuery = "INSERT INTO administrador (idAdmin, idUsuario) VALUES (?, ?)";
        this.searchIDQuery = "SELECT * FROM administrador WHERE idAdmin = ?";
        this.searchAllQuery = "SELECT * FROM administrador";
        this.updateRowQuery = "UPDATE administrador SET idUsuario = ? WHERE idAdmin = ?";
        this.deleteRowQuery = "DELETE FROM administrador WHERE idAdmin = ?";
    }

    @Override
    public boolean agregar(Administrador filaNueva) {
        try {
            try (PreparedStatement pst = conexion.prepareStatement(insertQuery)) {
                pst.setInt(1, filaNueva.getIdAdmin());
                pst.setInt(2, filaNueva.getIdUsuario());
                pst.executeUpdate();
            }
            System.out.println("Administrador registrado con éxito en la BD");
            return true;
        } catch (SQLException e) {
            System.out.println("Error al registrar en la BD: " + e.getMessage());
            return false;
        }
    }

    @Override
    public Administrador obtenerPorId(Integer id) {
        Administrador encontrado = null;
        try {
            ResultSet rs;
            try (PreparedStatement pst = conexion.prepareStatement(searchIDQuery)) {
                pst.setInt(1, id);
                rs = pst.executeQuery();
                while (rs.next()) {
                    encontrado = new Administrador();
                    encontrado.setIdAdmin(rs.getInt("idAdmin"));
                    encontrado.setIdUsuario(rs.getInt("idUsuario"));
                }
            }
            rs.close();
            System.out.println("El Administrador ha sido encontrado");
            return encontrado;
        } catch (SQLException e) {
            System.out.println("Error al buscar al Administrador: " + e.getMessage());
            return encontrado;
        }
    }

    @Override
    public List<Administrador> obtenerTodos() {
        List<Administrador> administradores = new ArrayList<>();
        try {
            ResultSet rs;
            try (PreparedStatement pst = conexion.prepareStatement(searchAllQuery)) {
                rs = pst.executeQuery();
                while (rs.next()) {
                    Administrador admin = new Administrador(rs.getInt("idAdmin"), rs.getInt("idUsuario"));
                    administradores.add(admin);
                }
                System.out.println("Administradores recolectados");
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error al recopilar administradores: " + e.getMessage());
        }
        return administradores.isEmpty() ? new ArrayList<>() : administradores;
    }

    @Override
    public boolean actualizar(Administrador filaActualizada) {
        try {
            try (PreparedStatement pst = conexion.prepareStatement(updateRowQuery)) {
                pst.setInt(1, filaActualizada.getIdUsuario());
                pst.setInt(2, filaActualizada.getIdAdmin());
                pst.executeUpdate();
            }
            System.out.println("Fila actualizada");
            return true;
        } catch (SQLException e) {
            System.out.println("No se pudo actualizar la fila: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean eliminar(Integer id) {
        try {
            try (PreparedStatement pst = conexion.prepareStatement(deleteRowQuery)) {
                pst.setInt(1, id);
                pst.executeUpdate();
                System.out.println("Fila eliminada con éxito");
            }
            return true;
        } catch (SQLException e) {
            System.out.println("No se pudo eliminar la fila: " + e.getMessage());
            return false;
        }
    }
}

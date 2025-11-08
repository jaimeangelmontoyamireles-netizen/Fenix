/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import database.Conexion;
import models.Vale;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author campo
 */
public class ValeDAO {
     // Registrar un vale en la base de datos
    public boolean registrarVale(Vale vale) {
        String sql = "INSERT INTO vales (id_usuario, monto_total, saldo_actual, fecha_vencimiento, estado) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, vale.getIdUsuario());
            ps.setDouble(2, vale.getMontoTotal());
            ps.setDouble(3, vale.getSaldoActual());
            ps.setDate(4, java.sql.Date.valueOf(vale.getFechaVencimiento())); // 👈 directo
            ps.setString(5, vale.getEstado());

            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Error al registrar vale: " + e.getMessage());
            return false;
        }
    }

    // Obtener lista de clientes (solo tipo 'cliente')
    public List<String> obtenerUsuarios() {
        List<String> lista = new ArrayList<>();
        String sql = "SELECT CONCAT(nombre, ' ', apellido_paterno, ' ', apellido_materno) AS nombre_completo " +
                     "FROM usuarios WHERE tipo_usuario = 'cliente'";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(rs.getString("nombre_completo"));
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener usuarios: " + e.getMessage());
        }
        return lista;
    }

    // Obtener ID del usuario por nombre completo
    public int obtenerIdUsuarioPorNombre(String nombreCompleto) {
        String sql = "SELECT id_usuario FROM usuarios " +
                     "WHERE CONCAT(nombre, ' ', apellido_paterno, ' ', apellido_materno) = ?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nombreCompleto);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt("id_usuario");
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener ID de usuario: " + e.getMessage());
        }
        return -1;
    }
}

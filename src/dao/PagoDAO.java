/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.Conexion;
import models.Pago;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

public class PagoDAO {

    // Obtener lista de usuarios (nombre completo)
    public List<String> obtenerUsuarios() {
        List<String> usuarios = new ArrayList<>();
        String sql = "SELECT CONCAT(nombre, ' ', apellido_paterno, ' ', apellido_materno) AS nombre_completo FROM usuarios";
        
        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            
            while (rs.next()) {
                usuarios.add(rs.getString("nombre_completo"));
            }
            
        } catch (SQLException e) {
            System.out.println("Error al obtener usuarios: " + e.getMessage());
        }
        
        return usuarios;
    }

    // Obtener ID del usuario por nombre completo
    public int obtenerIdUsuarioPorNombre(String nombreCompleto) {
        String sql = "SELECT id_usuario FROM usuarios " +
                     "WHERE CONCAT(nombre, ' ', apellido_paterno, ' ', apellido_materno) = ?";
        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

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

    // Registrar un pago (fecha se genera por DEFAULT CURRENT_TIMESTAMP en la BD)
    public boolean registrarPago(Pago p) {
        String sql = "INSERT INTO pagos (id_vale, monto_pago) VALUES (?, ?)";
        
        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, p.getIdVale());
            ps.setBigDecimal(2, p.getMontoPago());
            ps.executeUpdate();
            return true;
            
        } catch (SQLException e) {
            System.out.println("Error al registrar pago: " + e.getMessage());
            return false;
        }
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import database.Conexion;
import models.User;
import java.sql.*;

public class UsuarioDAO {

    public boolean registrarUsuario(User usuario) {
        String sql = "INSERT INTO usuarios (nombre, apellido_paterno, apellido_materno, usuario, contrasenia, tipo_usuario) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellidoPaterno());
            ps.setString(3, usuario.getApellidoMaterno());
            ps.setString(4, usuario.getUsuario());
            ps.setString(5, usuario.getContrasenia());
            ps.setString(6, usuario.getTipoUsuario());
            ps.executeUpdate();

            System.out.println(" Usuario registrado correctamente.");
            return true;
        } catch (SQLException e) {
            System.out.println(" Error al registrar usuario: " + e.getMessage());
            return false;
        }
    }

    public User login(String usuario, String contrasenia) {
        String sql = "SELECT * FROM usuarios WHERE usuario = ? AND contrasenia = ?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, usuario);
            ps.setString(2, contrasenia);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                User u = new User();
                u.setIdUsuario(rs.getInt("id_usuario"));
                u.setNombre(rs.getString("nombre"));
                u.setApellidoPaterno(rs.getString("apellido_paterno"));
                u.setApellidoMaterno(rs.getString("apellido_materno"));
                u.setUsuario(rs.getString("usuario"));
                u.setContrasenia(rs.getString("contrasenia"));
                u.setTipoUsuario(rs.getString("tipo_usuario"));
                System.out.println("Login exitoso: " + usuario);
                return u;
            }

        } catch (SQLException e) {
            System.out.println("Error en login: " + e.getMessage());
        }
        return null; // no encontrado
    }
}


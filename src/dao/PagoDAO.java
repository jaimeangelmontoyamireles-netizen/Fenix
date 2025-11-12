/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import models.Pago;

public class PagoDAO {
    Connection con;
    PreparedStatement ps;
    Conexion cn = new Conexion();
    
    //metodo para obtener usuarios
    public int obtenerIdUsuarioPorNombre(String nombreCliente) {
    int idUsuario = -1;
    String sql = "SELECT id_usuario FROM usuarios WHERE nombre = ?";

    try (Connection con = Conexion.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setString(1, nombreCliente);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            idUsuario = rs.getInt("id_usuario");
        }

    } catch (Exception e) {
        System.out.println("Error al obtener ID del usuario: " + e.getMessage());
    }

    return idUsuario;
}

    // metodo para registrar pago
    public boolean registrarPago(Pago p) {
        String sql = "INSERT INTO pagos (id_vale, monto_pago) VALUES (?, ?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, p.getIdVale());
            ps.setBigDecimal(2, p.getMontoPago());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al registrar pago: " + e.getMessage());
            return false;
        }
    }

    // 
    // Metodo para obtener lista de usuarios
  
    public List<String> obtenerUsuarios() {
        List<String> usuarios = new ArrayList<>();
        String sql = "SELECT nombre FROM usuarios";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                usuarios.add(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener usuarios: " + e.getMessage());
        }
        return usuarios;
    }
}

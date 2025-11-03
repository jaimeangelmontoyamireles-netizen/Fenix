/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/AppFenixVales";
    private static final String USER = "root"; // cambia si usas otro usuario de MySQL
    private static final String PASSWORD = "Huevotes123."; // escribe tu contraseña si tienes
    private static Connection conn = null;

    public static Connection getConnection() {
        try {
            if (conn == null || conn.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println(" Conexion exitosa a la base de datos.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(" Error al conectar a la base de datos: " + e.getMessage());
        }
        return conn;
    }
}

package com.endes.dao;

import java.sql.*;

import com.endes.Products;
import com.endes.bbdd.DataBaseConnection;

public class ProductoDAO {
	
    public static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS productos (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                     "nombre TEXT NOT NULL, " +
                     "precio REAL NOT NULL);";

        try (Connection conn = DataBaseConnection.getConnection();
        	 Statement stmt = conn.createStatement()) {
            	stmt.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void agregarProducto(Products producto) throws ClassNotFoundException {
    	Class.forName("org.sqlite.JDBC");
        String sql = "INSERT INTO productos (nombre, precio) VALUES (?, ?)";
        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, producto.getName());
            pstmt.setDouble(2, producto.getPrice());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


	
}
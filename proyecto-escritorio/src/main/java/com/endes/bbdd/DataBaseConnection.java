package com.endes.bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private static final String URL = "jdbc:sqlite:/home/usuario/Proyecto_git/refactorizacion/BasedeDatosProducts";
    private static Connection connection;
    
    public DataBaseConnection() {
    	
    }
    /**
     * Realiza la conexion de la base de datos
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
    	if(connection == null) {
    		try {
    			Class.forName("org.sqlite.JDBC");
    			connection =   DriverManager.getConnection(URL);
    		}catch(ClassNotFoundException e) {
    			
    			e.printStackTrace();
    		}
    	}
		return connection;
    }
    /**
     * Cierra la coneccion de la base de datos
     */
    public static void closeConnection() {
    	
    	if(connection != null) {
    		try {
    			connection.close();
    			connection = null;
    		}catch(SQLException e) {
    			System.out.println(e.getMessage());
    		}
    		
    	}
    }
    
    
}

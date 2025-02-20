package com.endes;

import java.util.Scanner;

import com.endes.dao.ProductoDAO;

/**
 * Hello world!
 *
 */
@SuppressWarnings("unused") 
public class App {
	
    public static void main( String[] args ) throws ClassNotFoundException{
    	ProductoDAO dao = new ProductoDAO();
    	ProductoDAO.createTable();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Precio del producto: ");
        double precio = scanner.nextDouble();
        try {
        dao.agregarProducto(new Products(nombre, precio));
        }catch(ClassNotFoundException e) {}
    }
    	
 }

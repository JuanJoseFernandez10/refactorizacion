package com.endes;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
@SuppressWarnings("unused") 
public class App {
	
    public static void main( String[] args ){
    	ProductoDAO dao = new ProductoDAO();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Precio del producto: ");
        double precio = scanner.nextDouble();
        dao.agregarProducto(new Products(nombre, precio));
    }
    	
 }

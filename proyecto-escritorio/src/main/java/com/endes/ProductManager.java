package com.endes;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ProductManager {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	List<Products> listProducts;
	
	public ProductManager() {
		listProducts = new ArrayList<Products>();
	}
	
	// Agrega un producto, pero con manejo de errores y lógica mezclada
	public void addProduct(Products p1) {
        if (p1.getName() == null || p1.getName().trim().isEmpty() || p1.getPrice() < 0) {
            throw new IllegalArgumentException("El producto es invalido o su precio es negativo");
        }try{
        	listProducts.add(p1);
            System.out.println("Producto agregado: " + p1.getName());
            
        }catch (IllegalArgumentException e) {
            System.out.println("Error al agregar producto: " + e.getMessage());
        }
	} 
	
	// Lista todos los productos. Si no hay productos, lanza una excepción de forma ineficiente.
    public void listProducts() {
    	if (listProducts.size() <= 0) {
            throw new NoSuchElementException("No hay productos para listar.");
        }try {
                for (Products p1 : listProducts) {
                System.out.println(p1);
                }
        } catch (NoSuchElementException e) {
            System.out.println("Error en listProducts: " + e.getMessage());
        }
    }
    
 // Busca un producto por nombre. La búsqueda y manejo de errores están mezclados.
    public void findProduct(String searchName) {
        boolean found = false;
        int contador = 0;
        for (Products pSearch : listProducts) {
            if (pSearch.equals(searchName)) {
            	Products encontrado = listProducts.get(contador);
                System.out.println("Producto encontrado: " + encontrado.getName() + " - Precio: " + encontrado.getPrice());
                found = true;
                break;
            }
            contador++;
        }
        if (!found) {
            try {
                throw new Exception("Producto no encontrado: " + searchName);
            } catch (Exception e) {
                System.out.println("Error en findProduct: " + e.getMessage());
            }
        }
    }
	
}

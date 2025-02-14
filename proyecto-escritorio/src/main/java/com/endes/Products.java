package com.endes;

public class Products {
	// Variables de la clase productos
    String productName;
    double productPrice;

    
    /**
     * Constructor of Product class
     * @param name
     * @param price
     */
    public Products(String name, double price) {
    	this.productName = name;
    	this.productPrice = price;
    }
    
    /**
     * Getter of product name's
     * @return ProductName
     */
    public String getName() {
    	return productName;
    }
    
    /**
     * Getter of product price
     * @return productPrice
     */
    public double getPrice() {
    	return productPrice;
    }
    
    /**
     * Setter of product name
     * @param name
     */
    public void setName(String name) {
    	this.productName = name;
    }
    
    /**
     * Setter of product price
     * @param price
     */
    public void setPrice(double price) {
    	this.productPrice = price;
    }
    
    public String toString() {
    	return "The " + productName + " cost " + productPrice;
    }
    
    
}

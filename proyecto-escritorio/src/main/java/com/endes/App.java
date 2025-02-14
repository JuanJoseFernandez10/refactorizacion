package com.endes;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ProductManager manager = new ProductManager();
    	Products sp = new Products("Helado" , 40);
    	try {
        manager.listProducts();
    	}catch(Exception e) {
    		
    	}
    }
}

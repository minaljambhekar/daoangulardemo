package com.niit.angulardemo.dao;
import java.util.ArrayList;
import java.util.List;

import com.niitangularDemo.Model.*;

public class productdaoimpl implements productdao {

	List<Product> products;
	
	public productdaoimpl(){
	      products = new ArrayList<Product>();
	      Product product1 = new Product(1,"EOS 70D","Camera",85000);
	      Product product2 = new Product(2,"EOS 7D","Camera",120000);
	      
	      products.add(product1);
	      products.add(product2);
	      
	   }
	
	
	public List<Product> getAllProducts() {
		
		return products;
	}

	public Product getProductById() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	public void deleteProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

}




package com.niit.angulardemo.dao;

import java.util.List;

import com.niitangularDemo.Model.*;

public interface productdao {
	
	public List<com.niitangularDemo.Model.Product> getAllProducts();
	
	public Product getProductById();
	
	public void addProduct(Product product);
	
	public void updateProduct(Product product);
	
	public void deleteProduct(Product product);

}




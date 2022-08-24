package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Product;

public interface IProductService {
	//CRUD methods
	public List<Product> listProducts(); //List All 
	
	public Product saveProduct(Product product);//Save a new product "CREATE"
	
	public Product productXID(Long id); //Read data from a product "READ"
			
	public Product updateProduct(Product product); //Update product data "UPDATE"
	
	public void deleteProduct(Long id);// Delete a product via id "DELETE"
}

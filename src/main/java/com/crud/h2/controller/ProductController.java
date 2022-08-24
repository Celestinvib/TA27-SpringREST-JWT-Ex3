package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Product;
import com.crud.h2.service.ProductServiceImpl;

@RestController
@RequestMapping("/api")
public class ProductController {
	@Autowired
	ProductServiceImpl productServiceImpl;
	
	@GetMapping("/productos")
	public List<Product> listProducts(){
		
		return productServiceImpl.listProducts();
	}
	
	@PostMapping("/productos")
	public Product saveProduct(@RequestBody Product product) {
		
		return productServiceImpl.saveProduct(product);
	}
	
	@GetMapping("/productos/{id}")
	public Product cashierXID(@PathVariable(name="id") Long id) {
		
		Product product_xid= new Product();
		
		product_xid= productServiceImpl.productXID(id);
		
		System.out.println("Producto XID: "+product_xid);
		
		return product_xid;
	}
	
	@PutMapping("/productos/{id}")
	public Product updateCashier(@PathVariable(name="id")Long id,@RequestBody Product product) {
		
		Product productSelected= new Product();
		Product productUpdated = new Product();
		
		productSelected= productServiceImpl.productXID(id);
		
		productSelected.setCode(product.getCode());
		productSelected.setName(product.getName());
		productSelected.setPrice(product.getPrice());
		
		productUpdated = productServiceImpl.updateProduct(productSelected);
		
		System.out.println("El product actualizado es: "+ productUpdated);
		
		return productUpdated;
	}
	
	@DeleteMapping("/productos/{id}")
	public void deleteProduct(@PathVariable(name="id")Long id) {
		
		productServiceImpl.deleteProduct(id);
	}	
}

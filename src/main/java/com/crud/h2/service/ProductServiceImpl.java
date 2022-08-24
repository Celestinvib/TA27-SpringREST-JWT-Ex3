package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IProductDAO;
import com.crud.h2.dto.Product;

@Service
public class ProductServiceImpl implements IProductService {
	@Autowired
	IProductDAO iProductDAO;

	@Override
	public List<Product> listProducts() {

		return iProductDAO.findAll();
	}

	@Override
	public Product saveProduct(Product product) {

		return iProductDAO.save(product);
	}

	@Override
	public Product productXID(Long id) {

		return iProductDAO.findById(id).get();
	}

	@Override
	public Product updateProduct(Product product) {

		return iProductDAO.save(product);
	}

	@Override
	public void deleteProduct(Long id) {
		
		iProductDAO.deleteById(id);
	}
	
}

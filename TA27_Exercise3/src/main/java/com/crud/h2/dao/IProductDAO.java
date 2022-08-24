package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Product;

public interface IProductDAO  extends JpaRepository<Product, Long> {

}

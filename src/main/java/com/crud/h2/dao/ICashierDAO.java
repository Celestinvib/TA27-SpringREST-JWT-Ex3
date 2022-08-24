package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Cashier;

public interface ICashierDAO  extends JpaRepository<Cashier, Long>{

}

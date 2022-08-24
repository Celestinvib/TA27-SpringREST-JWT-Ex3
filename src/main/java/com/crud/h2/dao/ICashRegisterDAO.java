package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.CashRegister;

public interface ICashRegisterDAO  extends JpaRepository<CashRegister, Long> {

}

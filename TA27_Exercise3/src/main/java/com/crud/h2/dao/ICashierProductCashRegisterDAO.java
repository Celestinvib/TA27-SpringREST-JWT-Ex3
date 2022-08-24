package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.CashiersProductsCashRegisters;

public interface ICashierProductCashRegisterDAO  extends JpaRepository<CashiersProductsCashRegisters, Long> {

}

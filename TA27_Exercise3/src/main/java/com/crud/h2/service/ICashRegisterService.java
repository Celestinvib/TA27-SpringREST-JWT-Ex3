package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.CashRegister;

public interface ICashRegisterService {
	//CRUD methods
	public List<CashRegister> listCashRegisters(); //List All 
	
	public CashRegister saveCashRegister(CashRegister cashRegister);//Save a new cashRegister "CREATE"
	
	public CashRegister cashRegisterXID(Long id); //Read data from a cashRegister "READ"
			
	public CashRegister updateCashRegister(CashRegister cashRegister); //Update cashRegister data "UPDATE"
	
	public void deleteCashRegister(Long id);// Delete a cashRegister via id "DELETE"
}

package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.CashiersProductsCashRegisters;

public interface ICashiersProductsCashRegistersService {
	//CRUD methods
	public List<CashiersProductsCashRegisters> listCashierProductCashRegisters(); //List All 
	
	public CashiersProductsCashRegisters saveCashierProductCashRegister(CashiersProductsCashRegisters cashierProductsCashRegister);//Save a new cashierProductsCashRegister "CREATE"
	
	public CashiersProductsCashRegisters cashierProductCashRegistertXID(Long id); //Read data from a cashierProductsCashRegister "READ"
			
	public CashiersProductsCashRegisters updateCashierProductCashRegister(CashiersProductsCashRegisters cashierProductsCashRegister); //Update cashierProductsCashRegister data "UPDATE"
	
	public void deleteCashierProductsCashRegisters(Long id);// Delete a cashierProductsCashRegister via id "DELETE"
}

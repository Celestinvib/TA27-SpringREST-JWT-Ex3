package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Cashier;

public interface ICashierService {
	//CRUD methods
	public List<Cashier> listCashiers(); //List All 
	
	public Cashier saveCashier(Cashier cashier);//Save a new cashier "CREATE"
	
	public Cashier cashierXID(Long id); //Read data from a cashier "READ"
			
	public Cashier updateCashier(Cashier cashier); //Update cashier data "UPDATE"
	
	public void deleteCashier(Long id);// Delete a cashier via id "DELETE"
}

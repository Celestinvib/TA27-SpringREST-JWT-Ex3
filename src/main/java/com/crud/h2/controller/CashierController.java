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

import com.crud.h2.service.CashierServiceImpl;


import com.crud.h2.dto.Cashier;


@RestController
@RequestMapping("/api")
public class CashierController {
	@Autowired
	CashierServiceImpl cashierServiceImpl;
	
	@GetMapping("/cajeros")
	public List<Cashier> listCashiers(){
		
		return cashierServiceImpl.listCashiers();
	}
	
	@PostMapping("/cajeros")
	public Cashier saveCashier(@RequestBody Cashier cashier) {
		
		return cashierServiceImpl.saveCashier(cashier);
	}
	
	@GetMapping("/cajeros/{id}")
	public Cashier cashierXID(@PathVariable(name="id") Long id) {
		
		Cashier cashier_xid= new Cashier();
		
		cashier_xid= cashierServiceImpl.cashierXID(id);
		
		System.out.println("Cajero XID: "+cashier_xid);
		
		return cashier_xid;
	}
	
	@PutMapping("/cajeros/{id}")
	public Cashier updateCashier(@PathVariable(name="id")Long id,@RequestBody Cashier cashier) {
		
		Cashier cashierSelected= new Cashier();
		Cashier cashierUpdated = new Cashier();
		
		cashierSelected= cashierServiceImpl.cashierXID(id);
		
		cashierSelected.setCode(cashier.getCode());
		cashierSelected.setNameSurnames(cashier.getNameSurnames());
	
		cashierUpdated = cashierServiceImpl.updateCashier(cashierSelected);
		
		System.out.println("El cajero actualizado es: "+ cashierUpdated);
		
		return cashierUpdated;
	}
	
	@DeleteMapping("/cajeros/{id}")
	public void deleteCashier(@PathVariable(name="id")Long id) {
		cashierServiceImpl.deleteCashier(id);
	}	
}

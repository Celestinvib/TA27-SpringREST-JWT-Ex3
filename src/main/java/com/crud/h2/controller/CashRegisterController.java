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

import com.crud.h2.dto.CashRegister;
import com.crud.h2.service.CashRegisterServiceImpl;

@RestController
@RequestMapping("/api")
public class CashRegisterController {
	@Autowired
	CashRegisterServiceImpl cashRegisterServiceImpl;
	
	@GetMapping("/maquinas_registradoras")
	public List<CashRegister> listProducts(){
		
		return cashRegisterServiceImpl.listCashRegisters();
	}
	
	@PostMapping("/maquinas_registradoras")
	public CashRegister saveCashRegister(@RequestBody CashRegister cashRegister) {
		
		return cashRegisterServiceImpl.saveCashRegister(cashRegister);
	}
	
	@GetMapping("/maquinas_registradoras/{id}")
	public CashRegister cashierXID(@PathVariable(name="id") Long id) {
		
		CashRegister cashRegister_xid= new CashRegister();
		
		cashRegister_xid= cashRegisterServiceImpl.cashRegisterXID(id);
		
		System.out.println("Maquina Registradora XID: "+cashRegister_xid);
		
		return cashRegister_xid;
	}
	
	@PutMapping("/maquinas_registradoras/{id}")
	public CashRegister updateCashRegister(@PathVariable(name="id")Long id,@RequestBody CashRegister cashRegister) {
		
		CashRegister cashRegisterSelected= new CashRegister();
		CashRegister cashRegisterUpdated = new CashRegister();
		
		cashRegisterSelected= cashRegisterServiceImpl.cashRegisterXID(id);
		
		cashRegisterSelected.setFloor(cashRegister.getFloor());
		
		cashRegisterUpdated = cashRegisterServiceImpl.updateCashRegister(cashRegisterSelected);
		
		System.out.println("La Maquina Registradora  actualizada es: "+ cashRegisterUpdated);
		
		return cashRegisterUpdated;
	}
	
	@DeleteMapping("/maquinas_registradoras/{id}")
	public void deleteCashRegister(@PathVariable(name="id")Long id) {
		
		cashRegisterServiceImpl.deleteCashRegister(id);
	}	
}

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

import com.crud.h2.dto.CashiersProductsCashRegisters;
import com.crud.h2.service.CashiersProductsCashRegistersImpl;

@RestController
@RequestMapping("/api")
public class CashiersProductsCashRegistersController {
	@Autowired
	CashiersProductsCashRegistersImpl cashiersProductsCashRegistersImpl;
	
	@GetMapping("/ventas")
	public List<CashiersProductsCashRegisters> listCashiersProductsCashRegisters(){
		
		return cashiersProductsCashRegistersImpl.listCashierProductCashRegisters();
	}
	
	@PostMapping("/ventas")
	public CashiersProductsCashRegisters saveCashiersProductsCashRegisters(@RequestBody CashiersProductsCashRegisters cashiersProductsCashRegisters) {
		
		return cashiersProductsCashRegistersImpl.saveCashierProductCashRegister(cashiersProductsCashRegisters);
	}
	
	@GetMapping("/ventas/{id}")
	public CashiersProductsCashRegisters cashiersProductsCashRegistersXID(@PathVariable(name="id") Long id) {
		
		CashiersProductsCashRegisters sale_xid= new CashiersProductsCashRegisters();
		
		sale_xid= cashiersProductsCashRegistersImpl.cashierProductCashRegistertXID(id);
		
		System.out.println("Venta XID: "+sale_xid);
		
		return sale_xid;
	}
	
	@PutMapping("/ventas/{id}")
	public CashiersProductsCashRegisters updateCashiersProductsCashRegisters(@PathVariable(name="id")Long id,@RequestBody CashiersProductsCashRegisters cashiersProductsCashRegisters) {
		
		CashiersProductsCashRegisters saleSelected= new CashiersProductsCashRegisters();
		CashiersProductsCashRegisters saleUpdated = new CashiersProductsCashRegisters();
		
		saleSelected= cashiersProductsCashRegistersImpl.cashierProductCashRegistertXID(id);
		
		saleSelected.setCashier(cashiersProductsCashRegisters.getCashier());
		saleSelected.setProduct(cashiersProductsCashRegisters.getProduct());
		saleSelected.setCash_register(cashiersProductsCashRegisters.getCash_register());
		
		saleUpdated = cashiersProductsCashRegistersImpl.updateCashierProductCashRegister(saleSelected);
		
		System.out.println("La Venta actualizada es: "+ saleUpdated);
		
		return saleUpdated;
	}
	
	@DeleteMapping("/ventas/{id}")
	public void deleteCashiersProductsCashRegisters(@PathVariable(name="id")Long id) {
		
		cashiersProductsCashRegistersImpl.deleteCashierProductsCashRegisters(id);
	}	
}

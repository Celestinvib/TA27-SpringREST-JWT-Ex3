package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.ICashierDAO;
import com.crud.h2.dto.Cashier;

@Service
public class CashierServiceImpl implements ICashierService{
	
	@Autowired
	ICashierDAO iCashierDAO;

	@Override
	public List<Cashier> listCashiers() {

		return iCashierDAO.findAll();
	}

	@Override
	public Cashier saveCashier(Cashier cashier) {

		return iCashierDAO.save(cashier);
	}

	@Override
	public Cashier cashierXID(Long id) {

		return iCashierDAO.findById(id).get();
	}

	@Override
	public Cashier updateCashier(Cashier cashier) {

		return iCashierDAO.save(cashier);
	}

	@Override
	public void deleteCashier(Long id) {
		
		iCashierDAO.deleteById(id);
	}

}

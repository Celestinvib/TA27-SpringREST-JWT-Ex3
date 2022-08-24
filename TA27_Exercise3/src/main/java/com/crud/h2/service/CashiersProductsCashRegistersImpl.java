package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.ICashierProductCashRegisterDAO;
import com.crud.h2.dto.CashiersProductsCashRegisters;

@Service
public class CashiersProductsCashRegistersImpl implements ICashiersProductsCashRegistersService {
	@Autowired
	ICashierProductCashRegisterDAO iCashierProductCashRegisterDAO;

	@Override
	public List<CashiersProductsCashRegisters> listCashierProductCashRegisters() {

		return iCashierProductCashRegisterDAO.findAll();
	}

	@Override
	public CashiersProductsCashRegisters saveCashierProductCashRegister(CashiersProductsCashRegisters cashierProductsCashRegister) {

		return iCashierProductCashRegisterDAO.save(cashierProductsCashRegister);
	}

	@Override
	public CashiersProductsCashRegisters cashierProductCashRegistertXID(Long id) {

		return iCashierProductCashRegisterDAO.findById(id).get();
	}

	@Override
	public CashiersProductsCashRegisters updateCashierProductCashRegister(CashiersProductsCashRegisters cashierProductsCashRegister) {

		return iCashierProductCashRegisterDAO.save(cashierProductsCashRegister);
	}

	@Override
	public void deleteCashierProductsCashRegisters(Long id) {
		
		iCashierProductCashRegisterDAO.deleteById(id);
	}
}

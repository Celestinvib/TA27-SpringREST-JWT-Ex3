package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.ICashRegisterDAO;
import com.crud.h2.dto.CashRegister;

@Service
public class CashRegisterServiceImpl implements ICashRegisterService {
	@Autowired
	ICashRegisterDAO iCashRegisterDAO;

	@Override
	public List<CashRegister> listCashRegisters() {

		return iCashRegisterDAO.findAll();
	}

	@Override
	public CashRegister saveCashRegister(CashRegister cashRegister) {

		return iCashRegisterDAO.save(cashRegister);
	}

	@Override
	public CashRegister cashRegisterXID(Long id) {

		return iCashRegisterDAO.findById(id).get();
	}

	@Override
	public CashRegister updateCashRegister(CashRegister cashRegister) {

		return iCashRegisterDAO.save(cashRegister);
	}

	@Override
	public void deleteCashRegister(Long id) {
		
		iCashRegisterDAO.deleteById(id);
	}
}

package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="TA27_cash_register")
public class CashRegister {
	/**Attributes */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Find last value and increment from final id of db
	private Long id;
	
	private int floor;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cash_register")
    private List<CashiersProductsCashRegisters> cashierProductCashRegister;
  	
    /**Constructors */    
    public CashRegister() {
    	
    }

	/**
	 * @param id
	 * @param floor
	 * @param cashierProductCashRegister
	 */
	public CashRegister(Long id, int floor, List<CashiersProductsCashRegisters> cashierProductCashRegister) {
		this.id = id;
		this.floor = floor;
		this.cashierProductCashRegister = cashierProductCashRegister;
	}
	
	/**Getters y Setters*/

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the floor
	 */
	public int getFloor() {
		return floor;
	}

	/**
	 * @param floor the floor to set
	 */
	public void setFloor(int floor) {
		this.floor = floor;
	}

	/**
	 * @return the cashierProductCashRegister
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "CashierProductCashRegister")
	public List<CashiersProductsCashRegisters> getCashierProductCashRegister() {
		return cashierProductCashRegister;
	}

	/**
	 * @param cashierProductCashRegister the cashierProductCashRegister to set
	 */
	public void setCashierProductCashRegister(List<CashiersProductsCashRegisters> cashierProductCashRegister) {
		this.cashierProductCashRegister = cashierProductCashRegister;
	}
    
	
	
    
}

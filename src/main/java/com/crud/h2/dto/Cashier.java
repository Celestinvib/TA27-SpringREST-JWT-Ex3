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
@Table(name="TA27_cashiers")
public class Cashier {
	/**Attributes */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Find last value and increment from final id of db
	private Long id;

	private int code;

	private String nameSurnames;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cashier")
    private List<CashiersProductsCashRegisters> cashierProductCashRegister;

    
	/**Constructors */
	public Cashier() {
	}


	/**
	 * @param id
	 * @param code
	 * @param nameSurnames
	 */
	public Cashier(Long id, int code, String nameSurnames) {
		this.id = id;
		this.code = code;
		this.nameSurnames = nameSurnames;
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
	 * @return the code
	 */
	public int getCode() {
		return code;
	}


	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}


	/**
	 * @return the nameSurnames
	 */
	public String getNameSurnames() {
		return nameSurnames;
	}


	/**
	 * @param nameSurnames the nameSurnames to set
	 */
	public void setNameSurnames(String nameSurnames) {
		this.nameSurnames = nameSurnames;
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
	
	
	/**
	 * Method printing data by console
	 */
	@Override
	public String toString() {
		return "Cajero [id=" + id + ", code=" + code + ", nomApels=" + nameSurnames + "]";
	}
    
}

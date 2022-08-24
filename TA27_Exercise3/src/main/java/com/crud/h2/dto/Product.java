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
@Table(name="TA27_products")
public class Product {
	/**Attributes */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Find last value and increment from final id of db
	private Long id;

	private int code;

	private String name;
	
	private int price;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    private List<CashiersProductsCashRegisters> cashierProductCashRegister;
    
    
  	/**Constructors */
  	public Product() {
  	}


	/**
	 * @param id
	 * @param code
	 * @param name
	 * @param price
	 */
	public Product(Long id, int code, String name, int price) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.price = price;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
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

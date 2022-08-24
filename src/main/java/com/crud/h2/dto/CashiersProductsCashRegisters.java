package com.crud.h2.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="TA27_cashier_product_cash_register")
public class CashiersProductsCashRegisters {
	
	/**Attributes */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Find last value and increment from final id of db
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "cashier_id")
    Cashier cashier;
	
	@ManyToOne
    @JoinColumn(name = "product_id")
    Product product;
	
	@ManyToOne
    @JoinColumn(name = "cash_register_id")
    CashRegister cash_register;

  	/**Constructors */
	public CashiersProductsCashRegisters() {

	}

	/**
	 * @param id
	 * @param cashier
	 * @param product
	 * @param cash_register
	 */
	public CashiersProductsCashRegisters(Long id, Cashier cashier, Product product, CashRegister cash_register) {
		this.id = id;
		this.cashier = cashier;
		this.product = product;
		this.cash_register = cash_register;
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
	 * @return the cashier
	 */
	public Cashier getCashier() {
		return cashier;
	}

	/**
	 * @param cashier the cashier to set
	 */
	public void setCashier(Cashier cashier) {
		this.cashier = cashier;
	}

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * @return the cash_register
	 */
	public CashRegister getCash_register() {
		return cash_register;
	}

	/**
	 * @param cash_register the cash_register to set
	 */
	public void setCash_register(CashRegister cash_register) {
		this.cash_register = cash_register;
	}
	
	
	
	
}

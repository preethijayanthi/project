package com.shop.model.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cart implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String cartid;
	private double Total;
	private String Quantity;
	@ManyToOne
	@JoinColumn(name = "id")
	private Product product;
	
	@OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Cartitems> cartItems;
	
	
	@OneToOne
	@JoinColumn(name="userid")
	private Register id_fk;
	public String getCartid() {
		return cartid;
	}
	public void setCartid(String cartid) {
		this.cartid = cartid;
	}
	public double getTotal() {
		return Total;
	}
	public void setTotal(double total) {
		Total = total;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Register getId_fk() {
		return id_fk;
	}
	public void setId_fk(Register id_fk) {
		this.id_fk = id_fk;
	}
	
}

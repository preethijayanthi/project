package com.shop.model.dao;

import java.util.List;

import com.shop.model.entity.Cart;
import com.shop.model.entity.Cartitems;
import com.shop.model.entity.Product;


public interface CartDao {
	public void add(Cartitems cart);
	public void delete(int cartitemid);
	public Cartitems getcartitem(int cartitemid);
	public List getAllCartitems();
}

package com.shop.model.service;

import java.util.List;

import com.shop.model.entity.Cart;
import com.shop.model.entity.Cartitems;
import com.shop.model.entity.Product;


public interface CartService {
	public void add(Cartitems cart);
	public void delete(int id);
	public Cartitems getcartitem(int id);
	public void update();
	public List getAllCartitems();
}

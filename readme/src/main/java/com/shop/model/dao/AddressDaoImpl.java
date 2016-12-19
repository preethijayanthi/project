package com.shop.model.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shop.model.entity.Address;
@Repository
@Transactional
public class AddressDaoImpl implements AddressDao {
	@Autowired
	 private SessionFactory session;
@Override
	public void add(Address address) {
		session.getCurrentSession().save(address);
	}
}

package com.shop.model.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shop.model.entity.Register;

@Repository
public class RegisterDaoImpl implements RegisterDao {
	@Autowired
	 private SessionFactory session;

	@Override
	public void add(Register register) {
		session.getCurrentSession().save(register);
	}

	@Override
	public void edit(Register register) {
		session.getCurrentSession().update(register);
	}

	@Override
	public void delete(/*int registerId*/Register register) {
		session.getCurrentSession().delete(/*getRegister(registerId)*/register);
		
	}


	@Override
	public Register getRegister(int registerId) {
		return (Register)session.getCurrentSession().get(Register.class, registerId);
	}

	@Override
	public List getAllRegister() {
		return session.getCurrentSession().createQuery("from Register").list();
	}


}

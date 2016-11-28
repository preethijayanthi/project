package com.shop.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shop.model.dao.RegisterDao;
import com.shop.model.entity.Register;

@Service
public class RegisterServiceImpl implements RegisterService{
	@Autowired
	 RegisterDao registerDao;

	@Transactional
	public void add(Register register) {
		registerDao.add(register);
	}
	@Transactional
	public void edit(Register register) {
		registerDao.edit(register);
		
	}

	@Transactional
	public void delete(/*int registerId*/Register register) {
		registerDao.delete( register);
	}

	@Transactional
	public Register getRegister(int registerId) {
		return registerDao.getRegister(registerId);
	}


	@Transactional
	public List getAllRegister() {
		return registerDao.getAllRegister();
	}

}

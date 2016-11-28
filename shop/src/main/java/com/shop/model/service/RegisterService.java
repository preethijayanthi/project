package com.shop.model.service;

import java.util.List;

import com.shop.model.entity.Register;

public interface RegisterService {
	public void add(Register register);
	public void edit(Register register);
	public void delete(Register register/*int registerId*/);
	public Register getRegister(int registerId);
	public List getAllRegister();
}

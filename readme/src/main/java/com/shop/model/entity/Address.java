package com.shop.model.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address implements Serializable  {
	
	private static final long serialVersionUID = 3403439208218165806L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private String id;
private String fullname;
private String addressline1;
private String addressline2;
private String city;
private String state;
private String code;
private String country;

public Address()
{
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getFullname() {
	return fullname;
}

public void setFullname(String fullname) {
	this.fullname = fullname;
}

public String getAddressline1() {
	return addressline1;
}

public void setAddressline1(String addressline1) {
	this.addressline1 = addressline1;
}

public String getAddressline2() {
	return addressline2;
}

public void setAddressline2(String addressline2) {
	this.addressline2 = addressline2;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getCode() {
	return code;
}

public void setCode(String code) {
	this.code = code;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}




}
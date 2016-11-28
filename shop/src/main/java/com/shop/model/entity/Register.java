package com.shop.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Register {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)

private int id;
//@Size(min=3,max=10,message="hello")
private String firstname;
private String lastname;
@NotEmpty(message="Enter the mail id")
@Email
private String mailid; 
//@NotNull(message="happy")
//@Min(18)
private String mobile;
private String username;
private String password;
private String repassword;
private String address;
public Register()
{
}
public Register(int id,String firstname,String lastname,String mailid,String mobile,String username,String password,String repassword,String address){
	this.id=id;
	this.firstname=firstname;
	this.lastname=lastname;
	
	this.mailid=mailid;
	this.mobile=mobile;
	this.username=username;
	this.password=password;
	this.repassword=repassword;
	this.address=address;
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getMailid() {
	return mailid;
}
public void setMailid(String mailid) {
	this.mailid = mailid;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRepassword() {
	return repassword;
}
public void setRepassword(String repassword) {
	this.repassword = repassword;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
}
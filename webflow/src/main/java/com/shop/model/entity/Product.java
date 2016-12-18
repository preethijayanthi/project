package com.shop.model.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class Product  {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String Productname;
private String Productprice;
private String Productdescription;
private String Categoryname;
private String Name;


public Product()
{
}
public Product(int id,String Productname,String Productprice,String Productdescription,String Categoryname,String name){
	this.id=id;
	this.Productname=Productname;
	this.Productprice=Productprice;
	this.Productdescription=Productdescription;
	this.Categoryname=Categoryname;
	this.Name=Name;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
@Transient
private MultipartFile file;
public MultipartFile getFile() {
	return file;
}
public void setFile(MultipartFile file) {
	this.file = file;
}
public String getCategoryname() {
	return Categoryname;
}
public void setCategoryname(String categoryname) {
	Categoryname = categoryname;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getProductname() {
	return Productname;
}
public void setProductname(String productname) {
	Productname = productname;
}
public String getProductprice() {
	return Productprice;
}
public void setProductprice(String productprice) {
	Productprice = productprice;
}
public String getProductdescription() {
	return Productdescription;
}
public void setProductdescription(String productdescription) {
	Productdescription = productdescription;
}

}
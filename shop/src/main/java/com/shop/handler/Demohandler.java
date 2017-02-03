package com.shop.handler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.shop.model.dao.RegisterDao;
import com.shop.model.entity.BillingAddress;
import com.shop.model.entity.Register;
import com.shop.model.service.AddressService;


@Component
public class Demohandler {
	@Autowired
	AddressService ad;
	@Autowired
	RegisterDao registerdao;
	
	public BillingAddress initFlow(){
		return new BillingAddress();
	}
	public String add(BillingAddress address)
	{
		
		System.out.println("It is entering into the billing address");
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		 String username = auth.getName();  
		 		 
		 List<Register> userDetail = registerdao.getUserByName(username);//user details are stored in userDetail object
		  System.out.println("It is entering into the billing address");
		 //TO STORE  THE USERID IN BILLINGADDRESS TABLE
		   for(int i=0;i<userDetail .size();i++)
		   { 
		    System.out.println("It is entering into block which is to add user id");
			address.setId_fk(userDetail.get(i));
			
		   }
		  
		ad.add(address);
		return " ";
	}
	public String validateDetails(){
		String status = "success";
		
		
		
		return status;
	}
	
}

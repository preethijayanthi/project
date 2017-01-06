package com.shop.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;



import com.shop.model.entity.BillingAddress;

import com.shop.model.service.AddressService;


@Component
public class Demohandler {
	@Autowired
	AddressService ad;
	
	public BillingAddress initFlow(){
		return new BillingAddress();
	}
	public String add(BillingAddress address)
	{
		ad.add(address);
		return " ";
	}
	public String validateDetails(){
		String status = "success";
		
		
		
		return status;
	}
	
}

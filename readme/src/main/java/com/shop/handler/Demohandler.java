package com.shop.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;



import com.shop.model.entity.Address;

import com.shop.model.service.AddressService;


@Component
public class Demohandler {
	@Autowired
	AddressService ad;
	
	public Address initFlow(){
		return new Address();
	}
	public String add(Address address)
	{
		ad.add(address);
		return " ";
	}
	/*public String validateDetails(Address address,MessageContext messageContext){
		String status = "success";
		
		if(address.getId().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"id").defaultText("Email cannot be Empty").build());
			status = "failure";
		}
		if(address.getStreet().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"street").defaultText("Email cannot be Empty").build());
			status = "failure";
		}
		if(address.getCity()==null){
			messageContext.addMessage(new MessageBuilder().error().source(
					"city").defaultText("Age cannot be Empty").build());
			status = "failure";
		}
		ad.add(address);
		return status;
	}*/
	
}

package com.shop.controller;



import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shop.model.entity.Cartitems;
import com.shop.model.entity.Product;
import com.shop.model.service.CartService;
import com.shop.model.service.ProductService;

@Controller
public class CartController {

	@Autowired
	private CartService cs;
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/cart1")
	public String displaycart()
	{
		return "cart";
	}
	@RequestMapping("/remove")
	public String displaycart(@RequestParam("del") int id,Map<String,Object>map )
	{
		cs.delete(id);
		map.put("cartList", cs.getAllCartitems());
		return "cart";
	}
	
	@RequestMapping("/cart")
	public String getcart(@RequestParam("value")int id,Map<String,Object> map )
	{
		Cartitems cart=new Cartitems();
		Product pr=productService.getProduct(id);//
		
		List<Cartitems> crt=cs.getAllCartitems();
		/*for searching the table whether the product is new or exist*/
		for(int i=0;i<crt.size();i++)
		{	
			//get product id from the cartitem table
			int tempid=crt.get(i).getProduct().getId();
			//for update the existing product
			if(tempid==id)
			{	
				int quantity=crt.get(i).getQuantity()+1;
				crt.get(i).setQuantity(quantity);
				int price=pr.getProductprice()*quantity;
				crt.get(i).setTotal(price);
				cs.update(crt.get(i));
				return "redirect:/desc/"+id ;
			}
		}
		
		
		cart.setQuantity(1);//setter method of quantity in cartitems table
		cart.setTotal(pr.getProductprice());
		cart.setProduct(pr);//foreign key of Productid

		
		cs.add(cart);//add the quantity,total,productid in cartitems table using the cart object
		
		map.put("cartList", cs.getAllCartitems()); //after giving addtocart,retrieving the list of items in cart
		

	return "cart";
	}
	


}


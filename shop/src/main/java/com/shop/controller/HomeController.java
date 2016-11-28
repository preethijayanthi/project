package com.shop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.validation.Valid;

import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shop.model.entity.Category;
import com.shop.model.entity.Product;
import com.shop.model.service.CategoryService;
import com.shop.model.service.ProductService;
import com.shop.model.service.RegisterService;

@Controller
public class HomeController {
	/*public static final Logger log= Logger.getLogger(HomeController.class);*/
	@Autowired
	CategoryService categoryService;
	@Autowired
	ProductService productService;
	/*@Autowired(required=true)
	Product product;*/
	@Autowired
	RegisterService registerService;
	@RequestMapping("/" )
	public String showMessage(Map<String, Object> map)
			 {
		map.put("categoryList", categoryService.getAllCategory());
		map.put("registerList", registerService.getAllRegister());
	
		return "index";
	}
	/*@RequestMapping("/productpage" )
	public String sh(Map<String, Object> map)
			 {
		map.put("productList", productService.getAllProduct());
		return "productpage";
	}*/
	@RequestMapping(value="/productpage")
	public String s(/*@PathVariable("id") String id*/Map<String, Object> map,@RequestParam("pdt") String id)
			 {
		
		System.out.println(id);
		map.put("productList", productService.getAllProductfromcategory(id));
		return "productpage";
	}
	/*@RequestMapping("/samsung")
	public String ska()
			 {
		
		
		return "samsung";
	}
	*/
	@RequestMapping("admin/samsung")
	public String sal()
			 {
		
		
		return "sony";
	}
	@RequestMapping("user/samsung")
	public String sa()
			 {
		
		
		return "samsung";
	}
	/*@RequestMapping("/login")
	public String sam()
			 {
		return "login";
	}*/
	@RequestMapping("/lenova")
	public String sam()
			 {
		return "lenova";
	}
	@RequestMapping(value={"/login"}/*, method=RequestMethod.POST*/)
	public ModelAndView getLoginForm(
			@RequestParam(required = false) String authfailed, String logout,
			String denied) {
		String message = "";
		if (authfailed != null) {
			message = "Invalid username of password, try again !";
		} else if (logout != null) {
			message = "Logged Out successfully, login again to continue !";
		} else if (denied != null) {
			message = "Access denied for this user !";
		}
		return new ModelAndView("login", "message", message);
	}
	@RequestMapping("/sony")
	public String msg(Map<String, Object> map)
	{
		/*map.put("img",product.getName());*/
		return"sony";
	}

	 
	
}
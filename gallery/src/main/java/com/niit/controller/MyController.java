package com.niit.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {


	@RequestMapping("/")
	public String showMessage() {
		return "index";

	}
		
		
		@RequestMapping("/abi")
		public String display(@RequestParam("name") String name,
									@RequestParam("city") String city,
								Model map) {
			map.addAttribute("name",name);
			map.addAttribute("city",city);
			return "abi";
	}
}
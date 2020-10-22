package com.cts.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@RequestMapping(value = "/s1")
	public void f1() {
		System.out.println(">>>> f1 metghod of ProductController");
	}
	
	@RequestMapping(value = "/s2")
	public String f2(Model model) {
		
		String name="Praveen";
		String[] cities= {"HYD","CHN","PUNE","BANGALORE"};
		model.addAttribute("pname", name);
		model.addAttribute("myCities", cities);
		
		return "test";
	}

}

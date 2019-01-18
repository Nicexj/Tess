package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexcontroller {
	
	@RequestMapping("/index")
	public String index() {
		System.out.println("index");
		return "index";
	}
	
}

package com.verusys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/welcome")
	//@RequestMapping("/")
	public String showHome() {
		return ("home");
	}
}

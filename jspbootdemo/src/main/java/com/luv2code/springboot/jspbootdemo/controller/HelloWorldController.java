package com.luv2code.springboot.jspbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/howdy")
	public String sayHowdy() {
		return "hello";
	}
	
}

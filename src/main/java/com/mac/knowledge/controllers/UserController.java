package com.mac.knowledge.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("/users") 
	public String index() {
		return "users";
	}
}

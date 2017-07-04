package com.mac.knowledge.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {
	@RequestMapping("/login") 
	public String login() {
		return "login";
	}

	@RequestMapping("/login-error")
	public String loginError() {
		return "login";
	}
	
	@RequestMapping("/logout")
	public String logout() {
		return "logout";
	}
}

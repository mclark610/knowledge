package com.mac.knowledge.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FileController {
	
	@RequestMapping("/file")
	public String index() {
		return "file";
	}

}

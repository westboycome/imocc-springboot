package com.imocc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/helloworld")
	public String hello() {
		return "Spring boot test!";
	}
	
	@GetMapping("/helloworld2")
	public String hello2() {
		return "Spring boot test2!";
	}
}

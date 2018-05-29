package com.imocc.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imocc.pojjo.LeeJSONResult;
import com.imocc.pojjo.Resources;

@RestController
public class TestController {

	@Autowired
	private Resources resource;
	
	@GetMapping("/helloworld")
	public String hello() {
		return "Spring boot test!";
	}
	
	@GetMapping("/helloworld2")
	public String hello2() {
		return "Spring boot testuyuy2!";
	}
	
	@GetMapping("/getsource")
	public LeeJSONResult getsource() {
		Resources ben = new Resources();
		BeanUtils.copyProperties(resource, ben);
		return LeeJSONResult.ok(ben);
	}
}

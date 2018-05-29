package com.imocc.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imocc.pojjo.LeeJSONResult;
import com.imocc.pojjo.User;

@RestController //@RestController = @Controller + @ResponseBody
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/getUser")
	public LeeJSONResult getUser() {
		User u = new User();
		u.setAge(12);
		u.setBirthday(new Date());
		u.setName("qq");
		u.setPassword("qq");
		return LeeJSONResult.ok(u);
	}
}

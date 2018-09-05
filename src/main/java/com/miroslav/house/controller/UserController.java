package com.miroslav.house.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miroslav.house.common.model.User;
import com.miroslav.house.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@GetMapping(value="user")
	public List<User> getUsers (){
		return userService.getUsers();
	}
	
}

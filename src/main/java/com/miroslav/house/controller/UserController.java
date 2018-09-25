package com.miroslav.house.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.miroslav.house.model.User;
import com.miroslav.house.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public User getUsers (Long id){
		return userService.selectByPrimaryKey(id);
	}
	
}

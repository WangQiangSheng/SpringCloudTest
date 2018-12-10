package com.miroslav.house.controller;

import java.util.List;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.miroslav.house.model.User;
import com.miroslav.house.service.UserService;

@Controller
public class HelloController {
	
	@Autowired
	private UserService userService;
	
	
	@Autowired
	private HttpClient httpClient;
	
	@RequestMapping("hello")
	public String hello (ModelMap modelMap) throws Exception{
		List<User> list = userService.selectAllUser();
		User user = list.get(0);
		modelMap.put("user", user);
		
		System.out.println(new ObjectMapper().writeValueAsString(user));
		
		
		String strMsg = httpClient.execute(new HttpGet("http://www.baidu.com")).getEntity().toString();
		
		System.out.println(strMsg);
		
		return "hello";
	}
	
	
	@RequestMapping(value="index")
	public String index(){
		return "homepage/index";
	}
	
	
	
	 
}

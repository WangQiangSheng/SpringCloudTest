package com.miroslav.house.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miroslav.house.mapper.UserMapper;
import com.miroslav.house.model.User;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	public User selectByPrimaryKey(Long id){
		return userMapper.selectByPrimaryKey(id);
	}
	
}

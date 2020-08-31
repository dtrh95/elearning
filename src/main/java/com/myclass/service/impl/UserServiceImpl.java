package com.myclass.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.myclass.dto.UserDto;
import com.myclass.entity.User;
import com.myclass.repository.UserRepository;
import com.myclass.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void add(UserDto dto) {
		User user = new User();
		user.setEmail(dto.getEmail());
		user.setFullname(dto.getFullname());
		user.setPassword(BCrypt.hashpw(dto.getPassword(), BCrypt.gensalt(12)));
		user.setAvatar(dto.getAvatar());
		user.setRoleId(dto.getRoleId());
		
		userRepository.save(user);
	}

}

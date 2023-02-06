package com.simple.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simple.app.converters.UserConverter;
import com.simple.app.dto.UserDTO;
import com.simple.app.entities.UserEntity;
import com.simple.app.repositories.UserRepository;

@RestController
@RequestMapping("users")
public class UserController {
	
	@Autowired
	public UserRepository userRepository;
	
	@Autowired
	public UserConverter userConverter;

	@GetMapping("/data")
	public List<UserDTO> getUser() {
		List<UserDTO> dtos = new ArrayList<UserDTO>();
		List<UserEntity> users = this.userRepository.findAll();
		for (UserEntity user : users) {
			UserDTO dto = userConverter.convertEntityToDto(user);
			dtos.add(dto);
			
		}
		return dtos;
				
	}

}

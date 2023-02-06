package com.simple.app.converters;

import org.springframework.stereotype.Component;

import com.simple.app.dto.UserDTO;
import com.simple.app.entities.UserEntity;

@Component
public class UserConverter {
	
	public UserDTO convertEntityToDto(UserEntity entity) {
		UserDTO temp = new UserDTO();
		temp.setName(entity.getName());
		temp.setAge(entity.getAge());
		return temp;
	}

}

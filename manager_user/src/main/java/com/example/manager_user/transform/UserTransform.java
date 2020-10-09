package com.example.manager_user.transform;

import org.springframework.stereotype.Component;

import com.example.manager_user.entity.User;
import com.example.manager_user.model.UserRequest;

@Component
public class UserTransform {
	
	public User apply(UserRequest userRequest) {
		User user = new User();
		user.setName(userRequest.getName());
		user.setAge(userRequest.getAge());
		user.setPhone(userRequest.getPhone());
		user.setAddress(userRequest.getAddress());
		return user;
	}
}

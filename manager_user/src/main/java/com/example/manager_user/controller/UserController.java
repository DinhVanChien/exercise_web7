package com.example.manager_user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.manager_user.entity.User;
import com.example.manager_user.model.UserRequest;
import com.example.manager_user.service.UserService;
import com.example.manager_user.transform.UserTransform;
import com.example.manager_user.util.Common;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private UserService userService;
	private UserTransform userTransform;
	
	@Autowired
	public UserController(UserService userService, UserTransform userTransform) {
		this.userService = userService;
		this.userTransform = userTransform;
	}
	
	@GetMapping
	public List<User> findAll() {
		return  userService.findAll();
	}
	
	@GetMapping("/{name}")
	public List<User> findUserByName(@PathVariable String name) {
		if(Common.isNullAndIsEmpty(name)) {
			return userService.findAllByName(name);
		}
		return null;
	}
	
	@PostMapping
	public User insert(@RequestBody UserRequest userRequest) {
		User user = new User();
		if(Common.isNull(userRequest)) {
			user = userTransform.apply(userRequest);
			return  userService.save(user);
		}
		return null;
	}
	
	@PutMapping("/{id}")
	public User update(@RequestBody UserRequest userRequest, @PathVariable Long id) {
		
		if(Common.isNull(userRequest) && Common.isNull(id)) {
			User user = userService.findById(id);
			if(Common.isNull(user)) {
				user = userTransform.apply(userRequest);
				user.setId(id);
				return  userService.save(user);
			}
		}
		return null;
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable Long id) {
		
		if(Common.isNull(id) && Common.isNull(userService.findById(id))) {
			userService.deleteById(id);
			return "Delete user id: "+ id +" thành công";
		}
		return "User không tồn tại";
	}
}

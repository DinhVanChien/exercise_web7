package com.example.manager_user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.manager_user.entity.User;

@Service
public interface UserService {
	List<User> findAll();
	List<User> findAllByName(String name);
	User save(User user);
	User findById(long id);
	void deleteById(long id);
}

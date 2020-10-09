package com.example.manager_user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.manager_user.entity.User;
import com.example.manager_user.repository.UserRepository;
import com.example.manager_user.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public List<User> findAllByName(String name) {
		return userRepository.findAllByName(name);
	}
	
	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	@Override
	public User save(User user) {
		return userRepository.save(user);
	}
	
	@Override
	public void deleteById(long id) {
		userRepository.deleteById(id);
	}

	@Override
	public User findById(long id) {
		return userRepository.findById(id);
	}
}

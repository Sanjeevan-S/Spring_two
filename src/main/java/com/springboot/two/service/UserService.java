package com.springboot.two.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.two.model.User;
import com.springboot.two.repository.UserRepository;

@Service
//Spring Boot annotation for a service class that contains the business logic
public class UserService {

	@Autowired
	//Autowired is to tell Spring to automatically inject an instance of usrrepo class. 
	private UserRepository userRepository;
	
	//
	public Object createUser(User reqData) {
		return userRepository.save(reqData);
	}
	
	public Object getAllUsers() {
		return userRepository.findAll();
	}
	
	public User isDataExist(User reqData) {
		return userRepository.findByEmailAndMobNo(reqData.getEmail(), reqData.getMobNo());	
	}
	
	public Object getUserById(Long id) {
		return userRepository.findById(id);
	}
	
	public Object updateUser(User reqData, User isData) {
		isData.setName(reqData.getName());
		isData.setEmail(reqData.getEmail());
		isData.setMobNo(reqData.getMobNo());
		isData.setPassword(reqData.getPassword());
		return userRepository.save(isData);
	}

	public Object deleteUserbyId(Long id) {
		userRepository.deleteById(id);
		return null;
	}
}



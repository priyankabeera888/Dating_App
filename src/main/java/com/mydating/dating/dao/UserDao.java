package com.mydating.dating.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.mydating.dating.entity.User;
import com.mydating.dating.repository.UserRepository;
import com.mydating.dating.utility.UserGender;

@Repository
public class UserDao {
	
	@Autowired
	UserRepository userRepository;

	public User saveUser(User user) {
		return userRepository.save(user);
	}
	public Optional<User> findUserById(int id) {
		return userRepository.findById(id);
	}
	//methodName Convention  that is not present in the repository but springboot will create a method findByGender
	public List<User> findAllMaleUsers() {
		return userRepository.findByGender(UserGender.MALE);
	}

	public List<User> findAllFemaleUsers() {
		return userRepository.findByGender(UserGender.FEMALE);
	}
	public List<User> searchByName(String letters) {
		return userRepository.searchByName(letters);
		
	}
	public List<User> searchByEmail(String letters) {
		
		return userRepository.searchByEmail(letters);
	}

	
}

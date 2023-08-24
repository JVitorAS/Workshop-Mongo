package com.gsct.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsct.workshopmongo.domain.User;
import com.gsct.workshopmongo.repository.UserRepository;
import com.gsct.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User findById(String id) {
		User user = repo.findOneById(id); 
		if (user == null) {
			throw new ObjectNotFoundException("Object not found!");
		}
		return user;
	}
}
